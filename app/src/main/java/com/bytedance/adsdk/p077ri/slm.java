package com.bytedance.adsdk.p077ri;

import android.text.TextUtils;
import com.bytedance.adsdk.p077ri.p078lr.p086ri.C2218ri;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes3.dex */
public class slm {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ri */
    public static jbs m7312ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case -1919300188:
                if (str.equals("toNumber")) {
                    b = 0;
                }
                break;
            case -1776922004:
                if (str.equals("toString")) {
                    b = 1;
                }
                break;
            case -1368121510:
                if (str.equals("formatDecimal")) {
                    b = 2;
                }
                break;
            case -652088201:
                if (str.equals("modArray")) {
                    b = 3;
                }
                break;
            case 3143097:
                if (str.equals("find")) {
                    b = 4;
                }
                break;
            case 3530753:
                if (str.equals("size")) {
                    b = 5;
                }
                break;
            case 94642797:
                if (str.equals("chunk")) {
                    b = 6;
                }
                break;
            case 96955127:
                if (str.equals("exist")) {
                    b = 7;
                }
                break;
            case 109648666:
                if (str.equals("split")) {
                    b = 8;
                }
                break;
            case 515198113:
                if (str.equals("decodeUrl")) {
                    b = 9;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    b = 10;
                }
                break;
            case 1508134777:
                if (str.equals("encodeUrl")) {
                    b = Ascii.f22503VT;
                }
                break;
            case 2056988195:
                if (str.equals("isDigit")) {
                    b = Ascii.f22492FF;
                }
                break;
        }
        switch (b) {
            case 0:
                return new C2168aw();
            case 1:
                return new bgr();
            case 2:
                return new xha();
            case 3:
                return new C2220qt();
            case 4:
                return new C2170di();
            case 5:
                return new C2224sf();
            case 6:
                return new C2221ri();
            case 7:
                return new C2171fi();
            case 8:
                return new C2169co();
            case 9:
                return new C2174lr();
            case 10:
                return new C2225vr();
            case 11:
                return new C2173ka();
            case 12:
                return new C2219mj();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static Object m7313ri(C2218ri c2218ri) {
        jbs jbsVarM7312ri;
        if (c2218ri == null || (jbsVarM7312ri = m7312ri(c2218ri.m7307ri())) == null) {
            return null;
        }
        return jbsVarM7312ri.mo7214ri(null, c2218ri.m7306lr());
    }
}
