package com.bytedance.sdk.openadsdk.core.p221ka;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di;
import com.bytedance.sdk.openadsdk.core.jbs.AbstractC3238ri;
import com.bytedance.sdk.openadsdk.core.jbs.C3222ac;
import com.bytedance.sdk.openadsdk.core.jbs.C3235mj;
import com.bytedance.sdk.openadsdk.core.jbs.C3236nr;
import com.bytedance.sdk.openadsdk.core.jbs.tan;
import com.bytedance.sdk.openadsdk.core.model.C3286nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.widget.C3334aw;
import com.bytedance.sdk.openadsdk.core.widget.C3335bu;
import com.bytedance.sdk.openadsdk.core.widget.C3336co;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.slm;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.InterfaceC3370ik;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ka.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3261lr extends AbstractC3238ri {

    /* JADX INFO: renamed from: ri */
    public static C3236nr[] f10991ri = {new C3236nr(1, 6.4f, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50), new C3236nr(4, 1.2f, 300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION)};

    /* JADX INFO: renamed from: aw */
    private C3222ac f10992aw;
    private String bgr;

    /* JADX INFO: renamed from: co */
    private ri f10993co;

    /* JADX INFO: renamed from: vr */
    private PAGBannerAdWrapperListener f10994vr;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ka.lr$ri */
    private static class ri {

        /* JADX INFO: renamed from: di */
        View f11000di;

        /* JADX INFO: renamed from: fi */
        FrameLayout f11001fi;

        /* JADX INFO: renamed from: ik */
        ImageView f11002ik;

        /* JADX INFO: renamed from: ka */
        slm f11003ka;

        /* JADX INFO: renamed from: lr */
        public TextView f11004lr;

        /* JADX INFO: renamed from: mj */
        private C3336co f11005mj;

        /* JADX INFO: renamed from: ri */
        public C3334aw f11006ri;
        TextView xha;

        public ri(View view, C3334aw c3334aw) {
            this.f11000di = view;
            this.f11006ri = c3334aw;
        }

        public ri(ImageView imageView, View view, TextView textView, TextView textView2, C3334aw c3334aw, slm slmVar, FrameLayout frameLayout) {
            this.f11002ik = imageView;
            this.f11000di = view;
            this.xha = textView;
            this.f11004lr = textView2;
            this.f11006ri = c3334aw;
            this.f11003ka = slmVar;
            this.f11001fi = frameLayout;
        }

        public ri(ImageView imageView, View view, TextView textView, TextView textView2, C3336co c3336co, slm slmVar, FrameLayout frameLayout) {
            this.f11002ik = imageView;
            this.f11000di = view;
            this.xha = textView;
            this.f11004lr = textView2;
            this.f11005mj = c3336co;
            this.f11003ka = slmVar;
            this.f11001fi = frameLayout;
        }

        ri(ImageView imageView, TextView textView, slm slmVar, View view, TextView textView2) {
            this.f11002ik = imageView;
            this.f11004lr = textView;
            this.f11003ka = slmVar;
            this.f11000di = view;
            this.xha = textView2;
        }
    }

    public C3261lr(Context context) {
        super(context);
        this.f10877lr = context;
    }

    /* JADX INFO: renamed from: di */
    private ri m13822di() {
        int iM16589lr = C3583qd.m16589lr(this.f10877lr, 8.0f);
        C3334aw c3334aw = new C3334aw(this.f10877lr);
        c3334aw.setId(520093736);
        c3334aw.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(c3334aw, layoutParams);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.f10877lr, this.f10875ik);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(iM16589lr, iM16589lr, 0, 0);
        layoutParams2.gravity = 8388659;
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams2);
        addView(viewCreatePAGLogoViewByMaterial);
        return new ri(viewCreatePAGLogoViewByMaterial, c3334aw);
    }

    /* JADX INFO: renamed from: fi */
    private void m13825fi() {
        TextView textView;
        if (this.f10875ik != null) {
            int iM14552vz = this.f10875ik.m14552vz();
            if (this.f10875ik.m14389eu() == null) {
                ri riVarM13832mj = m13832mj();
                this.f10993co = riVarM13832mj;
                C3334aw c3334aw = riVarM13832mj.f11006ri;
                ImageView imageView = this.f10993co.f11002ik;
                TextView textView2 = this.f10993co.f11004lr;
                TextView textView3 = this.f10993co.xha;
                View view = this.f10993co.f11000di;
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.lr.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            TTWebsiteActivity.m10758ri(C3261lr.this.f10877lr, C3261lr.this.f10875ik, C3261lr.this.f10873di);
                        }
                    });
                }
                ViewGroup.LayoutParams layoutParams = c3334aw.getLayoutParams();
                if (this.xha - (C3583qd.m16589lr(this.f10877lr, 8.0f) * 2) >= ((this.f10878mj - C3583qd.m16589lr(this.f10877lr, 8.0f)) - (C3583qd.m16589lr(this.f10877lr, 21.0f) * 2)) - C3583qd.m16589lr(this.f10877lr, 52.0f)) {
                    layoutParams.width = -2;
                    layoutParams.height = -1;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                }
                c3334aw.setLayoutParams(layoutParams);
                if (iM14552vz == 33) {
                    c3334aw.setRatio(1.0f);
                } else {
                    c3334aw.setRatio(1.91f);
                }
                List<C3286nr> listRbz = this.f10875ik.rbz();
                if (listRbz != null && !listRbz.isEmpty()) {
                    C2751lr.m10463lr().m10470ri(listRbz.get(0), c3334aw, this.f10875ik);
                    C2751lr.m10463lr().m10473ri(listRbz.get(0).m14220ri(), this.f10993co.f11001fi);
                }
                if (this.f10875ik.m14391fb() == null || TextUtils.isEmpty(this.f10875ik.m14391fb().m14220ri())) {
                    textView = textView3;
                } else {
                    textView = textView3;
                    C2751lr.m10463lr().m10472ri(this.f10875ik.m14391fb().m14220ri(), this.f10875ik.m14391fb().m14217lr(), this.f10875ik.m14391fb().m14215ik(), imageView, this.f10875ik);
                }
                textView2.setText(this.f10875ik.m14559xh());
                if (TextUtils.isEmpty(this.f10875ik.skk())) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(this.f10875ik.skk());
                }
                C3583qd.m16618ri((TextView) null, this.f10993co.f11003ka, this.f10875ik);
                m13700ri((View) c3334aw, true);
                c3334aw.setTag(520093762, Boolean.TRUE);
                m13700ri((View) this, true);
                m13700ri((View) textView, true);
                return;
            }
            ri riVarJbs = jbs();
            this.f10993co = riVarJbs;
            TextView textView4 = riVarJbs.f11004lr;
            TextView textView5 = this.f10993co.xha;
            C3336co c3336co = this.f10993co.f11005mj;
            C2751lr.m10463lr().m10473ri(this.f10875ik.m14389eu().m6357qt(), this.f10993co.f11001fi);
            View view2 = this.f10993co.f11000di;
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.lr.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        TTWebsiteActivity.m10758ri(C3261lr.this.f10877lr, C3261lr.this.f10875ik, C3261lr.this.f10873di);
                    }
                });
            }
            ViewGroup.LayoutParams layoutParams2 = c3336co.getLayoutParams();
            if (iM14552vz == 15) {
                layoutParams2.width = -2;
                layoutParams2.height = -1;
                c3336co.setLayoutParams(layoutParams2);
                c3336co.setRatio(0.5625f);
            } else if (iM14552vz == 5) {
                layoutParams2.width = -1;
                layoutParams2.height = -2;
                c3336co.setLayoutParams(layoutParams2);
                c3336co.setRatio(1.7777778f);
            } else {
                if (this.xha - (C3583qd.m16589lr(this.f10877lr, 8.0f) * 2) >= ((this.f10878mj - C3583qd.m16589lr(this.f10877lr, 8.0f)) - (C3583qd.m16589lr(this.f10877lr, 21.0f) * 2)) - C3583qd.m16589lr(this.f10877lr, 52.0f)) {
                    layoutParams2.width = -2;
                    layoutParams2.height = -1;
                } else {
                    layoutParams2.width = -1;
                    layoutParams2.height = -2;
                }
                c3336co.setLayoutParams(layoutParams2);
                c3336co.setRatio(1.0f);
            }
            c3336co.removeAllViews();
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            C3120di videoView = getVideoView();
            if (videoView != null) {
                C3222ac c3222ac = this.f10992aw;
                if (c3222ac instanceof tan) {
                    videoView.setNeedSelfManagerVideo(!((tan) c3222ac).m13738aw());
                    ((tan) this.f10992aw).setBackupVideoView(videoView);
                    videoView.setVideoAdInteractionListener((tan) this.f10992aw);
                }
                c3336co.addView(videoView, layoutParams3);
                videoView.setAdCreativeClickListener(new C3120di.ri() { // from class: com.bytedance.sdk.openadsdk.core.ka.lr.5
                    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di.ri
                    /* JADX INFO: renamed from: ri */
                    public void mo12820ri(View view3, int i) {
                        if (C3261lr.this.f10994vr != null) {
                            C3261lr.this.f10994vr.onAdClicked();
                        }
                    }
                });
                C3235mj clickCreativeListener = this.f10992aw.getClickCreativeListener();
                if (clickCreativeListener != null) {
                    clickCreativeListener.m13529ri(videoView.getNativeVideoController());
                }
            }
            if (this.f10875ik.m14391fb() != null && !TextUtils.isEmpty(this.f10875ik.m14391fb().m14220ri())) {
                C2751lr.m10463lr().m10472ri(this.f10875ik.m14391fb().m14220ri(), this.f10875ik.m14391fb().m14217lr(), this.f10875ik.m14391fb().m14215ik(), this.f10993co.f11002ik, this.f10875ik);
            }
            textView4.setText(this.f10875ik.m14559xh());
            C3583qd.m16618ri((TextView) null, this.f10993co.f11003ka, this.f10875ik);
            if (TextUtils.isEmpty(this.f10875ik.skk())) {
                textView5.setVisibility(8);
            } else {
                textView5.setText(this.f10875ik.skk());
            }
            m13700ri((View) videoView, true);
            if (videoView != null) {
                videoView.setTag(520093762, Boolean.TRUE);
            }
            m13700ri((View) this, true);
            m13700ri((View) textView5, true);
            m13699ri(c3336co);
        }
    }

    /* JADX INFO: renamed from: ik */
    private void m13827ik() {
        C3583qd.m16589lr(this.f10877lr, 50.0f);
        ri riVarXha = xha();
        this.f10993co = riVarXha;
        ImageView imageView = riVarXha.f11002ik;
        TextView textView = this.f10993co.f11004lr;
        slm slmVar = this.f10993co.f11003ka;
        TextView textView2 = this.f10993co.xha;
        View view = this.f10993co.f11000di;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.lr.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.m10758ri(C3261lr.this.f10877lr, C3261lr.this.f10875ik, C3261lr.this.f10873di);
                }
            });
        }
        if (this.f10875ik.m14391fb() != null && !TextUtils.isEmpty(this.f10875ik.m14391fb().m14220ri())) {
            C2751lr.m10463lr().m10472ri(this.f10875ik.m14391fb().m14220ri(), this.f10875ik.m14391fb().m14217lr(), this.f10875ik.m14391fb().m14215ik(), imageView, this.f10875ik);
        }
        textView.setText(this.f10875ik.m14559xh());
        if (TextUtils.isEmpty(this.f10875ik.skk())) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(this.f10875ik.skk());
        }
        C3583qd.m16618ri((TextView) null, slmVar, this.f10875ik);
        m13700ri((View) imageView, true);
        imageView.setTag(520093762, Boolean.TRUE);
        m13700ri((View) this, true);
        m13700ri((View) textView2, true);
    }

    private ri jbs() {
        int iM16589lr = C3583qd.m16589lr(this.f10877lr, 8.0f);
        int iM16589lr2 = C3583qd.m16589lr(this.f10877lr, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.f10877lr);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(iM16589lr, iM16589lr, iM16589lr, iM16589lr2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.f10877lr);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        C3335bu c3335bu = new C3335bu(this.f10877lr);
        c3335bu.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(C3583qd.m16589lr(this.f10877lr, 52.0f), C3583qd.m16589lr(this.f10877lr, 52.0f));
        c3335bu.setScaleType(ImageView.ScaleType.FIT_XY);
        c3335bu.setLayoutParams(layoutParams3);
        linearLayout.addView(c3335bu);
        LinearLayout linearLayout2 = new LinearLayout(this.f10877lr);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = iM16589lr;
        layoutParams4.rightMargin = iM16589lr;
        layoutParams4.setMarginStart(iM16589lr);
        layoutParams4.setMarginEnd(iM16589lr);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.f10877lr);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(16.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        slm slmVar = new slm(this.f10877lr);
        slmVar.setId(520093735);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.topMargin = C3583qd.m16589lr(this.f10877lr, 4.0f);
        linearLayout2.addView(slmVar, layoutParams6);
        TextView textView2 = new TextView(this.f10877lr);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(C3583qd.m16589lr(this.f10877lr, 76.0f), C3583qd.m16589lr(this.f10877lr, 36.0f));
        textView2.setBackground(C3586sf.m16643ri(this.f10877lr, 18));
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(C2729uq.m10311ri(this.f10877lr, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams7);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.f10877lr);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams8.addRule(2, linearLayout.getId());
        layoutParams8.bottomMargin = iM16589lr2;
        frameLayout.setLayoutParams(layoutParams8);
        relativeLayout.addView(frameLayout);
        C3336co c3336co = new C3336co(this.f10877lr);
        c3336co.setId(520093736);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams9.gravity = 17;
        c3336co.setLayoutParams(layoutParams9);
        frameLayout.addView(c3336co);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.f10877lr, this.f10875ik);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams10.addRule(10);
        layoutParams10.addRule(9);
        layoutParams10.setMargins(iM16589lr, iM16589lr, 0, 0);
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams10);
        relativeLayout.addView(viewCreatePAGLogoViewByMaterial);
        return new ri(c3335bu, viewCreatePAGLogoViewByMaterial, textView2, textView, c3336co, slmVar, frameLayout);
    }

    /* JADX INFO: renamed from: ka */
    private void m13829ka() {
        ri riVarM13822di = m13822di();
        this.f10993co = riVarM13822di;
        View view = riVarM13822di.f11000di;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.lr.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.m10758ri(C3261lr.this.f10877lr, C3261lr.this.f10875ik, C3261lr.this.f10873di);
                }
            });
        }
        C3334aw c3334aw = this.f10993co.f11006ri;
        if (c3334aw != null) {
            List<C3286nr> listRbz = this.f10875ik.rbz();
            if (listRbz != null && !listRbz.isEmpty()) {
                C2751lr.m10463lr().m10470ri(listRbz.get(0), c3334aw, this.f10875ik);
            }
            m13700ri((View) c3334aw, true);
            c3334aw.setTag(520093762, Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m13831lr() {
        C3236nr c3236nrM13836ri = m13836ri(this.f10992aw.getExpectExpressWidth(), this.f10992aw.getExpectExpressHeight());
        if (this.f10992aw.getExpectExpressWidth() <= 0 || this.f10992aw.getExpectExpressHeight() <= 0) {
            this.xha = C3583qd.m16580ik(this.f10877lr);
            this.f10878mj = Float.valueOf(this.xha / c3236nrM13836ri.f10866lr).intValue();
        } else {
            this.xha = C3583qd.m16589lr(this.f10877lr, this.f10992aw.getExpectExpressWidth());
            this.f10878mj = C3583qd.m16589lr(this.f10877lr, this.f10992aw.getExpectExpressHeight());
        }
        if (this.xha > 0 && this.xha > C3583qd.m16580ik(this.f10877lr)) {
            float fM16580ik = C3583qd.m16580ik(this.f10877lr) / this.xha;
            this.xha = C3583qd.m16580ik(this.f10877lr);
            this.f10878mj = Float.valueOf(this.f10878mj * fM16580ik).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.xha, this.f10878mj);
        }
        layoutParams.width = this.xha;
        layoutParams.height = this.f10878mj;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        if (this.f10875ik != null) {
            int iM14552vz = this.f10875ik.m14552vz();
            if (iM14552vz == 1010 || iM14552vz == 1011 || iM14552vz == 1012) {
                m13829ka();
            } else {
                m13837ri(c3236nrM13836ri);
            }
        }
    }

    /* JADX INFO: renamed from: mj */
    private ri m13832mj() {
        int iM16589lr = C3583qd.m16589lr(this.f10877lr, 8.0f);
        int iM16589lr2 = C3583qd.m16589lr(this.f10877lr, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.f10877lr);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(iM16589lr, iM16589lr, iM16589lr, iM16589lr2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.f10877lr);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        C3335bu c3335bu = new C3335bu(this.f10877lr);
        c3335bu.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(C3583qd.m16589lr(this.f10877lr, 52.0f), C3583qd.m16589lr(this.f10877lr, 52.0f));
        c3335bu.setScaleType(ImageView.ScaleType.FIT_XY);
        c3335bu.setLayoutParams(layoutParams3);
        linearLayout.addView(c3335bu);
        LinearLayout linearLayout2 = new LinearLayout(this.f10877lr);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = iM16589lr;
        layoutParams4.rightMargin = iM16589lr;
        layoutParams4.setMarginStart(iM16589lr);
        layoutParams4.setMarginEnd(iM16589lr);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.f10877lr);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(16.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        slm slmVar = new slm(this.f10877lr);
        slmVar.setId(520093735);
        linearLayout2.addView(slmVar, new LinearLayout.LayoutParams(-2, -2));
        TextView textView2 = new TextView(this.f10877lr);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(C3583qd.m16589lr(this.f10877lr, 76.0f), C3583qd.m16589lr(this.f10877lr, 36.0f));
        textView2.setBackground(C3586sf.m16643ri(this.f10877lr, 18));
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(C2729uq.m10311ri(this.f10877lr, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams6);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.f10877lr);
        frameLayout.setLayoutDirection(3);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams7.addRule(2, linearLayout.getId());
        layoutParams7.bottomMargin = iM16589lr2;
        frameLayout.setLayoutParams(layoutParams7);
        relativeLayout.addView(frameLayout);
        C3334aw c3334aw = new C3334aw(this.f10877lr);
        c3334aw.setId(520093736);
        c3334aw.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams8.gravity = 17;
        frameLayout.addView(c3334aw, layoutParams8);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.f10877lr, this.f10875ik);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams9.addRule(10);
        layoutParams9.addRule(9);
        layoutParams9.setMargins(iM16589lr, iM16589lr, 0, 0);
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams9);
        relativeLayout.addView(viewCreatePAGLogoViewByMaterial);
        return new ri(c3335bu, viewCreatePAGLogoViewByMaterial, textView2, textView, c3334aw, slmVar, frameLayout);
    }

    /* JADX INFO: renamed from: ri */
    public static C3236nr m13836ri(int i, int i2) {
        try {
            return ((double) i2) >= Math.floor((((double) i) * 450.0d) / 600.0d) ? f10991ri[1] : f10991ri[0];
        } catch (Throwable unused) {
            return f10991ri[0];
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m13837ri(C3236nr c3236nr) {
        if (c3236nr.f10867ri == 1) {
            m13827ik();
        } else {
            m13825fi();
        }
    }

    private ri xha() {
        int iM16589lr = C3583qd.m16589lr(this.f10877lr, 38.0f);
        int iM16589lr2 = (int) (((double) C3583qd.m16589lr(this.f10877lr, 25.0f)) / 5.0d);
        int iM16589lr3 = C3583qd.m16589lr(this.f10877lr, 10.0f);
        int iM16589lr4 = C3583qd.m16589lr(this.f10877lr, 2.0f);
        int iM16589lr5 = C3583qd.m16589lr(this.f10877lr, 6.0f);
        int iM16589lr6 = C3583qd.m16589lr(this.f10877lr, 8.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.f10877lr);
        addView(relativeLayout, -1, -1);
        C3335bu c3335bu = new C3335bu(this.f10877lr);
        c3335bu.setId(520093738);
        TextView textView = new TextView(this.f10877lr);
        textView.setId(520093730);
        slm slmVar = new slm(this.f10877lr);
        slmVar.setId(520093735);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.f10877lr, this.f10875ik);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        TextView textView2 = new TextView(this.f10877lr);
        textView2.setId(520093703);
        ri riVar = new ri(c3335bu, textView, slmVar, viewCreatePAGLogoViewByMaterial, textView2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM16589lr, iM16589lr);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        layoutParams.addRule(20);
        layoutParams.setMarginStart(iM16589lr5);
        layoutParams.setMargins(iM16589lr5, 0, 0, 0);
        c3335bu.setLayoutParams(layoutParams);
        c3335bu.setBackgroundColor(-1);
        c3335bu.setScaleType(ImageView.ScaleType.FIT_XY);
        relativeLayout.addView(c3335bu);
        LinearLayout linearLayout = new LinearLayout(this.f10877lr);
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(16, textView2.getId());
        layoutParams2.addRule(17, c3335bu.getId());
        layoutParams2.setMarginStart(iM16589lr6);
        layoutParams2.setMarginEnd(iM16589lr6);
        layoutParams2.addRule(0, textView2.getId());
        layoutParams2.addRule(1, c3335bu.getId());
        layoutParams2.setMargins(iM16589lr6, 0, iM16589lr6, 0);
        relativeLayout.addView(linearLayout, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        textView.setTextDirection(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(80);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF333333"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams3);
        linearLayout.addView(textView);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = iM16589lr4;
        slmVar.setLayoutParams(layoutParams4);
        linearLayout.addView(slmVar);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(20);
        layoutParams5.addRule(9);
        layoutParams5.addRule(12);
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams5);
        relativeLayout.addView(viewCreatePAGLogoViewByMaterial);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(11);
        layoutParams6.addRule(15);
        layoutParams6.setMarginEnd(iM16589lr5);
        layoutParams6.addRule(21);
        layoutParams6.rightMargin = iM16589lr5;
        textView2.setBackground(C3586sf.m16643ri(this.f10877lr, 12));
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        textView2.setMaxLines(1);
        textView2.setPadding(iM16589lr3, iM16589lr2, iM16589lr3, iM16589lr2);
        textView2.setText(C2729uq.m10311ri(this.f10877lr, "tt_video_download_apk"));
        textView2.setTextColor(Color.parseColor("#f0f0f0"));
        textView2.setTextSize(10.0f);
        textView2.setLayoutParams(layoutParams6);
        relativeLayout.addView(textView2);
        return riVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.AbstractC3238ri
    /* JADX INFO: renamed from: ri */
    public void mo13698ri() {
        if (this.f10874fi != null) {
            this.f10874fi.show();
        } else if (this.f10876ka != null) {
            this.f10876ka.mo14648ri();
        } else {
            TTDelegateActivity.m10599ri(this.f10875ik, this.bgr);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.AbstractC3238ri
    /* JADX INFO: renamed from: ri */
    protected void mo11556ri(View view, int i, com.bytedance.sdk.openadsdk.core.model.slm slmVar) {
        C3222ac c3222ac = this.f10992aw;
        if (c3222ac != null) {
            c3222ac.mo9002ri(view, i, slmVar);
        }
    }

    /* JADX INFO: renamed from: ri */
    void m13839ri(wjv wjvVar, C3222ac c3222ac, InterfaceC3370ik interfaceC3370ik) {
        setBackgroundColor(-1);
        this.f10875ik = wjvVar;
        this.f10992aw = c3222ac;
        this.f10873di = "banner_ad";
        this.f10992aw.addView(this, new ViewGroup.LayoutParams(-2, -2));
        m13831lr();
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.f10994vr = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.bgr = str;
    }
}
