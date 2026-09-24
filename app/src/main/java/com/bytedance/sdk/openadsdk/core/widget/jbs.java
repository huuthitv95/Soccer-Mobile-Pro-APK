package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.p219ik.C3221ri;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;

/* JADX INFO: loaded from: classes3.dex */
public class jbs extends FrameLayout {

    /* JADX INFO: renamed from: di */
    private PAGLogoView f11726di;

    /* JADX INFO: renamed from: fi */
    private TextView f11727fi;

    /* JADX INFO: renamed from: ik */
    private TextView f11728ik;
    private String jbs;

    /* JADX INFO: renamed from: ka */
    private slm f11729ka;

    /* JADX INFO: renamed from: lr */
    private C3335bu f11730lr;

    /* JADX INFO: renamed from: mj */
    private wjv f11731mj;

    /* JADX INFO: renamed from: qt */
    private boolean f11732qt;

    /* JADX INFO: renamed from: ri */
    private boolean f11733ri;

    /* JADX INFO: renamed from: sf */
    private C3221ri f11734sf;
    private C3195mj xha;

    public jbs(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.slm.f13264eb);
    }

    /* JADX INFO: renamed from: lr */
    private void m15005lr() {
        Context context = getContext();
        boolean z = this.f11731mj.bbu() == 1;
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
        this.f11730lr = c3335bu;
        c3335bu.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C3583qd.m16589lr(context, 80.0f), C3583qd.m16589lr(context, 80.0f));
        layoutParams2.bottomMargin = C3583qd.m16589lr(context, 12.0f);
        c3191fi.addView(this.f11730lr, layoutParams2);
        C3195mj c3195mj = new C3195mj(context);
        this.f11728ik = c3195mj;
        c3195mj.setEllipsize(TextUtils.TruncateAt.END);
        this.f11728ik.setGravity(17);
        this.f11728ik.setMaxLines(2);
        this.f11728ik.setMaxWidth(C3583qd.m16589lr(context, 180.0f));
        this.f11728ik.setTextColor(-1);
        this.f11728ik.setTextSize(2, 24.0f);
        c3191fi.addView(this.f11728ik, new LinearLayout.LayoutParams(-1, -2));
        C3195mj c3195mj2 = new C3195mj(context);
        this.xha = c3195mj2;
        c3195mj2.setEllipsize(TextUtils.TruncateAt.END);
        this.xha.setGravity(17);
        this.xha.setMaxLines(2);
        this.xha.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.xha.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = C3583qd.m16589lr(context, 8.0f);
        c3191fi.addView(this.xha, layoutParams3);
        this.f11729ka = new slm(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, C3583qd.m16589lr(context, 16.0f));
        layoutParams4.topMargin = C3583qd.m16589lr(context, 12.0f);
        this.f11729ka.setVisibility(8);
        c3191fi.addView(this.f11729ka, layoutParams4);
        C3195mj c3195mj3 = new C3195mj(context);
        this.f11727fi = c3195mj3;
        c3195mj3.setId(520093707);
        this.f11727fi.setGravity(17);
        this.f11727fi.setText(C2729uq.m10311ri(context, "tt_video_download_apk"));
        this.f11727fi.setTextColor(-1);
        this.f11727fi.setTextSize(2, 16.0f);
        this.f11727fi.setBackground(C3586sf.m16645ri(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, C3583qd.m16589lr(context, 44.0f));
        layoutParams5.topMargin = C3583qd.m16589lr(context, 54.0f);
        c3191fi.addView(this.f11727fi, layoutParams5);
        if (!this.f11732qt && this.f11731mj.biu() && C3279dw.m14090ik(this.f11731mj)) {
            this.f11727fi.setVisibility(8);
        }
        this.f11726di = PAGLogoView.createPAGLogoViewByMaterial(context, this.f11731mj);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, C3583qd.m16589lr(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = C3583qd.m16589lr(context, 18.0f);
        if (z) {
            layoutParams6.bottomMargin = C3583qd.m16589lr(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = C3583qd.m16589lr(context, 24.0f);
        }
        addView(this.f11726di, layoutParams6);
    }

    /* JADX INFO: renamed from: ri */
    private void m15007ri() {
        if (this.f11733ri) {
            return;
        }
        this.f11733ri = true;
        m15005lr();
        this.f11727fi.setOnClickListener(this.f11734sf);
        this.f11727fi.setOnTouchListener(this.f11734sf);
        String strSkk = this.f11731mj.skk();
        if (!TextUtils.isEmpty(strSkk)) {
            this.f11727fi.setText(strSkk);
        }
        if (this.f11730lr != null && this.f11731mj.m14391fb() != null && !TextUtils.isEmpty(this.f11731mj.m14391fb().m14220ri())) {
            C2751lr.m10463lr().m10470ri(this.f11731mj.m14391fb(), this.f11730lr, this.f11731mj);
        }
        slm slmVar = this.f11729ka;
        if (slmVar != null) {
            C3583qd.m16618ri((TextView) null, slmVar, this.f11731mj);
            if (this.f11731mj.tyz() != null) {
                this.f11729ka.setVisibility(0);
            }
        }
        if (this.f11728ik != null) {
            if (this.f11731mj.tyz() != null && !TextUtils.isEmpty(this.f11731mj.tyz().m14073lr())) {
                this.f11728ik.setText(this.f11731mj.tyz().m14073lr());
            } else if (TextUtils.isEmpty(this.f11731mj.tpb())) {
                this.f11728ik.setVisibility(8);
            } else {
                this.f11728ik.setText(this.f11731mj.tpb());
            }
        }
        if (this.xha != null) {
            String strM14559xh = this.f11731mj.m14559xh();
            if (TextUtils.isEmpty(strM14559xh)) {
                this.xha.setVisibility(8);
            } else {
                this.xha.setText(strM14559xh);
            }
        }
        this.f11726di.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.jbs.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m10758ri(jbs.this.getContext(), jbs.this.f11731mj, jbs.this.jbs);
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public void m15008ri(wjv wjvVar, String str, C3221ri c3221ri, boolean z) {
        this.f11731mj = wjvVar;
        this.jbs = str;
        this.f11732qt = z;
        this.f11734sf = c3221ri;
    }

    public void setClickListener(C3221ri c3221ri) {
        this.f11734sf = c3221ri;
        TextView textView = this.f11727fi;
        if (textView != null) {
            textView.setOnClickListener(c3221ri);
            this.f11727fi.setOnTouchListener(this.f11734sf);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            m15007ri();
        }
    }
}
