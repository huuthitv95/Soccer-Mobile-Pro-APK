package com.bytedance.adsdk.ugeno.p108ri;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C2334mj implements xha {

    /* JADX INFO: renamed from: di */
    private float f6042di;

    /* JADX INFO: renamed from: fi */
    private float f6043fi;

    /* JADX INFO: renamed from: ik */
    private float f6044ik;

    /* JADX INFO: renamed from: ka */
    private float f6045ka;

    /* JADX INFO: renamed from: lr */
    private float f6046lr;

    /* JADX INFO: renamed from: ri */
    private View f6047ri;

    public C2334mj(View view) {
        this.f6047ri = view;
    }

    /* JADX INFO: renamed from: fi */
    public void m7997fi(float f) {
        this.f6042di = f;
        this.f6047ri.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.xha
    public float getRipple() {
        return this.f6044ik;
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.xha
    public float getRubIn() {
        return this.f6042di;
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.xha
    public float getShine() {
        return this.f6045ka;
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.xha
    public float getStretch() {
        return this.f6043fi;
    }

    /* JADX INFO: renamed from: ik */
    public void m7998ik(float f) {
        View view = this.f6047ri;
        if (view == null) {
            return;
        }
        this.f6045ka = f;
        view.postInvalidate();
    }

    /* JADX INFO: renamed from: ka */
    public void m7999ka(float f) {
        this.f6043fi = f;
        this.f6047ri.postInvalidate();
    }

    /* JADX INFO: renamed from: lr */
    public void m8000lr(float f) {
        View view = this.f6047ri;
        if (view == null) {
            return;
        }
        this.f6044ik = f;
        view.postInvalidate();
    }

    /* JADX INFO: renamed from: ri */
    public float m8001ri() {
        return this.f6046lr;
    }

    /* JADX INFO: renamed from: ri */
    public void m8002ri(float f) {
        View view = this.f6047ri;
        if (view == null) {
            return;
        }
        this.f6046lr = f;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m8003ri(int i) {
        View view = this.f6047ri;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background.mutate()).setColor(i);
        }
    }
}
