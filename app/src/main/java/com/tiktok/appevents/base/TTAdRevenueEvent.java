package com.tiktok.appevents.base;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class TTAdRevenueEvent extends TTBaseEvent {
    public TTAdRevenueEvent(String eventName, JSONObject properties, String eventId) {
        super(eventName, properties, eventId);
    }

    public static TTBaseEvent.Builder newBuilder(JSONObject adRevenueJson) {
        TTBaseEvent.Builder builder = new TTBaseEvent.Builder(EventName.IMPRESSION_LEVEL_AD_REVENUE.toString());
        builder.addProperty("ad_revenue", adRevenueJson);
        return builder;
    }

    public static TTBaseEvent.Builder newBuilder(JSONObject adRevenueJson, String eventId) {
        TTBaseEvent.Builder builder = new TTBaseEvent.Builder(EventName.IMPRESSION_LEVEL_AD_REVENUE.toString(), eventId);
        builder.addProperty("ad_revenue", adRevenueJson);
        return builder;
    }
}
