package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8740y;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC8748b;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C8544e extends AbstractC8748b {

    /* JADX INFO: renamed from: g */
    public int f19203g;

    public C8544e(C8740y c8740y, int[] iArr) {
        super(c8740y, iArr);
        int i = 0;
        C8708o c8708o = c8740y.f20423b[0];
        while (i < this.f20435b) {
            if (this.f20437d[i] == c8708o) {
                this.f19203g = i;
            }
            i++;
        }
        i = -1;
        this.f19203g = i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC8748b
    /* JADX INFO: renamed from: a */
    public final int mo21064a() {
        return this.f19203g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC8748b
    /* JADX INFO: renamed from: b */
    public final Object mo21065b() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC8748b
    /* JADX INFO: renamed from: c */
    public final int mo21066c() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC8748b
    /* JADX INFO: renamed from: d */
    public final void mo21067d() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f20438e[this.f19203g] > jElapsedRealtime) {
            for (int i = this.f20435b - 1; i >= 0; i--) {
                if (this.f20438e[i] <= jElapsedRealtime) {
                    this.f19203g = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
