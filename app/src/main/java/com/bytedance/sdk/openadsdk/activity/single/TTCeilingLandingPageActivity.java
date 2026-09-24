package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.component.utils.C2735zf;
import com.bytedance.sdk.openadsdk.common.C2934fi;
import com.bytedance.sdk.openadsdk.core.C3197dw;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.tan;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.widget.C3337di;
import com.bytedance.sdk.openadsdk.core.widget.C3341ka;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3347di;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3350ka;
import com.bytedance.sdk.openadsdk.p236ka.C3393aw;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3594uq;

/* JADX INFO: loaded from: classes9.dex */
public class TTCeilingLandingPageActivity extends TTBaseLandingPageActivity {

    /* JADX INFO: renamed from: co */
    private C2634di f8014co;

    /* JADX INFO: renamed from: di */
    private int f8015di;

    /* JADX INFO: renamed from: fi */
    private String f8016fi;

    /* JADX INFO: renamed from: ik */
    private dzy f8017ik;

    /* JADX INFO: renamed from: ka */
    private String f8018ka;

    /* JADX INFO: renamed from: lr */
    private wjv f8019lr;

    /* JADX INFO: renamed from: mj */
    private C3393aw f8020mj;

    /* JADX INFO: renamed from: ri */
    InterfaceC2775ri f8021ri;

    /* JADX INFO: renamed from: sf */
    private C2934fi f8022sf;
    private String xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity$ri */
    /* JADX INFO: loaded from: classes3.dex */
    public interface InterfaceC2775ri {
        /* JADX INFO: renamed from: ri */
        void mo10593ri();
    }

    /* JADX INFO: renamed from: ik */
    private void m10589ik() {
        dzy dzyVar = new dzy(this);
        this.f8017ik = dzyVar;
        dzyVar.m13422lr(this.f8014co).m13411ik(this.f8018ka).m13416ka(this.f8016fi).m13442ri(this.f8019lr).m13421lr(this.f8015di).m13432ri(this.f8019lr.m14407hd()).m13408fi(this.f8019lr.m14541uo()).m13435ri(this.f8014co).m13423lr("landingpage_split_ceiling");
    }

