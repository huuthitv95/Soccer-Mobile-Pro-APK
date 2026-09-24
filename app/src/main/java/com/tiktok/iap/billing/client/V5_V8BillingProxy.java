package com.tiktok.iap.billing.client;

import android.text.TextUtils;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchaseHistoryParams;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.appevents.TTPurchaseInfo;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import com.tiktok.appevents.edp.EDPConfig;
import com.tiktok.appevents.edp.TTEDPEventTrack;
import com.tiktok.iap.TTInAppPurchaseWrapper;
import com.tiktok.iap.billing.GPBillVersions;
import com.tiktok.iap.billing.model.TTPayData;
import com.tiktok.util.JSON;
import com.tiktok.util.TTLogger;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class V5_V8BillingProxy implements IBillingProxy {
    private static final TTLogger ttLogger = new TTLogger("BillingProxyV5", TikTokBusinessSdk.getLogLevel());
    private volatile BillingClient mBillingClient;
    private final AtomicBoolean mIsInitLoading = new AtomicBoolean(false);
    private final AtomicBoolean mInitSuccess = new AtomicBoolean(false);
    private final Map<String, TTPayData> mHistorySubs = new ConcurrentHashMap();
    private final Map<String, TTPayData> mHistoryInApp = new ConcurrentHashMap();
    private final Map<String, JSONObject> mProductDetails = new ConcurrentHashMap();
    private final PurchasesUpdatedListener mUpdateListener = new PurchasesUpdatedListener() { // from class: com.tiktok.iap.billing.client.V5_V8BillingProxy.1
        @Override // com.android.billingclient.api.PurchasesUpdatedListener
        public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
            V5_V8BillingProxy.this.sendPageShow(billingResult, list);
            V5_V8BillingProxy.this.sendPurchase(billingResult, list);
            V5_V8BillingProxy.ttLogger.info("on billing result: " + String.valueOf(billingResult), new Object[0]);
        }
    };

    V5_V8BillingProxy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkDataAndAddNeedParam(JSONObject purchase, JSONObject sku) {
        if (purchase != null && purchase.isNull("orderId")) {
            JSON.putObject(purchase, "orderId", "");
        }
        if (sku == null || !sku.isNull("price")) {
            return;
        }
        JSON.putObject(sku, "price", "");
    }

    private void doQueryProductDetails(boolean isSubs, List<String> idList) {
        if (idList == null || idList.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = idList.iterator();
        while (it.hasNext()) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductType(isSubs ? "subs" : "inapp").setProductId(it.next()).build());
        }
        this.mBillingClient.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(arrayList).build(), new ProductDetailsResponseListener() { // from class: com.tiktok.iap.billing.client.V5_V8BillingProxy.5
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public void onProductDetailsResponse(BillingResult billingResult, List<ProductDetails> list) {
                if (billingResult == null || billingResult.getResponseCode() != 0 || list == null || list.isEmpty()) {
                    return;
                }
                for (ProductDetails productDetails : list) {
                    if (productDetails != null) {
                        try {
                            JSONObject jSONObjectBuild = JSON.build(BillUtils.parserJsonFromProductDetail(productDetails.toString()));
                            if (jSONObjectBuild != null && jSONObjectBuild.length() > 0) {
                                V5_V8BillingProxy.this.checkDataAndAddNeedParam(null, jSONObjectBuild);
                                V5_V8BillingProxy.this.mProductDetails.put(productDetails.getProductId(), jSONObjectBuild);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
                V5_V8BillingProxy.this.tryUploadHistoryLog();
            }
        });
    }

    private void doQueryPurchaseHistory() {
        try {
            if (TTInAppPurchaseWrapper.autoTrackPaymentHistory && TTInAppPurchaseWrapper.canTrackINAPP()) {
                this.mBillingClient.queryPurchaseHistoryAsync(QueryPurchaseHistoryParams.newBuilder().setProductType("inapp").build(), new PurchaseHistoryResponseListener() { // from class: com.tiktok.iap.billing.client.V5_V8BillingProxy.2
                    @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
                    public void onPurchaseHistoryResponse(BillingResult billingResult, List<PurchaseHistoryRecord> list) {
                        if (TTInAppPurchaseWrapper.autoTrackPaymentHistory && TTInAppPurchaseWrapper.canTrackINAPP()) {
                            V5_V8BillingProxy.this.queryProductDetailHistory(false, list);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            ttLogger.error(th, "query h inapp error", new Object[0]);
        }
        try {
            if (TTInAppPurchaseWrapper.autoTrackPaymentHistory && TTInAppPurchaseWrapper.canTrackSUBS()) {
                this.mBillingClient.queryPurchaseHistoryAsync(QueryPurchaseHistoryParams.newBuilder().setProductType("subs").build(), new PurchaseHistoryResponseListener() { // from class: com.tiktok.iap.billing.client.V5_V8BillingProxy.3
                    @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
                    public void onPurchaseHistoryResponse(BillingResult billingResult, List<PurchaseHistoryRecord> list) {
                        if (billingResult.getResponseCode() == 0 && TTInAppPurchaseWrapper.autoTrackPaymentHistory && TTInAppPurchaseWrapper.canTrackSUBS()) {
                            V5_V8BillingProxy.this.queryProductDetailHistory(true, list);
                        }
                    }
                });
            }
        } catch (Throwable th2) {
            ttLogger.error(th2, "query h subs error", new Object[0]);
        }
    }

    private Map<String, TTPayData> filterPurchase(boolean isSubs, Map<String, TTPayData> map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    long sUBSLast = isSubs ? BillCache.getInstance().getSUBSLast() : BillCache.getInstance().getINAPPLast();
                    for (Map.Entry<String, TTPayData> entry : map.entrySet()) {
                        try {
                            TTPayData value = entry.getValue();
                            if (value != null && value.purchaseTime > sUBSLast) {
                                map2.put(entry.getKey(), entry.getValue());
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry2 : map2.entrySet()) {
                if (entry2 != null && entry2.getValue() != null) {
                    arrayList.add(entry2.getValue());
                }
            }
            Collections.sort(arrayList, new Comparator<TTPayData>() { // from class: com.tiktok.iap.billing.client.V5_V8BillingProxy.4
                @Override // java.util.Comparator
                public int compare(TTPayData o1, TTPayData o2) {
                    if (o1 == null || o2 == null) {
                        return 0;
                    }
                    return Long.valueOf(o2.purchaseTime - o1.purchaseTime).intValue();
                }
            });
            HashMap map3 = new HashMap();
            try {
                int iMin = Math.min(arrayList.size(), isSubs ? TTInAppPurchaseWrapper.autoTrackPaymentHistorySUBS : TTInAppPurchaseWrapper.autoTrackPaymentHistoryINAPP);
                for (int i = 0; i < iMin; i++) {
                    try {
                        TTPayData tTPayData = (TTPayData) arrayList.get(i);
                        if (tTPayData != null && !TextUtils.isEmpty(tTPayData.productId)) {
                            map3.put(tTPayData.productId, tTPayData);
                        }
                    } catch (Throwable unused3) {
                    }
                }
                return map3;
            } catch (Throwable unused4) {
                map2 = map3;
                return map2;
            }
        } catch (Throwable unused5) {
        }
    }

    private boolean isAutoIAPTrackEnable() {
        return TTInAppPurchaseWrapper.autoTrackPaymentEnable;
    }

    private boolean isStartSuccess() {
        return !this.mIsInitLoading.get() && this.mInitSuccess.get() && this.mBillingClient != null && this.mBillingClient.isReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void queryProductDetailHistory(boolean isSubs, List<PurchaseHistoryRecord> list) {
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                    try {
                        JSONObject jSONObjectBuild = JSON.build(purchaseHistoryRecord.getOriginalJson());
                        String string = JSON.getString(jSONObjectBuild, InAppPurchaseMetaData.KEY_PRODUCT_ID);
                        if (!TextUtils.isEmpty(string)) {
                            checkDataAndAddNeedParam(jSONObjectBuild, null);
                            TTPayData tTPayData = new TTPayData();
                            tTPayData.productId = string;
                            tTPayData.data = jSONObjectBuild;
                            tTPayData.purchaseTime = purchaseHistoryRecord.getPurchaseTime();
                            if (isSubs) {
                                this.mHistorySubs.put(string, tTPayData);
                            } else {
                                this.mHistoryInApp.put(string, tTPayData);
                            }
                            if (!this.mProductDetails.containsKey(string)) {
                                arrayList.add(string);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (arrayList.isEmpty()) {
                    tryUploadHistoryLog();
                } else {
                    doQueryProductDetails(isSubs, arrayList);
                }
            } catch (Throwable th) {
                ttLogger.error(th, "query h product details error", new Object[0]);
            }
        }
    }

    private void querySkuAndTrack(final List<String> skus, final Purchase purchase, final boolean isInAppPurchase) {
        try {
            ArrayList arrayList = new ArrayList();
            for (String str : skus) {
                if (str != null && !str.isEmpty()) {
                    arrayList.add(str);
                }
            }
            SkuDetailsParams.Builder builderNewBuilder = SkuDetailsParams.newBuilder();
            if (isInAppPurchase) {
                builderNewBuilder.setSkusList(arrayList).setType("inapp");
            } else {
                builderNewBuilder.setSkusList(arrayList).setType("subs");
            }
            this.mBillingClient.querySkuDetailsAsync(builderNewBuilder.build(), new SkuDetailsResponseListener() { // from class: com.tiktok.iap.billing.client.V5_V8BillingProxy$$ExternalSyntheticLambda0
                @Override // com.android.billingclient.api.SkuDetailsResponseListener
                public final void onSkuDetailsResponse(BillingResult billingResult, List list) {
                    this.f$0.m43160x8ef79ccf(purchase, isInAppPurchase, skus, billingResult, list);
                }
            });
        } catch (Throwable th) {
            ttLogger.error(th, "query Sku And Track error2", new Object[0]);
        }
    }

    private void sendHistoryLog(boolean isSubs, Map<String, TTPayData> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            long jMax = 0;
            for (Map.Entry<String, TTPayData> entry : map.entrySet()) {
                try {
                    String key = entry.getKey();
                    TTPayData value = entry.getValue();
                    JSONObject jSONObject = this.mProductDetails.get(key);
                    if (jSONObject != null && jSONObject.length() > 0) {
                        checkDataAndAddNeedParam(value.data, jSONObject);
                        TTPurchaseInfo tTPurchaseInfo = new TTPurchaseInfo(value.data, jSONObject);
                        tTPurchaseInfo.setAutoTrack(true);
                        tTPurchaseInfo.setSubs(isSubs);
                        arrayList.add(tTPurchaseInfo);
                        jMax = Math.max(jMax, value.purchaseTime);
                    }
                } catch (Throwable th) {
                    ttLogger.error(th, "send history error", new Object[0]);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            TikTokBusinessSdk.getAppEventLogger().trackPurchase(true, arrayList);
            if (jMax > 0) {
                if (isSubs) {
                    BillCache.getInstance().saveSUBSLast(jMax);
                } else {
                    BillCache.getInstance().saveINAPPLast(jMax);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static void sendNoSkuIapTrack(List<String> skus, Purchase purchase) {
        try {
            JSONArray jSONArrayBuildArr = JSON.buildArr();
            for (String str : skus) {
                if (str != null && !str.isEmpty()) {
                    JSONObject jSONObjectBuild = JSON.build();
                    JSON.putInt(jSONObjectBuild, FirebaseAnalytics.Param.QUANTITY, purchase.getQuantity());
                    JSON.putObject(jSONObjectBuild, "content_id", str);
                    JSON.putArr(jSONArrayBuildArr, jSONObjectBuild);
                }
            }
            JSONObject jSONObjectBuild2 = JSON.build();
            JSON.putObject(jSONObjectBuild2, TTContentsEventConstants.Params.EVENT_PROPERTY_CONTENTS, jSONArrayBuildArr);
            TikTokBusinessSdk.trackEvent(TTContentsEventConstants.ContentsEventName.EVENT_NAME_PURCHASE, jSONObjectBuild2);
        } catch (Throwable th) {
            ttLogger.error(th, "Track Purchase error", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPageShow(BillingResult billingResult, List<Purchase> list) {
        if (billingResult == null || list == null) {
            return;
        }
        try {
            if (EDPConfig.enable_pay_show_track) {
                JSONArray jSONArrayBuildArr = JSON.buildArr();
                Iterator<Purchase> it = list.iterator();
                while (it.hasNext()) {
                    JSON.putArr(jSONArrayBuildArr, JSON.build(it.next().getOriginalJson()));
                }
                TTEDPEventTrack.trackPayShow(billingResult.getResponseCode(), jSONArrayBuildArr);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPurchase(BillingResult billingResult, List<Purchase> list) {
        ArrayList<String> skus;
        if (billingResult == null || list == null || billingResult.getResponseCode() != 0 || !isAutoIAPTrackEnable()) {
            return;
        }
        for (Purchase purchase : list) {
            if (purchase != null && (skus = purchase.getSkus()) != null && !skus.isEmpty()) {
                querySkuAndTrack(skus, purchase, true);
            }
        }
    }

    private void tryCreateAndStartBillingClient() {
        if (isStartSuccess()) {
            return;
        }
        this.mIsInitLoading.set(true);
        try {
            this.mBillingClient = BillingClient.newBuilder(TikTokBusinessSdk.getApplicationContext()).setListener(this.mUpdateListener).enablePendingPurchases().build();
            this.mBillingClient.startConnection(new BillingClientStateListener() { // from class: com.tiktok.iap.billing.client.V5_V8BillingProxy.6
                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingServiceDisconnected() {
                    V5_V8BillingProxy.this.mIsInitLoading.set(false);
                    V5_V8BillingProxy.this.mInitSuccess.set(false);
                }

                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingSetupFinished(BillingResult billingResult) {
                    V5_V8BillingProxy.this.mIsInitLoading.set(false);
                    V5_V8BillingProxy.this.mInitSuccess.set(billingResult.getResponseCode() == 0);
                }
            });
        } catch (Throwable th) {
            ttLogger.error(th, "billing client init error", new Object[0]);
            this.mIsInitLoading.set(false);
            this.mInitSuccess.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryUploadHistoryLog() {
        if (TTInAppPurchaseWrapper.autoTrackPaymentHistory) {
            if (this.mHistorySubs.isEmpty() && this.mHistoryInApp.isEmpty() && this.mProductDetails.isEmpty()) {
                return;
            }
            try {
                if (TTInAppPurchaseWrapper.canTrackSUBS()) {
                    sendHistoryLog(true, filterPurchase(true, new HashMap(this.mHistorySubs)));
                }
            } catch (Throwable unused) {
            }
            if (TTInAppPurchaseWrapper.canTrackINAPP()) {
                sendHistoryLog(false, filterPurchase(false, new HashMap(this.mHistoryInApp)));
            }
            this.mHistorySubs.clear();
            this.mHistoryInApp.clear();
        }
    }

    @Override // com.tiktok.iap.billing.client.IBillingProxy
    public GPBillVersions.GPBillingVer getVersion() {
        return GPBillVersions.GPBillingVer.V5_V8;
    }

    @Override // com.tiktok.iap.billing.client.IBillingProxy
    public void init() {
        tryCreateAndStartBillingClient();
    }

    /* JADX INFO: renamed from: lambda$querySkuAndTrack$0$com-tiktok-iap-billing-client-V5_V8BillingProxy */
    /* synthetic */ void m43160x8ef79ccf(final Purchase purchase, final boolean isInAppPurchase, final List skus, BillingResult billingResult, List skuDetailsList) {
        if (billingResult != null) {
            try {
                if (billingResult.getResponseCode() == 0 && skuDetailsList != null) {
                    if (skuDetailsList.size() <= 0) {
                        if (isInAppPurchase) {
                            querySkuAndTrack(skus, purchase, false);
                            return;
                        } else {
                            sendNoSkuIapTrack(skus, purchase);
                            return;
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    try {
                        Iterator it = skuDetailsList.iterator();
                        while (it.hasNext()) {
                            TTPurchaseInfo tTPurchaseInfo = new TTPurchaseInfo(JSON.build(purchase.getOriginalJson()), JSON.build(((SkuDetails) it.next()).getOriginalJson()));
                            tTPurchaseInfo.setAutoTrack(true);
                            tTPurchaseInfo.setSubs(true ^ isInAppPurchase);
                            arrayList.add(tTPurchaseInfo);
                        }
                        TikTokBusinessSdk.trackGooglePlayPurchase(arrayList);
                        return;
                    } catch (Throwable th) {
                        ttLogger.error(th, "query Sku And Track google play purchase error", new Object[0]);
                        return;
                    }
                }
            } catch (Throwable th2) {
                ttLogger.error(th2, "query Sku And Track error", new Object[0]);
                return;
            }
        }
        sendNoSkuIapTrack(skus, purchase);
    }

    @Override // com.tiktok.iap.billing.client.IBillingProxy
    public void queryPurchaseHistory() {
        if (TTInAppPurchaseWrapper.autoTrackPaymentHistory) {
            if (!isStartSuccess()) {
                tryCreateAndStartBillingClient();
                return;
            }
            try {
                doQueryPurchaseHistory();
                TTInAppPurchaseWrapper.hasReportedHistoryInLife = true;
            } catch (Throwable unused) {
            }
        }
    }
}
