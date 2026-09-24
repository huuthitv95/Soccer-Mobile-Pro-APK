package com.bytedance.adsdk.p065lr.p072ka;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.p065lr.C2015co;
import com.bytedance.adsdk.p065lr.C2125mj;
import com.bytedance.adsdk.p065lr.xha;
import com.ironsource.C11341A5;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ka.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C2120mj {

    /* JADX INFO: renamed from: lr */
    private final InterfaceC2115di f5112lr;

    /* JADX INFO: renamed from: ri */
    private final xha f5113ri;

    public C2120mj(xha xhaVar, InterfaceC2115di interfaceC2115di) {
        this.f5113ri = xhaVar;
        this.f5112lr = interfaceC2115di;
    }

    /* JADX INFO: renamed from: ik */
    private C2015co<xha> m7000ik(Context context, String str, String str2) {
        InterfaceC2118ka interfaceC2118ka = null;
        try {
            try {
                InterfaceC2118ka interfaceC2118kaMo6994ri = this.f5112lr.mo6994ri(str);
                if (!interfaceC2118kaMo6994ri.mo6999ri()) {
                    C2015co<xha> c2015co = new C2015co<>(new IllegalArgumentException(interfaceC2118kaMo6994ri.mo6997ka()));
                    if (interfaceC2118kaMo6994ri != null) {
                        try {
                            interfaceC2118kaMo6994ri.close();
                        } catch (IOException unused) {
                        }
                    }
                    return c2015co;
                }
                C2015co<xha> c2015coM7003ri = m7003ri(context, str, interfaceC2118kaMo6994ri.mo6998lr(), interfaceC2118kaMo6994ri.mo6996ik(), str2);
                c2015coM7003ri.m6474ri();
                if (interfaceC2118kaMo6994ri != null) {
                    try {
                        interfaceC2118kaMo6994ri.close();
                    } catch (IOException unused2) {
                    }
                }
                return c2015coM7003ri;
            } catch (Exception e) {
                C2015co<xha> c2015co2 = new C2015co<>(e);
                if (0 != 0) {
                    try {
                        interfaceC2118ka.close();
                    } catch (IOException unused3) {
                    }
                }
                return c2015co2;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            try {
                interfaceC2118ka.close();
                throw th;
            } catch (IOException unused4) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    private xha m7001lr(Context context, String str, String str2) {
        xha xhaVar;
        Pair<EnumC2117ik, InputStream> pairM7010ri;
        if (str2 == null || (xhaVar = this.f5113ri) == null || (pairM7010ri = xhaVar.m7010ri(str)) == null) {
            return null;
        }
        EnumC2117ik enumC2117ik = (EnumC2117ik) pairM7010ri.first;
        InputStream inputStream = (InputStream) pairM7010ri.second;
        C2015co<xha> c2015coM7040ri = enumC2117ik == EnumC2117ik.ZIP ? C2125mj.m7040ri(context, new ZipInputStream(inputStream), str2) : C2125mj.m7032lr(inputStream, str2);
        if (c2015coM7040ri.m6474ri() != null) {
            return c2015coM7040ri.m6474ri();
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    private C2015co<xha> m7002ri(Context context, String str, InputStream inputStream, String str2) throws IOException {
        xha xhaVar;
        return (str2 == null || (xhaVar = this.f5113ri) == null) ? C2125mj.m7040ri(context, new ZipInputStream(inputStream), (String) null) : C2125mj.m7040ri(context, new ZipInputStream(new FileInputStream(xhaVar.m7011ri(str, inputStream, EnumC2117ik.ZIP))), str);
    }

    /* JADX INFO: renamed from: ri */
    private C2015co<xha> m7003ri(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        C2015co<xha> c2015coM7002ri;
        EnumC2117ik enumC2117ik;
        xha xhaVar;
        if (str2 == null) {
            str2 = C11341A5.f23800M;
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            EnumC2117ik enumC2117ik2 = EnumC2117ik.ZIP;
            c2015coM7002ri = m7002ri(context, str, inputStream, str3);
            enumC2117ik = enumC2117ik2;
        } else {
            enumC2117ik = EnumC2117ik.JSON;
            c2015coM7002ri = m7004ri(str, inputStream, str3);
        }
        if (str3 != null && c2015coM7002ri.m6474ri() != null && (xhaVar = this.f5113ri) != null) {
            xhaVar.m7012ri(str, enumC2117ik);
        }
        return c2015coM7002ri;
    }

    /* JADX INFO: renamed from: ri */
    private C2015co<xha> m7004ri(String str, InputStream inputStream, String str2) throws IOException {
        xha xhaVar;
        return (str2 == null || (xhaVar = this.f5113ri) == null) ? C2125mj.m7032lr(inputStream, (String) null) : C2125mj.m7032lr(new FileInputStream(xhaVar.m7011ri(str, inputStream, EnumC2117ik.JSON).getAbsolutePath()), str);
    }

    /* JADX INFO: renamed from: ri */
    public C2015co<xha> m7005ri(Context context, String str, String str2) {
        xha xhaVarM7001lr = m7001lr(context, str, str2);
        return xhaVarM7001lr != null ? new C2015co<>(xhaVarM7001lr) : m7000ik(context, str, str2);
    }
}
