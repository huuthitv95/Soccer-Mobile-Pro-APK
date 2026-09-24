package com.bytedance.sdk.openadsdk.activity.single;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3365zf;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3283ka;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.C3097ka;
import com.bytedance.sdk.openadsdk.p175ay.p176lr.C2889fi;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3412vr;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p239ri.C3413ri;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2852di extends AbstractC2860ri {

    /* JADX INFO: renamed from: ac */
    private boolean f8270ac;

    public C2852di(C2858lr c2858lr, wjv wjvVar, int i, int i2, boolean z) {
        super(c2858lr, wjvVar, i, i2, z);
    }

    /* JADX INFO: renamed from: lr */
    private boolean m10762lr(wjv wjvVar) {
        if (wjvVar == null) {
            return false;
        }
        return C3299nr.m14639ka().m14828ac(String.valueOf(this.jbs.f9377di));
    }

    /* JADX INFO: renamed from: ri */
    private boolean m10763ri(wjv wjvVar) {
        return wjvVar == null || wjvVar.m14406gz() == 100.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: a_ */
    protected void mo10764a_() {
        if (this.xha != null && this.xha.m10936ik()) {
            super.mo10764a_();
            return;
        }
        final View viewMo12226qt = this.jbs.dzy.mo12226qt();
        if (viewMo12226qt != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.di.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (C2852di.this.jbs.ory.m12072ac() && C2852di.this.jbs.jbs.get()) {
                        boolean zM11820aw = C2852di.this.jbs.hcw.m11820aw();
                        C2852di.this.jbs.ory.m12078di(zM11820aw);
                        C2852di.this.jbs.dzy.mo12216di(8);
                        C2852di.this.jbs.f9386jc.sendEmptyMessageDelayed(600, 5000L);
                        if (!wjv.m14334ik(C2852di.this.jbs.f9389lr)) {
                            return;
                        }
                        if (wjv.m14334ik(C2852di.this.jbs.f9389lr) && zM11820aw) {
                            return;
                        }
                    }
                    C2852di.this.jbs.ory.ihz();
                    C2852di.this.jbs.hcw.m11831sf();
                    C2852di.this.jbs.f9402su.m11985di();
                    C2852di.this.feb();
                }
            };
            viewMo12226qt.setOnClickListener(onClickListener);
            viewMo12226qt.setTag(viewMo12226qt.getId(), onClickListener);
        }
        this.jbs.f9394oh.m11869ri(new InterfaceC3061lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.di.2
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
                C2852di c2852di = C2852di.this;
                c2852di.m11013lr(c2852di.jbs);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: lr */
            public void mo10618lr(View view) {
                C2852di.this.mo10768e_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ri */
            public void mo10619ri(View view) {
                C3097ka c3097kaM14188ri;
                if (C3273ac.m13987ri(C2852di.this.jbs.f9389lr) && !C2852di.this.jbs.f9373aw.get()) {
                    C2852di.this.feb();
                    return;
                }
                C2852di.this.jbs.ihz.m12145oh();
                C3412vr.ri riVar = new C3412vr.ri();
                riVar.m15466lr(C2852di.this.jbs.ihz.m12122aw());
                riVar.m15463ka(C2852di.this.jbs.ihz.m12167su());
                riVar.m15459ik(C2852di.this.jbs.ihz.m12124bu());
                riVar.m15458ik(3);
                riVar.m15462ka(C2852di.this.jbs.ihz.m12131fr());
                riVar.m15472ri(C2852di.this.jbs.ihz.m12139lr());
                C3413ri.m15493ri(C2852di.this.jbs.ihz.m12143mj(), riVar, C2852di.this.jbs.ihz.m12129fi());
                C3365zf.m15145ik(C2852di.this.jbs.f9377di);
                C2852di.this.jbs.ihz.m12160ri("skip", false);
                C2852di.this.jbs.f9394oh.m11863ka(false);
                if (C2852di.this.jbs.f9385ik) {
                    C2852di.this.m11045ri(true, 4);
                } else {
                    C2852di.this.feb();
                }
                if (C2852di.this.jbs.f9389lr != null && C2852di.this.jbs.f9389lr.m14473qc() != null && C2852di.this.jbs.ihz != null && (c3097kaM14188ri = C2852di.this.jbs.f9389lr.m14473qc().m14188ri()) != null) {
                    c3097kaM14188ri.m12467di(C2852di.this.jbs.ihz.m12122aw());
                    c3097kaM14188ri.m12469fi(C2852di.this.jbs.ihz.m12122aw());
                }
                C2889fi.m11114ri(C2852di.this.jbs.f9389lr, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ri */
            public void mo10620ri(View view, String str) {
                C2852di.this.mo10773ri(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: b_ */
    protected boolean mo10765b_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: c_ */
    protected boolean mo10766c_() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: d_ */
    public String mo10767d_() {
        return "fullscreen_interstitial_ad";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj, com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    public void dzy() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: e_ */
    public void mo10768e_() {
        this.jbs.f9413zf.m11912ri(this.f8492lr);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: f_ */
    public boolean mo10769f_() {
        return this.jbs.zyn;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2860ri, com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ka */
    public void mo10770ka() {
        super.mo10770ka();
        if (this.jbs == null || !m10762lr(this.jbs.f9389lr) || m10763ri(this.jbs.f9389lr)) {
            return;
        }
        if (this.f8270ac) {
            this.f8270ac = false;
            feb();
        } else if (this.jbs.ory.m12109su()) {
            feb();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2860ri
    /* JADX INFO: renamed from: lr */
    public void mo10771lr() {
        if (wjv.m14332fi(this.jbs.f9389lr) || this.jbs.f9385ik) {
            this.jbs.f9394oh.m11872ri(null, TTAdDislikeToast.getSkipText());
        } else {
            this.jbs.f9394oh.m11872ri(null, "X");
        }
        this.jbs.f9394oh.m11859fi(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: pv */
    public void mo10772pv() {
        super.mo10772pv();
        this.f8488fi = false;
        this.jbs.f9374ay.m12260lr(false);
        this.jbs.ihz.zyn();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ri */
    public void mo10773ri(String str) {
        C3283ka c3283kaM14473qc;
        C3097ka c3097kaM14188ri;
        this.jbs.zyn = !this.jbs.zyn;
        if (this.jbs.f9374ay != null && this.jbs.f9374ay.m12263ri() != null) {
            this.jbs.f9374ay.m12263ri().setSoundMute(this.jbs.zyn);
        }
        this.jbs.ihz.m12163ri(this.jbs.zyn, str);
        this.jbs.ory.m12081fi(this.jbs.zyn);
        if (this.jbs.f9389lr == null || (c3283kaM14473qc = this.jbs.f9389lr.m14473qc()) == null || (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) == null) {
            return;
        }
        if (this.jbs.zyn) {
            c3097kaM14188ri.m12477mj(this.jbs.ihz.m12122aw());
        } else {
            c3097kaM14188ri.jbs(this.jbs.ihz.m12122aw());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj, com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: xd */
    public void mo10614xd() {
        if (this.jbs.f9389lr.m14406gz() != 100.0f) {
            this.f8270ac = true;
        }
        super.mo10614xd();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2860ri
    public FrameLayout xha() {
        if (this.f8468di.m14383di()) {
            if (this.jbs == null || this.jbs.f9374ay == null) {
                return null;
            }
            return this.jbs.f9374ay.m12259lr();
        }
        if (this.jbs == null || this.jbs.dzy == null) {
            return null;
        }
        return this.jbs.dzy.mo12215di();
    }
}
