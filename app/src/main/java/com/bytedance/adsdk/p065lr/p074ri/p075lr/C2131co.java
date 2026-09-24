package com.bytedance.adsdk.p065lr.p074ri.p075lr;

import com.bytedance.adsdk.p065lr.p066di.C2018fi;
import com.bytedance.adsdk.p065lr.xha.C2165ik;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.lr.co */
/* JADX INFO: loaded from: classes3.dex */
public class C2131co extends xha<C2165ik> {

    /* JADX INFO: renamed from: ka */
    private final C2165ik f5186ka;

    public C2131co(List<C2167ri<C2165ik>> list) {
        super(list);
        this.f5186ka = new C2165ik();
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public C2165ik mo7083ri(C2167ri<C2165ik> c2167ri, float f) {
        if (c2167ri.f5404ri == null || c2167ri.f5401lr == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C2165ik c2165ik = c2167ri.f5404ri;
        C2165ik c2165ik2 = c2167ri.f5401lr;
        if (this.f5204ik == null) {
            this.f5186ka.m7205ri(C2018fi.m6560ri(c2165ik.m7204ri(), c2165ik2.m7204ri(), f), C2018fi.m6560ri(c2165ik.m7202lr(), c2165ik2.m7202lr(), f));
            return this.f5186ka;
        }
        c2167ri.xha.floatValue();
        m7107ka();
        m7108mj();
        throw null;
    }
}
