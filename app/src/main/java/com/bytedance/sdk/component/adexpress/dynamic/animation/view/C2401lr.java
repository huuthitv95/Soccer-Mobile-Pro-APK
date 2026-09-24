package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.view.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2401lr extends ImageView implements IAnimation {

    /* JADX INFO: renamed from: di */
    private xha f6437di;

    /* JADX INFO: renamed from: fi */
    private float f6438fi;

    /* JADX INFO: renamed from: ik */
    private float f6439ik;

    /* JADX INFO: renamed from: ka */
    private float f6440ka;

    /* JADX INFO: renamed from: lr */
    private float f6441lr;

    /* JADX INFO: renamed from: ri */
    C2400ik f6442ri;

    public C2401lr(Context context) {
        super(context);
        this.f6442ri = new C2400ik();
    }

    public xha getBrickNativeValue() {
        return this.f6437di;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.f6440ka;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.f6441lr;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.f6439ik;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.f6438fi;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        xha xhaVar;
        super.onDraw(canvas);
        this.f6442ri.m8303ri(canvas, this, this);
        if (getRippleValue() == 0.0f || (xhaVar = this.f6437di) == null || xhaVar.m8708lr() <= 0) {
            return;
        }
        ((ViewGroup) getParent()).setClipChildren(false);
        ((ViewGroup) getParent().getParent()).setClipChildren(false);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f6442ri.m8305ri(this, i, i2);
    }

    public void setBrickNativeValue(xha xhaVar) {
        this.f6437di = xhaVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f) {
        this.f6440ka = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f) {
        this.f6441lr = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f) {
        this.f6439ik = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f) {
        this.f6438fi = f;
        this.f6442ri.m8304ri(this, f);
    }
}
