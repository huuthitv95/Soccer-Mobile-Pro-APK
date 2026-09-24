package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.pgl.ssdk.g */
/* JADX INFO: loaded from: classes7.dex */
public class C14277g {

    /* JADX INFO: renamed from: com.pgl.ssdk.g$a */
    /* JADX INFO: loaded from: classes9.dex */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14279i m43073a(InterfaceC14287q interfaceC14287q, AbstractC14270c.a aVar, int i) throws IOException, a {
        try {
            return C14278h.m43076a(interfaceC14287q, aVar, i);
        } catch (C14280j e) {
            throw new a(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static ByteBuffer m43074a(ByteBuffer byteBuffer) throws C14236a {
        return C14278h.m43080b(byteBuffer);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m43075b(ByteBuffer byteBuffer) throws C14236a {
        return C14278h.m43082c(byteBuffer);
    }
}
