package com.applovin.impl.adview;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.C1831z4;
import com.applovin.impl.InterfaceC1668o1;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.C1735a;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: renamed from: com.applovin.impl.adview.f */
/* JADX INFO: loaded from: classes3.dex */
class DialogC1497f extends Dialog implements InterfaceC1668o1 {

    /* JADX INFO: renamed from: a */
    private final Activity f1106a;

    /* JADX INFO: renamed from: b */
    private final C1748l f1107b;

    /* JADX INFO: renamed from: c */
    private final C1768p f1108c;

    /* JADX INFO: renamed from: d */
    private final C1493b f1109d;

    /* JADX INFO: renamed from: e */
    private final C1735a f1110e;

    /* JADX INFO: renamed from: f */
    private RelativeLayout f1111f;

    /* JADX INFO: renamed from: g */
    private AbstractC1496e f1112g;

    /* JADX INFO: renamed from: com.applovin.impl.adview.f$a */
    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            DialogC1497f.this.f1112g.setClickable(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    DialogC1497f(C1735a c1735a, C1493b c1493b, Activity activity, C1748l c1748l) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        if (c1735a == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (c1493b == null) {
            throw new IllegalArgumentException("No main view specified");
        }
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f1107b = c1748l;
        this.f1108c = c1748l.m4782Q();
        this.f1106a = activity;
        this.f1109d = c1493b;
        this.f1110e = c1735a;
        requestWindowFeature(1);
        setCancelable(false);
    }

    /* JADX INFO: renamed from: a */
    private int m2019a(int i) {
        return AppLovinSdkUtils.dpToPx(this.f1106a, i);
    }

    /* JADX INFO: renamed from: a */
    private void m2021a() {
        this.f1109d.m2000a("javascript:al_onCloseTapped();");
        dismiss("expanded_ad_dialog_close_button");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m2022a(View view) {
        m2021a();
    }

    /* JADX INFO: renamed from: a */
    private void m2023a(AbstractC1496e.a aVar) {
        if (this.f1112g != null) {
            if (C1768p.m5160a()) {
                this.f1108c.m5178k("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        AbstractC1496e abstractC1496eM2015a = AbstractC1496e.m2015a(aVar, this.f1106a);
        this.f1112g = abstractC1496eM2015a;
        abstractC1496eM2015a.setVisibility(8);
        this.f1112g.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.f$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m2022a(view);
            }
        });
        this.f1112g.setClickable(false);
        int iM2019a = m2019a(((Integer) this.f1107b.m4801a(C1831z4.f3680B1)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM2019a, iM2019a);
        layoutParams.addRule(10);
        C1748l c1748l = this.f1107b;
        C1831z4 c1831z4 = C1831z4.f3704E1;
        layoutParams.addRule(((Boolean) c1748l.m4801a(c1831z4)).booleanValue() ? 9 : 11);
        this.f1112g.mo2016a(iM2019a);
        int iM2019a2 = m2019a(((Integer) this.f1107b.m4801a(C1831z4.f3696D1)).intValue());
        int iM2019a3 = m2019a(((Integer) this.f1107b.m4801a(C1831z4.f3688C1)).intValue());
        layoutParams.setMargins(iM2019a3, iM2019a2, iM2019a3, 0);
        this.f1111f.addView(this.f1112g, layoutParams);
        this.f1112g.bringToFront();
        int iM2019a4 = m2019a(((Integer) this.f1107b.m4801a(C1831z4.f3712F1)).intValue());
        View view = new View(this.f1106a);
        view.setBackgroundColor(0);
        int i = iM2019a + iM2019a4;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, i);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.f1107b.m4801a(c1831z4)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(iM2019a3 - m2019a(5), iM2019a2 - m2019a(5), iM2019a3 - m2019a(5), 0);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.f$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f$0.m2024b(view2);
            }
        });
        this.f1111f.addView(view, layoutParams2);
        view.bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m2024b(View view) {
        if (this.f1112g.isClickable()) {
            this.f1112g.performClick();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m2026d() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f1109d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f1106a);
        this.f1111f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f1111f.setBackgroundColor(-1157627904);
        this.f1111f.addView(this.f1109d);
        if (!this.f1110e.m4445f1()) {
            m2023a(this.f1110e.m4437Z0());
            m2029g();
        }
        setContentView(this.f1111f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m2027e() {
        this.f1111f.removeView(this.f1109d);
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m2028f() {
        try {
            if (this.f1112g == null) {
                m2021a();
            }
            this.f1112g.setVisibility(0);
            this.f1112g.bringToFront();
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            this.f1112g.startAnimation(alphaAnimation);
        } catch (Throwable th) {
            if (C1768p.m5160a()) {
                this.f1108c.m5172a("ExpandedAdDialog", "Unable to fade in close button", th);
            }
            m2021a();
        }
    }

    /* JADX INFO: renamed from: g */
    private void m2029g() {
        this.f1106a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.f$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2028f();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public C1735a m2030b() {
        return this.f1110e;
    }

    /* JADX INFO: renamed from: c */
    public C1493b m2031c() {
        return this.f1109d;
    }

    @Override // com.applovin.impl.InterfaceC1668o1
    public void dismiss(String str) {
        this.f1106a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.f$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2027e();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f1109d.m2000a("javascript:al_onBackPressed();");
        dismiss("expanded_ad_dialog_back_button");
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m2026d();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f1106a.getWindow().getAttributes().flags, this.f1106a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else if (C1768p.m5160a()) {
                this.f1108c.m5174b("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            if (C1768p.m5160a()) {
                this.f1108c.m5172a("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }
}
