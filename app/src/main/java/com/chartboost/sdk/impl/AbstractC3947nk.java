package com.chartboost.sdk.impl;

import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.nk */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3947nk {
    /* JADX INFO: renamed from: a */
    public static final void m18806a(SurfaceView surfaceView, int i, int i2, int i3, int i4) {
        if (surfaceView != null) {
            float f = i3;
            float f2 = i;
            float f3 = f / f2;
            float f4 = i4;
            float f5 = i2;
            float f6 = f4 / f5;
            float f7 = f2 / f5;
            ViewGroup.LayoutParams layoutParams = surfaceView.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = null;
            FrameLayout.LayoutParams layoutParams3 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams3 != null) {
                if (f3 > f6) {
                    layoutParams3.width = (int) (f4 * f7);
                    layoutParams3.height = i4;
                } else {
                    layoutParams3.width = i3;
                    layoutParams3.height = (int) (f / f7);
                }
                layoutParams3.gravity = 17;
                layoutParams2 = layoutParams3;
            }
            surfaceView.setLayoutParams(layoutParams2);
        }
    }
}
