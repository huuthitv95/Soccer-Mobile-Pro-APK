package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.C2931bu;
import com.bytedance.sdk.openadsdk.common.C2932co;
import com.bytedance.sdk.openadsdk.common.C2934fi;
import com.bytedance.sdk.openadsdk.common.C2948mj;
import com.bytedance.sdk.openadsdk.common.C2957vr;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.widget.C3335bu;
import com.bytedance.sdk.openadsdk.core.widget.C3346ri;
import com.bytedance.sdk.openadsdk.core.widget.C3356vr;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.bgr;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3350ka;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p259sf.InterfaceC3517ka;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;
import com.bytedance.sdk.openadsdk.utils.slm;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity implements InterfaceC3517ka {
    TTAdDislikeToast bnj;
    private boolean gcp;

    /* JADX INFO: renamed from: nd */
    private TextView f8219nd;

    /* JADX INFO: renamed from: qh */
    private View f8220qh;
    private View rzk;
    private C3348fi saa;

    /* JADX INFO: renamed from: ta */
    C2931bu f8221ta;

    /* JADX INFO: renamed from: tw */
    private TextView f8222tw;

    /* JADX INFO: renamed from: xe */
    private C2934fi f8223xe;

    /* JADX INFO: renamed from: xm */
    private C2932co f8224xm;
    private PAGLogoView yjm;

    /* JADX INFO: renamed from: zb */
    private long f8225zb;
    private boolean aac = false;
    final AtomicBoolean siy = new AtomicBoolean(false);
    final AtomicBoolean whw = new AtomicBoolean(false);

    /* JADX INFO: renamed from: bu */
    private void m10733bu() {
        TTAdDislikeToast tTAdDislikeToast = this.bnj;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: renamed from: nr */
    private void m10742nr() {
        try {
            if (this.f8221ta == null) {
                C2931bu c2931bu = new C2931bu(this.f8179fi, this.slm);
                this.f8221ta = c2931bu;
                c2931bu.setDislikeSource("landing_page");
                this.f8221ta.setCallback(new C2931bu.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.4
                    @Override // com.bytedance.sdk.openadsdk.common.C2931bu.ri
                    /* JADX INFO: renamed from: lr */
                    public void mo10546lr(View view) {
                        TTVideoLandingPageLink2Activity.this.siy.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.C2931bu.ri
                    /* JADX INFO: renamed from: ri */
                    public void mo10547ri(View view) {
                        TTVideoLandingPageLink2Activity.this.siy.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.C2931bu.ri
                    /* JADX INFO: renamed from: ri */
                    public void mo10548ri(FilterWord filterWord) {
                        if (TTVideoLandingPageLink2Activity.this.whw.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTVideoLandingPageLink2Activity.this.whw.set(true);
                        TTVideoLandingPageLink2Activity.this.tan();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.f8221ta);
            if (this.bnj == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.f8179fi);
                this.bnj = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTVideoLandingPageLink2Activity", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void slm() {
        C2932co c2932co = this.f8224xm;
        if (c2932co != null) {
            c2932co.m11285lr();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tan() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.bnj) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: vr */
    public void m10748vr() {
        C3414ik.m15554ri(this.slm, "landingpage_split_screen", "click_video", (JSONObject) null);
    }

    protected void bgr() {
        if (isFinishing()) {
            return;
        }
        if (this.whw.get()) {
            m10733bu();
            return;
        }
        if (this.f8221ta == null) {
            m10742nr();
        }
        C2931bu c2931bu = this.f8221ta;
        if (c2931bu != null) {
            c2931bu.m11274ri();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    /* JADX INFO: renamed from: di */
    protected void mo10721di() {
        if (xha()) {
            super.mo10721di();
            if (this.bgr != null) {
                if (this.bgr.getNativeVideoController() != null) {
                    this.bgr.getNativeVideoController().m12987ri(false);
                    this.bgr.getNativeVideoController().m12938di(false);
                    this.f8175co.setClickable(true);
                    this.f8175co.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.12
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            if (motionEvent.getAction() != 0) {
                                return false;
                            }
                            TTVideoLandingPageLink2Activity.this.m10748vr();
                            return false;
                        }
                    });
                }
                this.bgr.getNativeVideoController().mo6383ri(new InterfaceC1999ik.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.2
                    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ri
                    /* JADX INFO: renamed from: lr */
                    public void mo6397lr(long j, int i) {
                    }

                    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ri
                    /* JADX INFO: renamed from: ri */
                    public void mo6398ri() {
                    }

                    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ri
                    /* JADX INFO: renamed from: ri */
                    public void mo6399ri(long j, int i) {
                    }

                    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ri
                    /* JADX INFO: renamed from: ri */
                    public void mo6400ri(long j, long j2) {
                        if (TTVideoLandingPageLink2Activity.this.f8222tw != null) {
                            int iMax = (int) Math.max(0L, (j2 - j) / 1000);
                            TTVideoLandingPageLink2Activity.this.f8222tw.setText(String.valueOf(iMax));
                            if (iMax <= 0) {
                                TTVideoLandingPageLink2Activity.this.f8222tw.setVisibility(8);
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        try {
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            C2751lr.m10463lr().m10470ri(this.slm.rbz().get(0), imageView, this.slm);
            this.f8175co.setVisibility(0);
            this.f8175co.removeAllViews();
            this.f8175co.addView(imageView);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    C3414ik.m15518lr(TTVideoLandingPageLink2Activity.this.slm, "landingpage_split_screen");
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    /* JADX INFO: renamed from: fi */
    protected void mo10722fi() {
        super.mo10722fi();
        TextView textView = (TextView) findViewById(520093713);
        if (textView != null) {
            textView.setText(C2729uq.m10311ri(C3299nr.m14642ri(), "tt_reward_feedback"));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTVideoLandingPageLink2Activity.this.bgr();
                }
            });
        }
        this.f8222tw = (TextView) findViewById(520093714);
        this.f8224xm = (C2932co) findViewById(slm.bnj);
        this.rzk = findViewById(slm.f13302ta);
        this.f8220qh = findViewById(slm.f13276ig);
        TextView textView2 = (TextView) findViewById(slm.whw);
        TextView textView3 = (TextView) findViewById(slm.f13315xm);
        C3335bu c3335bu = (C3335bu) findViewById(slm.siy);
        this.f8219nd = (TextView) findViewById(slm.rzk);
        if (this.slm.m14391fb() != null && !TextUtils.isEmpty(this.slm.m14391fb().m14220ri())) {
            C2751lr.m10463lr().m10470ri(this.slm.m14391fb(), c3335bu, this.slm);
        }
        textView2.setText(this.slm.tpb());
        textView3.setText(this.slm.m14535tq());
        View viewFindViewById = findViewById(slm.f13295qh);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.m10758ri(TTVideoLandingPageLink2Activity.this.f8179fi, TTVideoLandingPageLink2Activity.this.slm, TTVideoLandingPageLink2Activity.this.hcw);
            }
        });
        if (viewFindViewById instanceof PAGLogoView) {
            ((PAGLogoView) viewFindViewById).initData(this.slm);
        }
        if (this.f8193ri != null && this.f8193ri.getWebView() != null) {
            C3571ig.m16482ri(this.slm, this.f8193ri);
        }
        if (this.f8193ri.getWebView() != null) {
            this.f8193ri.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.11
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (TTVideoLandingPageLink2Activity.this.srn != null) {
                        TTVideoLandingPageLink2Activity.this.srn.m15379ri(motionEvent);
                    }
                    if (TTVideoLandingPageLink2Activity.this.f8223xe == null) {
                        return false;
                    }
                    TTVideoLandingPageLink2Activity.this.f8223xe.m11314ri(motionEvent);
                    return false;
                }
            });
        }
        C2932co c2932co = this.f8224xm;
        if (c2932co != null) {
            c2932co.m11288ri(this.slm);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    /* JADX INFO: renamed from: ik */
    protected View mo10723ik() {
        C3191fi c3191fi = new C3191fi(this);
        if (Build.VERSION.SDK_INT >= 35) {
            c3191fi.setFitsSystemWindows(true);
        }
        c3191fi.setOrientation(1);
        c3191fi.setBackgroundColor(-1);
        C3192ik c3192ik = new C3192ik(this);
        c3191fi.addView(c3192ik, new LinearLayout.LayoutParams(-1, C3583qd.m16589lr(this, 220.0f)));
        C3192ik c3192ik2 = new C3192ik(this);
        c3192ik2.setId(slm.f13294qd);
        c3192ik.addView(c3192ik2, new FrameLayout.LayoutParams(-1, -1));
        C3191fi c3191fi2 = new C3191fi(this);
        c3191fi2.setOrientation(0);
        c3191fi2.setPadding(0, C3583qd.m16589lr(this, 20.0f), 0, 0);
        c3192ik.addView(c3191fi2, new FrameLayout.LayoutParams(-1, -2));
        View view = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        c3191fi2.addView(view, layoutParams);
        C3356vr c3356vr = new C3356vr(this);
        c3356vr.setId(520093713);
        c3356vr.setGravity(17);
        c3356vr.setText(C2729uq.m10311ri(this, "tt_reward_feedback"));
        c3356vr.setTextColor(-1);
        c3356vr.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, C3583qd.m16589lr(this, 28.0f));
        int iM16589lr = C3583qd.m16589lr(this, 16.0f);
        layoutParams2.rightMargin = iM16589lr;
        layoutParams2.leftMargin = iM16589lr;
        c3191fi2.addView(c3356vr, layoutParams2);
        bgr bgrVar = new bgr(this);
        bgrVar.setId(slm.srn);
        bgrVar.setPadding(C3583qd.m16589lr(this, 7.0f), C3583qd.m16589lr(this, 7.0f), C3583qd.m16589lr(this, 7.0f), C3583qd.m16589lr(this, 7.0f));
        bgrVar.setImageResource(C2729uq.m10305ka(this, "tt_video_close_drawable"));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(C3583qd.m16589lr(this, 28.0f), C3583qd.m16589lr(this, 28.0f));
        layoutParams3.rightMargin = C3583qd.m16589lr(this, 12.0f);
        c3191fi2.addView(bgrVar, layoutParams3);
        com.bytedance.sdk.openadsdk.core.p217di.xha xhaVar = new com.bytedance.sdk.openadsdk.core.p217di.xha(this);
        xhaVar.setVisibility(8);
        xhaVar.setId(slm.f13279jc);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = C3583qd.m16589lr(this, 10.0f);
        c3191fi.addView(xhaVar, layoutParams4);
        C3346ri c3346ri = new C3346ri(this);
        c3346ri.setId(slm.f13283kt);
        c3346ri.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        c3346ri.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(C3583qd.m16589lr(this, 44.0f), C3583qd.m16589lr(this, 44.0f));
        layoutParams5.addRule(9);
        layoutParams5.leftMargin = C3583qd.m16589lr(this, 5.0f);
        xhaVar.addView(c3346ri, layoutParams5);
        C3195mj c3195mj = new C3195mj(this);
        c3195mj.setId(slm.feb);
        c3195mj.setBackground(C3586sf.m16645ri(this, "tt_circle_solid_mian"));
        c3195mj.setGravity(17);
        c3195mj.setTextColor(-1);
        c3195mj.setTextSize(2, 19.0f);
        c3195mj.setTypeface(Typeface.DEFAULT_BOLD);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(C3583qd.m16589lr(this, 44.0f), C3583qd.m16589lr(this, 44.0f));
        layoutParams6.addRule(9);
        layoutParams6.leftMargin = C3583qd.m16589lr(this, 5.0f);
        xhaVar.addView(c3195mj, layoutParams6);
        C3195mj c3195mj2 = new C3195mj(this);
        c3195mj2.setId(slm.zyn);
        c3195mj2.setMaxLines(1);
        c3195mj2.setEllipsize(TextUtils.TruncateAt.END);
        c3195mj2.setTextColor(Color.parseColor("#e5000000"));
        c3195mj2.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15);
        layoutParams7.leftMargin = C3583qd.m16589lr(this, 5.0f);
        layoutParams7.rightMargin = C3583qd.m16589lr(this, 80.0f);
        layoutParams7.addRule(1, slm.feb);
        xhaVar.addView(c3195mj2, layoutParams7);
        C3195mj c3195mj3 = new C3195mj(this);
        c3195mj3.setId(slm.tnn);
        c3195mj3.setClickable(true);
        c3195mj3.setMaxLines(1);
        c3195mj3.setEllipsize(TextUtils.TruncateAt.END);
        c3195mj3.setFocusable(true);
        c3195mj3.setGravity(17);
        c3195mj3.setText(C2729uq.m10311ri(this, "tt_video_mobile_go_detail"));
        c3195mj3.setTextColor(-1);
        c3195mj3.setTextSize(2, 14.0f);
        c3195mj3.setPadding(C3583qd.m16589lr(this, 2.0f), C3583qd.m16589lr(this, 2.0f), C3583qd.m16589lr(this, 2.0f), C3583qd.m16589lr(this, 2.0f));
        c3195mj3.setBackground(C3586sf.m16645ri(this, "tt_ad_cover_btn_begin_bg"));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(C3583qd.m16589lr(this, 90.0f), C3583qd.m16589lr(this, 36.0f));
        layoutParams8.addRule(11);
        layoutParams8.addRule(15);
        layoutParams8.rightMargin = C3583qd.m16589lr(this, 5.0f);
        xhaVar.addView(c3195mj3, layoutParams8);
        C3192ik c3192ik3 = new C3192ik(this);
        c3191fi.addView(c3192ik3, new LinearLayout.LayoutParams(-1, -1));
        C2634di c2634di = new C2634di(this, C2634di.ik.LANDING_PAGE);
        c2634di.setId(slm.f13267fe);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams9.topMargin = C3583qd.m16589lr(this, 2.0f);
        c3192ik3.addView(c2634di, layoutParams9);
        com.bytedance.sdk.openadsdk.core.p217di.xha xhaVar2 = new com.bytedance.sdk.openadsdk.core.p217di.xha(this);
        xhaVar2.setId(slm.f13302ta);
        xhaVar2.setBackgroundColor(Color.parseColor("#F8F8F8"));
        c3192ik3.addView(xhaVar2, new FrameLayout.LayoutParams(-1, -1));
        C2932co c2932co = new C2932co(this);
        c2932co.setId(slm.bnj);
        xhaVar2.addView(c2932co, new RelativeLayout.LayoutParams(-1, -1));
        C3191fi c3191fi3 = new C3191fi(this);
        c3191fi3.setId(slm.f13276ig);
        c3191fi3.setOrientation(1);
        c3191fi3.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams10.addRule(13);
        xhaVar2.addView(c3191fi3, layoutParams10);
        C3335bu c3335bu = new C3335bu(this);
        c3335bu.setId(slm.siy);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(C3583qd.m16589lr(this, 80.0f), C3583qd.m16589lr(this, 80.0f));
        layoutParams11.gravity = 17;
        c3191fi3.addView(c3335bu, layoutParams11);
        C3195mj c3195mj4 = new C3195mj(this);
        c3195mj4.setId(slm.whw);
        c3195mj4.setTextColor(Color.parseColor("#161823"));
        c3195mj4.setTextSize(0, C3583qd.m16589lr(this, 24.0f));
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams12.gravity = 17;
        layoutParams12.topMargin = C3583qd.m16589lr(this, 12.0f);
        c3191fi3.addView(c3195mj4, layoutParams12);
        C3195mj c3195mj5 = new C3195mj(this);
        c3195mj5.setId(slm.f13315xm);
        c3195mj5.setTextColor(Color.parseColor("#80161823"));
        c3195mj5.setTextSize(0, C3583qd.m16589lr(this, 16.0f));
        c3195mj5.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams13.gravity = 17;
        int iM16589lr2 = C3583qd.m16589lr(this, 60.0f);
        layoutParams13.rightMargin = iM16589lr2;
        layoutParams13.leftMargin = iM16589lr2;
        layoutParams13.topMargin = C3583qd.m16589lr(this, 8.0f);
        c3191fi3.addView(c3195mj5, layoutParams13);
        C3195mj c3195mj6 = new C3195mj(this);
        c3195mj6.setId(slm.rzk);
        c3195mj6.setGravity(17);
        c3195mj6.setTextColor(-1);
        c3195mj6.setText(C2729uq.m10311ri(this, "tt_video_mobile_go_detail"));
        c3195mj6.setBackground(C3586sf.m16645ri(this, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(C3583qd.m16589lr(this, 255.0f), C3583qd.m16589lr(this, 44.0f));
        layoutParams14.gravity = 17;
        layoutParams14.topMargin = C3583qd.m16589lr(this, 32.0f);
        c3191fi3.addView(c3195mj6, layoutParams14);
        PAGLogoView pAGLogoView = new PAGLogoView(this);
        this.yjm = pAGLogoView;
        pAGLogoView.setId(slm.f13295qh);
        this.yjm.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, C3583qd.m16589lr(this, 14.0f));
        layoutParams15.addRule(12);
        layoutParams15.leftMargin = C3583qd.m16589lr(this, 18.0f);
        layoutParams15.bottomMargin = C3583qd.m16589lr(this, 61.0f);
        xhaVar2.addView(this.yjm, layoutParams15);
        C2957vr c2957vr = new C2957vr(this, new C2957vr.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.8
            @Override // com.bytedance.sdk.openadsdk.common.C2957vr.ri
            /* JADX INFO: renamed from: ri */
            public View mo10651ri(Context context) {
                return new C2948mj(context);
            }
        });
        c2957vr.setId(slm.gcp);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, C3583qd.m16589lr(this, 48.0f));
        layoutParams16.gravity = 81;
        c3192ik3.addView(c2957vr, layoutParams16);
        return c3191fi;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2932co c2932co = this.f8224xm;
        if (c2932co != null) {
            c2932co.mo11286ri();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C3332vr.m14975fi() || this.slm == null || this.f8193ri == null) {
            finish();
            return;
        }
        C2934fi c2934fiM16472ri = C3571ig.m16472ri(this.slm, this.f8193ri, this.f8179fi, this.hcw);
        this.f8223xe = c2934fiM16472ri;
        if (c2934fiM16472ri != null) {
            c2934fiM16472ri.m11318ri("landingpage_split_screen");
        }
        if (this.f8193ri.getWebView() != null) {
            this.f8193ri.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.1
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    if (TTVideoLandingPageLink2Activity.this.srn != null) {
                        TTVideoLandingPageLink2Activity.this.srn.m15372lr(i2);
                    }
                }
            });
        }
        C3348fi c3348fi = new C3348fi(this.f8179fi, this.f8187mj, this.f8176di, this.f8223xe, this.srn, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTVideoLandingPageLink2Activity.this.rzk != null && !TTVideoLandingPageLink2Activity.this.gcp) {
                        TTVideoLandingPageLink2Activity.this.rzk.setVisibility(8);
                    }
                    TTVideoLandingPageLink2Activity.this.aac = true;
                    TTVideoLandingPageLink2Activity.this.slm();
                    C3414ik.m15547ri(TTVideoLandingPageLink2Activity.this.slm, TTVideoLandingPageLink2Activity.this.hcw, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.f8225zb, true);
                } catch (Throwable unused) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                TTVideoLandingPageLink2Activity.this.f8225zb = System.currentTimeMillis();
            }
        };
        this.saa = c3348fi;
        c3348fi.m15072ri(this.slm);
        this.f8193ri.setWebViewClient(this.saa);
        this.f8193ri.setWebChromeClient(new C3350ka(this.f8187mj, this.srn, this.f8223xe) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3350ka, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (TTVideoLandingPageLink2Activity.this.f8224xm != null) {
                    TTVideoLandingPageLink2Activity.this.f8224xm.m11287ri(i);
                }
            }
        });
        TextView textView = (TextView) findViewById(slm.f13316yj);
        if (textView != null && this.slm.m14364ay() != null) {
            textView.setText(this.slm.m14364ay().m14162fi());
        }
        C3332vr.m14976ik().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTVideoLandingPageLink2Activity.this.gcp = true;
                    if (TTVideoLandingPageLink2Activity.this.f8224xm != null) {
                        TTVideoLandingPageLink2Activity.this.f8224xm.m11285lr();
                    }
                    TTVideoLandingPageLink2Activity.this.f8220qh.setVisibility(0);
                    if (TTVideoLandingPageLink2Activity.this.yjm != null) {
                        TTVideoLandingPageLink2Activity.this.yjm.setVisibility(0);
                    }
                    if (TTVideoLandingPageLink2Activity.this.aac) {
                        return;
                    }
                    C3414ik.m15547ri(TTVideoLandingPageLink2Activity.this.slm, TTVideoLandingPageLink2Activity.this.hcw, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.f8225zb, false);
                } catch (Exception unused) {
                }
            }
        }, (this.slm == null || this.slm.m14364ay() == null) ? 10000L : this.slm.m14364ay().m14169ri() * 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        slm();
        if (!this.gcp && this.srn != null && this.f8193ri != null && this.f8224xm.getVisibility() == 8) {
            this.srn.m15384ri(this.f8193ri);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    /* JADX INFO: renamed from: sf */
    public void mo10728sf() {
        super.mo10728sf();
        if (this.slm != null) {
            this.slm.bgr(true);
        }
        TextView textView = this.f8219nd;
        if (textView != null) {
            textView.setText(m10724ka());
            this.f8219nd.setClickable(true);
            this.f8219nd.setOnClickListener(this.f8178fe);
            this.f8219nd.setOnTouchListener(this.f8178fe);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    protected boolean xha() {
        return this.f8172aw == 5 || this.f8172aw == 15 || this.f8172aw == 50;
    }
}
