package com.bytedance.sdk.openadsdk.core.p200co.p208lr;

import android.content.Context;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.C2227bu;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2507mj;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2508qt;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2513vr;
import com.bytedance.sdk.component.adexpress.p125lr.bgr;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.C3133ka;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.C3136ri;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.p202ri.C3137di;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class xha implements InterfaceC2508qt {

    /* JADX INFO: renamed from: di */
    private InterfaceC3247vr f10492di;

    /* JADX INFO: renamed from: fi */
    private AtomicBoolean f10493fi = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ik */
    private C2500aw f10494ik;

    /* JADX INFO: renamed from: ka */
    private ScheduledFuture<?> f10495ka;

    /* JADX INFO: renamed from: lr */
    private C3133ka f10496lr;

    /* JADX INFO: renamed from: ri */
    private Context f10497ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.xha$ri */
    private class RunnableC3179ri implements Runnable {

        /* JADX INFO: renamed from: ik */
        private int f10500ik;

        /* JADX INFO: renamed from: ri */
        InterfaceC2508qt.ri f10502ri;

        RunnableC3179ri(int i, InterfaceC2508qt.ri riVar) {
            this.f10500ik = i;
            this.f10502ri = riVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f10500ik == 1) {
                xha.this.f10496lr.m13086ri(true);
                xha.this.m13263ri(this.f10502ri, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "real time out" + xha.this.f10494ik.m8880di());
            }
        }
    }

    public xha(Context context, C3133ka c3133ka, InterfaceC2507mj interfaceC2507mj, C2500aw c2500aw) {
        this.f10497ri = context;
        this.f10496lr = c3133ka;
        this.f10494ik = c2500aw;
        this.f10496lr.m13082ri(interfaceC2507mj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m13262lr() {
        try {
            ScheduledFuture<?> scheduledFuture = this.f10495ka;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.f10495ka.cancel(false);
            this.f10495ka = null;
        } catch (Throwable th) {
            C2707ac.m10197ik("RenderInterceptor", "remove ugen time out task fail", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m13263ri(InterfaceC2508qt.ri riVar, int i, String str) {
        InterfaceC2513vr interfaceC2513vrMo8971lr;
        if (riVar.mo8970ik() || this.f10493fi.get()) {
            return;
        }
        m13262lr();
        C2227bu c2227bu = new C2227bu();
        c2227bu.m7334ri(i);
        c2227bu.m7336ri(str);
        ((C3136ri) this.f10494ik).m13093oh().mo7387ri(c2227bu);
        if (riVar.mo8972lr(this)) {
            riVar.mo8974ri(this);
        } else {
            if (riVar.mo8970ik() || (interfaceC2513vrMo8971lr = riVar.mo8971lr()) == null) {
                return;
            }
            riVar.mo8976ri(true);
            interfaceC2513vrMo8971lr.mo9010a_(i);
        }
        this.f10493fi.getAndSet(true);
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2508qt
    /* JADX INFO: renamed from: ri */
    public void mo8978ri() {
    }

    /* JADX INFO: renamed from: ri */
    public void m13266ri(InterfaceC3247vr interfaceC3247vr) {
        this.f10492di = interfaceC3247vr;
        this.f10496lr.m13083ri(interfaceC3247vr);
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2508qt
    /* JADX INFO: renamed from: ri */
    public boolean mo8980ri(final InterfaceC2508qt.ri riVar) {
        int iM8880di = this.f10494ik.m8880di();
        if (iM8880di < 0) {
            m13263ri(riVar, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "time is ".concat(String.valueOf(iM8880di)));
        } else {
            if (!(this.f10496lr instanceof C3137di)) {
                this.f10495ka = dzy.m16408ri().schedule(new RunnableC3179ri(1, riVar), iM8880di, TimeUnit.MILLISECONDS);
            }
            this.f10496lr.mo8759ri(new com.bytedance.sdk.component.adexpress.p125lr.xha() { // from class: com.bytedance.sdk.openadsdk.core.co.lr.xha.1
                @Override // com.bytedance.sdk.component.adexpress.p125lr.xha
                /* JADX INFO: renamed from: ri */
                public void mo8981ri(int i, String str) {
                    xha.this.m13263ri(riVar, i, str);
                }

                @Override // com.bytedance.sdk.component.adexpress.p125lr.xha
                /* JADX INFO: renamed from: ri */
                public void mo8982ri(View view, bgr bgrVar) {
                    xha.this.m13262lr();
                    if (riVar.mo8970ik()) {
                        return;
                    }
                    C2227bu c2227bu = new C2227bu();
                    c2227bu.m7334ri(0);
                    if (xha.this.f10496lr instanceof C3137di) {
                        xha.this.f10494ik.m8881fi().mo8985di();
                    } else {
                        ((C3136ri) xha.this.f10494ik).m13093oh().mo7387ri(c2227bu);
                    }
                    xha.this.f10494ik.m8881fi().jbs();
                    InterfaceC2513vr interfaceC2513vrMo8971lr = riVar.mo8971lr();
                    if (interfaceC2513vrMo8971lr == null) {
                        return;
                    }
                    interfaceC2513vrMo8971lr.mo9011ri(xha.this.f10496lr, bgrVar);
                    riVar.mo8976ri(true);
                }
            });
        }
        return true;
    }
}
