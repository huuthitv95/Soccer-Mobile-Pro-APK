package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.sdk.component.adexpress.p122fi.C2483fi;
import com.bytedance.sdk.component.adexpress.p126ri.p127ik.C2518ri;
import com.bytedance.sdk.component.adexpress.p126ri.p128lr.C2523lr;
import com.bytedance.sdk.component.adexpress.p126ri.p128lr.C2524mj;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.C2531ri;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2529ka;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2530lr;
import com.bytedance.sdk.component.jbs.p157lr.C2639ri;
import com.bytedance.sdk.component.jbs.p158ri.C2642ri;
import com.bytedance.sdk.component.jbs.p158ri.InterfaceC2641lr;
import com.bytedance.sdk.component.xha.p170lr.C2742lr;
import com.bytedance.sdk.component.xha.p170lr.C2743ri;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.p224qt.C3307lr;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3351lr;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.tan.p263ka.C3535ri;
import com.bytedance.sdk.openadsdk.tan.p264lr.C3536ri;
import com.bytedance.sdk.openadsdk.tan.p265ri.C3538ri;
import com.bytedance.sdk.openadsdk.utils.C3578lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.co */
/* JADX INFO: loaded from: classes3.dex */
public class C3228co {

    /* JADX INFO: renamed from: ik */
    private static String f10787ik;

    /* JADX INFO: renamed from: lr */
    private static String f10788lr;

    /* JADX INFO: renamed from: ri */
    private static final AtomicBoolean f10789ri = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ik */
    public static String m13615ik() {
        String strM9038ik;
        if (f10788lr == null) {
            f10788lr = C3535ri.m16058lr("tt_sp", "js_render_ver", "");
        }
        C2518ri c2518riM9124lr = C2524mj.m9124lr();
        if (c2518riM9124lr != null && (strM9038ik = c2518riM9124lr.m9038ik()) != null && !strM9038ik.equals(f10788lr)) {
            f10788lr = strM9038ik;
            C3535ri.m16077ri("tt_sp", "js_render_ver", strM9038ik);
        }
        return f10788lr;
    }

    /* JADX INFO: renamed from: ka */
    public static String m13616ka() {
        Map<String, C2518ri> mapM9046ri;
        C2518ri c2518ri;
        String strM9038ik;
        if (f10787ik == null) {
            f10787ik = C3535ri.m16058lr("tt_sp", "js_render_v3_ver", "");
        }
        C2518ri c2518riM9124lr = C2524mj.m9124lr();
        if (c2518riM9124lr != null && (mapM9046ri = c2518riM9124lr.m9046ri()) != null && (c2518ri = mapM9046ri.get("v3")) != null && (strM9038ik = c2518ri.m9038ik()) != null && !strM9038ik.equals(f10787ik)) {
            f10787ik = strM9038ik;
            C3535ri.m16077ri("tt_sp", "js_render_v3_ver", strM9038ik);
        }
        return f10787ik;
    }

    /* JADX INFO: renamed from: lr */
    public static void m13617lr() {
        if (C3307lr.m14718ri().m14722fi() || f10789ri.getAndSet(true)) {
            return;
        }
        C2523lr.m9117ri();
    }

