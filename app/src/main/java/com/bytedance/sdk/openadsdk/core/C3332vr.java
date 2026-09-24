package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2723mj;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.p246nr.C3476ik;
import com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka;
import com.bytedance.sdk.openadsdk.p246nr.p249lr.C3481ri;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.vr */
/* JADX INFO: loaded from: classes3.dex */
public class C3332vr {

    /* JADX INFO: renamed from: di */
    private static volatile HandlerThread f11693di;

    /* JADX INFO: renamed from: ik */
    public static long f11695ik;

    /* JADX INFO: renamed from: ka */
    public static long f11696ka;

    /* JADX INFO: renamed from: mj */
    private static final Runnable f11698mj;

    /* JADX INFO: renamed from: ri */
    public static volatile boolean f11699ri;

    /* JADX INFO: renamed from: lr */
    public static AtomicBoolean f11697lr = new AtomicBoolean(false);

    /* JADX INFO: renamed from: fi */
    private static volatile int f11694fi = 0;
    private static volatile Handler xha = null;

    static {
        HandlerThread handlerThread = new HandlerThread("pag_init_handle", 10) { // from class: com.bytedance.sdk.openadsdk.core.vr.1

            /* JADX INFO: renamed from: ri */
            boolean f11700ri = false;

            @Override // java.lang.Thread
            public synchronized void start() {
                if (this.f11700ri) {
                    return;
                }
                this.f11700ri = true;
                super.start();
            }
        };
        f11693di = handlerThread;
        handlerThread.start();
        C2723mj.m10252ri(f11693di);
        f11696ka = System.currentTimeMillis();
        f11698mj = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.vr.2
            @Override // java.lang.Runnable
            public void run() {
                if (C3322sf.m14819lr().m14886ud()) {
                    C3332vr.m14974di();
                    return;
                }
                String strM14820lr = C3322sf.m14820lr(C3299nr.m14642ri());
                int iM14822ri = C3322sf.m14822ri(C3299nr.m14642ri());
                if (!TextUtils.equals(strM14820lr, C3322sf.f11622ka) || iM14822ri != C3322sf.f11619fi) {
                    C3322sf.m14819lr().m14877ri(6, true);
                    C3322sf.f11622ka = strM14820lr;
                    C3322sf.f11619fi = iM14822ri;
                }
                C3332vr.m14974di();
            }
        };
    }

    /* JADX INFO: renamed from: di */
    public static void m14974di() {
        Handler handlerM14978lr = m14978lr();
        Runnable runnable = f11698mj;
        handlerM14978lr.removeCallbacks(runnable);
        m14978lr().postDelayed(runnable, 10000L);
    }

    /* JADX INFO: renamed from: fi */
    public static boolean m14975fi() {
        return m14977ka() == 1;
    }

    /* JADX INFO: renamed from: ik */
    public static Handler m14976ik() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: ka */
    public static int m14977ka() {
        return f11694fi;
    }

    /* JADX INFO: renamed from: lr */
    public static Handler m14978lr() {
        if (f11693di == null || !f11693di.isAlive()) {
            synchronized (C3332vr.class) {
                if (f11693di == null || !f11693di.isAlive()) {
                    f11693di = C2723mj.m10251ri("pag_init_handle", -1);
                    xha = new Handler(f11693di.getLooper());
                }
            }
        } else if (xha == null) {
            synchronized (C3332vr.class) {
                if (xha == null) {
                    xha = new Handler(f11693di.getLooper());
                }
            }
        }
        return xha;
    }

    /* JADX INFO: renamed from: ri */
    public static long m14979ri() {
        return f11696ka;
    }

    /* JADX INFO: renamed from: ri */
    public static void m14980ri(int i) {
        f11694fi = i;
    }

    /* JADX INFO: renamed from: ri */
    public static void m14981ri(long j) {
        f11696ka = j;
    }

    /* JADX INFO: renamed from: ri */
    public static void m14982ri(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if ("mediation".equals(jSONObject.optString("name", ""))) {
                    C3304qt.m14669lr().m14691lr(jSONObject.optString("value", ""));
                    return;
                }
            }
        } catch (Throwable th) {
            C2707ac.m10196ik("InitHelper", th.getMessage());
        }
    }

    public static void xha() {
        m14978lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.vr.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C3476ik.m15764ri(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.vr.3.1
                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                        /* JADX INFO: renamed from: ri */
                        public C3481ri mo10650ri() {
                            C3481ri c3481ri = new C3481ri();
                            c3481ri.m15784lr("init");
                            return c3481ri;
                        }
                    });
                } catch (Throwable th) {
                    C2707ac.m10196ik("InitHelper", th.getMessage());
                }
            }
        });
    }
}
