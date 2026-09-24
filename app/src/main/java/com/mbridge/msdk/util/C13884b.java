package com.mbridge.msdk.util;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.out.MBConfiguration;

/* JADX INFO: renamed from: com.mbridge.msdk.util.b */
/* JADX INFO: compiled from: CommonUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13884b {

    /* JADX INFO: renamed from: a */
    private static volatile Boolean f39660a;

    /* JADX INFO: renamed from: b */
    private static volatile Boolean f39661b;

    /* JADX INFO: renamed from: a */
    public static boolean m41421a() {
        if (f39660a == null) {
            try {
                boolean z = Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 2;
                Boolean boolValueOf = Boolean.valueOf(z);
                f39660a = boolValueOf;
                boolValueOf.getClass();
                return z;
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37817b("CommonUtils", "isChina", e);
                }
            }
        }
        return f39660a != null && f39660a.booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m41422b() {
        if (f39661b == null) {
            try {
                boolean z = Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 1;
                Boolean boolValueOf = Boolean.valueOf(z);
                f39661b = boolValueOf;
                boolValueOf.getClass();
                return z;
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37817b("CommonUtils", "isOversea", e);
                }
            }
        }
        return f39661b != null && f39661b.booleanValue();
    }
}
