package com.bytedance.sdk.openadsdk.component.jbs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik;
import com.bytedance.sdk.component.adexpress.InterfaceC2488ik;
import com.bytedance.sdk.component.adexpress.dynamic.C2480ri;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka;
import com.bytedance.sdk.component.adexpress.p125lr.bgr;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.component.C3078ri;
import com.bytedance.sdk.openadsdk.component.p181di.C2959lr;
import com.bytedance.sdk.openadsdk.component.p181di.InterfaceC2960ri;
import com.bytedance.sdk.openadsdk.component.p186mj.C2979ik;
import com.bytedance.sdk.openadsdk.component.p186mj.C2981ri;
import com.bytedance.sdk.openadsdk.component.xha.C3087ri;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.jbs.C3222ac;
import com.bytedance.sdk.openadsdk.core.jbs.C3224ay;
import com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p200co.C3143fi;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.C3133ka;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.C3134lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.jbs.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2972lr extends C3222ac {

    /* JADX INFO: renamed from: di */
    private final C2959lr f9027di;

    /* JADX INFO: renamed from: dw */
    private InterfaceC2960ri f9028dw;

    /* JADX INFO: renamed from: fi */
    private final C3078ri f9029fi;
    private InterfaceC1999ik.ri hcw;

    /* JADX INFO: renamed from: ik */
    int f9030ik;

    /* JADX INFO: renamed from: ka */
    float f9031ka;

    /* JADX INFO: renamed from: lr */
    boolean f9032lr;

    /* JADX INFO: renamed from: mj */
    private C2979ik f9033mj;
    private FrameLayout ory;

    /* JADX INFO: renamed from: ri */
    boolean f9034ri;
    private final C2981ri xha;

    public C2972lr(Context context, wjv wjvVar, AdSlot adSlot, String str, C3078ri c3078ri, C2959lr c2959lr, C2981ri c2981ri) {
        super(context, wjvVar, adSlot, str, true, true);
        this.f9034ri = true;
        this.f9032lr = false;
        this.f9030ik = 0;
        this.f9031ka = 1.0f;
        this.f9029fi = c3078ri;
        this.f9027di = c2959lr;
        this.xha = c2981ri;
        if (wjvVar == null || wjvVar.cmy() == null) {
            return;
        }
        this.f9030ik = wjvVar.cmy().m14238lr();
        this.f9031ka = wjvVar.cmy().m14239ri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public void m11537ik(bgr bgrVar) {
        if (bgrVar == null) {
            return;
        }
        if (bgrVar.m8962ri() != null) {
            if (this.f9034ri) {
                bgrVar.m8962ri().setTag(C2480ri.f6822di, 1);
                ((FrameLayout) bgrVar.m8962ri()).removeAllViews();
                FrameLayout frameLayout = (FrameLayout) bgrVar.m8962ri();
                this.ory = frameLayout;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 17;
                this.f9034ri = false;
                return;
            }
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
            if ((this.f10750zf.mo8752ik() == 7 || this.f10750zf.mo8752ik() == 10 || (this.f10750zf instanceof C3133ka)) && (bgrVar instanceof C3134lr)) {
                FrameLayout frameLayoutM13090vr = ((C3134lr) bgrVar).m13090vr();
                if (frameLayoutM13090vr != null) {
                    if (this.ory.getParent() != null) {
                        ((ViewGroup) this.ory.getParent()).removeView(this.ory);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    frameLayoutM13090vr.addView(this.ory, layoutParams);
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.ory.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(iM16589lr3, iM16589lr4);
            }
            layoutParams2.width = iM16589lr3;
            layoutParams2.height = iM16589lr4;
            layoutParams2.topMargin = iM16589lr2;
            layoutParams2.leftMargin = iM16589lr;
            layoutParams2.setMarginStart(layoutParams2.leftMargin);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.ory.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: di */
    public void mo11539di() {
        InterfaceC2960ri interfaceC2960ri = this.f9028dw;
        if (interfaceC2960ri != null) {
            interfaceC2960ri.mo10543lr(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: fi */
    public int mo11540fi() {
        C2979ik c2979ik = this.f9033mj;
        if (c2979ik != null && c2979ik.xha()) {
            return 1;
        }
        C2979ik c2979ik2 = this.f9033mj;
        if (c2979ik2 != null && c2979ik2.m11588di()) {
            return 3;
        }
        C2979ik c2979ik3 = this.f9033mj;
        if (c2979ik3 != null && c2979ik3.m11589fi()) {
            return 2;
        }
        C2979ik c2979ik4 = this.f9033mj;
        if (c2979ik4 == null || !c2979ik4.m11590ik()) {
            C2979ik c2979ik5 = this.f9033mj;
            return (c2979ik5 == null || !c2979ik5.m11591ka()) ? 3 : 5;
        }
        xha(4);
        return 4;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac
    public int getDynamicShowType() {
        if (this.f10750zf == null) {
            return 1;
        }
        return super.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac
    protected int getRenderTimeout() {
        return C3087ri.m12357ri(this.f10718co, C3299nr.m14639ka().xha(String.valueOf(this.f10718co.m14545ur())));
    }

    public FrameLayout getVideoFrameLayout() {
        return this.ory;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ik */
    public long mo11541ik() {
        return this.xha.m11605ik();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac
    /* JADX INFO: renamed from: ik */
    protected void mo11542ik(JSONObject jSONObject) {
        C3087ri.m12363ri(jSONObject, this.f10718co != null ? this.f10718co.m14545ur() : 0, this.f10718co != null && this.f10718co.hpn() == 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ka */
    public long mo11543ka() {
        return this.xha.m11605ik();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: lr */
    public void mo11544lr() {
        super.mo11544lr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public void mo11545ri() {
        InterfaceC2960ri interfaceC2960ri = this.f9028dw;
        if (interfaceC2960ri != null) {
            interfaceC2960ri.mo10545ri(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public void mo11546ri(int i) {
        C2979ik c2979ik = this.f9033mj;
        if (c2979ik == null) {
            return;
        }
        if (i != 1) {
            if (i == 2) {
                c2979ik.m11593mj();
                this.f9027di.m11480ka();
                return;
            } else if (i == 3) {
                c2979ik.jbs();
                this.f9027di.m11479ik();
                return;
            } else if (i == 4) {
                c2979ik.m11594qt();
                return;
            } else if (i != 5) {
                return;
            }
        }
        if (c2979ik.m11589fi() || this.f9033mj.m11588di()) {
            return;
        }
        this.f9033mj.m11601ri(getVideoFrameLayout(), this.f9029fi, this.f10718co);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public void mo11547ri(int i, String str) {
    }

    /* JADX INFO: renamed from: ri */
    public void m11548ri(long j, long j2) {
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

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac
    /* JADX INFO: renamed from: ri */
    protected void mo11549ri(C2500aw.ri riVar) {
        riVar.m8922fi(C3087ri.m12359ri());
    }

    /* JADX INFO: renamed from: ri */
    public void m11550ri(final bgr bgrVar) {
        if (bgrVar == null) {
            return;
        }
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.jbs.lr.2
            @Override // java.lang.Runnable
            public void run() {
                C2972lr.this.m11537ik(bgrVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2513vr
    /* JADX INFO: renamed from: ri */
    public void mo9011ri(InterfaceC2505ka<? extends View> interfaceC2505ka, bgr bgrVar) {
        this.f10750zf = interfaceC2505ka;
        if (interfaceC2505ka instanceof C3224ay) {
            C3224ay c3224ay = (C3224ay) interfaceC2505ka;
            if (c3224ay.slm() != null) {
                c3224ay.slm().m13441ri((InterfaceC3247vr) this);
            }
        }
        if (bgrVar != null && bgrVar.m8959lr()) {
            m11550ri(bgrVar);
        }
        super.mo9011ri(interfaceC2505ka, bgrVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac, com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public boolean mo11551ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f9032lr = false;
            return false;
        }
        int i = this.f9030ik;
        if (i != 1 && i != 2) {
            this.f9032lr = false;
            return false;
        }
        int iOptInt = jSONObject.optInt("switch", 0);
        float fOptDouble = (float) jSONObject.optDouble("speed", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        this.f9031ka = fOptDouble;
        if (fOptDouble <= 0.0f && this.f10718co != null && this.f10718co.cmy() != null) {
            this.f9031ka = this.f10718co.cmy().m14239ri();
        }
        boolean z = iOptInt == 1;
        this.f9032lr = z;
        C2959lr c2959lr = this.f9027di;
        if (c2959lr != null) {
            c2959lr.m11486ri(this.f9030ik, this.f9031ka, z);
            C2979ik c2979ik = this.f9033mj;
            if (c2979ik != null && c2979ik.m11592lr() != null && this.xha != null) {
                this.f9033mj.m11592lr().mo6381ri(this.xha.m11610ri());
                C2707ac.m10205ri("PAGAppOpenAdExpressView", "isAccelerate =" + this.f9032lr + ",total duration = " + this.f9033mj.m11592lr().m12964bu());
            }
        }
        if (this.f9030ik == 1) {
            return true;
        }
        if (!this.f9032lr) {
            this.f9031ka = 1.0f;
        }
        C2979ik c2979ik2 = this.f9033mj;
        if (c2979ik2 != null) {
            return c2979ik2.m11600ri(this.f9031ka);
        }
        return false;
    }

    public void setExpressVideoListenerProxy(InterfaceC1999ik.ri riVar) {
        this.hcw = riVar;
    }

    public void setTopListener(InterfaceC2960ri interfaceC2960ri) {
        this.f9028dw = interfaceC2960ri;
    }

    public void setVideoManager(C2979ik c2979ik) {
        this.f9033mj = c2979ik;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac
    protected void xha() {
        this.f10745vr = true;
        this.ory = new FrameLayout(this.jbs);
        if (!C3143fi.m13132ri(this.f10718co) && !C3143fi.m13127lr(this.f10718co)) {
            addView(this.ory, new FrameLayout.LayoutParams(-1, -1));
        }
        super.xha();
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.p174aw.xha() { // from class: com.bytedance.sdk.openadsdk.component.jbs.lr.1
            @Override // com.bytedance.sdk.openadsdk.p174aw.xha
            /* JADX INFO: renamed from: ri */
            public void mo11100ri(bgr bgrVar) {
                C2972lr.this.m11550ri(bgrVar);
            }
        });
    }
}
