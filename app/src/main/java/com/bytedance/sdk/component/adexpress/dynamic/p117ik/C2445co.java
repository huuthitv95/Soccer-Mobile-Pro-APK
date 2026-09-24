package com.bytedance.sdk.component.adexpress.dynamic.p117ik;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha;
import com.bytedance.sdk.component.adexpress.p113di.C2366aw;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ik.co */
/* JADX INFO: loaded from: classes3.dex */
public class C2445co implements xha {

    /* JADX INFO: renamed from: ri */
    private C2366aw f6596ri;

    public C2445co(Context context, AbstractC2412fi abstractC2412fi, xha xhaVar) {
        this.f6596ri = new C2366aw(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(context, 180.0f));
        layoutParams.gravity = 17;
        this.f6596ri.setLayoutParams(layoutParams);
        this.f6596ri.setGuideText(xhaVar.whw());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ik */
    public ViewGroup mo8425ik() {
        return this.f6596ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: lr */
    public void mo8427lr() {
        this.f6596ri.m8194lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ri */
    public void mo8428ri() {
        this.f6596ri.m8195ri();
    }
}
