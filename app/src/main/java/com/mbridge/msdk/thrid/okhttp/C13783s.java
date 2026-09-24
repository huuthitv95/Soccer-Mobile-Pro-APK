package com.mbridge.msdk.thrid.okhttp;

import androidx.webkit.ProxyConfig;
import com.google.common.base.Ascii;
import com.ironsource.C11341A5;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okio.C13793c;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.s */
/* JADX INFO: compiled from: HttpUrl.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13783s {

    /* JADX INFO: renamed from: j */
    private static final char[] f39180j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    final String f39181a;

    /* JADX INFO: renamed from: b */
    private final String f39182b;

    /* JADX INFO: renamed from: c */
    private final String f39183c;

    /* JADX INFO: renamed from: d */
    final String f39184d;

    /* JADX INFO: renamed from: e */
    final int f39185e;

    /* JADX INFO: renamed from: f */
    private final List<String> f39186f;

    /* JADX INFO: renamed from: g */
    @Nullable
    private final List<String> f39187g;

    /* JADX INFO: renamed from: h */
    @Nullable
    private final String f39188h;

    /* JADX INFO: renamed from: i */
    private final String f39189i;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.s$a */
    /* JADX INFO: compiled from: HttpUrl.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        @Nullable
        String f39190a;

        /* JADX INFO: renamed from: d */
        @Nullable
        String f39193d;

        /* JADX INFO: renamed from: f */
        final List<String> f39195f;

        /* JADX INFO: renamed from: g */
        @Nullable
        List<String> f39196g;

        /* JADX INFO: renamed from: h */
        @Nullable
        String f39197h;

        /* JADX INFO: renamed from: b */
        String f39191b = "";

        /* JADX INFO: renamed from: c */
        String f39192c = "";

        /* JADX INFO: renamed from: e */
        int f39194e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f39195f = arrayList;
            arrayList.add("");
        }

        /* JADX INFO: renamed from: a */
        private static String m40746a(String str, int i, int i2) {
            return C13723c.m40271a(C13783s.m40718a(str, i, i2, false));
        }

        /* JADX INFO: renamed from: a */
        private void m40747a(String str, int i, int i2, boolean z, boolean z2) {
            String strM40717a = C13783s.m40717a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (m40751c(strM40717a)) {
                return;
            }
            if (m40753d(strM40717a)) {
                m40750c();
                return;
            }
            List<String> list = this.f39195f;
            if (list.get(list.size() - 1).isEmpty()) {
                List<String> list2 = this.f39195f;
                list2.set(list2.size() - 1, strM40717a);
            } else {
                this.f39195f.add(strM40717a);
            }
            if (z) {
                this.f39195f.add("");
            }
        }

        /* JADX INFO: renamed from: b */
        private static int m40748b(String str, int i, int i2) {
            try {
                int i3 = Integer.parseInt(C13783s.m40717a(str, i, i2, "", false, false, false, true, null));
                if (i3 <= 0 || i3 > 65535) {
                    return -1;
                }
                return i3;
            } catch (NumberFormatException unused) {
            }
        }

        /* JADX INFO: renamed from: c */
        private static int m40749c(String str, int i, int i2) {
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt == ':') {
                    return i;
                }
                if (cCharAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        /* JADX INFO: renamed from: c */
        private void m40750c() {
            List<String> list = this.f39195f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f39195f.isEmpty()) {
                this.f39195f.add("");
            } else {
                List<String> list2 = this.f39195f;
                list2.set(list2.size() - 1, "");
            }
        }

        /* JADX INFO: renamed from: c */
        private boolean m40751c(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* JADX INFO: renamed from: d */
        private void m40752d(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f39195f.clear();
                this.f39195f.add("");
                i++;
            } else {
                List<String> list = this.f39195f;
                list.set(list.size() - 1, "");
            }
            int i3 = i;
            while (i3 < i2) {
                int iM40266a = C13723c.m40266a(str, i3, i2, "/\\");
                boolean z = iM40266a < i2;
                str = str;
                m40747a(str, i3, iM40266a, z, true);
                i3 = z ? iM40266a + 1 : iM40266a;
            }
        }

        /* JADX INFO: renamed from: d */
        private boolean m40753d(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* JADX INFO: renamed from: e */
        private static int m40754e(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: f */
        private static int m40755f(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* JADX INFO: renamed from: a */
        public a m40756a(int i) {
            if (i > 0 && i <= 65535) {
                this.f39194e = i;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i);
        }

        /* JADX INFO: renamed from: a */
        a m40757a(@Nullable C13783s c13783s, String str) {
            int iM40266a;
            String str2;
            int i;
            String str3;
            String str4 = str;
            int iM40291b = C13723c.m40291b(str4, 0, str4.length());
            int iM40297c = C13723c.m40297c(str4, iM40291b, str4.length());
            int iM40754e = m40754e(str4, iM40291b, iM40297c);
            if (iM40754e != -1) {
                if (str4.regionMatches(true, iM40291b, "https:", 0, 6)) {
                    this.f39190a = "https";
                    iM40291b += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (!str4.regionMatches(true, iM40291b, "http:", 0, 5)) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str4.substring(0, iM40754e) + "'");
                    }
                    this.f39190a = ProxyConfig.MATCH_HTTP;
                    iM40291b += 5;
                }
            } else {
                if (c13783s == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.f39190a = c13783s.f39181a;
            }
            int iM40755f = m40755f(str4, iM40291b, iM40297c);
            char c = '#';
            if (iM40755f >= 2 || c13783s == null || !c13783s.f39181a.equals(this.f39190a)) {
                int i2 = iM40291b + iM40755f;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    iM40266a = C13723c.m40266a(str4, i2, iM40297c, "@/\\?#");
                    byte bCharAt = iM40266a != iM40297c ? str4.charAt(iM40266a) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z) {
                            i = iM40266a;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.f39192c);
                            sb.append("%40");
                            str3 = str;
                            sb.append(C13783s.m40717a(str3, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.f39192c = sb.toString();
                        } else {
                            int iM40265a = C13723c.m40265a(str4, i2, iM40266a, AbstractJsonLexerKt.COLON);
                            String strM40717a = C13783s.m40717a(str, i2, iM40265a, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                strM40717a = this.f39191b + "%40" + strM40717a;
                            }
                            this.f39191b = strM40717a;
                            if (iM40265a != iM40266a) {
                                i = iM40266a;
                                this.f39192c = C13783s.m40717a(str, iM40265a + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            } else {
                                i = iM40266a;
                            }
                            str3 = str;
                            z2 = true;
                        }
                        i2 = i + 1;
                        str4 = str3;
                        c = '#';
                    }
                }
                str2 = str4;
                int i3 = i2;
                int iM40749c = m40749c(str2, i3, iM40266a);
                int i4 = iM40749c + 1;
                if (i4 < iM40266a) {
                    this.f39193d = m40746a(str2, i3, iM40749c);
                    int iM40748b = m40748b(str2, i4, iM40266a);
                    this.f39194e = iM40748b;
                    if (iM40748b == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i4, iM40266a) + '\"');
                    }
                } else {
                    this.f39193d = m40746a(str2, i3, iM40749c);
                    this.f39194e = C13783s.m40716a(this.f39190a);
                }
                if (this.f39193d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i3, iM40749c) + '\"');
                }
                iM40291b = iM40266a;
            } else {
                this.f39191b = c13783s.m40737f();
                this.f39192c = c13783s.m40731b();
                this.f39193d = c13783s.f39184d;
                this.f39194e = c13783s.f39185e;
                this.f39195f.clear();
                this.f39195f.addAll(c13783s.m40734d());
                if (iM40291b == iM40297c || str4.charAt(iM40291b) == '#') {
                    m40758a(c13783s.m40736e());
                }
                str2 = str4;
            }
            int iM40266a2 = C13723c.m40266a(str2, iM40291b, iM40297c, "?#");
            m40752d(str2, iM40291b, iM40266a2);
            if (iM40266a2 < iM40297c && str2.charAt(iM40266a2) == '?') {
                int iM40265a2 = C13723c.m40265a(str2, iM40266a2, iM40297c, '#');
                this.f39196g = C13783s.m40729d(C13783s.m40717a(str2, iM40266a2 + 1, iM40265a2, " \"'<>#", true, false, true, true, null));
                iM40266a2 = iM40265a2;
            }
            if (iM40266a2 < iM40297c && str2.charAt(iM40266a2) == '#') {
                this.f39197h = C13783s.m40717a(str2, iM40266a2 + 1, iM40297c, "", true, false, false, false, null);
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m40758a(@Nullable String str) {
            this.f39196g = str != null ? C13783s.m40729d(C13783s.m40719a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C13783s m40759a() {
            if (this.f39190a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f39193d != null) {
                return new C13783s(this);
            }
            throw new IllegalStateException("host == null");
        }

        /* JADX INFO: renamed from: b */
        int m40760b() {
            int i = this.f39194e;
            return i != -1 ? i : C13783s.m40716a(this.f39190a);
        }

        /* JADX INFO: renamed from: b */
        public a m40761b(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strM40746a = m40746a(str, 0, str.length());
            if (strM40746a != null) {
                this.f39193d = strM40746a;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        /* JADX INFO: renamed from: d */
        a m40762d() {
            int size = this.f39195f.size();
            for (int i = 0; i < size; i++) {
                this.f39195f.set(i, C13783s.m40719a(this.f39195f.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.f39196g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.f39196g.get(i2);
                    if (str != null) {
                        this.f39196g.set(i2, C13783s.m40719a(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f39197h;
            if (str2 != null) {
                this.f39197h = C13783s.m40719a(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m40763e(String str) {
            if (str == null) {
                throw new NullPointerException("password == null");
            }
            this.f39192c = C13783s.m40719a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m40764f(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase(ProxyConfig.MATCH_HTTP)) {
                this.f39190a = ProxyConfig.MATCH_HTTP;
                return this;
            }
            if (str.equalsIgnoreCase("https")) {
                this.f39190a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + str);
        }

        /* JADX INFO: renamed from: g */
        public a m40765g(String str) {
            if (str == null) {
                throw new NullPointerException("username == null");
            }
            this.f39191b = C13783s.m40719a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f39190a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f39191b.isEmpty() || !this.f39192c.isEmpty()) {
                sb.append(this.f39191b);
                if (!this.f39192c.isEmpty()) {
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append(this.f39192c);
                }
                sb.append('@');
            }
            String str2 = this.f39193d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb.append(this.f39193d);
                    sb.append(AbstractJsonLexerKt.END_LIST);
                } else {
                    sb.append(this.f39193d);
                }
            }
            if (this.f39194e != -1 || this.f39190a != null) {
                int iM40760b = m40760b();
                String str3 = this.f39190a;
                if (str3 == null || iM40760b != C13783s.m40716a(str3)) {
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append(iM40760b);
                }
            }
            C13783s.m40728b(sb, this.f39195f);
            if (this.f39196g != null) {
                sb.append('?');
                C13783s.m40725a(sb, this.f39196g);
            }
            if (this.f39197h != null) {
                sb.append('#');
                sb.append(this.f39197h);
            }
            return sb.toString();
        }
    }

    C13783s(a aVar) {
        this.f39181a = aVar.f39190a;
        this.f39182b = m40721a(aVar.f39191b, false);
        this.f39183c = m40721a(aVar.f39192c, false);
        this.f39184d = aVar.f39193d;
        this.f39185e = aVar.m40760b();
        this.f39186f = m40722a(aVar.f39195f, false);
        List<String> list = aVar.f39196g;
        this.f39187g = list != null ? m40722a(list, true) : null;
        String str = aVar.f39197h;
        this.f39188h = str != null ? m40721a(str, false) : null;
        this.f39189i = aVar.toString();
    }

    /* JADX INFO: renamed from: a */
    public static int m40716a(String str) {
        if (str.equals(ProxyConfig.MATCH_HTTP)) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX INFO: renamed from: a */
    static String m40717a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z4) || str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && (!z || (z2 && !m40726a(str, iCharCount, i2)))) || (iCodePointAt == 43 && z3)))) {
                C13793c c13793c = new C13793c();
                c13793c.m40868a(str, i, iCharCount);
                m40723a(c13793c, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
                return c13793c.m40904p();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: a */
    static String m40718a(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                C13793c c13793c = new C13793c();
                c13793c.m40868a(str, i, i3);
                m40724a(c13793c, str, i3, i2, z);
                return c13793c.m40904p();
            }
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: a */
    static String m40719a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m40717a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    /* JADX INFO: renamed from: a */
    static String m40720a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return m40717a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    /* JADX INFO: renamed from: a */
    static String m40721a(String str, boolean z) {
        return m40718a(str, 0, str.length(), z);
    }

    /* JADX INFO: renamed from: a */
    private List<String> m40722a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m40721a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    static void m40723a(C13793c c13793c, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        C13793c c13793c2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z3) {
                    c13793c.mo40873a(z ? "+" : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z4) || str2.indexOf(iCodePointAt) != -1 || (iCodePointAt == 37 && (!z || (z2 && !m40726a(str, i, i2)))))) {
                    if (c13793c2 == null) {
                        c13793c2 = new C13793c();
                    }
                    if (charset == null || charset.equals(C13723c.f38780j)) {
                        c13793c2.m40891f(iCodePointAt);
                    } else {
                        c13793c2.m40869a(str, i, Character.charCount(iCodePointAt) + i, charset);
                    }
                    while (!c13793c2.mo40892f()) {
                        byte b = c13793c2.readByte();
                        c13793c.writeByte(37);
                        char[] cArr = f39180j;
                        c13793c.writeByte((int) cArr[((b & 255) >> 4) & 15]);
                        c13793c.writeByte((int) cArr[b & Ascii.f22499SI]);
                    }
                } else {
                    c13793c.m40891f(iCodePointAt);
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX INFO: renamed from: a */
    static void m40724a(C13793c c13793c, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                int iM40264a = C13723c.m40264a(str.charAt(i + 1));
                int iM40264a2 = C13723c.m40264a(str.charAt(i3));
                if (iM40264a == -1 || iM40264a2 == -1) {
                    c13793c.m40891f(iCodePointAt);
                } else {
                    c13793c.writeByte((iM40264a << 4) + iM40264a2);
                    i = i3;
                }
            } else if (iCodePointAt == 43 && z) {
                c13793c.writeByte(32);
            } else {
                c13793c.m40891f(iCodePointAt);
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: a */
    static void m40725a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append(Typography.amp);
            }
            sb.append(str);
            if (str2 != null) {
                sb.append(C11341A5.f23808U);
                sb.append(str2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m40726a(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && C13723c.m40264a(str.charAt(i + 1)) != -1 && C13723c.m40264a(str.charAt(i3)) != -1;
    }

    /* JADX INFO: renamed from: b */
    public static C13783s m40727b(String str) {
        return new a().m40757a(null, str).m40759a();
    }

    /* JADX INFO: renamed from: b */
    static void m40728b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    /* JADX INFO: renamed from: d */
    static List<String> m40729d(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iIndexOf = str.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i = iIndexOf + 1;
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public String m40730a() {
        if (this.f39188h == null) {
            return null;
        }
        return this.f39189i.substring(this.f39189i.indexOf(35) + 1);
    }

    /* JADX INFO: renamed from: b */
    public String m40731b() {
        if (this.f39183c.isEmpty()) {
            return "";
        }
        return this.f39189i.substring(this.f39189i.indexOf(58, this.f39181a.length() + 3) + 1, this.f39189i.indexOf(64));
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public a m40732c(String str) {
        try {
            return new a().m40757a(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m40733c() {
        int iIndexOf = this.f39189i.indexOf(47, this.f39181a.length() + 3);
        String str = this.f39189i;
        return this.f39189i.substring(iIndexOf, C13723c.m40266a(str, iIndexOf, str.length(), "?#"));
    }

    /* JADX INFO: renamed from: d */
    public List<String> m40734d() {
        int iIndexOf = this.f39189i.indexOf(47, this.f39181a.length() + 3);
        String str = this.f39189i;
        int iM40266a = C13723c.m40266a(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iM40266a) {
            int i = iIndexOf + 1;
            int iM40265a = C13723c.m40265a(this.f39189i, i, iM40266a, '/');
            arrayList.add(this.f39189i.substring(i, iM40265a));
            iIndexOf = iM40265a;
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public C13783s m40735e(String str) {
        a aVarM40732c = m40732c(str);
        if (aVarM40732c != null) {
            return aVarM40732c.m40759a();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public String m40736e() {
        if (this.f39187g == null) {
            return null;
        }
        int iIndexOf = this.f39189i.indexOf(63) + 1;
        String str = this.f39189i;
        return this.f39189i.substring(iIndexOf, C13723c.m40265a(str, iIndexOf, str.length(), '#'));
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C13783s) && ((C13783s) obj).f39189i.equals(this.f39189i);
    }

    /* JADX INFO: renamed from: f */
    public String m40737f() {
        if (this.f39182b.isEmpty()) {
            return "";
        }
        int length = this.f39181a.length() + 3;
        String str = this.f39189i;
        return this.f39189i.substring(length, C13723c.m40266a(str, length, str.length(), ":@"));
    }

    /* JADX INFO: renamed from: g */
    public String m40738g() {
        return this.f39184d;
    }

    /* JADX INFO: renamed from: h */
    public boolean m40739h() {
        return this.f39181a.equals("https");
    }

    public int hashCode() {
        return this.f39189i.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public a m40740i() {
        a aVar = new a();
        aVar.f39190a = this.f39181a;
        aVar.f39191b = m40737f();
        aVar.f39192c = m40731b();
        aVar.f39193d = this.f39184d;
        aVar.f39194e = this.f39185e != m40716a(this.f39181a) ? this.f39185e : -1;
        aVar.f39195f.clear();
        aVar.f39195f.addAll(m40734d());
        aVar.m40758a(m40736e());
        aVar.f39197h = m40730a();
        return aVar;
    }

    /* JADX INFO: renamed from: j */
    public int m40741j() {
        return this.f39185e;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public String m40742k() {
        if (this.f39187g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m40725a(sb, this.f39187g);
        return sb.toString();
    }

    /* JADX INFO: renamed from: l */
    public String m40743l() {
        return m40732c("/...").m40765g("").m40763e("").m40759a().toString();
    }

    /* JADX INFO: renamed from: m */
    public String m40744m() {
        return this.f39181a;
    }

    /* JADX INFO: renamed from: n */
    public URI m40745n() {
        String string = m40740i().m40762d().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public String toString() {
        return this.f39189i;
    }
}
