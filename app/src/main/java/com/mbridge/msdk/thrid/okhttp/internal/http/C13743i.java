package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.C13783s;
import com.mbridge.msdk.thrid.okhttp.C13789y;
import java.net.Proxy;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http.i */
/* JADX INFO: compiled from: RequestLine.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13743i {
    /* JADX INFO: renamed from: a */
    public static String m40403a(C13783s c13783s) {
        String strM40733c = c13783s.m40733c();
        String strM40736e = c13783s.m40736e();
        if (strM40736e == null) {
            return strM40733c;
        }
        return strM40733c + '?' + strM40736e;
    }

    /* JADX INFO: renamed from: a */
    public static String m40404a(C13789y c13789y, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(c13789y.m40829e());
        sb.append(' ');
        if (m40405b(c13789y, type)) {
            sb.append(c13789y.m40831g());
        } else {
            sb.append(m40403a(c13789y.m40831g()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    private static boolean m40405b(C13789y c13789y, Proxy.Type type) {
        return !c13789y.m40828d() && type == Proxy.Type.HTTP;
    }
}
