package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.v */
/* JADX INFO: loaded from: classes4.dex */
public final class C8823v {

    /* JADX INFO: renamed from: a */
    public long f20667a;

    /* JADX INFO: renamed from: b */
    public long f20668b;

    /* JADX INFO: renamed from: c */
    public volatile long f20669c = -9223372036854775807L;

    public C8823v(long j) {
        m21372c(j);
    }

    /* JADX INFO: renamed from: a */
    public final long m21370a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f20669c != -9223372036854775807L) {
            this.f20669c = j;
        } else {
            long j2 = this.f20667a;
            if (j2 != Long.MAX_VALUE) {
                this.f20668b = j2 - j;
            }
            synchronized (this) {
                this.f20669c = j;
                notifyAll();
            }
        }
        return j + this.f20668b;
    }

    /* JADX INFO: renamed from: b */
    public final long m21371b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f20669c != -9223372036854775807L) {
            long j2 = (this.f20669c * 90000) / 1000000;
            long j3 = (4294967296L + j2) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - j2) < Math.abs(j - j2)) {
                j = j4;
            }
        }
        return m21370a((j * 1000000) / 90000);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m21372c(long j) {
        if (this.f20669c != -9223372036854775807L) {
            throw new IllegalStateException();
        }
        this.f20667a = j;
    }
}
