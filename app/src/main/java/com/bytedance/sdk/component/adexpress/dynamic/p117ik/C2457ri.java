package com.bytedance.sdk.component.adexpress.dynamic.p117ik;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha;
import com.bytedance.sdk.component.adexpress.p113di.C2379lr;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ik.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2457ri implements xha {

    /* JADX INFO: renamed from: ri */
    private C2379lr f6615ri;

    public C2457ri(Context context, AbstractC2412fi abstractC2412fi, xha xhaVar) {
        double dAac = xhaVar.aac();
        dAac = dAac == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1.0d : dAac;
        double dM8729xe = xhaVar.m8729xe();
        double d = dM8729xe != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? dM8729xe : 1.0d;
        int dynamicWidth = (int) (((double) abstractC2412fi.getDynamicWidth()) * 0.32d * dAac);
        int dynamicWidth2 = (int) (((double) abstractC2412fi.getDynamicWidth()) * 0.32d * d);
        this.f6615ri = new C2379lr(context, dynamicWidth, dynamicWidth2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicWidth, dynamicWidth2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(context, xhaVar.m8710nd() - 7);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(context, xhaVar.m8731zb() - 3);
        this.f6615ri.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ik */
    public ViewGroup mo8425ik() {
        return this.f6615ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: lr */
    public void mo8427lr() {
        this.f6615ri.m8244lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ri */
    public void mo8428ri() {
        this.f6615ri.m8245ri();
    }
}