    /* JADX INFO: renamed from: ri */
    private void m10592ri(Context context, FrameLayout frameLayout) {
        C3193ka c3193ka;
        this.f8014co = new C2634di(context, C2634di.ik.LANDING_PAGE);
        frameLayout.addView(this.f8014co, new FrameLayout.LayoutParams(-1, -1));
        C3193ka c3193kaM14999lr = C3337di.m14999lr(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = C3583qd.m16589lr(context, 18.0f);
        layoutParams.rightMargin = C3583qd.m16589lr(context, 18.0f);
        frameLayout.addView(c3193kaM14999lr, layoutParams);
        final int iXha = this.f8019lr.m14526su().xha();
        if (iXha != 3) {
            c3193ka = new C3193ka(context);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C3583qd.m16589lr(context, 28.0f), C3583qd.m16589lr(context, 28.0f));
            layoutParams2.gravity = 8388659;
            layoutParams2.topMargin = C3583qd.m16589lr(context, 18.0f);
            layoutParams2.leftMargin = C3583qd.m16589lr(context, 18.0f);
            int iM16589lr = C3583qd.m16589lr(context, 5.0f);
            c3193ka.setPadding(iM16589lr, iM16589lr, iM16589lr, iM16589lr);
            c3193ka.setScaleType(ImageView.ScaleType.FIT_XY);
            c3193ka.setBackground(C3341ka.m15010ri());
            c3193ka.setImageDrawable(C2729uq.m10303ik(context, "tt_white_lefterbackicon_titlebar"));
            frameLayout.addView(c3193ka, layoutParams2);
        } else {
            c3193ka = null;
        }
        C3594uq.m16663ri(this.f8014co, this.xha);
        final WebView webView = this.f8014co.getWebView();
        c3193kaM14999lr.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTCeilingLandingPageActivity.this.finish();
            }
        });
        C3393aw c3393aw = new C3393aw(this.f8019lr, webView, true);
        this.f8020mj = c3393aw;
        c3393aw.m15388ri("landingpage_split_ceiling");
        final C3347di.ri riVar = this.f8020mj.f12084ri;
        if (c3193ka != null) {
            c3193ka.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    int i = iXha;
                    if (i == 1) {
                        TTCeilingLandingPageActivity.this.finish();
                    } else if (i != 2) {
                        return;
                    }
                    WebView webView2 = webView;
                    if (webView2 == null || !webView2.canGoBack()) {
                        TTCeilingLandingPageActivity.this.finish();
                        return;
                    }
                    webView.goBack();
                    C3347di.ri riVar2 = riVar;
                    if (riVar2 != null) {
                        riVar2.mo15059ri();
                    }
                }
            });
        }
        C2934fi c2934fiM16472ri = C3571ig.m16472ri(this.f8019lr, this.f8014co, this, "landingpage_split_ceiling");
        this.f8022sf = c2934fiM16472ri;
        if (c2934fiM16472ri != null) {
            c2934fiM16472ri.m11318ri("landingpage_split_ceiling");
            this.f8022sf.m11313ri();
        }
        C3571ig.m16483ri(this.f8019lr, this.f8014co, true);
        this.f8021ri = new InterfaceC2775ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.3
            @Override // com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.InterfaceC2775ri
            /* JADX INFO: renamed from: ri */
            public void mo10593ri() {
                if (TTCeilingLandingPageActivity.this.f8019lr.m14526su().m14314mj() == tan.f11373lr) {
                    TTCeilingLandingPageActivity.this.finish();
                }
            }
        };
        C3348fi c3348fi = new C3348fi(this, this.f8017ik, this.f8018ka, this.f8022sf, this.f8020mj, true, true, this.f8021ri) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.4
            @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
            }
        };
        c3348fi.m15072ri(this.f8019lr);
        C3350ka c3350ka = new C3350ka(this.f8017ik, this.f8020mj, this.f8022sf) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3350ka, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView2, int i) {
                super.onProgressChanged(webView2, i);
            }
        };
        C2634di c2634di = this.f8014co;
        if (c2634di != null) {
            c2634di.setWebViewClient(c3348fi);
            this.f8014co.setWebChromeClient(c3350ka);
        }
        if (webView != null) {
            webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.6
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (TTCeilingLandingPageActivity.this.f8020mj == null) {
                        return false;
                    }
                    TTCeilingLandingPageActivity.this.f8020mj.m15379ri(motionEvent);
                    return false;
                }
            });
            webView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.7
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    if (TTCeilingLandingPageActivity.this.f8020mj != null) {
                        TTCeilingLandingPageActivity.this.f8020mj.m15372lr(i2);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C3332vr.m14975fi()) {
            finish();
            return;
        }
        Intent intent = getIntent();
        this.f8015di = intent.getIntExtra("source", -1);
        wjv wjvVarM13350ri = C3197dw.m13337ri().m13350ri(C3197dw.m13336ri(intent));
        this.f8019lr = wjvVarM13350ri;
        if (wjvVarM13350ri == null) {
            finish();
            return;
        }
        this.xha = wjvVarM13350ri.m14519sf();
        this.f8018ka = this.f8019lr.m14533tn();
        this.f8016fi = this.f8019lr.yjg();
        this.f8015di = this.f8019lr.m14388eb().getDurationSlotType() != 7 ? 5 : 7;
        C3192ik c3192ik = new C3192ik(this);
        m10592ri(this, c3192ik);
        setContentView(c3192ik);
        m10589ik();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        C2634di c2634di = this.f8014co;
        if (c2634di != null) {
            C2735zf.m10345ri(c2634di);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        C3393aw c3393aw = this.f8020mj;
        if (c3393aw != null) {
            c3393aw.m15375mj();
        }
    }
}
