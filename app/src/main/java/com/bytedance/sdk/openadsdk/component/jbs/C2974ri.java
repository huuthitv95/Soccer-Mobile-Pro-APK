package com.bytedance.sdk.openadsdk.component.jbs;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.jbs.AbstractC3238ri;
import com.bytedance.sdk.openadsdk.core.jbs.C3222ac;
import com.bytedance.sdk.openadsdk.core.model.slm;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.jbs.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2974ri extends AbstractC3238ri {

    /* JADX INFO: renamed from: ri */
    private C3222ac f9043ri;

    public C2974ri(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.AbstractC3238ri
    /* JADX INFO: renamed from: ri */
    protected void mo11556ri(View view, int i, slm slmVar) {
        C3222ac c3222ac = this.f9043ri;
        if (c3222ac != null) {
            c3222ac.mo9002ri(view, i, slmVar);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11557ri(C3222ac c3222ac) {
        this.f9043ri = c3222ac;
        c3222ac.addView(this, new FrameLayout.LayoutParams(-1, -1));
    }
}
