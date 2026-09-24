package com.bytedance.adsdk.p065lr.p068ik.p071ri;

import android.graphics.PointF;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.bgr;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class jbs implements InterfaceC2088aw<PointF, PointF> {

    /* JADX INFO: renamed from: lr */
    private final C2094lr f5044lr;

    /* JADX INFO: renamed from: ri */
    private final C2094lr f5045ri;

    public jbs(C2094lr c2094lr, C2094lr c2094lr2) {
        this.f5045ri = c2094lr;
        this.f5044lr = c2094lr2;
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p071ri.InterfaceC2088aw
    /* JADX INFO: renamed from: ik */
    public List<C2167ri<PointF>> mo6901ik() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p071ri.InterfaceC2088aw
    /* JADX INFO: renamed from: lr */
    public boolean mo6902lr() {
        return this.f5045ri.mo6902lr() && this.f5044lr.mo6902lr();
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p071ri.InterfaceC2088aw
    /* JADX INFO: renamed from: ri */
    public AbstractC2139ri<PointF, PointF> mo6903ri() {
        return new bgr(this.f5045ri.mo6903ri(), this.f5044lr.mo6903ri());
    }
}
