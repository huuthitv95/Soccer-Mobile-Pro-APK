package com.iab.omid.library.chartboost.adsession.media;

import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.C11021a;
import com.iab.omid.library.chartboost.internal.C11037i;
import com.iab.omid.library.chartboost.utils.C11048c;
import com.iab.omid.library.chartboost.utils.C11052g;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class MediaEvents {
    private final C11021a adSession;

    private MediaEvents(C11021a c11021a) {
        this.adSession = c11021a;
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
        C11021a c11021a = (C11021a) adSession;
        C11052g.m23858a(adSession, "AdSession is null");
        C11052g.m23865f(c11021a);
        C11052g.m23862c(c11021a);
        C11052g.m23861b(c11021a);
        C11052g.m23867h(c11021a);
        MediaEvents mediaEvents = new MediaEvents(c11021a);
        c11021a.m23678d().m23799a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C11052g.m23858a(interactionType, "InteractionType is null");
        C11052g.m23857a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11048c.m23833a(jSONObject, "interactionType", interactionType);
        this.adSession.m23678d().m23802a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C11052g.m23857a(this.adSession);
        this.adSession.m23678d().m23800a("bufferFinish");
    }

    public void bufferStart() {
        C11052g.m23857a(this.adSession);
        this.adSession.m23678d().m23800a("bufferStart");
    }

    public void complete() {
        C11052g.m23857a(this.adSession);
        this.adSession.m23678d().m23800a(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
    }

    public void firstQuartile() {
        C11052g.m23857a(this.adSession);
        this.adSession.m23678d().m23800a("firstQuartile");
    }

    public void midpoint() {
        C11052g.m23857a(this.adSession);
        this.adSession.m23678d().m23800a(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
    }

    public void pause() {
        C11052g.m23857a(this.adSession);
        this.adSession.m23678d().m23800a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C11052g.m23858a(playerState, "PlayerState is null");
        C11052g.m23857a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11048c.m23833a(jSONObject, "state", playerState);
        this.adSession.m23678d().m23802a("playerStateChange", jSONObject);
    }

    public void resume() {
        C11052g.m23857a(this.adSession);
        this.adSession.m23678d().m23800a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C11052g.m23857a(this.adSession);
        this.adSession.m23678d().m23800a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C11052g.m23857a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11048c.m23833a(jSONObject, "duration", Float.valueOf(f));
        C11048c.m23833a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C11048c.m23833a(jSONObject, C11744X3.j.f26422P, Float.valueOf(C11037i.m23772c().m23774b()));
        this.adSession.m23678d().m23802a("start", jSONObject);
    }

    public void thirdQuartile() {
        C11052g.m23857a(this.adSession);
        this.adSession.m23678d().m23800a("thirdQuartile");
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C11052g.m23857a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11048c.m23833a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C11048c.m23833a(jSONObject, C11744X3.j.f26422P, Float.valueOf(C11037i.m23772c().m23774b()));
        this.adSession.m23678d().m23802a("volumeChange", jSONObject);
    }
}
