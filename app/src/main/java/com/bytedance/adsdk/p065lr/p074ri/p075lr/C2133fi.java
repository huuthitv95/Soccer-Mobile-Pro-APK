package com.bytedance.adsdk.p065lr.p074ri.p075lr;

import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2078ka;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.lr.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2133fi extends xha<C2078ka> {

    /* JADX INFO: renamed from: ka */
    private final C2078ka f5187ka;

    public C2133fi(List<C2167ri<C2078ka>> list) {
        super(list);
        C2078ka c2078ka = list.get(0).f5404ri;
        int iM6840ik = c2078ka != null ? c2078ka.m6840ik() : 0;
        this.f5187ka = new C2078ka(new float[iM6840ik], new int[iM6840ik]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public C2078ka mo7083ri(C2167ri<C2078ka> c2167ri, float f) {
        this.f5187ka.m6843ri(c2167ri.f5404ri, c2167ri.f5401lr, f);
        return this.f5187ka;
    }
}
