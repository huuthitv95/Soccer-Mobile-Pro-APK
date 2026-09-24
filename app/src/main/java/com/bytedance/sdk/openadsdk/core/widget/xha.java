package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.p251qt.C3491ka;
import com.bytedance.sdk.openadsdk.p251qt.C3492lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3599zf;

/* JADX INFO: loaded from: classes3.dex */
public class xha extends com.bytedance.sdk.openadsdk.core.p217di.xha {

    /* JADX INFO: renamed from: di */
    private boolean f11870di;

    /* JADX INFO: renamed from: fi */
    private boolean f11871fi;

    /* JADX INFO: renamed from: ik */
    private C3343mj f11872ik;

    /* JADX INFO: renamed from: ka */
    private C3195mj f11873ka;

    /* JADX INFO: renamed from: lr */
    private C3195mj f11874lr;

    /* JADX INFO: renamed from: ri */
    private C3335bu f11875ri;

    public xha(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (mo15033ri()) {
            m15116lr();
        }
    }

    public C3195mj getDownloadButton() {
        return this.f11873ka;
    }

    public C3343mj getLoadingProgressBar() {
        return this.f11872ik;
    }

    /* JADX INFO: renamed from: lr */
    public void m15116lr() {
        if (this.f11871fi) {
            return;
        }
        this.f11871fi = true;
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        C3335bu c3335bu = new C3335bu(context);
        this.f11875ri = c3335bu;
        c3335bu.setId(520093745);
        int iM16589lr = C3583qd.m16589lr(context, 64.0f);
        this.f11875ri.setLayoutParams(new RelativeLayout.LayoutParams(iM16589lr, iM16589lr));
        C3195mj c3195mj = new C3195mj(context);
        this.f11874lr = c3195mj;
        c3195mj.setId(520093746);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C3583qd.m16589lr(context, 219.0f), -2);
        layoutParams2.topMargin = C3583qd.m16589lr(context, 16.0f);
        this.f11874lr.setLayoutParams(layoutParams2);
        this.f11874lr.setEllipsize(TextUtils.TruncateAt.END);
        this.f11874lr.setGravity(17);
        this.f11874lr.setMaxWidth(C3583qd.m16589lr(context, 150.0f));
        this.f11874lr.setMaxLines(2);
        this.f11874lr.setTextColor(-1);
        this.f11874lr.setTextSize(1, 16.0f);
        C3343mj c3343mj = new C3343mj(context);
        this.f11872ik = c3343mj;
        c3343mj.setId(520093748);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(C3583qd.m16589lr(context, 219.0f), C3583qd.m16589lr(context, 6.0f));
        layoutParams3.topMargin = C3583qd.m16589lr(context, 24.0f);
        this.f11872ik.setLayoutParams(layoutParams3);
        this.f11873ka = new C3195mj(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(C3583qd.m16589lr(context, 138.0f), C3583qd.m16589lr(context, 42.0f));
        layoutParams4.topMargin = C3583qd.m16589lr(context, 48.0f);
        this.f11873ka.setLayoutParams(layoutParams4);
        this.f11873ka.setTextColor(-1);
        this.f11873ka.setTextSize(16.0f);
        this.f11873ka.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(2, -1);
        gradientDrawable.setCornerRadius(layoutParams4.height / 2);
        this.f11873ka.setBackground(gradientDrawable);
        linearLayout.addView(this.f11875ri);
        linearLayout.addView(this.f11874lr);
        linearLayout.addView(this.f11872ik);
        linearLayout.addView(this.f11873ka);
        addView(linearLayout);
    }

    /* JADX INFO: renamed from: ri */
    public void m15117ri(wjv wjvVar, int i) {
        if (!this.f11871fi || wjvVar == null || this.f11870di) {
            return;
        }
        this.f11870di = true;
        boolean zEvm = wjvVar.evm();
        if (zEvm || wjvVar.m14391fb() == null || TextUtils.isEmpty(wjvVar.m14391fb().m14220ri())) {
            this.f11875ri.setVisibility(8);
        } else {
            try {
                C3491ka.m15833ri(wjvVar.m14391fb()).mo9652ik(1).mo9658ri(new C3492lr(wjvVar, wjvVar.m14391fb().m14220ri(), new C3599zf(this.f11875ri)));
            } catch (Throwable unused) {
                this.f11875ri.setVisibility(8);
            }
        }
        if (zEvm) {
            this.f11874lr.setText("Loading");
        } else if (TextUtils.isEmpty(wjvVar.m14559xh())) {
            this.f11874lr.setVisibility(8);
        } else {
            this.f11874lr.setText(wjvVar.m14559xh());
        }
        C3195mj c3195mj = this.f11873ka;
        if (c3195mj != null) {
            c3195mj.setText(wjvVar.skk());
        }
    }

    /* JADX INFO: renamed from: ri */
    protected boolean mo15033ri() {
        return true;
    }

    public void setProgress(int i) {
        C3343mj c3343mj = this.f11872ik;
        if (c3343mj != null) {
            c3343mj.setProgress(i);
        }
    }
}
