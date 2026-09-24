package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.C11341A5;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.u */
/* JADX INFO: compiled from: MediaType.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13785u {

    /* JADX INFO: renamed from: e */
    private static final Pattern f39198e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: f */
    private static final Pattern f39199f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a */
    private final String f39200a;

    /* JADX INFO: renamed from: b */
    private final String f39201b;

    /* JADX INFO: renamed from: c */
    private final String f39202c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private final String f39203d;

    private C13785u(String str, String str2, String str3, @Nullable String str4) {
        this.f39200a = str;
        this.f39201b = str2;
        this.f39202c = str3;
        this.f39203d = str4;
    }

    /* JADX INFO: renamed from: a */
    public static C13785u m40766a(String str) {
        Matcher matcher = f39198e.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = strGroup.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f39199f.matcher(str);
        String str2 = null;
        for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + '\"');
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 != null && strGroup2.equalsIgnoreCase(C11341A5.f23801N)) {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                    strGroup3 = strGroup3.substring(1, strGroup3.length() - 1);
                }
                if (str2 != null && !strGroup3.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + strGroup3 + "\" for: \"" + str + '\"');
                }
                str2 = strGroup3;
            }
        }
        return new C13785u(str, lowerCase, lowerCase2, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static C13785u m40767b(String str) {
        try {
            return m40766a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public Charset m40768a(@Nullable Charset charset) {
        try {
            String str = this.f39203d;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C13785u) && ((C13785u) obj).f39200a.equals(this.f39200a);
    }

    public int hashCode() {
        return this.f39200a.hashCode();
    }

    public String toString() {
        return this.f39200a;
    }
}
