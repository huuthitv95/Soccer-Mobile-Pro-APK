package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.C10919a;
import com.iab.omid.library.applovin.internal.C10935i;
import com.iab.omid.library.applovin.utils.C10946c;
import com.iab.omid.library.applovin.utils.C10950g;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class MediaEvents {
    private final C10919a adSession;

    private MediaEvents(C10919a c10919a) {
        this.adSession = c10919a;
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
        C10919a c10919a = (C10919a) adSession;
        C10950g.m23357a(adSession, "AdSession is null");
        C10950g.m23364f(c10919a);
        C10950g.m23361c(c10919a);
        C10950g.m23360b(c10919a);
        C10950g.m23366h(c10919a);
        MediaEvents mediaEvents = new MediaEvents(c10919a);
        c10919a.m23182d().m23299a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C10950g.m23357a(interactionType, "InteractionType is null");
        C10950g.m23356a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C10946c.m23332a(jSONObject, "interactionType", interactionType);
        this.adSession.m23182d().m23302a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C10950g.m23356a(this.adSession);
        this.adSession.m23182d().m23300a("bufferFinish");
    }

    public void bufferStart() {
        C10950g.m23356a(this.adSession);
        this.adSession.m23182d().m23300a("bufferStart");
    }

    public void complete() {
        C10950g.m23356a(this.adSession);
        this.adSession.m23182d().m23300a(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
    }

    public void firstQuartile() {
        C10950g.m23356a(this.adSession);
        this.adSession.m23182d().m23300a("firstQuartile");
    }

    public void midpoint() {
        C10950g.m23356a(this.adSession);
        this.adSession.m23182d().m23300a(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
    }

    public void pause() {
        C10950g.m23356a(this.adSession);
        this.adSession.m23182d().m23300a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C10950g.m23357a(playerState, "PlayerState is null");
        C10950g.m23356a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C10946c.m23332a(jSONObject, "state", playerState);
        this.adSession.m23182d().m23302a("playerStateChange", jSONObject);
    }

    public void resume() {
        C10950g.m23356a(this.adSession);
        this.adSession.m23182d().m23300a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C10950g.m23356a(this.adSession);
        this.adSession.m23182d().m23300a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C10950g.m23356a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C10946c.m23332a(jSONObject, "duration", Float.valueOf(f));
        C10946c.m23332a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C10946c.m23332a(jSONObject, C11744X3.j.f26422P, Float.valueOf(C10935i.m23272c().m23274b()));
        this.adSession.m23182d().m23302a("start", jSONObject);
    }

    public void thirdQuartile() {
        C10950g.m23356a(this.adSession);
        this.adSession.m23182d().m23300a("thirdQuartile");
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C10950g.m23356a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C10946c.m23332a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C10946c.m23332a(jSONObject, C11744X3.j.f26422P, Float.valueOf(C10935i.m23272c().m23274b()));
        this.adSession.m23182d().m23302a("volumeChange", jSONObject);
    }
}
