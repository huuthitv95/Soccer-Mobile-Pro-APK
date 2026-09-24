package com.iab.omid.library.vungle.adsession.media;

import com.iab.omid.library.vungle.adsession.AdSession;
import com.iab.omid.library.vungle.adsession.C11271a;
import com.iab.omid.library.vungle.internal.C11298i;
import com.iab.omid.library.vungle.utils.C11312c;
import com.iab.omid.library.vungle.utils.C11316g;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class MediaEvents {
    private final C11271a adSession;

    private MediaEvents(C11271a c11271a) {
        this.adSession = c11271a;
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
        C11271a c11271a = (C11271a) adSession;
        C11316g.m25159a(adSession, "AdSession is null");
        C11316g.m25166f(c11271a);
        C11316g.m25163c(c11271a);
        C11316g.m25162b(c11271a);
        C11316g.m25168h(c11271a);
        MediaEvents mediaEvents = new MediaEvents(c11271a);
        c11271a.m24934d().m25090a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C11316g.m25159a(interactionType, "InteractionType is null");
        C11316g.m25158a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11312c.m25131a(jSONObject, "interactionType", interactionType);
        this.adSession.m24934d().m25093a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C11316g.m25158a(this.adSession);
        this.adSession.m24934d().m25091a("bufferFinish");
    }

    public void bufferStart() {
        C11316g.m25158a(this.adSession);
        this.adSession.m24934d().m25091a("bufferStart");
    }

    public void complete() {
        C11316g.m25158a(this.adSession);
        this.adSession.m24934d().m25091a(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
    }

    public void firstQuartile() {
        C11316g.m25158a(this.adSession);
        this.adSession.m24934d().m25091a("firstQuartile");
    }

    public void midpoint() {
        C11316g.m25158a(this.adSession);
        this.adSession.m24934d().m25091a(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
    }

    public void pause() {
        C11316g.m25158a(this.adSession);
        this.adSession.m24934d().m25091a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C11316g.m25159a(playerState, "PlayerState is null");
        C11316g.m25158a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11312c.m25131a(jSONObject, "state", playerState);
        this.adSession.m24934d().m25093a("playerStateChange", jSONObject);
    }

    public void resume() {
        C11316g.m25158a(this.adSession);
        this.adSession.m24934d().m25091a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C11316g.m25158a(this.adSession);
        this.adSession.m24934d().m25091a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C11316g.m25158a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11312c.m25131a(jSONObject, "duration", Float.valueOf(f));
        C11312c.m25131a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C11312c.m25131a(jSONObject, C11744X3.j.f26422P, Float.valueOf(C11298i.m25052c().m25054b()));
        this.adSession.m24934d().m25093a("start", jSONObject);
    }

    public void thirdQuartile() {
        C11316g.m25158a(this.adSession);
        this.adSession.m24934d().m25091a("thirdQuartile");
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C11316g.m25158a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C11312c.m25131a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C11312c.m25131a(jSONObject, C11744X3.j.f26422P, Float.valueOf(C11298i.m25052c().m25054b()));
        this.adSession.m24934d().m25093a("volumeChange", jSONObject);
    }
}
