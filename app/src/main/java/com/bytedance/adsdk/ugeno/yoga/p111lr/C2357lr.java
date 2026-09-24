package com.bytedance.adsdk.ugeno.yoga.p111lr;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt;
import com.bytedance.adsdk.ugeno.yoga.AbstractC2363sf;
import com.bytedance.adsdk.ugeno.yoga.xha;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2357lr extends ViewGroup {
    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof C2357lr) {
            throw null;
        }
        AbstractC2360qt abstractC2360qtM8177ri = AbstractC2363sf.m8177ri();
        C2356ik.m8127ri(new C2356ik.ri(layoutParams), abstractC2360qtM8177ri, view);
        abstractC2360qtM8177ri.mo8096ri(view);
        abstractC2360qtM8177ri.mo8095ri((xha) new C2356ik.lr());
        throw null;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2356ik.ri;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2356ik.ri(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2356ik.ri(layoutParams);
    }

    public AbstractC2360qt getYogaNode() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }
}
