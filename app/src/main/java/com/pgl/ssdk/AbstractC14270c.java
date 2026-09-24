package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.pgl.ssdk.c */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC14270c {

    /* JADX INFO: renamed from: com.pgl.ssdk.c$a */
    public static class a extends C14290t {
        public a(long j, long j2, int i, long j3, ByteBuffer byteBuffer) {
            super(j, j2, i, j3, byteBuffer);
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m43033a(InterfaceC14287q interfaceC14287q) throws IOException, C14289s {
        C14290t c14290tM43059a = C14274d.m43059a(interfaceC14287q);
        return new a(c14290tM43059a.m43110a(), c14290tM43059a.m43112c(), c14290tM43059a.m43111b(), c14290tM43059a.m43114e(), c14290tM43059a.m43113d());
    }
}
