package com.androidgamegou.googleiap;

import android.util.Log;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.SkuDetails;
import com.facebook.internal.security.CertificateUtil;
import com.unity3d.player.UnityPlayer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MyOnQueryFinishedListener implements GoogleBillingUtil.OnQueryFinishedListener {
    @Override // com.androidgamegou.googleiap.GoogleBillingUtil.OnQueryFinishedListener
    public void onNewQuerySuccess(String str, List<ProductDetails> list) {
        Log.d("Unity", "================================ OnQuery ");
        String str2 = "Successed;";
        for (int i = 0; i < list.size(); i++) {
            String str3 = str2 + list.get(i).getProductId() + CertificateUtil.DELIMITER;
            Log.d("Unity", "getDescription: " + list.get(i).getDescription());
            Log.d("Unity", "getProductType: " + list.get(i).getProductType());
            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = list.get(i).getOneTimePurchaseOfferDetails();
            if (oneTimePurchaseOfferDetails != null) {
                str2 = str3 + oneTimePurchaseOfferDetails.getFormattedPrice() + ";";
                Log.d("Unity", "oneTime.getFormattedPrice: " + oneTimePurchaseOfferDetails.getFormattedPrice());
                Log.d("Unity", "getPriceCurrencyCode: " + oneTimePurchaseOfferDetails.getPriceCurrencyCode());
                Log.d("Unity", "getPriceAmountMicros: " + oneTimePurchaseOfferDetails.getPriceAmountMicros());
            } else {
                List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = list.get(i).getSubscriptionOfferDetails();
                if (subscriptionOfferDetails != null && !subscriptionOfferDetails.isEmpty()) {
                    for (ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2 : subscriptionOfferDetails) {
                        String str4 = (str3 + subscriptionOfferDetails2.getOfferId() + ",") + subscriptionOfferDetails2.getOfferToken() + ",";
                        Log.d("Unity", "getBasePlanId: " + subscriptionOfferDetails2.getBasePlanId());
                        Log.d("Unity", "getOfferId: " + subscriptionOfferDetails2.getOfferId());
                        List<ProductDetails.PricingPhase> pricingPhaseList = subscriptionOfferDetails2.getPricingPhases().getPricingPhaseList();
                        ProductDetails.PricingPhase pricingPhase = pricingPhaseList.get(pricingPhaseList.size() - 1);
                        str3 = str4 + pricingPhase.getFormattedPrice() + "|";
                        Log.d("Unity", "getFormattedPrice: " + pricingPhase.getFormattedPrice());
                    }
                }
                str2 = str3 + ";";
            }
        }
        Log.d("Unity", "================================ OnQuery  end");
        UnityPlayer.UnitySendMessage("IAPListener", "GetSkuDetails", str2);
    }

    @Override // com.androidgamegou.googleiap.GoogleBillingUtil.OnQueryFinishedListener
    public void onQueryError() {
        UnityPlayer.UnitySendMessage("IAPListener", "GetSkuDetails", "Error");
    }

    @Override // com.androidgamegou.googleiap.GoogleBillingUtil.OnQueryFinishedListener
    public void onQueryFail(int i) {
        UnityPlayer.UnitySendMessage("IAPListener", "GetSkuDetails", "Failed;" + String.valueOf(i));
    }

    @Override // com.androidgamegou.googleiap.GoogleBillingUtil.OnQueryFinishedListener
    public void onQuerySuccess(String str, List<SkuDetails> list) {
        String str2 = "Successed;";
        for (int i = 0; i < list.size(); i++) {
            str2 = (str2 + list.get(i).getSku() + CertificateUtil.DELIMITER) + list.get(i).getPrice() + ";";
            Log.d("Unity", "================================ OnQuery ");
            Log.d("Unity", "price: " + list.get(i).getPrice());
            Log.d("Unity", "getPriceCurrencyCode: " + list.get(i).getPriceCurrencyCode());
            Log.d("Unity", "getPriceAmountMicros: " + list.get(i).getPriceAmountMicros());
            Log.d("Unity", "getDescription: " + list.get(i).getDescription());
            Log.d("Unity", "getIntroductoryPriceAmountMicros: " + list.get(i).getIntroductoryPriceAmountMicros());
            Log.d("Unity", "getIntroductoryPrice: " + list.get(i).getIntroductoryPrice());
            Log.d("Unity", "getIntroductoryPriceCycles: " + list.get(i).getIntroductoryPriceCycles());
            Log.d("Unity", "getIntroductoryPricePeriod: " + list.get(i).getIntroductoryPricePeriod());
            Log.d("Unity", "================================ OnQuery  end");
        }
        UnityPlayer.UnitySendMessage("IAPListener", "GetSkuDetails", str2);
    }
}
