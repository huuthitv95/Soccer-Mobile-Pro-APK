package com.pgl.ssdk.ces.out;

import com.pgl.ssdk.C14265aw;
import com.pgl.ssdk.ces.C14271a;

/* JADX INFO: loaded from: classes7.dex */
public class PglSupport {

    /* JADX INFO: renamed from: a */
    private static String f41319a;

    static {
        C14265aw.m43021b("nms");
    }

    public static String getBootid() {
        String str;
        String str2 = f41319a;
        if (str2 != null) {
            return str2;
        }
        try {
            if (!C14265aw.m43019a("nms") || (str = (String) C14271a.meta(172, null, null)) == null) {
                return "";
            }
            f41319a = str;
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }
}
