package com.bytedance.sdk.openadsdk.component.jbs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.jbs.C3230fi;
import com.bytedance.sdk.openadsdk.core.jbs.C3233ka;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.widget.C3339ik;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.slm;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.jbs.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2969fi extends AbstractC2970ik {

    /* JADX INFO: renamed from: aw */
    ri f9006aw;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.jbs.fi$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo11527ri(View view, int i);
    }

    public C2969fi(Context context, wjv wjvVar) {
        super(context);
        m11532ri(context, wjvVar);
    }

    /* JADX INFO: renamed from: ri */
    private void m11532ri(Context context, wjv wjvVar) {
        C3230fi c3230fi = new C3230fi(context);
        C3233ka.m13677ri().m13679ik(c3230fi);
        c3230fi.m13640ri(wjvVar, new C3230fi.lr() { // from class: com.bytedance.sdk.openadsdk.component.jbs.fi.1
            @Override // com.bytedance.sdk.openadsdk.core.jbs.C3230fi.lr
            /* JADX INFO: renamed from: lr */
            public void mo11533lr() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.C3230fi.lr
            /* JADX INFO: renamed from: ri */
            public View mo11534ri() {
                return C2969fi.this;
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.C3230fi.lr
            /* JADX INFO: renamed from: ri */
            public void mo11535ri(int i, int i2) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.C3230fi.lr
            /* JADX INFO: renamed from: ri */
            public void mo11536ri(View view, int i) {
                if (C2969fi.this.f9006aw != null) {
                    C2969fi.this.f9006aw.mo11527ri(view, i);
                }
            }
        }, "open_ad");
        addView(c3230fi, new ViewGroup.LayoutParams(-1, -1));
        c3230fi.m13635ac();
        int iM16589lr = C3583qd.m16589lr(context, 9.0f);
        int iM16589lr2 = C3583qd.m16589lr(context, 10.0f);
        this.f9012ka = PAGLogoView.createPAGLogoViewByMaterial(context, wjvVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, C3583qd.m16589lr(context, 14.0f));
        layoutParams.leftMargin = iM16589lr2;
        layoutParams.bottomMargin = iM16589lr2;
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        addView(this.f9012ka, layoutParams);
        this.f9008co = new C3339ik(context);
        this.f9008co.setPadding(iM16589lr, 0, iM16589lr, 0);
        this.f9008co.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C3583qd.m16589lr(context, 32.0f), C3583qd.m16589lr(context, 14.0f));
        layoutParams2.addRule(12);
        layoutParams2.addRule(11);
        layoutParams2.setMargins(0, 0, iM16589lr2, iM16589lr2);
        addView(this.f9008co, layoutParams2);
        if (this.f9014mj != null) {
            addView(this.f9014mj);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.AbstractC2970ik
    public C3193ka getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.AbstractC2970ik
    public C3195mj getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.AbstractC2970ik
    public slm getScoreBar() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.AbstractC2970ik
    public View getUserInfo() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9006aw = null;
    }

    public void setRenderListener(ri riVar) {
        this.f9006aw = riVar;
    }
}
