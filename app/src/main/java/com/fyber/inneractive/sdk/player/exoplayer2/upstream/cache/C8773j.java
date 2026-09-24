package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j */
/* JADX INFO: loaded from: classes4.dex */
public final class C8773j implements Comparator {

    /* JADX INFO: renamed from: a */
    public final TreeSet f20504a = new TreeSet(this);

    /* JADX INFO: renamed from: b */
    public long f20505b;

    /* JADX INFO: renamed from: a */
    public final void m21298a(C8775l c8775l, long j) {
        while (this.f20505b + j > 10485760) {
            try {
                AbstractC8770g abstractC8770g = (AbstractC8770g) this.f20504a.first();
                synchronized (c8775l) {
                    try {
                        c8775l.m21303a(abstractC8770g, true);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (C8764a unused) {
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AbstractC8770g abstractC8770g = (AbstractC8770g) obj;
        AbstractC8770g abstractC8770g2 = (AbstractC8770g) obj2;
        long j = abstractC8770g.f20492f;
        long j2 = abstractC8770g2.f20492f;
        if (j - j2 != 0) {
            return j < j2 ? -1 : 1;
        }
        if (!abstractC8770g.f20487a.equals(abstractC8770g2.f20487a)) {
            return abstractC8770g.f20487a.compareTo(abstractC8770g2.f20487a);
        }
        long j3 = abstractC8770g.f20488b - abstractC8770g2.f20488b;
        if (j3 == 0) {
            return 0;
        }
        return j3 < 0 ? -1 : 1;
    }
}
