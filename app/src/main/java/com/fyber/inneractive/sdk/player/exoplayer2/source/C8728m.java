package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8607o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8786k;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8801z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8806e;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.m */
/* JADX INFO: loaded from: classes4.dex */
public final class C8728m implements InterfaceC8801z {

    /* JADX INFO: renamed from: a */
    public final Uri f20359a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8783h f20360b;

    /* JADX INFO: renamed from: c */
    public final C8729n f20361c;

    /* JADX INFO: renamed from: d */
    public final C8806e f20362d;

    /* JADX INFO: renamed from: e */
    public final C8607o f20363e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f20364f;

    /* JADX INFO: renamed from: g */
    public boolean f20365g;

    /* JADX INFO: renamed from: h */
    public long f20366h;

    /* JADX INFO: renamed from: i */
    public long f20367i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C8731p f20368j;

    public C8728m(C8731p c8731p, Uri uri, InterfaceC8783h interfaceC8783h, C8729n c8729n, C8806e c8806e) {
        this.f20368j = c8731p;
        uri.getClass();
        this.f20359a = uri;
        interfaceC8783h.getClass();
        this.f20360b = interfaceC8783h;
        c8729n.getClass();
        this.f20361c = c8729n;
        this.f20362d = c8806e;
        this.f20363e = new C8607o();
        this.f20365g = true;
        this.f20367i = -1L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8801z
    /* JADX INFO: renamed from: a */
    public final boolean mo21061a() {
        return this.f20364f;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8801z
    /* JADX INFO: renamed from: b */
    public final void mo21062b() {
        this.f20364f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8801z
    public final void load() throws Throwable {
        C8527b c8527b;
        int iMo21035a = 0;
        while (iMo21035a == 0 && !this.f20364f) {
            try {
                long j = this.f20363e.f19793a;
                long jMo20829a = this.f20360b.mo20829a(new C8786k(this.f20359a, j, j, -1L, this.f20368j.f20388h, 0));
                this.f20367i = jMo20829a;
                if (jMo20829a != -1) {
                    this.f20367i = jMo20829a + j;
                }
                InterfaceC8783h interfaceC8783h = this.f20360b;
                c8527b = new C8527b(interfaceC8783h, j, this.f20367i);
                try {
                    C8729n c8729n = this.f20361c;
                    interfaceC8783h.mo20830a();
                    InterfaceC8567i interfaceC8567iM21271a = c8729n.m21271a(c8527b);
                    if (this.f20365g) {
                        interfaceC8567iM21271a.mo21036a(j, this.f20366h);
                        this.f20365g = false;
                    }
                    while (iMo21035a == 0 && !this.f20364f) {
                        C8806e c8806e = this.f20362d;
                        synchronized (c8806e) {
                            while (!c8806e.f20616a) {
                                try {
                                    c8806e.wait();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        iMo21035a = interfaceC8567iM21271a.mo21035a(c8527b, this.f20363e);
                        long j2 = c8527b.f19124c;
                        if (j2 > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED + j) {
                            this.f20362d.m21323a();
                            C8731p c8731p = this.f20368j;
                            c8731p.f20394n.post(c8731p.f20393m);
                            j = j2;
                        }
                    }
                    if (iMo21035a == 1) {
                        iMo21035a = 0;
                    } else {
                        this.f20363e.f19793a = c8527b.f19124c;
                    }
                    AbstractC8827z.m21383a(this.f20360b);
                } catch (Throwable th2) {
                    th = th2;
                    if (iMo21035a != 1 && c8527b != null) {
                        this.f20363e.f19793a = c8527b.f19124c;
                    }
                    AbstractC8827z.m21383a(this.f20360b);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c8527b = null;
            }
        }
    }
}
