package com.fyber.inneractive.sdk.player.cache;

import java.io.File;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.cache.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C8443e {

    /* JADX INFO: renamed from: a */
    public final String f18780a;

    /* JADX INFO: renamed from: b */
    public final long[] f18781b;

    /* JADX INFO: renamed from: c */
    public boolean f18782c;

    /* JADX INFO: renamed from: d */
    public C8442d f18783d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C8445g f18784e;

    public C8443e(C8445g c8445g, String str) {
        this.f18784e = c8445g;
        this.f18780a = str;
        this.f18781b = new long[c8445g.f18793g];
    }

    /* JADX INFO: renamed from: a */
    public final File m20817a(int i) {
        return new File(this.f18784e.f18787a, this.f18780a + "." + i);
    }

    /* JADX INFO: renamed from: b */
    public final File m20818b(int i) {
        return new File(this.f18784e.f18787a, this.f18780a + "." + i + ".tmp");
    }
}
