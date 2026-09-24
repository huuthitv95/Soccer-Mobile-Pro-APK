package com.bytedance.sdk.component.jbs;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: com.bytedance.sdk.component.jbs.ik */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractViewOnTouchListenerC2636ik implements View.OnTouchListener {

    /* JADX INFO: renamed from: lr */
    private int f7459lr = -1;

    /* JADX INFO: renamed from: ri */
    private ViewConfiguration f7460ri;

    /* JADX INFO: renamed from: ri */
    abstract void mo9794ri(View.OnTouchListener onTouchListener);

    /* JADX INFO: renamed from: ri */
    boolean m9795ri(float f, float f2, float f3, float f4, Context context) {
        if (this.f7460ri == null) {
            this.f7460ri = ViewConfiguration.get(context);
        }
        if (this.f7459lr == -1) {
            this.f7459lr = this.f7460ri.getScaledTouchSlop();
        }
        Integer.valueOf(this.f7459lr);
        if (Math.abs(f - f3) > this.f7459lr || Math.abs(f2 - f4) > this.f7459lr) {
            Float.valueOf(f);
            Float.valueOf(f3);
            Float.valueOf(f2);
            Float.valueOf(f4);
            return false;
        }
        Float.valueOf(f);
        Float.valueOf(f3);
        Float.valueOf(f2);
        Float.valueOf(f4);
        return true;
    }
}
