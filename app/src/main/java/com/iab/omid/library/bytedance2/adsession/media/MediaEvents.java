package com.iab.omid.library.bytedance2.adsession.media;

import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.C10970a;
import com.iab.omid.library.bytedance2.internal.C10986i;
import com.iab.omid.library.bytedance2.utils.C10996c;
import com.iab.omid.library.bytedance2.utils.C11000g;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class MediaEvents {
    private final C10970a adSession;

    private MediaEvents(C10970a c10970a) {
        this.adSession = c10970a;
    }

    private void confirmValidDuration(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    private void confirmValidVolume(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public static MediaEvents createMediaEvents(AdSession adSession) {
        C10970a c10970a = (C10970a) adSession;
        C11000g.m23601a(adSession, "AdSession is null");
        C11000g.m23608f(c10970a);
        C11000g.m23605c(c10970a);
        C11000g.m23604b(c10970a);
        C11000g.m23610h(c10970a);
        MediaEvents mediaEvents = new MediaEvents(c10970a);
        c10970a.getAdSessionStatePublisher().m23545a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C11000g.m23601a(interactionType, "InteractionType is null");
        C11000g.m23600a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C10996c.m23577a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().m23548a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C11000g.m23600a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m23546a("bufferFinish");
    }

    public void bufferStart() {
        C11000g.m23600a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m23546a("bufferStart");
    }

    public void complete() {
        C11000g.m23600a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m23546a(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
    }

    public void firstQuartile() {
        C11000g.m23600a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m23546a("firstQuartile");
    }

    public void midpoint() {
        C11000g.m23600a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m23546a(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
    }

    public void pause() {
        C11000g.m23600a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m23546a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C11000g.m23601a(playerState, "PlayerState is null");
        C11000g.m23600a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C10996c.m23577a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().m23548a("playerStateChange", jSONObject);
    }

    public void resume() {
        C11000g.m23600a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m23546a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C11000g.m23600a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m23546a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C11000g.m23600a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C10996c.m23577a(jSONObject, "duration", Float.valueOf(f));
        C10996c.m23577a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C10996c.m23577a(jSONObject, C11744X3.j.f26422P, Float.valueOf(C10986i.m23524c().m23526b()));
        this.adSession.getAdSessionStatePublisher().m23548a("start", jSONObject);
    }

    public void thirdQuartile() {
        C11000g.m23600a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m23546a("thirdQuartile");
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C11000g.m23600a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C10996c.m23577a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C10996c.m23577a(jSONObject, C11744X3.j.f26422P, Float.valueOf(C10986i.m23524c().m23526b()));
        this.adSession.getAdSessionStatePublisher().m23548a("volumeChange", jSONObject);
    }
}
