package com.bytedance.sdk.component.adexpress.dynamic.p117ik;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha;
import com.bytedance.sdk.component.adexpress.p113di.bgr;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ik.aw */
/* JADX INFO: loaded from: classes3.dex */
public class C2443aw implements xha {

    /* JADX INFO: renamed from: ri */
    private bgr f6589ri;

    public C2443aw(Context context, AbstractC2412fi abstractC2412fi, xha xhaVar) {
        this.f6589ri = new bgr(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(abstractC2412fi.getDynamicHeight(), abstractC2412fi.getDynamicHeight());
        layoutParams.gravity = 8388629;
        this.f6589ri.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public bgr mo8425ik() {
        return this.f6589ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: lr */
    public void mo8427lr() {
        this.f6589ri.m8203lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ri */
    public void mo8428ri() {
        this.f6589ri.m8204ri();
    }
}
