package com.bytedance.adsdk.p065lr.p074ri.p075lr;

import android.graphics.PointF;
import com.bytedance.adsdk.p065lr.xha.C2166lr;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class bgr extends AbstractC2139ri<PointF, PointF> {

    /* JADX INFO: renamed from: di */
    private final PointF f5182di;

    /* JADX INFO: renamed from: fi */
    protected C2166lr<Float> f5183fi;
    private final AbstractC2139ri<Float, Float> jbs;

    /* JADX INFO: renamed from: ka */
    protected C2166lr<Float> f5184ka;

    /* JADX INFO: renamed from: mj */
    private final AbstractC2139ri<Float, Float> f5185mj;
    private final PointF xha;

    public bgr(AbstractC2139ri<Float, Float> abstractC2139ri, AbstractC2139ri<Float, Float> abstractC2139ri2) {
        super(Collections.EMPTY_LIST);
        this.f5182di = new PointF();
        this.xha = new PointF();
        this.f5185mj = abstractC2139ri;
        this.jbs = abstractC2139ri2;
        mo7086ri(m7108mj());
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri
    /* JADX INFO: renamed from: jbs, reason: merged with bridge method [inline-methods] */
    public PointF xha() {
        return mo7083ri(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public PointF mo7083ri(C2167ri<PointF> c2167ri, float f) {
        C2167ri<Float> c2167riM7106ik;
        C2167ri<Float> c2167riM7106ik2;
        if (this.f5184ka != null && (c2167riM7106ik2 = this.f5185mj.m7106ik()) != null) {
            this.f5185mj.m7105fi();
            Float f2 = c2167riM7106ik2.xha;
            if (f2 == null) {
                throw null;
            }
            f2.floatValue();
            throw null;
        }
        if (this.f5183fi == null || (c2167riM7106ik = this.jbs.m7106ik()) == null) {
            this.xha.set(this.f5182di.x, 0.0f);
            PointF pointF = this.xha;
            pointF.set(pointF.x, this.f5182di.y);
            return this.xha;
        }
        this.jbs.m7105fi();
        Float f3 = c2167riM7106ik.xha;
        if (f3 == null) {
            throw null;
        }
        f3.floatValue();
        throw null;
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri
    /* JADX INFO: renamed from: ri */
    public void mo7086ri(float f) {
        this.f5185mj.mo7086ri(f);
        this.jbs.mo7086ri(f);
        this.f5182di.set(this.f5185mj.xha().floatValue(), this.jbs.xha().floatValue());
        for (int i = 0; i < this.f5208ri.size(); i++) {
            this.f5208ri.get(i).mo6789ri();
        }
    }
}
