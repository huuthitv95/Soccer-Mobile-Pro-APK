package com.bytedance.sdk.openadsdk.p175ay.p176lr;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ay.lr.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2890ik extends AbstractC2892lr {

    /* JADX INFO: renamed from: ka */
    private int f8615ka;

    public C2890ik(Integer num, View view, wjv wjvVar, C2889fi.ri riVar) {
        super(num, view, wjvVar, 1000, riVar);
        this.f8615ka = -1;
        m11115lr(view);
    }

    /* JADX INFO: renamed from: lr */
    private void m11115lr(View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.f8615ka = width * height >= 242500 ? 1 : 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p175ay.p176lr.AbstractC2892lr
    /* JADX INFO: renamed from: di */
    public int mo11116di() {
        return (this.f8626lr != null && this.f8626lr.zyn() && this.f8626lr.lji() == 1) ? 1000 : 100;
    }

    @Override // com.bytedance.sdk.openadsdk.p175ay.p176lr.AbstractC2892lr
    /* JADX INFO: renamed from: ik */
    protected boolean mo11117ik() {
        if (this.f8628ri == null || this.f8628ri.get() == null) {
            return false;
        }
        View view = this.f8628ri.get();
        if (this.f8615ka == -1) {
            m11115lr(view);
        }
        return C2888di.m11104ri(view, this.f8615ka == 1, this.f8626lr.m14404go());
    }

    @Override // com.bytedance.sdk.openadsdk.p175ay.p176lr.AbstractC2892lr
    /* JADX INFO: renamed from: ka */
    protected void mo11118ka() {
        super.mo11118ka();
    }

    @Override // com.bytedance.sdk.openadsdk.p175ay.p176lr.AbstractC2892lr
    /* JADX INFO: renamed from: lr */
    protected void mo11119lr(int i) {
    }
}
