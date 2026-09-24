package com.tiktok.appevents;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.C12434q2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import com.tiktok.util.JSON;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.math.BigDecimal;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class TTInAppPurchaseManager {
    TTInAppPurchaseManager() {
    }

    private static JSONArray getContents(TTPurchaseInfo purchaseInfo) {
        JSONArray jSONArrayBuildArr = JSON.buildArr();
        try {
            JSONObject jSONObjectBuild = JSON.build();
            JSON.putObject(jSONObjectBuild, "content_id", JSON.getString(purchaseInfo.getPurchase(), InAppPurchaseMetaData.KEY_PRODUCT_ID));
            JSON.putObject(jSONObjectBuild, "content_type", purchaseInfo.isSubs() ? "SUB" : "SKU");
            JSON.putInt(jSONObjectBuild, FirebaseAnalytics.Param.QUANTITY, JSON.getInt(purchaseInfo.getPurchase(), FirebaseAnalytics.Param.QUANTITY));
            JSON.putDouble(jSONObjectBuild, "price", getPrice(purchaseInfo.getSkuDetails()));
            JSON.putObject(jSONObjectBuild, "title", JSON.getString(purchaseInfo.getSkuDetails(), "title"));
            JSON.putObject(jSONObjectBuild, "description", JSON.getString(purchaseInfo.getSkuDetails(), "description"));
            JSON.putObject(jSONObjectBuild, "subscription_period", JSON.getString(purchaseInfo.getSkuDetails(), "subscriptionPeriod"));
            JSON.putInt(jSONObjectBuild, "subscription_period_number", JSON.getInt(purchaseInfo.getSkuDetails(), "subscriptionPeriodNumber"));
            JSON.putObject(jSONObjectBuild, "free_trial_period", JSON.getString(purchaseInfo.getSkuDetails(), "freeTrialPeriod"));
            JSONArray jSONArrayBuildArr2 = JSON.buildArr();
            JSONObject jSONObjectBuild2 = JSON.build();
            JSON.putObject(jSONObjectBuild2, "offer_id", JSON.getString(purchaseInfo.getSkuDetails(), "offer_id"));
            JSON.putObject(jSONObjectBuild2, "type", JSON.getString(purchaseInfo.getSkuDetails(), CampaignEx.JSON_KEY_OFFER_TYPE));
            JSON.putObject(jSONObjectBuild2, "price", JSON.getString(purchaseInfo.getSkuDetails(), "price"));
            if (!TextUtils.isEmpty(JSON.getString(purchaseInfo.getSkuDetails(), "freeTrialPeriod"))) {
                JSON.putObject(jSONObjectBuild2, "payment_mode", "pay_as_you_go");
            }
            JSON.putArr(jSONArrayBuildArr2, jSONObjectBuild2);
            JSON.putObject(jSONObjectBuild, "offers", jSONArrayBuildArr2);
            JSON.putArr(jSONArrayBuildArr, jSONObjectBuild);
        } catch (Throwable unused) {
        }
        return jSONArrayBuildArr;
    }

    private static JSONObject getOrder(TTPurchaseInfo purchaseInfo) {
        JSONObject jSONObjectBuild = JSON.build();
        try {
            JSON.putObject(jSONObjectBuild, TTContentsEventConstants.Params.EVENT_PROPERTY_ORDER_ID, JSON.getString(purchaseInfo.getPurchase(), "orderId"));
            JSON.putLong(jSONObjectBuild, "order_time", JSON.getLong(purchaseInfo.getPurchase(), "purchaseTime"));
            JSON.putObject(jSONObjectBuild, "order_token", JSON.getString(purchaseInfo.getPurchase(), "token", JSON.getString(purchaseInfo.getPurchase(), "purchaseToken")));
            JSON.putObject(jSONObjectBuild, "is_auto_renewing", Boolean.valueOf(JSON.getBoolean(purchaseInfo.getPurchase(), "autoRenewing", false)));
        } catch (Throwable unused) {
        }
        return jSONObjectBuild;
    }

    private static double getPrice(JSONObject skuDetails) {
        try {
            return BigDecimal.valueOf(JSON.getLong(skuDetails, "price_amount_micros", 0L) / 1000000.0d).doubleValue();
        } catch (Throwable unused) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }

    static JSONObject getPurchaseProps(TTPurchaseInfo purchaseInfo) {
        try {
            JSONObject jSONObjectBuild = JSON.build();
            if (purchaseInfo.isAutoTrack()) {
                JSON.putObject(jSONObjectBuild, "type", "auto");
            }
            JSON.putObject(jSONObjectBuild, "currency", JSON.getString(purchaseInfo.getSkuDetails(), "price_currency_code"));
            JSON.putDouble(jSONObjectBuild, "value", getPrice(purchaseInfo.getSkuDetails()));
            JSON.putDouble(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, JSON.getInt(purchaseInfo.getPurchase(), "purchaseState", 1));
            JSONObject jSONObjectBuild2 = JSON.build();
            JSON.putObject(jSONObjectBuild2, FirebaseAnalytics.Event.PURCHASE, purchaseInfo.getPurchase());
            JSON.putObject(jSONObjectBuild2, AppLovinEventParameters.PRODUCT_IDENTIFIER, purchaseInfo.getSkuDetails());
            JSON.putObject(jSONObjectBuild, "original_json", jSONObjectBuild2);
            JSON.putObject(jSONObjectBuild, TTContentsEventConstants.Params.EVENT_PROPERTY_CONTENTS, getContents(purchaseInfo));
            JSON.putObject(jSONObjectBuild, C12434q2.f31749u, getOrder(purchaseInfo));
            return jSONObjectBuild;
        } catch (Throwable unused) {
            return null;
        }
    }
}
