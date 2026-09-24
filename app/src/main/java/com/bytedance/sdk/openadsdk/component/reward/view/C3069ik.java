package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.InterfaceC2488ik;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2504ik;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka;
import com.bytedance.sdk.component.adexpress.p125lr.bgr;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy;
import com.bytedance.sdk.openadsdk.component.reward.C2993lr;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.core.jbs.C3222ac;
import com.bytedance.sdk.openadsdk.core.jbs.C3224ay;
import com.bytedance.sdk.openadsdk.core.jbs.C3227bu;
import com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.p200co.C3143fi;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.C3133ka;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.C3134lr;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.p202ri.C3137di;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2879di;
import com.bytedance.sdk.openadsdk.p175ay.p176lr.C2889fi;
import com.bytedance.sdk.openadsdk.p266uq.p268ri.C3552ri;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.view.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3069ik extends C3222ac {

    /* JADX INFO: renamed from: ri */
    public static float f9588ri = 100.0f;

    /* JADX INFO: renamed from: di */
    private float f9589di;

    /* JADX INFO: renamed from: fi */
    private final C3022ri f9590fi;

    /* JADX INFO: renamed from: ik */
    C3227bu f9591ik;

    /* JADX INFO: renamed from: ka */
    public int f9592ka;

    /* JADX INFO: renamed from: lr */
    InterfaceC3247vr f9593lr;
    private C3552ri xha;

    public C3069ik(C3022ri c3022ri, AdSlot adSlot, String str) {
        super(c3022ri.f9384ig, c3022ri.f9389lr, adSlot, str, c3022ri.zyn, !c3022ri.f9410xe);
        this.f9592ka = 1;
        this.f9589di = -1.0f;
        this.f9590fi = c3022ri;
        setVideoBusiness(c3022ri.f9397qd);
    }

    /* JADX INFO: renamed from: aw */
    private void m12239aw() {
        setBackupListener(new InterfaceC2504ik() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ik.2
            @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2504ik
            /* JADX INFO: renamed from: ri */
            public boolean mo8984ri(ViewGroup viewGroup, int i) {
                try {
                    ((C3222ac) viewGroup).m13566ac();
                    C3069ik.this.f9591ik = new C3227bu(viewGroup.getContext());
                    C3069ik.this.f9591ik.m13614ri(C3069ik.this.f10718co, (C3222ac) viewGroup, C3069ik.this.f9590fi.f9396pv);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: ik */
    private void m12240ik(bgr bgrVar) {
        FrameLayout frameLayoutSlm;
        boolean z;
        try {
            if (!(bgrVar instanceof C3134lr) || (frameLayoutSlm = ((C3134lr) bgrVar).slm()) == null) {
                return;
            }
            boolean z2 = true;
            if (this.f9590fi.ajz == null || this.f9590fi.ajz.m11008jc() == null) {
                z = false;
            } else {
                z = this.f9590fi.ajz.m11008jc().m10968sf() == this.f9590fi.ajz;
                if (!this.f9590fi.ajz.m11008jc().wjv() && z) {
                    z2 = false;
                }
            }
            boolean z3 = z2;
            C3552ri c3552ri = new C3552ri(this.jbs, this.f10718co, this.f9590fi.bnj, z3, frameLayoutSlm);
            this.xha = c3552ri;
            c3552ri.m16301ri(this.f9590fi.f9397qd);
            this.xha.m16306ri(false, (InterfaceC2879di) null);
            this.xha.mo16276ri();
            C2707ac.m10205ri("TTAD.FRExpressView", "initPlayable success mute = " + this.f9590fi.zyn + ",isCurrentScene->" + z + ",isMute = " + z3);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ka */
    public void m12241ka(bgr bgrVar) {
        if (bgrVar == null) {
            return;
        }
        double dM8947fi = bgrVar.m8947fi();
        double dM8945di = bgrVar.m8945di();
        double dXha = bgrVar.xha();
        double dM8960mj = bgrVar.m8960mj();
        int iM16589lr = C3583qd.m16589lr(this.jbs, (float) dM8947fi);
        int iM16589lr2 = C3583qd.m16589lr(this.jbs, (float) dM8945di);
        int iM16589lr3 = C3583qd.m16589lr(this.jbs, (float) dXha);
        int iM16589lr4 = C3583qd.m16589lr(this.jbs, (float) dM8960mj);
        if ((dM8960mj != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && dXha != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) || this.f10750zf.mo8752ik() == 7 || this.f10750zf.mo8752ik() == 10 || (this.f10750zf instanceof C3133ka)) {
            if ((this.f10750zf instanceof C3133ka) && (bgrVar instanceof C3134lr)) {
                FrameLayout frameLayoutM13090vr = ((C3134lr) bgrVar).m13090vr();
                if (frameLayoutM13090vr != null) {
                    if (this.f10715aw.getParent() != null) {
                        ((ViewGroup) this.f10715aw.getParent()).removeView(this.f10715aw);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    frameLayoutM13090vr.addView(this.f10715aw, layoutParams);
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f10715aw.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(iM16589lr3, iM16589lr4);
            }
            layoutParams2.width = iM16589lr3;
            layoutParams2.height = iM16589lr4;
            layoutParams2.topMargin = iM16589lr2;
            layoutParams2.leftMargin = iM16589lr;
            layoutParams2.setMarginStart(layoutParams2.leftMargin);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.f10715aw.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac
    /* JADX INFO: renamed from: co */
    public void mo12245co() {
        try {
            C3552ri c3552ri = this.xha;
            if (c3552ri != null) {
                c3552ri.m16297ka();
            }
        } catch (Throwable unused) {
        }
        if (!wjv() && (getExpressInteractionListener() instanceof PAGRewardFullExpressAdListenerProxy)) {
            ((PAGRewardFullExpressAdListenerProxy) getExpressInteractionListener()).triggerUnfinishedFail(this);
        }
        super.mo12245co();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: di */
    public void mo11539di() {
        InterfaceC3247vr interfaceC3247vr = this.f9593lr;
        if (interfaceC3247vr != null) {
            interfaceC3247vr.mo11539di();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C3075sf c3075sf = this.f9590fi.dzy;
        if (c3075sf != null && c3075sf.f9659vr != null) {
            C3273ac c3273ac = c3075sf.f9659vr;
            if (c3273ac.jbs()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f9589di = motionEvent.getY();
                } else if (action == 1) {
                }
                if (C3583qd.m16624ri(this.f9589di, motionEvent.getY(), this.jbs)) {
                    c3273ac.m14003lr(5);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: fi */
    public int mo11540fi() {
        InterfaceC3247vr interfaceC3247vr = this.f9593lr;
        if (interfaceC3247vr == null) {
            return 0;
        }
        int iMo11540fi = interfaceC3247vr.mo11540fi();
        xha(iMo11540fi);
        return iMo11540fi;
    }

    public View getBackupContainerBackgroundView() {
        if (ihz()) {
            return this.f9591ik.getBackupContainerBackgroundView();
        }
        return null;
    }

    public FrameLayout getVideoFrameLayout() {
        return ihz() ? this.f9591ik.getVideoContainer() : this.f10715aw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ik */
    public long mo11541ik() {
        InterfaceC3247vr interfaceC3247vr = this.f9593lr;
        if (interfaceC3247vr != null) {
            return interfaceC3247vr.mo11541ik();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac
    /* JADX INFO: renamed from: ik */
    protected C2889fi.ri mo12246ik(int i) {
        C2889fi.ri riVarMo12246ik = super.mo12246ik(i);
        if (this.f9590fi.f9410xe && this.f9590fi.ajz != null) {
            riVarMo12246ik.f8613lr = this.f9590fi.ajz.f8475sf;
        }
        return riVarMo12246ik;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac
    protected boolean jbs() {
        return this.f9590fi.ajz == null || !this.f9590fi.ajz.m11008jc().m10969su();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ka */
    public long mo11543ka() {
        InterfaceC3247vr interfaceC3247vr = this.f9593lr;
        if (interfaceC3247vr != null) {
            return interfaceC3247vr.mo11543ka();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: lr */
    public void mo11544lr() {
        InterfaceC3247vr interfaceC3247vr = this.f9593lr;
        if (interfaceC3247vr != null) {
            interfaceC3247vr.mo11544lr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: lr */
    public void mo11880lr(int i) {
        InterfaceC3247vr interfaceC3247vr = this.f9593lr;
        if (interfaceC3247vr != null) {
            interfaceC3247vr.mo11880lr(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: lr */
    public boolean mo11881lr(JSONObject jSONObject) {
        return C2993lr.m11712ri(this.f9590fi);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac
    /* JADX INFO: renamed from: mj */
    protected boolean mo12247mj() {
        if (this.f9590fi.ajz == null || !this.f9590fi.ajz.m11008jc().m10969su()) {
            return true;
        }
        return this.f9590fi.tnn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac
    /* JADX INFO: renamed from: qt */
    public void mo12248qt() {
        super.mo12248qt();
        if (this.xha != null) {
            if (this.f9590fi.ajz != null && this.f9590fi.ajz.m11008jc() != null) {
                this.xha.m16305ri(this.f9590fi.ajz.m11008jc().wjv());
            }
            this.xha.m16298lr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public void mo11545ri() {
        InterfaceC3247vr interfaceC3247vr = this.f9593lr;
        if (interfaceC3247vr != null) {
            interfaceC3247vr.mo11545ri();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public void mo11546ri(int i) {
        InterfaceC3247vr interfaceC3247vr = this.f9593lr;
        if (interfaceC3247vr != null) {
            interfaceC3247vr.mo11546ri(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public void mo11882ri(int i, bgr bgrVar) {
        InterfaceC3247vr interfaceC3247vr = this.f9593lr;
        if (interfaceC3247vr != null) {
            interfaceC3247vr.mo11882ri(i, bgrVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public void mo11547ri(int i, String str) {
        InterfaceC3247vr interfaceC3247vr = this.f9593lr;
        if (interfaceC3247vr != null) {
            interfaceC3247vr.mo11547ri(i, str);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12249ri(long j, long j2) {
        if (this.f10750zf instanceof C3133ka) {
            ((C3133ka) this.f10750zf).mo13081ri(j, j2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2507mj
    /* JADX INFO: renamed from: ri */
    public void mo9002ri(View view, int i, InterfaceC2488ik interfaceC2488ik) {
        if (i == -1 || interfaceC2488ik == null || i != 3) {
            super.mo9002ri(view, i, interfaceC2488ik);
        } else {
            mo11539di();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12250ri(final bgr bgrVar) {
        if (bgrVar == null) {
            return;
        }
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ik.3
            @Override // java.lang.Runnable
            public void run() {
                C3069ik.this.m12241ka(bgrVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2513vr
    /* JADX INFO: renamed from: ri */
    public void mo9011ri(InterfaceC2505ka<? extends View> interfaceC2505ka, bgr bgrVar) {
        this.f10750zf = interfaceC2505ka;
        if (this.f10718co != null && this.f10718co.vgs()) {
            super.mo9011ri(interfaceC2505ka, bgrVar);
            return;
        }
        if (interfaceC2505ka instanceof C3224ay) {
            C3224ay c3224ay = (C3224ay) interfaceC2505ka;
            if (c3224ay.slm() != null) {
                c3224ay.slm().m13441ri((InterfaceC3247vr) this);
            }
        }
        if (bgrVar != null && bgrVar.m8959lr()) {
            m12250ri(bgrVar);
            this.f9592ka = interfaceC2505ka.mo8752ik();
            if ((this.f10750zf instanceof C3133ka) && C3279dw.m14090ik(this.f10718co)) {
                m12240ik(bgrVar);
            }
            if (interfaceC2505ka instanceof C3137di) {
                this.f9590fi.ihz.m12130fi(true);
            }
        }
        super.mo9011ri(interfaceC2505ka, bgrVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public void mo11883ri(String str, JSONObject jSONObject) {
        super.mo11883ri(str, jSONObject);
        InterfaceC3247vr interfaceC3247vr = this.f9593lr;
        if (interfaceC3247vr != null) {
            interfaceC3247vr.mo11883ri(str, jSONObject);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public void mo11884ri(boolean z, String str) {
        InterfaceC3247vr interfaceC3247vr = this.f9593lr;
        if (interfaceC3247vr != null) {
            interfaceC3247vr.mo11884ri(z, str);
        }
        setSoundMute(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public boolean mo11551ri(JSONObject jSONObject) {
        Objects.toString(jSONObject);
        InterfaceC3247vr interfaceC3247vr = this.f9593lr;
        return interfaceC3247vr != null ? interfaceC3247vr.mo11551ri(jSONObject) : super.mo11551ri(jSONObject);
    }

    public void setExpressVideoListenerProxy(InterfaceC3247vr interfaceC3247vr) {
        this.f9593lr = interfaceC3247vr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2469ka
    public void setSoundMute(boolean z) {
        super.setSoundMute(z);
        C3552ri c3552ri = this.xha;
        if (c3552ri != null) {
            c3552ri.m16305ri(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac
    /* JADX INFO: renamed from: sf */
    public void mo12251sf() {
        super.mo12251sf();
        if (this.xha != null) {
            if (this.f9590fi.ajz != null && this.f9590fi.ajz.m11008jc() != null) {
                this.xha.m16305ri(true);
            }
            this.xha.m16296ik();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac
    protected void xha() {
        this.f10745vr = true;
        this.f10715aw = new FrameLayout(this.jbs);
        if (!C3143fi.m13132ri(this.f10718co) && !C3143fi.m13127lr(this.f10718co)) {
            addView(this.f10715aw, new FrameLayout.LayoutParams(-1, -1));
        }
        super.xha();
        C2634di webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        m12239aw();
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.p174aw.xha() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ik.1
            @Override // com.bytedance.sdk.openadsdk.p174aw.xha
            /* JADX INFO: renamed from: ri */
            public void mo11100ri(bgr bgrVar) {
                C3069ik.this.m12250ri(bgrVar);
            }
        });
    }
}
