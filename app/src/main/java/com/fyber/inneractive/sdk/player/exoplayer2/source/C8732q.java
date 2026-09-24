package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.fyber.inneractive.sdk.player.controller.C8456b0;
import com.fyber.inneractive.sdk.player.exoplayer2.C8828v;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8528c;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8569k;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C8546g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8760b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8782g;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.q */
/* JADX INFO: loaded from: classes4.dex */
public final class C8732q implements InterfaceC8736u, InterfaceC8735t {

    /* JADX INFO: renamed from: a */
    public final Uri f20407a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8782g f20408b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8569k f20409c;

    /* JADX INFO: renamed from: d */
    public final int f20410d;

    /* JADX INFO: renamed from: e */
    public final Handler f20411e;

    /* JADX INFO: renamed from: f */
    public final C8456b0 f20412f;

    /* JADX INFO: renamed from: g */
    public final C8828v f20413g = new C8828v();

    /* JADX INFO: renamed from: h */
    public InterfaceC8735t f20414h;

    /* JADX INFO: renamed from: i */
    public boolean f20415i;

    public C8732q(Uri uri, InterfaceC8782g interfaceC8782g, C8528c c8528c, int i, Handler handler, C8456b0 c8456b0) {
        this.f20407a = uri;
        this.f20408b = interfaceC8782g;
        this.f20409c = c8528c;
        this.f20410d = i;
        this.f20411e = handler;
        this.f20412f = c8456b0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8736u
    /* JADX INFO: renamed from: a */
    public final InterfaceC8734s mo21080a(int i, InterfaceC8760b interfaceC8760b, long j) {
        if (i == 0) {
            return new C8731p(this.f20407a, this.f20408b.mo20831a(), this.f20409c.mo21028a(), this.f20410d, this.f20411e, this.f20412f, this, interfaceC8760b);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8736u
    /* JADX INFO: renamed from: a */
    public final void mo21081a() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8736u
    /* JADX INFO: renamed from: a */
    public final void mo21082a(InterfaceC8734s interfaceC8734s) {
        C8731p c8731p = (C8731p) interfaceC8734s;
        c8731p.f20389i.m21286a(new RunnableC8726k(c8731p, c8731p.f20390j));
        c8731p.f20394n.removeCallbacksAndMessages(null);
        c8731p.f20380G = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8736u
    /* JADX INFO: renamed from: a */
    public final void mo21083a(InterfaceC8735t interfaceC8735t) {
        this.f20414h = interfaceC8735t;
        interfaceC8735t.mo21207a(new C8739x(-9223372036854775807L, -9223372036854775807L, 0L, 0L, false, false), null);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8735t
    /* JADX INFO: renamed from: a */
    public final void mo21207a(C8739x c8739x, C8546g c8546g) {
        boolean z = c8739x.mo21276a(0, this.f20413g, false).f20682d != -9223372036854775807L;
        if (!this.f20415i || z) {
            this.f20415i = z;
            this.f20414h.mo21207a(c8739x, null);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8736u
    /* JADX INFO: renamed from: b */
    public final void mo21084b() {
        this.f20414h = null;
    }
}
