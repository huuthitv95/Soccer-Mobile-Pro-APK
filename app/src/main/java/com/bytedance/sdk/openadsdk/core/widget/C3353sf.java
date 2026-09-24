package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.p219ik.C3221ri;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.sf */
/* JADX INFO: loaded from: classes3.dex */
public class C3353sf extends FrameLayout {

    /* JADX INFO: renamed from: di */
    private C3195mj f11843di;

    /* JADX INFO: renamed from: fi */
    private PAGLogoView f11844fi;

    /* JADX INFO: renamed from: ik */
    private TextView f11845ik;
    private C3221ri jbs;

    /* JADX INFO: renamed from: ka */
    private slm f11846ka;

    /* JADX INFO: renamed from: lr */
    private C3335bu f11847lr;

    /* JADX INFO: renamed from: mj */
    private String f11848mj;

    /* JADX INFO: renamed from: ri */
    private boolean f11849ri;
    private wjv xha;

    public C3353sf(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.slm.f13310vt);
    }

    /* JADX INFO: renamed from: lr */
    private void m15092lr() {
        Context context = getContext();
        boolean z = this.xha.bbu() == 1;
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        C3191fi c3191fi = new C3191fi(context);
        c3191fi.setGravity(1);
        c3191fi.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = z ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(C3583qd.m16589lr(context, 327.0f), -2);
        layoutParams.gravity = 17;
        int iM16589lr = C3583qd.m16589lr(context, 24.0f);
        layoutParams.rightMargin = iM16589lr;
        layoutParams.leftMargin = iM16589lr;
        addView(c3191fi, layoutParams);
        C3335bu c3335bu = new C3335bu(context);
        this.f11847lr = c3335bu;
        c3335bu.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C3583qd.m16589lr(context, 80.0f), C3583qd.m16589lr(context, 80.0f));
        layoutParams2.bottomMargin = C3583qd.m16589lr(context, 12.0f);
        c3191fi.addView(this.f11847lr, layoutParams2);
        C3195mj c3195mj = new C3195mj(context);
        this.f11845ik = c3195mj;
        c3195mj.setEllipsize(TextUtils.TruncateAt.END);
        this.f11845ik.setGravity(17);
        this.f11845ik.setMaxLines(2);
        this.f11845ik.setMaxWidth(C3583qd.m16589lr(context, 180.0f));
        this.f11845ik.setTextColor(-1);
        this.f11845ik.setTextSize(2, 24.0f);
        c3191fi.addView(this.f11845ik, new LinearLayout.LayoutParams(-1, -2));
        C3195mj c3195mj2 = new C3195mj(context);
        this.f11843di = c3195mj2;
        c3195mj2.setEllipsize(TextUtils.TruncateAt.END);
        this.f11843di.setGravity(17);
        this.f11843di.setMaxLines(2);
        this.f11843di.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.f11843di.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = C3583qd.m16589lr(context, 8.0f);
        c3191fi.addView(this.f11843di, layoutParams3);
        this.f11846ka = new slm(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, C3583qd.m16589lr(context, 16.0f));
        layoutParams4.topMargin = C3583qd.m16589lr(context, 12.0f);
        this.f11846ka.setVisibility(8);
        c3191fi.addView(this.f11846ka, layoutParams4);
        this.f11844fi = PAGLogoView.createPAGLogoViewByMaterial(context, this.xha);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, C3583qd.m16589lr(context, 14.0f));
        layoutParams5.gravity = 8388691;
        layoutParams5.leftMargin = C3583qd.m16589lr(context, 18.0f);
        if (z) {
            layoutParams5.bottomMargin = C3583qd.m16589lr(context, 61.0f);
        } else {
            layoutParams5.bottomMargin = C3583qd.m16589lr(context, 24.0f);
        }
        addView(this.f11844fi, layoutParams5);
    }

    /* JADX INFO: renamed from: ri */
    private void m15094ri() {
        if (this.f11849ri) {
            return;
        }
        this.f11849ri = true;
        m15092lr();
        if (this.f11847lr != null && this.xha.m14391fb() != null && !TextUtils.isEmpty(this.xha.m14391fb().m14220ri())) {
            C2751lr.m10463lr().m10470ri(this.xha.m14391fb(), this.f11847lr, this.xha);
        }
        slm slmVar = this.f11846ka;
        if (slmVar != null) {
            C3583qd.m16618ri((TextView) null, slmVar, this.xha);
            if (this.xha.tyz() != null) {
                this.f11846ka.setVisibility(0);
            }
        }
        if (this.f11845ik != null) {
            if (this.xha.tyz() != null && !TextUtils.isEmpty(this.xha.tyz().m14073lr())) {
                this.f11845ik.setText(this.xha.tyz().m14073lr());
            } else if (TextUtils.isEmpty(this.xha.tpb())) {
                this.f11845ik.setVisibility(8);
            } else {
                this.f11845ik.setText(this.xha.tpb());
            }
        }
        if (this.f11843di != null) {
            String strM14559xh = this.xha.m14559xh();
            if (TextUtils.isEmpty(strM14559xh)) {
                this.f11843di.setVisibility(8);
            } else {
                this.f11843di.setText(strM14559xh);
            }
        }
        this.f11844fi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.sf.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m10758ri(C3353sf.this.getContext(), C3353sf.this.xha, C3353sf.this.f11848mj);
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public void m15095ri(wjv wjvVar, String str, C3221ri c3221ri) {
        this.xha = wjvVar;
        this.f11848mj = str;
        this.jbs = c3221ri;
    }

    public void setClickListener(C3221ri c3221ri) {
        this.jbs = c3221ri;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            m15094ri();
        }
    }
}
