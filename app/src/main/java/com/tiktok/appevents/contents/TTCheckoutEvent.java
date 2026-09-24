package com.tiktok.appevents.contents;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class TTCheckoutEvent extends TTContentsEvent {
    TTCheckoutEvent(String eventName, JSONObject properties, String eventId) {
        super(eventName, properties, eventId);
    }

    public static TTContentsEvent.Builder newBuilder() {
        return new TTContentsEvent.Builder(TTContentsEventConstants.ContentsEventName.EVENT_NAME_CHECK_OUT, "");
    }

    public static TTContentsEvent.Builder newBuilder(String eventId) {
        return new TTContentsEvent.Builder(TTContentsEventConstants.ContentsEventName.EVENT_NAME_CHECK_OUT, eventId);
    }
}
