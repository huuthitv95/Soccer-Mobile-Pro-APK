package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bykv.p028vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.p028vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.component.utils.C2735zf;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.bgr.C2900lr;
import com.bytedance.sdk.openadsdk.common.C2927ac;
import com.bytedance.sdk.openadsdk.common.C2928aw;
import com.bytedance.sdk.openadsdk.common.C2931bu;
import com.bytedance.sdk.openadsdk.common.C2932co;
import com.bytedance.sdk.openadsdk.common.C2934fi;
import com.bytedance.sdk.openadsdk.common.C2948mj;
import com.bytedance.sdk.openadsdk.common.C2950qt;
import com.bytedance.sdk.openadsdk.common.C2957vr;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.C3197dw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3190di;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p219ik.C3221ri;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3347di;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3349ik;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3350ka;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3371ka;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.InterfaceC3370ik;
import com.bytedance.sdk.openadsdk.p236ka.C3393aw;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.InterfaceC3398co;
import com.bytedance.sdk.openadsdk.p246nr.C3476ik;
import com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka;
import com.bytedance.sdk.openadsdk.p246nr.p249lr.C3481ri;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.utils.C3560ac;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3577ka;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;
import com.bytedance.sdk.openadsdk.utils.C3594uq;
import com.bytedance.sdk.openadsdk.utils.bgr;
import com.bytedance.sdk.openadsdk.utils.slm;
import com.bytedance.sdk.openadsdk.utils.tan;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.bytedance.sdk.openadsdk.xha.C3611lr;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TTLandingPageActivity extends TTBaseLandingPageActivity {

    /* JADX INFO: renamed from: ac */
    private wjv f8046ac;

    /* JADX INFO: renamed from: aw */
    private Button f8047aw;

    /* JADX INFO: renamed from: ay */
    private String f8048ay;
    private C3190di bgr;

    /* JADX INFO: renamed from: bu */
    private dzy f8049bu;

    /* JADX INFO: renamed from: co */
    private C2957vr f8050co;

    /* JADX INFO: renamed from: di */
    private C2634di f8051di;

    /* JADX INFO: renamed from: dw */
    private int f8052dw;
    private C2934fi dzy;
    private C2928aw feb;

    /* JADX INFO: renamed from: fr */
    private ILoader f8055fr;
    private C2932co hcw;

    /* JADX INFO: renamed from: ig */
    private boolean f8056ig;
    private InterfaceC3370ik ihz;

    /* JADX INFO: renamed from: ik */
    TTAdDislikeToast f8057ik;

    /* JADX INFO: renamed from: jc */
    private ImageView f8058jc;

    /* JADX INFO: renamed from: kt */
    private ImageView f8060kt;

    /* JADX INFO: renamed from: lr */
    C2931bu f8061lr;

    /* JADX INFO: renamed from: mj */
    private TextView f8062mj;

    /* JADX INFO: renamed from: nr */
    private int f8063nr;

    /* JADX INFO: renamed from: oh */
    private bgr f8064oh;

    /* JADX INFO: renamed from: pv */
    private C3348fi f8065pv;

    /* JADX INFO: renamed from: ri */
    C3393aw f8067ri;

    /* JADX INFO: renamed from: sf */
    private Context f8068sf;
    private String slm;
    private ImageView srn;
    private String tan;

    /* JADX INFO: renamed from: uq */
    private String f8070uq;

    /* JADX INFO: renamed from: vr */
    private String f8071vr;

    /* JADX INFO: renamed from: xd */
    private C3347di.ri f8072xd;
    private ImageView xha;

    /* JADX INFO: renamed from: zf */
    private int f8073zf;
    private boolean zyn;
    private final AtomicBoolean wjv = new AtomicBoolean(true);

    /* JADX INFO: renamed from: su */
    private final AtomicInteger f8069su = new AtomicInteger(0);
    private final AtomicInteger igq = new AtomicInteger(0);
    private final AtomicInteger ory = new AtomicInteger(0);

    /* JADX INFO: renamed from: ka */
    final AtomicBoolean f8059ka = new AtomicBoolean(false);

    /* JADX INFO: renamed from: fi */
    final AtomicBoolean f8054fi = new AtomicBoolean(false);

    /* JADX INFO: renamed from: qd */
    private boolean f8066qd = false;
    private long tnn = 0;

    /* JADX INFO: renamed from: fe */
    private String f8053fe = "ダウンロード";

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity$ik */
    private static class ViewOnTouchListenerC2798ik implements View.OnTouchListener {

        /* JADX INFO: renamed from: lr */
        private final WeakReference<C2934fi> f8101lr;

        /* JADX INFO: renamed from: ri */
        private final WeakReference<C3393aw> f8102ri;

        public ViewOnTouchListenerC2798ik(C3393aw c3393aw, C2934fi c2934fi) {
            this.f8102ri = new WeakReference<>(c3393aw);
            this.f8101lr = new WeakReference<>(c2934fi);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            C3393aw c3393aw = this.f8102ri.get();
            if (c3393aw != null) {
                c3393aw.m15379ri(motionEvent);
            }
            C2934fi c2934fi = this.f8101lr.get();
            if (c2934fi == null) {
                return false;
            }
            c2934fi.m11314ri(motionEvent);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity$lr */
    private static class ViewOnScrollChangeListenerC2799lr implements View.OnScrollChangeListener {

        /* JADX INFO: renamed from: ri */
        private final WeakReference<C3393aw> f8103ri;

        public ViewOnScrollChangeListenerC2799lr(C3393aw c3393aw) {
            this.f8103ri = new WeakReference<>(c3393aw);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            C3393aw c3393aw = this.f8103ri.get();
            if (c3393aw != null) {
                c3393aw.m15372lr(i2);
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity$ri */
    public static class C2800ri implements InterfaceC3398co {

        /* JADX INFO: renamed from: ik */
        private final String f8104ik;

        /* JADX INFO: renamed from: ka */
        private final WeakReference<TTLandingPageActivity> f8105ka;

        /* JADX INFO: renamed from: lr */
        private final wjv f8106lr;

        /* JADX INFO: renamed from: ri */
        private final int f8107ri;

        public C2800ri(int i, wjv wjvVar, String str, TTLandingPageActivity tTLandingPageActivity) {
            this.f8107ri = i;
            this.f8106lr = wjvVar;
            this.f8104ik = str;
            this.f8105ka = new WeakReference<>(tTLandingPageActivity);
        }

        @Override // com.bytedance.sdk.openadsdk.p236ka.InterfaceC3398co
        /* JADX INFO: renamed from: ri */
        public void mo10656ri(int i) {
            TTLandingPageActivity tTLandingPageActivity = this.f8105ka.get();
            if (tTLandingPageActivity != null) {
                C3414ik.ri.m15569ri(this.f8107ri, tTLandingPageActivity.igq.get(), tTLandingPageActivity.ory.get(), tTLandingPageActivity.f8069su.get() - tTLandingPageActivity.ory.get(), this.f8106lr, this.f8104ik, i);
            }
        }
    }

    /* JADX INFO: renamed from: aw */
    private void m10622aw() {
        TTAdDislikeToast tTAdDislikeToast = this.f8057ik;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bgr() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.f8057ik) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    /* JADX INFO: renamed from: co */
    private void m10625co() {
        try {
            if (this.f8061lr == null) {
                C2931bu c2931bu = new C2931bu(this.f8068sf, this.f8046ac);
                this.f8061lr = c2931bu;
                c2931bu.setDislikeSource("landing_page");
                this.f8061lr.setCallback(new C2931bu.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.10
                    @Override // com.bytedance.sdk.openadsdk.common.C2931bu.ri
                    /* JADX INFO: renamed from: lr */
                    public void mo10546lr(View view) {
                        TTLandingPageActivity.this.f8059ka.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.C2931bu.ri
                    /* JADX INFO: renamed from: ri */
                    public void mo10547ri(View view) {
                        TTLandingPageActivity.this.f8059ka.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.C2931bu.ri
                    /* JADX INFO: renamed from: ri */
                    public void mo10548ri(FilterWord filterWord) {
                        if (TTLandingPageActivity.this.f8054fi.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTLandingPageActivity.this.f8054fi.set(true);
                        TTLandingPageActivity.this.bgr();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.f8061lr);
            if (this.f8057ik == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.f8068sf);
                this.f8057ik = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "LandingPageActivity", th);
        }
    }

    /* JADX INFO: renamed from: di */
    private String m10626di() {
        wjv wjvVar = this.f8046ac;
        if (wjvVar != null && !TextUtils.isEmpty(wjvVar.skk())) {
            this.f8053fe = this.f8046ac.skk();
        }
        return this.f8053fe;
    }

    /* JADX INFO: renamed from: fi */
    private void m10629fi() {
        wjv wjvVar = this.f8046ac;
        if (wjvVar == null || wjvVar.adz() != 4) {
            return;
        }
        C2957vr c2957vr = this.f8050co;
        if (c2957vr != null) {
            c2957vr.setVisibility(0);
        }
        Button button = (Button) findViewById(slm.hws);
        this.f8047aw = button;
        if (button != null) {
            m10634lr(m10626di());
            if (this.ihz == null) {
                this.ihz = C3371ka.m15240ri(this, TextUtils.isEmpty(this.tan) ? C3571ig.m16458lr(this.f8063nr) : this.tan);
            }
            C3221ri c3221ri = new C3221ri(this, this.f8046ac, this.tan, this.f8063nr);
            c3221ri.m13547ri(false);
            this.f8047aw.setOnClickListener(c3221ri);
            this.f8047aw.setOnTouchListener(c3221ri);
            c3221ri.m13543ik(true);
            c3221ri.m13534ri(this.ihz);
        }
    }

    private void jbs() {
        if (m10639qt() && !this.wjv.getAndSet(true)) {
            m10645sf();
            m10643ri(0);
        } else {
            try {
                super.onBackPressed();
            } catch (Throwable th) {
                C2707ac.m10197ik("TTAD.LandingPageAct", "onBackPressed: ", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: ka */
    private void m10632ka() {
        if (TextUtils.isEmpty(this.f8070uq)) {
            return;
        }
        C3476ik.m15764ri(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.15
            @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
            /* JADX INFO: renamed from: ri */
            public C3481ri mo10650ri() {
                C3481ri c3481ri = new C3481ri();
                c3481ri.m15784lr("lp_reuse");
                c3481ri.m15780ka(TTLandingPageActivity.this.tan);
                c3481ri.m15790ri(BuildConfig.VERSION_NAME);
                return c3481ri;
            }
        });
        if (!this.f8066qd) {
            this.f8066qd = false;
            C3521ka.m15953ri(false);
            C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.17
                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                /* JADX INFO: renamed from: ri */
                public C3481ri mo10650ri() {
                    C3481ri c3481ri = new C3481ri();
                    c3481ri.m15784lr("lp_reuse");
                    c3481ri.m15780ka(TTLandingPageActivity.this.tan);
                    c3481ri.m15790ri(BuildConfig.VERSION_NAME);
                    return c3481ri;
                }
            });
        } else {
            C3393aw c3393aw = this.f8067ri;
            if (c3393aw != null) {
                c3393aw.m15363fi(true);
                this.f8046ac.tan(true);
            }
            C3476ik.m15761lr(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.16
                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                /* JADX INFO: renamed from: ri */
                public C3481ri mo10650ri() {
                    C3481ri c3481ri = new C3481ri();
                    c3481ri.m15784lr("lp_reuse");
                    c3481ri.m15780ka(TTLandingPageActivity.this.tan);
                    c3481ri.m15790ri(BuildConfig.VERSION_NAME);
                    return c3481ri;
                }
            });
            C3521ka.m15953ri(true);
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m10634lr(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.f8047aw) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                if (TTLandingPageActivity.this.f8047aw == null || TTLandingPageActivity.this.isFinishing()) {
                    return;
                }
                TTLandingPageActivity.this.f8047aw.setText(str);
            }
        });
    }

    /* JADX INFO: renamed from: mj */
    private void m10635mj() {
        dzy dzyVar = new dzy(this);
        this.f8049bu = dzyVar;
        dzyVar.m13422lr(this.f8051di).m13411ik(this.f8071vr).m13416ka(this.slm).m13442ri(this.f8046ac).m13421lr(this.f8063nr).m13432ri(this.f8046ac.m14407hd()).m13408fi(this.f8046ac.m14541uo()).m13435ri(this.f8051di).m13423lr("landingpage");
    }

    /* JADX INFO: renamed from: qt */
    private boolean m10639qt() {
        return !TextUtils.isEmpty(this.f8070uq) && this.f8070uq.contains("__luban_sdk");
    }

    /* JADX INFO: renamed from: ri */
    private View m10641ri(String str) {
        Bundle bundleM16361ri;
        C2634di c2634di;
        C3192ik c3192ik = new C3192ik(this);
        if (Build.VERSION.SDK_INT >= 35) {
            c3192ik.setFitsSystemWindows(true);
        }
        C3191fi c3191fi = new C3191fi(this);
        c3191fi.setOrientation(1);
        c3192ik.addView(c3191fi, new FrameLayout.LayoutParams(-1, -1));
        boolean zOry = C3299nr.m14639ka().ory();
        this.zyn = zOry;
        if (this.f8046ac != null && zOry) {
            this.feb = new C2928aw(this, this.f8046ac, this.tan, false);
        }
        C2957vr c2957vr = new C2957vr(this, new C2957vr.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.18
            @Override // com.bytedance.sdk.openadsdk.common.C2957vr.ri
            /* JADX INFO: renamed from: ri */
            public View mo10651ri(Context context) {
                return (TTLandingPageActivity.this.f8046ac == null || !TTLandingPageActivity.this.zyn) ? new C2950qt(context) : TTLandingPageActivity.this.feb.m11244ka();
            }
        });
        c2957vr.setId(slm.f13287nd);
        c3191fi.addView(c2957vr, new LinearLayout.LayoutParams(-1, this.zyn ? -2 : C3583qd.m16589lr(this, 44.0f)));
        C3192ik c3192ik2 = new C3192ik(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        c3191fi.addView(c3192ik2, layoutParams);
        if (!C3606fi.m16710ri("lp_cache_enable", false) || TextUtils.isEmpty(str)) {
            bundleM16361ri = null;
            c2634di = null;
        } else {
            String str2 = System.identityHashCode(this.f8046ac) + "_" + str;
            c2634di = C3560ac.m16362ri(this, str2);
            bundleM16361ri = C3560ac.m16361ri(str2);
        }
        if (c2634di == null) {
            c2634di = new C2634di(this, C2634di.ik.LANDING_PAGE);
        } else {
            if (bundleM16361ri != null && c2634di.getWebView() != null) {
                c2634di.getWebView().restoreState(bundleM16361ri);
            }
            this.f8066qd = true;
        }
        c2634di.setId(slm.f13267fe);
        c3192ik2.addView(c2634di, new FrameLayout.LayoutParams(-1, -1));
        C2957vr c2957vr2 = new C2957vr(this, new C2957vr.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.2
            @Override // com.bytedance.sdk.openadsdk.common.C2957vr.ri
            /* JADX INFO: renamed from: ri */
            public View mo10651ri(Context context) {
                return new C2948mj(context);
            }
        });
        c2957vr2.setId(slm.gcp);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        c3192ik2.addView(c2957vr2, layoutParams2);
        C3190di c3190di = new C3190di(this, null, R.style.Widget.ProgressBar.Horizontal);
        c3190di.setId(slm.f13313xe);
        c3190di.setProgress(1);
        c3190di.setVisibility(8);
        c3190di.setProgressDrawable(C3586sf.m16645ri(this, "tt_browser_progress_style"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, C3583qd.m16589lr(this, 3.0f));
        layoutParams3.gravity = 49;
        c3192ik2.addView(c3190di, layoutParams3);
        C2932co c2932co = new C2932co(this);
        c2932co.setOnlyLoading(this.f8056ig);
        c2932co.setId(520093721);
        c3192ik.addView(c2932co, new FrameLayout.LayoutParams(-1, -1));
        return c3192ik;
    }

    /* JADX INFO: renamed from: ri */
    private void m10643ri(final int i) {
        if (this.xha == null || !m10639qt()) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.9
            @Override // java.lang.Runnable
            public void run() {
                C3583qd.m16612ri((View) TTLandingPageActivity.this.xha, i);
            }
        });
    }

    /* JADX INFO: renamed from: sf */
    private void m10645sf() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.f8049bu.mo13455ri("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    private void xha() {
        C2634di c2634di = (C2634di) findViewById(slm.f13267fe);
        this.f8051di = c2634di;
        C3571ig.m16482ri(this.f8046ac, c2634di);
        this.f8050co = (C2957vr) findViewById(slm.gcp);
        C2957vr c2957vr = (C2957vr) findViewById(slm.f13287nd);
        C2932co c2932co = (C2932co) findViewById(520093721);
        this.hcw = c2932co;
        if (c2932co != null) {
            c2932co.m11288ri(this.f8046ac);
            this.hcw.mo11286ri();
        }
        if (c2957vr != null) {
            c2957vr.setVisibility(0);
        }
        if (this.zyn) {
            this.srn = (ImageView) findViewById(slm.f13306ud);
        } else {
            this.srn = (ImageView) findViewById(520093720);
        }
        ImageView imageView = this.srn;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.f8051di != null) {
                        if (TTLandingPageActivity.this.f8072xd != null) {
                            TTLandingPageActivity.this.f8072xd.mo15059ri();
                        }
                        if (!TTLandingPageActivity.this.f8051di.jbs()) {
                            if (TTLandingPageActivity.this.zyn) {
                                return;
                            }
                            TTLandingPageActivity.this.finish();
                            return;
                        }
                        TTLandingPageActivity.this.f8051di.m9780qt();
                        if (TTLandingPageActivity.this.zyn) {
                            WebView webView = TTLandingPageActivity.this.f8051di.getWebView();
                            if (TTLandingPageActivity.this.feb == null || webView == null) {
                                return;
                            }
                            TTLandingPageActivity.this.feb.m11248ri(webView, TTLandingPageActivity.this.f8072xd);
                        }
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(slm.hpn);
        this.f8058jc = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.f8051di == null || !TTLandingPageActivity.this.f8051di.m9789sf()) {
                        return;
                    }
                    TTLandingPageActivity.this.f8051di.m9771co();
                    if (TTLandingPageActivity.this.zyn) {
                        WebView webView = TTLandingPageActivity.this.f8051di.getWebView();
                        if (TTLandingPageActivity.this.feb == null || webView == null) {
                            return;
                        }
                        TTLandingPageActivity.this.feb.m11248ri(webView, TTLandingPageActivity.this.f8072xd);
                    }
                }
            });
        }
        ImageView imageView3 = (ImageView) findViewById(520093716);
        this.xha = imageView3;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
        }
        this.f8062mj = (TextView) findViewById(slm.f13288nh);
        C3190di c3190di = (C3190di) findViewById(slm.f13313xe);
        this.bgr = c3190di;
        if (c3190di != null) {
            c3190di.setVisibility(0);
        }
        this.f8060kt = (ImageView) findViewById(520093740);
        if (this.zyn) {
            final C2927ac c2927ac = new C2927ac(this, false);
            ImageView imageView4 = this.f8060kt;
            if (imageView4 != null) {
                imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.7
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        c2927ac.setOnMenuItemClickListener(new C2927ac.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.7.1
                            @Override // com.bytedance.sdk.openadsdk.common.C2927ac.ri
                            /* JADX INFO: renamed from: ik */
                            public void mo10652ik() {
                                if (TTLandingPageActivity.this.f8051di != null) {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    String url = TTLandingPageActivity.this.f8051di.getUrl();
                                    if (!TextUtils.isEmpty(url)) {
                                        intent.setData(Uri.parse(url));
                                        C2722lr.m10241ri(TTLandingPageActivity.this, intent, null);
                                    }
                                    c2927ac.m11239ri();
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.C2927ac.ri
                            /* JADX INFO: renamed from: ka */
                            public void mo10653ka() {
                                TTLandingPageActivity.this.m10647ik();
                                c2927ac.m11239ri();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.C2927ac.ri
                            /* JADX INFO: renamed from: lr */
                            public void mo10654lr() {
                                ClipboardManager clipboardManager;
                                if (TTLandingPageActivity.this.f8051di != null) {
                                    String url = TTLandingPageActivity.this.f8051di.getUrl();
                                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) TTLandingPageActivity.this.getSystemService("clipboard")) != null) {
                                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                                    }
                                }
                                c2927ac.m11239ri();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.C2927ac.ri
                            /* JADX INFO: renamed from: ri */
                            public void mo10655ri() {
                                C2634di c2634di2 = TTLandingPageActivity.this.f8051di;
                                if (c2634di2 == null || c2634di2.getUrl() == null) {
                                    return;
                                }
                                if (TTLandingPageActivity.this.bgr != null) {
                                    TTLandingPageActivity.this.bgr.setVisibility(0);
                                    TTLandingPageActivity.this.bgr.setProgress(0);
                                }
                                c2634di2.xha();
                                String url = c2634di2.getUrl();
                                if (url != null) {
                                    c2634di2.m9767a_(url);
                                }
                                c2927ac.m11239ri();
                            }
                        });
                        c2927ac.m11240ri(view);
                    }
                });
            }
        }
        View viewFindViewById = findViewById(slm.jxw);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.m10647ik();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ik */
    protected void m10647ik() {
        if (isFinishing()) {
            return;
        }
        if (this.f8054fi.get()) {
            m10622aw();
            return;
        }
        if (this.f8061lr == null) {
            m10625co();
        }
        C2931bu c2931bu = this.f8061lr;
        if (c2931bu != null) {
            c2931bu.m11274ri();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    /* JADX INFO: renamed from: lr */
    protected void mo10489lr() {
        jbs();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        jbs();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable unused) {
        }
        m10629fi();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C3332vr.m14975fi()) {
            finish();
            return;
        }
        try {
            C3299nr.m14641lr(this);
        } catch (Throwable unused) {
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        wjv wjvVarM13350ri = C3197dw.m13337ri().m13350ri(C3197dw.m13336ri(getIntent()));
        this.f8046ac = wjvVarM13350ri;
        if (wjvVarM13350ri != null) {
            this.f8056ig = wjvVarM13350ri.bgr();
            this.f8046ac.m14454nd(0);
            if (C3606fi.m16710ri("lp_cache_enable", false)) {
                C3560ac.m16365ri(this.f8046ac);
            }
        }
        C2900lr.m11162ri(this);
        this.f8070uq = "";
        m10643ri(4);
        wjv wjvVar = this.f8046ac;
        if (wjvVar != null) {
            this.f8071vr = wjvVar.m14533tn();
            this.slm = this.f8046ac.yjg();
            this.f8048ay = this.f8046ac.mvf();
            this.f8070uq = this.f8046ac.m14519sf();
            this.f8063nr = this.f8046ac.m14360aw();
            this.tan = this.f8046ac.m14373co();
        }
        try {
            setContentView(m10641ri(this.f8070uq));
            if (this.f8046ac == null) {
                finish();
                return;
            }
            if (C3606fi.m16710ri("lp_cache_enable", false)) {
                m10632ka();
            }
            xha();
            if (!TextUtils.isEmpty(this.f8048ay)) {
                this.f8055fr = C3611lr.m16744ri().m16746lr();
                int iM16747ri = C3611lr.m16744ri().m16747ri(this.f8055fr, this.f8048ay);
                this.f8073zf = iM16747ri;
                this.f8052dw = iM16747ri > 0 ? 2 : 0;
            }
            this.f8068sf = this;
            if (this.f8051di != null) {
                C3349ik.m15077ri(this).m15081ri(false).m15080lr(false).m15082ri(this.f8051di.getWebView());
            }
            if (this.zyn) {
                this.feb.m11250ri(true);
            }
            C2634di c2634di = this.f8051di;
            if (c2634di != null && c2634di.getWebView() != null) {
                C3393aw c3393awM15370lr = new C3393aw(this.f8046ac, this.f8051di.getWebView(), new C2800ri(this.f8073zf, this.f8046ac, "landingpage", this), this.f8052dw).m15370lr(true);
                this.f8067ri = c3393awM15370lr;
                this.f8072xd = c3393awM15370lr.f12084ri;
                this.dzy = C3571ig.m16472ri(this.f8046ac, this.f8051di, this.f8068sf, this.tan);
                this.f8067ri.m15363fi(this.f8066qd);
                this.f8046ac.tan(this.f8066qd);
            }
            m10635mj();
            C2634di c2634di2 = this.f8051di;
            if (c2634di2 != null) {
                c2634di2.setLandingPage(true);
                this.f8051di.setTag("landingpage");
                this.f8051di.setMaterialMeta(this.f8046ac.m14452nb());
            }
            C3348fi c3348fi = new C3348fi(this.f8068sf, this.f8049bu, this.f8071vr, this.dzy, this.f8067ri, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    try {
                        if (TTLandingPageActivity.this.bgr != null && !TTLandingPageActivity.this.isFinishing()) {
                            TTLandingPageActivity.this.bgr.setVisibility(8);
                        }
                    } catch (Throwable unused2) {
                    }
                    if (TTLandingPageActivity.this.hcw != null) {
                        TTLandingPageActivity.this.hcw.m11285lr();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(TTLandingPageActivity.this.f8048ay)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        TTLandingPageActivity.this.f8069su.incrementAndGet();
                        WebResourceResponseModel webResourceResponseModelM16748ri = C3611lr.m16744ri().m16748ri(TTLandingPageActivity.this.f8055fr, TTLandingPageActivity.this.f8048ay, str);
                        if (webResourceResponseModelM16748ri != null && webResourceResponseModelM16748ri.getWebResourceResponse() != null) {
                            TTLandingPageActivity.this.ory.incrementAndGet();
                            return webResourceResponseModelM16748ri.getWebResourceResponse();
                        }
                        if (webResourceResponseModelM16748ri != null && webResourceResponseModelM16748ri.getMsg() == 2) {
                            TTLandingPageActivity.this.igq.incrementAndGet();
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th) {
                        C2707ac.m10206ri("TTAD.LandingPageAct", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }
            };
            this.f8065pv = c3348fi;
            c3348fi.m15072ri(this.f8046ac);
            this.f8065pv.m15073ri("landingpage");
            C2634di c2634di3 = this.f8051di;
            if (c2634di3 != null) {
                c2634di3.setWebViewClient(this.f8065pv);
                C2634di c2634di4 = this.f8051di;
                if (c2634di4 != null) {
                    c2634di4.setUserAgentString(tan.m16659ri(c2634di4.getWebView(), BuildConfig.VERSION_CODE));
                }
                C2634di c2634di5 = this.f8051di;
                if (c2634di5 != null) {
                    c2634di5.setMixedContentMode(0);
                }
            }
            C3414ik.m15537ri(this.f8046ac, "landingpage", this.f8052dw);
            if (this.f8051di != null) {
                if (C3606fi.m16710ri("lp_cache_enable", false) && this.f8066qd) {
                    C3393aw c3393aw = this.f8067ri;
                    if (c3393aw != null) {
                        c3393aw.m15364ik(this.f8070uq);
                        this.f8067ri.m15368ka(this.f8070uq);
                        this.f8067ri.m15389ri(this.f8070uq, 0L);
                    }
                    C2932co c2932co = this.hcw;
                    if (c2932co != null) {
                        c2932co.m11285lr();
                    }
                } else {
                    C3594uq.m16663ri(this.f8051di, this.f8070uq);
                }
                this.f8051di.setWebChromeClient(new C3350ka(this.f8049bu, this.f8067ri, this.dzy) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.11
                    @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3350ka, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i) {
                        super.onProgressChanged(webView, i);
                        if (TTLandingPageActivity.this.hcw != null) {
                            TTLandingPageActivity.this.hcw.m11287ri(i);
                        }
                        if (TTLandingPageActivity.this.bgr != null && !TTLandingPageActivity.this.isFinishing()) {
                            if (i == 100 && TTLandingPageActivity.this.bgr.isShown()) {
                                TTLandingPageActivity.this.bgr.setVisibility(8);
                            } else {
                                TTLandingPageActivity.this.bgr.setProgress(i);
                            }
                        }
                        if (!TTLandingPageActivity.this.zyn || TTLandingPageActivity.this.feb == null) {
                            return;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - TTLandingPageActivity.this.tnn >= 200 || i == 100) {
                            TTLandingPageActivity.this.feb.m11248ri(webView, TTLandingPageActivity.this.f8072xd);
                            TTLandingPageActivity.this.tnn = jCurrentTimeMillis;
                        }
                    }

                    @Override // android.webkit.WebChromeClient
                    public void onReceivedTitle(WebView webView, String str) {
                        super.onReceivedTitle(webView, str);
                        if (TTLandingPageActivity.this.zyn) {
                            TTLandingPageActivity.this.feb.m11249ri(str);
                            TTLandingPageActivity.this.feb.m11246lr(webView.getUrl());
                        } else if (TTLandingPageActivity.this.f8062mj != null) {
                            TextView textView = TTLandingPageActivity.this.f8062mj;
                            if (TextUtils.isEmpty(str)) {
                                str = C2729uq.m10311ri(TTLandingPageActivity.this, "tt_web_title_default");
                            }
                            textView.setText(str);
                        }
                    }
                });
                if (this.f8051di.getWebView() != null) {
                    this.f8051di.getWebView().setOnScrollChangeListener(new ViewOnScrollChangeListenerC2799lr(this.f8067ri));
                    this.f8051di.getWebView().setOnTouchListener(new ViewOnTouchListenerC2798ik(this.f8067ri, this.dzy) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.12

                        /* JADX INFO: renamed from: fi */
                        private long f8078fi;

                        /* JADX INFO: renamed from: ik */
                        private float f8079ik;

                        /* JADX INFO: renamed from: ka */
                        private float f8080ka;

                        /* JADX INFO: renamed from: lr */
                        private final int f8081lr = C3299nr.m14640lr();

                        /* JADX INFO: renamed from: di */
                        private float f8077di = 0.0f;
                        private float xha = 0.0f;

                        @Override // com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.ViewOnTouchListenerC2798ik, android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            if (!TTLandingPageActivity.this.zyn) {
                                return super.onTouch(view, motionEvent);
                            }
                            try {
                                int actionMasked = motionEvent.getActionMasked();
                                if (actionMasked == 0) {
                                    this.f8079ik = motionEvent.getRawX();
                                    this.f8080ka = motionEvent.getRawY();
                                    this.f8078fi = System.currentTimeMillis();
                                } else if (actionMasked == 2) {
                                    float rawX = motionEvent.getRawX();
                                    float rawY = motionEvent.getRawY();
                                    if (Math.abs(rawX - this.f8079ik) < this.f8081lr) {
                                        Math.abs(rawY - this.f8080ka);
                                    }
                                    this.f8077di += Math.abs(motionEvent.getX() - this.f8079ik);
                                    this.xha += Math.abs(motionEvent.getY() - this.f8080ka);
                                    System.currentTimeMillis();
                                    if (rawY - this.f8080ka > this.f8081lr) {
                                        TTLandingPageActivity.this.feb.m11247ri();
                                    }
                                    if (rawY - this.f8080ka < (-this.f8081lr)) {
                                        TTLandingPageActivity.this.feb.m11245lr();
                                    }
                                }
                            } catch (Throwable th) {
                                Log.e("TTAD.LandingPageAct", "TouchRecordTool onTouch error", th);
                            }
                            return super.onTouch(view, motionEvent);
                        }
                    });
                }
                this.f8051di.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.13
                    @Override // android.webkit.DownloadListener
                    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                        if (TTLandingPageActivity.this.ihz != null) {
                            TTLandingPageActivity.this.ihz.mo15239ri(TTLandingPageActivity.this.f8046ac);
                        }
                    }
                });
            }
            m10629fi();
            bgr bgrVarM16529ri = com.bytedance.sdk.openadsdk.utils.jbs.m16529ri(this, new com.bytedance.sdk.openadsdk.utils.jbs.InterfaceC3576ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.14
                @Override // com.bytedance.sdk.openadsdk.utils.jbs.InterfaceC3576ri
                /* JADX INFO: renamed from: lr */
                public void mo10648lr() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.jbs.InterfaceC3576ri
                /* JADX INFO: renamed from: ri */
                public View mo10649ri() {
                    return TTLandingPageActivity.this.xha;
                }
            });
            this.f8064oh = bgrVarM16529ri;
            bgrVarM16529ri.mo16373ri(0L);
            C3414ik.ri.m15571ri(SystemClock.elapsedRealtime() - jElapsedRealtime, this.f8046ac, "landingpage", this.f8055fr, this.f8048ay);
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        C2634di c2634di;
        C2634di c2634di2;
        super.onDestroy();
        if (C3606fi.m16710ri("lp_cache_enable", false)) {
            wjv wjvVar = this.f8046ac;
            if (wjvVar != null) {
                wjvVar.m14454nd(0);
            }
            C3393aw c3393aw = this.f8067ri;
            if (c3393aw != null && (c2634di2 = this.f8051di) != null) {
                c3393aw.m15384ri(c2634di2);
            }
            if (this.f8051di == null || TextUtils.isEmpty(this.f8070uq)) {
                C2634di c2634di3 = this.f8051di;
                if (c2634di3 != null) {
                    C2735zf.m10345ri(c2634di3);
                }
            } else {
                Bundle bundle = new Bundle();
                if (this.f8051di.getWebView() != null) {
                    this.f8051di.getWebView().saveState(bundle);
                }
                C3560ac.m16366ri(System.identityHashCode(this.f8046ac) + "_" + this.f8070uq, this.f8051di, bundle);
            }
            this.f8051di = null;
        } else {
            C3393aw c3393aw2 = this.f8067ri;
            if (c3393aw2 != null && (c2634di = this.f8051di) != null) {
                c3393aw2.m15384ri(c2634di);
            }
        }
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!C3606fi.m16710ri("lp_cache_enable", false)) {
            C2634di c2634di4 = this.f8051di;
            if (c2634di4 != null) {
                C2735zf.m10345ri(c2634di4);
            }
            this.f8051di = null;
        }
        dzy dzyVar = this.f8049bu;
        if (dzyVar != null) {
            dzyVar.m13403co();
        }
        C3393aw c3393aw3 = this.f8067ri;
        if (c3393aw3 != null) {
            c3393aw3.m15369ka(true);
        }
        if (!TextUtils.isEmpty(this.f8048ay)) {
            C3414ik.ri.m15570ri(this.ory.get(), this.f8069su.get(), this.f8046ac);
        }
        C3611lr.m16744ri().m16749ri(this.f8055fr);
        bgr bgrVar = this.f8064oh;
        if (bgrVar != null) {
            bgrVar.mo16370ik();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        bgr bgrVar = this.f8064oh;
        if (bgrVar != null) {
            bgrVar.mo16371lr();
        }
        wjv wjvVar = this.f8046ac;
        if (wjvVar != null) {
            wjvVar.xha(SystemClock.elapsedRealtime());
            this.f8046ac.m14454nd(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        wjv wjvVar = this.f8046ac;
        if (wjvVar != null) {
            wjvVar.m14454nd(1);
        }
        dzy dzyVar = this.f8049bu;
        if (dzyVar != null) {
            dzyVar.m13459sf();
        }
        C3393aw c3393aw = this.f8067ri;
        if (c3393aw != null) {
            c3393aw.xha();
        }
        bgr bgrVar = this.f8064oh;
        if (bgrVar != null) {
            bgrVar.mo16372ri();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        C3577ka.m16532ri(this, this.f8046ac);
        wjv wjvVar = this.f8046ac;
        if (wjvVar != null) {
            wjvVar.m14454nd(1);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        wjv wjvVar = this.f8046ac;
        if (wjvVar != null) {
            wjvVar.m14454nd(0);
        }
        C3393aw c3393aw = this.f8067ri;
        if (c3393aw != null) {
            c3393aw.m15375mj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    /* JADX INFO: renamed from: ri */
    protected boolean mo10491ri() {
        return true;
    }
}
