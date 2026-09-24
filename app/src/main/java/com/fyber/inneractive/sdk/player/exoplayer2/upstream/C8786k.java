package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.ironsource.C11744X3;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.k */
/* JADX INFO: loaded from: classes4.dex */
public final class C8786k {

    /* JADX INFO: renamed from: a */
    public final Uri f20545a;

    /* JADX INFO: renamed from: b */
    public final long f20546b;

    /* JADX INFO: renamed from: c */
    public final long f20547c;

    /* JADX INFO: renamed from: d */
    public final long f20548d;

    /* JADX INFO: renamed from: e */
    public final String f20549e;

    /* JADX INFO: renamed from: f */
    public final int f20550f;

    public C8786k(Uri uri, long j, long j2, long j3, String str, int i) {
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        if (j2 < 0) {
            throw new IllegalArgumentException();
        }
        if (j3 <= 0 && j3 != -1) {
            throw new IllegalArgumentException();
        }
        this.f20545a = uri;
        this.f20546b = j;
        this.f20547c = j2;
        this.f20548d = j3;
        this.f20549e = str;
        this.f20550f = i;
    }

    public final String toString() {
        return "DataSpec[" + this.f20545a + ", " + Arrays.toString((byte[]) null) + ", " + this.f20546b + ", " + this.f20547c + ", " + this.f20548d + ", " + this.f20549e + ", " + this.f20550f + C11744X3.j.f26440e;
    }
}
