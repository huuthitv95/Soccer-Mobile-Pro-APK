package com.bytedance.sdk.openadsdk.component.reward.p188ri;

import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractC3217fi;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2880fi;
import com.bytedance.sdk.openadsdk.p266uq.C3546mj;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C3020mj {

    /* JADX INFO: renamed from: ik */
    public static int f9355ik = 2;

    /* JADX INFO: renamed from: lr */
    public static int f9356lr = 1;

    /* JADX INFO: renamed from: ri */
    public static int f9357ri;

    /* JADX INFO: renamed from: fi */
    private jbs f9358fi;

    /* JADX INFO: renamed from: ka */
    private final boolean f9359ka;

    public C3020mj(C3022ri c3022ri, wjv wjvVar) {
        this.f9359ka = wjvVar.m14534tp();
        this.f9358fi = C3279dw.m14086di(wjvVar) ? new xha(c3022ri) : new jbs(c3022ri);
    }

    /* JADX INFO: renamed from: di */
    public void m11957di() {
        jbs jbsVar = this.f9358fi;
        if (jbsVar != null) {
            jbsVar.jbs();
        }
    }

    /* JADX INFO: renamed from: fi */
    public void m11958fi() {
        jbs jbsVar = this.f9358fi;
        if (jbsVar != null) {
            jbsVar.mo11925ka();
        }
    }

    /* JADX INFO: renamed from: ik */
    public InterfaceC2880fi m11959ik() {
        return null;
    }

    /* JADX INFO: renamed from: ik */
    public void m11960ik(int i) {
        jbs jbsVar;
        if (i == f9355ik || (jbsVar = this.f9358fi) == null) {
            return;
        }
        jbsVar.mo11921di();
    }

    public void jbs() {
        jbs jbsVar = this.f9358fi;
        if (jbsVar != null) {
            jbsVar.bgr();
        }
    }

    /* JADX INFO: renamed from: ka */
    public boolean m11961ka() {
        jbs jbsVar = this.f9358fi;
        if (jbsVar != null) {
            return jbsVar.mo11929qt();
        }
        return false;
    }

    /* JADX INFO: renamed from: ka */
    public boolean m11962ka(int i) {
        jbs jbsVar;
        if (i != f9356lr || (jbsVar = this.f9358fi) == null) {
            return false;
        }
        return jbsVar.m11919aw();
    }

    /* JADX INFO: renamed from: lr */
    public void m11963lr(int i) {
        jbs jbsVar = this.f9358fi;
        if (jbsVar != null) {
            jbsVar.mo11931ri(i);
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m11964lr(boolean z) {
        jbs jbsVar = this.f9358fi;
        if (jbsVar != null) {
            jbsVar.m11924ik(z);
        }
    }

    /* JADX INFO: renamed from: lr */
    public boolean m11965lr() {
        return false;
    }

    /* JADX INFO: renamed from: mj */
    public void m11966mj() {
        jbs jbsVar = this.f9358fi;
        if (jbsVar != null) {
            jbsVar.mo11922fi();
        }
    }

    /* JADX INFO: renamed from: qt */
    public void m11967qt() {
        jbs jbsVar = this.f9358fi;
        if (jbsVar != null) {
            jbsVar.mo11923ik();
        }
    }

    /* JADX INFO: renamed from: ri */
    public C3546mj m11968ri() {
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public void m11969ri(int i) {
        jbs jbsVar = this.f9358fi;
        if (jbsVar != null) {
            jbsVar.mo11932ri(i);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11970ri(AbstractC3217fi abstractC3217fi) {
        jbs jbsVar = this.f9358fi;
        if (jbsVar != null) {
            jbsVar.m11933ri(abstractC3217fi);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11971ri(boolean z) {
        jbs jbsVar = this.f9358fi;
        if (jbsVar != null) {
            jbsVar.m11927lr(z);
        }
    }

    /* JADX INFO: renamed from: sf */
    public boolean m11972sf() {
        jbs jbsVar = this.f9358fi;
        if (jbsVar != null) {
            return jbsVar.m11936vr();
        }
        return false;
    }

    public void xha() {
        jbs jbsVar = this.f9358fi;
        if (jbsVar != null) {
            jbsVar.mo11930ri();
        }
    }
}
