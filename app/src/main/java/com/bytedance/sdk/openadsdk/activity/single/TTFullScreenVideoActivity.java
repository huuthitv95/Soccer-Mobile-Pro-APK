package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1997lr;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.slm;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3020mj;
import com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr;
import com.bytedance.sdk.openadsdk.component.reward.view.C3069ik;
import com.bytedance.sdk.openadsdk.core.C3197dw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3365zf;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.C3283ka;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.C3097ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.widget.InterfaceC3338fi;
import com.bytedance.sdk.openadsdk.p175ay.p176lr.C2889fi;
import com.bytedance.sdk.openadsdk.p230di.C3366lr;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.C3429qt;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3412vr;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p239ri.C3413ri;
import com.bytedance.sdk.openadsdk.p252ri.p254ik.InterfaceC3496lr;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {

    /* JADX INFO: renamed from: bu */
    private static InterfaceC3496lr f8039bu;

    /* JADX INFO: renamed from: nr */
    private boolean f8040nr;
    private InterfaceC3496lr slm;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ig */
    public void m10605ig() {
        toString();
        InterfaceC3496lr interfaceC3496lr = this.slm;
        if (interfaceC3496lr != null) {
            interfaceC3496lr.onAdClicked();
        }
    }

    /* JADX INFO: renamed from: ik */
    private void m10606ik(int i) {
        this.f8002lr.f9394oh.m11872ri(null, String.format(C2729uq.m10311ri(C3299nr.m14642ri(), "tt_skip_ad_time_text"), Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: lr */
    private boolean m10607lr(wjv wjvVar) {
        if (wjvVar == null) {
            return false;
        }
        return C3299nr.m14639ka().m14828ac(String.valueOf(this.f8002lr.f9377di));
    }

    /* JADX INFO: renamed from: ri */
    private boolean m10609ri(wjv wjvVar) {
        return wjvVar == null || wjvVar.m14406gz() == 100.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: ac */
    protected void mo10554ac() {
        C3069ik c3069ikM12263ri;
        super.mo10554ac();
        if (this.f8002lr == null || (c3069ikM12263ri = this.f8002lr.f9374ay.m12263ri()) == null) {
            return;
        }
        c3069ikM12263ri.setJsbLandingPageOpenListener(new InterfaceC3338fi() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.InterfaceC3338fi
            /* JADX INFO: renamed from: ri */
            public void mo10615ri() {
                TTFullScreenVideoActivity.this.m10605ig();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: aw */
    protected void mo10555aw() {
        if (wjv.m14332fi(this.f8002lr.f9389lr) || this.f8002lr.f9385ik) {
            this.f8002lr.f9394oh.m11872ri(null, TTAdDislikeToast.getSkipText());
        } else {
            this.f8002lr.f9394oh.m11872ri(null, "X");
        }
        this.f8002lr.f9394oh.m11859fi(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: ay */
    public boolean mo10556ay() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: di */
    protected void mo10559di() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    public void dzy() {
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.f7997co) {
            return;
        }
        f8039bu = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.f8002lr != null) {
            C3366lr.m15165ri().m15173ri("videoForceBreak", this.f8002lr.f9389lr);
        }
        try {
            xha();
        } catch (Exception unused) {
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: fr */
    public boolean mo10562fr() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    public void gcp() {
        m10605ig();
        this.f8002lr.f9389lr.m14483qx();
        this.f8002lr.f9389lr.m14432ka(true);
        if (wjv.m14332fi(this.f8002lr.f9389lr)) {
            C3414ik.m15521lr(this.f8002lr.f9389lr, this.f8002lr.f9381fi, this.f8002lr.f9389lr.m14408hp());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout hcw() {
        return this.f8002lr.dzy.mo12215di();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected slm jbs() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: ka */
    protected void mo10564ka() {
        toString();
        InterfaceC3496lr interfaceC3496lr = this.slm;
        if (interfaceC3496lr != null) {
            interfaceC3496lr.mo11530lr();
        } else {
            C3429qt.m15619ri(this.f8002lr != null ? this.f8002lr.f9389lr : null, "close", 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: lr */
    public void mo10610lr(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: lr */
    public void mo10611lr(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: nr */
    protected void mo10568nr() {
        InterfaceC3496lr interfaceC3496lr = this.slm;
        if (interfaceC3496lr != null) {
            interfaceC3496lr.mo11531ri();
        } else {
            C3429qt.m15619ri(this.f8002lr != null ? this.f8002lr.f9389lr : null, "show", 0);
        }
        if (mo10582su()) {
            this.f8002lr.f9374ay.m12253aw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f8002lr == null || wjv.m14332fi(this.f8002lr.f9389lr)) {
            return;
        }
        C1997lr c1997lrM14389eu = this.f8002lr.f9389lr.m14389eu();
        if (c1997lrM14389eu == null) {
            C1997lr c1997lr = new C1997lr();
            c1997lr.m6360ri(10.0d);
            this.f8002lr.f9389lr.m14490ri(c1997lr);
        } else if (c1997lrM14389eu.m6339di() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            c1997lrM14389eu.m6360ri(10.0d);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        xha();
        m10578ri(isFinishing(), isChangingConfigurations());
        if (this.f7997co) {
            return;
        }
        this.slm = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.f7997co) {
            f8039bu = this.slm;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        if (this.f8002lr == null || !m10607lr(this.f8002lr.f9389lr) || m10609ri(this.f8002lr.f9389lr)) {
            return;
        }
        if (this.f8040nr) {
            this.f8040nr = false;
            finish();
        } else if (this.f8002lr.ory.m12109su()) {
            finish();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m10612ri(int i) {
        int iMhp = this.f8002lr.f9389lr.mhp();
        if (!C3299nr.m14639ka().m14839di(String.valueOf(this.f8002lr.f9377di)) || (!wjv.m14332fi(this.f8002lr.f9389lr) && !this.f8002lr.f9385ik)) {
            if (i >= iMhp) {
                if (!this.f8002lr.f9398qh) {
                    this.f8002lr.m12005ri(true);
                }
                mo10555aw();
                return;
            }
            return;
        }
        if (!this.f8002lr.f9398qh) {
            this.f8002lr.m12005ri(true);
        }
        if (i > iMhp) {
            mo10555aw();
        } else {
            m10606ik(iMhp - i);
            this.f8002lr.f9394oh.m11859fi(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: ri */
    protected void mo10573ri(long j, long j2) {
        m10612ri((int) (j / 1000));
        if (this.f7999fi >= 0) {
            this.f8002lr.f9394oh.m11872ri(String.valueOf(this.f7999fi), null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: ri */
    protected void mo10574ri(Intent intent) {
        super.mo10574ri(intent);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ri */
    public void mo10575ri(Bundle bundle) {
        if (this.f7997co) {
            super.mo10575ri(bundle);
            this.slm = (InterfaceC3496lr) C3197dw.m13337ri().m13351ri(this.f7989qt, InterfaceC3496lr.class);
            return;
        }
        InterfaceC3496lr interfaceC3496lrM13340ik = C3197dw.m13337ri().m13340ik();
        this.slm = interfaceC3496lrM13340ik;
        if (interfaceC3496lrM13340ik != null || bundle == null) {
            return;
        }
        this.slm = f8039bu;
        f8039bu = null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ri */
    public void mo10613ri(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void wjv() {
        final View viewMo12226qt = this.f8002lr.dzy.mo12226qt();
        if (viewMo12226qt != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTFullScreenVideoActivity.this.f8002lr.ory.m12072ac() && TTFullScreenVideoActivity.this.f8002lr.jbs.get()) {
                        boolean zM11820aw = TTFullScreenVideoActivity.this.f8002lr.hcw.m11820aw();
                        TTFullScreenVideoActivity.this.f8002lr.ory.m12078di(zM11820aw);
                        TTFullScreenVideoActivity.this.f8002lr.dzy.mo12216di(8);
                        View view2 = viewMo12226qt;
                        if (view2 instanceof C3193ka) {
                            ((C3193ka) view2).setImageResource(C2729uq.m10305ka(TTFullScreenVideoActivity.this.f8002lr.srn, "tt_close_btn"));
                        }
                        TTFullScreenVideoActivity.this.f8002lr.f9386jc.sendEmptyMessageDelayed(600, 5000L);
                        if (!wjv.m14334ik(TTFullScreenVideoActivity.this.f8002lr.f9389lr)) {
                            return;
                        }
                        if (wjv.m14334ik(TTFullScreenVideoActivity.this.f8002lr.f9389lr) && zM11820aw) {
                            return;
                        }
                    }
                    TTFullScreenVideoActivity.this.f8002lr.ory.ihz();
                    TTFullScreenVideoActivity.this.f8002lr.hcw.m11831sf();
                    TTFullScreenVideoActivity.this.f8002lr.f9402su.m11985di();
                    TTFullScreenVideoActivity.this.finish();
                }
            };
            viewMo12226qt.setOnClickListener(onClickListener);
            viewMo12226qt.setTag(viewMo12226qt.getId(), onClickListener);
        }
        this.f8002lr.f9394oh.m11869ri(new InterfaceC3061lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.3
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ik */
            public void mo10616ik(View view) {
                View view2 = viewMo12226qt;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ka */
            public void mo10617ka(View view) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: lr */
            public void mo10618lr(View view) {
                TTFullScreenVideoActivity.this.f8002lr.f9413zf.m11912ri(TTFullScreenVideoActivity.this.f8000ik);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ri */
            public void mo10619ri(View view) {
                C3283ka c3283kaM14473qc;
                C3097ka c3097kaM14188ri;
                C3069ik c3069ikM12263ri;
                if (C3279dw.m14086di(TTFullScreenVideoActivity.this.f8002lr.f9389lr) || (C3279dw.m14088fi(TTFullScreenVideoActivity.this.f8002lr.f9389lr) && TTFullScreenVideoActivity.this.f8002lr.wjv.m11962ka(C3020mj.f9356lr))) {
                    if (C3279dw.m14093mj(TTFullScreenVideoActivity.this.f8002lr.f9389lr)) {
                        TTFullScreenVideoActivity.this.f8002lr.wjv.jbs();
                        return;
                    }
                    View view2 = viewMo12226qt;
                    if (view2 != null) {
                        view2.performClick();
                        return;
                    } else {
                        TTFullScreenVideoActivity.this.finish();
                        return;
                    }
                }
                if (C3273ac.m13987ri(TTFullScreenVideoActivity.this.f8002lr.f9389lr) && !TTFullScreenVideoActivity.this.f8002lr.f9373aw.get()) {
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                C3412vr.ri riVar = new C3412vr.ri();
                riVar.m15466lr(TTFullScreenVideoActivity.this.f8002lr.ihz.m12122aw());
                riVar.m15463ka(TTFullScreenVideoActivity.this.f8002lr.ihz.m12167su());
                riVar.m15459ik(TTFullScreenVideoActivity.this.f8002lr.ihz.m12124bu());
                riVar.m15458ik(3);
                riVar.m15462ka(TTFullScreenVideoActivity.this.f8002lr.ihz.m12131fr());
                riVar.m15472ri(TTFullScreenVideoActivity.this.f8002lr.ihz.m12139lr());
                C3413ri.m15493ri(TTFullScreenVideoActivity.this.f8002lr.ihz.m12143mj(), riVar, TTFullScreenVideoActivity.this.f8002lr.ihz.m12129fi());
                C3365zf.m15145ik(TTFullScreenVideoActivity.this.f8002lr.f9377di);
                TTFullScreenVideoActivity.this.f8002lr.ihz.m12160ri("skip", false);
                TTFullScreenVideoActivity.this.f8002lr.f9394oh.m11863ka(false);
                if (!TTFullScreenVideoActivity.this.f8002lr.f9385ik || (C3273ac.m13965ik(TTFullScreenVideoActivity.this.f8002lr.f9389lr) && (c3069ikM12263ri = TTFullScreenVideoActivity.this.f8002lr.f9374ay.m12263ri()) != null && c3069ikM12263ri.f9592ka == 0)) {
                    TTFullScreenVideoActivity.this.finish();
                } else {
                    TTFullScreenVideoActivity.this.m10577ri(true, 4);
                }
                if (TTFullScreenVideoActivity.this.f8002lr.f9389lr != null && (c3283kaM14473qc = TTFullScreenVideoActivity.this.f8002lr.f9389lr.m14473qc()) != null && (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) != null) {
                    c3097kaM14188ri.m12467di(TTFullScreenVideoActivity.this.f8002lr.ihz.m12122aw());
                    c3097kaM14188ri.m12469fi(TTFullScreenVideoActivity.this.f8002lr.ihz.m12122aw());
                }
                C2889fi.m11114ri(TTFullScreenVideoActivity.this.f8002lr.f9389lr, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ri */
            public void mo10620ri(View view, String str) {
                C3283ka c3283kaM14473qc;
                C3097ka c3097kaM14188ri;
                TTFullScreenVideoActivity.this.f8002lr.zyn = !TTFullScreenVideoActivity.this.f8002lr.zyn;
                TTFullScreenVideoActivity.this.f8002lr.ihz.m12163ri(TTFullScreenVideoActivity.this.f8002lr.zyn, str);
                if (!C3279dw.slm(TTFullScreenVideoActivity.this.f8002lr.f9389lr) || TTFullScreenVideoActivity.this.f8002lr.jbs.get()) {
                    TTFullScreenVideoActivity.this.f8002lr.ory.m12081fi(TTFullScreenVideoActivity.this.f8002lr.zyn);
                    TTFullScreenVideoActivity.this.f8002lr.wjv.m11964lr(TTFullScreenVideoActivity.this.f8002lr.zyn);
                    if (TTFullScreenVideoActivity.this.f8002lr.f9389lr == null || (c3283kaM14473qc = TTFullScreenVideoActivity.this.f8002lr.f9389lr.m14473qc()) == null || (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) == null) {
                        return;
                    }
                    if (TTFullScreenVideoActivity.this.f8002lr.zyn) {
                        c3097kaM14188ri.m12477mj(TTFullScreenVideoActivity.this.f8002lr.ihz.m12122aw());
                    } else {
                        c3097kaM14188ri.jbs(TTFullScreenVideoActivity.this.f8002lr.ihz.m12122aw());
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: xd */
    public void mo10614xd() {
        if (this.f8002lr.f9389lr.m14406gz() != 100.0f) {
            this.f8040nr = true;
        }
        m10605ig();
    }
}
