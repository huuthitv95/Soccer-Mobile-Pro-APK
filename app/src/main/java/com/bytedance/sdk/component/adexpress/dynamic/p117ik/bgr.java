package com.bytedance.sdk.component.adexpress.dynamic.p117ik;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha;
import com.bytedance.sdk.component.adexpress.p113di.C2387vr;

/* JADX INFO: loaded from: classes3.dex */
public class bgr implements xha<C2387vr> {

    /* JADX INFO: renamed from: ri */
    private C2387vr f6590ri;

    public bgr(Context context, AbstractC2412fi abstractC2412fi, xha xhaVar) {
        this.f6590ri = new C2387vr(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(context, 180.0f));
        layoutParams.gravity = 17;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(context, 20.0f);
        this.f6590ri.setLayoutParams(layoutParams);
        this.f6590ri.setGuideText(xhaVar.whw());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public C2387vr mo8425ik() {
        return this.f6590ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: lr */
    public void mo8427lr() {
        this.f6590ri.m8282lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ri */
    public void mo8428ri() {
        this.f6590ri.m8283ri();
    }
}
