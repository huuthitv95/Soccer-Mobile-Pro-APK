package com.tiktok.appevents.contents;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class TTAddToWishlistEvent extends TTContentsEvent {
    TTAddToWishlistEvent(String eventName, JSONObject properties, String eventId) {
        super(eventName, properties, eventId);
    }

    public static TTContentsEvent.Builder newBuilder() {
        return new TTContentsEvent.Builder(TTContentsEventConstants.ContentsEventName.EVENT_NAME_ADD_TO_WISHLIST, "");
    }

    public static TTContentsEvent.Builder newBuilder(String eventId) {
        return new TTContentsEvent.Builder(TTContentsEventConstants.ContentsEventName.EVENT_NAME_ADD_TO_WISHLIST, eventId);
    }
}
