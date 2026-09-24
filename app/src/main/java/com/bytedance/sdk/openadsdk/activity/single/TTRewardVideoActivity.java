package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.C2951ri;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.slm;
import com.bytedance.sdk.openadsdk.component.reward.C2986co;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr;
import com.bytedance.sdk.openadsdk.component.reward.view.C3069ik;
import com.bytedance.sdk.openadsdk.core.C3112ay;
import com.bytedance.sdk.openadsdk.core.C3197dw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3365zf;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.C3283ka;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.C3097ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.widget.DialogC3342lr;
import com.bytedance.sdk.openadsdk.core.widget.InterfaceC3338fi;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p233lr.C3369ri;
import com.bytedance.sdk.openadsdk.p175ay.p176lr.C2889fi;
import com.bytedance.sdk.openadsdk.p230di.C3366lr;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.C3429qt;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3412vr;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p239ri.C3413ri;
import com.bytedance.sdk.openadsdk.p252ri.p253fi.InterfaceC3495ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3593su;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.ironsource.C11540L6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TTRewardVideoActivity extends TTBaseVideoActivity {

    /* JADX INFO: renamed from: ac */
    private static String f8143ac;
    private static String ihz;

    /* JADX INFO: renamed from: su */
    private static InterfaceC3495ri f8144su;
    private static String tan;

    /* JADX INFO: renamed from: uq */
    private static String f8145uq;
    private static String wjv;

    /* JADX INFO: renamed from: ay */
    private String f8146ay;

    /* JADX INFO: renamed from: bu */
    protected int f8147bu;

    /* JADX INFO: renamed from: fr */
    private String f8148fr;

    /* JADX INFO: renamed from: nr */
    protected InterfaceC3495ri f8149nr;
    protected int slm;
    private final AtomicBoolean igq = new AtomicBoolean(false);

    /* JADX INFO: renamed from: zf */
    private int f8150zf = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public void m10683ik(final boolean z, boolean z2) {
        if (this.f8002lr == null || this.f8002lr.f9389lr == null) {
            return;
        }
        if (!z2 && this.f8002lr.f9389lr.slm() && this.f8002lr.jbs.get() && C3279dw.m14093mj(this.f8002lr.f9389lr)) {
            this.f8002lr.wjv.jbs();
            return;
        }
        if (!C3299nr.m14639ka().m14861mj(String.valueOf(this.f8002lr.f9377di))) {
            if (!z2 && this.f8002lr.jbs.get() && C3279dw.m14093mj(this.f8002lr.f9389lr)) {
                this.f8002lr.wjv.jbs();
                return;
            } else if (z) {
                finish();
                return;
            } else {
                m10686qd();
                return;
            }
        }
        if (this.f8002lr != null && this.f8002lr.f9389lr != null && this.f8002lr.f9389lr.m14423jc()) {
            if (this.f8002lr.jbs.get() && C3279dw.m14093mj(this.f8002lr.f9389lr)) {
                this.f8002lr.wjv.jbs();
                return;
            } else if (z) {
                finish();
                return;
            } else {
                m10686qd();
                return;
            }
        }
        if (C3279dw.m14093mj(this.f8002lr.f9389lr) && this.f8002lr.ory.m12091mj().getVisibility() == 0) {
            this.f8002lr.wjv.jbs();
            return;
        }
        this.f8002lr.f9375bu.set(true);
        this.f8002lr.ihz.m12168uq();
        if (z) {
            this.f8002lr.wjv.m11957di();
        }
        final DialogC3342lr dialogC3342lr = new DialogC3342lr(this);
        this.f8000ik.f9195co = dialogC3342lr;
        if (z) {
            this.f8000ik.f9195co.m15019ri(f8143ac).m15017lr(wjv).m15016ik(ihz);
        } else {
            this.f8000ik.f9195co.m15019ri(tan).m15017lr(f8145uq).m15016ik(ihz);
        }
        this.f8000ik.f9195co.m15018ri(new DialogC3342lr.lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.DialogC3342lr.lr
            /* JADX INFO: renamed from: lr */
            public void mo10702lr() {
                dialogC3342lr.dismiss();
                TTRewardVideoActivity.this.m10691fi(true);
                TTRewardVideoActivity.this.f8002lr.f9375bu.set(false);
                TTRewardVideoActivity.this.f8002lr.wjv.m11963lr(Integer.MAX_VALUE);
                if (!z || !C3279dw.m14086di(TTRewardVideoActivity.this.f8002lr.f9389lr)) {
                    TTRewardVideoActivity.this.m10686qd();
                } else if (C3279dw.m14093mj(TTRewardVideoActivity.this.f8002lr.f9389lr)) {
                    TTRewardVideoActivity.this.f8002lr.wjv.jbs();
                } else {
                    TTRewardVideoActivity.this.f8002lr.f9402su.m11985di();
                    TTRewardVideoActivity.this.finish();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.DialogC3342lr.lr
            /* JADX INFO: renamed from: ri */
            public void mo10703ri() {
                TTRewardVideoActivity.this.f8002lr.ihz.ihz();
                if (z) {
                    TTRewardVideoActivity.this.f8002lr.wjv.m11969ri(1000);
                }
                dialogC3342lr.dismiss();
                TTRewardVideoActivity.this.f8002lr.f9375bu.set(false);
            }
        }).show();
    }

    /* JADX INFO: renamed from: jc */
    private JSONObject m10684jc() {
        JSONObject jSONObject = new JSONObject();
        int iIgq = (int) this.f8002lr.ihz.igq();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, this.f8002lr.f9389lr.saa());
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.f8002lr.f9389lr.m14466pc());
            jSONObject.put("network", C2724nr.m10255ik(getApplicationContext()));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int iM14407hd = this.f8002lr.f9389lr.m14407hd();
            String strM16449ka = "unKnow";
            if (iM14407hd == 2) {
                strM16449ka = C3571ig.m16457lr();
            } else if (iM14407hd == 1) {
                strM16449ka = C3571ig.m16449ka();
            }
            jSONObject.put("user_agent", strM16449ka);
            JSONObject jSONObjectLjo = this.f8002lr.f9389lr.ljo();
            jSONObjectLjo.put(C11540L6.f24947V0, C3369ri.m15224ri().m15229lr());
            jSONObject.put("extra", jSONObjectLjo);
            jSONObject.put("media_extra", this.f8146ay);
            jSONObject.put("video_duration", this.f8002lr.f9389lr.m14389eu().m6339di());
            jSONObject.put("play_start_ts", this.slm);
            jSONObject.put("play_end_ts", this.f8147bu);
            jSONObject.put("duration", iIgq);
            jSONObject.put("user_id", this.f8148fr);
            jSONObject.put("trans_id", C3593su.m16658ri().replace("-", ""));
            return jSONObject;
        } catch (Throwable th) {
            C2707ac.m10206ri("TTAD.RVA", "", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x00a3  */
    /* JADX INFO: renamed from: qd */
    public void m10686qd() {
        C3097ka c3097kaM14188ri;
        C3069ik c3069ikM12263ri;
        C3412vr.ri riVar = new C3412vr.ri();
        riVar.m15466lr(this.f8002lr.ihz.m12122aw());
        riVar.m15463ka(this.f8002lr.ihz.m12167su());
        riVar.m15459ik(this.f8002lr.ihz.m12124bu());
        riVar.m15458ik(3);
        riVar.m15462ka(this.f8002lr.ihz.m12131fr());
        riVar.m15472ri(this.f8002lr.ihz.m12139lr());
        C3413ri.m15493ri(this.f8002lr.ihz.m12143mj(), riVar, this.f8002lr.ihz.m12129fi());
        C3365zf.m15145ik(this.f8002lr.f9377di);
        this.f8002lr.ihz.m12160ri("skip", false);
        if (this.f8002lr.f9385ik) {
            if (C3273ac.m13965ik(this.f8002lr.f9389lr) && (c3069ikM12263ri = this.f8002lr.f9374ay.m12263ri()) != null && c3069ikM12263ri.f9592ka == 0) {
                finish();
            } else {
                m10577ri(true, 4);
            }
            if (C3273ac.m13987ri(this.f8002lr.f9389lr) && !this.f8002lr.f9373aw.get()) {
                finish();
            }
        } else {
            finish();
        }
        C3283ka c3283kaM14473qc = this.f8002lr.f9389lr.m14473qc();
        if (c3283kaM14473qc != null && (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) != null) {
            long jM12122aw = this.f8002lr.ihz.m12122aw();
            c3097kaM14188ri.m12467di(jM12122aw);
            c3097kaM14188ri.m12469fi(jM12122aw);
        }
        C2889fi.m11114ri(this.f8002lr.f9389lr, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m10690ri(final boolean z, final int i, final String str, final int i2, final String str2, final int i3) {
        toString();
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.7
            @Override // java.lang.Runnable
            public void run() {
                if (TTRewardVideoActivity.this.f8149nr != null) {
                    TTRewardVideoActivity.this.f8149nr.mo12182ri(z, i, str, i2, str2);
                    C2986co.m11648ri(TTRewardVideoActivity.this.f8002lr.f9389lr, z, i3);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void srn() {
        toString();
        InterfaceC3495ri interfaceC3495ri = this.f8149nr;
        if (interfaceC3495ri != null) {
            interfaceC3495ri.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: ac */
    protected void mo10554ac() {
        C3069ik c3069ikM12263ri;
        super.mo10554ac();
        if (this.f8002lr == null || (c3069ikM12263ri = this.f8002lr.f9374ay.m12263ri()) == null) {
            return;
        }
        c3069ikM12263ri.setJsbLandingPageOpenListener(new InterfaceC3338fi() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.InterfaceC3338fi
            /* JADX INFO: renamed from: ri */
            public void mo10615ri() {
                TTRewardVideoActivity.this.srn();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: aw */
    protected void mo10555aw() {
        this.f8002lr.f9394oh.m11872ri(null, TTAdDislikeToast.getSkipText());
        this.f8002lr.f9394oh.m11859fi(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: ay */
    public boolean mo10556ay() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: bu */
    public void mo10557bu() {
        m10692ig();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: di */
    protected void mo10559di() {
        if (this.f8002lr == null || this.f8002lr.f9414zk == null) {
            return;
        }
        this.f8002lr.f9414zk.m11650ka();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: dw */
    protected void mo10560dw() {
        this.f8147bu = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    public void dzy() {
        m10695ri(2);
    }

    /* JADX INFO: renamed from: fi */
    public void m10691fi(boolean z) {
        if (this.f8002lr == null || this.f8002lr.f9389lr == null) {
            return;
        }
        this.f8002lr.f9389lr.m14420ik(z);
        C2986co.m11648ri(this.f8002lr.f9389lr, false, 3);
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.f7997co) {
            return;
        }
        f8144su = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.f8002lr != null) {
            C3366lr.m15165ri().m15173ri("videoForceBreak", this.f8002lr.f9389lr);
        }
        xha();
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: fr */
    public boolean mo10562fr() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    public void gcp() {
        srn();
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

    /* JADX INFO: renamed from: ig */
    protected void m10692ig() {
        m10695ri(0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: ik */
    protected void mo10563ik() {
        super.mo10563ik();
        if (this.f8002lr == null || this.f8002lr.f9389lr == null) {
            return;
        }
        final wjv wjvVar = this.f8002lr.f9389lr;
        if (wjvVar.m14423jc()) {
            return;
        }
        this.f8002lr.f9414zk = new C2986co(new C2986co.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.C2986co.ri
            /* JADX INFO: renamed from: ri */
            public void mo10696ri(int i) {
                if (wjvVar.m14423jc() || wjvVar.slm()) {
                    return;
                }
                TTRewardVideoActivity.this.m10695ri(i);
            }
        });
    }

    /* JADX INFO: renamed from: ik */
    public void m10693ik(long j, long j2) {
        boolean z = false;
        if (this.f8002lr != null) {
            if (this.f8002lr.f9389lr.m14572zk() >= 0 && this.f8002lr.f9389lr.jva() >= 0) {
                z = true;
            }
            if (z) {
                j2 = this.f8002lr.f9389lr.jva();
            }
        }
        long j3 = j + (((long) this.f8002lr.f9380fe) * 1000);
        if (z) {
            m10694lr(j3, j2);
            return;
        }
        if (this.f8150zf == -1) {
            this.f8150zf = C3299nr.m14639ka().m14883su(String.valueOf(this.f8002lr.f9377di)).f11586di;
        }
        if (j2 <= 0) {
            return;
        }
        if (j2 >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS && j3 >= 27000) {
            m10692ig();
        } else if ((j3 * 100) / j2 >= this.f8150zf) {
            m10692ig();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected slm jbs() {
        return new slm(this.f8002lr) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.2
            @Override // com.bytedance.sdk.openadsdk.common.slm
            /* JADX INFO: renamed from: ik */
            protected void mo10697ik() {
                TTRewardVideoActivity.this.finish();
            }

            @Override // com.bytedance.sdk.openadsdk.common.slm
            /* JADX INFO: renamed from: lr */
            protected boolean mo10698lr() {
                return (this.xha == null || this.xha.f9389lr == null || !this.xha.f9389lr.m14423jc()) ? false : true;
            }

            @Override // com.bytedance.sdk.openadsdk.common.slm
            /* JADX INFO: renamed from: ri */
            protected void mo10699ri(C3022ri c3022ri) {
                C2951ri.m11408ri(c3022ri, new C2951ri.lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.2.1
                    @Override // com.bytedance.sdk.openadsdk.common.C2951ri.lr
                    /* JADX INFO: renamed from: ri */
                    public void mo10587ri() {
                        TTRewardVideoActivity.this.finish();
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.C2951ri.lr
                    /* JADX INFO: renamed from: ri */
                    public void mo10588ri(boolean z, int i) {
                        TTRewardVideoActivity.this.m10577ri(z, i);
                    }
                });
            }

            @Override // com.bytedance.sdk.openadsdk.common.slm
            /* JADX INFO: renamed from: ri */
            protected void mo10700ri(boolean z) {
                TTRewardVideoActivity.this.m10691fi(z);
            }

            @Override // com.bytedance.sdk.openadsdk.common.slm
            /* JADX INFO: renamed from: ri */
            protected boolean mo10701ri() {
                return (this.xha == null || this.xha.f9389lr == null || !this.xha.f9389lr.slm()) ? false : true;
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: ka */
    protected void mo10564ka() {
        InterfaceC3495ri interfaceC3495ri = this.f8149nr;
        if (interfaceC3495ri != null) {
            interfaceC3495ri.mo12180lr();
        } else {
            C3429qt.m15619ri(this.f8002lr != null ? this.f8002lr.f9389lr : null, "close", 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: lr */
    public void mo10610lr(int i) {
        if (i == 10000) {
            m10692ig();
        }
    }

    /* JADX INFO: renamed from: lr */
    protected void m10694lr(long j, long j2) {
        if (j2 <= 0) {
            return;
        }
        if (this.f8150zf == -1) {
            this.f8150zf = Math.min(100, this.f8002lr.f9389lr.m14572zk());
        }
        if (((j / 1000.0f) / j2) * 100.0f >= this.f8150zf) {
            m10692ig();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: lr */
    public void mo10611lr(boolean z) {
        if (z) {
            m10692ig();
            return;
        }
        if ((1.0d - (((double) this.f7999fi) / this.f8002lr.ihz.m12147qd())) * 100.0d >= C3299nr.m14639ka().m14883su(String.valueOf(this.f8002lr.f9377di)).f11586di) {
            m10692ig();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: lr */
    protected void mo10566lr(boolean z, boolean z2) {
        this.slm = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: nr */
    protected void mo10568nr() {
        InterfaceC3495ri interfaceC3495ri = this.f8149nr;
        if (interfaceC3495ri != null) {
            interfaceC3495ri.mo12181ri();
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
        try {
            if (tan == null) {
                tan = C2729uq.m10311ri(this, "tt_reward_msg");
                f8143ac = C2729uq.m10311ri(this, "tt_msgPlayable");
                ihz = C2729uq.m10311ri(this, "tt_negtiveBtnBtnText");
                f8145uq = C2729uq.m10311ri(this, "tt_postiveBtnText");
                wjv = C2729uq.m10311ri(this, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            C2707ac.m10196ik("TTAD.RVA", th.getMessage());
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
        this.f8149nr = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.f8002lr == null || this.f8002lr.f9414zk == null) {
            return;
        }
        this.f8002lr.f9414zk.m11652ri();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.f8002lr == null || this.f8002lr.f9414zk == null) {
            return;
        }
        this.f8002lr.f9414zk.m11651lr();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.f7997co) {
            f8144su = this.f8149nr;
        }
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: renamed from: ri */
    protected void m10695ri(final int i) {
        if (this.f8002lr == null || this.f8002lr.f9389lr == null || this.f8002lr.f9389lr.m14423jc() || this.f8002lr.f9389lr.slm()) {
            return;
        }
        this.f8002lr.f9389lr.jbs(true);
        if (this.f8002lr.f9414zk != null) {
            this.f8002lr.f9414zk.m11649ik();
        }
        if (C3299nr.m14639ka().slm(String.valueOf(this.f8002lr.f9377di))) {
            m10690ri(true, this.f8002lr.f9389lr.m14466pc(), this.f8002lr.f9389lr.saa(), 0, "", i);
        } else {
            C3299nr.m14638ik().mo12642ri(m10684jc(), new com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3357lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.8
                @Override // com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3357lr
                /* JADX INFO: renamed from: ri */
                public void mo10704ri(int i2, String str) {
                    TTRewardVideoActivity.this.m10690ri(false, 0, "", i2, str, i);
                }

                @Override // com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3357lr
                /* JADX INFO: renamed from: ri */
                public void mo10705ri(C3112ay.lr lrVar) {
                    boolean z = lrVar.f9937lr;
                    TTRewardVideoActivity.this.m10690ri(lrVar.f9937lr, lrVar.f9936ik.m14606ri(), lrVar.f9936ik.m14604lr(), 0, "", i);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: ri */
    protected void mo10573ri(long j, long j2) {
        int i = (int) (j / 1000);
        int iPlm = this.f8002lr.f9389lr.plm();
        boolean z = iPlm >= 0;
        m10693ik(j, j2);
        if (this.f7999fi > 0) {
            this.f8002lr.f9394oh.m11863ka(true);
            if (!z || i < iPlm) {
                this.f8002lr.f9394oh.m11872ri(String.valueOf(this.f7999fi), null);
                return;
            }
            this.f8002lr.m12005ri(true);
            this.f8002lr.f9394oh.m11872ri(String.valueOf(this.f7999fi), TTAdDislikeToast.getSkipText());
            this.f8002lr.f9394oh.m11859fi(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: ri */
    protected void mo10574ri(Intent intent) {
        super.mo10574ri(intent);
        this.f8146ay = intent.getStringExtra("media_extra");
        this.f8148fr = intent.getStringExtra("user_id");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ri */
    public void mo10575ri(Bundle bundle) {
        if (this.f7997co) {
            super.mo10575ri(bundle);
            this.f8149nr = (InterfaceC3495ri) C3197dw.m13337ri().m13351ri(this.f7989qt, InterfaceC3495ri.class);
        } else {
            InterfaceC3495ri interfaceC3495riM13345lr = C3197dw.m13337ri().m13345lr();
            this.f8149nr = interfaceC3495riM13345lr;
            if (interfaceC3495riM13345lr == null && bundle != null) {
                this.f8149nr = f8144su;
                f8144su = null;
            }
        }
        Log.e("TTAD.RVA", "initListener: listenerKey = " + this.f7989qt + ",mRewardAdInteractionListener = " + this.f8149nr + ",savedInstanceState = " + bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ri */
    public void mo10613ri(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void wjv() {
        final View viewMo12226qt = this.f8002lr.dzy.mo12226qt();
        if (viewMo12226qt != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTRewardVideoActivity.this.f8002lr.ory.m12072ac() && TTRewardVideoActivity.this.f8002lr.jbs.get()) {
                        boolean zM11820aw = TTRewardVideoActivity.this.f8002lr.hcw.m11820aw();
                        TTRewardVideoActivity.this.f8002lr.ory.m12078di(zM11820aw);
                        TTRewardVideoActivity.this.f8002lr.dzy.mo12216di(8);
                        View view2 = viewMo12226qt;
                        if (view2 instanceof C3193ka) {
                            ((C3193ka) view2).setImageResource(C2729uq.m10305ka(TTRewardVideoActivity.this.f8002lr.srn, "tt_close_btn"));
                        }
                        TTRewardVideoActivity.this.f8002lr.f9386jc.sendEmptyMessageDelayed(600, 5000L);
                        if (!wjv.m14334ik(TTRewardVideoActivity.this.f8002lr.f9389lr)) {
                            return;
                        }
                        if (wjv.m14334ik(TTRewardVideoActivity.this.f8002lr.f9389lr) && zM11820aw) {
                            return;
                        }
                    }
                    TTRewardVideoActivity.this.f8002lr.ory.ihz();
                    TTRewardVideoActivity.this.f8002lr.hcw.m11831sf();
                    TTRewardVideoActivity.this.f8002lr.f9402su.m11985di();
                    if (C3279dw.m14091ka(TTRewardVideoActivity.this.f8002lr.f9389lr)) {
                        TTRewardVideoActivity.this.m10683ik(true, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            };
            viewMo12226qt.setOnClickListener(onClickListener);
            viewMo12226qt.setTag(viewMo12226qt.getId(), onClickListener);
        }
        this.f8002lr.f9394oh.m11869ri(new InterfaceC3061lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.5
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
                TTRewardVideoActivity.this.f8002lr.f9413zf.m11912ri(TTRewardVideoActivity.this.f8000ik);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ri */
            public void mo10619ri(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.m10683ik(C3279dw.m14090ik(tTRewardVideoActivity.f8002lr.f9389lr), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ri */
            public void mo10620ri(View view, String str) {
                C3283ka c3283kaM14473qc;
                C3097ka c3097kaM14188ri;
                TTRewardVideoActivity.this.f8002lr.zyn = !TTRewardVideoActivity.this.f8002lr.zyn;
                StringBuilder sb = new StringBuilder("will set is Mute ");
                sb.append(TTRewardVideoActivity.this.f8002lr.zyn);
                sb.append(" mLastVolume=");
                sb.append(TTRewardVideoActivity.this.f8002lr.f9378dw.m11090ri());
                TTRewardVideoActivity.this.f8002lr.ihz.m12163ri(TTRewardVideoActivity.this.f8002lr.zyn, str);
                if (!C3279dw.slm(TTRewardVideoActivity.this.f8002lr.f9389lr) || TTRewardVideoActivity.this.f8002lr.jbs.get()) {
                    TTRewardVideoActivity.this.f8002lr.ory.m12081fi(TTRewardVideoActivity.this.f8002lr.zyn);
                    TTRewardVideoActivity.this.f8002lr.wjv.m11964lr(TTRewardVideoActivity.this.f8002lr.zyn);
                    if (TTRewardVideoActivity.this.f8002lr.f9389lr == null || (c3283kaM14473qc = TTRewardVideoActivity.this.f8002lr.f9389lr.m14473qc()) == null || (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) == null) {
                        return;
                    }
                    if (TTRewardVideoActivity.this.f8002lr.zyn) {
                        c3097kaM14188ri.m12477mj(TTRewardVideoActivity.this.f8002lr.ihz.m12122aw());
                    } else {
                        c3097kaM14188ri.jbs(TTRewardVideoActivity.this.f8002lr.ihz.m12122aw());
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: xd */
    public void mo10614xd() {
        srn();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: zf */
    protected void mo10586zf() {
        m10692ig();
    }
}
