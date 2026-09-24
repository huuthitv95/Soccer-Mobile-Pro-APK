package com.bytedance.adsdk.p065lr.p074ri.p075lr;

import com.bytedance.adsdk.p065lr.p066di.C2018fi;
import com.bytedance.adsdk.p065lr.p066di.C2021lr;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2136lr extends xha<Integer> {
    public C2136lr(List<C2167ri<Integer>> list) {
        super(list);
    }

    /* JADX INFO: renamed from: ik */
    public int m7098ik(C2167ri<Integer> c2167ri, float f) {
        if (c2167ri.f5404ri == null || c2167ri.f5401lr == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.f5204ik == null) {
            return C2021lr.m6589ri(C2018fi.m6558lr(f, 0.0f, 1.0f), c2167ri.f5404ri.intValue(), c2167ri.f5401lr.intValue());
        }
        c2167ri.xha.floatValue();
        m7107ka();
        m7108mj();
        throw null;
    }

    public int jbs() {
        return m7098ik(m7106ik(), m7105fi());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public Integer mo7083ri(C2167ri<Integer> c2167ri, float f) {
        return Integer.valueOf(m7098ik(c2167ri, f));
    }
}
