package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8619l {

    /* JADX INFO: renamed from: a */
    public C8613f f19833a;

    /* JADX INFO: renamed from: b */
    public InterfaceC8629r f19834b;

    /* JADX INFO: renamed from: c */
    public InterfaceC8568j f19835c;

    /* JADX INFO: renamed from: d */
    public InterfaceC8615h f19836d;

    /* JADX INFO: renamed from: e */
    public long f19837e;

    /* JADX INFO: renamed from: f */
    public long f19838f;

    /* JADX INFO: renamed from: g */
    public long f19839g;

    /* JADX INFO: renamed from: h */
    public int f19840h;

    /* JADX INFO: renamed from: i */
    public int f19841i;

    /* JADX INFO: renamed from: j */
    public C8617j f19842j;

    /* JADX INFO: renamed from: k */
    public long f19843k;

    /* JADX INFO: renamed from: l */
    public boolean f19844l;

    /* JADX INFO: renamed from: m */
    public boolean f19845m;

    /* JADX INFO: renamed from: a */
    public abstract long mo21151a(C8815n c8815n);

    /* JADX INFO: renamed from: a */
    public void mo21157a(long j) {
        this.f19839g = j;
    }

    /* JADX INFO: renamed from: a */
    public void mo21152a(boolean z) {
        if (z) {
            this.f19842j = new C8617j();
            this.f19838f = 0L;
            this.f19840h = 0;
        } else {
            this.f19840h = 1;
        }
        this.f19837e = -1L;
        this.f19839g = 0L;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo21153a(C8815n c8815n, long j, C8617j c8617j);
}
