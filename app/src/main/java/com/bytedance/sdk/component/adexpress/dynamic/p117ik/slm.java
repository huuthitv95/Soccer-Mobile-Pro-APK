package com.bytedance.sdk.component.adexpress.dynamic.p117ik;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha;
import com.bytedance.sdk.component.adexpress.p113di.C2365ac;

/* JADX INFO: loaded from: classes3.dex */
public class slm implements xha {

    /* JADX INFO: renamed from: ik */
    private AbstractC2412fi f6676ik;

    /* JADX INFO: renamed from: ka */
    private xha f6677ka;

    /* JADX INFO: renamed from: lr */
    private Context f6678lr;

    /* JADX INFO: renamed from: ri */
    private C2365ac f6679ri;

    public slm(Context context, AbstractC2412fi abstractC2412fi, xha xhaVar) {
        this.f6678lr = context;
        this.f6676ik = abstractC2412fi;
        this.f6677ka = xhaVar;
        m8455ka();
    }

    /* JADX INFO: renamed from: ka */
    private void m8455ka() {
        this.f6679ri = new C2365ac(this.f6678lr);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6678lr, 120.0f));
        layoutParams.gravity = 17;
        this.f6679ri.setLayoutParams(layoutParams);
        this.f6679ri.setClipChildren(false);
        this.f6679ri.setGuideText(this.f6677ka.whw());
        AbstractC2412fi abstractC2412fi = this.f6676ik;
        if (abstractC2412fi != null) {
            this.f6679ri.setOnClickListener((View.OnClickListener) abstractC2412fi.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ik */
    public ViewGroup mo8425ik() {
        return this.f6679ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: lr */
    public void mo8427lr() {
        C2365ac c2365ac = this.f6679ri;
        if (c2365ac != null) {
            c2365ac.m8185lr();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ri */
    public void mo8428ri() {
        C2365ac c2365ac = this.f6679ri;
        if (c2365ac != null) {
            c2365ac.m8186ri();
        }
    }
}
