package com.google.android.play.core.assetpacks.internal;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.internal.ao */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10095ao extends AbstractC10094an {

    /* JADX INFO: renamed from: a */
    private final AbstractC10094an f22397a;

    /* JADX INFO: renamed from: b */
    private final long f22398b;

    /* JADX INFO: renamed from: c */
    private final long f22399c;

    public C10095ao(AbstractC10094an abstractC10094an, long j, long j2, boolean z) {
        this.f22397a = abstractC10094an;
        long jM22717d = m22717d(j);
        this.f22398b = jM22717d;
        this.f22399c = m22717d(jM22717d + j2);
    }

    /* JADX INFO: renamed from: d */
    private final long m22717d(long j) {
        if (j < 0) {
            return 0L;
        }
        return j > this.f22397a.mo22584a() ? this.f22397a.mo22584a() : j;
    }

    @Override // com.google.android.play.core.assetpacks.internal.AbstractC10094an
    /* JADX INFO: renamed from: a */
    public final long mo22584a() {
        return this.f22399c - this.f22398b;
    }

    @Override // com.google.android.play.core.assetpacks.internal.AbstractC10094an
    /* JADX INFO: renamed from: b */
    protected final InputStream mo22585b(long j, long j2) throws IOException {
        long jM22717d = m22717d(this.f22398b);
        return this.f22397a.mo22585b(jM22717d, m22717d(j2 + jM22717d) - jM22717d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
