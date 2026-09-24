package com.bytedance.adsdk.p065lr.p068ik.p070lr;

import android.graphics.PointF;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2090di;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.InterfaceC2088aw;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.C2148di;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik;
import com.bytedance.adsdk.p065lr.xha;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2079lr implements InterfaceC2076ik {

    /* JADX INFO: renamed from: fi */
    private final boolean f4960fi;

    /* JADX INFO: renamed from: ik */
    private final C2090di f4961ik;

    /* JADX INFO: renamed from: ka */
    private final boolean f4962ka;

    /* JADX INFO: renamed from: lr */
    private final InterfaceC2088aw<PointF, PointF> f4963lr;

    /* JADX INFO: renamed from: ri */
    private final String f4964ri;

    public C2079lr(String str, InterfaceC2088aw<PointF, PointF> interfaceC2088aw, C2090di c2090di, boolean z, boolean z2) {
        this.f4964ri = str;
        this.f4963lr = interfaceC2088aw;
        this.f4961ik = c2090di;
        this.f4962ka = z;
        this.f4960fi = z2;
    }

    /* JADX INFO: renamed from: fi */
    public boolean m6845fi() {
        return this.f4960fi;
    }

    /* JADX INFO: renamed from: ik */
    public C2090di m6846ik() {
        return this.f4961ik;
    }

    /* JADX INFO: renamed from: ka */
    public boolean m6847ka() {
        return this.f4962ka;
    }

    /* JADX INFO: renamed from: lr */
    public InterfaceC2088aw<PointF, PointF> m6848lr() {
        return this.f4963lr;
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p070lr.InterfaceC2076ik
    /* JADX INFO: renamed from: ri */
    public InterfaceC2150ik mo6801ri(jbs jbsVar, xha xhaVar, AbstractC2068ri abstractC2068ri) {
        return new C2148di(jbsVar, abstractC2068ri, this);
    }

    /* JADX INFO: renamed from: ri */
    public String m6849ri() {
        return this.f4964ri;
    }
}
