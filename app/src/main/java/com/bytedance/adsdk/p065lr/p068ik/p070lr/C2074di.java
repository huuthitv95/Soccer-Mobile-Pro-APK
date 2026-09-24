package com.bytedance.adsdk.p065lr.p068ik.p070lr;

import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2090di;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2092ik;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2093ka;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik;
import com.bytedance.adsdk.p065lr.xha;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2074di implements InterfaceC2076ik {

    /* JADX INFO: renamed from: aw */
    private final boolean f4930aw;

    /* JADX INFO: renamed from: co */
    private final C2094lr f4931co;

    /* JADX INFO: renamed from: di */
    private final C2090di f4932di;

    /* JADX INFO: renamed from: fi */
    private final C2090di f4933fi;

    /* JADX INFO: renamed from: ik */
    private final C2092ik f4934ik;
    private final C2081nr.lr jbs;

    /* JADX INFO: renamed from: ka */
    private final C2093ka f4935ka;

    /* JADX INFO: renamed from: lr */
    private final xha f4936lr;

    /* JADX INFO: renamed from: mj */
    private final C2081nr.ri f4937mj;

    /* JADX INFO: renamed from: qt */
    private final float f4938qt;

    /* JADX INFO: renamed from: ri */
    private final String f4939ri;

    /* JADX INFO: renamed from: sf */
    private final List<C2094lr> f4940sf;
    private final C2094lr xha;

    public C2074di(String str, xha xhaVar, C2092ik c2092ik, C2093ka c2093ka, C2090di c2090di, C2090di c2090di2, C2094lr c2094lr, C2081nr.ri riVar, C2081nr.lr lrVar, float f, List<C2094lr> list, C2094lr c2094lr2, boolean z) {
        this.f4939ri = str;
        this.f4936lr = xhaVar;
        this.f4934ik = c2092ik;
        this.f4935ka = c2093ka;
        this.f4933fi = c2090di;
        this.f4932di = c2090di2;
        this.xha = c2094lr;
        this.f4937mj = riVar;
        this.jbs = lrVar;
        this.f4938qt = f;
        this.f4940sf = list;
        this.f4931co = c2094lr2;
        this.f4930aw = z;
    }

    /* JADX INFO: renamed from: aw */
    public boolean m6817aw() {
        return this.f4930aw;
    }

    /* JADX INFO: renamed from: co */
    public float m6818co() {
        return this.f4938qt;
    }

    /* JADX INFO: renamed from: di */
    public C2090di m6819di() {
        return this.f4932di;
    }

    /* JADX INFO: renamed from: fi */
    public C2090di m6820fi() {
        return this.f4933fi;
    }

    /* JADX INFO: renamed from: ik */
    public C2092ik m6821ik() {
        return this.f4934ik;
    }

    public C2081nr.lr jbs() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: ka */
    public C2093ka m6822ka() {
        return this.f4935ka;
    }

    /* JADX INFO: renamed from: lr */
    public xha m6823lr() {
        return this.f4936lr;
    }

    /* JADX INFO: renamed from: mj */
    public C2081nr.ri m6824mj() {
        return this.f4937mj;
    }

    /* JADX INFO: renamed from: qt */
    public List<C2094lr> m6825qt() {
        return this.f4940sf;
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p070lr.InterfaceC2076ik
    /* JADX INFO: renamed from: ri */
    public InterfaceC2150ik mo6801ri(jbs jbsVar, xha xhaVar, AbstractC2068ri abstractC2068ri) {
        return new com.bytedance.adsdk.p065lr.p074ri.p076ri.jbs(jbsVar, abstractC2068ri, this);
    }

    /* JADX INFO: renamed from: ri */
    public String m6826ri() {
        return this.f4939ri;
    }

    /* JADX INFO: renamed from: sf */
    public C2094lr m6827sf() {
        return this.f4931co;
    }

    public C2094lr xha() {
        return this.xha;
    }
}
