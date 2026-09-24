package com.iab.omid.library.unity3d.adsession.media;

import com.iab.omid.library.unity3d.adsession.AdSession;
import com.iab.omid.library.unity3d.adsession.C11224a;
import com.iab.omid.library.unity3d.internal.C11239h;
import com.iab.omid.library.unity3d.utils.C11249c;
import com.iab.omid.library.unity3d.utils.C11253g;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class MediaEvents {
    private final C11224a adSession;

    private MediaEvents(C11224a c11224a) {
        this.adSession = c11224a;
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
        C11224a c11224a = (C11224a) adSession;
        C11253g.m24859a(adSession, "AdSession is null");
        C11253g.m24866f(c11224a);
        C11253g.m24863c(c11224a);
        C11253g.m24862b(c11224a);
        C11253g.m24868h(c11224a);
        MediaEvents mediaEvents = new MediaEvents(c11224a);
        c11224a.getAdSessionStatePublisher().m24804a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C11253g.m24859a(interactionType, "InteractionType is null");
        C11253g.m24858a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11249c.m24836a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().m24807a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C11253g.m24858a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24805a("bufferFinish");
    }

    public void bufferStart() {
        C11253g.m24858a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24805a("bufferStart");
    }

    public void complete() {
        C11253g.m24858a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24805a(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
    }

    public void firstQuartile() {
        C11253g.m24858a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24805a("firstQuartile");
    }

    public void midpoint() {
        C11253g.m24858a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24805a(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
    }

    public void pause() {
        C11253g.m24858a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24805a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C11253g.m24859a(playerState, "PlayerState is null");
        C11253g.m24858a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11249c.m24836a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().m24807a("playerStateChange", jSONObject);
    }

    public void resume() {
        C11253g.m24858a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24805a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C11253g.m24858a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24805a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C11253g.m24858a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11249c.m24836a(jSONObject, "duration", Float.valueOf(f));
        C11249c.m24836a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C11249c.m24836a(jSONObject, C11744X3.j.f26422P, Float.valueOf(C11239h.m24783c().m24785b()));
        this.adSession.getAdSessionStatePublisher().m24807a("start", jSONObject);
    }

    public void thirdQuartile() {
        C11253g.m24858a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24805a("thirdQuartile");
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C11253g.m24858a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11249c.m24836a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C11249c.m24836a(jSONObject, C11744X3.j.f26422P, Float.valueOf(C11239h.m24783c().m24785b()));
        this.adSession.getAdSessionStatePublisher().m24807a("volumeChange", jSONObject);
    }
}
