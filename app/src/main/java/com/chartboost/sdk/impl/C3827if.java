package com.chartboost.sdk.impl;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.if */
/* JADX INFO: loaded from: classes3.dex */
public final class C3827if {

    /* JADX INFO: renamed from: a */
    public final RandomAccessFile f14668a;

    /* JADX INFO: renamed from: b */
    public final FileDescriptor f14669b;

    public C3827if(RandomAccessFile randomAccessFile) throws IOException {
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.f14668a = randomAccessFile;
        FileDescriptor fd = randomAccessFile.getFD();
        Intrinsics.checkNotNullExpressionValue(fd, "getFD(...)");
        this.f14669b = fd;
    }

    /* JADX INFO: renamed from: a */
    public final void m18016a() throws IOException {
        this.f14668a.close();
    }

    /* JADX INFO: renamed from: b */
    public final FileDescriptor m18017b() {
        return this.f14669b;
    }

    /* JADX INFO: renamed from: c */
    public final long m18018c() {
        return this.f14668a.length();
    }
}
