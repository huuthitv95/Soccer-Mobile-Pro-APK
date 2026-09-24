package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.C11124a;
import com.iab.omid.library.ironsrc.internal.C11140i;
import com.iab.omid.library.ironsrc.utils.C11151c;
import com.iab.omid.library.ironsrc.utils.C11155g;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class MediaEvents {
    private final C11124a adSession;

    private MediaEvents(C11124a c11124a) {
        this.adSession = c11124a;
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
        C11124a c11124a = (C11124a) adSession;
        C11155g.m24367a(adSession, "AdSession is null");
        C11155g.m24374f(c11124a);
        C11155g.m24371c(c11124a);
        C11155g.m24370b(c11124a);
        C11155g.m24376h(c11124a);
        MediaEvents mediaEvents = new MediaEvents(c11124a);
        c11124a.getAdSessionStatePublisher().m24309a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C11155g.m24367a(interactionType, "InteractionType is null");
        C11155g.m24366a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11151c.m24342a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().m24312a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C11155g.m24366a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24310a("bufferFinish");
    }

    public void bufferStart() {
        C11155g.m24366a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24310a("bufferStart");
    }

    public void complete() {
        C11155g.m24366a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24310a(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
    }

    public void firstQuartile() {
        C11155g.m24366a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24310a("firstQuartile");
    }

    public void midpoint() {
        C11155g.m24366a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24310a(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
    }

    public void pause() {
        C11155g.m24366a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24310a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C11155g.m24367a(playerState, "PlayerState is null");
        C11155g.m24366a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11151c.m24342a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().m24312a("playerStateChange", jSONObject);
    }

    public void resume() {
        C11155g.m24366a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24310a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C11155g.m24366a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24310a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C11155g.m24366a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11151c.m24342a(jSONObject, "duration", Float.valueOf(f));
        C11151c.m24342a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C11151c.m24342a(jSONObject, C11744X3.j.f26422P, Float.valueOf(C11140i.m24282c().m24284b()));
        this.adSession.getAdSessionStatePublisher().m24312a("start", jSONObject);
    }

    public void thirdQuartile() {
        C11155g.m24366a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m24310a("thirdQuartile");
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C11155g.m24366a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11151c.m24342a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C11151c.m24342a(jSONObject, C11744X3.j.f26422P, Float.valueOf(C11140i.m24282c().m24284b()));
        this.adSession.getAdSessionStatePublisher().m24312a("volumeChange", jSONObject);
    }
}
