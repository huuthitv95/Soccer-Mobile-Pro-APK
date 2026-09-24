package com.bytedance.sdk.openadsdk.core.p190aw;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class xha {

    /* JADX INFO: renamed from: di */
    private final AdEvents f9887di;

    /* JADX INFO: renamed from: fi */
    private final AdSession f9888fi;

    /* JADX INFO: renamed from: ik */
    protected String f9889ik;

    /* JADX INFO: renamed from: ka */
    protected VastProperties f9890ka;
    private boolean xha = false;

    /* JADX INFO: renamed from: ri */
    protected boolean f9892ri = false;

    /* JADX INFO: renamed from: lr */
    protected int f9891lr = 0;

    public xha(AdSession adSession, AdEvents adEvents, View view) {
        this.f9888fi = adSession;
        this.f9887di = adEvents;
        this.f9889ik = adSession.getAdSessionId();
        m12590ri(view);
    }

    /* JADX INFO: renamed from: ik */
    void m12586ik() {
        m12589ri(4);
    }

    /* JADX INFO: renamed from: ka */
    public void m12587ka() {
        m12589ri(3);
    }

    /* JADX INFO: renamed from: lr */
    void m12588lr() {
        m12589ri(1);
    }

    /* JADX INFO: renamed from: lr */
    void mo12457lr(int i) {
    }

    /* JADX INFO: renamed from: ri */
    void mo12458ri(float f, boolean z) {
    }

    /* JADX INFO: renamed from: ri */
    public void m12589ri(int i) {
        int i2;
        if (this.f9888fi == null || this.f9887di == null || !C3091fi.m12411ik()) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || (i2 = this.f9891lr) == 0 || i2 == 4) {
                        return;
                    }
                    this.f9888fi.finish();
                    this.f9892ri = false;
                } else {
                    if (this.xha) {
                        return;
                    }
                    int i3 = this.f9891lr;
                    if (i3 != 1 && i3 != 2) {
                        return;
                    }
                    this.f9887di.impressionOccurred();
                    this.xha = true;
                }
            } else {
                if (this.f9891lr != 0) {
                    return;
                }
                this.f9888fi.start();
                if (this.f9890ka == null) {
                    this.f9890ka = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                }
                this.f9887di.loaded(this.f9890ka);
                this.f9892ri = true;
                this.f9890ka = null;
            }
        } else {
            if (this.f9891lr != 0) {
                return;
            }
            this.f9888fi.start();
            this.f9887di.loaded();
            this.f9892ri = true;
        }
        this.f9891lr = i;
    }

    /* JADX INFO: renamed from: ri */
    void m12590ri(View view) {
        AdSession adSession;
        if (view == null || (adSession = this.f9888fi) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    /* JADX INFO: renamed from: ri */
    public void m12591ri(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.f9888fi;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12592ri(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            m12591ri((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void mo12459ri(boolean z) {
    }

    /* JADX INFO: renamed from: ri */
    public void mo12460ri(boolean z, float f) {
    }

    /* JADX INFO: renamed from: ri */
    boolean m12593ri() {
        return this.f9892ri;
    }
}
