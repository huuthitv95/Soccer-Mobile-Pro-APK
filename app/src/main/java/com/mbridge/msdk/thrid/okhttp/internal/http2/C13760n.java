package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.io.IOException;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.n */
/* JADX INFO: compiled from: StreamResetException.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13760n extends IOException {

    /* JADX INFO: renamed from: a */
    public final EnumC13748b f39090a;

    public C13760n(EnumC13748b enumC13748b) {
        super("stream was reset: " + enumC13748b);
        this.f39090a = enumC13748b;
    }
}
