package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.p122fi.AbstractC2487ri;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.jbs.C3235mj;
import com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3371ka;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.InterfaceC3370ik;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jbs {

    /* JADX INFO: renamed from: di */
    private final Activity f9598di;
    private C3069ik jbs;

    /* JADX INFO: renamed from: lr */
    Handler f9602lr;

    /* JADX INFO: renamed from: mj */
    private final String f9603mj;

    /* JADX INFO: renamed from: qt */
    private C3022ri f9604qt;

    /* JADX INFO: renamed from: ri */
    InterfaceC3370ik f9605ri;

    /* JADX INFO: renamed from: sf */
    private boolean f9606sf;
    private final wjv xha;

    /* JADX INFO: renamed from: ik */
    boolean f9600ik = false;

    /* JADX INFO: renamed from: ka */
    boolean f9601ka = false;

    /* JADX INFO: renamed from: fi */
    boolean f9599fi = false;

    public jbs(C3022ri c3022ri) {
        this.f9604qt = c3022ri;
        this.f9598di = c3022ri.f9384ig;
        this.xha = c3022ri.f9389lr;
        this.f9603mj = c3022ri.f9381fi;
    }

    /* JADX INFO: renamed from: lr */
    private InterfaceC3370ik m12252lr(wjv wjvVar) {
        if (wjvVar.adz() == 4) {
            return C3371ka.m15240ri(this.f9598di, this.f9603mj);
        }
        return null;
    }

    /* JADX INFO: renamed from: aw */
    public void m12253aw() {
        C3069ik c3069ik = this.jbs;
        if (c3069ik == null) {
            return;
        }
        c3069ik.m13573nr();
    }

    public void bgr() {
        C3069ik c3069ik = this.jbs;
        if (c3069ik == null) {
            return;
        }
        c3069ik.tan();
        this.jbs.mo12248qt();
    }

    /* JADX INFO: renamed from: co */
    public boolean m12254co() {
        C3069ik c3069ik = this.jbs;
        if (c3069ik != null) {
            return c3069ik.f10750zf instanceof AbstractC2487ri;
        }
        return false;
    }

    /* JADX INFO: renamed from: di */
    public void m12255di() {
        if (this.f9606sf) {
            return;
        }
        this.f9606sf = true;
        C3069ik c3069ik = this.jbs;
        if (c3069ik != null) {
            c3069ik.mo12245co();
        }
        Handler handler = this.f9602lr;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: fi */
    public Handler m12256fi() {
        if (this.f9602lr == null) {
            this.f9602lr = new Handler(Looper.getMainLooper());
        }
        return this.f9602lr;
    }

    /* JADX INFO: renamed from: ik */
    public boolean m12257ik() {
        return this.f9600ik;
    }

    public boolean jbs() {
        C3069ik c3069ik = this.jbs;
        if (c3069ik == null) {
            return false;
        }
        return c3069ik.ihz();
    }

    /* JADX INFO: renamed from: ka */
    public boolean m12258ka() {
        return this.f9601ka;
    }

    /* JADX INFO: renamed from: lr */
    public FrameLayout m12259lr() {
        C3069ik c3069ik = this.jbs;
        if (c3069ik == null) {
            return null;
        }
        FrameLayout videoFrameLayout = c3069ik.getVideoFrameLayout();
        if (this.jbs.ihz()) {
            m12275vr();
        }
        return videoFrameLayout;
    }

    /* JADX INFO: renamed from: lr */
    public void m12260lr(boolean z) {
        this.f9601ka = z;
    }

    /* JADX INFO: renamed from: mj */
    public void m12261mj() {
        C3069ik c3069ik = this.jbs;
        if (c3069ik != null) {
            c3069ik.mo12251sf();
        }
    }

    /* JADX INFO: renamed from: qt */
    public boolean m12262qt() {
        C3069ik c3069ik = this.jbs;
        return c3069ik != null && c3069ik.wjv();
    }

    /* JADX INFO: renamed from: ri */
    public C3069ik m12263ri() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: ri */
    public JSONObject m12264ri(JSONObject jSONObject) {
        C3069ik c3069ik = this.jbs;
        if (c3069ik != null) {
            return c3069ik.m13574ri(jSONObject, this.f9604qt.f9389lr);
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public void m12265ri(int i, String str) {
        C3069ik c3069ik = this.jbs;
        if (c3069ik != null) {
            c3069ik.m13571lr(i, str);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12266ri(int i, boolean z) {
        C3069ik c3069ik = this.jbs;
        if (c3069ik != null) {
            c3069ik.m13575ri(i, z, false);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12267ri(AdSlot adSlot, C3273ac c3273ac) {
        if (this.f9599fi) {
            return;
        }
        this.f9599fi = true;
        C3069ik c3069ik = new C3069ik(this.f9604qt, adSlot, this.f9603mj);
        this.jbs = c3069ik;
        if (c3273ac != null) {
            c3273ac.m14011ri(c3069ik, c3069ik.getVideoFrameLayout());
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12268ri(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        if (this.jbs == null) {
            return;
        }
        this.jbs.setExpressInteractionListener(new PAGRewardFullExpressAdListenerProxy(pAGExpressAdWrapperListener));
    }

    /* JADX INFO: renamed from: ri */
    public void m12269ri(C3022ri c3022ri) {
        this.f9604qt = c3022ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m12270ri(com.bytedance.sdk.openadsdk.core.jbs.jbs jbsVar, C3235mj c3235mj) {
        wjv wjvVar;
        if (this.jbs == null || (wjvVar = this.xha) == null) {
            return;
        }
        this.f9605ri = m12252lr(wjvVar);
        jbsVar.m13528ri(this.jbs);
        jbsVar.m13534ri(this.f9605ri);
        this.jbs.setClickListener(jbsVar);
        c3235mj.m13528ri((View) this.jbs);
        c3235mj.m13534ri(this.f9605ri);
        this.jbs.setClickCreativeListener(c3235mj);
    }

    /* JADX INFO: renamed from: ri */
    public void m12271ri(InterfaceC3247vr interfaceC3247vr) {
        C3069ik c3069ik = this.jbs;
        if (c3069ik == null) {
            return;
        }
        c3069ik.setExpressVideoListenerProxy(interfaceC3247vr);
    }

    /* JADX INFO: renamed from: ri */
    public void m12272ri(wjv wjvVar) {
        C3069ik c3069ik = this.jbs;
        if (c3069ik != null) {
            c3069ik.m13577ri(wjvVar, wjvVar.m14388eb(), wjvVar.m14394fi(), this.f9604qt.zyn, !this.f9604qt.f9410xe);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12273ri(boolean z) {
        this.f9600ik = z;
    }

    /* JADX INFO: renamed from: sf */
    public int m12274sf() {
        C3069ik c3069ik = this.jbs;
        if (c3069ik != null) {
            return c3069ik.getDynamicShowType();
        }
        return 0;
    }

    /* JADX INFO: renamed from: vr */
    public void m12275vr() {
        if (wjv.m14332fi(this.xha) && this.xha.hws() == 3 && this.xha.jxw() == 0) {
            try {
                if (this.xha.bbu() == 1) {
                    int iM16589lr = C3583qd.m16589lr(C3299nr.m14642ri(), 90.0f);
                    FrameLayout frameLayout = (FrameLayout) this.jbs.getBackupContainerBackgroundView();
                    if (frameLayout != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams.bottomMargin = iM16589lr;
                        frameLayout.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void xha() {
        C3069ik c3069ik = this.jbs;
        if (c3069ik != null) {
            c3069ik.mo12248qt();
        }
    }
}
