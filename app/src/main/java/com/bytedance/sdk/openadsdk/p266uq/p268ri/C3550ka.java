package com.bytedance.sdk.openadsdk.p266uq.p268ri;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2879di;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.ri.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3550ka {

    /* JADX INFO: renamed from: lr */
    private static volatile C3550ka f13048lr;

    /* JADX INFO: renamed from: ri */
    private final Handler f13053ri;

    /* JADX INFO: renamed from: ik */
    private int f13051ik = 0;

    /* JADX INFO: renamed from: ka */
    private int f13052ka = 2;

    /* JADX INFO: renamed from: fi */
    private int f13050fi = Constants.ONE_HOUR;

    /* JADX INFO: renamed from: di */
    private final ArrayList<C3551lr> f13049di = new ArrayList<>();

    private C3550ka() {
        dzy.m16396ik((Runnable) new AbstractRunnableC2676ik("pag_pre_render_init") { // from class: com.bytedance.sdk.openadsdk.uq.ri.ka.1
            @Override // java.lang.Runnable
            public void run() {
                C3550ka.this.f13051ik = C3606fi.m16703ri("plb_pre_render_enable", 0);
                C3550ka.this.f13052ka = C3606fi.m16703ri("plb_pre_render_max_count", 2);
                if (C3550ka.this.f13052ka <= 0 || C3550ka.this.f13052ka > 4) {
                    C3550ka.this.f13052ka = 2;
                }
                C3550ka.this.f13050fi = C3606fi.m16703ri("plb_pre_render_alive_time", Constants.ONE_HOUR);
                if (C3550ka.this.f13050fi <= 0 || C3550ka.this.f13050fi > 3600000) {
                    C3550ka.this.f13050fi = Constants.ONE_HOUR;
                }
            }
        });
        this.f13053ri = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ka.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (!(message.obj instanceof C3551lr)) {
                    return false;
                }
                C3550ka.this.f13049di.remove(message.obj);
                ((C3551lr) message.obj).m16297ka();
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static C3550ka m16268ri() {
        if (f13048lr == null) {
            synchronized (C3550ka.class) {
                if (f13048lr == null) {
                    f13048lr = new C3550ka();
                }
            }
        }
        return f13048lr;
    }

    /* JADX INFO: renamed from: lr */
    public boolean m16269lr() {
        return this.f13051ik == 1;
    }

    /* JADX INFO: renamed from: ri */
    public C3551lr m16270ri(wjv wjvVar, FrameLayout frameLayout, InterfaceC2879di interfaceC2879di) {
        C3551lr c3551lr;
        if (m16269lr() && wjvVar.m14388eb() != null && !TextUtils.isEmpty(wjvVar.m14388eb().getBidAdm()) && C3279dw.m14086di(wjvVar) && frameLayout != null) {
            String strM14424jf = wjvVar.m14424jf();
            if (TextUtils.isEmpty(strM14424jf)) {
                return null;
            }
            int i = 0;
            while (true) {
                if (i >= this.f13049di.size()) {
                    i = -1;
                    c3551lr = null;
                    break;
                }
                c3551lr = this.f13049di.get(i);
                if (strM14424jf.equals(c3551lr.jbs())) {
                    break;
                }
                i++;
            }
            if (c3551lr != null) {
                this.f13053ri.removeMessages(strM14424jf.hashCode());
                this.f13049di.remove(i);
                Integer.valueOf(this.f13049di.size());
                wjvVar.slm(true);
                c3551lr.m16277ri(frameLayout, interfaceC2879di);
                C3414ik.m15549ri(wjvVar, C3571ig.m16444ik(wjvVar.m14388eb().getDurationSlotType()), "PL_use_pre_render", 1);
                return c3551lr;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public void m16271ri(final wjv wjvVar) {
        if (m16269lr() && wjvVar != null && C3279dw.m14086di(wjvVar)) {
            final String strM14424jf = wjvVar.m14424jf();
            if (TextUtils.isEmpty(strM14424jf)) {
                return;
            }
            dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ka.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (C3550ka.this.f13049di.size() >= C3550ka.this.f13052ka) {
                            Integer.valueOf(C3550ka.this.f13049di.size());
                            C3551lr c3551lr = (C3551lr) C3550ka.this.f13049di.remove(0);
                            if (c3551lr != null) {
                                C3550ka.this.f13053ri.removeMessages(c3551lr.jbs().hashCode());
                                c3551lr.m16297ka();
                            }
                        }
                        wjvVar.slm(true);
                        Context contextM14642ri = C3299nr.m14642ri();
                        wjv wjvVar2 = wjvVar;
                        final C3551lr c3551lr2 = new C3551lr(contextM14642ri, wjvVar2, wjvVar2.bbu(), true, new FrameLayout(C3299nr.m14642ri()), strM14424jf);
                        C3550ka.this.f13049di.add(c3551lr2);
                        c3551lr2.m16275mj();
                        Message messageObtain = Message.obtain();
                        messageObtain.what = strM14424jf.hashCode();
                        messageObtain.obj = c3551lr2;
                        C3550ka.this.f13053ri.sendMessageDelayed(messageObtain, C3550ka.this.f13050fi);
                        c3551lr2.m16303ri(new C3552ri.lr() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ka.3.1
                            @Override // com.bytedance.sdk.openadsdk.p266uq.p268ri.C3552ri.lr
                            /* JADX INFO: renamed from: ri */
                            public void mo16272ri() {
                                C3550ka.this.f13053ri.removeMessages(strM14424jf.hashCode());
                                C3550ka.this.f13049di.remove(c3551lr2);
                                c3551lr2.m16297ka();
                            }
                        });
                        wjv wjvVar3 = wjvVar;
                        C3414ik.m15549ri(wjvVar3, C3571ig.m16444ik(wjvVar3.m14388eb().getDurationSlotType()), "PL_start_pre_render", 1);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
            });
        }
    }
}
