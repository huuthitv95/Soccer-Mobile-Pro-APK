package com.bytedance.sdk.openadsdk.p251qt;

import com.bytedance.sdk.component.p145fi.jbs;
import com.bytedance.sdk.component.p145fi.tan;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.qt.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C3489fi implements tan {

    /* JADX INFO: renamed from: ri */
    private static int f12629ri;

    /* JADX INFO: renamed from: fi */
    private final String f12630fi;

    /* JADX INFO: renamed from: ik */
    private long f12631ik;

    /* JADX INFO: renamed from: ka */
    private boolean f12632ka;

    /* JADX INFO: renamed from: lr */
    private long f12633lr = 0;

    public C3489fi() {
        f12629ri++;
        this.f12630fi = "image_request_" + f12629ri;
    }

    /* JADX INFO: renamed from: ik */
    private String m15827ik(String str, jbs jbsVar) {
        return str;
    }

    @Override // com.bytedance.sdk.component.p145fi.tan
    /* JADX INFO: renamed from: lr */
    public void mo9741lr(String str, jbs jbsVar) {
        this.f12631ik += System.currentTimeMillis() - this.f12633lr;
        m15827ik(str, jbsVar);
    }

    @Override // com.bytedance.sdk.component.p145fi.tan
    /* JADX INFO: renamed from: ri */
    public void mo9742ri(String str, jbs jbsVar) {
        if (!this.f12632ka) {
            jbsVar.mo9571ri();
            jbsVar.mo9570lr();
            jbsVar.mo9569ik();
            this.f12632ka = true;
        }
        this.f12633lr = System.currentTimeMillis();
        m15827ik(str, jbsVar);
    }
}
