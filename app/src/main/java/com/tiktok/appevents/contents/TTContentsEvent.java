package com.tiktok.appevents.contents;

import android.text.TextUtils;
import com.tiktok.appevents.base.TTBaseEvent;
import com.tiktok.util.JSON;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class TTContentsEvent extends TTBaseEvent {

    public static class Builder extends TTBaseEvent.Builder {
        Builder(String eventName, String eventId) {
            super(eventName, eventId);
        }

        private void safeAddProperty(String key, Object value) {
            try {
                JSON.putObject(this.properties, key, value);
            } catch (Throwable unused) {
            }
        }

        @Override // com.tiktok.appevents.base.TTBaseEvent.Builder
        public TTContentsEvent build() {
            return new TTContentsEvent(this.eventName, this.properties, this.eventId);
        }

        public Builder setContentId(String contentId) {
            if (!TextUtils.isEmpty(contentId)) {
                addProperty("content_id", contentId);
            }
            return this;
        }

        public Builder setContentType(String contentType) {
            if (!TextUtils.isEmpty(contentType)) {
                addProperty("content_type", contentType);
            }
            return this;
        }

        public Builder setContents(TTContentParams... contents) {
            if (contents != null) {
                JSONArray jSONArrayBuildArr = JSON.buildArr();
                for (TTContentParams tTContentParams : contents) {
                    if (tTContentParams != null) {
                        JSON.putArr(jSONArrayBuildArr, tTContentParams.toJSONObject());
                    }
                }
                addProperty(TTContentsEventConstants.Params.EVENT_PROPERTY_CONTENTS, jSONArrayBuildArr);
            }
            return this;
        }

        public Builder setCurrency(TTContentsEventConstants.Currency currency) {
            if (currency != null) {
                addProperty("currency", currency);
            }
            return this;
        }

        public Builder setDescription(String description) {
            if (!TextUtils.isEmpty(description)) {
                addProperty("description", description);
            }
            return this;
        }

        public Builder setValue(double value) {
            safeAddProperty("value", Double.valueOf(value));
            return this;
        }
    }

    TTContentsEvent(String eventName, JSONObject properties, String eventId) {
        super(eventName, properties, eventId);
    }
}
