package com.bytedance.sdk.openadsdk.component.reward.p187lr;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3008co;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3040vr;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.slm;
import com.bytedance.sdk.openadsdk.component.reward.view.C3069ik;
import com.bytedance.sdk.openadsdk.component.reward.view.C3075sf;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2999ri {

    /* JADX INFO: renamed from: di */
    protected final C3075sf f9200di;

    /* JADX INFO: renamed from: fi */
    protected final C3040vr f9201fi;

    /* JADX INFO: renamed from: ik */
    protected int f9202ik;
    protected InterfaceC3118lr jbs;

    /* JADX INFO: renamed from: ka */
    protected int f9203ka;

    /* JADX INFO: renamed from: lr */
    protected wjv f9204lr;

    /* JADX INFO: renamed from: mj */
    protected final C3008co f9205mj;

    /* JADX INFO: renamed from: qt */
    protected igq f9206qt;

    /* JADX INFO: renamed from: ri */
    protected C3022ri f9207ri;
    protected final slm xha;

    public C2999ri(C3022ri c3022ri) {
        this.f9207ri = c3022ri;
        this.f9204lr = c3022ri.f9389lr;
        this.f9202ik = c3022ri.whw;
        this.f9203ka = c3022ri.f9411xm;
        this.f9201fi = c3022ri.ihz;
        this.f9200di = c3022ri.dzy;
        this.xha = c3022ri.ory;
        this.f9205mj = c3022ri.f9394oh;
    }

    /* JADX INFO: renamed from: ik */
    protected void m11755ik() {
        if (C3279dw.m14092lr(this.f9207ri.f9389lr) && DeviceUtils.xha() == 0) {
            this.f9207ri.zyn = true;
        }
        this.f9207ri.f9394oh.m11865lr(this.f9207ri.zyn);
    }

    /* JADX INFO: renamed from: lr */
    public boolean m11756lr() {
        boolean z = this.f9207ri.ajz == null;
        boolean zXha = this.f9207ri.ihz.xha();
        boolean z2 = C3273ac.m13965ik(this.f9207ri.f9389lr) || !wjv.m14332fi(this.f9207ri.f9389lr);
        if (z && zXha && z2) {
            return false;
        }
        boolean zM13971lr = C3273ac.m13971lr(this.f9207ri.f9389lr);
        boolean z3 = this.f9207ri.slm.get();
        if (zM13971lr && z3) {
            FrameLayout frameLayoutMo12215di = this.f9207ri.dzy.mo12215di();
            frameLayoutMo12215di.setVisibility(4);
            frameLayoutMo12215di.setVisibility(0);
            return false;
        }
        boolean z4 = this.f9207ri.jbs.get();
        boolean z5 = this.f9207ri.f9399qt.get();
        if (z4 || z5) {
            return false;
        }
        return this.f9207ri.ihz.jbs() || this.f9207ri.ihz.hcw();
    }

    /* JADX INFO: renamed from: ri */
    public void mo11750ri(InterfaceC3118lr interfaceC3118lr, igq igqVar) {
        this.jbs = interfaceC3118lr;
        this.f9206qt = igqVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m11757ri(boolean z) {
        if (this.f9207ri.jbs.get()) {
            return;
        }
        wjv wjvVar = this.f9204lr;
        if (wjvVar != null && wjvVar.vgs()) {
            this.f9205mj.m11861ik(false);
            this.f9205mj.m11873ri(true);
            this.f9207ri.dzy.mo12223lr(8);
            this.f9207ri.dzy.mo12221ka(8);
            return;
        }
        if (z) {
            this.f9205mj.m11873ri(this.f9207ri.f9389lr.nlk());
            if (m11758ri()) {
                this.f9205mj.m11861ik(true);
            }
            if (m11758ri() || ((this instanceof xha) && this.f9207ri.f9389lr.m14383di())) {
                this.f9205mj.m11863ka(true);
            } else {
                this.f9205mj.m11858fi();
                this.f9207ri.dzy.mo12216di(0);
            }
        } else {
            this.f9205mj.m11861ik(false);
            this.f9205mj.m11873ri(false);
            this.f9205mj.m11863ka(false);
            this.f9207ri.dzy.mo12216di(8);
        }
        if (!z) {
            this.f9207ri.dzy.mo12223lr(4);
            this.f9207ri.dzy.m12305ik(8);
            this.f9207ri.dzy.mo12221ka(8);
        } else if (this.f9207ri.siy != C3069ik.f9588ri) {
            this.f9207ri.dzy.mo12223lr(8);
            this.f9207ri.dzy.mo12221ka(8);
        } else {
            this.f9207ri.dzy.mo12223lr(0);
            this.f9207ri.dzy.m12305ik(0);
            this.f9207ri.dzy.mo12221ka(0);
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m11758ri() {
        return this.f9207ri.f9389lr.m14576zz() || this.f9207ri.f9389lr.m14552vz() == 15 || this.f9207ri.f9389lr.m14552vz() == 5 || this.f9207ri.f9389lr.m14552vz() == 50;
    }
}
