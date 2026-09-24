package com.iab.omid.library.vungle;

import com.iab.omid.library.vungle.utils.C11316g;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.c */
/* JADX INFO: loaded from: classes6.dex */
class C11284c {

    /* JADX INFO: renamed from: a */
    private static final Pattern f23644a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* JADX INFO: renamed from: b */
    private static final Pattern f23645b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* JADX INFO: renamed from: c */
    private static final Pattern f23646c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* JADX INFO: renamed from: d */
    private static final Pattern f23647d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* JADX INFO: renamed from: e */
    private static final Pattern f23648e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* JADX INFO: renamed from: f */
    private static final Pattern f23649f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* JADX INFO: renamed from: g */
    private static final Pattern f23650g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    /* JADX INFO: renamed from: a */
    static String m24975a(String str, String str2) {
        C11316g.m25161a(str, "HTML is null or empty");
        int[][] iArrM24978a = m24978a(str);
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + 16);
        if (!m24980b(str, sb, f23645b, str2, iArrM24978a) && !m24977a(str, sb, f23644a, str2, iArrM24978a) && !m24980b(str, sb, f23647d, str2, iArrM24978a) && !m24977a(str, sb, f23646c, str2, iArrM24978a) && !m24980b(str, sb, f23649f, str2, iArrM24978a) && !m24977a(str, sb, f23648e, str2, iArrM24978a) && !m24977a(str, sb, f23650g, str2, iArrM24978a)) {
            return str2 + str;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private static boolean m24976a(int i, int[][] iArr) {
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
    private static boolean m24977a(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (!m24976a(iStart, iArr)) {
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
    private static int[][] m24978a(String str) {
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
    static String m24979b(String str, String str2) {
        return m24975a(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    /* JADX INFO: renamed from: b */
    private static boolean m24980b(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (!m24976a(iStart, iArr)) {
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
