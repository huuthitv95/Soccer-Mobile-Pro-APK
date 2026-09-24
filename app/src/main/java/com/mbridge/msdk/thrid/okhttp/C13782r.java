package com.mbridge.msdk.thrid.okhttp;

import com.facebook.internal.security.CertificateUtil;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.r */
/* JADX INFO: compiled from: Headers.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13782r {

    /* JADX INFO: renamed from: a */
    private final String[] f39178a;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.r$a */
    /* JADX INFO: compiled from: Headers.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        final List<String> f39179a = new ArrayList(20);

        /* JADX INFO: renamed from: a */
        a m40710a(String str) {
            int iIndexOf = str.indexOf(CertificateUtil.DELIMITER, 1);
            if (iIndexOf != -1) {
                return m40714b(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
            }
            return str.startsWith(CertificateUtil.DELIMITER) ? m40714b("", str.substring(1)) : m40714b("", str);
        }

        /* JADX INFO: renamed from: a */
        public a m40711a(String str, String str2) {
            C13782r.m40702a(str);
            C13782r.m40703a(str2, str);
            return m40714b(str, str2);
        }

        /* JADX INFO: renamed from: a */
        public C13782r m40712a() {
            return new C13782r(this);
        }

        /* JADX INFO: renamed from: b */
        public a m40713b(String str) {
            int i = 0;
            while (i < this.f39179a.size()) {
                if (str.equalsIgnoreCase(this.f39179a.get(i))) {
                    this.f39179a.remove(i);
                    this.f39179a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* JADX INFO: renamed from: b */
        a m40714b(String str, String str2) {
            this.f39179a.add(str);
            this.f39179a.add(str2.trim());
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m40715c(String str, String str2) {
            C13782r.m40702a(str);
            C13782r.m40703a(str2, str);
            m40713b(str);
            m40714b(str, str2);
            return this;
        }
    }

    C13782r(a aVar) {
        List<String> list = aVar.f39179a;
        this.f39178a = (String[]) list.toArray(new String[list.size()]);
    }

    /* JADX INFO: renamed from: a */
    private static String m40701a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    static void m40702a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                throw new IllegalArgumentException(C13723c.m40272a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static void m40703a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("value for name " + str2 + " == null");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                throw new IllegalArgumentException(C13723c.m40272a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str2, str));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public a m40704a() {
        a aVar = new a();
        Collections.addAll(aVar.f39179a, this.f39178a);
        return aVar;
    }

    /* JADX INFO: renamed from: a */
    public String m40705a(int i) {
        return this.f39178a[i * 2];
    }

    /* JADX INFO: renamed from: b */
    public int m40706b() {
        return this.f39178a.length / 2;
    }

    /* JADX INFO: renamed from: b */
    public String m40707b(int i) {
        return this.f39178a[(i * 2) + 1];
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public String m40708b(String str) {
        return m40701a(this.f39178a, str);
    }

    /* JADX INFO: renamed from: c */
    public List<String> m40709c(String str) {
        int iM40706b = m40706b();
        ArrayList arrayList = null;
        for (int i = 0; i < iM40706b; i++) {
            if (str.equalsIgnoreCase(m40705a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m40707b(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C13782r) && Arrays.equals(((C13782r) obj).f39178a, this.f39178a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f39178a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int iM40706b = m40706b();
        for (int i = 0; i < iM40706b; i++) {
            sb.append(m40705a(i));
            sb.append(": ");
            sb.append(m40707b(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
