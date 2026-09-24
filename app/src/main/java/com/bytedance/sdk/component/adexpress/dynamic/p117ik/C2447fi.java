package com.bytedance.sdk.component.adexpress.dynamic.p117ik;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi;
import com.bytedance.sdk.component.adexpress.p113di.C2380mj;
import com.bytedance.sdk.component.adexpress.p113di.xha;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ik.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2447fi extends C2444bu<xha> {
    public C2447fi(Context context, AbstractC2412fi abstractC2412fi, com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha xhaVar) {
        super(context, abstractC2412fi, xhaVar);
        m8433ri(xhaVar);
    }

    /* JADX INFO: renamed from: ri */
    private void m8433ri(com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha xhaVar) {
        this.f6595ri = new C2380mj(this.f6594lr);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 81;
        this.f6595ri.setLayoutParams(layoutParams);
        if (this.f6595ri instanceof C2380mj) {
            ((C2380mj) this.f6595ri).setButtonText(this.f6593ka.whw());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.C2444bu
    /* JADX INFO: renamed from: ka */
    protected void mo8431ka() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.C2444bu, com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: lr */
    public void mo8427lr() {
        this.f6595ri.mo8224lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.C2444bu, com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ri */
    public void mo8428ri() {
        this.f6595ri.mo8225ri();
    }
}
