package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8559d extends AbstractC8560e {

    /* JADX INFO: renamed from: b */
    public final int f19318b;

    /* JADX INFO: renamed from: c */
    public final long f19319c;

    /* JADX INFO: renamed from: d */
    public final long f19320d;

    /* JADX INFO: renamed from: e */
    public final boolean f19321e;

    /* JADX INFO: renamed from: f */
    public final int f19322f;

    /* JADX INFO: renamed from: g */
    public final int f19323g;

    /* JADX INFO: renamed from: h */
    public final int f19324h;

    /* JADX INFO: renamed from: i */
    public final long f19325i;

    /* JADX INFO: renamed from: j */
    public final boolean f19326j;

    /* JADX INFO: renamed from: k */
    public final boolean f19327k;

    /* JADX INFO: renamed from: l */
    public final C8558c f19328l;

    /* JADX INFO: renamed from: m */
    public final List f19329m;

    /* JADX INFO: renamed from: n */
    public final List f19330n;

    /* JADX INFO: renamed from: o */
    public final long f19331o;

    public C8559d(int i, String str, long j, long j2, boolean z, int i2, int i3, int i4, long j3, boolean z2, boolean z3, C8558c c8558c, List list, List list2) {
        super(str);
        this.f19318b = i;
        this.f19320d = j2;
        this.f19321e = z;
        this.f19322f = i2;
        this.f19323g = i3;
        this.f19324h = i4;
        this.f19325i = j3;
        this.f19326j = z2;
        this.f19327k = z3;
        this.f19328l = c8558c;
        this.f19329m = Collections.unmodifiableList(list);
        if (list.isEmpty()) {
            this.f19331o = 0L;
        } else {
            C8558c c8558c2 = (C8558c) list.get(list.size() - 1);
            this.f19331o = c8558c2.f19312d + c8558c2.f19310b;
        }
        if (j == -9223372036854775807L) {
            j = -9223372036854775807L;
        } else if (j < 0) {
            j += this.f19331o;
        }
        this.f19319c = j;
        this.f19330n = Collections.unmodifiableList(list2);
    }
}
