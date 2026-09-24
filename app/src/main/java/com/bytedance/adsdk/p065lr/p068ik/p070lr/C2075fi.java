package com.bytedance.adsdk.p065lr.p068ik.p070lr;

import android.graphics.Path;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2090di;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2092ik;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2093ka;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.C2153mj;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik;
import com.bytedance.adsdk.p065lr.xha;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2075fi implements InterfaceC2076ik {

    /* JADX INFO: renamed from: di */
    private final C2090di f4941di;

    /* JADX INFO: renamed from: fi */
    private final C2090di f4942fi;

    /* JADX INFO: renamed from: ik */
    private final C2092ik f4943ik;
    private final C2094lr jbs;

    /* JADX INFO: renamed from: ka */
    private final C2093ka f4944ka;

    /* JADX INFO: renamed from: lr */
    private final Path.FillType f4945lr;

    /* JADX INFO: renamed from: mj */
    private final C2094lr f4946mj;

    /* JADX INFO: renamed from: qt */
    private final boolean f4947qt;

    /* JADX INFO: renamed from: ri */
    private final xha f4948ri;
    private final String xha;

    public C2075fi(String str, xha xhaVar, Path.FillType fillType, C2092ik c2092ik, C2093ka c2093ka, C2090di c2090di, C2090di c2090di2, C2094lr c2094lr, C2094lr c2094lr2, boolean z) {
        this.f4948ri = xhaVar;
        this.f4945lr = fillType;
        this.f4943ik = c2092ik;
        this.f4944ka = c2093ka;
        this.f4942fi = c2090di;
        this.f4941di = c2090di2;
        this.xha = str;
        this.f4946mj = c2094lr;
        this.jbs = c2094lr2;
        this.f4947qt = z;
    }

    /* JADX INFO: renamed from: di */
    public C2090di m6828di() {
        return this.f4942fi;
    }

    /* JADX INFO: renamed from: fi */
    public C2093ka m6829fi() {
        return this.f4944ka;
    }

    /* JADX INFO: renamed from: ik */
    public Path.FillType m6830ik() {
        return this.f4945lr;
    }

    /* JADX INFO: renamed from: ka */
    public C2092ik m6831ka() {
        return this.f4943ik;
    }

    /* JADX INFO: renamed from: lr */
    public xha m6832lr() {
        return this.f4948ri;
    }

    /* JADX INFO: renamed from: mj */
    public boolean m6833mj() {
        return this.f4947qt;
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p070lr.InterfaceC2076ik
    /* JADX INFO: renamed from: ri */
    public InterfaceC2150ik mo6801ri(jbs jbsVar, xha xhaVar, AbstractC2068ri abstractC2068ri) {
        return new C2153mj(jbsVar, xhaVar, abstractC2068ri, this);
    }

    /* JADX INFO: renamed from: ri */
    public String m6834ri() {
        return this.xha;
    }

    public C2090di xha() {
        return this.f4941di;
    }
}
