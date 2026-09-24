package com.bytedance.sdk.openadsdk.core.p190aw;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.media.InteractionType;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.adsession.media.PlayerState;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;

/* JADX INFO: loaded from: classes3.dex */
public class jbs extends xha {

    /* JADX INFO: renamed from: di */
    private boolean f9792di;

    /* JADX INFO: renamed from: fi */
    private final MediaEvents f9793fi;

    public jbs(AdSession adSession, AdEvents adEvents, View view, MediaEvents mediaEvents) {
        super(adSession, adEvents, view);
        this.f9793fi = mediaEvents;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p190aw.xha
    /* JADX INFO: renamed from: lr */
    public void mo12457lr(int i) {
        if (m12593ri()) {
            switch (i) {
                case 0:
                    this.f9793fi.pause();
                    break;
                case 1:
                    this.f9793fi.resume();
                    break;
                case 2:
                case 14:
                    this.f9793fi.skipped();
                    break;
                case 4:
                    this.f9793fi.bufferStart();
                    break;
                case 5:
                    this.f9793fi.bufferFinish();
                    break;
                case 6:
                    this.f9793fi.firstQuartile();
                    break;
                case 7:
                    this.f9793fi.midpoint();
                    break;
                case 8:
                    this.f9793fi.thirdQuartile();
                    break;
                case 9:
                    this.f9793fi.complete();
                    break;
                case 10:
                    this.f9793fi.playerStateChange(PlayerState.FULLSCREEN);
                    break;
                case 11:
                    this.f9793fi.playerStateChange(PlayerState.NORMAL);
                    break;
                case 12:
                    this.f9793fi.volumeChange(this.f9792di ? 0.0f : 1.0f);
                    break;
                case 13:
                    this.f9793fi.adUserInteraction(InteractionType.CLICK);
                    break;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.p190aw.xha
    /* JADX INFO: renamed from: ri */
    public void mo12458ri(float f, boolean z) {
        if (m12593ri()) {
            this.f9793fi.start(f, z ? 0.0f : 1.0f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.p190aw.xha
    /* JADX INFO: renamed from: ri */
    public void mo12459ri(boolean z) {
        this.f9792di = z;
        mo12457lr(12);
    }

    @Override // com.bytedance.sdk.openadsdk.core.p190aw.xha
    /* JADX INFO: renamed from: ri */
    public void mo12460ri(boolean z, float f) {
        if (z) {
            this.f9890ka = VastProperties.createVastPropertiesForSkippableMedia(f, true, Position.STANDALONE);
        } else {
            this.f9890ka = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        m12589ri(2);
    }
}
