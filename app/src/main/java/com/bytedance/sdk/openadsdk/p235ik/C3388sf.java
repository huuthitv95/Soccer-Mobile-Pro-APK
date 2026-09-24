package com.bytedance.sdk.openadsdk.p235ik;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ik.sf */
/* JADX INFO: loaded from: classes3.dex */
public class C3388sf extends View {

    /* JADX INFO: renamed from: ri */
    private final int f12055ri;

    public C3388sf(Context context) {
        this(context, Color.parseColor("#25000000"));
    }

    public C3388sf(Context context, int i) {
        super(context);
        setBackgroundColor(i);
        this.f12055ri = C3583qd.m16589lr(getContext(), 0.66f);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), this.f12055ri);
    }
}
