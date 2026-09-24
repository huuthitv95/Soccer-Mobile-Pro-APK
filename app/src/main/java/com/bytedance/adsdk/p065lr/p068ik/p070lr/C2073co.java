package com.bytedance.adsdk.p065lr.p068ik.p070lr;

import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2089co;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.slm;
import com.bytedance.adsdk.p065lr.xha;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr.co */
/* JADX INFO: loaded from: classes3.dex */
public class C2073co implements InterfaceC2076ik {

    /* JADX INFO: renamed from: fi */
    private final boolean f4925fi;

    /* JADX INFO: renamed from: ik */
    private final C2094lr f4926ik;

    /* JADX INFO: renamed from: ka */
    private final C2089co f4927ka;

    /* JADX INFO: renamed from: lr */
    private final C2094lr f4928lr;

    /* JADX INFO: renamed from: ri */
    private final String f4929ri;

    public C2073co(String str, C2094lr c2094lr, C2094lr c2094lr2, C2089co c2089co, boolean z) {
        this.f4929ri = str;
        this.f4928lr = c2094lr;
        this.f4926ik = c2094lr2;
        this.f4927ka = c2089co;
        this.f4925fi = z;
    }

    /* JADX INFO: renamed from: fi */
    public boolean m6812fi() {
        return this.f4925fi;
    }

    /* JADX INFO: renamed from: ik */
    public C2094lr m6813ik() {
        return this.f4926ik;
    }

    /* JADX INFO: renamed from: ka */
    public C2089co m6814ka() {
        return this.f4927ka;
    }

    /* JADX INFO: renamed from: lr */
    public C2094lr m6815lr() {
        return this.f4928lr;
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p070lr.InterfaceC2076ik
    /* JADX INFO: renamed from: ri */
    public InterfaceC2150ik mo6801ri(jbs jbsVar, xha xhaVar, AbstractC2068ri abstractC2068ri) {
        return new slm(jbsVar, abstractC2068ri, this);
    }

    /* JADX INFO: renamed from: ri */
    public String m6816ri() {
        return this.f4929ri;
    }
}
