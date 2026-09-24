package com.bytedance.sdk.openadsdk.component.p186mj;

import android.content.Context;
import android.widget.FrameLayout;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.C3078ri;
import com.bytedance.sdk.openadsdk.core.bgr.p199ri.C3126lr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p219ik.C3221ri;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3412vr;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.mj.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2979ik implements C3221ri.ri {

    /* JADX INFO: renamed from: fi */
    private boolean f9079fi = false;

    /* JADX INFO: renamed from: ik */
    private wjv f9080ik;

    /* JADX INFO: renamed from: ka */
    private C2980lr f9081ka;

    /* JADX INFO: renamed from: lr */
    private FrameLayout f9082lr;

    /* JADX INFO: renamed from: ri */
    private Context f9083ri;

    public C2979ik(Context context) {
        this.f9083ri = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: aw */
    public long m11586aw() {
        C2980lr c2980lr = this.f9081ka;
        if (c2980lr != null) {
            return c2980lr.mo6373di();
        }
        return 0L;
    }

    public long bgr() {
        C2980lr c2980lr = this.f9081ka;
        if (c2980lr != null) {
            return c2980lr.xha();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: co */
    public void m11587co() {
        C2980lr c2980lr = this.f9081ka;
        if (c2980lr == null) {
            return;
        }
        this.f9083ri = null;
        c2980lr.mo6376ka();
        this.f9081ka = null;
    }

    /* JADX INFO: renamed from: di */
    public boolean m11588di() {
        C2980lr c2980lr = this.f9081ka;
        return (c2980lr == null || c2980lr.mo6388sf() == null || !this.f9081ka.mo6388sf().xha()) ? false : true;
    }

    /* JADX INFO: renamed from: fi */
    public boolean m11589fi() {
        C2980lr c2980lr = this.f9081ka;
        return (c2980lr == null || c2980lr.mo6388sf() == null || !this.f9081ka.mo6388sf().mo6167di()) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3221ri.ri
    public long getVideoProgress() {
        return m11586aw();
    }

    /* JADX INFO: renamed from: ik */
    public boolean m11590ik() {
        return this.f9079fi;
    }

    public void jbs() {
        try {
            if (m11588di()) {
                m11602sf();
            }
        } catch (Throwable th) {
            C2707ac.m10196ik("TTAppOpenVideoManager", "onContinue throw Exception :" + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ka */
    public boolean m11591ka() {
        C2980lr c2980lr = this.f9081ka;
        return (c2980lr == null || c2980lr.mo6388sf() == null || !this.f9081ka.mo6388sf().mo6173lr()) ? false : true;
    }

    /* JADX INFO: renamed from: lr */
    public C2980lr m11592lr() {
        return this.f9081ka;
    }

    /* JADX INFO: renamed from: mj */
    public void m11593mj() {
        try {
            if (m11589fi()) {
                this.f9081ka.mo6377lr();
            }
        } catch (Throwable th) {
            C2707ac.m10197ik("TTAppOpenVideoManager", "open_ad", "AppOpenVideoManager onPause throw Exception :" + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: qt */
    public void m11594qt() {
        C2980lr c2980lr = this.f9081ka;
        if (c2980lr == null) {
            return;
        }
        c2980lr.mo6376ka();
        this.f9081ka = null;
    }

    /* JADX INFO: renamed from: ri */
    public void m11595ri(int i) {
        if (this.f9081ka != null) {
            C3412vr.ri riVar = new C3412vr.ri();
            riVar.m15466lr(m11586aw());
            riVar.m15463ka(m11603vr());
            riVar.m15459ik(bgr());
            riVar.m15458ik(i);
            riVar.m15462ka(this.f9081ka.mo6378mj());
            riVar.m15472ri(this.f9081ka.m12964bu());
            this.f9081ka.m11604ri(riVar);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11596ri(FrameLayout frameLayout, wjv wjvVar) {
        this.f9082lr = frameLayout;
        this.f9080ik = wjvVar;
        this.f9081ka = new C2980lr(this.f9083ri, this.f9082lr, this.f9080ik);
    }

    /* JADX INFO: renamed from: ri */
    public void m11597ri(InterfaceC1999ik.ri riVar) {
        C2980lr c2980lr = this.f9081ka;
        if (c2980lr != null) {
            c2980lr.mo6383ri(riVar);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11598ri(boolean z) {
        this.f9079fi = z;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m11599ri() {
        C3126lr c3126lrM14345ri = wjv.m14345ri(CacheDirFactory.getICacheDir(0).mo6273lr(), this.f9080ik);
        c3126lrM14345ri.m6318lr(this.f9080ik.m14533tn());
        c3126lrM14345ri.m6317lr(this.f9082lr.getWidth());
        c3126lrM14345ri.m6311ik(this.f9082lr.getHeight());
        c3126lrM14345ri.m6312ik(this.f9080ik.yjg());
        c3126lrM14345ri.m6326ri(0L);
        c3126lrM14345ri.m6329ri(true);
        return this.f9081ka.mo6387ri(c3126lrM14345ri);
    }

    /* JADX INFO: renamed from: ri */
    public boolean m11600ri(float f) {
        try {
            C2980lr c2980lr = this.f9081ka;
            if (c2980lr != null) {
                return c2980lr.mo6386ri(f);
            }
        } catch (Throwable th) {
            C2707ac.m10197ik("TTAppOpenVideoManager", "open_ad", "setPlaybackSpeed error: " + th.getMessage());
        }
        return false;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m11601ri(FrameLayout frameLayout, C3078ri c3078ri, wjv wjvVar) {
        m11596ri(frameLayout, wjvVar);
        m11597ri(c3078ri);
        try {
            return m11599ri();
        } catch (Throwable th) {
            C2707ac.m10197ik("TTAppOpenVideoManager", "open_ad", "ttAppOpenAd playVideo error: " + th.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: sf */
    public void m11602sf() {
        C2980lr c2980lr = this.f9081ka;
        if (c2980lr != null) {
            c2980lr.mo6375ik();
        }
    }

    public void slm() {
        C2980lr c2980lr = this.f9081ka;
        if (c2980lr != null) {
            c2980lr.srn();
        }
    }

    /* JADX INFO: renamed from: vr */
    public long m11603vr() {
        C2980lr c2980lr = this.f9081ka;
        if (c2980lr != null) {
            return c2980lr.jbs() + this.f9081ka.xha();
        }
        return 0L;
    }

    public boolean xha() {
        C2980lr c2980lr = this.f9081ka;
        return c2980lr != null && c2980lr.bgr();
    }
}
