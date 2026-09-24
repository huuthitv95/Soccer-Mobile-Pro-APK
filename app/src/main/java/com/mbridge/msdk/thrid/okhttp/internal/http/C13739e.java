package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.thrid.okhttp.C13709a0;
import com.mbridge.msdk.thrid.okhttp.C13775k;
import com.mbridge.msdk.thrid.okhttp.C13782r;
import com.mbridge.msdk.thrid.okhttp.C13783s;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13776l;
import com.mbridge.msdk.thrid.okio.C13796f;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http.e */
/* JADX INFO: compiled from: HttpHeaders.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13739e {

    /* JADX INFO: renamed from: a */
    private static final C13796f f38860a = C13796f.m40911c("\"\\");

    /* JADX INFO: renamed from: b */
    private static final C13796f f38861b = C13796f.m40911c("\t ,=");

    /* JADX INFO: renamed from: a */
    public static int m40380a(String str, int i) {
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m40381a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static long m40382a(C13709a0 c13709a0) {
        return m40383a(c13709a0.m40171m());
    }

    /* JADX INFO: renamed from: a */
    public static long m40383a(C13782r c13782r) {
        return m40384a(c13782r.m40708b(HttpHeaders.CONTENT_LENGTH));
    }

    /* JADX INFO: renamed from: a */
    private static long m40384a(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m40385a(InterfaceC13776l interfaceC13776l, C13783s c13783s, C13782r c13782r) {
        if (interfaceC13776l == InterfaceC13776l.f39157a) {
            return;
        }
        List<C13775k> listM40670a = C13775k.m40670a(c13783s, c13782r);
        if (listM40670a.isEmpty()) {
            return;
        }
        interfaceC13776l.mo40677a(c13783s, listM40670a);
    }

    /* JADX INFO: renamed from: b */
    public static int m40386b(String str, int i) {
        char cCharAt;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\t')) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m40387b(C13709a0 c13709a0) {
        if (c13709a0.m40177s().m40829e().equals("HEAD")) {
            return false;
        }
        int iM40169k = c13709a0.m40169k();
        return (((iM40169k >= 100 && iM40169k < 200) || iM40169k == 204 || iM40169k == 304) && m40382a(c13709a0) == -1 && !"chunked".equalsIgnoreCase(c13709a0.m40166b(HttpHeaders.TRANSFER_ENCODING))) ? false : true;
    }
}
