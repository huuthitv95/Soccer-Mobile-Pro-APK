package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik;
import com.bytedance.sdk.component.adexpress.InterfaceC2488ik;
import com.bytedance.sdk.component.adexpress.dynamic.C2480ri;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di;
import com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3122ik;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.C3133ka;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.C3134lr;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.p202ri.C3137di;
import com.bytedance.sdk.openadsdk.p252ri.p256lr.InterfaceC3502ik;
import com.bytedance.sdk.openadsdk.tan.p262ik.C3534ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes3.dex */
public class tan extends C3222ac implements InterfaceC1999ik.ik, InterfaceC1999ik.ka {

    /* JADX INFO: renamed from: di */
    boolean f10887di;

    /* JADX INFO: renamed from: dw */
    private C3534ri f10888dw;
    private C3120di dzy;

    /* JADX INFO: renamed from: fi */
    int f10889fi;
    private long hcw;

    /* JADX INFO: renamed from: ik */
    boolean f10890ik;

    /* JADX INFO: renamed from: ka */
    boolean f10891ka;

    /* JADX INFO: renamed from: lr */
    int f10892lr;

    /* JADX INFO: renamed from: mj */
    int f10893mj;

    /* JADX INFO: renamed from: oh */
    private InterfaceC3502ik f10894oh;
    private long ory;

    /* JADX INFO: renamed from: ri */
    private slm f10895ri;

    /* JADX INFO: renamed from: xd */
    private boolean f10896xd;
    boolean xha;

    public tan(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, AdSlot adSlot, String str, boolean z) {
        super(context, wjvVar, adSlot, str, false, true);
        this.f10892lr = 1;
        this.f10890ik = false;
        this.f10891ka = true;
        this.f10887di = true;
        this.xha = true;
        this.f10893mj = -1;
        this.f10896xd = z;
        bgr();
    }

