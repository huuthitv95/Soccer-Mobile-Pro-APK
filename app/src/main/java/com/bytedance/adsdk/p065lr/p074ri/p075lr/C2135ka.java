package com.bytedance.adsdk.p065lr.p074ri.p075lr;

import com.bytedance.adsdk.p065lr.p066di.C2018fi;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.lr.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2135ka extends xha<Float> {
    public C2135ka(List<C2167ri<Float>> list) {
        super(list);
    }

    /* JADX INFO: renamed from: ik */
    float m7096ik(C2167ri<Float> c2167ri, float f) {
        if (c2167ri.f5404ri == null || c2167ri.f5401lr == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.f5204ik == null) {
            return C2018fi.m6560ri(c2167ri.m7206di(), c2167ri.xha(), f);
        }
        c2167ri.xha.floatValue();
        m7107ka();
        m7108mj();
        throw null;
    }

    public float jbs() {
        return m7096ik(m7106ik(), m7105fi());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public Float mo7083ri(C2167ri<Float> c2167ri, float f) {
        return Float.valueOf(m7096ik(c2167ri, f));
    }
}
