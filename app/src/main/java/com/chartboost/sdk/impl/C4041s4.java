package com.chartboost.sdk.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p300io.CloseableKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.s4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4041s4 {

    /* JADX INFO: renamed from: a */
    public static final C4041s4 f16220a = new C4041s4();

    /* JADX INFO: renamed from: b */
    public static final byte[] f16221b = new byte[0];

    /* JADX INFO: renamed from: a */
    public final int m19381a(InputStream input, OutputStream output) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        long jM19385b = m19385b(input, output);
        if (jM19385b > 2147483647L) {
            return -1;
        }
        return (int) jM19385b;
    }

    /* JADX INFO: renamed from: a */
    public final long m19382a(InputStream input, OutputStream output, int i) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        return m19383a(input, output, new byte[i]);
    }

    /* JADX INFO: renamed from: a */
    public final long m19383a(InputStream input, OutputStream output, byte[] buffer) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        long j = 0;
        while (true) {
            int i = input.read(buffer);
            if (i == -1) {
                return j;
            }
            output.write(buffer, 0, i);
            j += (long) i;
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m19384a(InputStream input) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f16220a.m19381a(input, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            CloseableKt.closeFinally(byteArrayOutputStream, null);
            return byteArray;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(byteArrayOutputStream, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m19385b(InputStream input, OutputStream output) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        return m19382a(input, output, 8192);
    }
}
