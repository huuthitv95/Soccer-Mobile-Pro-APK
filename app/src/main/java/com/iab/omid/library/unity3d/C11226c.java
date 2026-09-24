package com.iab.omid.library.unity3d;

import com.iab.omid.library.unity3d.utils.C11253g;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.c */
/* JADX INFO: loaded from: classes6.dex */
class C11226c {

    /* JADX INFO: renamed from: a */
    private static final Pattern f23498a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* JADX INFO: renamed from: b */
    private static final Pattern f23499b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* JADX INFO: renamed from: c */
    private static final Pattern f23500c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* JADX INFO: renamed from: d */
    private static final Pattern f23501d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* JADX INFO: renamed from: e */
    private static final Pattern f23502e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* JADX INFO: renamed from: f */
    private static final Pattern f23503f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* JADX INFO: renamed from: g */
    private static final Pattern f23504g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    /* JADX INFO: renamed from: a */
    static String m24719a(String str, String str2) {
        C11253g.m24861a(str, "HTML is null or empty");
        int[][] iArrM24722a = m24722a(str);
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + 16);
        if (!m24724b(str, sb, f23499b, str2, iArrM24722a) && !m24721a(str, sb, f23498a, str2, iArrM24722a) && !m24724b(str, sb, f23501d, str2, iArrM24722a) && !m24721a(str, sb, f23500c, str2, iArrM24722a) && !m24724b(str, sb, f23503f, str2, iArrM24722a) && !m24721a(str, sb, f23502e, str2, iArrM24722a) && !m24721a(str, sb, f23504g, str2, iArrM24722a)) {
            return str2 + str;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private static boolean m24720a(int i, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i >= iArr2[0] && i <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m24721a(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (!m24720a(iStart, iArr)) {
                sb.append(str.substring(0, matcher.end()));
                sb.append(str2);
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = iEnd;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static int[][] m24722a(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int iIndexOf = str.indexOf("<!--", i);
            if (iIndexOf >= 0) {
                int iIndexOf2 = str.indexOf("-->", iIndexOf);
                if (iIndexOf2 >= 0) {
                    arrayList.add(new int[]{iIndexOf, iIndexOf2});
                    i = iIndexOf2 + 3;
                } else {
                    arrayList.add(new int[]{iIndexOf, length});
                }
            }
            i = length;
        }
        return (int[][]) arrayList.toArray((int[][]) Array.newInstance((Class<?>) Integer.TYPE, 0, 2));
    }

    /* JADX INFO: renamed from: b */
    static String m24723b(String str, String str2) {
        return m24719a(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    /* JADX INFO: renamed from: b */
    private static boolean m24724b(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (!m24720a(iStart, iArr)) {
                sb.append(str.substring(0, matcher.end() - 2));
                sb.append(">");
                sb.append(str2);
                sb.append("</");
                sb.append(matcher.group(1));
                sb.append(">");
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = iEnd;
        }
        return false;
    }
}
