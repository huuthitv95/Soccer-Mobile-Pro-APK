package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.w */
/* JADX INFO: compiled from: Protocol.java */
/* JADX INFO: loaded from: classes7.dex */
public enum EnumC13787w {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: a */
    private final String f39265a;

    EnumC13787w(String str) {
        this.f39265a = str;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC13787w m40812a(String str) throws IOException {
        EnumC13787w enumC13787w = HTTP_1_0;
        if (str.equals(enumC13787w.f39265a)) {
            return enumC13787w;
        }
        EnumC13787w enumC13787w2 = HTTP_1_1;
        if (str.equals(enumC13787w2.f39265a)) {
            return enumC13787w2;
        }
        EnumC13787w enumC13787w3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(enumC13787w3.f39265a)) {
            return enumC13787w3;
        }
        EnumC13787w enumC13787w4 = HTTP_2;
        if (str.equals(enumC13787w4.f39265a)) {
            return enumC13787w4;
        }
        EnumC13787w enumC13787w5 = SPDY_3;
        if (str.equals(enumC13787w5.f39265a)) {
            return enumC13787w5;
        }
        EnumC13787w enumC13787w6 = QUIC;
        if (str.equals(enumC13787w6.f39265a)) {
            return enumC13787w6;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f39265a;
    }
}
