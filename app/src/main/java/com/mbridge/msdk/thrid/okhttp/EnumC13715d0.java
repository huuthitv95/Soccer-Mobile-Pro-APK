package com.mbridge.msdk.thrid.okhttp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.d0 */
/* JADX INFO: compiled from: TlsVersion.java */
/* JADX INFO: loaded from: classes7.dex */
public enum EnumC13715d0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* JADX INFO: renamed from: a */
    final String f38629a;

    EnumC13715d0(String str) {
        this.f38629a = str;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC13715d0 m40227a(String str) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "TLSv1.1":
                return TLS_1_1;
            case "TLSv1.2":
                return TLS_1_2;
            case "TLSv1.3":
                return TLS_1_3;
            case "SSLv3":
                return SSL_3_0;
            case "TLSv1":
                return TLS_1_0;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }
    }

    /* JADX INFO: renamed from: a */
    static List<EnumC13715d0> m40228a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(m40227a(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public String m40229d() {
        return this.f38629a;
    }
}
