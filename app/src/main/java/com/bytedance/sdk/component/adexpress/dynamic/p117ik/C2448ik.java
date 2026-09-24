package com.bytedance.sdk.component.adexpress.dynamic.p117ik;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha;
import com.bytedance.sdk.component.adexpress.p113di.C2373fi;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ik.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2448ik implements xha {

    /* JADX INFO: renamed from: ri */
    C2373fi f6599ri;

    public C2448ik(Context context, AbstractC2412fi abstractC2412fi, xha xhaVar) {
        this.f6599ri = new C2373fi(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(abstractC2412fi.getDynamicHeight(), abstractC2412fi.getDynamicHeight());
        layoutParams.gravity = 17;
        this.f6599ri.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public C2373fi mo8425ik() {
        return this.f6599ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: lr */
    public void mo8427lr() {
        this.f6599ri.m8216lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ri */
    public void mo8428ri() {
        this.f6599ri.m8217ri();
    }
}
