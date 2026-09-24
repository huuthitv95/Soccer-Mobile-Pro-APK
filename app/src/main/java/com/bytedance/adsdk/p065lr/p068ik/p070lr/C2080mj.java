package com.bytedance.adsdk.p065lr.p068ik.p070lr;

import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2093ka;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2095mj;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C2080mj {

    /* JADX INFO: renamed from: ik */
    private final C2093ka f4965ik;

    /* JADX INFO: renamed from: ka */
    private final boolean f4966ka;

    /* JADX INFO: renamed from: lr */
    private final C2095mj f4967lr;

    /* JADX INFO: renamed from: ri */
    private final ri f4968ri;

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr.mj$ri */
    public enum ri {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public C2080mj(ri riVar, C2095mj c2095mj, C2093ka c2093ka, boolean z) {
        this.f4968ri = riVar;
        this.f4967lr = c2095mj;
        this.f4965ik = c2093ka;
        this.f4966ka = z;
    }

    /* JADX INFO: renamed from: ik */
    public C2093ka m6850ik() {
        return this.f4965ik;
    }

    /* JADX INFO: renamed from: ka */
    public boolean m6851ka() {
        return this.f4966ka;
    }

    /* JADX INFO: renamed from: lr */
    public C2095mj m6852lr() {
        return this.f4967lr;
    }

    /* JADX INFO: renamed from: ri */
    public ri m6853ri() {
        return this.f4968ri;
    }
}
