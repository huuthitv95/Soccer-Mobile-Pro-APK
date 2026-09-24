package com.bytedance.sdk.openadsdk.p252ri.p256lr.p257ri;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.jbs.AbstractC3238ri;
import com.bytedance.sdk.openadsdk.core.jbs.C3222ac;
import com.bytedance.sdk.openadsdk.core.model.slm;
import com.bytedance.sdk.openadsdk.p252ri.p256lr.C3506ri;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ri.lr.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3509ri extends AbstractC3238ri {

    /* JADX INFO: renamed from: co */
    private C3506ri f12735co;

    /* JADX INFO: renamed from: ri */
    private C3222ac f12736ri;

    public C3509ri(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.AbstractC3238ri
    /* JADX INFO: renamed from: ri */
    protected void mo11556ri(View view, int i, slm slmVar) {
        C3222ac c3222ac = this.f12736ri;
        if (c3222ac != null) {
            c3222ac.mo9002ri(view, i, slmVar);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15916ri(C3222ac c3222ac) {
        this.f12736ri = c3222ac;
        c3222ac.addView(this, new FrameLayout.LayoutParams(-1, -1));
    }

    public void setExtraFuncationHelper(C3506ri c3506ri) {
        this.f12735co = c3506ri;
    }
}
