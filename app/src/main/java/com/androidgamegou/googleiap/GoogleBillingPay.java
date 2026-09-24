package com.androidgamegou.googleiap;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.util.Log;
import com.unity3d.player.UnityPlayer;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public class GoogleBillingPay {
    private static final String TAG = "GoogleBillingPay";
    private static GoogleBillingUtil googleBillingUtil;
    private static Activity unityActivity;

    public static void AcknowledgeOrders(String str) throws Throwable {
        if (hasInitializedUtil()) {
            googleBillingUtil.acknowledgePurchase(str);
        }
    }

    public static void AcknowledgeOrders(String str, String str2) throws Throwable {
        if (hasInitializedUtil()) {
            googleBillingUtil.acknowledgePurchase(str, str2);
        }
    }

    public static void ConsumOrders(String str) throws Throwable {
        ConsumeInAppPurchase(str);
    }

    public static void ConsumOrders(String str, String str2) throws Throwable {
        ConsumeInAppPurchase(str, str2);
    }

    public static void ConsumeInAppPurchase(String str) throws Throwable {
        if (hasInitializedUtil()) {
            googleBillingUtil.consumeAsync(str);
        }
    }

    public static void ConsumeInAppPurchase(String str, String str2) throws Throwable {
        if (hasInitializedUtil()) {
            googleBillingUtil.consumeAsync(str, str2);
        }
    }

    public static String GetPublicPath(String str) {
        return Environment.getExternalStoragePublicDirectory(str).getAbsolutePath();
    }

    public static boolean GetPurposeConsents() {
        Activity activity = unityActivity;
        if (activity == null) {
            return true;
        }
        String string = PreferenceManager.getDefaultSharedPreferences(activity.getApplicationContext()).getString("IABTCF_PurposeConsents", "");
        return string.isEmpty() || string.charAt(0) == '1';
    }

    public static byte[] GetRawData(int i) {
        Activity activity = unityActivity;
        if (activity == null) {
            return null;
        }
        try {
            InputStream inputStreamOpenRawResource = activity.getResources().openRawResource(i);
            try {
                int iAvailable = inputStreamOpenRawResource.available();
                byte[] bArr = new byte[iAvailable];
                int i2 = 0;
                while (i2 < iAvailable) {
                    int i3 = inputStreamOpenRawResource.read(bArr, i2, iAvailable - i2);
                    if (i3 < 0) {
                        break;
                    }
                    i2 += i3;
                }
                if (inputStreamOpenRawResource != null) {
                    inputStreamOpenRawResource.close();
                }
                return bArr;
            } catch (Throwable th) {
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            Log.e(TAG, "Unable to read raw resource", e);
            return null;
        }
    }

    public static void Intial(Activity activity, String str, String str2) throws Throwable {
        GoogleBillingUtil googleBillingUtil2 = GoogleBillingUtil.getInstance();
        googleBillingUtil2.inAppSKUS = splitSkuList(str);
        googleBillingUtil2.subsSKUS = splitSkuList(str2);
        unityActivity = activity;
        GoogleBillingUtil onStartSetupFinishedListener = googleBillingUtil2.setOnPurchaseFinishedListener(new MyOnPurchaseFinishedListener()).setOnQueryFinishedListener(new MyOnQueryFinishedListener()).setOnStartSetupFinishedListener(new MyOnStartSetupFinishedListener());
        googleBillingUtil = onStartSetupFinishedListener;
        if (activity == null) {
            UnityPlayer.UnitySendMessage("IAPListener", "GooglePayResultMessgae", "Failed;5");
        } else {
            onStartSetupFinishedListener.build(activity.getApplicationContext());
        }
    }

    public static boolean IsReady() {
        return hasInitializedUtil() && googleBillingUtil.isReady();
    }

    public static void OpenGooglePlayUrl(String str, String str2) {
        if (unityActivity == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setPackage("com.android.vending");
            unityActivity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            unityActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
        }
    }

    public static void Pay(String str, String str2) throws Throwable {
        if (!hasInitializedUtil()) {
            UnityPlayer.UnitySendMessage("IAPListener", "GooglePayResultMessgae", "Nohave Intail");
            return;
        }
        String skuType = googleBillingUtil.getSkuType(str);
        if ("inapp".equals(skuType)) {
            googleBillingUtil.purchaseInApp(unityActivity, str);
        } else if ("subs".equals(skuType)) {
            googleBillingUtil.purchaseSubs(unityActivity, str, str2);
        } else {
            googleBillingUtil.reportPurchaseError(str, 5, "Unknown product id or product type");
        }
    }

    public static void QueryInventoryInApp() throws Throwable {
        if (hasInitializedUtil()) {
            googleBillingUtil.queryInventoryInApp();
            googleBillingUtil.queryInventorySubs();
        }
    }

    public static void QueryPurchases(String str, String str2) throws Throwable {
        if (hasInitializedUtil()) {
            if ("inapp".equals(str2)) {
                googleBillingUtil.queryPurchasesInApp(str);
            } else if ("subs".equals(str2)) {
                googleBillingUtil.queryPurchasesSubs(str);
            } else {
                googleBillingUtil.reportQueryError(str2, str, 5, "Unknown product type");
            }
        }
    }

    public static void QueryPurchasesInApp() throws Throwable {
        QueryPurchasesInApp("");
    }

    public static void QueryPurchasesInApp(String str) throws Throwable {
        if (hasInitializedUtil()) {
            googleBillingUtil.queryAllPurchases(str);
        }
    }

    public static void QuerySkuDetail(String str) throws Throwable {
        if (hasInitializedUtil()) {
            googleBillingUtil.QuerySkuDetail(str);
        }
    }

    public static void SetConsumables(String str) {
        HashSet hashSet = new HashSet();
        if (str != null && !str.isEmpty()) {
            for (String str2 : str.split(";")) {
                if (str2 != null && !str2.trim().isEmpty()) {
                    hashSet.add(str2.trim());
                }
            }
        }
        GoogleBillingUtil.SetConsumablesIds(hashSet);
    }

    private static boolean hasInitializedUtil() {
        return googleBillingUtil != null;
    }

    public static void setIsAutoConsumeAsync(boolean z) {
        if (hasInitializedUtil()) {
            googleBillingUtil.setIsAutoConsumeAsync(z);
        }
    }

    private static String[] splitSkuList(String str) {
        if (str == null || str.trim().isEmpty()) {
            return new String[0];
        }
        String[] strArrSplit = str.split(";");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (str2 != null && !str2.trim().isEmpty()) {
                arrayList.add(str2.trim());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