    /* JADX INFO: renamed from: fr */
    private void m13729fr() {
        try {
            this.f10888dw = new C3534ri();
            slm slmVar = new slm(this.jbs, this.f10718co, this.f10738qt, this.f10723fr, this.f10896xd);
            this.f10895ri = slmVar;
            slmVar.setShouldCheckNetChange(false);
            this.f10895ri.setControllerStatusCallBack(new C3120di.lr() { // from class: com.bytedance.sdk.openadsdk.core.jbs.tan.2
                @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di.lr
                /* JADX INFO: renamed from: ri */
                public void mo12819ri(boolean z, long j, long j2, long j3, boolean z2) {
                    tan.this.f10888dw.f12841ri = z;
                    tan.this.f10888dw.f12837fi = j;
                    tan.this.f10888dw.f12836di = j2;
                    tan.this.f10888dw.xha = j3;
                    tan.this.f10888dw.f12839ka = z2;
                }
            });
            this.f10895ri.setVideoAdLoadListener(this);
            this.f10895ri.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.f10738qt)) {
                this.f10895ri.setIsAutoPlay(this.f10890ik ? this.f10740sf.isAutoPlay() : this.f10891ka);
            } else if ("open_ad".equals(this.f10738qt)) {
                this.f10895ri.setIsAutoPlay(true);
            } else {
                this.f10895ri.setIsAutoPlay(this.f10891ka);
            }
            if ("open_ad".equals(this.f10738qt)) {
                this.f10895ri.m12815ri(true, "initVideo");
            } else {
                this.f10744uq = C3299nr.m14639ka().m14853ik(String.valueOf(this.f10889fi));
                this.f10895ri.m12815ri(this.f10744uq, "initVideo");
            }
            this.f10895ri.m13727ka();
        } catch (Exception unused) {
            this.f10895ri = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public void m13730ik(com.bytedance.sdk.component.adexpress.p125lr.bgr bgrVar) {
        C3122ik videoController;
        if (m13736ri(bgrVar, false)) {
            this.f10715aw.removeAllViews();
            if (this.f10895ri != null) {
                if ((this.f10750zf instanceof C3133ka) && (bgrVar instanceof C3134lr)) {
                    FrameLayout frameLayoutM13090vr = ((C3134lr) bgrVar).m13090vr();
                    if (frameLayoutM13090vr != null) {
                        frameLayoutM13090vr.removeAllViews();
                        if (this.f10893mj == 10) {
                            this.f10895ri.setClickable(false);
                        }
                        frameLayoutM13090vr.addView(this.f10895ri, new FrameLayout.LayoutParams(-1, -1));
                    }
                    if ((this.f10750zf instanceof C3137di) && (videoController = getVideoController()) != null) {
                        videoController.m12938di(false);
                    }
                } else if (bgrVar.m8962ri() == null) {
                    this.f10715aw.addView(this.f10895ri);
                } else if (this.xha) {
                    bgrVar.m8962ri().setTag(C2480ri.f6822di, 1);
                    ((FrameLayout) bgrVar.m8962ri()).removeAllViews();
                    ((FrameLayout) bgrVar.m8962ri()).addView(this.f10895ri, new FrameLayout.LayoutParams(-1, -1));
                    this.xha = false;
                }
                this.f10895ri.m12816ri(0L, true, false);
                m13740ka(this.f10889fi);
                if (!C2724nr.m10256ka(this.jbs) && !this.f10891ka && this.f10887di) {
                    this.f10895ri.m13726fi();
                }
                if (TextUtils.equals("embeded_ad", this.f10738qt)) {
                    return;
                }
                setShowAdInteractionView(false);
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m13732lr(long j, long j2) {
        int iAbs = (int) Math.abs(((long) this.f10732nr) - j);
        if (this.f10732nr < 0 || iAbs > 500 || this.f10732nr > j2 || iAbs >= 500 || this.f10714ac.contains(this.tan)) {
            return;
        }
        if (this.f10732nr > j) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.tan.4
                @Override // java.lang.Runnable
                public void run() {
                    tan.this.f10895ri.setCanInterruptVideoPlay(true);
                    tan.this.f10895ri.performClick();
                    tan tanVar = tan.this;
                    tanVar.m13571lr(tanVar.f10732nr, tan.this.tan);
                }
            }, iAbs);
        } else {
            this.f10895ri.setCanInterruptVideoPlay(true);
            this.f10895ri.performClick();
            m13571lr(this.f10732nr, this.tan);
        }
        this.f10714ac.add(this.tan);
    }

    /* JADX INFO: renamed from: ri */
    private void m13734ri(final com.bytedance.sdk.component.adexpress.p125lr.bgr bgrVar) {
        if (bgrVar == null) {
            return;
        }
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.tan.3
            @Override // java.lang.Runnable
            public void run() {
                tan.this.m13730ik(bgrVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public boolean m13736ri(com.bytedance.sdk.component.adexpress.p125lr.bgr bgrVar, boolean z) {
        int i;
        double dM8947fi = bgrVar.m8947fi();
        double dM8945di = bgrVar.m8945di();
        double dXha = bgrVar.xha();
        double dM8960mj = bgrVar.m8960mj();
        if ((dXha == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || dM8960mj == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) && (i = this.f10893mj) != 7 && i != 10 && i != 9 && !(this.f10750zf instanceof C3133ka)) {
            return false;
        }
        int iM16589lr = C3583qd.m16589lr(this.jbs, (float) dM8947fi);
        int iM16589lr2 = C3583qd.m16589lr(this.jbs, (float) dM8945di);
        int iM16589lr3 = C3583qd.m16589lr(this.jbs, (float) dXha);
        int iM16589lr4 = C3583qd.m16589lr(this.jbs, (float) dM8960mj);
        float fMin = Math.min(Math.min(C3583qd.m16589lr(this.jbs, bgrVar.m8969sf()), C3583qd.m16589lr(this.jbs, bgrVar.m8944co())), Math.min(C3583qd.m16589lr(this.jbs, bgrVar.m8943aw()), C3583qd.m16589lr(this.jbs, bgrVar.bgr())));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f10715aw.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(iM16589lr3, iM16589lr4);
        }
        layoutParams.width = iM16589lr3;
        layoutParams.height = iM16589lr4;
        layoutParams.topMargin = iM16589lr2;
        layoutParams.leftMargin = iM16589lr;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        this.f10715aw.setLayoutParams(layoutParams);
        C3583qd.m16593lr(this.f10715aw, fMin);
        slm slmVar = this.f10895ri;
        if (slmVar == null || !z) {
            return true;
        }
        slmVar.m13728ri(iM16589lr3, iM16589lr4);
        return true;
    }

    private void setShowAdInteractionView(boolean z) {
        slm slmVar = this.f10895ri;
        if (slmVar != null) {
            slmVar.setShowAdInteractionView(z);
        }
    }

    /* JADX INFO: renamed from: aw */
    public boolean m13738aw() {
        return this.f10896xd;
    }

    protected void bgr() {
        this.f10715aw = new FrameLayout(this.jbs);
        int iM14545ur = this.f10718co != null ? this.f10718co.m14545ur() : 0;
        this.f10889fi = iM14545ur;
        m13740ka(iM14545ur);
        m13729fr();
        addView(this.f10715aw, new FrameLayout.LayoutParams(-1, -1));
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.p174aw.xha() { // from class: com.bytedance.sdk.openadsdk.core.jbs.tan.1
            @Override // com.bytedance.sdk.openadsdk.p174aw.xha
            /* JADX INFO: renamed from: ri */
            public void mo11100ri(final com.bytedance.sdk.component.adexpress.p125lr.bgr bgrVar) {
                dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.tan.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        tan.this.m13736ri(bgrVar, true);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: bu */
    public void m13739bu() {
        C3122ik videoController = getVideoController();
        if (videoController instanceof C3122ik) {
            videoController.m12947ri(3, true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: di */
    public void mo11539di() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: fi */
    public int mo11540fi() {
        slm slmVar;
        if (this.f10892lr == 3 && (slmVar = this.f10895ri) != null) {
            slmVar.m13727ka();
        }
        slm slmVar2 = this.f10895ri;
        if (slmVar2 != null && slmVar2.getNativeVideoController().bgr()) {
            this.f10892lr = 1;
        }
        xha(this.f10892lr);
        return this.f10892lr;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ik
    /* JADX INFO: renamed from: g_ */
    public void mo6390g_() {
        this.f10887di = false;
        this.f10892lr = 2;
        InterfaceC3502ik interfaceC3502ik = this.f10894oh;
        if (interfaceC3502ik != null) {
            interfaceC3502ik.mo13807ri(null);
        }
    }

    protected slm getExpressVideoView() {
        return this.f10895ri;
    }

    public InterfaceC3502ik getVideoAdListener() {
        return this.f10894oh;
    }

    public C3122ik getVideoController() {
        slm slmVar = this.f10895ri;
        if (slmVar != null) {
            return slmVar.getNativeVideoController();
        }
        return null;
    }

    public C3534ri getVideoModel() {
        return this.f10888dw;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ik
    /* JADX INFO: renamed from: h_ */
    public void mo6391h_() {
        this.f10887di = false;
        this.bgr = true;
        this.f10892lr = 3;
        InterfaceC3502ik interfaceC3502ik = this.f10894oh;
        if (interfaceC3502ik != null) {
            interfaceC3502ik.mo13805lr(null);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ik
    /* JADX INFO: renamed from: i_ */
    public void mo6392i_() {
        this.f10887di = false;
        this.bgr = false;
        this.f10892lr = 2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ik */
    public long mo11541ik() {
        return this.ory;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ik
    /* JADX INFO: renamed from: j_ */
    public void mo6393j_() {
        this.f10887di = false;
        this.f10892lr = 5;
        if (this.igq != null && this.igq.m9001lr() != null) {
            this.igq.m9001lr().onvideoComplate();
        }
        InterfaceC3502ik interfaceC3502ik = this.f10894oh;
        if (interfaceC3502ik != null) {
            interfaceC3502ik.mo13804ik(null);
        }
        if (this.f10750zf instanceof C3133ka) {
            ((C3133ka) this.f10750zf).onvideoComplate();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ka */
    public long mo11543ka() {
        return this.ory;
    }

    /* JADX INFO: renamed from: ka */
    void m13740ka(int i) {
        int iM14858lr = C3299nr.m14639ka().m14858lr(i);
        if (3 == iM14858lr) {
            this.f10890ik = false;
            this.f10891ka = false;
        } else if (4 == iM14858lr) {
            this.f10890ik = true;
        } else {
            int iM10255ik = C2724nr.m10255ik(C3299nr.m14642ri());
            if (1 == iM14858lr) {
                this.f10890ik = false;
                this.f10891ka = C3571ig.m16451ka(iM10255ik);
            } else if (2 == iM14858lr) {
                if (C3571ig.m16441fi(iM10255ik) || C3571ig.m16451ka(iM10255ik) || C3571ig.m16437di(iM10255ik)) {
                    this.f10890ik = false;
                    this.f10891ka = true;
                }
            } else if (5 == iM14858lr && (C3571ig.m16451ka(iM10255ik) || C3571ig.m16437di(iM10255ik))) {
                this.f10890ik = false;
                this.f10891ka = true;
            }
        }
        if (this.f10891ka) {
            return;
        }
        this.f10892lr = 3;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: lr */
    public void mo11544lr() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public void mo11545ri() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public void mo11546ri(int i) {
        slm slmVar = this.f10895ri;
        if (slmVar == null) {
            return;
        }
        if (i == 1) {
            slmVar.m12816ri(0L, true, false);
            return;
        }
        if (i == 2 || i == 3) {
            slmVar.setCanInterruptVideoPlay(true);
            this.f10895ri.performClick();
        } else if (i == 4) {
            slmVar.getNativeVideoController().mo6374fi();
        } else {
            if (i != 5) {
                return;
            }
            slmVar.m12816ri(0L, true, false);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ka
    /* JADX INFO: renamed from: ri */
    public void mo6395ri(int i, int i2) {
        this.ory = this.hcw;
        this.f10892lr = 4;
        InterfaceC3502ik interfaceC3502ik = this.f10894oh;
        if (interfaceC3502ik != null) {
            interfaceC3502ik.mo13806ri(i, i2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public void mo11547ri(int i, String str) {
        this.f10732nr = i;
        this.tan = str;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ik
    /* JADX INFO: renamed from: ri */
    public void mo6394ri(long j, long j2) {
        this.f10887di = false;
        int i = this.f10892lr;
        if (i != 5 && i != 3 && j > this.ory) {
            this.f10892lr = 2;
        }
        this.ory = j;
        this.hcw = j2;
        if (this.igq != null && this.igq.m9001lr() != null) {
            this.igq.m9001lr().setTimeUpdate(((int) (j2 - j)) / 1000);
        }
        if (this.f10750zf instanceof C3133ka) {
            ((C3133ka) this.f10750zf).setTimeUpdate(((int) (j2 - j)) / 1000);
            ((C3133ka) this.f10750zf).mo13081ri(j, j2);
        }
        m13732lr(j, j2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2507mj
    /* JADX INFO: renamed from: ri */
    public void mo9002ri(View view, int i, InterfaceC2488ik interfaceC2488ik) {
        if (i == -1 || interfaceC2488ik == null) {
            return;
        }
        if (i != 11) {
            super.mo9002ri(view, i, interfaceC2488ik);
            return;
        }
        try {
            slm slmVar = this.f10895ri;
            if (slmVar != null) {
                slmVar.setCanInterruptVideoPlay(true);
                this.f10895ri.performClick();
                if (this.bgr) {
                    this.f10895ri.findViewById(com.bytedance.sdk.openadsdk.utils.slm.bzf).setVisibility(0);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2513vr
    /* JADX INFO: renamed from: ri */
    public void mo9011ri(InterfaceC2505ka<? extends View> interfaceC2505ka, com.bytedance.sdk.component.adexpress.p125lr.bgr bgrVar) {
        this.f10750zf = interfaceC2505ka;
        this.f10893mj = interfaceC2505ka.mo8752ik();
        if ((this.f10750zf instanceof C3224ay) && ((C3224ay) this.f10750zf).slm() != null) {
            ((C3224ay) this.f10750zf).slm().m13441ri((InterfaceC3247vr) this);
        }
        if (bgrVar != null && bgrVar.m8959lr()) {
            m13734ri(bgrVar);
        }
        super.mo9011ri(interfaceC2505ka, bgrVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public void mo11884ri(boolean z, String str) {
        slm slmVar;
        Boolean.valueOf(z);
        if (this.f10718co.svc() || (slmVar = this.f10895ri) == null) {
            return;
        }
        slmVar.m12815ri(z, str);
        setSoundMute(z);
    }

    public void setBackupVideoView(C3120di c3120di) {
        this.dzy = c3120di;
    }

    public void setVideoAdListener(InterfaceC3502ik interfaceC3502ik) {
        this.f10894oh = interfaceC3502ik;
    }

    public void slm() {
        C3120di c3120di = this.dzy;
        if (c3120di != null) {
            c3120di.m12818vr();
            return;
        }
        slm slmVar = this.f10895ri;
        if (slmVar != null) {
            slmVar.m12818vr();
        }
    }

    /* JADX INFO: renamed from: vr */
    public void m13741vr() {
        C3120di c3120di = this.dzy;
        if (c3120di != null) {
            c3120di.m12804aw();
            return;
        }
        slm slmVar = this.f10895ri;
        if (slmVar != null) {
            slmVar.m12804aw();
        }
    }
}
