package com.bytedance.sdk.component.adexpress.p125lr;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.p122fi.AbstractC2487ri;
import com.bytedance.sdk.component.adexpress.p124ka.C2495ka;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class slm implements InterfaceC2508qt {

    /* JADX INFO: renamed from: di */
    private AtomicBoolean f6956di = new AtomicBoolean(false);

    /* JADX INFO: renamed from: fi */
    private ScheduledFuture<?> f6957fi;

    /* JADX INFO: renamed from: ik */
    private InterfaceC2507mj f6958ik;

    /* JADX INFO: renamed from: ka */
    private C2500aw f6959ka;

    /* JADX INFO: renamed from: lr */
    private AbstractC2487ri f6960lr;

    /* JADX INFO: renamed from: ri */
    private Context f6961ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.lr.slm$ri */
    private class RunnableC2512ri implements Runnable {

        /* JADX INFO: renamed from: ik */
        private int f6964ik;

        /* JADX INFO: renamed from: ri */
        InterfaceC2508qt.ri f6966ri;

        public RunnableC2512ri(int i, InterfaceC2508qt.ri riVar) {
            this.f6964ik = i;
            this.f6966ri = riVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6964ik == 1) {
                slm.this.f6960lr.m8799ri(true);
                slm.this.m9006ri(this.f6966ri, 107, null);
            }
        }
    }

    public slm(Context context, C2500aw c2500aw, AbstractC2487ri abstractC2487ri, InterfaceC2507mj interfaceC2507mj) {
        this.f6961ri = context;
        this.f6959ka = c2500aw;
        this.f6958ik = interfaceC2507mj;
        this.f6960lr = abstractC2487ri;
        abstractC2487ri.m8796ri(this.f6958ik);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public void m9004ik() {
        try {
            ScheduledFuture<?> scheduledFuture = this.f6957fi;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.f6957fi.cancel(false);
            this.f6957fi = null;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m9006ri(InterfaceC2508qt.ri riVar, int i, String str) {
        InterfaceC2513vr interfaceC2513vrMo8971lr;
        if (riVar.mo8970ik() || this.f6956di.get()) {
            return;
        }
        m9004ik();
        this.f6959ka.m8881fi().mo8996ri(i, str);
        if (riVar.mo8972lr(this)) {
            riVar.mo8974ri(this);
        } else {
            if (riVar.mo8970ik() || (interfaceC2513vrMo8971lr = riVar.mo8971lr()) == null) {
                return;
            }
            riVar.mo8976ri(true);
            interfaceC2513vrMo8971lr.mo9010a_(i);
        }
        this.f6956di.getAndSet(true);
    }

    /* JADX INFO: renamed from: lr */
    public AbstractC2487ri m9009lr() {
        return this.f6960lr;
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2508qt
    /* JADX INFO: renamed from: ri */
    public void mo8978ri() {
        this.f6960lr.mo8789ka();
        m9004ik();
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2508qt
    /* JADX INFO: renamed from: ri */
    public boolean mo8980ri(final InterfaceC2508qt.ri riVar) {
        int iM8880di = this.f6959ka.m8880di();
        if (iM8880di < 0) {
            m9006ri(riVar, 107, "time is ".concat(String.valueOf(iM8880di)));
        } else {
            this.f6957fi = C2495ka.m8820ri(new RunnableC2512ri(1, riVar), iM8880di, TimeUnit.MILLISECONDS);
            this.f6960lr.mo8759ri(new xha() { // from class: com.bytedance.sdk.component.adexpress.lr.slm.1
                @Override // com.bytedance.sdk.component.adexpress.p125lr.xha
                /* JADX INFO: renamed from: ri */
                public void mo8981ri(int i, String str) {
                    slm.this.m9006ri(riVar, i, str);
                }

                @Override // com.bytedance.sdk.component.adexpress.p125lr.xha
                /* JADX INFO: renamed from: ri */
                public void mo8982ri(View view, bgr bgrVar) {
                    InterfaceC2513vr interfaceC2513vrMo8971lr;
                    slm.this.m9004ik();
                    if (riVar.mo8970ik() || (interfaceC2513vrMo8971lr = riVar.mo8971lr()) == null) {
                        return;
                    }
                    interfaceC2513vrMo8971lr.mo9011ri(slm.this.f6960lr, bgrVar);
                    riVar.mo8976ri(true);
                }
            });
        }
        return true;
    }
}