    /* JADX INFO: renamed from: ri */
    public static void m13618ri() {
        C2531ri.m9163ri().m9171ri(new InterfaceC2530lr() { // from class: com.bytedance.sdk.openadsdk.core.jbs.co.1
            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2530lr
            /* JADX INFO: renamed from: ri */
            public int mo9159ri(String str, ContentValues contentValues, String str2, String[] strArr) {
                return C3536ri.m16081ri(C3299nr.m14642ri(), str, contentValues, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2530lr
            /* JADX INFO: renamed from: ri */
            public int mo9160ri(String str, String str2, String[] strArr) {
                return C3536ri.m16082ri(C3299nr.m14642ri(), str, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2530lr
            /* JADX INFO: renamed from: ri */
            public Cursor mo9161ri(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
                return new C3538ri(C3536ri.m16084ri(C3299nr.m14642ri(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2530lr
            /* JADX INFO: renamed from: ri */
            public void mo9162ri(String str, ContentValues contentValues) {
                C3536ri.m16086ri(C3299nr.m14642ri(), str, contentValues);
            }
        });
        C2531ri.m9163ri().m9169ri(new InterfaceC2528ik() { // from class: com.bytedance.sdk.openadsdk.core.jbs.co.2

            /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.co$2$1, reason: invalid class name */
            class AnonymousClass1 implements Runnable {

                /* JADX INFO: renamed from: ik */
                final /* synthetic */ int f10790ik;

                /* JADX INFO: renamed from: lr */
                final /* synthetic */ int f10792lr;

                /* JADX INFO: renamed from: ri */
                final /* synthetic */ MessageQueue[] f10793ri;

                AnonymousClass1(MessageQueue[] messageQueueArr, int i, int i2) {
                    this.f10793ri = messageQueueArr;
                    this.f10792lr = i;
                    this.f10790ik = i2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f10793ri[0] = Looper.myQueue();
                    m13622ri(this.f10793ri[0], this.f10792lr, this.f10790ik);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: lr */
            public void m13619lr(final MessageQueue messageQueue, final int i) {
                if (messageQueue == null || i <= 0) {
                    return;
                }
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.jbs.co.2.4
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        new C3351lr(i, false, messageQueue).m15089lr();
                        return false;
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: ri */
            public void m13621ri(final MessageQueue messageQueue, final int i) {
                if (messageQueue == null || i <= 0) {
                    return;
                }
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.jbs.co.2.3
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        new C3351lr(i, true, messageQueue).m15089lr();
                        return false;
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: ri */
            public void m13622ri(final MessageQueue messageQueue, final int i, final int i2) {
                if (messageQueue != null) {
                    final int iM16704ri = C3606fi.m16704ri("ad_load_and_render_opt", "w_p_delay", 500);
                    Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.co.2.2
                        @Override // java.lang.Runnable
                        public void run() {
                            m13619lr(messageQueue, i);
                            m13621ri(messageQueue, i2);
                        }
                    };
                    if (iM16704ri > 0) {
                        C3332vr.m14976ik().postDelayed(runnable, iM16704ri);
                    } else {
                        runnable.run();
                    }
                }
            }

            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik
            /* JADX INFO: renamed from: aw */
            public ExecutorService mo9144aw() {
                return dzy.m16392fi();
            }

            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik
            public ExecutorService bgr() {
                return dzy.m16405qt();
            }

            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik
            /* JADX INFO: renamed from: bu */
            public int mo9145bu() {
                return C3583qd.m16578fi(C3299nr.m14642ri());
            }

            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik
            /* JADX INFO: renamed from: co */
            public int mo9146co() {
                return 0;
            }

            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik
            /* JADX INFO: renamed from: di */
            public C2743ri mo9147di() {
                C2743ri c2743riM10411ka = C2751lr.m10463lr().m10466ik().m10411ka();
                c2743riM10411ka.m10373ri(8);
                c2743riM10411ka.m10371lr("express_down");
                return c2743riM10411ka;
            }

            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik
            /* JADX INFO: renamed from: fi */
            public C2518ri mo9148fi() {
                return C3299nr.m14638ik().mo12635ri();
            }

            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik
            /* JADX INFO: renamed from: ik */
            public Handler mo9149ik() {
                return C3332vr.m14976ik();
            }

            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik
            public int jbs() {
                return 1;
            }

            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik
            /* JADX INFO: renamed from: ka */
            public void mo9150ka() {
                int iAac = C3299nr.m14639ka().aac();
                int iM14893xe = C3299nr.m14639ka().m14893xe();
                if (iAac == 0 && iM14893xe == 0) {
                    return;
                }
                C2483fi.m8762ri().m8773ri(iAac);
                C2483fi.m8762ri().m8770lr(iM14893xe);
                int iM16696di = C3606fi.m16696di();
                int iM16697fi = C3606fi.m16697fi();
                if (iM16696di == 0 && iM16697fi == 0) {
                    return;
                }
                m13622ri(C3332vr.m14976ik().getLooper().getQueue(), iM16697fi, iM16696di);
            }

            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik
            /* JADX INFO: renamed from: lr */
            public Context mo9151lr() {
                return C3299nr.m14642ri();
            }

            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik
            /* JADX INFO: renamed from: mj */
            public String mo9152mj() {
                return C3304qt.m14669lr().m14689ka();
            }

            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik
            /* JADX INFO: renamed from: nr */
            public int mo9153nr() {
                return C3606fi.m16703ri("gaussian_blur_type", 0);
            }

            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik
            /* JADX INFO: renamed from: qt */
            public int mo9154qt() {
                return C3299nr.m14639ka().aac();
            }

            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik
            /* JADX INFO: renamed from: ri */
            public int mo9155ri() {
                if (C3299nr.m14639ka() == null) {
                    return 0;
                }
                return C3299nr.m14639ka().m14844fi();
            }

            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik
            /* JADX INFO: renamed from: sf */
            public int mo9156sf() {
                return C3299nr.m14639ka().m14893xe();
            }

            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik
            public int slm() {
                return C3583qd.m16580ik(C3299nr.m14642ri());
            }

            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik
            /* JADX INFO: renamed from: vr */
            public ScheduledExecutorService mo9157vr() {
                return dzy.m16408ri();
            }

            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik
            public C2742lr xha() {
                C2742lr c2742lrM10410ik = C2751lr.m10463lr().m10466ik().m10410ik();
                c2742lrM10410ik.m10373ri(8);
                c2742lrM10410ik.m10371lr("express_get");
                return c2742lrM10410ik;
            }
        });
        C2531ri.m9163ri().m9170ri(new InterfaceC2529ka() { // from class: com.bytedance.sdk.openadsdk.core.jbs.co.3
            @Override // com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2529ka
            /* JADX INFO: renamed from: ri */
            public void mo9158ri(int i) {
                C3521ka.m15942ri().m15957ri(C3531ka.m15967lr().m15979lr(i).m15971di(com.bytedance.sdk.openadsdk.core.jbs.m13550ri(i)));
            }
        });
        C2642ri.m9829ri().m9831ri(new InterfaceC2641lr() { // from class: com.bytedance.sdk.openadsdk.core.jbs.co.4
            @Override // com.bytedance.sdk.component.jbs.p158ri.InterfaceC2641lr
            /* JADX INFO: renamed from: ri */
            public void mo9826ri(C2639ri c2639ri, String str, String str2, JSONObject jSONObject, long j) {
                com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = new com.bytedance.sdk.openadsdk.core.model.wjv();
                wjvVar.m14569zf(c2639ri.m9805ri());
                wjvVar.m14528su(c2639ri.m9803lr());
                wjvVar.wjv(c2639ri.m9800ik());
                wjvVar.m14366ay(c2639ri.m9802ka());
                C3414ik.m15523lr(wjvVar, str, str2, jSONObject, j);
            }

            @Override // com.bytedance.sdk.component.jbs.p158ri.InterfaceC2641lr
            /* JADX INFO: renamed from: ri */
            public void mo9827ri(C2639ri c2639ri, String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
                if (c2639ri != null) {
                    com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = new com.bytedance.sdk.openadsdk.core.model.wjv();
                    wjvVar.m14569zf(c2639ri.m9805ri());
                    wjvVar.m14528su(c2639ri.m9803lr());
                    wjvVar.wjv(c2639ri.m9800ik());
                    wjvVar.m14366ay(c2639ri.m9802ka());
                    C3414ik.m15532ri(System.currentTimeMillis(), wjvVar, str, str2, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.core.jbs.co.4.1
                        @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                        /* JADX INFO: renamed from: ik */
                        public JSONObject mo11121ik() {
                            return jSONObject2;
                        }

                        @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                        /* JADX INFO: renamed from: ri */
                        public JSONObject mo10798ri() {
                            return jSONObject;
                        }
                    });
                }
            }

            @Override // com.bytedance.sdk.component.jbs.p158ri.InterfaceC2641lr
            /* JADX INFO: renamed from: ri */
            public void mo9828ri(String str, String str2, JSONObject jSONObject) {
                C3414ik.m15510ik(C3578lr.m16534ik(), str, str2, jSONObject);
            }
        });
    }
}
