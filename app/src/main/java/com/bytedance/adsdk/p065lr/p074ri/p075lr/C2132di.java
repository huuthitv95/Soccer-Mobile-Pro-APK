package com.bytedance.adsdk.p065lr.p074ri.p075lr;

import com.bytedance.adsdk.p065lr.p066di.C2018fi;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.lr.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2132di extends xha<Integer> {
    public C2132di(List<C2167ri<Integer>> list) {
        super(list);
    }

    /* JADX INFO: renamed from: ik */
    int m7090ik(C2167ri<Integer> c2167ri, float f) {
        if (c2167ri.f5404ri == null || c2167ri.f5401lr == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.f5204ik == null) {
            return C2018fi.m6563ri(c2167ri.m7210mj(), c2167ri.jbs(), f);
        }
        c2167ri.xha.floatValue();
        m7107ka();
        m7108mj();
        throw null;
    }

    public int jbs() {
        return m7090ik(m7106ik(), m7105fi());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public Integer mo7083ri(C2167ri<Integer> c2167ri, float f) {
        return Integer.valueOf(m7090ik(c2167ri, f));
    }
}
