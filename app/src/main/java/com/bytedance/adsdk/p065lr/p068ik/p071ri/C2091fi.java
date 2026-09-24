package com.bytedance.adsdk.p065lr.p068ik.p071ri;

import android.graphics.PointF;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.C2138qt;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.C2140sf;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.ri.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2091fi implements InterfaceC2088aw<PointF, PointF> {

    /* JADX INFO: renamed from: ri */
    private final List<C2167ri<PointF>> f5043ri;

    public C2091fi(List<C2167ri<PointF>> list) {
        this.f5043ri = list;
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p071ri.InterfaceC2088aw
    /* JADX INFO: renamed from: ik */
    public List<C2167ri<PointF>> mo6901ik() {
        return this.f5043ri;
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p071ri.InterfaceC2088aw
    /* JADX INFO: renamed from: lr */
    public boolean mo6902lr() {
        return this.f5043ri.size() == 1 && this.f5043ri.get(0).m7207fi();
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p071ri.InterfaceC2088aw
    /* JADX INFO: renamed from: ri */
    public AbstractC2139ri<PointF, PointF> mo6903ri() {
        return this.f5043ri.get(0).m7207fi() ? new C2140sf(this.f5043ri) : new C2138qt(this.f5043ri);
    }
}
