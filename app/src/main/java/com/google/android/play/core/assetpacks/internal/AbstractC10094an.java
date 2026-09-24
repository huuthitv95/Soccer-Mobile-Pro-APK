package com.google.android.play.core.assetpacks.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.internal.an */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10094an implements Closeable {
    /* JADX INFO: renamed from: a */
    public abstract long mo22584a();

    /* JADX INFO: renamed from: b */
    protected abstract InputStream mo22585b(long j, long j2) throws IOException;

    /* JADX INFO: renamed from: c */
    public final synchronized InputStream m22716c() throws IOException {
        return mo22585b(0L, mo22584a());
    }
}
