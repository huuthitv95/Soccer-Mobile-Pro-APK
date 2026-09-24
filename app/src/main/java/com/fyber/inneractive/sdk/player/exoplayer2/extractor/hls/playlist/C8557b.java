package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8557b extends AbstractC8560e {

    /* JADX INFO: renamed from: b */
    public final List f19304b;

    /* JADX INFO: renamed from: c */
    public final List f19305c;

    /* JADX INFO: renamed from: d */
    public final List f19306d;

    /* JADX INFO: renamed from: e */
    public final C8708o f19307e;

    /* JADX INFO: renamed from: f */
    public final List f19308f;

    public C8557b(String str, List list, List list2, List list3, C8708o c8708o, List list4) {
        super(str);
        this.f19304b = Collections.unmodifiableList(list);
        this.f19305c = Collections.unmodifiableList(list2);
        this.f19306d = Collections.unmodifiableList(list3);
        this.f19307e = c8708o;
        this.f19308f = list4 != null ? Collections.unmodifiableList(list4) : null;
    }
}
