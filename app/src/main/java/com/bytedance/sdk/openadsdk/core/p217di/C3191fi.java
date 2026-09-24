package com.bytedance.sdk.openadsdk.core.p217di;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.di.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C3191fi extends LinearLayout {
    public C3191fi(Context context) {
        super(context);
        init();
    }

    public C3191fi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public C3191fi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        setLayoutDirection(3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.LinearLayout
    public void setGravity(int i) {
        super.setGravity(jbs.m13329ri(i));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(jbs.m13330ri(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }
}
