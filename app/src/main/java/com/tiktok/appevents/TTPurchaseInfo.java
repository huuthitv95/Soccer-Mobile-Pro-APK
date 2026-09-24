package com.tiktok.appevents;

import com.tiktok.util.JSON;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class TTPurchaseInfo {
    private String eventId;
    private boolean isAutoTrack;
    private boolean isSubs;
    private final JSONObject purchase;
    private final JSONObject skuDetails;

    public static class InvalidTTPurchaseInfoException extends Exception {
        public InvalidTTPurchaseInfoException(String str) {
            super(str);
        }
    }

    public TTPurchaseInfo(JSONObject purchase, JSONObject skuDetails) throws InvalidTTPurchaseInfoException {
        this.isSubs = false;
        if (!isValidPurchase(purchase)) {
            throw new InvalidTTPurchaseInfoException("Not a valid purchase object");
        }
        if (!isValidSkuDetails(skuDetails)) {
            throw new InvalidTTPurchaseInfoException("Not a valid skuDetails Object");
        }
        String string = JSON.getString(purchase, InAppPurchaseMetaData.KEY_PRODUCT_ID);
        String string2 = JSON.getString(skuDetails, InAppPurchaseMetaData.KEY_PRODUCT_ID);
        if (string != null && !string.equals(string2)) {
            throw new InvalidTTPurchaseInfoException("Product Id does not match");
        }
        this.purchase = purchase;
        this.skuDetails = skuDetails;
    }

    public TTPurchaseInfo(JSONObject purchase, JSONObject skuDetails, String eventId) throws InvalidTTPurchaseInfoException {
        this(purchase, skuDetails);
        this.eventId = eventId;
    }

    private boolean isValidPurchase(JSONObject purchase) {
        return (purchase.isNull("orderId") || purchase.isNull(InAppPurchaseMetaData.KEY_PRODUCT_ID)) ? false : true;
    }

    private boolean isValidSkuDetails(JSONObject skuDetails) {
        return (skuDetails.isNull("price") || skuDetails.isNull(InAppPurchaseMetaData.KEY_PRODUCT_ID)) ? false : true;
    }

    public String getEventId() {
        return this.eventId;
    }

    public JSONObject getPurchase() {
        return this.purchase;
    }

    public JSONObject getSkuDetails() {
        return this.skuDetails;
    }

    public boolean isAutoTrack() {
        return this.isAutoTrack;
    }

    public boolean isSubs() {
        return this.isSubs;
    }

    public void setAutoTrack(boolean autoTrack) {
        this.isAutoTrack = autoTrack;
    }

    public void setSubs(boolean subs) {
        this.isSubs = subs;
    }
}
