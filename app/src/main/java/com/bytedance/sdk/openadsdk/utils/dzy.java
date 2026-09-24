package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.InterfaceC2688ri;
import com.bytedance.sdk.component.p165mj.C2683ri;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.p165mj.p166lr.C2677ka;
import com.bytedance.sdk.component.p165mj.p166lr.InterfaceC2679ri;
import com.bytedance.sdk.component.p165mj.p166lr.ThreadFactoryC2675fi;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.unity3d.ads.BuildConfig;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class dzy {

    /* JADX INFO: renamed from: co */
    private static volatile com.bytedance.sdk.component.p165mj.p166lr.xha f13133co;

    /* JADX INFO: renamed from: di */
    private static volatile com.bytedance.sdk.component.p165mj.p166lr.xha f13134di;

    /* JADX INFO: renamed from: fi */
    private static volatile com.bytedance.sdk.component.p165mj.p166lr.xha f13135fi;

    /* JADX INFO: renamed from: ik */
    private static volatile boolean f13136ik;
    private static volatile com.bytedance.sdk.component.p165mj.p166lr.xha jbs;

    /* JADX INFO: renamed from: ka */
    private static volatile com.bytedance.sdk.component.p165mj.p166lr.xha f13137ka;

    /* JADX INFO: renamed from: lr */
    private static volatile ThreadPoolExecutor f13138lr;

    /* JADX INFO: renamed from: mj */
    private static volatile com.bytedance.sdk.component.p165mj.p166lr.xha f13139mj;

    /* JADX INFO: renamed from: qt */
    private static volatile com.bytedance.sdk.component.p165mj.p166lr.xha f13140qt;

    /* JADX INFO: renamed from: ri */
    private static volatile ScheduledExecutorService f13141ri;

    /* JADX INFO: renamed from: sf */
    private static volatile com.bytedance.sdk.component.p165mj.p166lr.xha f13142sf;
    private static volatile com.bytedance.sdk.component.p165mj.p166lr.xha xha;

    static {
        C2677ka.m10055ri(new InterfaceC2679ri() { // from class: com.bytedance.sdk.openadsdk.utils.dzy.1
            @Override // com.bytedance.sdk.component.p165mj.p166lr.InterfaceC2679ri
            /* JADX INFO: renamed from: ri */
            public void mo10058ri(com.bytedance.sdk.component.p165mj.p166lr.xha xhaVar, AbstractRunnableC2676ik abstractRunnableC2676ik) {
                abstractRunnableC2676ik.getName();
                new RuntimeException();
            }
        });
        C2683ri.m10082ri(new InterfaceC2688ri() { // from class: com.bytedance.sdk.openadsdk.utils.dzy.2
            @Override // com.bytedance.sdk.component.InterfaceC2688ri
            /* JADX INFO: renamed from: ri */
            public void mo10102ri(Runnable runnable) {
                dzy.m16396ik(runnable);
            }
        });
        f13138lr = null;
        f13136ik = false;
    }

    /* JADX INFO: renamed from: aw */
    private static com.bytedance.sdk.component.p165mj.p166lr.xha m16388aw() {
        com.bytedance.sdk.component.p165mj.p166lr.xha xhaVar;
        com.bytedance.sdk.component.p165mj.p166lr.xha xhaVar2 = f13135fi;
        if (!m16412ri(xhaVar2)) {
            return xhaVar2;
        }
        synchronized (dzy.class) {
            if (m16412ri(f13135fi)) {
                try {
                    f13135fi = m16407ri("log", f13135fi);
                } catch (Throwable th) {
                    th.getMessage();
                }
                if (f13135fi == null) {
                    f13135fi = m16389bu();
                }
                xhaVar = f13135fi;
            } else {
                xhaVar = f13135fi;
            }
            throw th;
        }
        return xhaVar;
    }

    private static com.bytedance.sdk.component.p165mj.p166lr.xha bgr() {
        com.bytedance.sdk.component.p165mj.p166lr.xha xhaVar;
        com.bytedance.sdk.component.p165mj.p166lr.xha xhaVar2 = f13139mj;
        if (!m16412ri(xhaVar2)) {
            return xhaVar2;
        }
        synchronized (dzy.class) {
            if (m16412ri(f13139mj)) {
                try {
                    f13139mj = m16407ri("image", f13139mj);
                } catch (Throwable th) {
                    th.getMessage();
                }
                if (f13139mj == null) {
                    f13139mj = m16389bu();
                }
                xhaVar = f13139mj;
            } else {
                xhaVar = f13139mj;
            }
            throw th;
        }
        return xhaVar;
    }

    /* JADX INFO: renamed from: bu */
    private static com.bytedance.sdk.component.p165mj.p166lr.xha m16389bu() {
        com.bytedance.sdk.component.p165mj.p166lr.xha xhaVar;
        com.bytedance.sdk.component.p165mj.p166lr.xha xhaVar2 = f13133co;
        if (xhaVar2 != null) {
            return xhaVar2;
        }
        synchronized (dzy.class) {
            if (f13133co == null) {
                try {
                    f13133co = m16399lr(BuildConfig.FLAVOR).m10081ri();
                } catch (Throwable th) {
                    th.getMessage();
                }
                xhaVar = f13133co;
            } else {
                xhaVar = f13133co;
            }
            throw th;
        }
        return xhaVar;
    }

    /* JADX INFO: renamed from: co */
    private static ThreadPoolExecutor m16390co() {
        com.bytedance.sdk.component.p165mj.p166lr.xha xhaVar;
        com.bytedance.sdk.component.p165mj.p166lr.xha xhaVar2 = f13137ka;
        if (!m16412ri(xhaVar2)) {
            return xhaVar2;
        }
        synchronized (dzy.class) {
            if (m16412ri(f13137ka)) {
                try {
                    f13137ka = m16407ri("ad", f13137ka);
                } catch (Throwable th) {
                    th.getMessage();
                }
                if (f13137ka == null) {
                    f13137ka = m16389bu();
                }
                xhaVar = f13137ka;
            } else {
                xhaVar = f13137ka;
            }
            throw th;
        }
        return xhaVar;
    }

    /* JADX INFO: renamed from: di */
    public static boolean m16391di() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    /* JADX INFO: renamed from: fi */
    public static ExecutorService m16392fi() {
        return jbs();
    }

    /* JADX INFO: renamed from: fi */
    public static void m16393fi(AbstractRunnableC2676ik abstractRunnableC2676ik) {
        m16413sf().execute(abstractRunnableC2676ik);
    }

    /* JADX INFO: renamed from: ik */
    public static ExecutorService m16394ik() {
        return slm();
    }

    /* JADX INFO: renamed from: ik */
    public static void m16395ik(AbstractRunnableC2676ik abstractRunnableC2676ik) {
        if (abstractRunnableC2676ik == null || C3581oh.f13200ri) {
            return;
        }
        m16390co().execute(abstractRunnableC2676ik);
    }

    /* JADX INFO: renamed from: ik */
    public static void m16396ik(Runnable runnable) {
        if (C3581oh.f13200ri) {
            return;
        }
        m16414vr().execute(runnable);
    }

    public static com.bytedance.sdk.component.p165mj.p166lr.xha jbs() {
        com.bytedance.sdk.component.p165mj.p166lr.xha xhaVar;
        com.bytedance.sdk.component.p165mj.p166lr.xha xhaVar2 = f13134di;
        if (!m16412ri(xhaVar2)) {
            return xhaVar2;
        }
        synchronized (dzy.class) {
            if (m16412ri(f13134di)) {
                try {
                    f13134di = m16407ri("cache", f13134di);
                } catch (Throwable th) {
                    th.getMessage();
                }
                if (f13134di == null) {
                    f13134di = m16389bu();
                }
                xhaVar = f13134di;
            } else {
                xhaVar = f13134di;
            }
            throw th;
        }
        return xhaVar;
    }

    /* JADX INFO: renamed from: ka */
    public static ExecutorService m16397ka() {
        return m16388aw();
    }

    /* JADX INFO: renamed from: ka */
    public static void m16398ka(AbstractRunnableC2676ik abstractRunnableC2676ik) {
        if (C3581oh.f13200ri) {
            return;
        }
        m16390co().execute(abstractRunnableC2676ik);
    }

    /* JADX INFO: renamed from: lr */
    private static com.bytedance.sdk.component.p165mj.p166lr.xha.C2682ri m16399lr(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        com.bytedance.sdk.component.p165mj.p166lr.xha.C2682ri c2682ri = new com.bytedance.sdk.component.p165mj.p166lr.xha.C2682ri();
        str.hashCode();
        switch (str) {
            case "express":
                return c2682ri.m10079ri(str).m10077ri(2).m10075lr(4).m10073ik(0).m10078ri(10000L).m10080ri(true).m10072fi(-1).m10074ka(10).m10076lr(false);
            case "ad":
                return c2682ri.m10079ri(str).m10077ri(4).m10075lr(4).m10073ik(0).m10078ri(20000L).m10080ri(true).m10072fi(-1).m10074ka(10).m10076lr(false);
            case "io":
                return c2682ri.m10079ri(str).m10077ri(4).m10075lr(10).m10073ik(0).m10078ri(20000L).m10080ri(true).m10072fi(-1).m10074ka(10).m10076lr(false);
            case "log":
                return c2682ri.m10079ri(str).m10077ri(4).m10075lr(6).m10073ik(2).m10078ri(20000L).m10080ri(true).m10072fi(-1).m10074ka(10).m10076lr(false);
            case "net":
                return c2682ri.m10079ri(str).m10077ri(10).m10075lr(10).m10073ik(0).m10078ri(10000L).m10080ri(true).m10072fi(-1).m10074ka(10).m10076lr(false);
            case "aidl":
                return c2682ri.m10079ri(str).m10077ri(2).m10075lr(4).m10073ik(0).m10078ri(10000L).m10080ri(true).m10072fi(-1).m10074ka(10).m10076lr(false);
            case "cache":
                return c2682ri.m10079ri(str).m10077ri(0).m10075lr(0).m10073ik(0).m10078ri(5000L).m10080ri(true).m10072fi(-1).m10074ka(20).m10076lr(false);
            case "image":
                return c2682ri.m10079ri(str).m10077ri(3).m10075lr(3).m10073ik(0).m10078ri(20000L).m10080ri(true).m10072fi(-1).m10074ka(10).m10076lr(false);
            case "monitor":
                return c2682ri.m10079ri(str).m10077ri(2).m10075lr(2).m10073ik(0).m10078ri(10000L).m10080ri(true).m10072fi(-1).m10074ka(10).m10076lr(false);
            case "imgdisk":
                return c2682ri.m10079ri(str).m10077ri(1).m10075lr(2).m10073ik(3).m10078ri(10000L).m10080ri(true).m10072fi(-1).m10074ka(10).m10076lr(false);
            default:
                return c2682ri.m10079ri(str).m10077ri(8).m10075lr(16).m10073ik(2).m10078ri(20000L).m10080ri(true).m10072fi(-1).m10074ka(10).m10076lr(false);
        }
    }

    /* JADX INFO: renamed from: lr */
    public static ExecutorService m16400lr() {
        return bgr();
    }

    /* JADX INFO: renamed from: lr */
    public static void m16401lr(AbstractRunnableC2676ik abstractRunnableC2676ik) {
        if (abstractRunnableC2676ik == null || C3581oh.f13200ri) {
            return;
        }
        m16388aw().execute(abstractRunnableC2676ik);
    }

    /* JADX INFO: renamed from: lr */
    public static void m16402lr(AbstractRunnableC2676ik abstractRunnableC2676ik, int i) {
        if (abstractRunnableC2676ik == null || C3581oh.f13200ri) {
            return;
        }
        abstractRunnableC2676ik.setPriority(i);
        m16388aw().execute(abstractRunnableC2676ik);
    }

    /* JADX INFO: renamed from: lr */
    public static void m16403lr(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        C3332vr.m14976ik().removeCallbacks(runnable);
    }

    /* JADX INFO: renamed from: mj */
    public static ExecutorService m16404mj() {
        return m16414vr();
    }

    /* JADX INFO: renamed from: qt */
    public static com.bytedance.sdk.component.p165mj.p166lr.xha m16405qt() {
        com.bytedance.sdk.component.p165mj.p166lr.xha xhaVar;
        com.bytedance.sdk.component.p165mj.p166lr.xha xhaVar2 = jbs;
        if (!m16412ri(xhaVar2)) {
            return xhaVar2;
        }
        synchronized (dzy.class) {
            if (m16412ri(jbs)) {
                try {
                    jbs = m16407ri("express", jbs);
                } catch (Throwable th) {
                    th.getMessage();
                }
                if (jbs == null) {
                    jbs = m16389bu();
                }
                xhaVar = jbs;
            } else {
                xhaVar = jbs;
            }
            throw th;
        }
        return xhaVar;
    }

    /* JADX INFO: renamed from: ri */
    private static com.bytedance.sdk.component.p165mj.p166lr.xha.C2682ri m16406ri(String str) {
        com.bytedance.sdk.component.p165mj.p166lr.xha.C2682ri c2682riM16399lr = m16399lr(str);
        try {
            if (C3322sf.nbc()) {
                c2682riM16399lr.m10076lr(true);
                JSONObject jSONObjectJxw = C3322sf.m14819lr().jxw();
                JSONObject jSONObjectOptJSONObject = jSONObjectJxw != null ? jSONObjectJxw.optJSONObject(str) : null;
                if (jSONObjectOptJSONObject != null) {
                    c2682riM16399lr.m10076lr(true);
                    if (jSONObjectOptJSONObject.has("coreSize")) {
                        c2682riM16399lr.m10077ri(jSONObjectOptJSONObject.optInt("coreSize"));
                    }
                    if (jSONObjectOptJSONObject.has(SDKConstants.PARAM_CONTEXT_MAX_SIZE)) {
                        c2682riM16399lr.m10075lr(jSONObjectOptJSONObject.optInt(SDKConstants.PARAM_CONTEXT_MAX_SIZE));
                    }
                    if (jSONObjectOptJSONObject.has("createSize")) {
                        c2682riM16399lr.m10073ik(jSONObjectOptJSONObject.optInt("createSize"));
                    }
                    if (jSONObjectOptJSONObject.has("keepAlive")) {
                        c2682riM16399lr.m10078ri(jSONObjectOptJSONObject.optInt("keepAlive"));
                    }
                    if (jSONObjectOptJSONObject.has("allowCoreTimeOut")) {
                        c2682riM16399lr.m10080ri(jSONObjectOptJSONObject.optBoolean("allowCoreTimeOut"));
                    }
                    if (jSONObjectOptJSONObject.has("reportLogThreshold")) {
                        jSONObjectOptJSONObject.optInt("reportLogThreshold");
                    }
                    if (jSONObjectOptJSONObject.has("logTaskCount")) {
                        jSONObjectOptJSONObject.optInt("logTaskCount");
                        return c2682riM16399lr;
                    }
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return c2682riM16399lr;
    }

    /* JADX INFO: renamed from: ri */
    private static com.bytedance.sdk.component.p165mj.p166lr.xha m16407ri(String str, com.bytedance.sdk.component.p165mj.p166lr.xha xhaVar) {
        com.bytedance.sdk.component.p165mj.p166lr.xha.C2682ri c2682riM16406ri = m16406ri(str);
        if (xhaVar == null) {
            return c2682riM16406ri.m10081ri();
        }
        xhaVar.m10062ri(c2682riM16406ri);
        return xhaVar;
    }

    /* JADX INFO: renamed from: ri */
    public static ScheduledExecutorService m16408ri() {
        if (f13141ri == null) {
            synchronized (dzy.class) {
                if (f13141ri == null) {
                    f13141ri = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC2675fi("scheduled"));
                }
            }
        }
        return f13141ri;
    }

    /* JADX INFO: renamed from: ri */
    public static void m16409ri(AbstractRunnableC2676ik abstractRunnableC2676ik) {
        if (C3581oh.f13200ri) {
            return;
        }
        jbs().execute(abstractRunnableC2676ik);
    }

    /* JADX INFO: renamed from: ri */
    public static void m16410ri(AbstractRunnableC2676ik abstractRunnableC2676ik, int i) {
        if (abstractRunnableC2676ik == null || C3581oh.f13200ri) {
            return;
        }
        abstractRunnableC2676ik.setPriority(i);
        m16414vr().execute(abstractRunnableC2676ik);
    }

    /* JADX INFO: renamed from: ri */
    public static void m16411ri(Runnable runnable) {
        if (runnable == null || C3581oh.f13200ri) {
            return;
        }
        if (m16391di()) {
            runnable.run();
        } else {
            C3332vr.m14976ik().post(runnable);
        }
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m16412ri(com.bytedance.sdk.component.p165mj.p166lr.xha xhaVar) {
        if (xhaVar != null) {
            return !xhaVar.m10063ri() && C3322sf.nbc();
        }
        return true;
    }

    /* JADX INFO: renamed from: sf */
    public static com.bytedance.sdk.component.p165mj.p166lr.xha m16413sf() {
        com.bytedance.sdk.component.p165mj.p166lr.xha xhaVar;
        com.bytedance.sdk.component.p165mj.p166lr.xha xhaVar2 = f13140qt;
        if (!m16412ri(xhaVar2)) {
            return xhaVar2;
        }
        synchronized (dzy.class) {
            if (m16412ri(f13140qt)) {
                try {
                    f13140qt = m16407ri("net", f13140qt);
                } catch (Throwable th) {
                    th.getMessage();
                }
                if (f13140qt == null) {
                    f13140qt = m16389bu();
                }
                xhaVar = f13140qt;
            } else {
                xhaVar = f13140qt;
            }
            throw th;
        }
        return xhaVar;
    }

    private static com.bytedance.sdk.component.p165mj.p166lr.xha slm() {
        com.bytedance.sdk.component.p165mj.p166lr.xha xhaVar;
        com.bytedance.sdk.component.p165mj.p166lr.xha xhaVar2 = f13142sf;
        if (!m16412ri(xhaVar2)) {
            return xhaVar2;
        }
        synchronized (dzy.class) {
            if (m16412ri(f13142sf)) {
                try {
                    f13142sf = m16407ri("imgdisk", f13142sf);
                } catch (Throwable th) {
                    th.getMessage();
                }
                if (f13142sf == null) {
                    f13142sf = m16389bu();
                }
                xhaVar = f13142sf;
            } else {
                xhaVar = f13142sf;
            }
            throw th;
        }
        return xhaVar;
    }

    /* JADX INFO: renamed from: vr */
    private static com.bytedance.sdk.component.p165mj.p166lr.xha m16414vr() {
        com.bytedance.sdk.component.p165mj.p166lr.xha xhaVar;
        com.bytedance.sdk.component.p165mj.p166lr.xha xhaVar2 = xha;
        if (!m16412ri(xhaVar2)) {
            return xhaVar2;
        }
        synchronized (dzy.class) {
            if (m16412ri(xha)) {
                try {
                    xha = m16407ri("io", xha);
                } catch (Throwable th) {
                    th.getMessage();
                }
                if (xha == null) {
                    xha = m16389bu();
                }
                xhaVar = xha;
            } else {
                xhaVar = xha;
            }
            throw th;
        }
        return xhaVar;
    }

    public static boolean xha() {
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith("pag_log");
    }
}
