package com.bytedance.sdk.openadsdk.core.p217di;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.di.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3193ka extends ImageView {
    public C3193ka(Context context) {
        super(context);
    }

    public C3193ka(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C3193ka(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
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
