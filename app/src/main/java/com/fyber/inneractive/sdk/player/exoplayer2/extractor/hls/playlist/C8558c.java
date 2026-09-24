package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8558c implements Comparable {

    /* JADX INFO: renamed from: a */
    public final String f19309a;

    /* JADX INFO: renamed from: b */
    public final long f19310b;

    /* JADX INFO: renamed from: c */
    public final int f19311c;

    /* JADX INFO: renamed from: d */
    public final long f19312d;

    /* JADX INFO: renamed from: e */
    public final boolean f19313e;

    /* JADX INFO: renamed from: f */
    public final String f19314f;

    /* JADX INFO: renamed from: g */
    public final String f19315g;

    /* JADX INFO: renamed from: h */
    public final long f19316h;

    /* JADX INFO: renamed from: i */
    public final long f19317i;

    public C8558c(String str, long j, int i, long j2, boolean z, String str2, String str3, long j3, long j4) {
        this.f19309a = str;
        this.f19310b = j;
        this.f19311c = i;
        this.f19312d = j2;
        this.f19313e = z;
        this.f19314f = str2;
        this.f19315g = str3;
        this.f19316h = j3;
        this.f19317i = j4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        if (this.f19312d > l.longValue()) {
            return 1;
        }
        return this.f19312d < l.longValue() ? -1 : 0;
    }
}
