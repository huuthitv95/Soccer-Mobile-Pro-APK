package com.mbridge.msdk.thrid.okhttp.internal.tls;

import androidx.webkit.ProxyConfig;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.tls.d */
/* JADX INFO: compiled from: OkHostnameVerifier.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13772d implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final C13772d f39129a = new C13772d();

    private C13772d() {
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m40646a(X509Certificate x509Certificate) {
        List<String> listM40647a = m40647a(x509Certificate, 7);
        List<String> listM40647a2 = m40647a(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(listM40647a.size() + listM40647a2.size());
        arrayList.addAll(listM40647a);
        arrayList.addAll(listM40647a2);
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private static List<String> m40647a(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m40648b(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        Iterator<String> it = m40647a(x509Certificate, 2).iterator();
        while (it.hasNext()) {
            if (m40650a(lowerCase, it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    private boolean m40649c(String str, X509Certificate x509Certificate) {
        List<String> listM40647a = m40647a(x509Certificate, 7);
        int size = listM40647a.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(listM40647a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m40650a(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains(ProxyConfig.MATCH_ALL_SCHEMES)) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String strSubstring = lowerCase.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m40651a(String str, X509Certificate x509Certificate) {
        return C13723c.m40299d(str) ? m40649c(str, x509Certificate) : m40648b(str, x509Certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return m40651a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
