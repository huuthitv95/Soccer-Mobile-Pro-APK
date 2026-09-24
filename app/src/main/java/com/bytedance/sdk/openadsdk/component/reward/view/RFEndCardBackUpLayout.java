package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.p202ri.C3139ik;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractC3217fi;
import com.bytedance.sdk.openadsdk.core.widget.C3335bu;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.slm;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3371ka;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class RFEndCardBackUpLayout extends C3192ik {
    private static final String TAG = "TTAD.RFEndCardBackUpL";
    private C3022ri adContext;
    private PAGLogoView adLogo;
    private C3335bu ivIcon;
    private boolean mInit;
    private slm rbScore;
    private int shownAdCount;
    private C3195mj tvDesc;
    private C3195mj tvDownload;
    private TextView tvTitle;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout$ri */
    private static final class C3065ri extends Drawable {

        /* JADX INFO: renamed from: ik */
        private final int f9584ik;

        /* JADX INFO: renamed from: lr */
        private final Drawable f9585lr;

        /* JADX INFO: renamed from: ri */
        Path f9586ri = new Path();

        public C3065ri(Context context) {
            this.f9585lr = C2729uq.m10303ik(context, "tt_ad_bg_header_gradient");
            this.f9584ik = C3583qd.m16589lr(context, 8.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.clipPath(this.f9586ri);
            canvas.drawColor(-1);
            this.f9585lr.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4);
            float f = i3;
            this.f9585lr.setBounds(i, i2, i3, (int) (((1.0f * f) / this.f9585lr.getIntrinsicWidth()) * this.f9585lr.getIntrinsicHeight()));
            this.f9586ri.reset();
            Path path = this.f9586ri;
            RectF rectF = new RectF(0.0f, 0.0f, f, i4);
            int i5 = this.f9584ik;
            path.addRoundRect(rectF, i5, i5, Path.Direction.CCW);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public RFEndCardBackUpLayout(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.slm.f13264eb);
    }

    private void bindDescData(C3195mj c3195mj, wjv wjvVar) {
        if (c3195mj == null) {
            return;
        }
        String strM14535tq = wjvVar.m14535tq();
        if (TextUtils.isEmpty(strM14535tq)) {
            return;
        }
        c3195mj.setText(strM14535tq);
    }

    private void bindIconData(C3193ka c3193ka, wjv wjvVar) {
        if (c3193ka == null || wjvVar.m14391fb() == null || TextUtils.isEmpty(wjvVar.m14391fb().m14220ri())) {
            return;
        }
        C2751lr.m10463lr().m10470ri(wjvVar.m14391fb(), c3193ka, wjvVar);
    }

    private void bindTitleData(TextView textView, wjv wjvVar, String str) {
        if (textView != null) {
            if (wjvVar.tyz() == null || TextUtils.isEmpty(wjvVar.tyz().m14073lr())) {
                textView.setText(str);
            } else {
                textView.setText(wjvVar.tyz().m14073lr());
            }
        }
    }

    private void initData(final wjv wjvVar, C3195mj c3195mj) {
        setDownloadButtonData(c3195mj, wjvVar, -1);
        bindIconData(this.ivIcon, wjvVar);
        slm slmVar = this.rbScore;
        if (slmVar != null) {
            C3583qd.m16618ri((TextView) null, slmVar, wjvVar);
            if (wjvVar.tyz() != null) {
                this.rbScore.setVisibility(0);
            }
        }
        if (this.tvTitle != null) {
            if (wjvVar.tyz() != null && !TextUtils.isEmpty(wjvVar.tyz().m14073lr())) {
                this.tvTitle.setText(wjvVar.tyz().m14073lr());
            } else if (TextUtils.isEmpty(wjvVar.tpb())) {
                this.tvTitle.setVisibility(8);
            } else {
                this.tvTitle.setText(wjvVar.tpb());
            }
        }
        if (this.tvDesc != null) {
            String strM14559xh = wjvVar.m14559xh();
            if (TextUtils.isEmpty(strM14559xh)) {
                this.tvDesc.setVisibility(8);
            } else {
                this.tvDesc.setText(strM14559xh);
            }
        }
        this.adLogo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m10758ri(RFEndCardBackUpLayout.this.adContext.f9384ig, wjvVar, RFEndCardBackUpLayout.this.adContext.f9381fi);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void initOneSlotMultipleAdsLayout() {
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#C2FFFFFF"));
        C3191fi c3191fi = new C3191fi(context);
        c3191fi.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(C3583qd.m16589lr(context, 16.0f), 0, C3583qd.m16589lr(context, 16.0f), 0);
        layoutParams.gravity = 17;
        addView(c3191fi, layoutParams);
        if (this.adContext.bnj == 2) {
            C3191fi c3191fi2 = new C3191fi(context);
            c3191fi2.setOrientation(0);
            c3191fi.addView(c3191fi2, new FrameLayout.LayoutParams(-1, -2));
            initOneSlotMultipleAdsLayoutLandscape(c3191fi2, this.shownAdCount);
        } else if (this.shownAdCount == 2) {
            initOneSlotMultipleAdsLayoutForTwoAdVertical(c3191fi);
        } else {
            initOneSlotMultipleAdsLayoutForThreeAdVertical(c3191fi);
        }
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.adContext.f9384ig, this.adContext.f9389lr);
        pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093757);
        c3191fi.addView(pAGLogoViewCreatePAGLogoViewByMaterial);
        pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.m10758ri(RFEndCardBackUpLayout.this.adContext.f9384ig, RFEndCardBackUpLayout.this.adContext.f9389lr, RFEndCardBackUpLayout.this.adContext.f9381fi);
            }
        });
    }

    private void initOneSlotMultipleAdsLayoutForThreeAdVertical(C3191fi c3191fi) {
        if (this.adContext.f9389lr != null) {
            List<wjv> listM14252ka = this.adContext.f9389lr.m14428ka().m14252ka();
            for (int i = 0; i < listM14252ka.size() && i < 3; i++) {
                initSingleCardInThreeCardStyle(c3191fi, listM14252ka.get(i), i);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutForTwoAdVertical(C3191fi c3191fi) {
        if (this.adContext.f9389lr != null) {
            List<wjv> listM14252ka = this.adContext.f9389lr.m14428ka().m14252ka();
            for (int i = 0; i < listM14252ka.size() && i < 2; i++) {
                initSingleCardInTwoCardStyle(c3191fi, listM14252ka.get(i), i);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutLandscape(C3191fi c3191fi, int i) {
        if (this.adContext.f9389lr != null) {
            List<wjv> listM14252ka = this.adContext.f9389lr.m14428ka().m14252ka();
            for (int i2 = 0; i2 < listM14252ka.size() && i2 < i && i2 < 3; i2++) {
                initSingleCardInTwoCardStyleLandscape(c3191fi, listM14252ka.get(i2), i2, i);
            }
        }
    }

    private void initSingleCardInThreeCardStyle(C3191fi c3191fi, wjv wjvVar, int i) {
        Context context = getContext();
        C3191fi c3191fi2 = new C3191fi(context);
        c3191fi2.setOrientation(1);
        c3191fi2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i > 0 ? C3583qd.m16589lr(context, 12.0f) : 0, 0, 0);
        c3191fi2.setBackground(new C3065ri(context));
        c3191fi.addView(c3191fi2, layoutParams);
        C3191fi c3191fi3 = new C3191fi(context);
        c3191fi3.setOrientation(0);
        c3191fi3.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = C3583qd.m16589lr(context, 20.0f);
        layoutParams2.leftMargin = C3583qd.m16589lr(context, 17.0f);
        layoutParams2.rightMargin = C3583qd.m16589lr(context, 30.0f);
        c3191fi2.addView(c3191fi3, layoutParams2);
        C3193ka c3335bu = new C3335bu(context);
        c3191fi3.addView(c3335bu, new FrameLayout.LayoutParams(C3583qd.m16589lr(context, 70.0f), C3583qd.m16589lr(context, 63.0f)));
        bindIconData(c3335bu, wjvVar);
        C3191fi c3191fi4 = new C3191fi(context);
        c3191fi4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = C3583qd.m16589lr(context, 7.0f);
        c3191fi3.addView(c3191fi4, layoutParams3);
        C3195mj c3195mj = new C3195mj(context);
        c3195mj.setSingleLine(true);
        c3195mj.setEllipsize(TextUtils.TruncateAt.END);
        c3195mj.setTextSize(18.0f);
        c3195mj.setTextColor(Color.parseColor("#161823"));
        c3195mj.setGravity(GravityCompat.START);
        c3195mj.setTypeface(null, 1);
        c3191fi4.addView(c3195mj, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(c3195mj, wjvVar, wjvVar.tpb());
        C3195mj c3195mj2 = new C3195mj(context);
        c3195mj2.setSingleLine(true);
        c3195mj2.setEllipsize(TextUtils.TruncateAt.END);
        c3195mj2.setTextSize(16.0f);
        c3195mj2.setTextColor(Color.parseColor("#80161823"));
        c3191fi4.addView(c3195mj2, new FrameLayout.LayoutParams(-1, -2));
        bindDescData(c3195mj2, wjvVar);
        C3191fi c3191fi5 = new C3191fi(context);
        c3191fi5.setOrientation(0);
        c3191fi5.setGravity(16);
        c3191fi4.addView(c3191fi5, new FrameLayout.LayoutParams(-2, -2));
        C3195mj c3195mj3 = new C3195mj(context);
        c3195mj3.setTextSize(16.0f);
        c3195mj3.setTextColor(Color.parseColor("#80161823"));
        c3191fi5.addView(c3195mj3, new ViewGroup.LayoutParams(-2, -2));
        slm slmVar = new slm(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = C3583qd.m16589lr(context, 8.0f);
        c3191fi5.addView(slmVar, layoutParams4);
        C3583qd.m16619ri(c3195mj3, slmVar, wjvVar, 18);
        C3195mj c3195mj4 = new C3195mj(context);
        c3195mj4.setGravity(17);
        c3195mj4.setId(520093707);
        c3195mj4.setText(C2729uq.m10311ri(context, "tt_video_download_apk"));
        c3195mj4.setTextColor(-1);
        c3195mj4.setTextSize(2, 16.0f);
        c3195mj4.setBackground(C3586sf.m16645ri(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, C3583qd.m16589lr(context, 36.0f));
        layoutParams5.setMargins(C3583qd.m16589lr(context, 20.0f), C3583qd.m16589lr(context, 22.0f), C3583qd.m16589lr(context, 20.0f), C3583qd.m16589lr(context, 20.0f));
        c3191fi2.addView(c3195mj4, layoutParams5);
        setDownloadButtonData(c3195mj4, wjvVar, i);
    }

    private void initSingleCardInTwoCardStyle(C3191fi c3191fi, wjv wjvVar, int i) {
        Context context = getContext();
        C3191fi c3191fi2 = new C3191fi(context);
        c3191fi2.setOrientation(1);
        c3191fi2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i > 0 ? C3583qd.m16589lr(context, 12.0f) : 0, 0, 0);
        c3191fi2.setBackground(new C3065ri(context));
        c3191fi.addView(c3191fi2, layoutParams);
        C3193ka c3335bu = new C3335bu(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C3583qd.m16589lr(context, 70.0f), C3583qd.m16589lr(context, 63.0f));
        layoutParams2.setMargins(0, C3583qd.m16589lr(context, 24.0f), 0, C3583qd.m16589lr(context, 12.0f));
        c3191fi2.addView(c3335bu, layoutParams2);
        bindIconData(c3335bu, wjvVar);
        C3195mj c3195mj = new C3195mj(context);
        c3195mj.setSingleLine(true);
        c3195mj.setEllipsize(TextUtils.TruncateAt.END);
        c3195mj.setTextSize(18.0f);
        c3195mj.setTextColor(Color.parseColor("#161823"));
        c3195mj.setGravity(17);
        c3195mj.setTypeface(null, 1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(C3583qd.m16589lr(context, 56.0f), 0, C3583qd.m16589lr(context, 56.0f), 0);
        c3191fi2.addView(c3195mj, layoutParams3);
        bindTitleData(c3195mj, wjvVar, wjvVar.tpb());
        C3195mj c3195mj2 = new C3195mj(context);
        c3195mj2.setSingleLine(true);
        c3195mj2.setEllipsize(TextUtils.TruncateAt.END);
        c3195mj2.setTextSize(16.0f);
        c3195mj2.setTextColor(Color.parseColor("#80161823"));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(C3583qd.m16589lr(context, 56.0f), C3583qd.m16589lr(context, 4.0f), C3583qd.m16589lr(context, 56.0f), 0);
        c3191fi2.addView(c3195mj2, layoutParams4);
        bindDescData(c3195mj2, wjvVar);
        C3191fi c3191fi3 = new C3191fi(context);
        c3191fi3.setOrientation(0);
        c3191fi3.setGravity(16);
        c3191fi2.addView(c3191fi3, new FrameLayout.LayoutParams(-2, -2));
        C3195mj c3195mj3 = new C3195mj(context);
        c3195mj3.setTextSize(16.0f);
        c3195mj3.setTextColor(Color.parseColor("#80161823"));
        c3191fi3.addView(c3195mj3, new ViewGroup.LayoutParams(-2, -2));
        slm slmVar = new slm(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = C3583qd.m16589lr(context, 8.0f);
        c3191fi3.addView(slmVar, layoutParams5);
        C3583qd.m16619ri(c3195mj3, slmVar, wjvVar, 18);
        C3195mj c3195mj4 = new C3195mj(context);
        c3195mj4.setGravity(17);
        c3195mj4.setId(520093707);
        c3195mj4.setText(C2729uq.m10311ri(context, "tt_video_download_apk"));
        c3195mj4.setTextColor(-1);
        c3195mj4.setTextSize(2, 16.0f);
        c3195mj4.setBackground(C3586sf.m16645ri(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, C3583qd.m16589lr(context, 36.0f));
        layoutParams6.setMargins(C3583qd.m16589lr(context, 20.0f), C3583qd.m16589lr(context, 36.0f), C3583qd.m16589lr(context, 20.0f), C3583qd.m16589lr(context, 20.0f));
        c3191fi2.addView(c3195mj4, layoutParams6);
        setDownloadButtonData(c3195mj4, wjvVar, i);
    }

    private void initSingleCardInTwoCardStyleLandscape(C3191fi c3191fi, wjv wjvVar, int i, int i2) {
        Context context = getContext();
        C3191fi c3191fi2 = new C3191fi(context);
        c3191fi2.setOrientation(1);
        c3191fi2.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        if (i > 0) {
            layoutParams.setMargins(C3583qd.m16589lr(context, 12.0f), 0, 0, 0);
        }
        c3191fi2.setBackground(new C3065ri(context));
        c3191fi.addView(c3191fi2, layoutParams);
        C3191fi c3191fi3 = new C3191fi(context);
        c3191fi3.setOrientation(0);
        c3191fi3.setGravity(48);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = C3583qd.m16589lr(context, 20.0f);
        layoutParams2.leftMargin = C3583qd.m16589lr(context, 17.0f);
        layoutParams2.rightMargin = C3583qd.m16589lr(context, 30.0f);
        c3191fi2.addView(c3191fi3, layoutParams2);
        C3193ka c3335bu = new C3335bu(context);
        c3191fi3.addView(c3335bu, new FrameLayout.LayoutParams(C3583qd.m16589lr(context, 44.0f), C3583qd.m16589lr(context, 44.0f)));
        bindIconData(c3335bu, wjvVar);
        C3191fi c3191fi4 = new C3191fi(context);
        c3191fi4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = C3583qd.m16589lr(context, 7.0f);
        c3191fi3.addView(c3191fi4, layoutParams3);
        C3195mj c3195mj = new C3195mj(context);
        c3195mj.setSingleLine(true);
        c3195mj.setEllipsize(TextUtils.TruncateAt.END);
        c3195mj.setTextSize(18.0f);
        c3195mj.setTextColor(Color.parseColor("#161823"));
        c3195mj.setGravity(GravityCompat.START);
        c3195mj.setTypeface(null, 1);
        c3191fi4.addView(c3195mj, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(c3195mj, wjvVar, wjvVar.tpb());
        C3191fi c3191fi5 = new C3191fi(context);
        c3191fi5.setOrientation(0);
        c3191fi5.setGravity(16);
        c3191fi4.addView(c3191fi5, new FrameLayout.LayoutParams(-2, -2));
        C3195mj c3195mj2 = new C3195mj(context);
        c3195mj2.setTextSize(16.0f);
        c3195mj2.setTextColor(Color.parseColor("#80161823"));
        c3191fi5.addView(c3195mj2, new ViewGroup.LayoutParams(-2, -2));
        slm slmVar = new slm(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = C3583qd.m16589lr(context, 8.0f);
        c3191fi5.addView(slmVar, layoutParams4);
        C3583qd.m16619ri(c3195mj2, slmVar, wjvVar, 18);
        C3195mj c3195mj3 = new C3195mj(context);
        if (i2 == 2) {
            c3195mj3.setSingleLine(true);
        } else {
            c3195mj3.setLines(2);
        }
        c3195mj3.setEllipsize(TextUtils.TruncateAt.END);
        c3195mj3.setTextSize(16.0f);
        c3195mj3.setTextColor(Color.parseColor("#80161823"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        int i3 = layoutParams2.leftMargin;
        layoutParams5.rightMargin = i3;
        layoutParams5.leftMargin = i3;
        layoutParams5.topMargin = C3583qd.m16589lr(context, 12.0f);
        c3191fi2.addView(c3195mj3, layoutParams5);
        bindDescData(c3195mj3, wjvVar);
        C3195mj c3195mj4 = new C3195mj(context);
        c3195mj4.setGravity(17);
        c3195mj4.setId(520093707);
        c3195mj4.setText(C2729uq.m10311ri(context, "tt_video_download_apk"));
        c3195mj4.setTextColor(-1);
        c3195mj4.setTextSize(2, 16.0f);
        c3195mj4.setBackground(C3586sf.m16645ri(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, C3583qd.m16589lr(context, 36.0f));
        layoutParams6.setMargins(C3583qd.m16589lr(context, 20.0f), C3583qd.m16589lr(context, 22.0f), C3583qd.m16589lr(context, 20.0f), C3583qd.m16589lr(context, 20.0f));
        c3191fi2.addView(c3195mj4, layoutParams6);
        setDownloadButtonData(c3195mj4, wjvVar, i);
    }

    private void initViews() {
        C3289ri c3289riM14428ka;
        List<wjv> listM14252ka;
        if (this.mInit) {
            return;
        }
        this.mInit = true;
        boolean z = this.adContext.f9389lr.zyn() && this.adContext.ajz != null && this.adContext.ajz.m11005ig();
        if (z) {
            if (C3139ik.m13115ri()) {
                initViewsForUGen(true);
                return;
            } else if (this.shownAdCount > 1) {
                initOneSlotMultipleAdsLayout();
                return;
            }
        }
        wjv wjvVar = this.adContext.f9389lr;
        if (wjvVar.m14576zz()) {
            initViewsForVast();
            return;
        }
        if (C3139ik.m13115ri()) {
            initViewsForUGen(false);
            return;
        }
        if (z && (c3289riM14428ka = wjvVar.m14428ka()) != null && (listM14252ka = c3289riM14428ka.m14252ka()) != null && !listM14252ka.isEmpty()) {
            wjvVar = listM14252ka.get(0);
        }
        initViewsDefault(wjvVar);
        initData(wjvVar, this.tvDownload);
    }

    private void initViewsDefault(wjv wjvVar) {
        Context context = getContext();
        boolean z = wjvVar.bbu() == 1;
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
        this.ivIcon = c3335bu;
        c3335bu.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C3583qd.m16589lr(context, 80.0f), C3583qd.m16589lr(context, 80.0f));
        layoutParams2.bottomMargin = C3583qd.m16589lr(context, 12.0f);
        c3191fi.addView(this.ivIcon, layoutParams2);
        C3195mj c3195mj = new C3195mj(context);
        this.tvTitle = c3195mj;
        c3195mj.setEllipsize(TextUtils.TruncateAt.END);
        this.tvTitle.setGravity(17);
        this.tvTitle.setMaxLines(2);
        this.tvTitle.setMaxWidth(C3583qd.m16589lr(context, 180.0f));
        this.tvTitle.setTextColor(-1);
        this.tvTitle.setTextSize(2, 24.0f);
        c3191fi.addView(this.tvTitle, new LinearLayout.LayoutParams(-1, -2));
        C3195mj c3195mj2 = new C3195mj(context);
        this.tvDesc = c3195mj2;
        c3195mj2.setEllipsize(TextUtils.TruncateAt.END);
        this.tvDesc.setGravity(17);
        this.tvDesc.setMaxLines(2);
        this.tvDesc.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.tvDesc.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = C3583qd.m16589lr(context, 8.0f);
        c3191fi.addView(this.tvDesc, layoutParams3);
        this.rbScore = new slm(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, C3583qd.m16589lr(context, 16.0f));
        layoutParams4.topMargin = C3583qd.m16589lr(context, 12.0f);
        this.rbScore.setVisibility(8);
        c3191fi.addView(this.rbScore, layoutParams4);
        C3195mj c3195mj3 = new C3195mj(context);
        this.tvDownload = c3195mj3;
        c3195mj3.setId(520093707);
        this.tvDownload.setGravity(17);
        this.tvDownload.setText(C2729uq.m10311ri(context, "tt_video_download_apk"));
        this.tvDownload.setTextColor(-1);
        this.tvDownload.setTextSize(2, 16.0f);
        this.tvDownload.setBackground(C3586sf.m16645ri(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, C3583qd.m16589lr(context, 44.0f));
        layoutParams5.topMargin = C3583qd.m16589lr(context, 54.0f);
        c3191fi.addView(this.tvDownload, layoutParams5);
        this.adLogo = PAGLogoView.createPAGLogoViewByMaterial(context, wjvVar);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, C3583qd.m16589lr(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = C3583qd.m16589lr(context, 18.0f);
        if (z) {
            layoutParams6.bottomMargin = C3583qd.m16589lr(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = C3583qd.m16589lr(context, 24.0f);
        }
        addView(this.adLogo, layoutParams6);
    }

    private void initViewsForUGen(boolean z) {
        addView(new C3139ik(this.adContext, z));
    }

    private void initViewsForVast() {
        Context context = getContext();
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        C3193ka c3193ka = new C3193ka(context);
        c3193ka.setId(com.bytedance.sdk.openadsdk.utils.slm.f13296qt);
        c3193ka.setVisibility(8);
        addView(c3193ka, new FrameLayout.LayoutParams(-1, -1));
        C2634di c2634di = new C2634di(context, true, C2634di.ik.VAST_ENDCARD);
        c2634di.setVisibility(8);
        c2634di.setId(com.bytedance.sdk.openadsdk.utils.slm.f13298sf);
        addView(c2634di, new FrameLayout.LayoutParams(-1, -1));
    }

    private void setDownloadButtonData(C3195mj c3195mj, wjv wjvVar, int i) {
        AbstractC3217fi abstractC3217fiM11992ri = this.adContext.f9402su.m11992ri(this.adContext, wjvVar);
        abstractC3217fiM11992ri.m13534ri(C3371ka.m15240ri(this.adContext.f9384ig, this.adContext.f9381fi));
        if (i != -1) {
            HashMap map = new HashMap();
            int i2 = i + 1;
            map.put("ad_show_order", Integer.valueOf(i2));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i2);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
            abstractC3217fiM11992ri.m13536ri(map);
        }
        c3195mj.setOnClickListener(abstractC3217fiM11992ri);
        c3195mj.setOnTouchListener(abstractC3217fiM11992ri);
        CharSequence charSequenceSkk = wjvVar.skk();
        if (TextUtils.isEmpty(charSequenceSkk)) {
            return;
        }
        c3195mj.setText(charSequenceSkk);
    }

    public void init(C3022ri c3022ri) {
        this.adContext = c3022ri;
        if (c3022ri.f9389lr.m14576zz()) {
            initViews();
        }
    }

    public void setShownAdCount(int i) {
        this.shownAdCount = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            initViews();
        }
    }
}
