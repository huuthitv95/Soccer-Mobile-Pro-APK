package com.tiktok.appevents;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Base64;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class TTAppEvent implements Serializable {
    private static final AtomicLong counter = new AtomicLong(new Date().getTime());
    private static final long serialVersionUID = 2;
    private String eventId;
    private String eventName;
    private Boolean isEdp;
    private String propertiesJson;
    private String screenShot;
    private List<String> tiktokAppIds;
    private Date timeStamp;
    private final TTAppEventType type;
    private final Long uniqueId;
    private final TTUserInfo userInfo;

    public enum TTAppEventType {
        track,
        identify
    }

    TTAppEvent(TTAppEventType type, String eventName, String propertiesJson, String eventId, String[] ttAppId) {
        this(type, eventName, new Date(), propertiesJson, eventId, ttAppId);
    }

    TTAppEvent(TTAppEventType type, String eventName, Date timeStamp, String propertiesJson, String eventId, String[] ttAppId) {
        this.tiktokAppIds = new ArrayList();
        this.type = type;
        this.eventName = eventName;
        this.timeStamp = timeStamp;
        this.propertiesJson = propertiesJson;
        this.eventId = eventId;
        this.uniqueId = Long.valueOf(counter.getAndIncrement());
        this.userInfo = TTUserInfo.sharedInstance.m44668clone();
        if (ttAppId == null || ttAppId.length <= 0) {
            return;
        }
        for (String str : ttAppId) {
            this.tiktokAppIds.add(str);
        }
    }

    public Boolean getEdp() {
        return this.isEdp;
    }

    public String getEventId() {
        return this.eventId;
    }

    public String getEventName() {
        return this.eventName;
    }

    public String getPropertiesJson() {
        return this.propertiesJson;
    }

    public String getScreenShot() {
        return this.screenShot;
    }

    public List<String> getTiktokAppIds() {
        return this.tiktokAppIds;
    }

    public Date getTimeStamp() {
        return this.timeStamp;
    }

    public String getType() {
        return this.type.name();
    }

    public Long getUniqueId() {
        return this.uniqueId;
    }

    public TTUserInfo getUserInfo() {
        return this.userInfo;
    }

    public void setEdp(Boolean edp) {
        this.isEdp = edp;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setPropertiesJson(String propertiesJson) {
        this.propertiesJson = propertiesJson;
    }

    public void setScreenShot() {
        try {
            View decorView = TTLifecycleListener.getActivityRef().get().getWindow().getDecorView();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Bitmap.Config.RGB_565);
            decorView.draw(new Canvas(bitmapCreateBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 5, byteArrayOutputStream);
            this.screenShot = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (Throwable unused) {
        }
    }

    public void setTiktokAppIds(List<String> tiktokAppIds) {
        this.tiktokAppIds = tiktokAppIds;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String toString() {
        return "TTAppEvent{eventName='" + this.eventName + "', timeStamp=" + this.timeStamp + ", propertiesJson='" + this.propertiesJson + "', eventId='" + this.eventId + "', uniqueId=" + this.uniqueId + ", tiktokAppIds=" + this.tiktokAppIds + AbstractJsonLexerKt.END_OBJ;
    }
}
