package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.w5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4130w5 implements InterfaceC3680c6 {

    /* JADX INFO: renamed from: a */
    public final float f16684a;

    public C4130w5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16684a = context.getResources().getDisplayMetrics().density;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3680c6
    /* JADX INFO: renamed from: a */
    public int mo17042a(double d) {
        return (int) (d * ((double) this.f16684a));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3680c6
    /* JADX INFO: renamed from: a */
    public int mo17043a(int i) {
        return (int) (i * this.f16684a);
    }
}
