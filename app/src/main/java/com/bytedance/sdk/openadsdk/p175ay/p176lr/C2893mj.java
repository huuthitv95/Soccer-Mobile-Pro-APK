package com.bytedance.sdk.openadsdk.p175ay.p176lr;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ay.lr.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C2893mj extends AbstractC2892lr {

    /* JADX INFO: renamed from: ka */
    private int f8629ka;

    public C2893mj(Integer num, View view, wjv wjvVar, C2889fi.ri riVar) {
        super(num, view, wjvVar, 2000, riVar);
        this.f8629ka = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.p175ay.p176lr.AbstractC2892lr
    /* JADX INFO: renamed from: co */
    public boolean mo11124co() {
        int i = this.f8629ka;
        boolean z = i == 2 || i == 0;
        if (z) {
            this.f8624ik.set(false);
        }
        return !z || super.mo11124co();
    }

    @Override // com.bytedance.sdk.openadsdk.p175ay.p176lr.AbstractC2892lr
    /* JADX INFO: renamed from: di */
    public int mo11116di() {
        return 200;
    }

    @Override // com.bytedance.sdk.openadsdk.p175ay.p176lr.AbstractC2892lr
    /* JADX INFO: renamed from: ik */
    protected boolean mo11117ik() {
        return C2888di.m11103ri(this.f8628ri.get(), this.f8626lr.m14404go()) && this.f8629ka == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.p175ay.p176lr.AbstractC2892lr
    /* JADX INFO: renamed from: ka */
    protected void mo11118ka() {
        super.mo11118ka();
    }

    @Override // com.bytedance.sdk.openadsdk.p175ay.p176lr.AbstractC2892lr
    /* JADX INFO: renamed from: lr */
    protected void mo11119lr(int i) {
        if (jbs()) {
            return;
        }
        if (i == 6 || i == 5) {
            this.f8629ka = 0;
            m11127mj();
        }
        if (i == 3 || i == 2) {
            this.f8629ka = 2;
            m11127mj();
        }
        if (this.f8629ka == 1 || i != 0) {
            return;
        }
        this.f8629ka = 1;
        mo11129ri();
    }

    @Override // com.bytedance.sdk.openadsdk.p175ay.p176lr.AbstractC2892lr
    /* JADX INFO: renamed from: ri */
    public void mo11129ri() {
        if (this.f8629ka != 1) {
            return;
        }
        super.mo11129ri();
    }
}
