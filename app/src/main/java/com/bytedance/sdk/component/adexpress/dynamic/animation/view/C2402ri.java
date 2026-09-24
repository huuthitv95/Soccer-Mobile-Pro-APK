package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.view.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2402ri extends TextView implements IAnimation {

    /* JADX INFO: renamed from: fi */
    private float f6443fi;

    /* JADX INFO: renamed from: ik */
    private float f6444ik;

    /* JADX INFO: renamed from: ka */
    private float f6445ka;

    /* JADX INFO: renamed from: lr */
    private float f6446lr;

    /* JADX INFO: renamed from: ri */
    C2400ik f6447ri;

    public C2402ri(Context context) {
        super(context);
        this.f6447ri = new C2400ik();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.f6445ka;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.f6446lr;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.f6444ik;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.f6443fi;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f6447ri.m8303ri(canvas, this, this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f6447ri.m8305ri(this, i, i2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f) {
        this.f6445ka = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f) {
        this.f6446lr = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f) {
        this.f6444ik = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f) {
        this.f6443fi = f;
        this.f6447ri.m8304ri(this, f);
    }
}
