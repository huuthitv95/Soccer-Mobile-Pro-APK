package com.androidgamegou.googleiap;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.work.WorkRequest;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.player.UnityPlayer;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class GoogleBillingUtil {
    private static final long ASYNC_QUERY_TIMEOUT_MS = 30000;
    public static final String BILLING_TYPE_INAPP = "inapp";
    public static final String BILLING_TYPE_SUBS = "subs";
    private static final int EVENT_SCHEMA_VERSION = 1;
    private static final long FINALIZE_CALLBACK_TIMEOUT_MS = 30000;
    private static final boolean IS_DEBUG = false;
    private static final String TAG = "Unity";
    private static BillingClient mBillingClient;
    private static OnPurchaseFinishedListener mOnPurchaseFinishedListener;
    private static OnQueryFinishedListener mOnQueryFinishedListener;
    private static OnStartSetupFinishedListener mOnStartSetupFinishedListener;
    private Context applicationContext;
    private int reconnectAttempt;
    private boolean reconnectReconcileRequired;
    private boolean reconnectScheduled;
    private static final long[] RECONNECT_DELAYS_MS = {1000, 2000, 4000, 8000, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, 600000, 3600000};
    private static final GoogleBillingUtil mGoogleBillingUtil = new GoogleBillingUtil();
    public static final Map<String, SkuDetails> skuDetailsMap = Collections.synchronizedMap(new HashMap());
    public static final Map<String, ProductDetails> productDetailsMap = Collections.synchronizedMap(new HashMap());
    private static Set<String> Consumables = Collections.EMPTY_SET;
    public String[] inAppSKUS = new String[0];
    public String[] subsSKUS = new String[0];
    private final Object connectionLock = new Object();
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final ArrayDeque<Runnable> pendingServiceRequests = new ArrayDeque<>();
    private final Map<String, String> pendingFinalizeTokens = new HashMap();
    private final Map<String, Integer> productQueryFailureCounts = new HashMap();
    private final AtomicLong requestCounter = new AtomicLong();
    private final AtomicLong asyncOperationCounter = new AtomicLong();
    private final Set<Long> activePurchaseQueries = new HashSet();
    private final Set<Long> activeProductRefreshes = new HashSet();
    private ConnectionState connectionState = ConnectionState.DISCONNECTED;

    /* JADX INFO: loaded from: classes9.dex */
    private enum ConnectionState {
        DISCONNECTED,
        CONNECTING,
        READY
    }

    private class MyProductDetailsResponseListener implements ProductDetailsResponseListener {
        private final boolean notifyLegacyListener;
        private final List<String> requestedSkus;
        private final String skuType;

        MyProductDetailsResponseListener(String str, List<String> list, boolean z) {
            this.skuType = str;
            this.requestedSkus = new ArrayList(list);
            this.notifyLegacyListener = z;
        }

        @Override // com.android.billingclient.api.ProductDetailsResponseListener
        public void onProductDetailsResponse(BillingResult billingResult, List<ProductDetails> list) {
            int iSafeResponseCode = GoogleBillingUtil.safeResponseCode(billingResult);
            if (iSafeResponseCode != 0 || list == null) {
                if (this.notifyLegacyListener) {
                    GoogleBillingUtil.this.notifyQueryFailure(iSafeResponseCode, GoogleBillingUtil.safeDebugMessage(billingResult));
                }
                GoogleBillingUtil.this.scheduleProductQueryRetry("product:" + this.skuType, this.skuType, this.requestedSkus, this.notifyLegacyListener, iSafeResponseCode);
                return;
            }
            GoogleBillingUtil.this.replaceProductDetails(this.skuType, this.requestedSkus, list);
            GoogleBillingUtil.this.resetProductQueryRetry("product:" + this.skuType);
            if (!this.notifyLegacyListener || GoogleBillingUtil.mOnQueryFinishedListener == null) {
                return;
            }
            GoogleBillingUtil.mOnQueryFinishedListener.onNewQuerySuccess(this.skuType, list);
        }
    }

    private class MyPurchasesUpdatedListener implements PurchasesUpdatedListener {
        private MyPurchasesUpdatedListener() {
        }

        @Override // com.android.billingclient.api.PurchasesUpdatedListener
        public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) throws Throwable {
            int iSafeResponseCode = GoogleBillingUtil.safeResponseCode(billingResult);
            if (iSafeResponseCode != 0 || list == null) {
                GoogleBillingUtil.this.emitFlowResult("", "", iSafeResponseCode, GoogleBillingUtil.safeDebugMessage(billingResult), false);
                OnPurchaseFinishedListener onPurchaseFinishedListener = GoogleBillingUtil.mOnPurchaseFinishedListener;
                if (onPurchaseFinishedListener != null) {
                    onPurchaseFinishedListener.onPurchaseFail(iSafeResponseCode);
                }
                if (iSafeResponseCode == 7) {
                    GoogleBillingUtil googleBillingUtil = GoogleBillingUtil.this;
                    googleBillingUtil.queryAllPurchases(googleBillingUtil.nextRequestId("already-owned-query"));
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Purchase purchase : list) {
                GoogleBillingUtil googleBillingUtil2 = GoogleBillingUtil.this;
                googleBillingUtil2.emitPurchaseEvents(ViewHierarchyConstants.PURCHASE, "", "", googleBillingUtil2.getSkuType(googleBillingUtil2.getPurchaseSku(purchase)), "purchase_update", purchase);
                if (GoogleBillingUtil.this.isPurchased(purchase)) {
                    arrayList.add(purchase);
                } else if (GoogleBillingUtil.this.isPending(purchase)) {
                    arrayList2.add(purchase);
                }
            }
            OnPurchaseFinishedListener onPurchaseFinishedListener2 = GoogleBillingUtil.mOnPurchaseFinishedListener;
            if (onPurchaseFinishedListener2 == null) {
                return;
            }
            if (!arrayList.isEmpty()) {
                onPurchaseFinishedListener2.onPurchaseSuccess(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                onPurchaseFinishedListener2.onPurchasePending(arrayList2);
            }
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                onPurchaseFinishedListener2.onPurchaseFail(iSafeResponseCode);
            }
        }
    }

    private class MySkuDetailsResponseListener implements SkuDetailsResponseListener {
        private final boolean notifyLegacyListener;
        private final List<String> requestedSkus;
        private final String skuType;

        MySkuDetailsResponseListener(String str, List<String> list, boolean z) {
            this.skuType = str;
            this.requestedSkus = new ArrayList(list);
            this.notifyLegacyListener = z;
        }

        @Override // com.android.billingclient.api.SkuDetailsResponseListener
        public void onSkuDetailsResponse(BillingResult billingResult, List<SkuDetails> list) {
            int iSafeResponseCode = GoogleBillingUtil.safeResponseCode(billingResult);
            if (iSafeResponseCode != 0 || list == null) {
                if (this.notifyLegacyListener) {
                    GoogleBillingUtil.this.notifyQueryFailure(iSafeResponseCode, GoogleBillingUtil.safeDebugMessage(billingResult));
                }
                GoogleBillingUtil.this.scheduleProductQueryRetry("sku:" + this.skuType, this.skuType, this.requestedSkus, this.notifyLegacyListener, iSafeResponseCode);
                return;
            }
            GoogleBillingUtil.this.replaceSkuDetails(this.skuType, this.requestedSkus, list);
            GoogleBillingUtil.this.resetProductQueryRetry("sku:" + this.skuType);
            if (!this.notifyLegacyListener || GoogleBillingUtil.mOnQueryFinishedListener == null) {
                return;
            }
            GoogleBillingUtil.mOnQueryFinishedListener.onQuerySuccess(this.skuType, list);
        }
    }

    public interface OnPurchaseFinishedListener {
        void onPurchaseError();

        void onPurchaseFail(int i);

        void onPurchasePending(List<Purchase> list);

        void onPurchaseSuccess(List<Purchase> list);
    }

    public interface OnQueryFinishedListener {
        void onNewQuerySuccess(String str, List<ProductDetails> list);

        void onQueryError();

        void onQueryFail(int i);

        void onQuerySuccess(String str, List<SkuDetails> list);
    }

    public interface OnStartSetupFinishedListener {
        void onSetupError();

        void onSetupFail(int i);

        void onSetupSuccess();
    }

    private GoogleBillingUtil() {
    }

    private boolean CheckConsumables(String str) {
        return str != null && Consumables.contains(str);
    }

    public static void SetConsumablesIds(Set<String> set) {
        Consumables = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(new HashSet(set));
    }

    private boolean allProductsMatchType(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (!str.equals(getSkuType(it.next()))) {
                return false;
            }
        }
        return true;
    }

    private JSONObject baseEvent(String str) {
        JSONObject jSONObject = new JSONObject();
        put(jSONObject, "schemaVersion", 1);
        put(jSONObject, "eventType", str);
        put(jSONObject, C11540L6.f24917H, "android");
        return jSONObject;
    }

    public static void cleanListener() {
        mOnPurchaseFinishedListener = null;
        mOnQueryFinishedListener = null;
        mOnStartSetupFinishedListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeFinalize(String str, String str2, String str3, int i, String str4) {
        synchronized (this.pendingFinalizeTokens) {
            if (str2.equals(this.pendingFinalizeTokens.get(str3))) {
                this.pendingFinalizeTokens.remove(str3);
            }
        }
        boolean z = i == 0;
        emitFinalizeResult(str, str2, str3, i, str4, z);
        if (z) {
            sendUnityMessage("message", "ConsumeSuccessed;" + nonNull(str3));
        } else {
            sendUnityMessage("message", ("consume".equals(str) ? "ConsumeFailed" : "AcknowledgeFailed") + ";" + nonNull(str3) + ";" + i + ";" + sanitizeLegacy(str4) + ";" + isRetryable(i) + ";" + str2);
        }
        if (i == -1) {
            markDisconnectedIfNeeded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean completeProductRefresh(long j) {
        boolean zRemove;
        synchronized (this.activeProductRefreshes) {
            zRemove = this.activeProductRefreshes.remove(Long.valueOf(j));
        }
        return zRemove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean completePurchaseQuery(long j) {
        boolean zRemove;
        synchronized (this.activePurchaseQueries) {
            zRemove = this.activePurchaseQueries.remove(Long.valueOf(j));
        }
        return zRemove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emitFinalizeResult(String str, String str2, String str3, int i, String str4, boolean z) {
        JSONObject jSONObjectBaseEvent = baseEvent("FINALIZE_RESULT");
        put(jSONObjectBaseEvent, "success", Boolean.valueOf(z));
        put(jSONObjectBaseEvent, "operation", str);
        put(jSONObjectBaseEvent, "opId", nonNull(str2));
        put(jSONObjectBaseEvent, "transactionId", nonNull(str3));
        put(jSONObjectBaseEvent, "purchaseToken", nonNull(str3));
        put(jSONObjectBaseEvent, "responseCode", Integer.valueOf(i));
        put(jSONObjectBaseEvent, "debugMessage", nonNull(str4));
        put(jSONObjectBaseEvent, "retryable", Boolean.valueOf(isRetryable(i)));
        sendBillingEvent(jSONObjectBaseEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emitFlowResult(String str, String str2, int i, String str3, boolean z) {
        emitFlowResult(str, str2, i, str3, z, "");
    }

    private void emitFlowResult(String str, String str2, int i, String str3, boolean z, String str4) {
        JSONObject jSONObjectBaseEvent = baseEvent("FLOW_RESULT");
        put(jSONObjectBaseEvent, "success", Boolean.valueOf(z));
        put(jSONObjectBaseEvent, InAppPurchaseMetaData.KEY_PRODUCT_ID, nonNull(str));
        put(jSONObjectBaseEvent, C11744X3.i.f26378m, nonNull(str2));
        put(jSONObjectBaseEvent, "responseCode", Integer.valueOf(i));
        put(jSONObjectBaseEvent, "debugMessage", nonNull(str3));
        put(jSONObjectBaseEvent, "retryable", Boolean.valueOf(isRetryable(i)));
        put(jSONObjectBaseEvent, "errorType", nonNull(str4));
        sendBillingEvent(jSONObjectBaseEvent);
    }

    private void emitPurchaseEvent(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, Purchase purchase) {
        JSONObject jSONObjectBaseEvent = baseEvent(str);
        put(jSONObjectBaseEvent, "success", true);
        put(jSONObjectBaseEvent, "requestId", nonNull(str2));
        put(jSONObjectBaseEvent, "opId", nonNull(str3));
        put(jSONObjectBaseEvent, C11744X3.i.f26378m, nonNull(str4));
        put(jSONObjectBaseEvent, InAppPurchaseMetaData.KEY_PRODUCT_ID, nonNull(str6));
        put(jSONObjectBaseEvent, "productIds", toJsonArray(list));
        put(jSONObjectBaseEvent, "transactionId", purchase == null ? "" : nonNull(purchase.getPurchaseToken()));
        put(jSONObjectBaseEvent, "purchaseToken", purchase == null ? "" : nonNull(purchase.getPurchaseToken()));
        put(jSONObjectBaseEvent, "orderId", purchase == null ? "" : nonNull(purchase.getOrderId()));
        put(jSONObjectBaseEvent, "state", purchaseStateName(purchase));
        put(jSONObjectBaseEvent, "purchaseState", Integer.valueOf(purchase == null ? 0 : purchase.getPurchaseState()));
        put(jSONObjectBaseEvent, FirebaseAnalytics.Param.QUANTITY, Integer.valueOf(purchase == null ? 0 : purchase.getQuantity()));
        put(jSONObjectBaseEvent, "source", nonNull(str5));
        put(jSONObjectBaseEvent, "acknowledged", Boolean.valueOf(purchase != null && purchase.isAcknowledged()));
        put(jSONObjectBaseEvent, "responseCode", 0);
        put(jSONObjectBaseEvent, "debugMessage", "");
        put(jSONObjectBaseEvent, "retryable", false);
        sendBillingEvent(jSONObjectBaseEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emitPurchaseEvents(String str, String str2, String str3, String str4, String str5, Purchase purchase) {
        List<String> purchaseProducts = getPurchaseProducts(purchase);
        emitPurchaseEvent(str, str2, str3, str4, str5, purchaseProducts.isEmpty() ? "" : purchaseProducts.get(0), purchaseProducts, purchase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emitQueryFailure(String str, String str2, int i, String str3) {
        JSONObject jSONObjectBaseEvent = baseEvent("QUERY_COMPLETE");
        put(jSONObjectBaseEvent, "success", false);
        put(jSONObjectBaseEvent, "requestId", str2);
        put(jSONObjectBaseEvent, C11744X3.i.f26378m, str);
        put(jSONObjectBaseEvent, "count", 0);
        put(jSONObjectBaseEvent, "responseCode", Integer.valueOf(i));
        put(jSONObjectBaseEvent, "debugMessage", nonNull(str3));
        put(jSONObjectBaseEvent, "retryable", Boolean.valueOf(isRetryable(i)));
        sendBillingEvent(jSONObjectBaseEvent);
        sendUnityMessage("QueryPurchasesedResult", "Failed;" + i + ";" + sanitizeLegacy(str3) + ";none;none;0;");
        if (i == -1) {
            markDisconnectedIfNeeded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emitSetupState(ConnectionState connectionState, boolean z, int i, String str, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        put(jSONObject, "schemaVersion", 1);
        put(jSONObject, C11540L6.f24917H, "android");
        put(jSONObject, "state", connectionState.name());
        put(jSONObject, "success", Boolean.valueOf(z));
        put(jSONObject, "responseCode", Integer.valueOf(i));
        put(jSONObject, "debugMessage", nonNull(str));
        put(jSONObject, "retryable", Boolean.valueOf(z2));
        put(jSONObject, "errorType", "");
        sendUnityMessage("BillingSetupResult", jSONObject.toString());
    }

    public static void endConnection() {
        GoogleBillingUtil googleBillingUtil = mGoogleBillingUtil;
        synchronized (googleBillingUtil.connectionLock) {
            googleBillingUtil.mainHandler.removeCallbacksAndMessages(null);
            googleBillingUtil.pendingServiceRequests.clear();
            googleBillingUtil.pendingFinalizeTokens.clear();
            googleBillingUtil.activePurchaseQueries.clear();
            googleBillingUtil.activeProductRefreshes.clear();
            googleBillingUtil.reconnectScheduled = false;
            googleBillingUtil.connectionState = ConnectionState.DISCONNECTED;
            BillingClient billingClient = mBillingClient;
            if (billingClient != null) {
                billingClient.endConnection();
                mBillingClient = null;
            }
        }
    }

    private void ensureClientLocked() {
        Context context;
        if (mBillingClient != null || (context = this.applicationContext) == null) {
            return;
        }
        mBillingClient = BillingClient.newBuilder(context).enablePendingPurchases().setListener(new MyPurchasesUpdatedListener()).build();
        this.connectionState = ConnectionState.DISCONNECTED;
    }

    private void executeServiceRequest(Runnable runnable) throws Throwable {
        boolean z;
        synchronized (this.connectionLock) {
            BillingClient billingClient = mBillingClient;
            if (billingClient != null && billingClient.isReady() && this.connectionState == ConnectionState.READY) {
                z = true;
            } else {
                this.pendingServiceRequests.addLast(runnable);
                z = false;
            }
        }
        if (z) {
            runSafely(runnable);
        } else {
            startConnection();
        }
    }

    public static GoogleBillingUtil getInstance() {
        return mGoogleBillingUtil;
    }

    private int getPositionBySku(String str, String str2) {
        String[] strArr = "inapp".equals(str2) ? this.inAppSKUS : this.subsSKUS;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    private List<String> getPurchaseProducts(Purchase purchase) {
        if (purchase == null) {
            return Collections.EMPTY_LIST;
        }
        List<String> products = purchase.getProducts();
        if (products == null || products.isEmpty()) {
            products = purchase.getSkus();
        }
        return products == null ? Collections.EMPTY_LIST : products;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPurchaseSku(Purchase purchase) {
        List<String> purchaseProducts = getPurchaseProducts(purchase);
        if (purchaseProducts.isEmpty()) {
            return null;
        }
        return purchaseProducts.get(0);
    }

    private void handleLaunchResult(String str, String str2, BillingResult billingResult) throws Throwable {
        int iSafeResponseCode = safeResponseCode(billingResult);
        emitFlowResult(str, str2, iSafeResponseCode, safeDebugMessage(billingResult), iSafeResponseCode == 0);
        if (iSafeResponseCode != 0) {
            OnPurchaseFinishedListener onPurchaseFinishedListener = mOnPurchaseFinishedListener;
            if (onPurchaseFinishedListener != null) {
                onPurchaseFinishedListener.onPurchaseFail(iSafeResponseCode);
            }
            if (iSafeResponseCode == 7) {
                queryAllPurchases(nextRequestId("already-owned-query"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleQueryPurchasesResponse(String str, String str2, BillingResult billingResult, List<Purchase> list) {
        int iSafeResponseCode = safeResponseCode(billingResult);
        if (iSafeResponseCode != 0) {
            emitQueryFailure(str, str2, iSafeResponseCode, safeDebugMessage(billingResult));
            return;
        }
        List<Purchase> list2 = list == null ? Collections.EMPTY_LIST : list;
        ArrayList<Purchase> arrayList = new ArrayList();
        int i = 0;
        for (Purchase purchase : list2) {
            emitPurchaseEvents("QUERY_ITEM", str2, "", str, "query", purchase);
            i++;
            arrayList.add(purchase);
        }
        JSONObject jSONObjectBaseEvent = baseEvent("QUERY_COMPLETE");
        put(jSONObjectBaseEvent, "success", true);
        put(jSONObjectBaseEvent, "requestId", str2);
        put(jSONObjectBaseEvent, C11744X3.i.f26378m, str);
        put(jSONObjectBaseEvent, "count", Integer.valueOf(i));
        put(jSONObjectBaseEvent, "responseCode", Integer.valueOf(iSafeResponseCode));
        put(jSONObjectBaseEvent, "debugMessage", safeDebugMessage(billingResult));
        put(jSONObjectBaseEvent, "retryable", false);
        sendBillingEvent(jSONObjectBaseEvent);
        for (Purchase purchase2 : arrayList) {
            sendUnityMessage("QueryPurchasesedResult", legacyPurchaseMessage(isPending(purchase2) ? "Pending" : "Success", getPurchaseSku(purchase2), purchase2));
        }
        if (list2.isEmpty()) {
            sendUnityMessage("QueryPurchasesedResult", "Success;_none;none;none;none;0;");
        } else {
            sendUnityMessage("QueryPurchasesedResult", "Success;_finish;none;none;none;0;");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x000d  */
    public boolean isCurrentClient(BillingClient billingClient) {
        boolean z;
        synchronized (this.connectionLock) {
            if (billingClient != null) {
                try {
                    if (billingClient == mBillingClient) {
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                z = false;
            }
        }
        return z;
    }

    public static boolean isGooglePlayServicesAvailable(Context context) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isPending(Purchase purchase) {
        return purchase != null && purchase.getPurchaseState() == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isPurchaseQueryActive(long j) {
        boolean zContains;
        synchronized (this.activePurchaseQueries) {
            zContains = this.activePurchaseQueries.contains(Long.valueOf(j));
        }
        return zContains;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isPurchased(Purchase purchase) {
        return purchase != null && purchase.getPurchaseState() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isRetryable(int i) {
        return i == -3 || i == -1 || i == 2 || i == 3 || i == 6 || i == 12 || i == 7 || i == 8;
    }

    private boolean isValidOfferToken(ProductDetails productDetails, String str) {
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails;
        if (str == null || str.isEmpty() || (subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails()) == null) {
            return false;
        }
        Iterator<ProductDetails.SubscriptionOfferDetails> it = subscriptionOfferDetails.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().getOfferToken())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchProductDetailsFlow(final Activity activity, final String str, final String str2, final String str3, final ProductDetails productDetails) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.mainHandler.post(new Runnable() { // from class: com.androidgamegou.googleiap.GoogleBillingUtil.8
                @Override // java.lang.Runnable
                public void run() {
                    GoogleBillingUtil.this.launchProductDetailsFlow(activity, str, str2, str3, productDetails);
                }
            });
            return;
        }
        try {
            BillingFlowParams.ProductDetailsParams.Builder productDetails2 = BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails);
            if ("subs".equals(str3)) {
                if (!isValidOfferToken(productDetails, str2)) {
                    notifyPurchaseFailure(str, str3, 5, "Missing or invalid subscription offerToken");
                    return;
                }
                productDetails2.setOfferToken(str2);
            }
            handleLaunchResult(str, str3, mBillingClient.launchBillingFlow(activity, BillingFlowParams.newBuilder().setProductDetailsParamsList(Collections.singletonList(productDetails2.build())).build()));
        } catch (Throwable th) {
            notifyPurchaseFailure(str, str3, 5, "Unable to launch billing flow: " + th.getMessage());
        }
    }

    private String legacyPurchaseMessage(String str, String str2, Purchase purchase) {
        return str + ";" + nonNull(str2) + ";" + nonNull(purchase.getSignature()) + ";" + nonNull(purchase.getOriginalJson()) + ";" + nonNull(purchase.getPurchaseToken()) + ";" + purchase.getPurchaseState() + ";";
    }

    private static void log(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void markDisconnectedIfNeeded() {
        synchronized (this.connectionLock) {
            BillingClient billingClient = mBillingClient;
            if (billingClient != null && !billingClient.isReady()) {
                this.connectionState = ConnectionState.DISCONNECTED;
                this.reconnectReconcileRequired = true;
                scheduleReconnect();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String nextRequestId(String str) {
        return str + "-" + System.currentTimeMillis() + "-" + this.requestCounter.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String nonNull(String str) {
        return str == null ? "" : str;
    }

    private String normalizeRequestId(String str, String str2) {
        return (str == null || str.isEmpty()) ? nextRequestId(str2) : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyPurchaseFailure(String str, String str2, int i, String str3) {
        emitFlowResult(str, str2, i, str3, false);
        OnPurchaseFinishedListener onPurchaseFinishedListener = mOnPurchaseFinishedListener;
        if (onPurchaseFinishedListener != null) {
            onPurchaseFinishedListener.onPurchaseFail(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyQueryFailure(int i, String str) {
        OnQueryFinishedListener onQueryFinishedListener = mOnQueryFinishedListener;
        if (onQueryFinishedListener != null) {
            onQueryFinishedListener.onQueryFail(i);
        }
        log("Product query failed: " + i + " " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyReadyAndDrain(boolean z) throws Throwable {
        emitSetupState(ConnectionState.READY, true, 0, "Billing client ready", false);
        OnStartSetupFinishedListener onStartSetupFinishedListener = mOnStartSetupFinishedListener;
        if (onStartSetupFinishedListener != null) {
            onStartSetupFinishedListener.onSetupSuccess();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.connectionLock) {
            while (!this.pendingServiceRequests.isEmpty()) {
                arrayList.add(this.pendingServiceRequests.removeFirst());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            runSafely((Runnable) it.next());
        }
        if (z) {
            String strNextRequestId = nextRequestId("reconnect-query");
            queryInventoryInApp();
            queryInventorySubs();
            queryPurchasesInApp(strNextRequestId);
            queryPurchasesSubs(strNextRequestId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifySetupFailure(int i, boolean z) {
        OnStartSetupFinishedListener onStartSetupFinishedListener = mOnStartSetupFinishedListener;
        if (onStartSetupFinishedListener == null) {
            return;
        }
        if (z) {
            onStartSetupFinishedListener.onSetupError();
        } else {
            onStartSetupFinishedListener.onSetupFail(i);
        }
    }

    private static List<String> parseSkuList(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(";")) {
            if (str2 != null && !str2.trim().isEmpty()) {
                arrayList.add(str2.trim());
            }
        }
        return arrayList;
    }

    private void purchase(final Activity activity, final String str, final String str2, final String str3) throws Throwable {
        if (activity == null || str == null || str.isEmpty() || str3 == null) {
            notifyPurchaseFailure(str, str3, 5, "Invalid activity, product id, or product type");
        } else {
            executeServiceRequest(new Runnable() { // from class: com.androidgamegou.googleiap.GoogleBillingUtil.5
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    ProductDetails productDetails = GoogleBillingUtil.productDetailsMap.get(str);
                    if (productDetails == null || !str3.equals(productDetails.getProductType())) {
                        GoogleBillingUtil.this.refreshProductThenPurchase(activity, str, str2, str3);
                    } else {
                        GoogleBillingUtil.this.launchProductDetailsFlow(activity, str, str2, str3, productDetails);
                    }
                }
            });
        }
    }

    private String purchaseStateName(Purchase purchase) {
        if (isPurchased(purchase)) {
            return "PURCHASED";
        }
        return isPending(purchase) ? "PENDING" : "UNSPECIFIED";
    }

    private static void put(JSONObject jSONObject, String str, Object obj) {
        if (obj == null) {
            try {
                obj = JSONObject.NULL;
            } catch (JSONException e) {
                Log.e(TAG, "Unable to encode billing event field " + str, e);
                return;
            }
        }
        jSONObject.put(str, obj);
    }

    private void queryInventory(String str) throws Throwable {
        ArrayList arrayList = new ArrayList();
        if ("inapp".equals(str)) {
            Collections.addAll(arrayList, this.inAppSKUS);
        } else if ("subs".equals(str)) {
            Collections.addAll(arrayList, this.subsSKUS);
        }
        removeEmptyValues(arrayList);
        if (arrayList.isEmpty()) {
            replaceProductDetails(str, arrayList, Collections.EMPTY_LIST);
        } else {
            queryProductDetails(str, arrayList, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void queryProductDetails(final String str, final List<String> list, final boolean z) throws Throwable {
        executeServiceRequest(new Runnable() { // from class: com.androidgamegou.googleiap.GoogleBillingUtil.3
            @Override // java.lang.Runnable
            public void run() {
                BillingClient billingClient = GoogleBillingUtil.mBillingClient;
                if (billingClient == null || !billingClient.isReady()) {
                    GoogleBillingUtil.this.notifyQueryFailure(-1, "Billing client is not ready");
                    GoogleBillingUtil.this.markDisconnectedIfNeeded();
                } else {
                    if (GoogleBillingUtil.safeResponseCode(billingClient.isFeatureSupported(BillingClient.FeatureType.PRODUCT_DETAILS)) != 0) {
                        billingClient.querySkuDetailsAsync(SkuDetailsParams.newBuilder().setSkusList(list).setType(str).build(), GoogleBillingUtil.this.new MySkuDetailsResponseListener(str, list, z));
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(str).build());
                    }
                    billingClient.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(arrayList).build(), GoogleBillingUtil.this.new MyProductDetailsResponseListener(str, list, z));
                }
            }
        });
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0030 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void queryPurchases(final java.lang.String r8, final java.lang.String r9) throws java.lang.Throwable {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r7.asyncOperationCounter
            long r3 = r0.incrementAndGet()
            java.util.Set<java.lang.Long> r1 = r7.activePurchaseQueries
            monitor-enter(r1)
            java.util.Set<java.lang.Long> r0 = r7.activePurchaseQueries     // Catch: java.lang.Throwable -> L2b
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L2b
            r0.add(r2)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            android.os.Handler r0 = r7.mainHandler
            com.androidgamegou.googleiap.GoogleBillingUtil$11 r1 = new com.androidgamegou.googleiap.GoogleBillingUtil$11
            r2 = r7
            r5 = r8
            r6 = r9
            r1.<init>()
            r8 = 30000(0x7530, double:1.4822E-319)
            r0.postDelayed(r1, r8)
            com.androidgamegou.googleiap.GoogleBillingUtil$12 r1 = new com.androidgamegou.googleiap.GoogleBillingUtil$12
            r1.<init>()
            r7.executeServiceRequest(r1)
            return
        L2b:
            r0 = move-exception
            r2 = r7
        L2d:
            r8 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            throw r8
        L30:
            r0 = move-exception
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.androidgamegou.googleiap.GoogleBillingUtil.queryPurchases(java.lang.String, java.lang.String):void");
    }

    private void queueInitialSync() throws Throwable {
        queryInventoryInApp();
        queryInventorySubs();
        String strNextRequestId = nextRequestId("initial-query");
        queryPurchasesInApp(strNextRequestId);
        queryPurchasesSubs(strNextRequestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0088 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void refreshProductThenPurchase(final android.app.Activity r11, final java.lang.String r12, final java.lang.String r13, final java.lang.String r14) throws java.lang.Throwable {
        /*
            r10 = this;
            com.android.billingclient.api.BillingClient r0 = com.androidgamegou.googleiap.GoogleBillingUtil.mBillingClient
            if (r0 == 0) goto L8a
            boolean r1 = r0.isReady()
            if (r1 != 0) goto Lc
            goto L8a
        Lc:
            java.util.concurrent.atomic.AtomicLong r1 = r10.asyncOperationCounter
            long r4 = r1.incrementAndGet()
            java.util.Set<java.lang.Long> r1 = r10.activeProductRefreshes
            monitor-enter(r1)
            java.util.Set<java.lang.Long> r2 = r10.activeProductRefreshes     // Catch: java.lang.Throwable -> L83
            java.lang.Long r3 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L83
            r2.add(r3)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L83
            android.os.Handler r1 = r10.mainHandler
            com.androidgamegou.googleiap.GoogleBillingUtil$6 r2 = new com.androidgamegou.googleiap.GoogleBillingUtil$6
            r3 = r10
            r6 = r12
            r7 = r14
            r2.<init>()
            r8 = 30000(0x7530, double:1.4822E-319)
            r1.postDelayed(r2, r8)
            com.android.billingclient.api.QueryProductDetailsParams$Product$Builder r12 = com.android.billingclient.api.QueryProductDetailsParams.Product.newBuilder()     // Catch: java.lang.Throwable -> L5c
            com.android.billingclient.api.QueryProductDetailsParams$Product$Builder r12 = r12.setProductId(r6)     // Catch: java.lang.Throwable -> L5c
            com.android.billingclient.api.QueryProductDetailsParams$Product$Builder r12 = r12.setProductType(r7)     // Catch: java.lang.Throwable -> L5c
            com.android.billingclient.api.QueryProductDetailsParams$Product r12 = r12.build()     // Catch: java.lang.Throwable -> L5c
            com.android.billingclient.api.QueryProductDetailsParams$Builder r14 = com.android.billingclient.api.QueryProductDetailsParams.newBuilder()     // Catch: java.lang.Throwable -> L5c
            java.util.List r12 = java.util.Collections.singletonList(r12)     // Catch: java.lang.Throwable -> L5c
            com.android.billingclient.api.QueryProductDetailsParams$Builder r12 = r14.setProductList(r12)     // Catch: java.lang.Throwable -> L5c
            com.android.billingclient.api.QueryProductDetailsParams r12 = r12.build()     // Catch: java.lang.Throwable -> L5c
            com.androidgamegou.googleiap.GoogleBillingUtil$7 r2 = new com.androidgamegou.googleiap.GoogleBillingUtil$7     // Catch: java.lang.Throwable -> L5c
            r3 = r10
            r8 = r11
            r9 = r13
            r2.<init>()     // Catch: java.lang.Throwable -> L5a
            r0.queryProductDetailsAsync(r12, r2)     // Catch: java.lang.Throwable -> L5a
            return
        L5a:
            r0 = move-exception
            goto L5e
        L5c:
            r0 = move-exception
            r3 = r10
        L5e:
            r11 = r0
            boolean r12 = r10.completeProductRefresh(r4)
            if (r12 == 0) goto L7f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Pre-launch ProductDetails query threw: "
            r12.<init>(r13)
            java.lang.String r11 = r11.getMessage()
            java.lang.String r11 = nonNull(r11)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r12 = 6
            r10.notifyPurchaseFailure(r6, r7, r12, r11)
        L7f:
            r10.markDisconnectedIfNeeded()
            return
        L83:
            r0 = move-exception
            r3 = r10
        L85:
            r11 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L88
            throw r11
        L88:
            r0 = move-exception
            goto L85
        L8a:
            r3 = r10
            r6 = r12
            r7 = r14
            r11 = -1
            java.lang.String r12 = "Billing client is not ready"
            r10.notifyPurchaseFailure(r6, r7, r11, r12)
            r10.markDisconnectedIfNeeded()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.androidgamegou.googleiap.GoogleBillingUtil.refreshProductThenPurchase(android.app.Activity, java.lang.String, java.lang.String, java.lang.String):void");
    }

    private static void removeEmptyValues(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next == null || next.trim().isEmpty()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceProductDetails(String str, List<String> list, List<ProductDetails> list2) {
        Map<String, ProductDetails> map = productDetailsMap;
        synchronized (map) {
            Iterator<Map.Entry<String, ProductDetails>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                ProductDetails value = it.next().getValue();
                if (value != null && str.equals(value.getProductType())) {
                    it.remove();
                }
            }
            for (ProductDetails productDetails : list2) {
                productDetailsMap.put(productDetails.getProductId(), productDetails);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceSkuDetails(String str, List<String> list, List<SkuDetails> list2) {
        Map<String, SkuDetails> map = skuDetailsMap;
        synchronized (map) {
            Iterator<Map.Entry<String, SkuDetails>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                SkuDetails value = it.next().getValue();
                if (value != null && str.equals(value.getType())) {
                    it.remove();
                }
            }
            for (SkuDetails skuDetails : list2) {
                skuDetailsMap.put(skuDetails.getSku(), skuDetails);
            }
        }
    }

    private void requestFinalize(final String str, String str2, final String str3) throws Throwable {
        if (str2 == null || str2.isEmpty()) {
            str2 = nextRequestId(str);
        }
        final String str4 = str2;
        if (str3 == null || str3.isEmpty()) {
            emitFinalizeResult(str, str4, str3, 5, "Purchase token is empty", false);
            return;
        }
        synchronized (this.pendingFinalizeTokens) {
            try {
                try {
                    if (this.pendingFinalizeTokens.containsKey(str3)) {
                        emitFinalizeResult(str, str4, str3, 6, "A finalize operation is already pending for this token", true);
                    } else {
                        this.pendingFinalizeTokens.put(str3, str4);
                        executeServiceRequest(new Runnable() { // from class: com.androidgamegou.googleiap.GoogleBillingUtil.9
                            @Override // java.lang.Runnable
                            public void run() {
                                BillingClient billingClient = GoogleBillingUtil.mBillingClient;
                                if (billingClient == null || !billingClient.isReady()) {
                                    GoogleBillingUtil.this.completeFinalize(str, str4, str3, -1, "Billing client is not ready");
                                    GoogleBillingUtil.this.markDisconnectedIfNeeded();
                                    return;
                                }
                                try {
                                    GoogleBillingUtil.this.scheduleFinalizeTimeout(str, str4, str3);
                                    if ("consume".equals(str)) {
                                        billingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(str3).build(), new ConsumeResponseListener() { // from class: com.androidgamegou.googleiap.GoogleBillingUtil.9.1
                                            @Override // com.android.billingclient.api.ConsumeResponseListener
                                            public void onConsumeResponse(BillingResult billingResult, String str5) {
                                                GoogleBillingUtil googleBillingUtil = GoogleBillingUtil.this;
                                                String str6 = str;
                                                String str7 = str4;
                                                if (str5 == null || str5.isEmpty()) {
                                                    str5 = str3;
                                                }
                                                googleBillingUtil.completeFinalize(str6, str7, str5, GoogleBillingUtil.safeResponseCode(billingResult), GoogleBillingUtil.safeDebugMessage(billingResult));
                                            }
                                        });
                                    } else {
                                        billingClient.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(str3).build(), new AcknowledgePurchaseResponseListener() { // from class: com.androidgamegou.googleiap.GoogleBillingUtil.9.2
                                            @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
                                            public void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                                                GoogleBillingUtil.this.completeFinalize(str, str4, str3, GoogleBillingUtil.safeResponseCode(billingResult), GoogleBillingUtil.safeDebugMessage(billingResult));
                                            }
                                        });
                                    }
                                } catch (Throwable th) {
                                    GoogleBillingUtil.this.completeFinalize(str, str4, str3, 6, th.getMessage());
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetProductQueryRetry(String str) {
        synchronized (this.productQueryFailureCounts) {
            this.productQueryFailureCounts.remove(str);
        }
    }

    private void runSafely(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            log("Billing operation threw: " + th);
            markDisconnectedIfNeeded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String safeDebugMessage(BillingResult billingResult) {
        return billingResult == null ? "BillingResult is null" : nonNull(billingResult.getDebugMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int safeResponseCode(BillingResult billingResult) {
        if (billingResult == null) {
            return 6;
        }
        return billingResult.getResponseCode();
    }

    private static String sanitizeLegacy(String str) {
        return nonNull(str).replace(';', AbstractJsonLexerKt.COMMA).replace('\n', ' ').replace('\r', ' ');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleFinalizeTimeout(final String str, final String str2, final String str3) {
        this.mainHandler.postDelayed(new Runnable() { // from class: com.androidgamegou.googleiap.GoogleBillingUtil.10
            @Override // java.lang.Runnable
            public void run() {
                synchronized (GoogleBillingUtil.this.pendingFinalizeTokens) {
                    if (str2.equals(GoogleBillingUtil.this.pendingFinalizeTokens.get(str3))) {
                        GoogleBillingUtil.this.pendingFinalizeTokens.remove(str3);
                        String str4 = "Timed out waiting for " + str + " callback";
                        GoogleBillingUtil.this.emitFinalizeResult(str, str2, str3, -3, str4, false);
                        GoogleBillingUtil.sendUnityMessage("message", ("consume".equals(str) ? "ConsumeFailed" : "AcknowledgeFailed") + ";" + str3 + ";-3;" + str4 + ";true;" + str2);
                    }
                }
            }
        }, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleProductQueryRetry(String str, final String str2, final List<String> list, final boolean z, int i) {
        int iIntValue;
        if (isRetryable(i)) {
            synchronized (this.productQueryFailureCounts) {
                Integer num = this.productQueryFailureCounts.get(str);
                iIntValue = num == null ? 0 : num.intValue();
                this.productQueryFailureCounts.put(str, Integer.valueOf(iIntValue + 1));
            }
            long[] jArr = RECONNECT_DELAYS_MS;
            this.mainHandler.postDelayed(new Runnable() { // from class: com.androidgamegou.googleiap.GoogleBillingUtil.4
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    GoogleBillingUtil.this.queryProductDetails(str2, list, z);
                }
            }, jArr[Math.min(iIntValue, jArr.length - 1)]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleReconnect() {
        synchronized (this.connectionLock) {
            if (mBillingClient != null && !this.reconnectScheduled && this.connectionState != ConnectionState.READY) {
                int i = this.reconnectAttempt;
                long[] jArr = RECONNECT_DELAYS_MS;
                long j = jArr[Math.min(i, jArr.length - 1)];
                this.reconnectAttempt++;
                this.reconnectScheduled = true;
                this.mainHandler.postDelayed(new Runnable() { // from class: com.androidgamegou.googleiap.GoogleBillingUtil.2
                    @Override // java.lang.Runnable
                    public void run() throws Throwable {
                        synchronized (GoogleBillingUtil.this.connectionLock) {
                            GoogleBillingUtil.this.reconnectScheduled = false;
                            if (GoogleBillingUtil.this.connectionState != ConnectionState.READY && GoogleBillingUtil.mBillingClient != null) {
                                GoogleBillingUtil.this.startConnection();
                            }
                        }
                    }
                }, j);
            }
        }
    }

    private void sendBillingEvent(JSONObject jSONObject) {
        sendUnityMessage("BillingEvent", jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sendUnityMessage(String str, String str2) {
        try {
            UnityPlayer.UnitySendMessage("IAPListener", str, str2);
        } catch (Throwable th) {
            Log.e(TAG, "Unable to send Unity billing callback " + str, th);
        }
    }

    private static JSONArray toJsonArray(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(nonNull(it.next()));
            }
        }
        return jSONArray;
    }

    public void AcknowledgeOrders(String str) throws Throwable {
        acknowledgePurchase(str);
    }

    public void AcknowledgeOrders(String str, String str2) throws Throwable {
        acknowledgePurchase(str, str2);
    }

    public void CheckPurchasesInApp() throws Throwable {
        queryPurchasesInApp(nextRequestId("check-query"));
    }

    public void ConsumOrders(String str) throws Throwable {
        consumeAsync(str);
    }

    public void ConsumOrders(String str, String str2) throws Throwable {
        consumeAsync(str, str2);
    }

    public void QuerySkuDetail(String str) throws Throwable {
        if (str == null || str.trim().isEmpty()) {
            notifyQueryFailure(5, "Product id list is empty");
            return;
        }
        List<String> skuList = parseSkuList(str);
        if (skuList.isEmpty()) {
            notifyQueryFailure(5, "Product id list is empty");
            return;
        }
        String skuType = getSkuType(skuList.get(0));
        if (skuType == null || !allProductsMatchType(skuList, skuType)) {
            notifyQueryFailure(5, "Unknown or mixed product types");
        } else {
            queryProductDetails(skuType, skuList, true);
        }
    }

    public void acknowledgePurchase(String str) throws Throwable {
        acknowledgePurchase(nextRequestId("acknowledge"), str);
    }

    public void acknowledgePurchase(String str, String str2) throws Throwable {
        requestFinalize("acknowledge", str, str2);
    }

    public GoogleBillingUtil build(Context context) throws Throwable {
        if (context == null) {
            emitSetupState(ConnectionState.DISCONNECTED, false, 5, "Context is null", false);
            notifySetupFailure(5, false);
            return this;
        }
        this.applicationContext = context.getApplicationContext();
        synchronized (this.connectionLock) {
            ensureClientLocked();
        }
        if (startConnection()) {
            emitSetupState(ConnectionState.READY, true, 0, "Billing client ready", false);
            OnStartSetupFinishedListener onStartSetupFinishedListener = mOnStartSetupFinishedListener;
            if (onStartSetupFinishedListener != null) {
                onStartSetupFinishedListener.onSetupSuccess();
            }
        }
        queueInitialSync();
        return this;
    }

    public void consumeAsync(String str) throws Throwable {
        consumeAsync(nextRequestId("consume"), str);
    }

    public void consumeAsync(String str, String str2) throws Throwable {
        requestFinalize("consume", str, str2);
    }

    public int getInAppPositionBySku(String str) {
        return getPositionBySku(str, "inapp");
    }

    public String getInAppSkuByPosition(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this.inAppSKUS;
        if (i < strArr.length) {
            return strArr[i];
        }
        return null;
    }

    public OnStartSetupFinishedListener getOnStartSetupFinishedListener() {
        return mOnStartSetupFinishedListener;
    }

    public int getPurchasesSizeSubs() {
        return -1;
    }

    public String getSkuType(String str) {
        if (str == null) {
            return null;
        }
        if (Arrays.asList(this.inAppSKUS).contains(str)) {
            return "inapp";
        }
        if (Arrays.asList(this.subsSKUS).contains(str)) {
            return "subs";
        }
        return null;
    }

    public int getSubsPositionBySku(String str) {
        return getPositionBySku(str, "subs");
    }

    public String getSubsSkuByPosition(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this.subsSKUS;
        if (i < strArr.length) {
            return strArr[i];
        }
        return null;
    }

    int getUnmaskedPurchaseState(Purchase purchase) {
        int purchaseState = purchase == null ? 0 : purchase.getPurchaseState();
        if (purchase != null) {
            try {
                return new JSONObject(purchase.getOriginalJson()).optInt("purchaseState", purchaseState);
            } catch (JSONException unused) {
            }
        }
        return purchaseState;
    }

    public boolean isAutoConsumeAsync() {
        return false;
    }

    public boolean isReady() {
        boolean z;
        synchronized (this.connectionLock) {
            BillingClient billingClient = mBillingClient;
            z = billingClient != null && billingClient.isReady() && this.connectionState == ConnectionState.READY;
        }
        return z;
    }

    public void purchaseInApp(Activity activity, String str) throws Throwable {
        purchase(activity, str, "", "inapp");
    }

    public void purchaseSubs(Activity activity, String str, String str2) throws Throwable {
        purchase(activity, str, str2, "subs");
    }

    public void queryAllPurchases(String str) throws Throwable {
        String strNormalizeRequestId = normalizeRequestId(str, "query-all");
        queryPurchasesInApp(strNormalizeRequestId);
        queryPurchasesSubs(strNormalizeRequestId);
    }

    public void queryInventoryInApp() throws Throwable {
        queryInventory("inapp");
    }

    public void queryInventorySubs() throws Throwable {
        queryInventory("subs");
    }

    public void queryPurchasesInApp() throws Throwable {
        queryPurchasesInApp(nextRequestId("legacy-query-inapp"));
    }

    public void queryPurchasesInApp(String str) throws Throwable {
        queryPurchases("inapp", normalizeRequestId(str, "query-inapp"));
    }

    public void queryPurchasesSubs() throws Throwable {
        queryPurchasesSubs(nextRequestId("legacy-query-subs"));
    }

    public void queryPurchasesSubs(String str) throws Throwable {
        queryPurchases("subs", normalizeRequestId(str, "query-subs"));
    }

    public void reportPurchaseError(String str, int i, String str2) {
        notifyPurchaseFailure(str, getSkuType(str), i, str2);
    }

    public void reportQueryError(String str, String str2, int i, String str3) {
        emitQueryFailure(nonNull(str), normalizeRequestId(str2, "query-error"), i, str3);
    }

    public void setIsAutoConsumeAsync(boolean z) {
        if (z) {
            Log.w(TAG, "Automatic consume/acknowledge is disabled; finalize explicitly after saving rewards");
        }
    }

    public GoogleBillingUtil setOnPurchaseFinishedListener(OnPurchaseFinishedListener onPurchaseFinishedListener) {
        mOnPurchaseFinishedListener = onPurchaseFinishedListener;
        return this;
    }

    public GoogleBillingUtil setOnQueryFinishedListener(OnQueryFinishedListener onQueryFinishedListener) {
        mOnQueryFinishedListener = onQueryFinishedListener;
        return this;
    }

    public GoogleBillingUtil setOnStartSetupFinishedListener(OnStartSetupFinishedListener onStartSetupFinishedListener) {
        mOnStartSetupFinishedListener = onStartSetupFinishedListener;
        return this;
    }

    public boolean startConnection() throws Throwable {
        final BillingClient billingClient;
        boolean z;
        synchronized (this.connectionLock) {
            try {
                try {
                    ensureClientLocked();
                    BillingClient billingClient2 = mBillingClient;
                    if (billingClient2 != null) {
                        if (billingClient2.isReady()) {
                            z = this.connectionState != ConnectionState.READY;
                            this.connectionState = ConnectionState.READY;
                            this.reconnectAttempt = 0;
                            this.reconnectScheduled = false;
                            billingClient = mBillingClient;
                        } else {
                            if (this.connectionState == ConnectionState.CONNECTING) {
                                return false;
                            }
                            this.connectionState = ConnectionState.CONNECTING;
                            this.reconnectScheduled = false;
                            billingClient = mBillingClient;
                            z = false;
                        }
                        if (billingClient.isReady()) {
                            if (z) {
                                notifyReadyAndDrain(false);
                            }
                            return true;
                        }
                        emitSetupState(ConnectionState.CONNECTING, false, -1, "Connecting", true);
                        try {
                            billingClient.startConnection(new BillingClientStateListener() { // from class: com.androidgamegou.googleiap.GoogleBillingUtil.1
                                @Override // com.android.billingclient.api.BillingClientStateListener
                                public void onBillingServiceDisconnected() {
                                    if (GoogleBillingUtil.this.isCurrentClient(billingClient)) {
                                        synchronized (GoogleBillingUtil.this.connectionLock) {
                                            GoogleBillingUtil.this.connectionState = ConnectionState.DISCONNECTED;
                                            GoogleBillingUtil.this.reconnectReconcileRequired = true;
                                        }
                                        GoogleBillingUtil.this.emitSetupState(ConnectionState.DISCONNECTED, false, -1, "Billing service disconnected", true);
                                        GoogleBillingUtil.this.notifySetupFailure(-1, true);
                                        GoogleBillingUtil.this.scheduleReconnect();
                                    }
                                }

                                @Override // com.android.billingclient.api.BillingClientStateListener
                                public void onBillingSetupFinished(BillingResult billingResult) throws Throwable {
                                    boolean z2;
                                    if (GoogleBillingUtil.this.isCurrentClient(billingClient)) {
                                        int iSafeResponseCode = GoogleBillingUtil.safeResponseCode(billingResult);
                                        if (iSafeResponseCode != 0) {
                                            String strSafeDebugMessage = GoogleBillingUtil.safeDebugMessage(billingResult);
                                            synchronized (GoogleBillingUtil.this.connectionLock) {
                                                GoogleBillingUtil.this.connectionState = ConnectionState.DISCONNECTED;
                                            }
                                            GoogleBillingUtil.this.emitSetupState(ConnectionState.DISCONNECTED, false, iSafeResponseCode, strSafeDebugMessage, GoogleBillingUtil.isRetryable(iSafeResponseCode));
                                            GoogleBillingUtil.this.notifySetupFailure(iSafeResponseCode, false);
                                            GoogleBillingUtil.this.scheduleReconnect();
                                            return;
                                        }
                                        synchronized (GoogleBillingUtil.this.connectionLock) {
                                            GoogleBillingUtil.this.connectionState = ConnectionState.READY;
                                            GoogleBillingUtil.this.reconnectAttempt = 0;
                                            GoogleBillingUtil.this.reconnectScheduled = false;
                                            z2 = GoogleBillingUtil.this.reconnectReconcileRequired;
                                            GoogleBillingUtil.this.reconnectReconcileRequired = false;
                                        }
                                        GoogleBillingUtil.this.notifyReadyAndDrain(z2);
                                    }
                                }
                            });
                        } catch (Throwable th) {
                            synchronized (this.connectionLock) {
                                this.connectionState = ConnectionState.DISCONNECTED;
                                emitSetupState(ConnectionState.DISCONNECTED, false, 6, th.getMessage(), true);
                                notifySetupFailure(6, true);
                                scheduleReconnect();
                            }
                        }
                        return false;
                    }
                    try {
                        emitSetupState(ConnectionState.DISCONNECTED, false, -1, "BillingClient is not initialized", true);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            throw th;
        }
    }
}
