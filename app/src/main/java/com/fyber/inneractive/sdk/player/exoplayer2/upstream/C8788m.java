package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8820s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8821t;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.m */
/* JADX INFO: loaded from: classes4.dex */
public final class C8788m {

    /* JADX INFO: renamed from: a */
    public final C8821t f20556a = new C8821t();

    /* JADX INFO: renamed from: b */
    public int f20557b;

    /* JADX INFO: renamed from: c */
    public long f20558c;

    /* JADX INFO: renamed from: d */
    public long f20559d;

    /* JADX INFO: renamed from: e */
    public long f20560e;

    /* JADX INFO: renamed from: f */
    public long f20561f;

    /* JADX INFO: renamed from: a */
    public final synchronized void m21310a() {
        C8820s c8820s;
        int i;
        float f;
        if (this.f20557b <= 0) {
            throw new IllegalStateException();
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i2 = (int) (jElapsedRealtime - this.f20558c);
        long j = i2;
        this.f20560e += j;
        long j2 = this.f20561f;
        long j3 = this.f20559d;
        this.f20561f = j2 + j3;
        if (i2 > 0) {
            float f2 = (8000 * j3) / j;
            C8821t c8821t = this.f20556a;
            int iSqrt = (int) Math.sqrt(j3);
            if (c8821t.f20659d != 1) {
                Collections.sort(c8821t.f20657b, C8821t.f20654h);
                c8821t.f20659d = 1;
            }
            int i3 = c8821t.f20662g;
            if (i3 > 0) {
                C8820s[] c8820sArr = c8821t.f20658c;
                int i4 = i3 - 1;
                c8821t.f20662g = i4;
                c8820s = c8820sArr[i4];
            } else {
                c8820s = new C8820s();
            }
            int i5 = c8821t.f20660e;
            c8821t.f20660e = i5 + 1;
            c8820s.f20651a = i5;
            c8820s.f20652b = iSqrt;
            c8820s.f20653c = f2;
            c8821t.f20657b.add(c8820s);
            c8821t.f20661f += iSqrt;
            while (true) {
                int i6 = c8821t.f20661f;
                int i7 = c8821t.f20656a;
                i = 0;
                if (i6 <= i7) {
                    break;
                }
                int i8 = i6 - i7;
                C8820s c8820s2 = (C8820s) c8821t.f20657b.get(0);
                int i9 = c8820s2.f20652b;
                if (i9 <= i8) {
                    c8821t.f20661f -= i9;
                    c8821t.f20657b.remove(0);
                    int i10 = c8821t.f20662g;
                    if (i10 < 5) {
                        C8820s[] c8820sArr2 = c8821t.f20658c;
                        c8821t.f20662g = i10 + 1;
                        c8820sArr2[i10] = c8820s2;
                    }
                } else {
                    c8820s2.f20652b = i9 - i8;
                    c8821t.f20661f -= i8;
                }
            }
            if (this.f20560e >= 2000 || this.f20561f >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                C8821t c8821t2 = this.f20556a;
                if (c8821t2.f20659d != 0) {
                    Collections.sort(c8821t2.f20657b, C8821t.f20655i);
                    c8821t2.f20659d = 0;
                }
                float f3 = 0.5f * c8821t2.f20661f;
                int i11 = 0;
                while (true) {
                    if (i >= c8821t2.f20657b.size()) {
                        if (!c8821t2.f20657b.isEmpty()) {
                            ArrayList arrayList = c8821t2.f20657b;
                            f = ((C8820s) arrayList.get(arrayList.size() - 1)).f20653c;
                            break;
                        } else {
                            f = Float.NaN;
                            break;
                        }
                    }
                    C8820s c8820s3 = (C8820s) c8821t2.f20657b.get(i);
                    i11 += c8820s3.f20652b;
                    if (i11 >= f3) {
                        f = c8820s3.f20653c;
                        break;
                    }
                    i++;
                }
                Float.isNaN(f);
            }
        }
        int i12 = this.f20557b - 1;
        this.f20557b = i12;
        if (i12 > 0) {
            this.f20558c = jElapsedRealtime;
        }
        this.f20559d = 0L;
    }
}
