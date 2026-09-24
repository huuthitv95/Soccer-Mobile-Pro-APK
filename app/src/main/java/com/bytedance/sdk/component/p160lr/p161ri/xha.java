package com.bytedance.sdk.component.p160lr.p161ri;

import androidx.webkit.ProxyConfig;
import com.bytedance.sdk.component.p160lr.p161ri.p162lr.C2658ri;
import com.bytedance.sdk.component.p160lr.p161ri.p162lr.jbs;
import com.google.common.base.Ascii;
import com.ironsource.C11341A5;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class xha {

    /* JADX INFO: renamed from: ka */
    private static final char[] f7617ka = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: di */
    private final String f7618di;

    /* JADX INFO: renamed from: fi */
    private final String f7619fi;

    /* JADX INFO: renamed from: ik */
    final int f7620ik;
    private final String jbs;

    /* JADX INFO: renamed from: lr */
    final String f7621lr;

    /* JADX INFO: renamed from: mj */
    private final List<String> f7622mj;

    /* JADX INFO: renamed from: qt */
    private final String f7623qt;

    /* JADX INFO: renamed from: ri */
    final String f7624ri;
    private final List<String> xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.xha$ri */
    public static final class C2673ri {

        /* JADX INFO: renamed from: di */
        final List<String> f7625di;

        /* JADX INFO: renamed from: ka */
        String f7628ka;

        /* JADX INFO: renamed from: mj */
        String f7630mj;

        /* JADX INFO: renamed from: ri */
        String f7631ri;
        List<String> xha;

        /* JADX INFO: renamed from: lr */
        String f7629lr = "";

        /* JADX INFO: renamed from: ik */
        String f7627ik = "";

        /* JADX INFO: renamed from: fi */
        int f7626fi = -1;

        /* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.xha$ri$ri */
        enum ri {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public C2673ri() {
            ArrayList arrayList = new ArrayList();
            this.f7625di = arrayList;
            arrayList.add("");
        }

        /* JADX INFO: renamed from: di */
        private static int m10031di(String str, int i, int i2) {
            try {
                int i3 = Integer.parseInt(xha.m10017ri(str, i, i2, "", false, false, false, true, null));
                if (i3 <= 0 || i3 > 65535) {
                    return -1;
                }
                return i3;
            } catch (NumberFormatException unused) {
            }
        }

        /* JADX INFO: renamed from: di */
        private boolean m10032di(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* JADX INFO: renamed from: fi */
        private static String m10033fi(String str, int i, int i2) {
            return jbs.m9938ri(xha.m10018ri(str, i, i2, false));
        }

        /* JADX INFO: renamed from: fi */
        private boolean m10034fi(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* JADX INFO: renamed from: ik */
        private static int m10035ik(String str, int i, int i2) {
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

        /* JADX INFO: renamed from: ik */
        private void m10036ik() {
            List<String> list = this.f7625di;
            if (!list.remove(list.size() - 1).isEmpty() || this.f7625di.isEmpty()) {
                this.f7625di.add("");
            } else {
                List<String> list2 = this.f7625di;
                list2.set(list2.size() - 1, "");
            }
        }

        /* JADX INFO: renamed from: ka */
        private static int m10037ka(String str, int i, int i2) {
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

        /* JADX INFO: renamed from: lr */
        private static int m10038lr(String str, int i, int i2) {
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

        /* JADX INFO: renamed from: ri */
        private C2673ri m10039ri(String str, boolean z) {
            int i = 0;
            while (true) {
                int iM9937ri = jbs.m9937ri(str, i, str.length(), "/\\");
                m10041ri(str, i, iM9937ri, iM9937ri < str.length(), z);
                i = iM9937ri + 1;
                if (i > str.length()) {
                    return this;
                }
                str = str;
                z = z;
            }
        }

        /* JADX INFO: renamed from: ri */
        private void m10040ri(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f7625di.clear();
                this.f7625di.add("");
                i++;
            } else {
                List<String> list = this.f7625di;
                list.set(list.size() - 1, "");
            }
            int i3 = i;
            while (i3 < i2) {
                int iM9937ri = jbs.m9937ri(str, i3, i2, "/\\");
                boolean z = iM9937ri < i2;
                String str2 = str;
                m10041ri(str2, i3, iM9937ri, z, true);
                if (z) {
                    iM9937ri++;
                }
                i3 = iM9937ri;
                str = str2;
            }
        }

        /* JADX INFO: renamed from: ri */
        private void m10041ri(String str, int i, int i2, boolean z, boolean z2) {
            String strM10017ri = xha.m10017ri(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (m10034fi(strM10017ri)) {
                return;
            }
            if (m10032di(strM10017ri)) {
                m10036ik();
                return;
            }
            List<String> list = this.f7625di;
            if (list.get(list.size() - 1).isEmpty()) {
                List<String> list2 = this.f7625di;
                list2.set(list2.size() - 1, strM10017ri);
            } else {
                this.f7625di.add(strM10017ri);
            }
            if (z) {
                this.f7625di.add("");
            }
        }

        /* JADX INFO: renamed from: ik */
        public C2673ri m10042ik(String str) {
            if (str != null) {
                return m10039ri(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        /* JADX INFO: renamed from: ka */
        public C2673ri m10043ka(String str) {
            this.xha = str != null ? xha.m10014lr(xha.m10019ri(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public C2673ri m10044lr(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strM10033fi = m10033fi(str, 0, str.length());
            if (strM10033fi == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(str)));
            }
            this.f7628ka = strM10033fi;
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public xha m10045lr() {
            if (this.f7631ri == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f7628ka != null) {
                return new xha(this);
            }
            throw new IllegalStateException("host == null");
        }

        /* JADX INFO: renamed from: ri */
        int m10046ri() {
            int i = this.f7626fi;
            return i != -1 ? i : xha.m10016ri(this.f7631ri);
        }

        /* JADX INFO: renamed from: ri */
        ri m10047ri(xha xhaVar, String str) {
            int iM9937ri;
            String str2;
            int i;
            String str3;
            String str4 = str;
            int iM9935ri = jbs.m9935ri(str4, 0, str4.length());
            int iM9932lr = jbs.m9932lr(str4, iM9935ri, str4.length());
            if (m10038lr(str4, iM9935ri, iM9932lr) != -1) {
                if (str4.regionMatches(true, iM9935ri, "https:", 0, 6)) {
                    this.f7631ri = "https";
                    iM9935ri += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (!str4.regionMatches(true, iM9935ri, "http:", 0, 5)) {
                        return ri.UNSUPPORTED_SCHEME;
                    }
                    this.f7631ri = ProxyConfig.MATCH_HTTP;
                    iM9935ri += 5;
                }
            } else {
                if (xhaVar == null) {
                    return ri.MISSING_SCHEME;
                }
                this.f7631ri = xhaVar.f7624ri;
            }
            int iM10035ik = m10035ik(str4, iM9935ri, iM9932lr);
            char c = '#';
            if (iM10035ik >= 2 || xhaVar == null || !xhaVar.f7624ri.equals(this.f7631ri)) {
                int i2 = iM9935ri + iM10035ik;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    iM9937ri = jbs.m9937ri(str4, i2, iM9932lr, "@/\\?#");
                    byte bCharAt = iM9937ri != iM9932lr ? str4.charAt(iM9937ri) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z) {
                            i = iM9937ri;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.f7627ik);
                            sb.append("%40");
                            str3 = str;
                            sb.append(xha.m10017ri(str3, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.f7627ik = sb.toString();
                        } else {
                            int iM9936ri = jbs.m9936ri(str4, i2, iM9937ri, AbstractJsonLexerKt.COLON);
                            String strM10017ri = xha.m10017ri(str, i2, iM9936ri, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                strM10017ri = this.f7629lr + "%40" + strM10017ri;
                            }
                            this.f7629lr = strM10017ri;
                            if (iM9936ri != iM9937ri) {
                                i = iM9937ri;
                                this.f7627ik = xha.m10017ri(str, iM9936ri + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            } else {
                                i = iM9937ri;
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
                int iM10037ka = m10037ka(str2, i3, iM9937ri);
                int i4 = iM10037ka + 1;
                if (i4 < iM9937ri) {
                    this.f7628ka = m10033fi(str2, i3, iM10037ka);
                    int iM10031di = m10031di(str2, i4, iM9937ri);
                    this.f7626fi = iM10031di;
                    if (iM10031di == -1) {
                        return ri.INVALID_PORT;
                    }
                } else {
                    this.f7628ka = m10033fi(str2, i3, iM10037ka);
                    this.f7626fi = xha.m10016ri(this.f7631ri);
                }
                if (this.f7628ka == null) {
                    return ri.INVALID_HOST;
                }
                iM9935ri = iM9937ri;
            } else {
                this.f7629lr = xhaVar.m10029lr();
                this.f7627ik = xhaVar.m10027ik();
                this.f7628ka = xhaVar.f7621lr;
                this.f7626fi = xhaVar.f7620ik;
                this.f7625di.clear();
                this.f7625di.addAll(xhaVar.m10028ka());
                if (iM9935ri == iM9932lr || str4.charAt(iM9935ri) == '#') {
                    m10043ka(xhaVar.m10026fi());
                }
                str2 = str4;
            }
            int iM9937ri2 = jbs.m9937ri(str2, iM9935ri, iM9932lr, "?#");
            m10040ri(str2, iM9935ri, iM9937ri2);
            if (iM9937ri2 < iM9932lr && str2.charAt(iM9937ri2) == '?') {
                int iM9936ri2 = jbs.m9936ri(str2, iM9937ri2, iM9932lr, '#');
                this.xha = xha.m10014lr(xha.m10017ri(str2, iM9937ri2 + 1, iM9936ri2, " \"'<>#", true, false, true, true, null));
                iM9937ri2 = iM9936ri2;
            }
            if (iM9937ri2 < iM9932lr && str2.charAt(iM9937ri2) == '#') {
                this.f7630mj = xha.m10017ri(str2, iM9937ri2 + 1, iM9932lr, "", true, false, false, false, null);
            }
            return ri.SUCCESS;
        }

        /* JADX INFO: renamed from: ri */
        public C2673ri m10048ri(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase(ProxyConfig.MATCH_HTTP)) {
                this.f7631ri = ProxyConfig.MATCH_HTTP;
                return this;
            }
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(String.valueOf(str)));
            }
            this.f7631ri = "https";
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public C2673ri m10049ri(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.xha == null) {
                this.xha = new ArrayList();
            }
            this.xha.add(xha.m10019ri(str, " \"'<>#&=", true, false, true, true));
            this.xha.add(str2 != null ? xha.m10019ri(str2, " \"'<>#&=", true, false, true, true) : null);
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f7631ri);
            sb.append("://");
            if (!this.f7629lr.isEmpty() || !this.f7627ik.isEmpty()) {
                sb.append(this.f7629lr);
                if (!this.f7627ik.isEmpty()) {
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append(this.f7627ik);
                }
                sb.append('@');
            }
            if (this.f7628ka.indexOf(58) != -1) {
                sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb.append(this.f7628ka);
                sb.append(AbstractJsonLexerKt.END_LIST);
            } else {
                sb.append(this.f7628ka);
            }
            int iM10046ri = m10046ri();
            if (iM10046ri != xha.m10016ri(this.f7631ri)) {
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(iM10046ri);
            }
            xha.m10024ri(sb, this.f7625di);
            if (this.xha != null) {
                sb.append('?');
                xha.m10015lr(sb, this.xha);
            }
            if (this.f7630mj != null) {
                sb.append('#');
                sb.append(this.f7630mj);
            }
            return sb.toString();
        }
    }

    xha(C2673ri c2673ri) {
        this.f7624ri = c2673ri.f7631ri;
        this.f7619fi = m10020ri(c2673ri.f7629lr, false);
        this.f7618di = m10020ri(c2673ri.f7627ik, false);
        this.f7621lr = c2673ri.f7628ka;
        this.f7620ik = c2673ri.m10046ri();
        this.xha = m10021ri(c2673ri.f7625di, false);
        this.f7622mj = c2673ri.xha != null ? m10021ri(c2673ri.xha, true) : null;
        this.jbs = c2673ri.f7630mj != null ? m10020ri(c2673ri.f7630mj, false) : null;
        this.f7623qt = c2673ri.toString();
    }

    /* JADX INFO: renamed from: ik */
    public static xha m10013ik(String str) {
        C2673ri c2673ri = new C2673ri();
        if (c2673ri.m10047ri((xha) null, str) == C2673ri.ri.SUCCESS) {
            return c2673ri.m10045lr();
        }
        return null;
    }

    /* JADX INFO: renamed from: lr */
    static List<String> m10014lr(String str) {
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

    /* JADX INFO: renamed from: lr */
    static void m10015lr(StringBuilder sb, List<String> list) {
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

    /* JADX INFO: renamed from: ri */
    public static int m10016ri(String str) {
        if (str.equals(ProxyConfig.MATCH_HTTP)) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX INFO: renamed from: ri */
    static String m10017ri(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z4) || str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && (!z || (z2 && !m10025ri(str, iCharCount, i2)))) || (iCodePointAt == 43 && z3)))) {
                C2658ri c2658ri = new C2658ri();
                c2658ri.m9966ri(str, i, iCharCount);
                m10022ri(c2658ri, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
                return c2658ri.m9956ik();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: ri */
    static String m10018ri(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                C2658ri c2658ri = new C2658ri();
                c2658ri.m9966ri(str, i, i3);
                m10023ri(c2658ri, str, i3, i2, z);
                return c2658ri.m9956ik();
            }
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: ri */
    static String m10019ri(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m10017ri(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    /* JADX INFO: renamed from: ri */
    static String m10020ri(String str, boolean z) {
        return m10018ri(str, 0, str.length(), z);
    }

    /* JADX INFO: renamed from: ri */
    private List<String> m10021ri(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m10020ri(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ri */
    static void m10022ri(C2658ri c2658ri, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        C2658ri c2658ri2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z3) {
                    c2658ri.m9965ri(z ? "+" : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z4) || str2.indexOf(iCodePointAt) != -1 || (iCodePointAt == 37 && (!z || (z2 && !m10025ri(str, i, i2)))))) {
                    if (c2658ri2 == null) {
                        c2658ri2 = new C2658ri();
                    }
                    if (charset == null || charset.equals(jbs.f7555ri)) {
                        c2658ri2.m9964ri(iCodePointAt);
                    } else {
                        c2658ri2.m9967ri(str, i, Character.charCount(iCodePointAt) + i, charset);
                    }
                    while (!c2658ri2.m9970ri()) {
                        byte bM9959lr = c2658ri2.m9959lr();
                        c2658ri.m9960lr(37);
                        char[] cArr = f7617ka;
                        c2658ri.m9960lr((int) cArr[((bM9959lr & 255) >> 4) & 15]);
                        c2658ri.m9960lr((int) cArr[bM9959lr & Ascii.f22499SI]);
                    }
                } else {
                    c2658ri.m9964ri(iCodePointAt);
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX INFO: renamed from: ri */
    static void m10023ri(C2658ri c2658ri, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                int iM9934ri = jbs.m9934ri(str.charAt(i + 1));
                int iM9934ri2 = jbs.m9934ri(str.charAt(i3));
                if (iM9934ri == -1 || iM9934ri2 == -1) {
                    c2658ri.m9964ri(iCodePointAt);
                } else {
                    c2658ri.m9960lr((iM9934ri << 4) + iM9934ri2);
                    i = i3;
                }
            } else if (iCodePointAt == 43 && z) {
                c2658ri.m9960lr(32);
            } else {
                c2658ri.m9964ri(iCodePointAt);
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: ri */
    static void m10024ri(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    /* JADX INFO: renamed from: ri */
    static boolean m10025ri(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && jbs.m9934ri(str.charAt(i + 1)) != -1 && jbs.m9934ri(str.charAt(i3)) != -1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof xha) && ((xha) obj).f7623qt.equals(this.f7623qt);
    }

    /* JADX INFO: renamed from: fi */
    public String m10026fi() {
        if (this.f7622mj == null) {
            return null;
        }
        int iIndexOf = this.f7623qt.indexOf(63) + 1;
        String str = this.f7623qt;
        return this.f7623qt.substring(iIndexOf, jbs.m9936ri(str, iIndexOf, str.length(), '#'));
    }

    public int hashCode() {
        return this.f7623qt.hashCode();
    }

    /* JADX INFO: renamed from: ik */
    public String m10027ik() {
        if (this.f7618di.isEmpty()) {
            return "";
        }
        return this.f7623qt.substring(this.f7623qt.indexOf(58, this.f7624ri.length() + 3) + 1, this.f7623qt.indexOf(64));
    }

    /* JADX INFO: renamed from: ka */
    public List<String> m10028ka() {
        int iIndexOf = this.f7623qt.indexOf(47, this.f7624ri.length() + 3);
        String str = this.f7623qt;
        int iM9937ri = jbs.m9937ri(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iM9937ri) {
            int i = iIndexOf + 1;
            int iM9936ri = jbs.m9936ri(this.f7623qt, i, iM9937ri, '/');
            arrayList.add(this.f7623qt.substring(i, iM9936ri));
            iIndexOf = iM9936ri;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: lr */
    public String m10029lr() {
        if (this.f7619fi.isEmpty()) {
            return "";
        }
        int length = this.f7624ri.length() + 3;
        String str = this.f7623qt;
        return this.f7623qt.substring(length, jbs.m9937ri(str, length, str.length(), ":@"));
    }

    /* JADX INFO: renamed from: ri */
    public URL m10030ri() {
        try {
            return new URL(this.f7623qt);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.f7623qt;
    }
}
