package com.bytedance.adsdk.p077ri.p078lr.p079fi;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.fi.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2176ri {
    /* JADX INFO: renamed from: ik */
    public static boolean m7226ik(char c) {
        return c >= '0' && c <= '9';
    }

    /* JADX INFO: renamed from: ka */
    public static boolean m7227ka(char c) {
        return '+' == c || '-' == c || '*' == c || '/' == c || '%' == c || '=' == c || '>' == c || '<' == c || '!' == c || '&' == c || '|' == c || '?' == c || ':' == c;
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m7228lr(char c) {
        if (c < 'A' || c > 'Z') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m7229ri(char c) {
        return c == ' ';
    }
}
