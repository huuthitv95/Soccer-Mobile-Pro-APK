package com.androidgamegou.googleiap;

import com.android.billingclient.api.Purchase;
import com.unity3d.player.UnityPlayer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MyOnPurchaseFinishedListener implements GoogleBillingUtil.OnPurchaseFinishedListener {
    private String safe(String str) {
        return str == null ? "" : str;
    }

    private void sendPurchases(String str, List<Purchase> list) {
        if (list == null) {
            return;
        }
        for (Purchase purchase : list) {
            List<String> products = purchase.getProducts();
            if (products == null || products.isEmpty()) {
                products = purchase.getSkus();
            }
            UnityPlayer.UnitySendMessage("IAPListener", "GooglePayResultMessgae", str + ";" + safe((products == null || products.isEmpty()) ? "" : products.get(0)) + ";" + safe(purchase.getSignature()) + ";" + safe(purchase.getOriginalJson()) + ";" + safe(purchase.getPurchaseToken()) + ";" + purchase.getPurchaseState());
        }
    }

    @Override // com.androidgamegou.googleiap.GoogleBillingUtil.OnPurchaseFinishedListener
    public void onPurchaseError() {
        UnityPlayer.UnitySendMessage("IAPListener", "GooglePayResultMessgae", "Error");
    }

    @Override // com.androidgamegou.googleiap.GoogleBillingUtil.OnPurchaseFinishedListener
    public void onPurchaseFail(int i) {
        UnityPlayer.UnitySendMessage("IAPListener", "GooglePayResultMessgae", "Failed;" + i);
    }

    @Override // com.androidgamegou.googleiap.GoogleBillingUtil.OnPurchaseFinishedListener
    public void onPurchasePending(List<Purchase> list) {
        sendPurchases("Pending", list);
    }

    @Override // com.androidgamegou.googleiap.GoogleBillingUtil.OnPurchaseFinishedListener
    public void onPurchaseSuccess(List<Purchase> list) {
        sendPurchases("Success", list);
    }
}
