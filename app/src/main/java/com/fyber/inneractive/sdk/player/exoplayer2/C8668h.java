package com.fyber.inneractive.sdk.player.exoplayer2;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8741z;
import com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8734s;
import com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8736u;
import com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8737v;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC8748b;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC8755i;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C8754h;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C8756j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.mbridge.msdk.playercommon.exoplayer2.C13474C;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C8668h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8734s f20145a;

    /* JADX INFO: renamed from: b */
    public final Object f20146b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8737v[] f20147c;

    /* JADX INFO: renamed from: d */
    public final boolean[] f20148d;

    /* JADX INFO: renamed from: e */
    public final long f20149e;

    /* JADX INFO: renamed from: f */
    public int f20150f;

    /* JADX INFO: renamed from: g */
    public long f20151g;

    /* JADX INFO: renamed from: h */
    public boolean f20152h;

    /* JADX INFO: renamed from: i */
    public boolean f20153i;

    /* JADX INFO: renamed from: j */
    public boolean f20154j;

    /* JADX INFO: renamed from: k */
    public C8668h f20155k;

    /* JADX INFO: renamed from: l */
    public boolean f20156l;

    /* JADX INFO: renamed from: m */
    public C8756j f20157m;

    /* JADX INFO: renamed from: n */
    public final AbstractC8490a[] f20158n;

    /* JADX INFO: renamed from: o */
    public final AbstractC8490a[] f20159o;

    /* JADX INFO: renamed from: p */
    public final AbstractC8755i f20160p;

    /* JADX INFO: renamed from: q */
    public final C8516c f20161q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC8736u f20162r;

    /* JADX INFO: renamed from: s */
    public C8756j f20163s;

    public C8668h(AbstractC8490a[] abstractC8490aArr, AbstractC8490a[] abstractC8490aArr2, long j, AbstractC8755i abstractC8755i, C8516c c8516c, InterfaceC8736u interfaceC8736u, Object obj, int i, boolean z, long j2) {
        this.f20158n = abstractC8490aArr;
        this.f20159o = abstractC8490aArr2;
        this.f20149e = j;
        this.f20160p = abstractC8755i;
        this.f20161q = c8516c;
        this.f20162r = interfaceC8736u;
        obj.getClass();
        this.f20146b = obj;
        this.f20150f = i;
        this.f20152h = z;
        this.f20151g = j2;
        this.f20147c = new InterfaceC8737v[abstractC8490aArr.length];
        this.f20148d = new boolean[abstractC8490aArr.length];
        this.f20145a = interfaceC8736u.mo21080a(i, c8516c.f19088a, j2);
    }

    /* JADX INFO: renamed from: a */
    public final long m21192a(long j, boolean z, boolean[] zArr) {
        int i;
        C8754h c8754h = this.f20157m.f20447b;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= c8754h.f20443a) {
                break;
            }
            boolean[] zArr2 = this.f20148d;
            if (z || !this.f20157m.m21285a(this.f20163s, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        long jMo21072a = this.f20145a.mo21072a((AbstractC8748b[]) c8754h.f20444b.clone(), this.f20148d, this.f20147c, zArr, j);
        this.f20163s = this.f20157m;
        this.f20154j = false;
        int i3 = 0;
        while (true) {
            InterfaceC8737v[] interfaceC8737vArr = this.f20147c;
            if (i3 >= interfaceC8737vArr.length) {
                C8516c c8516c = this.f20161q;
                AbstractC8490a[] abstractC8490aArr = this.f20158n;
                C8741z c8741z = this.f20157m.f20446a;
                c8516c.f19093f = 0;
                for (int i4 = 0; i4 < abstractC8490aArr.length; i4++) {
                    if (c8754h.f20444b[i4] != null) {
                        int i5 = c8516c.f19093f;
                        int i6 = abstractC8490aArr[i4].f18923a;
                        int i7 = AbstractC8827z.f20671a;
                        if (i6 == 0) {
                            i = 16777216;
                        } else if (i6 == 1) {
                            i = C13474C.DEFAULT_AUDIO_BUFFER_SIZE;
                        } else if (i6 == 2) {
                            i = 13107200;
                        } else {
                            if (i6 != 3 && i6 != 4) {
                                throw new IllegalStateException();
                            }
                            i = 131072;
                        }
                        c8516c.f19093f = i5 + i;
                    }
                }
                c8516c.f19088a.m21308a(c8516c.f19093f);
                return jMo21072a;
            }
            if (interfaceC8737vArr[i3] != null) {
                if (c8754h.f20444b[i3] == null) {
                    throw new IllegalStateException();
                }
                this.f20154j = true;
            } else if (c8754h.f20444b[i3] != null) {
                throw new IllegalStateException();
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21193a() {
        try {
            this.f20162r.mo21082a(this.f20145a);
        } catch (RuntimeException e) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e);
        }
    }
}
