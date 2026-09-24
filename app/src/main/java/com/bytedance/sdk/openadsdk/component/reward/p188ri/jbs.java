package com.bytedance.sdk.openadsdk.component.reward.p188ri;

import android.app.Activity;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj;
import com.bytedance.sdk.openadsdk.activity.single.C2857ka;
import com.bytedance.sdk.openadsdk.activity.single.C2858lr;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.igq;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractC3217fi;
import com.bytedance.sdk.openadsdk.core.widget.C3344nr;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2879di;
import com.bytedance.sdk.openadsdk.p266uq.p268ri.C3552ri;
import com.bytedance.sdk.openadsdk.utils.slm;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jbs {

    /* JADX INFO: renamed from: aw */
    protected boolean f9333aw;
    protected boolean bgr;

    /* JADX INFO: renamed from: bu */
    protected FrameLayout f9334bu;

    /* JADX INFO: renamed from: co */
    protected final C3022ri f9335co;

    /* JADX INFO: renamed from: ik */
    private boolean f9336ik;
    protected final Activity jbs;

    /* JADX INFO: renamed from: lr */
    private C2857ka.di f9337lr;

    /* JADX INFO: renamed from: mj */
    protected volatile boolean f9338mj;

    /* JADX INFO: renamed from: nr */
    protected C3552ri f9339nr;

    /* JADX INFO: renamed from: qt */
    protected final wjv f9340qt;

    /* JADX INFO: renamed from: ri */
    private C3344nr f9341ri;

    /* JADX INFO: renamed from: sf */
    protected final String f9342sf;
    protected boolean slm;
    protected AtomicBoolean tan = new AtomicBoolean(false);

    /* JADX INFO: renamed from: vr */
    protected boolean f9343vr;

    public jbs(C3022ri c3022ri) {
        this.f9335co = c3022ri;
        this.jbs = c3022ri.f9384ig;
        this.f9342sf = c3022ri.f9381fi;
        wjv wjvVar = c3022ri.f9389lr;
        this.f9340qt = wjvVar;
        this.bgr = C3279dw.m14088fi(wjvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: bu */
    public void m11913bu() {
        C2858lr c2858lrM11008jc;
        if (this.f9335co.f9410xe) {
            AbstractC2859mj abstractC2859mj = this.f9335co.ajz;
            if (abstractC2859mj == null || (c2858lrM11008jc = abstractC2859mj.m11008jc()) == null) {
                return;
            }
            c2858lrM11008jc.m10951ri(2);
            return;
        }
        if (this instanceof xha) {
            jbs();
        } else {
            C2857ka.di diVar = this.f9337lr;
            if (diVar != null) {
                diVar.m10899lr();
            }
        }
        this.f9336ik = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ka */
    public void m11914ka(boolean z) {
        C2858lr c2858lrM11008jc;
        if (!this.f9335co.f9410xe) {
            if (this instanceof xha) {
                mo11932ri(0L);
            } else {
                C2857ka.di diVar = this.f9337lr;
                if (diVar != null) {
                    diVar.m10897ik();
                }
            }
            this.f9336ik = false;
            return;
        }
        AbstractC2859mj abstractC2859mj = this.f9335co.ajz;
        if (abstractC2859mj == null || (c2858lrM11008jc = abstractC2859mj.m11008jc()) == null) {
            return;
        }
        if (z) {
            c2858lrM11008jc.ory();
        }
        c2858lrM11008jc.m10951ri(1);
    }

    /* JADX INFO: renamed from: nr */
    private void m11916nr() {
        int iPsd = this.f9340qt.psd();
        if (iPsd == -1) {
            if (C3279dw.xha(this.f9340qt)) {
                C3552ri c3552ri = this.f9339nr;
                if (c3552ri == null || !c3552ri.m16295fi()) {
                    this.f9335co.f9391nd.m11753uq();
                    return;
                } else {
                    this.f9335co.slm.set(true);
                    this.f9335co.f9391nd.m11739aw();
                }
            } else {
                this.f9335co.slm.set(true);
                this.f9335co.f9391nd.m11739aw();
            }
        } else {
            if (iPsd < 0) {
                return;
            }
            this.f9335co.f9394oh.m11863ka(false);
            if (C3279dw.xha(this.f9340qt)) {
                C3552ri c3552ri2 = this.f9339nr;
                if (c3552ri2 == null || !c3552ri2.m16295fi()) {
                    C2857ka.di diVar = new C2857ka.di(iPsd) { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.jbs.5
                        @Override // com.bytedance.sdk.openadsdk.activity.single.C2857ka.di
                        /* JADX INFO: renamed from: ri */
                        public void mo10892ri() {
                            jbs.this.f9335co.f9386jc.sendEmptyMessage(1);
                        }
                    };
                    this.f9337lr = diVar;
                    diVar.m10896fi();
                    return;
                } else {
                    C2857ka.di diVar2 = new C2857ka.di(iPsd) { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.jbs.4
                        @Override // com.bytedance.sdk.openadsdk.activity.single.C2857ka.di
                        /* JADX INFO: renamed from: ri */
                        public void mo10892ri() {
                            jbs.this.f9335co.f9386jc.sendEmptyMessage(600);
                        }
                    };
                    this.f9337lr = diVar2;
                    diVar2.m10896fi();
                }
            } else {
                C2857ka.di diVar3 = new C2857ka.di(iPsd) { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.jbs.6
                    @Override // com.bytedance.sdk.openadsdk.activity.single.C2857ka.di
                    /* JADX INFO: renamed from: ri */
                    public void mo10892ri() {
                        jbs.this.f9335co.f9386jc.sendEmptyMessage(600);
                    }
                };
                this.f9337lr = diVar3;
                diVar3.m10896fi();
            }
        }
        if (this.f9335co.aac == null || !this.f9335co.xha()) {
            return;
        }
        this.f9335co.aac.mo16373ri(iPsd);
    }

    private void slm() {
        if (this.f9335co.f9389lr.m14532tl()) {
            C3344nr c3344nr = new C3344nr(this.f9335co, new C3344nr.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.jbs.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.C3344nr.ri
                /* JADX INFO: renamed from: di */
                public void mo11026di() {
                    jbs.this.m11914ka(false);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.C3344nr.ri
                /* JADX INFO: renamed from: fi */
                public void mo11027fi() {
                    jbs.this.m11913bu();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.C3344nr.ri
                /* JADX INFO: renamed from: ik */
                public void mo11028ik() {
                    AbstractC2859mj abstractC2859mj;
                    C2858lr c2858lrM11008jc;
                    dzy dzyVarXha = jbs.this.f9339nr.xha();
                    if (dzyVarXha != null) {
                        dzyVarXha.mo13455ri("popupDidShow", (JSONObject) null);
                    }
                    if (!jbs.this.f9335co.f9410xe || (abstractC2859mj = jbs.this.f9335co.ajz) == null || (c2858lrM11008jc = abstractC2859mj.m11008jc()) == null) {
                        return;
                    }
                    c2858lrM11008jc.hcw();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.C3344nr.ri
                /* JADX INFO: renamed from: ka */
                public int mo11029ka() {
                    return jbs.this.f9335co.f9410xe ? jbs.this.m11920co() : jbs.this.mo11928mj();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.C3344nr.ri
                /* JADX INFO: renamed from: lr */
                public void mo11030lr() {
                    dzy dzyVarXha = jbs.this.f9339nr.xha();
                    if (dzyVarXha != null) {
                        dzyVarXha.mo13455ri("popupDidDismiss", (JSONObject) null);
                    }
                    jbs.this.m11914ka(true);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.C3344nr.ri
                /* JADX INFO: renamed from: ri */
                public void mo11031ri() {
                    jbs.this.f9335co.f9397qd.mo10613ri("skipToNextAd", (JSONObject) null);
                }
            });
            this.f9341ri = c3344nr;
            c3344nr.m15028ri(this.f9335co.f9396pv);
            dzy dzyVarXha = this.f9339nr.xha();
            if (dzyVarXha != null) {
                dzyVarXha.m13454ri(new igq() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.jbs.2
                    @Override // com.bytedance.sdk.openadsdk.core.igq
                    /* JADX INFO: renamed from: m_ */
                    public void mo11937m_() {
                        if (jbs.this.f9341ri != null) {
                            jbs.this.f9341ri.m15029ri(jbs.this.f9335co.f9384ig);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.igq
                    /* JADX INFO: renamed from: n_ */
                    public void mo11938n_() {
                        if (jbs.this.f9341ri != null) {
                            jbs.this.f9341ri.mo11938n_();
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.igq
                    /* JADX INFO: renamed from: o_ */
                    public int mo11939o_() {
                        return jbs.this.f9335co.f9410xe ? jbs.this.m11920co() : jbs.this.mo11928mj();
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.igq
                    /* JADX INFO: renamed from: p_ */
                    public void mo11940p_() {
                        jbs.this.m11913bu();
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.igq
                    /* JADX INFO: renamed from: q_ */
                    public void mo11941q_() {
                        jbs.this.m11914ka(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.igq
                    /* JADX INFO: renamed from: r_ */
                    public void mo11942r_() {
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: aw */
    public boolean m11919aw() {
        return this.f9338mj;
    }

    public void bgr() {
        if (!this.tan.compareAndSet(false, true)) {
            this.f9335co.ory.xha();
            return;
        }
        C3552ri c3552ri = this.f9339nr;
        if (c3552ri != null) {
            c3552ri.m16305ri(true);
        }
        this.f9335co.ory.xha(true);
        this.f9335co.f9409xd.m11901ri(true, this.f9335co.f9391nd);
        if (this.f9335co.f9409xd.m11891fi()) {
            this.f9335co.aac.mo16373ri(this.f9335co.xha);
            return;
        }
        this.f9335co.ory.m12107ri(this.f9335co.zyn, true);
        this.f9335co.ory.m12083ik(true);
        this.f9335co.ory.m12090lr(true);
        this.f9335co.f9386jc.removeMessages(600);
    }

    /* JADX INFO: renamed from: co */
    public int m11920co() {
        C2858lr c2858lrM11008jc;
        AbstractC2859mj abstractC2859mj = this.f9335co.ajz;
        if (abstractC2859mj == null || (c2858lrM11008jc = abstractC2859mj.m11008jc()) == null) {
            return 0;
        }
        return c2858lrM11008jc.m10947oh();
    }

    /* JADX INFO: renamed from: di */
    public void mo11921di() {
        if (this.bgr && !this.slm) {
            this.slm = true;
            C3552ri c3552ri = this.f9339nr;
            if (c3552ri != null) {
                c3552ri.m16297ka();
            }
            FrameLayout frameLayout = this.f9334bu;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            C3344nr c3344nr = this.f9341ri;
            if (c3344nr != null) {
                c3344nr.m15027mj();
                this.f9341ri = null;
            }
            C2857ka.di diVar = this.f9337lr;
            if (diVar != null) {
                diVar.m10898ka();
                this.f9337lr = null;
            }
        }
    }

    /* JADX INFO: renamed from: fi */
    public void mo11922fi() {
        if (!this.bgr || this.tan.get()) {
            return;
        }
        C3552ri c3552ri = this.f9339nr;
        if (c3552ri != null) {
            c3552ri.m16296ik();
        }
        C2857ka.di diVar = this.f9337lr;
        if (diVar != null) {
            diVar.m10899lr();
        }
    }

    /* JADX INFO: renamed from: ik */
    public void mo11923ik() {
        if (this.bgr) {
            this.f9338mj = true;
            m11924ik(this.f9335co.zyn);
            this.f9339nr.mo16276ri();
            m11916nr();
            if (C3279dw.m14093mj(this.f9340qt)) {
                this.f9335co.ory.m12077di();
            }
        }
    }

    /* JADX INFO: renamed from: ik */
    public void m11924ik(boolean z) {
        if (this.bgr && this.f9339nr != null && this.f9338mj) {
            this.f9339nr.m16305ri(z);
        }
    }

    public void jbs() {
        C2857ka.di diVar = this.f9337lr;
        if (diVar != null) {
            diVar.m10899lr();
        }
    }

    /* JADX INFO: renamed from: ka */
    public void mo11925ka() {
        if (!this.bgr || this.tan.get()) {
            return;
        }
        C3552ri c3552ri = this.f9339nr;
        if (c3552ri != null) {
            c3552ri.m16298lr();
        }
        if (this.f9337lr == null || !m11935sf()) {
            return;
        }
        this.f9337lr.m10897ik();
    }

    /* JADX INFO: renamed from: lr */
    protected InterfaceC2879di mo11926lr() {
        return new InterfaceC2879di() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.jbs.3
            @Override // com.bytedance.sdk.openadsdk.p174aw.InterfaceC2879di
            /* JADX INFO: renamed from: ri */
            public void mo11086ri() {
                jbs.this.f9335co.f9397qd.mo10611lr(false);
            }
        };
    }

    /* JADX INFO: renamed from: lr */
    public void m11927lr(boolean z) {
        if (this.bgr && this.f9335co.f9388kt) {
            this.f9334bu = (FrameLayout) this.f9335co.f9396pv.findViewById(slm.cgm);
            mo11934ri(z);
            slm();
        }
    }

    /* JADX INFO: renamed from: mj */
    public int mo11928mj() {
        C2857ka.di diVar = this.f9337lr;
        if (diVar != null) {
            return (int) (diVar.m10895di() / 1000);
        }
        return 0;
    }

    /* JADX INFO: renamed from: qt */
    public boolean mo11929qt() {
        return false;
    }

    /* JADX INFO: renamed from: ri */
    public void mo11930ri() {
        if (this.bgr && !this.f9333aw) {
            this.f9333aw = true;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void mo11931ri(int i) {
    }

    /* JADX INFO: renamed from: ri */
    public void mo11932ri(long j) {
        C2857ka.di diVar = this.f9337lr;
        if (diVar != null) {
            diVar.m10897ik();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11933ri(AbstractC3217fi abstractC3217fi) {
        C3552ri c3552ri;
        if (this.bgr && (c3552ri = this.f9339nr) != null) {
            c3552ri.m16302ri(abstractC3217fi);
        }
    }

    /* JADX INFO: renamed from: ri */
    protected void mo11934ri(boolean z) {
        if (this.f9334bu != null) {
            C3552ri c3552ri = new C3552ri(this.f9335co.srn, this.f9340qt, this.f9335co.bnj, z, this.f9334bu, false, this.f9335co.ajz != null ? this.f9335co.ajz.srn() : 0);
            this.f9339nr = c3552ri;
            c3552ri.m16301ri(this.f9335co.f9397qd);
            this.f9339nr.m16306ri(true, mo11926lr());
        }
    }

    /* JADX INFO: renamed from: sf */
    public boolean m11935sf() {
        return !this.f9336ik;
    }

    /* JADX INFO: renamed from: vr */
    public boolean m11936vr() {
        C3344nr c3344nr = this.f9341ri;
        if (c3344nr != null) {
            return c3344nr.jbs();
        }
        return false;
    }

    public int xha() {
        return 0;
    }
}
