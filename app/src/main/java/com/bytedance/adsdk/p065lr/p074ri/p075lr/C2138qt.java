package com.bytedance.adsdk.p065lr.p074ri.p075lr;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.lr.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C2138qt extends xha<PointF> {

    /* JADX INFO: renamed from: di */
    private final PathMeasure f5199di;

    /* JADX INFO: renamed from: fi */
    private final float[] f5200fi;

    /* JADX INFO: renamed from: ka */
    private final PointF f5201ka;
    private jbs xha;

    public C2138qt(List<? extends C2167ri<PointF>> list) {
        super(list);
        this.f5201ka = new PointF();
        this.f5200fi = new float[2];
        this.f5199di = new PathMeasure();
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public PointF mo7083ri(C2167ri<PointF> c2167ri, float f) {
        jbs jbsVar = (jbs) c2167ri;
        Path pathM7094lr = jbsVar.m7094lr();
        if (pathM7094lr == null) {
            return c2167ri.f5404ri;
        }
        if (this.f5204ik != null) {
            jbsVar.xha.floatValue();
            m7107ka();
            m7108mj();
            throw null;
        }
        if (this.xha != jbsVar) {
            this.f5199di.setPath(pathM7094lr, false);
            this.xha = jbsVar;
        }
        PathMeasure pathMeasure = this.f5199di;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f5200fi, null);
        PointF pointF = this.f5201ka;
        float[] fArr = this.f5200fi;
        pointF.set(fArr[0], fArr[1]);
        return this.f5201ka;
    }
}
