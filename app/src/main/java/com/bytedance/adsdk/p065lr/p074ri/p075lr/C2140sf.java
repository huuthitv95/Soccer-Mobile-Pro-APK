package com.bytedance.adsdk.p065lr.p074ri.p075lr;

import android.graphics.PointF;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.lr.sf */
/* JADX INFO: loaded from: classes3.dex */
public class C2140sf extends xha<PointF> {

    /* JADX INFO: renamed from: ka */
    private final PointF f5215ka;

    public C2140sf(List<C2167ri<PointF>> list) {
        super(list);
        this.f5215ka = new PointF();
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public PointF mo7083ri(C2167ri<PointF> c2167ri, float f) {
        return mo7109ri(c2167ri, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public PointF mo7109ri(C2167ri<PointF> c2167ri, float f, float f2, float f3) {
        if (c2167ri.f5404ri == null || c2167ri.f5401lr == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = c2167ri.f5404ri;
        PointF pointF2 = c2167ri.f5401lr;
        if (this.f5204ik == null) {
            this.f5215ka.set(pointF.x + (f2 * (pointF2.x - pointF.x)), pointF.y + (f3 * (pointF2.y - pointF.y)));
            return this.f5215ka;
        }
        c2167ri.xha.floatValue();
        m7107ka();
        m7108mj();
        throw null;
    }
}
