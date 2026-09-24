package com.tiktok.appevents.contents;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class TTViewContentEvent extends TTContentsEvent {
    TTViewContentEvent(String eventName, JSONObject properties, String eventId) {
        super(eventName, properties, eventId);
    }

    public static TTContentsEvent.Builder newBuilder() {
        return new TTContentsEvent.Builder(TTContentsEventConstants.ContentsEventName.EVENT_NAME_VIEW_CONTENT, "");
    }

    public static TTContentsEvent.Builder newBuilder(String eventId) {
        return new TTContentsEvent.Builder(TTContentsEventConstants.ContentsEventName.EVENT_NAME_VIEW_CONTENT, eventId);
    }
}
