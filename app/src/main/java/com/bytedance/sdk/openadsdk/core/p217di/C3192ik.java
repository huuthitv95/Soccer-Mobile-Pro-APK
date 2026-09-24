package com.bytedance.sdk.openadsdk.core.p217di;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.di.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3192ik extends FrameLayout {
    public C3192ik(Context context) {
        super(context);
        init();
    }

    public C3192ik(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public C3192ik(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
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
