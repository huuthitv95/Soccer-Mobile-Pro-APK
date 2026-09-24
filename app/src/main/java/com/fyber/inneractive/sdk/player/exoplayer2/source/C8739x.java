package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8845x;
import com.fyber.inneractive.sdk.player.exoplayer2.C8828v;
import com.fyber.inneractive.sdk.player.exoplayer2.C8844w;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.x */
/* JADX INFO: loaded from: classes4.dex */
public final class C8739x extends AbstractC8845x {

    /* JADX INFO: renamed from: g */
    public static final Object f20416g = new Object();

    /* JADX INFO: renamed from: b */
    public final long f20417b;

    /* JADX INFO: renamed from: c */
    public final long f20418c;

    /* JADX INFO: renamed from: d */
    public final long f20419d;

    /* JADX INFO: renamed from: e */
    public final long f20420e;

    /* JADX INFO: renamed from: f */
    public final boolean f20421f;

    public C8739x(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f20417b = j;
        this.f20418c = j2;
        this.f20419d = j3;
        this.f20420e = j4;
        this.f20421f = z2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8845x
    /* JADX INFO: renamed from: a */
    public final int mo21274a() {
        return 1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8845x
    /* JADX INFO: renamed from: a */
    public final int mo21275a(Object obj) {
        return f20416g.equals(obj) ? 0 : -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8845x
    /* JADX INFO: renamed from: a */
    public final C8828v mo21276a(int i, C8828v c8828v, boolean z) {
        if (i < 0 || i >= 1) {
            throw new IndexOutOfBoundsException();
        }
        Object obj = z ? f20416g : null;
        long j = this.f20417b;
        long j2 = -this.f20419d;
        c8828v.f20679a = obj;
        c8828v.f20680b = obj;
        c8828v.f20681c = 0;
        c8828v.f20682d = j;
        c8828v.f20683e = j2;
        return c8828v;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8845x
    /* JADX INFO: renamed from: a */
    public final C8844w mo21277a(int i, C8844w c8844w, long j) {
        if (i < 0 || i >= 1) {
            throw new IndexOutOfBoundsException();
        }
        long j2 = this.f20420e;
        boolean z = this.f20421f;
        if (z) {
            j2 += j;
            if (j2 > this.f20418c) {
                j2 = -9223372036854775807L;
            }
        }
        long j3 = this.f20418c;
        long j4 = this.f20419d;
        c8844w.f20764a = null;
        c8844w.f20765b = z;
        c8844w.f20768e = j2;
        c8844w.f20769f = j3;
        c8844w.f20766c = 0;
        c8844w.f20767d = 0;
        c8844w.f20770g = j4;
        return c8844w;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8845x
    /* JADX INFO: renamed from: b */
    public final int mo21278b() {
        return 1;
    }
}
