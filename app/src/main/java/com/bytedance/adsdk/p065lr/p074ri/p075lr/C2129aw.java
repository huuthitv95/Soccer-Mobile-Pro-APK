package com.bytedance.adsdk.p065lr.p074ri.p075lr;

import android.graphics.Path;
import com.bytedance.adsdk.p065lr.p066di.C2018fi;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.bgr;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.tan;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.lr.aw */
/* JADX INFO: loaded from: classes3.dex */
public class C2129aw extends AbstractC2139ri<bgr, Path> {

    /* JADX INFO: renamed from: di */
    private List<tan> f5179di;

    /* JADX INFO: renamed from: fi */
    private final Path f5180fi;

    /* JADX INFO: renamed from: ka */
    private final bgr f5181ka;

    public C2129aw(List<C2167ri<bgr>> list) {
        super(list);
        this.f5181ka = new bgr();
        this.f5180fi = new Path();
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public Path mo7083ri(C2167ri<bgr> c2167ri, float f) {
        this.f5181ka.m6807ri(c2167ri.f5404ri, c2167ri.f5401lr, f);
        bgr bgrVarMo7139ri = this.f5181ka;
        List<tan> list = this.f5179di;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                bgrVarMo7139ri = this.f5179di.get(size).mo7139ri(bgrVarMo7139ri);
            }
        }
        C2018fi.m6566ri(bgrVarMo7139ri, this.f5180fi);
        return this.f5180fi;
    }

    /* JADX INFO: renamed from: ri */
    public void m7084ri(List<tan> list) {
        this.f5179di = list;
    }
}
