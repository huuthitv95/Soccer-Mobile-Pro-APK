package com.iab.omid.library.fyber.adsession.media;

import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.C11073a;
import com.iab.omid.library.fyber.internal.C11089i;
import com.iab.omid.library.fyber.utils.C11100c;
import com.iab.omid.library.fyber.utils.C11104g;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class MediaEvents {
    private final C11073a adSession;

    private MediaEvents(C11073a c11073a) {
        this.adSession = c11073a;
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
        C11073a c11073a = (C11073a) adSession;
        C11104g.m24114a(adSession, "AdSession is null");
        C11104g.m24121f(c11073a);
        C11104g.m24118c(c11073a);
        C11104g.m24117b(c11073a);
        C11104g.m24123h(c11073a);
        MediaEvents mediaEvents = new MediaEvents(c11073a);
        c11073a.m23939d().m24056a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C11104g.m24114a(interactionType, "InteractionType is null");
        C11104g.m24113a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11100c.m24089a(jSONObject, "interactionType", interactionType);
        this.adSession.m23939d().m24059a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C11104g.m24113a(this.adSession);
        this.adSession.m23939d().m24057a("bufferFinish");
    }

    public void bufferStart() {
        C11104g.m24113a(this.adSession);
        this.adSession.m23939d().m24057a("bufferStart");
    }

    public void complete() {
        C11104g.m24113a(this.adSession);
        this.adSession.m23939d().m24057a(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
    }

    public void firstQuartile() {
        C11104g.m24113a(this.adSession);
        this.adSession.m23939d().m24057a("firstQuartile");
    }

    public void midpoint() {
        C11104g.m24113a(this.adSession);
        this.adSession.m23939d().m24057a(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
    }

    public void pause() {
        C11104g.m24113a(this.adSession);
        this.adSession.m23939d().m24057a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C11104g.m24114a(playerState, "PlayerState is null");
        C11104g.m24113a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11100c.m24089a(jSONObject, "state", playerState);
        this.adSession.m23939d().m24059a("playerStateChange", jSONObject);
    }

    public void resume() {
        C11104g.m24113a(this.adSession);
        this.adSession.m23939d().m24057a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C11104g.m24113a(this.adSession);
        this.adSession.m23939d().m24057a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C11104g.m24113a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11100c.m24089a(jSONObject, "duration", Float.valueOf(f));
        C11100c.m24089a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C11100c.m24089a(jSONObject, C11744X3.j.f26422P, Float.valueOf(C11089i.m24029c().m24031b()));
        this.adSession.m23939d().m24059a("start", jSONObject);
    }

    public void thirdQuartile() {
        C11104g.m24113a(this.adSession);
        this.adSession.m23939d().m24057a("thirdQuartile");
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C11104g.m24113a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11100c.m24089a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C11100c.m24089a(jSONObject, C11744X3.j.f26422P, Float.valueOf(C11089i.m24029c().m24031b()));
        this.adSession.m23939d().m24059a("volumeChange", jSONObject);
    }
}
