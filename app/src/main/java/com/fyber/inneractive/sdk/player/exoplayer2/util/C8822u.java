package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8515b;
import com.fyber.inneractive.sdk.player.exoplayer2.C8712s;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.u */
/* JADX INFO: loaded from: classes4.dex */
public final class C8822u implements InterfaceC8809h {

    /* JADX INFO: renamed from: a */
    public boolean f20663a;

    /* JADX INFO: renamed from: b */
    public long f20664b;

    /* JADX INFO: renamed from: c */
    public long f20665c;

    /* JADX INFO: renamed from: d */
    public C8712s f20666d = C8712s.f20317d;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.InterfaceC8809h
    /* JADX INFO: renamed from: a */
    public final C8712s mo20965a() {
        return this.f20666d;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.InterfaceC8809h
    /* JADX INFO: renamed from: a */
    public final C8712s mo20966a(C8712s c8712s) {
        if (this.f20663a) {
            m21369a(mo20973b());
        }
        this.f20666d = c8712s;
        return c8712s;
    }

    /* JADX INFO: renamed from: a */
    public final void m21369a(long j) {
        this.f20664b = j;
        if (this.f20663a) {
            this.f20665c = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.InterfaceC8809h
    /* JADX INFO: renamed from: b */
    public final long mo20973b() {
        long j = this.f20664b;
        if (!this.f20663a) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f20665c;
        C8712s c8712s = this.f20666d;
        if (c8712s.f20318a != 1.0f) {
            return (jElapsedRealtime * ((long) c8712s.f20320c)) + j;
        }
        int i = AbstractC8515b.f19086a;
        return (jElapsedRealtime != -9223372036854775807L ? 1000 * jElapsedRealtime : -9223372036854775807L) + j;
    }
}
