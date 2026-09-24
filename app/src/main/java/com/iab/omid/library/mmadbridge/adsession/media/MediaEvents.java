package com.iab.omid.library.mmadbridge.adsession.media;

import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.C11175a;
import com.iab.omid.library.mmadbridge.internal.C11191i;
import com.iab.omid.library.mmadbridge.utils.C11202c;
import com.iab.omid.library.mmadbridge.utils.C11206g;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class MediaEvents {
    private final C11175a adSession;

    private MediaEvents(C11175a c11175a) {
        this.adSession = c11175a;
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
        C11175a c11175a = (C11175a) adSession;
        C11206g.m24620a(adSession, "AdSession is null");
        C11206g.m24627f(c11175a);
        C11206g.m24624c(c11175a);
        C11206g.m24623b(c11175a);
        C11206g.m24629h(c11175a);
        MediaEvents mediaEvents = new MediaEvents(c11175a);
        c11175a.getAdSessionStatePublisher().m24562a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C11206g.m24620a(interactionType, "InteractionType is null");
        C11206g.m24619a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11202c.m24595a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().m24565a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C11206g.m24619a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24563a("bufferFinish");
    }

    public void bufferStart() {
        C11206g.m24619a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24563a("bufferStart");
    }

    public void complete() {
        C11206g.m24619a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24563a(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
    }

    public void firstQuartile() {
        C11206g.m24619a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24563a("firstQuartile");
    }

    public void midpoint() {
        C11206g.m24619a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24563a(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
    }

    public void pause() {
        C11206g.m24619a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24563a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C11206g.m24620a(playerState, "PlayerState is null");
        C11206g.m24619a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11202c.m24595a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().m24565a("playerStateChange", jSONObject);
    }

    public void resume() {
        C11206g.m24619a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24563a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C11206g.m24619a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24563a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C11206g.m24619a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11202c.m24595a(jSONObject, "duration", Float.valueOf(f));
        C11202c.m24595a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C11202c.m24595a(jSONObject, C11744X3.j.f26422P, Float.valueOf(C11191i.m24535c().m24537b()));
        this.adSession.getAdSessionStatePublisher().m24565a("start", jSONObject);
    }

    public void thirdQuartile() {
        C11206g.m24619a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24563a("thirdQuartile");
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C11206g.m24619a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11202c.m24595a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C11202c.m24595a(jSONObject, C11744X3.j.f26422P, Float.valueOf(C11191i.m24535c().m24537b()));
        this.adSession.getAdSessionStatePublisher().m24565a("volumeChange", jSONObject);
    }
}
