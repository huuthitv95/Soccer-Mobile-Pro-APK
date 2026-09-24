package com.iab.omid.library.bytedance2;

import com.iab.omid.library.bytedance2.utils.C11000g;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.c */
/* JADX INFO: loaded from: classes6.dex */
class C10972c {

    /* JADX INFO: renamed from: a */
    private static final Pattern f22822a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* JADX INFO: renamed from: b */
    private static final Pattern f22823b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* JADX INFO: renamed from: c */
    private static final Pattern f22824c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* JADX INFO: renamed from: d */
    private static final Pattern f22825d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* JADX INFO: renamed from: e */
    private static final Pattern f22826e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* JADX INFO: renamed from: f */
    private static final Pattern f22827f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* JADX INFO: renamed from: g */
    private static final Pattern f22828g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    /* JADX INFO: renamed from: a */
    static String m23453a(String str, String str2) {
        C11000g.m23603a(str, "HTML is null or empty");
        int[][] iArrM23456a = m23456a(str);
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + 16);
        if (!m23458b(str, sb, f22823b, str2, iArrM23456a) && !m23455a(str, sb, f22822a, str2, iArrM23456a) && !m23458b(str, sb, f22825d, str2, iArrM23456a) && !m23455a(str, sb, f22824c, str2, iArrM23456a) && !m23458b(str, sb, f22827f, str2, iArrM23456a) && !m23455a(str, sb, f22826e, str2, iArrM23456a) && !m23455a(str, sb, f22828g, str2, iArrM23456a)) {
            return str2 + str;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private static boolean m23454a(int i, int[][] iArr) {
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
    private static boolean m23455a(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (!m23454a(iStart, iArr)) {
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
    private static int[][] m23456a(String str) {
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
    static String m23457b(String str, String str2) {
        return m23453a(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    /* JADX INFO: renamed from: b */
    private static boolean m23458b(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (!m23454a(iStart, iArr)) {
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
