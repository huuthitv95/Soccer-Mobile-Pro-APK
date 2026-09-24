package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.AbstractC1993lr;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.common.C2951ri;
import com.bytedance.sdk.openadsdk.common.bgr;
import com.bytedance.sdk.openadsdk.common.slm;
import com.bytedance.sdk.openadsdk.component.reward.C2986co;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.component.reward.view.C3072mj;
import com.bytedance.sdk.openadsdk.core.C3112ay;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.bgr.p195fi.C3113ri;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr;
import com.bytedance.sdk.openadsdk.core.bgr.p199ri.C3126lr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.widget.C3344nr;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p233lr.C3369ri;
import com.bytedance.sdk.openadsdk.p230di.C3366lr;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.C3429qt;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3593su;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.ironsource.C11540L6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.mj */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2859mj implements InterfaceC3118lr {

    /* JADX INFO: renamed from: aw */
    public boolean f8465aw;
    public String bgr;

    /* JADX INFO: renamed from: bu */
    public boolean f8466bu;

    /* JADX INFO: renamed from: co */
    public boolean f8467co;

    /* JADX INFO: renamed from: di */
    protected wjv f8468di;

    /* JADX INFO: renamed from: ik */
    private C3344nr f8469ik;
    protected C3022ri jbs;

    /* JADX INFO: renamed from: lr */
    private boolean f8470lr;

    /* JADX INFO: renamed from: nr */
    protected boolean f8472nr;

    /* JADX INFO: renamed from: qt */
    public int f8473qt;

    /* JADX INFO: renamed from: ri */
    private boolean f8474ri;

    /* JADX INFO: renamed from: sf */
    public int f8475sf;
    protected slm tan;

    /* JADX INFO: renamed from: vr */
    public String f8476vr;
    protected final C2858lr xha;

    /* JADX INFO: renamed from: mj */
    protected final AtomicBoolean f8471mj = new AtomicBoolean(false);
    public boolean slm = false;

    public AbstractC2859mj(C2858lr c2858lr, wjv wjvVar, int i, int i2, boolean z) {
        this.xha = c2858lr;
        this.f8468di = wjvVar;
        this.f8473qt = i;
        this.f8475sf = i2;
        this.f8466bu = z;
    }

    private Runnable ihz() {
        return new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.mj.2
            @Override // java.lang.Runnable
            public void run() {
                AbstractC2859mj.this.feb();
            }
        };
    }

    /* JADX INFO: renamed from: mj */
    private slm m10998mj() {
        return new slm(this.jbs) { // from class: com.bytedance.sdk.openadsdk.activity.single.mj.1
            @Override // com.bytedance.sdk.openadsdk.common.slm
            /* JADX INFO: renamed from: ik */
            protected void mo10697ik() {
                AbstractC2859mj.this.feb();
            }

            @Override // com.bytedance.sdk.openadsdk.common.slm
            /* JADX INFO: renamed from: lr */
            protected boolean mo10698lr() {
                return AbstractC2859mj.this.xha.m10928co().getBoolean("reward_verify", false) || AbstractC2859mj.this.xha.m10927bu();
            }

            @Override // com.bytedance.sdk.openadsdk.common.slm
            /* JADX INFO: renamed from: ri */
            protected void mo10699ri(C3022ri c3022ri) {
                AbstractC2859mj.this.mo11017ri(c3022ri);
            }

            @Override // com.bytedance.sdk.openadsdk.common.slm
            /* JADX INFO: renamed from: ri */
            protected void mo10700ri(boolean z) {
                AbstractC2859mj.this.xha.m10943lr(z);
            }

            @Override // com.bytedance.sdk.openadsdk.common.slm
            /* JADX INFO: renamed from: ri */
            protected boolean mo10701ri() {
                return AbstractC2859mj.this.xha.m10925aw();
            }
        };
    }

    /* JADX INFO: renamed from: ri */
    private void m10999ri(slm slmVar) {
        C2951ri.m11401lr(new bgr.C2930ri(this.jbs, "BVA", ihz(), wjv()).m11265ri(mo10765b_()).m11264ri(slmVar).m11263ri(m11000zf()).m11266ri());
    }

    private C2951ri.lr wjv() {
        return new C2951ri.lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.mj.3
            @Override // com.bytedance.sdk.openadsdk.common.C2951ri.lr
            /* JADX INFO: renamed from: ri */
            public void mo10587ri() {
                AbstractC2859mj.this.feb();
            }

            @Override // com.bytedance.sdk.openadsdk.common.C2951ri.lr
            /* JADX INFO: renamed from: ri */
            public void mo10588ri(boolean z, int i) {
                AbstractC2859mj abstractC2859mj = AbstractC2859mj.this;
                if (abstractC2859mj instanceof AbstractC2860ri) {
                    ((AbstractC2860ri) abstractC2859mj).m11045ri(z, i);
                } else if (abstractC2859mj instanceof C2853fi) {
                    abstractC2859mj.mo10581sf();
                }
            }
        };
    }

    /* JADX INFO: renamed from: zf */
    private C2951ri.ri m11000zf() {
        return new C2951ri.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.mj.4
            @Override // com.bytedance.sdk.openadsdk.common.C2951ri.ri
            /* JADX INFO: renamed from: ri */
            public void mo11025ri(C3022ri c3022ri, View view) {
                AbstractC2859mj.this.m11013lr(c3022ri);
            }
        };
    }

    /* JADX INFO: renamed from: a_ */
    protected void mo10764a_() {
        C3022ri c3022ri;
        C2858lr c2858lr = this.xha;
        boolean z = c2858lr != null && c2858lr.m10936ik();
        if (z && (c3022ri = this.jbs) != null && !(c3022ri.ajz instanceof C2852di)) {
            this.tan = m10998mj();
        }
        if (z) {
            m10999ri(this.tan);
        }
    }

    /* JADX INFO: renamed from: ac */
    public void mo10785ac() {
    }

    /* JADX INFO: renamed from: aw */
    public void mo10786aw() {
    }

    /* JADX INFO: renamed from: ay */
    public abstract C3022ri mo10787ay();

    /* JADX INFO: renamed from: b_ */
    protected boolean mo10765b_() {
        return false;
    }

    public void bgr() {
    }

    public void bnj() {
        m11006ik(0);
    }

    /* JADX INFO: renamed from: c_ */
    protected abstract boolean mo10766c_();

    /* JADX INFO: renamed from: d_ */
    public abstract String mo10767d_();

    /* JADX INFO: renamed from: di */
    public void m11001di(boolean z) {
        this.f8472nr = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    public void dzy() {
        m11006ik(2);
    }

    /* JADX INFO: renamed from: e_ */
    public abstract void mo10768e_();

    /* JADX INFO: renamed from: f_ */
    public abstract boolean mo10769f_();

    /* JADX INFO: renamed from: fe */
    protected void m11002fe() {
        C2858lr c2858lr = this.xha;
        if (c2858lr == null || c2858lr.tan()) {
            return;
        }
        this.xha.slm();
        this.xha.ihz();
    }

    protected void feb() {
        if (this.f8468di != null) {
            C3366lr.m15165ri().m15173ri("videoForceBreak", this.f8468di);
        }
        this.xha.xha();
    }

    /* JADX INFO: renamed from: fi */
    public void m11003fi(boolean z) {
        this.f8470lr = z;
    }

    /* JADX INFO: renamed from: fr */
    public boolean mo11004fr() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    public final void gcp() {
        m11022ta();
        C3022ri c3022ri = this.jbs;
        if (c3022ri == null || c3022ri.f9389lr == null) {
            return;
        }
        this.jbs.f9389lr.m14483qx();
        this.jbs.f9389lr.m14432ka(true);
        if (wjv.m14332fi(this.jbs.f9389lr)) {
            C3414ik.m15521lr(this.jbs.f9389lr, this.jbs.f9381fi, this.jbs.f9389lr.m14408hp());
        }
    }

    public boolean hcw() {
        return false;
    }

    /* JADX INFO: renamed from: ig */
    public boolean m11005ig() {
        C2858lr c2858lr = this.xha;
        return c2858lr != null && c2858lr.m10966ri(this, this.f8473qt);
    }

    public void igq() {
    }

    /* JADX INFO: renamed from: ik */
    public void mo10788ik() {
    }

    /* JADX INFO: renamed from: ik */
    public void m11006ik(final int i) {
        if (!this.xha.m10928co().getBoolean("reward_verify", false) && !this.xha.m10927bu() && !this.xha.m10925aw()) {
            this.xha.m10928co().putBoolean("reward_verify", true);
            if (mo10787ay() != null) {
                C3022ri c3022riMo10787ay = mo10787ay();
                if (C3299nr.m14639ka().slm(String.valueOf(c3022riMo10787ay.f9377di))) {
                    m11020ri(true, c3022riMo10787ay.f9389lr.m14466pc(), c3022riMo10787ay.f9389lr.saa(), 0, "", i);
                } else {
                    C3299nr.m14638ik().mo12642ri(siy(), new com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3357lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.mj.5
                        @Override // com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3357lr
                        /* JADX INFO: renamed from: ri */
                        public void mo10704ri(int i2, String str) {
                            AbstractC2859mj.this.m11020ri(false, 0, "", i2, str, i);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3357lr
                        /* JADX INFO: renamed from: ri */
                        public void mo10705ri(C3112ay.lr lrVar) {
                            AbstractC2859mj.this.m11020ri(lrVar.f9937lr, lrVar.f9936ik.m14606ri(), lrVar.f9936ik.m14604lr(), 0, "", i);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: ik */
    public void m11007ik(C3022ri c3022ri) {
        if (m11005ig()) {
            return;
        }
        C2858lr.fi fiVar = new C2858lr.fi(8, c3022ri);
        fiVar.f8430ka = c3022ri.zyn;
        C2858lr c2858lr = this.xha;
        if (c2858lr != null) {
            c2858lr.m10942lr(this, fiVar);
        }
    }

    /* JADX INFO: renamed from: ik */
    public abstract void mo10789ik(boolean z);

    /* JADX INFO: renamed from: jc */
    public C2858lr m11008jc() {
        return this.xha;
    }

    /* JADX INFO: renamed from: ka */
    public void mo10770ka() {
    }

    /* JADX INFO: renamed from: ka */
    public void m11009ka(int i) {
        C2858lr c2858lr = this.xha;
        if (c2858lr != null) {
            c2858lr.m10951ri(i);
        }
    }

    /* JADX INFO: renamed from: kt */
    public Activity m11010kt() {
        return this.xha.m10945mj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: lr */
    public void mo10610lr(int i) {
    }

    /* JADX INFO: renamed from: lr */
    public void m11011lr(Activity activity) {
        if (C3606fi.m16701mj() && activity != null && activity.isChangingConfigurations()) {
            C2858lr c2858lr = this.xha;
            if (c2858lr == null || c2858lr.m10949ri() == null) {
                return;
            }
            C3429qt.m15620ri(this.xha.m10949ri(), "close_interception_config_change", this.xha.m10949ri().m14394fi(), (String) null);
            return;
        }
        Objects.toString(this.xha);
        if (!this.xha.tan() && !zyn()) {
            long jJbs = this.xha.m10949ri().jbs();
            if (jJbs > 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - jJbs;
                if (jElapsedRealtime > 0) {
                    this.f8468di.m14439lr(jElapsedRealtime);
                }
            }
            C3022ri c3022riMo10787ay = mo10787ay();
            if (c3022riMo10787ay != null) {
                c3022riMo10787ay.m12004ri(BackupConstant.CLOSE_NOT_SHOW_ONE_TO_N_CODE, BackupConstant.CLOSE_NOT_SHOW_CODE_MSG, 1004);
                c3022riMo10787ay.f9402su.m11993ri();
            }
        }
        tnn();
        this.xha.m10971vr();
    }

    /* JADX INFO: renamed from: lr */
    public final void m11012lr(Activity activity, C2858lr.fi fiVar) {
        if (this.f8474ri) {
            return;
        }
        this.f8474ri = true;
        mo10794ri(activity, fiVar);
    }

    /* JADX INFO: renamed from: lr */
    public void m11013lr(C3022ri c3022ri) {
        if (c3022ri == null) {
            return;
        }
        try {
            int iM10947oh = this.xha.m10947oh();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", Math.max(iM10947oh, 0));
            C3414ik.m15505fi(this.f8468di, c3022ri.f9381fi, jSONObject);
        } catch (Throwable unused) {
        }
        m11007ik(c3022ri);
    }

    /* JADX INFO: renamed from: nd */
    public void m11014nd() {
        if (m11016qd() || mo10787ay() == null || mo10787ay().f9396pv == null || !mo10787ay().f9389lr.m14532tl()) {
            return;
        }
        C3344nr c3344nr = new C3344nr(mo10787ay(), new C3344nr.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.mj.7
            @Override // com.bytedance.sdk.openadsdk.core.widget.C3344nr.ri
            /* JADX INFO: renamed from: di */
            public void mo11026di() {
                AbstractC2859mj.this.m11009ka(1);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.C3344nr.ri
            /* JADX INFO: renamed from: fi */
            public void mo11027fi() {
                AbstractC2859mj.this.m11009ka(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.C3344nr.ri
            /* JADX INFO: renamed from: ik */
            public void mo11028ik() {
                if (AbstractC2859mj.this.xha != null) {
                    AbstractC2859mj.this.xha.hcw();
                }
                AbstractC2859mj.this.m11009ka(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.C3344nr.ri
            /* JADX INFO: renamed from: ka */
            public int mo11029ka() {
                if (AbstractC2859mj.this.xha != null) {
                    return AbstractC2859mj.this.xha.m10947oh();
                }
                return 0;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.C3344nr.ri
            /* JADX INFO: renamed from: lr */
            public void mo11030lr() {
                if (AbstractC2859mj.this.xha != null) {
                    AbstractC2859mj.this.xha.ory();
                }
                AbstractC2859mj.this.m11009ka(1);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.C3344nr.ri
            /* JADX INFO: renamed from: ri */
            public void mo11031ri() {
                AbstractC2859mj abstractC2859mj = AbstractC2859mj.this;
                abstractC2859mj.m11007ik(abstractC2859mj.mo10787ay());
            }
        });
        this.f8469ik = c3344nr;
        c3344nr.m15028ri(mo10787ay().f9396pv);
    }

    /* JADX INFO: renamed from: oh */
    public boolean mo11015oh() {
        return false;
    }

    /* JADX INFO: renamed from: pv */
    public void mo10772pv() {
    }

    /* JADX INFO: renamed from: qd */
    public boolean m11016qd() {
        return this.f8466bu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: qh */
    public void mo10571qh() {
        C2858lr c2858lr = this.xha;
        if (c2858lr != null) {
            c2858lr.m10960ri(this, true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: qt */
    public void mo10572qt() {
        toString();
        m11002fe();
    }

    /* JADX INFO: renamed from: ri */
    public abstract C3072mj mo10791ri();

    /* JADX INFO: renamed from: ri */
    public void mo10792ri(Activity activity) {
    }

    /* JADX INFO: renamed from: ri */
    public void mo10793ri(Activity activity, Bundle bundle) {
    }

    /* JADX INFO: renamed from: ri */
    protected abstract void mo10794ri(Activity activity, C2858lr.fi fiVar);

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ri */
    public void mo10575ri(Bundle bundle) {
    }

    /* JADX INFO: renamed from: ri */
    public void mo10795ri(AbstractC2859mj abstractC2859mj, AbstractC2859mj abstractC2859mj2, C2858lr.fi fiVar) {
    }

    /* JADX INFO: renamed from: ri */
    protected void mo11017ri(C3022ri c3022ri) {
    }

    /* JADX INFO: renamed from: ri */
    public void mo11018ri(wjv wjvVar, int i, int i2) {
        this.f8468di = wjvVar;
        this.f8473qt = i;
        this.f8475sf = i2;
    }

    /* JADX INFO: renamed from: ri */
    public abstract void mo10773ri(String str);

    /* JADX INFO: renamed from: ri */
    public void mo11019ri(Map<String, Object> map, float f, float f2) {
    }

    /* JADX INFO: renamed from: ri */
    protected final void m11020ri(boolean z, int i, String str, int i2, String str2, int i3) {
        if (this.xha.m10927bu()) {
            return;
        }
        this.xha.m10961ri(this, z, i, str, i2, str2, i3);
        C2986co.m11648ri(this.f8468di, z, i3);
    }

    /* JADX INFO: renamed from: ri */
    protected void m11021ri(boolean z, boolean z2, boolean z3, int i) {
        this.xha.m10962ri(this, z, z2, z3, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    public List<wjv> rzk() {
        return this.xha.m10972zf();
    }

    public JSONObject siy() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("media_extra", this.f8476vr);
            jSONObject.put("play_start_ts", 0);
            jSONObject.put("play_end_ts", 0);
            jSONObject.put("user_id", this.bgr);
            jSONObject.put("trans_id", C3593su.m16658ri().replace("-", ""));
            if (mo10787ay() != null) {
                C3022ri c3022riMo10787ay = mo10787ay();
                jSONObject.put("duration", (int) c3022riMo10787ay.ihz.igq());
                jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, c3022riMo10787ay.f9389lr.saa());
                jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, c3022riMo10787ay.f9389lr.m14466pc());
                jSONObject.put("network", C2724nr.m10255ik(c3022riMo10787ay.srn));
                JSONObject jSONObjectLjo = c3022riMo10787ay.f9389lr.ljo();
                jSONObjectLjo.put(C11540L6.f24947V0, C3369ri.m15224ri().m15229lr());
                jSONObject.put("extra", jSONObjectLjo);
                jSONObject.put("video_duration", c3022riMo10787ay.f9389lr.m14389eu().m6339di());
                String strM16449ka = "unKnow";
                int iM14407hd = c3022riMo10787ay.f9389lr.m14407hd();
                if (iM14407hd == 2) {
                    strM16449ka = C3571ig.m16457lr();
                } else if (iM14407hd == 1) {
                    strM16449ka = C3571ig.m16449ka();
                }
                jSONObject.put("user_agent", strM16449ka);
            }
            return jSONObject;
        } catch (Throwable th) {
            C2707ac.m10206ri("Scene", "", th);
            return null;
        }
    }

    public int srn() {
        return this.f8475sf;
    }

    /* JADX INFO: renamed from: ta */
    protected final void m11022ta() {
        this.xha.bgr();
    }

    public void tan() {
        C3344nr c3344nr = this.f8469ik;
        if (c3344nr != null) {
            c3344nr.m15027mj();
            this.f8469ik = null;
        }
        this.f8474ri = false;
    }

    protected void tnn() {
        C3022ri c3022ri;
        if (!mo10766c_() || (c3022ri = this.jbs) == null || c3022ri.f9414zk == null) {
            return;
        }
        this.jbs.f9414zk.m11650ka();
    }

    /* JADX INFO: renamed from: tw */
    public boolean m11023tw() {
        C3022ri c3022riMo10787ay;
        C3344nr c3344nr;
        if (m11016qd() || (c3022riMo10787ay = mo10787ay()) == null || !c3022riMo10787ay.f9389lr.m14532tl() || (c3344nr = this.f8469ik) == null) {
            return false;
        }
        return c3344nr.m15029ri(c3022riMo10787ay.f9384ig);
    }

    /* JADX INFO: renamed from: uq */
    public abstract boolean mo10796uq();

    public void whw() {
        C3126lr c3126lrM14345ri = wjv.m14345ri(CacheDirFactory.getICacheDir(this.f8468di.m14476qf()).mo6274ri(), this.f8468di);
        c3126lrM14345ri.m6328ri("material_meta", this.f8468di);
        c3126lrM14345ri.m6328ri("ad_slot", this.f8468di.m14388eb());
        C3113ri.m12651ri(c3126lrM14345ri, new AbstractC1993lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.mj.6
            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
            /* JADX INFO: renamed from: ri */
            public void mo6289ri(C1996ik c1996ik, int i) {
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
            /* JADX INFO: renamed from: ri */
            public void mo6290ri(C1996ik c1996ik, int i, String str) {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: xd */
    public void mo10614xd() {
        m11022ta();
    }

    /* JADX INFO: renamed from: xm */
    public boolean m11024xm() {
        return this.f8470lr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: zb */
    public void mo10585zb() {
        if (mo10787ay() != null) {
            mo10787ay().f9402su.m11993ri();
        }
    }

    public boolean zyn() {
        wjv wjvVarM10949ri = this.xha.m10949ri();
        if (wjvVarM10949ri != null) {
            List<wjv> listLsq = wjvVarM10949ri.lsq();
            for (int i = 0; i < listLsq.size(); i++) {
                wjv wjvVar = listLsq.get(i);
                if (wjvVar != null && wjvVar.feb()) {
                    return true;
                }
            }
        }
        return false;
    }
}
