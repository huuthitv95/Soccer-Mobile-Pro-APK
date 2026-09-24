package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.common.C2951ri;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3365zf;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.C3283ka;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.C3097ka;
import com.bytedance.sdk.openadsdk.core.widget.DialogC3342lr;
import com.bytedance.sdk.openadsdk.p175ay.p176lr.C2889fi;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3412vr;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p239ri.C3413ri;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class xha extends AbstractC2860ri {

    /* JADX INFO: renamed from: ac */
    private static String f8501ac;

    /* JADX INFO: renamed from: ay */
    private static String f8502ay;
    private static String ihz;

    /* JADX INFO: renamed from: uq */
    private static String f8503uq;
    private static String wjv;

    /* JADX INFO: renamed from: fr */
    private int f8504fr;

    public xha(C2858lr c2858lr, wjv wjvVar, int i, int i2, boolean z) {
        super(c2858lr, wjvVar, i, i2, z);
        this.f8504fr = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x008a  */
    public void aac() {
        C3097ka c3097kaM14188ri;
        this.jbs.ihz.m12145oh();
        C3412vr.ri riVar = new C3412vr.ri();
        riVar.m15466lr(this.jbs.ihz.m12122aw());
        riVar.m15463ka(this.jbs.ihz.m12167su());
        riVar.m15459ik(this.jbs.ihz.m12124bu());
        riVar.m15458ik(3);
        riVar.m15462ka(this.jbs.ihz.m12131fr());
        riVar.m15472ri(this.jbs.ihz.m12139lr());
        C3413ri.m15493ri(this.jbs.ihz.m12143mj(), riVar, this.jbs.ihz.m12129fi());
        C3365zf.m15145ik(this.jbs.f9377di);
        this.jbs.ihz.m12160ri("skip", false);
        if (this.jbs.f9385ik) {
            m11045ri(true, 4);
            if (C3273ac.m13987ri(this.jbs.f9389lr) && !this.jbs.f9373aw.get()) {
                feb();
            }
        } else {
            feb();
        }
        C3283ka c3283kaM14473qc = this.jbs.f9389lr.m14473qc();
        if (c3283kaM14473qc != null && (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) != null) {
            long jM12122aw = this.jbs.ihz.m12122aw();
            c3097kaM14188ri.m12467di(jM12122aw);
            c3097kaM14188ri.m12469fi(jM12122aw);
        }
        C2889fi.m11114ri(this.jbs.f9389lr, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public boolean m11054ri(final boolean z, boolean z2, final Runnable runnable) {
        if (!z2 && this.xha.m10925aw() && runnable != null) {
            return false;
        }
        if (!C3299nr.m14639ka().m14861mj(String.valueOf(this.jbs.f9377di))) {
            if (runnable == null) {
                if (z) {
                    feb();
                    return false;
                }
                aac();
            }
            return false;
        }
        if (this.xha.m10927bu()) {
            if (runnable == null) {
                if (z) {
                    feb();
                    return false;
                }
                aac();
            }
            return false;
        }
        this.jbs.f9375bu.set(true);
        this.jbs.ihz.m12168uq();
        if (z) {
            this.jbs.wjv.m11957di();
        }
        final DialogC3342lr dialogC3342lr = new DialogC3342lr(m11010kt());
        this.f8492lr.f9195co = dialogC3342lr;
        if (z) {
            this.f8492lr.f9195co.m15019ri(f8501ac).m15017lr(ihz).m15016ik(f8503uq);
        } else {
            this.f8492lr.f9195co.m15019ri(wjv).m15017lr(f8502ay).m15016ik(f8503uq);
        }
        this.f8492lr.f9195co.m15018ri(new DialogC3342lr.lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.xha.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.DialogC3342lr.lr
            /* JADX INFO: renamed from: lr */
            public void mo10702lr() {
                dialogC3342lr.dismiss();
                xha.this.xha.m10943lr(true);
                xha.this.jbs.f9375bu.set(false);
                xha.this.jbs.wjv.m11963lr(Integer.MAX_VALUE);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                } else if (!z) {
                    xha.this.aac();
                } else {
                    xha.this.jbs.f9402su.m11985di();
                    xha.this.feb();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.DialogC3342lr.lr
            /* JADX INFO: renamed from: ri */
            public void mo10703ri() {
                xha.this.jbs.ihz.ihz();
                if (z) {
                    xha.this.jbs.wjv.m11969ri(1000);
                }
                dialogC3342lr.dismiss();
                xha.this.jbs.f9375bu.set(false);
            }
        }).show();
        return true;
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
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.xha.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (xha.this.jbs.ory.m12072ac() && xha.this.jbs.jbs.get()) {
                        boolean zM11820aw = xha.this.jbs.hcw.m11820aw();
                        xha.this.jbs.ory.m12078di(zM11820aw);
                        xha.this.jbs.dzy.mo12216di(8);
                        xha.this.jbs.f9386jc.sendEmptyMessageDelayed(600, 5000L);
                        if (!wjv.m14334ik(xha.this.jbs.f9389lr)) {
                            return;
                        }
                        if (wjv.m14334ik(xha.this.jbs.f9389lr) && zM11820aw) {
                            return;
                        }
                    }
                    xha.this.jbs.ory.ihz();
                    xha.this.jbs.hcw.m11831sf();
                    xha.this.jbs.f9402su.m11985di();
                    if (C3279dw.m14091ka(xha.this.jbs.f9389lr)) {
                        xha.this.m11054ri(true, true, (Runnable) null);
                    } else {
                        xha.this.feb();
                    }
                }
            };
            viewMo12226qt.setOnClickListener(onClickListener);
            viewMo12226qt.setTag(viewMo12226qt.getId(), onClickListener);
        }
        this.jbs.f9394oh.m11869ri(new InterfaceC3061lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.xha.2
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
                xha xhaVar = xha.this;
                xhaVar.m11013lr(xhaVar.jbs);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: lr */
            public void mo10618lr(View view) {
                xha.this.mo10768e_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ri */
            public void mo10619ri(View view) {
                xha xhaVar = xha.this;
                xhaVar.m11054ri(C3279dw.m14090ik(xhaVar.jbs.f9389lr), false, (Runnable) null);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ri */
            public void mo10620ri(View view, String str) {
                xha.this.mo10773ri(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2860ri, com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: bu */
    public void mo10557bu() {
        bnj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: c_ */
    protected boolean mo10766c_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: d_ */
    public String mo10767d_() {
        return "rewarded_video";
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

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2860ri
    /* JADX INFO: renamed from: lr */
    protected void mo10771lr() {
        this.jbs.f9394oh.m11872ri(null, TTAdDislikeToast.getSkipText());
        this.jbs.f9394oh.m11859fi(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj, com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: lr */
    public void mo10610lr(int i) {
        if (i == 10000) {
            bnj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: pv */
    public void mo10772pv() {
        super.mo10772pv();
        this.f8488fi = false;
        this.jbs.f9374ay.m12260lr(false);
        this.jbs.ihz.zyn();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2860ri, com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ri */
    public void mo10794ri(Activity activity, C2858lr.fi fiVar) {
        super.mo10794ri(activity, fiVar);
        if (C2722lr.m10243ri(activity)) {
            return;
        }
        Intent intent = activity.getIntent();
        this.f8476vr = intent.getStringExtra("media_extra");
        this.bgr = intent.getStringExtra("user_id");
        try {
            if (wjv == null) {
                wjv = C2729uq.m10311ri(this.jbs.srn, "tt_reward_msg");
                f8501ac = C2729uq.m10311ri(this.jbs.srn, "tt_msgPlayable");
                f8503uq = C2729uq.m10311ri(this.jbs.srn, "tt_negtiveBtnBtnText");
                f8502ay = C2729uq.m10311ri(this.jbs.srn, "tt_postiveBtnText");
                ihz = C2729uq.m10311ri(this.jbs.srn, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            C2707ac.m10196ik("TTAD.RewardAdScene", th.getMessage());
        }
        if (this.jbs == null || this.xha == null) {
            return;
        }
        this.jbs.f9414zk = this.xha.f8411ri;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ri */
    protected void mo11017ri(C3022ri c3022ri) {
        if (c3022ri.f9385ik) {
            m11045ri(true, 4);
            if (C3273ac.m13987ri(c3022ri.f9389lr) && !c3022ri.f9373aw.get()) {
                feb();
            }
        } else {
            feb();
        }
        C2951ri.m11402lr(c3022ri);
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
        StringBuilder sb = new StringBuilder("will set is Mute ");
        sb.append(this.jbs.zyn);
        sb.append(" mLastVolume=");
        sb.append(this.jbs.f9378dw.m11090ri());
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

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2860ri, com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ri */
    public void mo10613ri(final String str, final JSONObject jSONObject) {
        if ("skipToNextAd".equals(str) && this.jbs.ajz != null && this.xha.m10933fr() == null) {
            if (this.xha == null || !this.xha.m10936ik()) {
                if (m11054ri(C3279dw.m14090ik(this.jbs.f9389lr), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.xha.5
                    @Override // java.lang.Runnable
                    public void run() {
                        xha.super.mo10613ri(str, jSONObject);
                    }
                })) {
                    return;
                }
            } else if (this.tan != null && this.tan.m11431ri(C3279dw.m14090ik(this.jbs.f9389lr), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.xha.4
                @Override // java.lang.Runnable
                public void run() {
                    xha.super.mo10613ri(str, jSONObject);
                }
            })) {
                return;
            }
        }
        super.mo10613ri(str, jSONObject);
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
