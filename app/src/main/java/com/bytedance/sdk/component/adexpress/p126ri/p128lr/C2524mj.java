package com.bytedance.sdk.component.adexpress.p126ri.p128lr;

import com.bytedance.sdk.component.adexpress.p126ri.p127ik.C2518ri;
import com.ironsource.C11341A5;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.ri.lr.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C2524mj {

    /* JADX INFO: renamed from: ri */
    private static C2518ri f7012ri;

    /* JADX INFO: renamed from: ik */
    public static void m9122ik() {
        C2520fi.m9087ri(C2520fi.m9075mj(), m9124lr(), "temp_pkg_info.json");
    }

    /* JADX INFO: renamed from: ka */
    public static void m9123ka() {
        C2520fi.m9086lr(C2520fi.m9075mj(), m9124lr(), "temp_pkg_info.json");
        f7012ri = null;
    }

    /* JADX INFO: renamed from: lr */
    public static synchronized C2518ri m9124lr() {
        return f7012ri;
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m9125lr(C2518ri c2518ri) {
        return C2520fi.m9085ik(m9124lr(), c2518ri);
    }

    /* JADX INFO: renamed from: ri */
    public static void m9126ri() {
        FileInputStream fileInputStream = null;
        try {
            try {
                File file = new File(C2520fi.m9075mj(), "temp_pkg_info.json");
                long length = file.length();
                Long lValueOf = Long.valueOf(length);
                lValueOf.getClass();
                if (length > 0 && file.exists() && file.isFile()) {
                    byte[] bArr = new byte[lValueOf.intValue()];
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileInputStream2.read(bArr);
                        C2518ri c2518riM9035ri = C2518ri.m9035ri(new JSONObject(new String(bArr, C11341A5.f23802O)));
                        if (c2518riM9035ri != null) {
                            f7012ri = c2518riM9035ri;
                            f7012ri.m9038ik();
                        }
                        fileInputStream = fileInputStream2;
                    } catch (Throwable unused) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                            return;
                        }
                        return;
                    }
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static synchronized void m9127ri(C2518ri c2518ri) {
        if (c2518ri != null) {
            if (c2518ri.m9044mj()) {
                f7012ri = c2518ri;
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m9128ri(String str) {
        return C2520fi.m9088ri(m9124lr(), str);
    }
}
