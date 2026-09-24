package com.mbridge.msdk.thrid.okhttp.internal.http;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http.f */
/* JADX INFO: compiled from: HttpMethod.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13740f {
    /* JADX INFO: renamed from: a */
    public static boolean m40388a(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m40389b(String str) {
        return !str.equals("PROPFIND");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m40390c(String str) {
        return str.equals("PROPFIND");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m40391d(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
