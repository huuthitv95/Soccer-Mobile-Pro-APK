package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.io.File;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8770g implements Comparable {

    /* JADX INFO: renamed from: a */
    public final String f20487a;

    /* JADX INFO: renamed from: b */
    public final long f20488b;

    /* JADX INFO: renamed from: c */
    public final long f20489c;

    /* JADX INFO: renamed from: d */
    public final boolean f20490d;

    /* JADX INFO: renamed from: e */
    public final File f20491e;

    /* JADX INFO: renamed from: f */
    public final long f20492f;

    public AbstractC8770g(String str, long j, long j2, long j3, File file) {
        this.f20487a = str;
        this.f20488b = j;
        this.f20489c = j2;
        this.f20490d = file != null;
        this.f20491e = file;
        this.f20492f = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC8770g abstractC8770g = (AbstractC8770g) obj;
        if (!this.f20487a.equals(abstractC8770g.f20487a)) {
            return this.f20487a.compareTo(abstractC8770g.f20487a);
        }
        long j = this.f20488b - abstractC8770g.f20488b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }
}
