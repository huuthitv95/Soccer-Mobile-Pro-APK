package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.activity.single.C2853fi;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.widget.DialogC3342lr;

/* JADX INFO: loaded from: classes3.dex */
public abstract class slm {

    /* JADX INFO: renamed from: di */
    protected String f8877di;

    /* JADX INFO: renamed from: fi */
    protected String f8878fi;

    /* JADX INFO: renamed from: ik */
    protected String f8879ik;

    /* JADX INFO: renamed from: ka */
    protected String f8880ka;

    /* JADX INFO: renamed from: lr */
    protected String f8881lr;
    protected final C3022ri xha;

    public slm(C3022ri c3022ri) {
        this.xha = c3022ri;
        m11420fi();
    }

    /* JADX INFO: renamed from: di */
    private boolean m11419di() {
        return !this.xha.f9410xe && this.xha.jbs.get();
    }

    /* JADX INFO: renamed from: fi */
    private void m11420fi() {
        if (this.f8881lr != null) {
            return;
        }
        try {
            this.f8881lr = C2729uq.m10311ri(this.xha.srn, "tt_reward_msg");
            this.f8879ik = C2729uq.m10311ri(this.xha.srn, "tt_msgPlayable");
            this.f8877di = C2729uq.m10311ri(this.xha.srn, "tt_negtiveBtnBtnText");
            this.f8880ka = C2729uq.m10311ri(this.xha.srn, "tt_postiveBtnText");
            this.f8878fi = C2729uq.m10311ri(this.xha.srn, "tt_postiveBtnTextPlayable");
        } catch (Throwable th) {
            C2707ac.m10196ik("RewardTipDialogHelper", "init res text failed：" + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public void m11421ik(boolean z) {
        this.xha.ihz.ihz();
        if (z) {
            this.xha.wjv.m11969ri(1000);
        }
        this.xha.f9375bu.set(false);
    }

    /* JADX INFO: renamed from: ik */
    private void m11422ik(final boolean z, final Runnable runnable) {
        m11423lr(z);
        C3022ri c3022ri = this.xha;
        if (c3022ri == null || c3022ri.f9384ig.isFinishing() || this.xha.f9384ig.isDestroyed()) {
            C2707ac.m10196ik("RewardTipDialogHelper", "adContext or activity is null");
            return;
        }
        final DialogC3342lr dialogC3342lr = new DialogC3342lr(this.xha.f9384ig);
        if (this.xha.f9391nd == null) {
            C2707ac.m10196ik("RewardTipDialogHelper", "adContext or  adType == null");
            return;
        }
        this.xha.f9391nd.f9195co = dialogC3342lr;
        if (z) {
            dialogC3342lr.m15019ri(this.f8879ik).m15017lr(this.f8878fi).m15016ik(this.f8877di);
        } else {
            dialogC3342lr.m15019ri(this.f8881lr).m15017lr(this.f8880ka).m15016ik(this.f8877di);
        }
        dialogC3342lr.m15018ri(new DialogC3342lr.lr() { // from class: com.bytedance.sdk.openadsdk.common.slm.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.DialogC3342lr.lr
            /* JADX INFO: renamed from: lr */
            public void mo10702lr() {
                dialogC3342lr.dismiss();
                slm.this.mo10700ri(true);
                slm.this.xha.f9375bu.set(false);
                slm.this.xha.wjv.m11963lr(Integer.MAX_VALUE);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                if (!z) {
                    slm.this.m11430ka();
                } else if (slm.this.xha.f9410xe || !slm.this.m11426mj()) {
                    slm.this.xha.f9402su.m11985di();
                    slm.this.mo10697ik();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.DialogC3342lr.lr
            /* JADX INFO: renamed from: ri */
            public void mo10703ri() {
                slm.this.m11421ik(z);
                dialogC3342lr.dismiss();
            }
        }).show();
    }

    private boolean jbs() {
        return !this.xha.f9389lr.zyn() && C3279dw.m14093mj(this.xha.f9389lr) && this.xha.ory.m12091mj().getVisibility() == 0;
    }

    /* JADX INFO: renamed from: lr */
    private void m11423lr(boolean z) {
        this.xha.ihz.m12168uq();
        if (z) {
            this.xha.wjv.m11957di();
        }
        this.xha.f9375bu.set(true);
    }

    /* JADX INFO: renamed from: lr */
    private void m11424lr(boolean z, Runnable runnable) {
        if (!(m11419di() && m11426mj()) && runnable == null) {
            if (z) {
                mo10697ik();
            } else {
                m11430ka();
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    private boolean m11425lr(boolean z, boolean z2, Runnable runnable) {
        if ((z || !m11419di() || !m11426mj()) && runnable == null) {
            if (z2) {
                mo10697ik();
                return true;
            }
            m11430ka();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: mj */
    public boolean m11426mj() {
        if (!C3279dw.m14093mj(this.xha.f9389lr)) {
            return false;
        }
        this.xha.wjv.jbs();
        return true;
    }

    /* JADX INFO: renamed from: ri */
    private boolean m11429ri(boolean z, Runnable runnable) {
        if (z || !mo10701ri()) {
            return false;
        }
        if (!this.xha.f9410xe) {
            if (m11419di()) {
                return m11426mj();
            }
            return false;
        }
        if (runnable != null) {
            return true;
        }
        m11430ka();
        return true;
    }

    private boolean xha() {
        return C3299nr.m14639ka().m14861mj(String.valueOf(this.xha.f9377di));
    }

    /* JADX INFO: renamed from: ik */
    protected abstract void mo10697ik();

    /* JADX INFO: renamed from: ka */
    public void m11430ka() {
        C3022ri c3022ri = this.xha;
        if (c3022ri == null) {
            C2707ac.m10197ik("execSkipTaskBaseImpl adContext is null", new Object[0]);
            return;
        }
        if (c3022ri.ajz == null || !(this.xha.ajz instanceof C2853fi)) {
            this.xha.ihz.m12145oh();
            C2951ri.m11407ri(this.xha);
            mo10699ri(this.xha);
        } else {
            if (((C2853fi) this.xha.ajz).m10790mj()) {
                return;
            }
            mo10697ik();
        }
    }

    /* JADX INFO: renamed from: lr */
    protected abstract boolean mo10698lr();

    /* JADX INFO: renamed from: ri */
    protected abstract void mo10699ri(C3022ri c3022ri);

    /* JADX INFO: renamed from: ri */
    protected abstract void mo10700ri(boolean z);

    /* JADX INFO: renamed from: ri */
    protected abstract boolean mo10701ri();

    /* JADX INFO: renamed from: ri */
    public final boolean m11431ri(boolean z, boolean z2, Runnable runnable) {
        if (this.xha.ajz instanceof C2853fi) {
            if (!this.xha.f9387ka || mo10698lr() || (this.xha.ajz.m11008jc() != null && this.xha.ajz.m11008jc().m10927bu())) {
                return false;
            }
            if (!z2 && mo10701ri()) {
                return false;
            }
            if (!xha()) {
                if (!z2) {
                    return false;
                }
                if (runnable == null && z) {
                    mo10697ik();
                    return true;
                }
            }
        } else {
            if (m11429ri(z2, runnable)) {
                return false;
            }
            if (!xha()) {
                return m11425lr(z2, z, runnable);
            }
            if (mo10698lr()) {
                m11424lr(z, runnable);
                return false;
            }
            if (jbs()) {
                this.xha.wjv.jbs();
                return false;
            }
        }
        m11422ik(z, runnable);
        return true;
    }
}
