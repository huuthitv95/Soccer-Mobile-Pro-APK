package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.widget.C3335bu;
import com.bytedance.sdk.openadsdk.core.widget.C3343mj;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.sf */
/* JADX INFO: loaded from: classes3.dex */
public class C2952sf {

    /* JADX INFO: renamed from: fi */
    private C3195mj f8872fi;

    /* JADX INFO: renamed from: ik */
    private C3343mj f8873ik;

    /* JADX INFO: renamed from: ka */
    private C3335bu f8874ka;

    /* JADX INFO: renamed from: lr */
    protected Context f8875lr;

    /* JADX INFO: renamed from: ri */
    protected View f8876ri = m11413fi();

    public C2952sf(Context context) {
        this.f8875lr = context;
    }

    /* JADX INFO: renamed from: fi */
    private View m11413fi() {
        C3191fi c3191fi = new C3191fi(this.f8875lr);
        c3191fi.setGravity(1);
        c3191fi.setOrientation(1);
        C3335bu c3335bu = new C3335bu(this.f8875lr);
        this.f8874ka = c3335bu;
        c3335bu.setId(520093745);
        int iM16589lr = C3583qd.m16589lr(this.f8875lr, 64.0f);
        c3191fi.addView(this.f8874ka, new LinearLayout.LayoutParams(iM16589lr, iM16589lr));
        C3195mj c3195mj = new C3195mj(this.f8875lr);
        this.f8872fi = c3195mj;
        c3195mj.setId(520093746);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C3583qd.m16589lr(this.f8875lr, 219.0f), -2);
        layoutParams.topMargin = C3583qd.m16589lr(this.f8875lr, 16.0f);
        this.f8872fi.setLayoutParams(layoutParams);
        this.f8872fi.setEllipsize(TextUtils.TruncateAt.END);
        this.f8872fi.setGravity(17);
        this.f8872fi.setMaxWidth(C3583qd.m16589lr(this.f8875lr, 150.0f));
        this.f8872fi.setMaxLines(2);
        this.f8872fi.setTextColor(-1);
        this.f8872fi.setTextSize(1, 16.0f);
        c3191fi.addView(this.f8872fi);
        this.f8873ik = new C3343mj(this.f8875lr);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C3583qd.m16589lr(this.f8875lr, 219.0f), C3583qd.m16589lr(this.f8875lr, 6.0f));
        layoutParams2.topMargin = C3583qd.m16589lr(this.f8875lr, 32.0f);
        c3191fi.addView(this.f8873ik, layoutParams2);
        return c3191fi;
    }

    /* JADX INFO: renamed from: ik */
    public C3195mj m11414ik() {
        return this.f8872fi;
    }

    /* JADX INFO: renamed from: ka */
    public void m11415ka() {
        this.f8876ri = null;
        this.f8875lr = null;
    }

    /* JADX INFO: renamed from: lr */
    public C3335bu m11416lr() {
        return this.f8874ka;
    }

    /* JADX INFO: renamed from: ri */
    public View m11417ri() {
        return this.f8876ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m11418ri(int i) {
        this.f8873ik.setProgress(i);
    }
}
