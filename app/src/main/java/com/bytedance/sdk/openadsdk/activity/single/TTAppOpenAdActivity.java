package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.p126ri.p128lr.AbstractC2521ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.C2931bu;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.C2958di;
import com.bytedance.sdk.openadsdk.component.C2965ik;
import com.bytedance.sdk.openadsdk.component.C2977lr;
import com.bytedance.sdk.openadsdk.component.C3078ri;
import com.bytedance.sdk.openadsdk.component.jbs.C2973mj;
import com.bytedance.sdk.openadsdk.component.p181di.C2959lr;
import com.bytedance.sdk.openadsdk.component.p184ka.C2976ri;
import com.bytedance.sdk.openadsdk.component.p186mj.C2979ik;
import com.bytedance.sdk.openadsdk.component.p186mj.C2981ri;
import com.bytedance.sdk.openadsdk.component.xha.C3087ri;
import com.bytedance.sdk.openadsdk.core.C3197dw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.C3365zf;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.C3119ri;
import com.bytedance.sdk.openadsdk.core.jbs.C3228co;
import com.bytedance.sdk.openadsdk.core.model.C3283ka;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.C3097ka;
import com.bytedance.sdk.openadsdk.core.p190aw.p193ri.EnumC3106ri;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.p175ay.p176lr.C2889fi;
import com.bytedance.sdk.openadsdk.p175ay.p177ri.C2897ik;
import com.bytedance.sdk.openadsdk.p230di.C3366lr;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p252ri.p255ka.InterfaceC3498lr;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.utils.C3577ka;
import com.bytedance.sdk.openadsdk.utils.C3578lr;
import com.bytedance.sdk.openadsdk.utils.C3582pv;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C11744X3;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TTAppOpenAdActivity extends TTBaseActivity implements igq.InterfaceC2719ri, C3119ri.ri {

    /* JADX INFO: renamed from: sf */
    private static InterfaceC3498lr f7957sf;

    /* JADX INFO: renamed from: ac */
    private float f7958ac;

    /* JADX INFO: renamed from: aw */
    private C2959lr f7959aw;

    /* JADX INFO: renamed from: ay */
    private InterfaceC3498lr f7960ay;
    private C2931bu bgr;

    /* JADX INFO: renamed from: dw */
    private boolean f7964dw;
    private boolean dzy;
    private AdSlot hcw;
    private int igq;
    private boolean ihz;

    /* JADX INFO: renamed from: mj */
    protected boolean f7971mj;

    /* JADX INFO: renamed from: nr */
    private com.bytedance.sdk.openadsdk.p236ka.xha f7972nr;
    private C2965ik ory;

    /* JADX INFO: renamed from: su */
    private int f7976su;
    private float tan;

    /* JADX INFO: renamed from: uq */
    private int f7977uq;

    /* JADX INFO: renamed from: vr */
    private TTAdDislikeToast f7978vr;
    private wjv wjv;

    /* JADX INFO: renamed from: xd */
    private long f7979xd;

    /* JADX INFO: renamed from: zf */
    private FrameLayout f7980zf;

    /* JADX INFO: renamed from: ri */
    protected final AtomicBoolean f7975ri = new AtomicBoolean(false);

    /* JADX INFO: renamed from: lr */
    protected final igq f7970lr = new igq(Looper.getMainLooper(), this);

    /* JADX INFO: renamed from: ik */
    final AtomicBoolean f7968ik = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ka */
    final AtomicBoolean f7969ka = new AtomicBoolean(false);

    /* JADX INFO: renamed from: co */
    private final C2981ri f7962co = new C2981ri();

    /* JADX INFO: renamed from: fi */
    protected boolean f7965fi = false;
    private final AtomicBoolean slm = new AtomicBoolean(false);

    /* JADX INFO: renamed from: bu */
    private C3582pv f7961bu = C3582pv.m16566ik();

    /* JADX INFO: renamed from: fr */
    private final AtomicBoolean f7966fr = new AtomicBoolean(false);

    /* JADX INFO: renamed from: di */
    long f7963di = 0;

    /* JADX INFO: renamed from: oh */
    private volatile boolean f7973oh = false;
    int xha = -1;

    /* JADX INFO: renamed from: pv */
    private final C3078ri f7974pv = new C3078ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.1
        @Override // com.bytedance.sdk.openadsdk.component.C3078ri
        /* JADX INFO: renamed from: fi */
        public void mo10539fi() {
            TTAppOpenAdActivity.this.m10528uq();
        }

        @Override // com.bytedance.sdk.openadsdk.component.C3078ri
        /* JADX INFO: renamed from: ik */
        public void mo10540ik() {
            TTAppOpenAdActivity.this.xha();
            TTAppOpenAdActivity.this.f7961bu.m16569fi();
            TTAppOpenAdActivity.this.tan();
            if (TTAppOpenAdActivity.this.ihz) {
                TTAppOpenAdActivity.this.m10494aw();
            }
            if (TTAppOpenAdActivity.this.ory.xha() == null || TTAppOpenAdActivity.this.ory.xha().m11592lr() == null) {
                return;
            }
            TTAppOpenAdActivity.this.ory.xha().m11592lr().m12779ri(TTAppOpenAdActivity.this);
        }

        @Override // com.bytedance.sdk.openadsdk.component.C3078ri
        /* JADX INFO: renamed from: ka */
        public void mo10541ka() {
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.C3078ri, com.bytedance.sdk.openadsdk.component.p181di.InterfaceC2960ri
        /* JADX INFO: renamed from: lr */
        public void mo10542lr() {
            TTAppOpenAdActivity.this.f7973oh = true;
            if (C3606fi.m16703ri("splash_auto_close_switch", 0) == 0) {
                TTAppOpenAdActivity.this.m10512mj();
                TTAppOpenAdActivity.this.finish();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.C3078ri, com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ri
        /* JADX INFO: renamed from: lr */
        public void mo6397lr(long j, int i) {
            C2979ik c2979ikXha;
            StringBuilder sb = new StringBuilder("onError() called with: totalPlayTime = [");
            sb.append(j);
            sb.append("], percent = [");
            sb.append(i);
            sb.append(C11744X3.j.f26440e);
            if (TTAppOpenAdActivity.this.ory != null && (c2979ikXha = TTAppOpenAdActivity.this.ory.xha()) != null) {
                TTAppOpenAdActivity.this.m10506fr();
                c2979ikXha.m11598ri(true);
            }
            TTAppOpenAdActivity.this.wjv();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.C3078ri, com.bytedance.sdk.openadsdk.component.p181di.InterfaceC2960ri
        /* JADX INFO: renamed from: lr */
        public void mo10543lr(View view) {
            TTAppOpenAdActivity.this.m10534ik();
        }

        @Override // com.bytedance.sdk.openadsdk.component.C3078ri, com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ri
        /* JADX INFO: renamed from: ri */
        public void mo6398ri() {
            TTAppOpenAdActivity.this.m10506fr();
            TTAppOpenAdActivity.this.wjv();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.C3078ri, com.bytedance.sdk.openadsdk.component.p181di.InterfaceC2960ri
        /* JADX INFO: renamed from: ri */
        public void mo10544ri(int i, boolean z) {
            if (TTAppOpenAdActivity.this.ory != null) {
                TTAppOpenAdActivity.this.ory.mo11523ri(i, z);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.C3078ri, com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ri
        /* JADX INFO: renamed from: ri */
        public void mo6400ri(long j, long j2) {
            TTAppOpenAdActivity.this.f7962co.m11606ik(j);
            if (!TTAppOpenAdActivity.this.f7965fi && TTAppOpenAdActivity.this.ory != null && TTAppOpenAdActivity.this.ory.xha() != null && TTAppOpenAdActivity.this.ory.xha().m11589fi()) {
                TTAppOpenAdActivity.this.ory.xha().m11593mj();
            }
            TTAppOpenAdActivity.this.bgr();
            if (TTAppOpenAdActivity.this.ory instanceof C2977lr) {
                ((C2977lr) TTAppOpenAdActivity.this.ory).m11580ri(j, j2);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.C3078ri, com.bytedance.sdk.openadsdk.component.p181di.InterfaceC2960ri
        /* JADX INFO: renamed from: ri */
        public void mo10545ri(View view) {
            TTAppOpenAdActivity.this.m10497ay();
        }
    };

    /* JADX INFO: renamed from: ig */
    private final Runnable f7967ig = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.5
        @Override // java.lang.Runnable
        public void run() {
            C3283ka c3283kaM14473qc;
            C3097ka c3097kaM14188ri;
            if (TTAppOpenAdActivity.this.slm.get()) {
                return;
            }
            if (TTAppOpenAdActivity.this.wjv != null && (c3283kaM14473qc = TTAppOpenAdActivity.this.wjv.m14473qc()) != null && (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) != null) {
                c3097kaM14188ri.m12481ri(0L);
            }
            TTAppOpenAdActivity.this.f7972nr = new com.bytedance.sdk.openadsdk.p236ka.xha();
            TTAppOpenAdActivity.this.f7972nr.m15724ri(System.currentTimeMillis(), 1.0f);
            TTAppOpenAdActivity.this.f7961bu.m16569fi();
            if (TTAppOpenAdActivity.this.f7959aw != null) {
                TTAppOpenAdActivity.this.f7959aw.m11481lr();
            }
            if (TTAppOpenAdActivity.this.ory != null) {
                TTAppOpenAdActivity.this.ory.mo11515fi();
            }
            TTAppOpenAdActivity.this.ihz();
            View viewFindViewById = TTAppOpenAdActivity.this.findViewById(R.id.content);
            JSONObject jSONObject = new JSONObject();
            if (viewFindViewById != null) {
                try {
                    jSONObject.put("width", viewFindViewById.getWidth());
                    jSONObject.put("height", viewFindViewById.getHeight());
                    jSONObject.put("alpha", viewFindViewById.getAlpha());
                } catch (JSONException e) {
                    Log.e("TTAppOpenAdActivity", "run: ", e);
                    TTAppOpenAdActivity.this.finish();
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("root_view", jSONObject.toString());
            jSONObject2.put("ad_root", TTAppOpenAdActivity.this.f7976su);
            jSONObject2.put("openad_creative_type", TTAppOpenAdActivity.this.ihz ? "video_normal_ad" : "image_normal_ad");
            if (C2973mj.m11552ik() == null) {
                jSONObject2.put("appicon_acquirefail", "1");
            }
            if (TTAppOpenAdActivity.this.f7964dw || TTAppOpenAdActivity.this.wjv.zyu()) {
                if (TTAppOpenAdActivity.this.m10492ac() || C3087ri.m12365sf()) {
                    jSONObject2.put("dynamic_show_type", TTAppOpenAdActivity.this.m10514nr());
                } else {
                    jSONObject2.put("dynamic_show_type", 1);
                }
                TTAppOpenAdActivity.this.m10522ri(jSONObject2);
            }
            jSONObject2.put("is_icon_only", TTAppOpenAdActivity.this.wjv.ory() ? 1 : 0);
            JSONObject jSONObject3 = new JSONObject();
            if (TTAppOpenAdActivity.this.f7976su == 1) {
                jSONObject3.putOpt("cache_duration", Long.valueOf(System.currentTimeMillis() - TTAppOpenAdActivity.this.f7979xd));
            }
            if (TTAppOpenAdActivity.this.wjv != null) {
                int iM14479qt = TTAppOpenAdActivity.this.wjv.m14479qt();
                jSONObject3.putOpt("start_type", Integer.valueOf(iM14479qt == 1 ? 1 : 2));
                jSONObject3.putOpt("load_index", Integer.valueOf(iM14479qt));
            }
            jSONObject3.putOpt("start_type_backup", Integer.valueOf(C3087ri.m12352ka()));
            jSONObject3.putOpt("app_running_time", Long.valueOf(C3087ri.m12353lr()));
            C3414ik.m15558ri(TTAppOpenAdActivity.this.wjv, "open_ad", jSONObject2, jSONObject3);
            C2889fi.m11110ri(TTAppOpenAdActivity.this.findViewById(R.id.content), TTAppOpenAdActivity.this.wjv, new C2889fi.ri(TTAppOpenAdActivity.this.m10514nr()));
            C2897ik.m11145ri(TTAppOpenAdActivity.this.wjv);
            TTAppOpenAdActivity.this.slm.set(true);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ac */
    public boolean m10492ac() {
        if (!this.wjv.m14465oh()) {
            return false;
        }
        int iHpn = this.wjv.hpn();
        boolean z = AbstractC2521ik.m9089ri(C3228co.m13615ik(), "3.1.78") || AbstractC2521ik.m9089ri(C3228co.m13616ka(), "3.1.78");
        if (iHpn != 0 && iHpn != 9) {
            return true;
        }
        Boolean.valueOf(z);
        return !z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: aw */
    public void m10494aw() {
        if (!this.ihz || this.wjv.ory() || this.f7973oh) {
            return;
        }
        this.f7970lr.sendEmptyMessageDelayed(100, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ay */
    public void m10497ay() {
        C3283ka c3283kaM14473qc;
        C3097ka c3097kaM14188ri;
        C2965ik c2965ik;
        C3365zf.m15145ik(this.f7977uq);
        wjv();
        if (this.ihz && (c2965ik = this.ory) != null && c2965ik.xha() != null) {
            m10506fr();
            this.ory.xha().m11595ri(4);
        }
        C2976ri.m11566ri(this.wjv, (int) this.f7962co.m11605ik(), this.f7959aw.m11483ri(), this.f7962co.m11608lr());
        wjv wjvVar = this.wjv;
        if (wjvVar != null && (c3283kaM14473qc = wjvVar.m14473qc()) != null && (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) != null) {
            C2965ik c2965ik2 = this.ory;
            long jM11586aw = (c2965ik2 == null || c2965ik2.xha() == null) ? 0L : this.ory.xha().m11586aw();
            c3097kaM14188ri.m12467di(jM11586aw);
            c3097kaM14188ri.m12469fi(jM11586aw);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bgr() {
        if (!this.ihz || this.wjv.ory()) {
            return;
        }
        this.f7970lr.removeMessages(100);
    }

    /* JADX INFO: renamed from: bu */
    private void m10499bu() {
        if (C3299nr.m14639ka().ihz(String.valueOf(this.f7977uq)) == 1) {
            if (this.f7962co.m11605ik() >= ((long) C3299nr.m14639ka().m14887uq(String.valueOf(this.f7977uq))) * 1000) {
                m10497ay();
            }
        }
    }

    /* JADX INFO: renamed from: co */
    private void m10500co() {
        if (this.bgr == null) {
            C2931bu c2931bu = new C2931bu(this, this.wjv);
            this.bgr = c2931bu;
            c2931bu.setDislikeSource("video_player");
            this.bgr.setCallback(new C2931bu.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.4
                @Override // com.bytedance.sdk.openadsdk.common.C2931bu.ri
                /* JADX INFO: renamed from: lr */
                public void mo10546lr(View view) {
                    TTAppOpenAdActivity.this.f7968ik.set(false);
                    TTAppOpenAdActivity.this.m10535ka();
                    C2897ik.m11146ri(TTAppOpenAdActivity.this.wjv, 4);
                }

                @Override // com.bytedance.sdk.openadsdk.common.C2931bu.ri
                /* JADX INFO: renamed from: ri */
                public void mo10547ri(View view) {
                    TTAppOpenAdActivity.this.f7968ik.set(true);
                    TTAppOpenAdActivity.this.m10533fi();
                    C2897ik.m11146ri(TTAppOpenAdActivity.this.wjv, 8);
                }

                @Override // com.bytedance.sdk.openadsdk.common.C2931bu.ri
                /* JADX INFO: renamed from: ri */
                public void mo10548ri(FilterWord filterWord) {
                    if (TTAppOpenAdActivity.this.f7969ka.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    TTAppOpenAdActivity.this.f7969ka.set(true);
                    TTAppOpenAdActivity.this.slm();
                }
            });
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
        frameLayout.addView(this.bgr);
        if (this.f7978vr == null) {
            TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this);
            this.f7978vr = tTAdDislikeToast;
            frameLayout.addView(tTAdDislikeToast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fr */
    public void m10506fr() {
        wjv wjvVar;
        try {
            if (this.f7959aw == null || (wjvVar = this.wjv) == null || wjvVar.cmy() == null) {
                return;
            }
            int iM14238lr = this.wjv.cmy().m14238lr();
            if (iM14238lr == 1 || iM14238lr == 2) {
                this.f7959aw.m11486ri(iM14238lr, this.wjv.cmy().m14239ri(), false);
                C2965ik c2965ik = this.ory;
                if (c2965ik == null || c2965ik.xha() == null) {
                    return;
                }
                this.ory.xha().m11592lr().mo6381ri(this.f7962co.m11610ri());
                this.ory.xha().m11592lr().mo6386ri(1.0f);
            }
        } catch (Throwable th) {
            C2707ac.m10196ik("TTAppOpenAdActivity", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ihz() {
        InterfaceC3498lr interfaceC3498lr = this.f7960ay;
        if (interfaceC3498lr != null) {
            interfaceC3498lr.mo11490ri();
        }
    }

    private void jbs() {
        if (26 != Build.VERSION.SDK_INT) {
            this.igq = this.wjv.bbu();
        } else if (getResources().getConfiguration().orientation == 1) {
            this.igq = 1;
        } else {
            this.igq = 2;
        }
        m10516qt();
    }

    /* JADX INFO: renamed from: lr */
    private boolean m10510lr(Bundle bundle) {
        String stringExtra;
        this.wjv = C3197dw.m13337ri().m13350ri(C3197dw.m13336ri(getIntent()));
        if (this.dzy) {
            if (bundle != null) {
                stringExtra = bundle.getString("single_process_listener_key");
            } else {
                stringExtra = getIntent() != null ? getIntent().getStringExtra("single_process_listener_key") : null;
            }
            this.f7989qt = stringExtra;
            this.f7960ay = (InterfaceC3498lr) C3197dw.m13337ri().m13351ri(this.f7989qt, InterfaceC3498lr.class);
        } else {
            this.f7960ay = C3197dw.m13337ri().m13343ka();
        }
        C3197dw.m13337ri().m13339fi();
        m10537ri(getIntent());
        m10538ri(bundle);
        wjv wjvVar = this.wjv;
        if (wjvVar == null) {
            finish();
            return false;
        }
        this.hcw = wjvVar.m14388eb();
        this.wjv.m14489ri(this.f7963di);
        this.f7977uq = this.wjv.m14545ur();
        C3578lr.m16536ri(this.wjv);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: mj */
    public void m10512mj() {
        C2707ac.m10205ri("TTAppOpenAdActivity", "invoke callback onAdDismiss, ".concat(String.valueOf(this)));
        InterfaceC3498lr interfaceC3498lr = this.f7960ay;
        if (interfaceC3498lr != null) {
            interfaceC3498lr.mo11488ik();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: nr */
    public int m10514nr() {
        if (this.wjv.zyu()) {
            return 5;
        }
        if (this.f7964dw) {
            return this.ory.mo11517ka();
        }
        return -1;
    }

    /* JADX INFO: renamed from: qt */
    private void m10516qt() {
        int iMin;
        int iMax;
        new StringBuilder("changeScreenOrientation: mOrientation=").append(this.igq);
        if (Build.VERSION.SDK_INT != 26) {
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    m10524sf();
                } catch (Throwable th) {
                    C2707ac.m10196ik("TTAppOpenAdActivity", th.getMessage());
                    return;
                }
            } else {
                m10524sf();
            }
        }
        Pair<Integer, Integer> pairM16627sf = C3583qd.m16627sf(getApplicationContext());
        if (this.igq == 2) {
            iMin = Math.max(((Integer) pairM16627sf.first).intValue(), ((Integer) pairM16627sf.second).intValue());
            iMax = Math.min(((Integer) pairM16627sf.first).intValue(), ((Integer) pairM16627sf.second).intValue());
        } else {
            iMin = Math.min(((Integer) pairM16627sf.first).intValue(), ((Integer) pairM16627sf.second).intValue());
            iMax = Math.max(((Integer) pairM16627sf.first).intValue(), ((Integer) pairM16627sf.second).intValue());
        }
        this.tan = iMax;
        this.f7958ac = iMin;
        float fM16601ri = C3583qd.m16601ri();
        if (C3583qd.m16584ik((Activity) this)) {
            int i = this.igq;
            if (i == 1) {
                this.tan -= fM16601ri;
            } else if (i == 2) {
                this.f7958ac -= fM16601ri;
            }
        }
        C2965ik c2965ik = this.ory;
        if (c2965ik != null) {
            c2965ik.m11521ri(this.f7958ac, this.tan);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public JSONObject m10522ri(JSONObject jSONObject) {
        if (m10514nr() == 0) {
            return this.ory.mo11519ri(jSONObject);
        }
        return null;
    }

    /* JADX INFO: renamed from: sf */
    private void m10524sf() {
        if (this.igq != 2) {
            setRequestedOrientation(1);
        } else if (m10532di()) {
            setRequestedOrientation(8);
        } else {
            setRequestedOrientation(0);
        }
        if (this.igq == 2 || !C3583qd.m16584ik((Activity) this)) {
            getWindow().addFlags(1024);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void slm() {
        this.f7978vr.show(TTAdDislikeToast.getDislikeSendTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tan() {
        if (this.slm.get()) {
            return;
        }
        try {
            getWindow().getDecorView().post(this.f7967ig);
        } catch (Throwable unused) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: uq */
    public void m10528uq() {
        C2979ik c2979ikXha;
        InterfaceC3498lr interfaceC3498lr = this.f7960ay;
        if (interfaceC3498lr != null) {
            interfaceC3498lr.onAdClicked();
        }
        if (C3322sf.m14819lr().m14832ay(String.valueOf(this.f7977uq))) {
            this.f7966fr.set(true);
        }
        C2965ik c2965ik = this.ory;
        if (c2965ik == null || (c2979ikXha = c2965ik.xha()) == null) {
            return;
        }
        c2979ikXha.slm();
    }

    /* JADX INFO: renamed from: vr */
    private void m10530vr() {
        this.f7978vr.show(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wjv() {
        InterfaceC3498lr interfaceC3498lr = this.f7960ay;
        if (interfaceC3498lr != null) {
            interfaceC3498lr.mo11489lr();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xha() {
        Log.d("TTAppOpenAdActivity", "startCountDownTimer() called");
        wjv wjvVar = this.wjv;
        int iM14887uq = (wjvVar == null || wjvVar.m14436lr() < 0) ? C3299nr.m14639ka().m14887uq(String.valueOf(this.f7977uq)) : this.wjv.m14436lr();
        this.f7959aw.m11484ri(this.f7962co.m11608lr());
        this.f7959aw.m11482lr(iM14887uq);
    }

    /* JADX INFO: renamed from: di */
    protected boolean m10532di() {
        try {
            return getIntent().getIntExtra("orientation_angle", 0) == 3;
        } catch (Exception e) {
            C2707ac.m10196ik("TTAppOpenAdActivity", e.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: fi */
    void m10533fi() {
        if (this.ihz) {
            C2965ik c2965ik = this.ory;
            if (c2965ik != null && c2965ik.xha() != null && this.ory.xha().m11589fi()) {
                this.ory.xha().m11593mj();
            }
            bgr();
        }
        C2959lr c2959lr = this.f7959aw;
        if (c2959lr != null) {
            c2959lr.m11480ka();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: ik */
    protected void m10534ik() {
        if (isFinishing()) {
            return;
        }
        if (this.f7969ka.get()) {
            m10530vr();
            return;
        }
        if (this.bgr == null) {
            try {
                m10500co();
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "TTAppOpenAdActivity", th);
            }
        }
        C2931bu c2931bu = this.bgr;
        if (c2931bu != null) {
            c2931bu.m11274ri();
        }
    }

    /* JADX INFO: renamed from: ka */
    void m10535ka() {
        if (this.f7968ik.get()) {
            return;
        }
        if (this.ihz) {
            C2965ik c2965ik = this.ory;
            if (c2965ik != null && c2965ik.xha() != null && this.ory.xha().m11588di()) {
                this.ory.xha().m11602sf();
            }
            m10494aw();
        }
        C2959lr c2959lr = this.f7959aw;
        if (c2959lr != null) {
            c2959lr.m11479ik();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    /* JADX INFO: renamed from: lr */
    protected void mo10489lr() {
        m10499bu();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C3583qd.m16608ri((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.6
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (TTAppOpenAdActivity.this.isFinishing()) {
                            return;
                        }
                        TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.6.1
                            @Override // java.lang.Runnable
                            public void run() {
                                C3583qd.m16608ri((Activity) TTAppOpenAdActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e) {
                        C2707ac.m10196ik("TTAppOpenAdActivity", e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        m10499bu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        wjv wjvVar;
        super.onCreate(bundle);
        C3299nr.m14641lr(getApplicationContext());
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("enable_new_arch", false);
        } else if (getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false)) {
            z = true;
        }
        this.dzy = z;
        C2707ac.m10205ri("BVA", "onCreate: isEnableNewArch = " + this.dzy);
        if (!m10510lr(bundle)) {
            finish();
            return;
        }
        if (!C3332vr.m14975fi()) {
            finish();
            return;
        }
        if (bundle != null) {
            C3414ik.m15525lr(this.wjv, "open_ad", (JSONObject) null, (JSONObject) null);
        }
        this.ihz = wjv.m14332fi(this.wjv);
        new StringBuilder("onCreate: isVideo is ").append(this.ihz);
        if (!this.ihz || (wjvVar = this.wjv) == null) {
            this.f7962co.m11611ri(C3299nr.m14639ka().wjv(String.valueOf(this.f7977uq)));
        } else {
            this.f7962co.m11611ri((float) wjvVar.m14389eu().m6339di());
        }
        C2959lr c2959lr = new C2959lr(this.f7962co);
        this.f7959aw = c2959lr;
        c2959lr.m11487ri(this.f7974pv);
        jbs();
        FrameLayout frameLayout = new FrameLayout(this);
        this.f7980zf = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        try {
            setContentView(this.f7980zf);
            this.f7980zf.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (TTAppOpenAdActivity.this.wjv == null) {
                            TTAppOpenAdActivity.this.finish();
                            return;
                        }
                        int iHpn = TTAppOpenAdActivity.this.wjv.hpn();
                        boolean z2 = false;
                        if (C3087ri.m12365sf()) {
                            TTAppOpenAdActivity.this.f7964dw = iHpn != 1;
                            TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
                            TTAppOpenAdActivity tTAppOpenAdActivity2 = TTAppOpenAdActivity.this;
                            tTAppOpenAdActivity.ory = new C2977lr(tTAppOpenAdActivity2, tTAppOpenAdActivity2.wjv, TTAppOpenAdActivity.this.f7980zf, TTAppOpenAdActivity.this.f7974pv, TTAppOpenAdActivity.this.igq, TTAppOpenAdActivity.this.ihz, TTAppOpenAdActivity.this.f7962co, TTAppOpenAdActivity.this.f7959aw);
                            if (!TTAppOpenAdActivity.this.f7964dw || !TTAppOpenAdActivity.this.m10492ac()) {
                                TTAppOpenAdActivity.this.wjv.m14459nr(1);
                                TTAppOpenAdActivity.this.wjv.tan(1);
                            }
                        } else {
                            TTAppOpenAdActivity tTAppOpenAdActivity3 = TTAppOpenAdActivity.this;
                            if (tTAppOpenAdActivity3.wjv.ajz() == 2 && iHpn != 1) {
                                z2 = true;
                            }
                            tTAppOpenAdActivity3.f7964dw = z2;
                            if (TTAppOpenAdActivity.this.f7964dw && TTAppOpenAdActivity.this.m10492ac()) {
                                TTAppOpenAdActivity tTAppOpenAdActivity4 = TTAppOpenAdActivity.this;
                                TTAppOpenAdActivity tTAppOpenAdActivity5 = TTAppOpenAdActivity.this;
                                tTAppOpenAdActivity4.ory = new C2977lr(tTAppOpenAdActivity5, tTAppOpenAdActivity5.wjv, TTAppOpenAdActivity.this.f7980zf, TTAppOpenAdActivity.this.f7974pv, TTAppOpenAdActivity.this.igq, TTAppOpenAdActivity.this.ihz, TTAppOpenAdActivity.this.f7962co, TTAppOpenAdActivity.this.f7959aw);
                            } else {
                                TTAppOpenAdActivity tTAppOpenAdActivity6 = TTAppOpenAdActivity.this;
                                TTAppOpenAdActivity tTAppOpenAdActivity7 = TTAppOpenAdActivity.this;
                                tTAppOpenAdActivity6.ory = new C2965ik(tTAppOpenAdActivity7, tTAppOpenAdActivity7.wjv, TTAppOpenAdActivity.this.f7980zf, TTAppOpenAdActivity.this.f7974pv, TTAppOpenAdActivity.this.igq, TTAppOpenAdActivity.this.ihz, TTAppOpenAdActivity.this.f7962co);
                                TTAppOpenAdActivity.this.ory.m11521ri(TTAppOpenAdActivity.this.f7958ac, TTAppOpenAdActivity.this.tan);
                            }
                        }
                        TTAppOpenAdActivity.this.ory.mo11524ri((ViewGroup) TTAppOpenAdActivity.this.f7980zf);
                        TTAppOpenAdActivity.this.ory.mo11520ri();
                        TTAppOpenAdActivity.this.ory.mo11518lr();
                    } catch (Throwable th) {
                        TTAppOpenAdActivity.this.finish();
                        C2707ac.m10196ik("TTAppOpenAdActivity", th.getMessage());
                    }
                }
            });
            try {
                final View decorView = getWindow().getDecorView();
                if (Build.VERSION.SDK_INT >= 35) {
                    this.f7971mj = true;
                    decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.3
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                            List boundingRects;
                            try {
                                DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                                if (displayCutout != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
                                    decorView.setPadding(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                                }
                            } catch (Throwable unused) {
                            }
                            return windowInsets;
                        }
                    });
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            C3521ka.m15939lr();
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        AdSlot adSlot;
        super.onDestroy();
        if (this.wjv != null) {
            C3366lr.m15165ri().m15173ri("videoForceBreak", this.wjv);
        }
        this.f7970lr.removeCallbacksAndMessages(null);
        C2959lr c2959lr = this.f7959aw;
        if (c2959lr != null) {
            c2959lr.m11478fi();
        }
        C2889fi.m11113ri(this.wjv);
        C2897ik.m11144lr(this.wjv);
        if (this.ihz) {
            C2976ri.m11570ri(this.wjv, this.f7962co.m11607ka(), this.f7962co.m11608lr(), true);
        } else {
            C2976ri.m11570ri(this.wjv, -1L, this.f7962co.m11608lr(), false);
        }
        if (this.f7961bu.m16568di() && this.slm.get()) {
            C3414ik.m15564ri(String.valueOf(this.f7961bu.m16570ka()), this.wjv, "open_ad", this.f7972nr);
            this.f7961bu = C3582pv.m16566ik();
        }
        C2965ik c2965ik = this.ory;
        if (c2965ik != null) {
            c2965ik.mo11516ik();
        }
        m10512mj();
        f7957sf = null;
        if (this.dzy && !TextUtils.isEmpty(this.f7989qt)) {
            C3197dw.m13337ri().m13357ri(this.f7989qt, isFinishing(), isChangingConfigurations());
        }
        this.f7960ay = null;
        C2931bu c2931bu = this.bgr;
        if (c2931bu != null) {
            c2931bu.setCallback(null);
        }
        wjv wjvVar = this.wjv;
        if (wjvVar == null || wjv.m14331di(wjvVar) || this.wjv.m14367bl() || (adSlot = this.hcw) == null) {
            return;
        }
        adSlot.setCacheScene(1);
        C2958di.m11449ri(C3299nr.m14642ri()).m11463ri(this.hcw);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f7965fi = false;
        m10533fi();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        C2965ik c2965ik;
        super.onResume();
        this.f7965fi = true;
        if (this.f7975ri.getAndSet(true)) {
            if (!this.f7966fr.get()) {
                m10535ka();
                return;
            }
            wjv();
            if (this.ihz && (c2965ik = this.ory) != null && c2965ik.xha() != null) {
                m10506fr();
                this.ory.xha().m11595ri(3);
            }
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            this.xha = this.wjv != null ? C3197dw.m13337ri().m13348ri(this.wjv) : -1;
            if (!TextUtils.isEmpty(this.f7989qt)) {
                bundle.putString("single_process_listener_key", this.f7989qt);
            }
            bundle.putBoolean("enable_new_arch", this.dzy);
            bundle.putInt("meta_index", this.xha);
            bundle.putInt(FirebaseAnalytics.Param.AD_SOURCE, this.f7976su);
            bundle.putLong("start_show_time", this.f7963di);
            bundle.putLong("cache_time", this.f7979xd);
        } catch (Throwable th) {
            C2707ac.m10196ik("TTAppOpenAdActivity", th.getMessage());
        }
        if (!this.dzy) {
            f7957sf = this.f7960ay;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.xha >= 0) {
            C3197dw.m13337ri().m13341ik(this.xha);
            this.xha = -1;
        }
        C3577ka.m16532ri(this, this.wjv);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            if (!this.f7964dw) {
                this.f7961bu.m16569fi();
            }
            wjv wjvVar = this.wjv;
            if (wjvVar != null && wjvVar.nhl() && !this.wjv.igq()) {
                this.wjv.xha(true);
                wjv wjvVar2 = this.wjv;
                C3414ik.m15548ri(wjvVar2, "open_ad", wjvVar2.wzv());
            }
        } else if (this.slm.get()) {
            if (this.f7961bu.m16568di()) {
                C3414ik.m15564ri(String.valueOf(this.f7961bu.m16570ka()), this.wjv, "open_ad", this.f7972nr);
            }
            this.f7961bu = C3582pv.m16566ik();
        }
        C2889fi.m11114ri(this.wjv, z ? 4 : 8);
        C2897ik.m11147ri(this.wjv, z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.C3119ri.ri
    /* JADX INFO: renamed from: ri */
    public void mo10536ri(int i) {
        if (i == 2 || i == 3 || i == 4) {
            m10506fr();
        }
    }

    /* JADX INFO: renamed from: ri */
    protected void m10537ri(Intent intent) {
        if (intent != null) {
            this.f7976su = intent.getIntExtra(FirebaseAnalytics.Param.AD_SOURCE, 0);
            this.f7979xd = intent.getLongExtra("cache_time", 0L);
            this.f7963di = intent.getLongExtra("start_show_time", 0L);
        }
    }

    /* JADX INFO: renamed from: ri */
    protected void m10538ri(Bundle bundle) {
        if (bundle != null) {
            if (!this.dzy && this.f7960ay == null) {
                this.f7960ay = f7957sf;
                f7957sf = null;
            }
            try {
                int i = bundle.getInt("meta_index", -1);
                this.f7976su = bundle.getInt(FirebaseAnalytics.Param.AD_SOURCE, 0);
                this.f7963di = bundle.getLong("start_show_time", 0L);
                this.f7979xd = bundle.getLong("cache_time", 0L);
                this.wjv = C3197dw.m13337ri().m13350ri(i);
            } catch (Throwable th) {
                C2707ac.m10196ik("TTAppOpenAdActivity", th.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.igq.InterfaceC2719ri
    /* JADX INFO: renamed from: ri */
    public void mo6180ri(Message message) {
        C3283ka c3283kaM14473qc;
        C3097ka c3097kaM14188ri;
        C2965ik c2965ik;
        if (message.what == 100) {
            if (this.ihz && (c2965ik = this.ory) != null && c2965ik.xha() != null) {
                m10506fr();
                this.ory.xha().m11595ri(1);
            }
            wjv wjvVar = this.wjv;
            if (wjvVar != null && (c3283kaM14473qc = wjvVar.m14473qc()) != null && (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) != null) {
                c3097kaM14188ri.m12484ri(EnumC3106ri.GENERAL_LINEAR_AD_ERROR);
            }
            wjv();
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    /* JADX INFO: renamed from: ri */
    protected boolean mo10491ri() {
        return true;
    }
}
