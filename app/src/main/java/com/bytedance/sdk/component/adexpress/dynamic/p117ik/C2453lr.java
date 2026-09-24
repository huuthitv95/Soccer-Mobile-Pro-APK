package com.bytedance.sdk.component.adexpress.dynamic.p117ik;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha;
import com.bytedance.sdk.component.adexpress.p113di.C2377ik;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ik.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2453lr implements xha {

    /* JADX INFO: renamed from: ri */
    private C2377ik f6613ri;

    public C2453lr(Context context, AbstractC2412fi abstractC2412fi, xha xhaVar) {
        this.f6613ri = new C2377ik(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(context, 180.0f));
        layoutParams.gravity = 17;
        this.f6613ri.setLayoutParams(layoutParams);
        this.f6613ri.setGuideText(xhaVar.whw());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public C2377ik mo8425ik() {
        return this.f6613ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: lr */
    public void mo8427lr() {
        this.f6613ri.m8231lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ri */
    public void mo8428ri() {
        this.f6613ri.m8232ri();
    }
}
