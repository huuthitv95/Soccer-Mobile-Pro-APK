package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.bykv.p028vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.C3197dw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.ory;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik;
import com.bytedance.sdk.openadsdk.core.p219ik.C3221ri;
import com.bytedance.sdk.openadsdk.core.p219ik.InterfaceC3219ka;
import com.bytedance.sdk.openadsdk.core.srn;
import com.bytedance.sdk.openadsdk.core.widget.C3341ka;
import com.bytedance.sdk.openadsdk.core.widget.C3345qt;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3371ka;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.InterfaceC3370ik;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2879di;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2880fi;
import com.bytedance.sdk.openadsdk.p235ik.C3377ik;
import com.bytedance.sdk.openadsdk.p236ka.C3393aw;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3418fi;
import com.bytedance.sdk.openadsdk.p266uq.C3546mj;
import com.bytedance.sdk.openadsdk.p266uq.p268ri.C3552ri;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.xha.C3611lr;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TTPlayableLandingPageActivity extends TTBaseLandingPageActivity implements igq.InterfaceC2719ri, InterfaceC3118lr, InterfaceC3219ka {

    /* JADX INFO: renamed from: kt */
    private static final com.bytedance.sdk.openadsdk.p266uq.xha.InterfaceC3553ri f8108kt = new com.bytedance.sdk.openadsdk.p266uq.xha.InterfaceC3553ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.1
    };

    /* JADX INFO: renamed from: ac */
    private dzy f8109ac;

    /* JADX INFO: renamed from: aw */
    private C3193ka f8110aw;
    private C3193ka bgr;

    /* JADX INFO: renamed from: bu */
    private String f8112bu;

    /* JADX INFO: renamed from: co */
    private C3193ka f8113co;

    /* JADX INFO: renamed from: di */
    private C2634di f8114di;

    /* JADX INFO: renamed from: dw */
    private InterfaceC3370ik f8115dw;

    /* JADX INFO: renamed from: fr */
    private wjv f8117fr;
    private String hcw;

    /* JADX INFO: renamed from: ig */
    private ILoader f8118ig;
    private boolean igq;
    private int ihz;

    /* JADX INFO: renamed from: jc */
    private C3393aw f8120jc;

    /* JADX INFO: renamed from: lr */
    TTAdDislikeToast f8122lr;

    /* JADX INFO: renamed from: nr */
    private String f8124nr;

    /* JADX INFO: renamed from: pv */
    private C3546mj f8126pv;

    /* JADX INFO: renamed from: ri */
    ory f8128ri;
    private C3345qt slm;
    private InterfaceC3418fi srn;
    private dzy tan;
    private C3552ri tnn;

    /* JADX INFO: renamed from: uq */
    private String f8131uq;

    /* JADX INFO: renamed from: vr */
    private Context f8132vr;
    private String wjv;

    /* JADX INFO: renamed from: zf */
    private boolean f8134zf;
    private boolean zyn;
    private boolean xha = true;

    /* JADX INFO: renamed from: mj */
    private boolean f8123mj = false;

    /* JADX INFO: renamed from: sf */
    private boolean f8129sf = true;

    /* JADX INFO: renamed from: ik */
    final AtomicBoolean f8119ik = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ay */
    private final String f8111ay = "embeded_ad";

    /* JADX INFO: renamed from: su */
    private final igq f8130su = new igq(Looper.getMainLooper(), this);
    private final AtomicBoolean ory = new AtomicBoolean(false);

    /* JADX INFO: renamed from: oh */
    private final AtomicInteger f8125oh = new AtomicInteger(0);

    /* JADX INFO: renamed from: xd */
    private final AtomicInteger f8133xd = new AtomicInteger(0);
    private final AtomicInteger dzy = new AtomicInteger(0);

    /* JADX INFO: renamed from: qd */
    private boolean f8127qd = false;

    /* JADX INFO: renamed from: ka */
    int f8121ka = -1;

    /* JADX INFO: renamed from: fi */
    protected InterfaceC2880fi f8116fi = new InterfaceC2880fi() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.8
        @Override // com.bytedance.sdk.openadsdk.p174aw.InterfaceC2880fi
        /* JADX INFO: renamed from: ri */
        public void mo10682ri() {
            if (!TTPlayableLandingPageActivity.this.isFinishing() && C3279dw.m14082aw(TTPlayableLandingPageActivity.this.f8117fr) && C3279dw.bgr(TTPlayableLandingPageActivity.this.f8117fr)) {
                TTPlayableLandingPageActivity.this.f8130su.removeMessages(2);
                TTPlayableLandingPageActivity.this.f8130su.sendMessage(TTPlayableLandingPageActivity.this.m10670ri(1, 0));
            }
        }
    };
    private int feb = 1;

    /* JADX INFO: renamed from: ac */
    private void m10657ac() {
        C3221ri c3221ri = new C3221ri(this, this.f8117fr, "embeded_ad", this.ihz) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3221ri, com.bytedance.sdk.openadsdk.core.p219ik.C3220lr, com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik
            /* JADX INFO: renamed from: ri */
            public void mo10681ri(View view, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, boolean z) {
                wjv wjvVar = this.f10695di;
                if (wjvVar == null || wjvVar.yjm() != 1 || z) {
                    super.mo10681ri(view, f, f2, f3, f4, sparseArray, z);
                    TTPlayableLandingPageActivity.this.ihz();
                    TTPlayableLandingPageActivity.this.igq = true;
                    TTPlayableLandingPageActivity.this.f8134zf = true;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_url", TTPlayableLandingPageActivity.this.f8131uq);
                    } catch (JSONException e) {
                        C2707ac.m10206ri("TTPWPActivity", "onClick JSON ERROR", e);
                    }
                    C3414ik.m15522lr(TTPlayableLandingPageActivity.this.f8117fr, this.xha, "click_playable_download_button_loading", jSONObject);
                }
            }
        };
        c3221ri.m13534ri(this.f8115dw);
        C3552ri c3552ri = this.tnn;
        if (c3552ri != null) {
            c3552ri.m16302ri(c3221ri);
        }
    }

    /* JADX INFO: renamed from: aw */
    private void m10658aw() {
        C3193ka c3193ka = this.f8113co;
        if (c3193ka != null) {
            c3193ka.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTPlayableLandingPageActivity.this.srn != null) {
                        TTPlayableLandingPageActivity.this.srn.xha();
                    }
                    TTPlayableLandingPageActivity.this.f8130su.sendMessage(TTPlayableLandingPageActivity.this.m10670ri(4, 0));
                    TTPlayableLandingPageActivity.this.m10674ri("playable_close");
                    TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        C3193ka c3193ka2 = this.f8110aw;
        if (c3193ka2 != null) {
            c3193ka2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity.this.m10679ik();
                }
            });
        }
        C3193ka c3193ka3 = this.bgr;
        if (c3193ka3 != null) {
            c3193ka3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity.f8127qd = !tTPlayableLandingPageActivity.f8127qd;
                    TTPlayableLandingPageActivity tTPlayableLandingPageActivity2 = TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity2.m10677di(tTPlayableLandingPageActivity2.f8127qd);
                    if (TTPlayableLandingPageActivity.this.f8126pv != null) {
                        TTPlayableLandingPageActivity.this.f8126pv.m16215ri(TTPlayableLandingPageActivity.this.f8127qd);
                    }
                }
            });
        }
    }

    private void bgr() {
        super.onBackPressed();
        InterfaceC3418fi interfaceC3418fi = this.srn;
        if (interfaceC3418fi != null) {
            interfaceC3418fi.xha();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ihz() {
        C3197dw.m13337ri().m13346lr(this.f8117fr);
    }

    private void jbs() {
        int i = C3299nr.m14639ka().m14883su(String.valueOf(this.f8117fr.m14545ur())).f11584bu;
        if (i >= 0) {
            this.f8130su.sendEmptyMessageDelayed(1, ((long) i) * 1000);
        } else {
            C3583qd.m16612ri((View) this.f8113co, 0);
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m10665lr(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            wjv wjvVarM13350ri = C3197dw.m13337ri().m13350ri(C3197dw.m13336ri(intent));
            this.f8117fr = wjvVarM13350ri;
            if (wjvVarM13350ri != null) {
                this.f8131uq = wjvVarM13350ri.m14519sf();
                this.ihz = this.f8117fr.m14360aw();
                this.igq = this.f8117fr.m14550vr();
                this.f8112bu = this.f8117fr.m14533tn();
                this.f8124nr = this.f8117fr.yjg();
                this.hcw = this.f8117fr.mvf();
                this.wjv = this.f8117fr.m14559xh();
            }
        }
        if (bundle != null) {
            try {
                wjv wjvVarM13350ri2 = C3197dw.m13337ri().m13350ri(bundle.getInt("meta_index", -1));
                this.f8117fr = wjvVarM13350ri2;
                if (wjvVarM13350ri2 != null) {
                    this.f8112bu = wjvVarM13350ri2.m14533tn();
                    this.f8124nr = this.f8117fr.yjg();
                    this.hcw = this.f8117fr.mvf();
                    this.wjv = this.f8117fr.m14559xh();
                    this.f8131uq = this.f8117fr.m14519sf();
                    this.ihz = this.f8117fr.m14360aw();
                    this.igq = this.f8117fr.m14550vr();
                }
            } catch (Throwable unused) {
            }
        }
        if (this.f8117fr == null) {
            finish();
            return;
        }
        try {
            this.f8127qd = C3299nr.m14639ka().m14834bu(this.f8117fr.m14388eb().getCodeId());
        } catch (Throwable th) {
            C2707ac.m10196ik("TTPWPActivity", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: mj */
    private void m10667mj() {
        if (this.f8117fr.adz() == 4) {
            this.f8115dw = C3371ka.m15240ri(this.f8132vr, "interaction");
        }
    }

    /* JADX INFO: renamed from: nr */
    private void m10669nr() {
        TTAdDislikeToast tTAdDislikeToast = this.f8122lr;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public Message m10670ri(int i, int i2) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.arg1 = i;
        if (i == 3) {
            messageObtain.arg2 = i2;
        }
        return messageObtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m10674ri(String str) {
        C3414ik.m15531ri(System.currentTimeMillis(), this.f8117fr, "embeded_ad", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tan() {
        TTAdDislikeToast tTAdDislikeToast = this.f8122lr;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    private View xha() {
        C3192ik c3192ik = new C3192ik(this);
        c3192ik.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.tnn = new C3552ri(this.f8132vr, this.f8117fr, this.feb, this.f8127qd, c3192ik, true);
        int iM16589lr = C3583qd.m16589lr(this, 5.0f);
        this.bgr = new C3193ka(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C3583qd.m16589lr(this, 28.0f), C3583qd.m16589lr(this, 28.0f));
        layoutParams.rightMargin = C3583qd.m16589lr(this, 56.0f);
        layoutParams.topMargin = C3583qd.m16589lr(this, 20.0f);
        layoutParams.gravity = 8388661;
        this.bgr.setLayoutParams(layoutParams);
        this.bgr.setPadding(iM16589lr, iM16589lr, iM16589lr, iM16589lr);
        this.bgr.setBackground(C3341ka.m15010ri());
        this.bgr.setScaleType(ImageView.ScaleType.CENTER);
        this.bgr.setImageDrawable(C3586sf.m16645ri(this, "tt_unmute_wrapper"));
        C3193ka c3193ka = new C3193ka(this);
        this.f8110aw = c3193ka;
        c3193ka.setPadding(iM16589lr, iM16589lr, iM16589lr, iM16589lr);
        this.f8110aw.setScaleType(ImageView.ScaleType.CENTER);
        this.f8110aw.setBackground(C3341ka.m15010ri());
        this.f8110aw.setImageResource(C2729uq.m10305ka(C3299nr.m14642ri(), "tt_reward_full_feedback"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C3583qd.m16589lr(this, 28.0f), C3583qd.m16589lr(this, 28.0f));
        layoutParams2.gravity = 8388661;
        layoutParams2.rightMargin = C3583qd.m16589lr(this, 16.0f);
        layoutParams2.topMargin = C3583qd.m16589lr(this, 20.0f);
        this.f8110aw.setLayoutParams(layoutParams2);
        this.f8113co = new C3193ka(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C3583qd.m16589lr(this, 28.0f), C3583qd.m16589lr(this, 28.0f));
        layoutParams3.gravity = 8388659;
        layoutParams3.topMargin = C3583qd.m16589lr(this, 20.0f);
        layoutParams3.leftMargin = C3583qd.m16589lr(this, 16.0f);
        this.f8113co.setLayoutParams(layoutParams3);
        this.f8113co.setPadding(iM16589lr, iM16589lr, iM16589lr, iM16589lr);
        this.f8113co.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f8113co.setBackground(C3341ka.m15010ri());
        this.f8113co.setImageDrawable(C2729uq.m10303ik(this, "tt_white_lefterbackicon_titlebar"));
        this.f8113co.setVisibility(0);
        c3192ik.addView(this.bgr);
        c3192ik.addView(this.f8110aw);
        c3192ik.addView(this.f8113co);
        return c3192ik;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: bu */
    public void mo10557bu() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: co */
    public void mo10558co() {
    }

    /* JADX INFO: renamed from: di */
    public void m10676di() {
        C3583qd.m16608ri((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.7
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (TTPlayableLandingPageActivity.this.isFinishing()) {
                            return;
                        }
                        TTPlayableLandingPageActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.7.1
                            @Override // java.lang.Runnable
                            public void run() {
                                C3583qd.m16608ri((Activity) TTPlayableLandingPageActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e) {
                        C2707ac.m10196ik("TTPWPActivity", e.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: di */
    protected void m10677di(boolean z) {
        try {
            this.f8127qd = z;
            this.bgr.setImageDrawable(z ? C3586sf.m16645ri(this.f8132vr, "tt_mute_wrapper") : C3586sf.m16645ri(this.f8132vr, "tt_unmute_wrapper"));
            C3546mj c3546mj = this.f8126pv;
            if (c3546mj != null) {
                c3546mj.m16215ri(z);
            }
            C3552ri c3552ri = this.tnn;
            if (c3552ri != null) {
                c3552ri.m16305ri(z);
            }
        } catch (Exception e) {
            C2707ac.m10196ik("TTPWPActivity", e.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    public void dzy() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: fi */
    public void mo10561fi() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.p219ik.InterfaceC3219ka
    /* JADX INFO: renamed from: fi */
    public void mo10678fi(boolean z) {
        InterfaceC3370ik interfaceC3370ik;
        this.igq = true;
        this.f8134zf = z;
        if (!z) {
            try {
                Toast.makeText(this.f8132vr, "Download later", 0).show();
            } catch (Throwable unused) {
            }
        }
        if (!this.f8134zf || (interfaceC3370ik = this.f8115dw) == null) {
            return;
        }
        interfaceC3370ik.mo15239ri(this.f8117fr);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    public void gcp() {
        ihz();
    }

    /* JADX INFO: renamed from: ik */
    protected void m10679ik() {
        if (this.f8117fr == null || isFinishing()) {
            return;
        }
        if (this.f8119ik.get()) {
            m10669nr();
            return;
        }
        if (this.f8128ri == null) {
            m10680ka();
        }
        this.f8128ri.mo14649ri(new ory.InterfaceC3301ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.ory.InterfaceC3301ri
            /* JADX INFO: renamed from: ri */
            public void mo10603ri() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.ory.InterfaceC3301ri
            /* JADX INFO: renamed from: ri */
            public void mo10604ri(int i, String str) {
                if (TTPlayableLandingPageActivity.this.f8119ik.get() || TextUtils.isEmpty(str)) {
                    return;
                }
                TTPlayableLandingPageActivity.this.f8119ik.set(true);
                TTPlayableLandingPageActivity.this.tan();
            }
        });
        ory oryVar = this.f8128ri;
        if (oryVar != null) {
            oryVar.mo14648ri();
        }
    }

    /* JADX INFO: renamed from: ka */
    void m10680ka() {
        if (this.f8117fr != null) {
            this.f8128ri = new C3377ik(this, this.f8117fr.yjg(), this.f8117fr.m14409ib(), this.f8117fr);
        }
        if (this.f8122lr == null) {
            this.f8122lr = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(R.id.content)).addView(this.f8122lr);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ka */
    public void mo10565ka(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    /* JADX INFO: renamed from: lr */
    protected void mo10489lr() {
        bgr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: lr */
    public void mo10610lr(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: lr */
    public void mo10611lr(boolean z) {
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        bgr();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C3332vr.m14975fi()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            requestWindowFeature(1);
            getWindow().addFlags(1024);
            getWindow().addFlags(16777216);
            C3299nr.m14641lr(this);
            m10676di();
        } catch (Throwable unused) {
        }
        m10665lr(bundle);
        wjv wjvVar = this.f8117fr;
        if (wjvVar == null) {
            return;
        }
        this.zyn = wjvVar.m14534tp();
        int iM14101vr = C3279dw.m14101vr(this.f8117fr);
        if (iM14101vr == 0) {
            setRequestedOrientation(14);
        } else if (iM14101vr == 1) {
            setRequestedOrientation(1);
        } else if (iM14101vr == 2) {
            setRequestedOrientation(0);
            this.feb = 2;
        }
        this.f8132vr = this;
        try {
            setContentView(xha());
            m10658aw();
            m10667mj();
            m10657ac();
            this.tnn.m16301ri(this);
            this.tnn.m16306ri(false, (InterfaceC2879di) null);
            jbs();
            C3414ik.ri.m15571ri(SystemClock.elapsedRealtime() - jElapsedRealtime, this.f8117fr, "embeded_ad", this.f8118ig, this.hcw);
            C3552ri c3552ri = this.tnn;
            if (c3552ri != null) {
                c3552ri.mo16276ri();
            }
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        C3197dw.m13337ri().m13342ik(this.f8117fr);
        C3552ri c3552ri = this.tnn;
        if (c3552ri != null) {
            c3552ri.m16297ka();
        }
        InterfaceC3418fi interfaceC3418fi = this.srn;
        if (interfaceC3418fi != null) {
            interfaceC3418fi.mo15592ri(true);
            this.srn.mo15593sf();
        }
        this.f8130su.removeCallbacksAndMessages(null);
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(this.hcw)) {
            C3414ik.ri.m15570ri(this.f8133xd.get(), this.f8125oh.get(), this.f8117fr);
        }
        C3611lr.m16744ri().m16749ri(this.f8118ig);
        C2634di c2634di = this.f8114di;
        if (c2634di != null) {
            srn.m14966ri(c2634di.getWebView());
            this.f8114di.slm();
        }
        this.f8114di = null;
        dzy dzyVar = this.tan;
        if (dzyVar != null) {
            dzyVar.m13403co();
        }
        dzy dzyVar2 = this.f8109ac;
        if (dzyVar2 != null) {
            dzyVar2.m13403co();
        }
        C3546mj c3546mj = this.f8126pv;
        if (c3546mj != null) {
            c3546mj.m16206pv();
        }
        C3393aw c3393aw = this.f8120jc;
        if (c3393aw != null) {
            c3393aw.m15369ka(true);
        }
        ory oryVar = this.f8128ri;
        if (oryVar != null) {
            oryVar.mo14647lr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        dzy dzyVar = this.tan;
        if (dzyVar != null) {
            dzyVar.m13448ri(false);
        }
        C3546mj c3546mj = this.f8126pv;
        if (c3546mj != null) {
            c3546mj.m16215ri(true);
            this.f8126pv.m16184ik(false);
        }
        C3552ri c3552ri = this.tnn;
        if (c3552ri != null) {
            c3552ri.m16296ik();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        dzy dzyVar = this.tan;
        if (dzyVar != null) {
            dzyVar.m13459sf();
            C2634di c2634di = this.f8114di;
            if (c2634di != null) {
                this.tan.m13448ri(c2634di.getVisibility() == 0);
            }
        }
        dzy dzyVar2 = this.f8109ac;
        if (dzyVar2 != null) {
            dzyVar2.m13459sf();
        }
        C3546mj c3546mj = this.f8126pv;
        if (c3546mj != null) {
            c3546mj.m16184ik(true);
        }
        C3393aw c3393aw = this.f8120jc;
        if (c3393aw != null) {
            c3393aw.xha();
        }
        if (DeviceUtils.xha() == 0) {
            this.f8127qd = true;
        }
        m10677di(this.f8127qd);
        C3552ri c3552ri = this.tnn;
        if (c3552ri != null) {
            c3552ri.m16298lr();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int iM13348ri = this.f8117fr != null ? C3197dw.m13337ri().m13348ri(this.f8117fr) : -1;
            this.f8121ka = iM13348ri;
            bundle.putInt("meta_index", iM13348ri);
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.f8121ka >= 0) {
            C3197dw.m13337ri().m13341ik(this.f8121ka);
            this.f8121ka = -1;
        }
        InterfaceC3418fi interfaceC3418fi = this.srn;
        if (interfaceC3418fi != null) {
            interfaceC3418fi.jbs();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        InterfaceC3418fi interfaceC3418fi = this.srn;
        if (interfaceC3418fi != null) {
            interfaceC3418fi.mo15596mj();
        }
        C3393aw c3393aw = this.f8120jc;
        if (c3393aw != null) {
            c3393aw.m15375mj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    public void ory() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: qh */
    public void mo10571qh() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: qt */
    public void mo10572qt() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ri */
    public void mo10575ri(Bundle bundle) {
    }

    @Override // com.bytedance.sdk.component.utils.igq.InterfaceC2719ri
    /* JADX INFO: renamed from: ri */
    public void mo6180ri(Message message) {
        int i = message.what;
        if (i == 1) {
            C3583qd.m16612ri((View) this.f8113co, 0);
            return;
        }
        if (i != 2) {
            return;
        }
        C3345qt c3345qt = this.slm;
        if (c3345qt == null || !c3345qt.m15031ka()) {
            int i2 = message.arg1;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                if (message.arg2 != 0) {
                    jSONObject.put("remove_loading_page_reason", message.arg2);
                }
                jSONObject.put("playable_url", this.f8131uq);
                C3345qt c3345qt2 = this.slm;
                jSONObject.put("duration", c3345qt2 != null ? c3345qt2.getDisplayDuration() : 0L);
            } catch (JSONException e) {
                C2707ac.m10206ri("TTPWPActivity", "handleMsg json error", e);
            }
            C3414ik.m15522lr(this.f8117fr, "embeded_ad", "remove_loading_page", jSONObject);
            this.f8130su.removeMessages(2);
            C3345qt c3345qt3 = this.slm;
            if (c3345qt3 != null) {
                c3345qt3.m15030ik();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ri */
    public void mo10613ri(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ri */
    public void mo10576ri(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    /* JADX INFO: renamed from: ri */
    protected boolean mo10491ri() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ri */
    public boolean mo10580ri(long j, boolean z) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    public List<wjv> rzk() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: sf */
    public void mo10581sf() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    public View slm() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: vr */
    public void mo10584vr() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: xd */
    public void mo10614xd() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: zb */
    public void mo10585zb() {
    }
}
