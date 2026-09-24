package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8740y;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8748b {

    /* JADX INFO: renamed from: a */
    public final C8740y f20434a;

    /* JADX INFO: renamed from: b */
    public final int f20435b;

    /* JADX INFO: renamed from: c */
    public final int[] f20436c;

    /* JADX INFO: renamed from: d */
    public final C8708o[] f20437d;

    /* JADX INFO: renamed from: e */
    public final long[] f20438e;

    /* JADX INFO: renamed from: f */
    public int f20439f;

    public AbstractC8748b(C8740y c8740y, int... iArr) {
        if (iArr.length <= 0) {
            throw new IllegalStateException();
        }
        c8740y.getClass();
        this.f20434a = c8740y;
        int length = iArr.length;
        this.f20435b = length;
        this.f20437d = new C8708o[length];
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f20437d[i2] = c8740y.f20423b[iArr[i2]];
        }
        Arrays.sort(this.f20437d, new C8747a());
        this.f20436c = new int[this.f20435b];
        while (true) {
            int i3 = this.f20435b;
            if (i >= i3) {
                this.f20438e = new long[i3];
                return;
            } else {
                this.f20436c[i] = c8740y.m21279a(this.f20437d[i]);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo21064a();

    /* JADX INFO: renamed from: a */
    public final boolean m21282a(int i) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f20438e[i] > jElapsedRealtime;
        int i2 = 0;
        while (i2 < this.f20435b && !z) {
            z = i2 != i && this.f20438e[i2] <= jElapsedRealtime;
            i2++;
        }
        if (!z) {
            return false;
        }
        long[] jArr = this.f20438e;
        jArr[i] = Math.max(jArr[i], jElapsedRealtime + 60000);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo21065b();

    /* JADX INFO: renamed from: c */
    public abstract int mo21066c();

    /* JADX INFO: renamed from: d */
    public abstract void mo21067d();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC8748b abstractC8748b = (AbstractC8748b) obj;
            if (this.f20434a == abstractC8748b.f20434a && Arrays.equals(this.f20436c, abstractC8748b.f20436c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f20439f == 0) {
            this.f20439f = Arrays.hashCode(this.f20436c) + (System.identityHashCode(this.f20434a) * 31);
        }
        return this.f20439f;
    }
}
