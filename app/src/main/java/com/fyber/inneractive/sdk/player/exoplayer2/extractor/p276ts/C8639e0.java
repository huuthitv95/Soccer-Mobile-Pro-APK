package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import com.google.firebase.sessions.settings.RemoteSettings;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8639e0 {

    /* JADX INFO: renamed from: a */
    public final String f19933a;

    /* JADX INFO: renamed from: b */
    public final int f19934b;

    /* JADX INFO: renamed from: c */
    public final int f19935c;

    /* JADX INFO: renamed from: d */
    public int f19936d;

    /* JADX INFO: renamed from: e */
    public String f19937e;

    public C8639e0(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + RemoteSettings.FORWARD_SLASH_STRING;
        } else {
            str = "";
        }
        this.f19933a = str;
        this.f19934b = i2;
        this.f19935c = i3;
        this.f19936d = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: a */
    public final void m21174a() {
        int i = this.f19936d;
        this.f19936d = i == Integer.MIN_VALUE ? this.f19934b : i + this.f19935c;
        this.f19937e = this.f19933a + this.f19936d;
    }

    /* JADX INFO: renamed from: b */
    public final void m21175b() {
        if (this.f19936d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
