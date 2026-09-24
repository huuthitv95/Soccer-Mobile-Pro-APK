package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.vr */
/* JADX INFO: loaded from: classes3.dex */
public class C2957vr extends View {

    /* JADX INFO: renamed from: lr */
    private View f8899lr;

    /* JADX INFO: renamed from: ri */
    private final ri f8900ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.vr$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        View mo10651ri(Context context);
    }

    public C2957vr(Context context, ri riVar) {
        super(context);
        this.f8900ri = riVar;
        m11441ri();
    }

    /* JADX INFO: renamed from: lr */
    private View m11440lr() {
        ri riVar;
        if (this.f8899lr == null && (riVar = this.f8900ri) != null) {
            this.f8899lr = riVar.mo10651ri(getContext());
            m11442ri(this.f8899lr, (ViewGroup) getParent());
        }
        return this.f8899lr;
    }

    /* JADX INFO: renamed from: ri */
    private void m11441ri() {
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* JADX INFO: renamed from: ri */
    private void m11442ri(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        View view = this.f8899lr;
        if (view != null) {
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m11440lr();
        }
    }
}
