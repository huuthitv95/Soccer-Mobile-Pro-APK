package com.bytedance.adsdk.p065lr;

import android.content.Context;
import android.os.Trace;
import com.bytedance.adsdk.p065lr.p072ka.C2119lr;
import com.bytedance.adsdk.p065lr.p072ka.C2120mj;
import com.bytedance.adsdk.p065lr.p072ka.InterfaceC2115di;
import com.bytedance.adsdk.p065lr.p072ka.InterfaceC2116fi;
import com.bytedance.adsdk.p065lr.p072ka.xha;
import java.io.File;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2023fi {

    /* JADX INFO: renamed from: co */
    private static volatile xha f4759co = null;

    /* JADX INFO: renamed from: di */
    private static long[] f4760di = null;

    /* JADX INFO: renamed from: fi */
    private static String[] f4761fi = null;

    /* JADX INFO: renamed from: ik */
    private static boolean f4762ik = true;
    private static InterfaceC2115di jbs = null;

    /* JADX INFO: renamed from: ka */
    private static boolean f4763ka = true;

    /* JADX INFO: renamed from: lr */
    private static boolean f4764lr;

    /* JADX INFO: renamed from: mj */
    private static int f4765mj;

    /* JADX INFO: renamed from: qt */
    private static InterfaceC2116fi f4766qt;

    /* JADX INFO: renamed from: ri */
    public static boolean f4767ri;

    /* JADX INFO: renamed from: sf */
    private static volatile C2120mj f4768sf;
    private static int xha;

    /* JADX INFO: renamed from: lr */
    public static float m6596lr(String str) {
        int i = f4765mj;
        if (i > 0) {
            f4765mj = i - 1;
            return 0.0f;
        }
        if (!f4764lr) {
            return 0.0f;
        }
        int i2 = xha - 1;
        xha = i2;
        if (i2 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(f4761fi[i2])) {
            Trace.endSection();
            return (System.nanoTime() - f4760di[xha]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f4761fi[xha] + ".");
    }

    /* JADX INFO: renamed from: lr */
    public static xha m6597lr(Context context) {
        xha xhaVar;
        if (!f4762ik) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        xha xhaVar2 = f4759co;
        if (xhaVar2 != null) {
            return xhaVar2;
        }
        synchronized (xha.class) {
            xhaVar = f4759co;
            if (xhaVar == null) {
                InterfaceC2116fi interfaceC2116fi = f4766qt;
                if (interfaceC2116fi == null) {
                    interfaceC2116fi = new InterfaceC2116fi() { // from class: com.bytedance.adsdk.lr.fi.1
                        @Override // com.bytedance.adsdk.p065lr.p072ka.InterfaceC2116fi
                        /* JADX INFO: renamed from: ri */
                        public File mo6601ri() {
                            return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                        }
                    };
                }
                xhaVar = new xha(interfaceC2116fi);
                f4759co = xhaVar;
            }
        }
        return xhaVar;
    }

    /* JADX INFO: renamed from: ri */
    public static C2120mj m6598ri(Context context) {
        C2120mj c2120mj;
        C2120mj c2120mj2 = f4768sf;
        if (c2120mj2 != null) {
            return c2120mj2;
        }
        synchronized (C2120mj.class) {
            c2120mj = f4768sf;
            if (c2120mj == null) {
                xha xhaVarM6597lr = m6597lr(context);
                InterfaceC2115di c2119lr = jbs;
                if (c2119lr == null) {
                    c2119lr = new C2119lr();
                }
                c2120mj = new C2120mj(xhaVarM6597lr, c2119lr);
                f4768sf = c2120mj;
            }
        }
        return c2120mj;
    }

    /* JADX INFO: renamed from: ri */
    public static void m6599ri(String str) {
        if (f4764lr) {
            int i = xha;
            if (i == 20) {
                f4765mj++;
                return;
            }
            f4761fi[i] = str;
            f4760di[i] = System.nanoTime();
            Trace.beginSection(str);
            xha++;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m6600ri() {
        return f4763ka;
    }
}
