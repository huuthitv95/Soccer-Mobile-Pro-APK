package com.mbridge.msdk.thrid.okhttp;

import com.google.common.net.HttpHeaders;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C11341A5;
import com.ironsource.C11744X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okhttp.internal.http.C13738d;
import com.mbridge.msdk.thrid.okhttp.internal.publicsuffix.PublicSuffixDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.k */
/* JADX INFO: compiled from: Cookie.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13775k {

    /* JADX INFO: renamed from: j */
    private static final Pattern f39144j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k */
    private static final Pattern f39145k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l */
    private static final Pattern f39146l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m */
    private static final Pattern f39147m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a */
    private final String f39148a;

    /* JADX INFO: renamed from: b */
    private final String f39149b;

    /* JADX INFO: renamed from: c */
    private final long f39150c;

    /* JADX INFO: renamed from: d */
    private final String f39151d;

    /* JADX INFO: renamed from: e */
    private final String f39152e;

    /* JADX INFO: renamed from: f */
    private final boolean f39153f;

    /* JADX INFO: renamed from: g */
    private final boolean f39154g;

    /* JADX INFO: renamed from: h */
    private final boolean f39155h;

    /* JADX INFO: renamed from: i */
    private final boolean f39156i;

    private C13775k(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f39148a = str;
        this.f39149b = str2;
        this.f39150c = j;
        this.f39151d = str3;
        this.f39152e = str4;
        this.f39153f = z;
        this.f39154g = z2;
        this.f39156i = z3;
        this.f39155h = z4;
    }

    /* JADX INFO: renamed from: a */
    private static int m40665a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    /* JADX INFO: renamed from: a */
    private static long m40666a(String str, int i, int i2) {
        int iM40665a = m40665a(str, i, i2, false);
        Matcher matcher = f39147m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int iIndexOf = -1;
        int i6 = -1;
        int i7 = -1;
        while (iM40665a < i2) {
            int iM40665a2 = m40665a(str, iM40665a + 1, i2, true);
            matcher.region(iM40665a, iM40665a2);
            if (i4 == -1 && matcher.usePattern(f39147m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i6 = Integer.parseInt(matcher.group(2));
                i7 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(f39146l).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (iIndexOf == -1) {
                Pattern pattern = f39145k;
                if (matcher.usePattern(pattern).matches()) {
                    iIndexOf = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                } else if (i3 != -1 && matcher.usePattern(f39144j).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            } else if (i3 != -1) {
            }
            iM40665a = m40665a(str, iM40665a2 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        }
        if (iIndexOf == -1) {
            throw new IllegalArgumentException();
        }
        if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        }
        if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        }
        if (i6 < 0 || i6 > 59) {
            throw new IllegalArgumentException();
        }
        if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(C13723c.f38786p);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, iIndexOf - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    static C13775k m40667a(long j, C13783s c13783s, String str) {
        long j2;
        String str2;
        String str3;
        int length = str.length();
        char c = ';';
        int iM40265a = C13723c.m40265a(str, 0, length, ';');
        int iM40265a2 = C13723c.m40265a(str, 0, iM40265a, C11341A5.f23808U);
        String strM40669a = null;
        if (iM40265a2 == iM40265a) {
            return null;
        }
        String strM40298d = C13723c.m40298d(str, 0, iM40265a2);
        if (strM40298d.isEmpty() || C13723c.m40296c(strM40298d) != -1) {
            return null;
        }
        String strM40298d2 = C13723c.m40298d(str, iM40265a2 + 1, iM40265a);
        if (C13723c.m40296c(strM40298d2) != -1) {
            return null;
        }
        int i = iM40265a + 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        long jM40666a = 253402300799999L;
        long jM40672b = -1;
        String strSubstring = null;
        while (i < length) {
            int iM40265a3 = C13723c.m40265a(str, i, length, c);
            int iM40265a4 = C13723c.m40265a(str, i, iM40265a3, C11341A5.f23808U);
            String strM40298d3 = C13723c.m40298d(str, i, iM40265a4);
            String strM40298d4 = iM40265a4 < iM40265a3 ? C13723c.m40298d(str, iM40265a4 + 1, iM40265a3) : "";
            if (strM40298d3.equalsIgnoreCase("expires")) {
                try {
                    jM40666a = m40666a(strM40298d4, 0, strM40298d4.length());
                    z = true;
                } catch (NumberFormatException | IllegalArgumentException unused) {
                }
            } else if (strM40298d3.equalsIgnoreCase("max-age")) {
                jM40672b = m40672b(strM40298d4);
                z = true;
            } else if (strM40298d3.equalsIgnoreCase(C11744X3.j.f26410D)) {
                strM40669a = m40669a(strM40298d4);
                z4 = false;
            } else if (strM40298d3.equalsIgnoreCase("path")) {
                strSubstring = strM40298d4;
            } else if (strM40298d3.equalsIgnoreCase("secure")) {
                z2 = true;
            } else if (strM40298d3.equalsIgnoreCase("httponly")) {
                z3 = true;
            }
            i = iM40265a3 + 1;
            c = ';';
        }
        if (jM40672b == Long.MIN_VALUE) {
            j2 = Long.MIN_VALUE;
        } else if (jM40672b != -1) {
            long j3 = j + (jM40672b <= 9223372036854775L ? jM40672b * 1000 : Long.MAX_VALUE);
            j2 = (j3 < j || j3 > 253402300799999L) ? 253402300799999L : j3;
        } else {
            j2 = jM40666a;
        }
        String strM40738g = c13783s.m40738g();
        if (strM40669a == null) {
            str2 = strM40738g;
        } else {
            if (!m40671a(strM40738g, strM40669a)) {
                return null;
            }
            str2 = strM40669a;
        }
        if (strM40738g.length() != str2.length() && PublicSuffixDatabase.m40638a().m40643a(str2) == null) {
            return null;
        }
        if (strSubstring == null || !strSubstring.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            String strM40733c = c13783s.m40733c();
            int iLastIndexOf = strM40733c.lastIndexOf(47);
            if (iLastIndexOf != 0) {
                strSubstring = strM40733c.substring(0, iLastIndexOf);
                str3 = strSubstring;
            } else {
                str3 = RemoteSettings.FORWARD_SLASH_STRING;
            }
        } else {
            str3 = strSubstring;
        }
        return new C13775k(strM40298d, strM40298d2, j2, str2, str3, z2, z3, z4, z);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static C13775k m40668a(C13783s c13783s, String str) {
        return m40667a(System.currentTimeMillis(), c13783s, str);
    }

    /* JADX INFO: renamed from: a */
    private static String m40669a(String str) {
        if (str.endsWith(".")) {
            throw new IllegalArgumentException();
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        String strM40271a = C13723c.m40271a(str);
        if (strM40271a != null) {
            return strM40271a;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: a */
    public static List<C13775k> m40670a(C13783s c13783s, C13782r c13782r) {
        List<String> listM40709c = c13782r.m40709c(HttpHeaders.SET_COOKIE);
        int size = listM40709c.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C13775k c13775kM40668a = m40668a(c13783s, listM40709c.get(i));
            if (c13775kM40668a != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c13775kM40668a);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m40671a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !C13723c.m40299d(str);
    }

    /* JADX INFO: renamed from: b */
    private static long m40672b(String str) {
        try {
            long j = Long.parseLong(str);
            if (j <= 0) {
                return Long.MIN_VALUE;
            }
            return j;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m40673a() {
        return this.f39148a;
    }

    /* JADX INFO: renamed from: a */
    String m40674a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f39148a);
        sb.append(C11341A5.f23808U);
        sb.append(this.f39149b);
        if (this.f39155h) {
            if (this.f39150c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C13738d.m40377a(new Date(this.f39150c)));
            }
        }
        if (!this.f39156i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f39151d);
        }
        sb.append("; path=");
        sb.append(this.f39152e);
        if (this.f39153f) {
            sb.append("; secure");
        }
        if (this.f39154g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public String m40675b() {
        return this.f39149b;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C13775k)) {
            return false;
        }
        C13775k c13775k = (C13775k) obj;
        return c13775k.f39148a.equals(this.f39148a) && c13775k.f39149b.equals(this.f39149b) && c13775k.f39151d.equals(this.f39151d) && c13775k.f39152e.equals(this.f39152e) && c13775k.f39150c == this.f39150c && c13775k.f39153f == this.f39153f && c13775k.f39154g == this.f39154g && c13775k.f39155h == this.f39155h && c13775k.f39156i == this.f39156i;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f39148a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f39149b.hashCode()) * 31) + this.f39151d.hashCode()) * 31) + this.f39152e.hashCode()) * 31;
        long j = this.f39150c;
        return ((((((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + (!this.f39153f ? 1 : 0)) * 31) + (!this.f39154g ? 1 : 0)) * 31) + (!this.f39155h ? 1 : 0)) * 31) + (!this.f39156i ? 1 : 0);
    }

    public String toString() {
        return m40674a(false);
    }
}
