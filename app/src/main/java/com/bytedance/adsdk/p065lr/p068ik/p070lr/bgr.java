package com.bytedance.adsdk.p065lr.p068ik.p070lr;

import android.graphics.PointF;
import com.bytedance.adsdk.p065lr.p066di.C2018fi;
import com.bytedance.adsdk.p065lr.p068ik.C2087ri;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class bgr {

    /* JADX INFO: renamed from: ik */
    private boolean f4918ik;

    /* JADX INFO: renamed from: lr */
    private PointF f4919lr;

    /* JADX INFO: renamed from: ri */
    private final List<C2087ri> f4920ri;

    public bgr() {
        this.f4920ri = new ArrayList();
    }

    public bgr(PointF pointF, boolean z, List<C2087ri> list) {
        this.f4919lr = pointF;
        this.f4918ik = z;
        this.f4920ri = new ArrayList(list);
    }

    /* JADX INFO: renamed from: ik */
    public List<C2087ri> m6803ik() {
        return this.f4920ri;
    }

    /* JADX INFO: renamed from: lr */
    public boolean m6804lr() {
        return this.f4918ik;
    }

    /* JADX INFO: renamed from: ri */
    public PointF m6805ri() {
        return this.f4919lr;
    }

    /* JADX INFO: renamed from: ri */
    public void m6806ri(float f, float f2) {
        if (this.f4919lr == null) {
            this.f4919lr = new PointF();
        }
        this.f4919lr.set(f, f2);
    }

    /* JADX INFO: renamed from: ri */
    public void m6807ri(bgr bgrVar, bgr bgrVar2, float f) {
        if (this.f4919lr == null) {
            this.f4919lr = new PointF();
        }
        this.f4918ik = bgrVar.m6804lr() || bgrVar2.m6804lr();
        if (bgrVar.m6803ik().size() != bgrVar2.m6803ik().size()) {
            bgrVar.m6803ik().size();
            bgrVar2.m6803ik().size();
        }
        int iMin = Math.min(bgrVar.m6803ik().size(), bgrVar2.m6803ik().size());
        if (this.f4920ri.size() < iMin) {
            for (int size = this.f4920ri.size(); size < iMin; size++) {
                this.f4920ri.add(new C2087ri());
            }
        } else if (this.f4920ri.size() > iMin) {
            for (int size2 = this.f4920ri.size() - 1; size2 >= iMin; size2--) {
                List<C2087ri> list = this.f4920ri;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFM6805ri = bgrVar.m6805ri();
        PointF pointFM6805ri2 = bgrVar2.m6805ri();
        m6806ri(C2018fi.m6560ri(pointFM6805ri.x, pointFM6805ri2.x, f), C2018fi.m6560ri(pointFM6805ri.y, pointFM6805ri2.y, f));
        for (int size3 = this.f4920ri.size() - 1; size3 >= 0; size3--) {
            C2087ri c2087ri = bgrVar.m6803ik().get(size3);
            C2087ri c2087ri2 = bgrVar2.m6803ik().get(size3);
            PointF pointFM6899ri = c2087ri.m6899ri();
            PointF pointFM6897lr = c2087ri.m6897lr();
            PointF pointFM6895ik = c2087ri.m6895ik();
            PointF pointFM6899ri2 = c2087ri2.m6899ri();
            PointF pointFM6897lr2 = c2087ri2.m6897lr();
            PointF pointFM6895ik2 = c2087ri2.m6895ik();
            this.f4920ri.get(size3).m6900ri(C2018fi.m6560ri(pointFM6899ri.x, pointFM6899ri2.x, f), C2018fi.m6560ri(pointFM6899ri.y, pointFM6899ri2.y, f));
            this.f4920ri.get(size3).m6898lr(C2018fi.m6560ri(pointFM6897lr.x, pointFM6897lr2.x, f), C2018fi.m6560ri(pointFM6897lr.y, pointFM6897lr2.y, f));
            this.f4920ri.get(size3).m6896ik(C2018fi.m6560ri(pointFM6895ik.x, pointFM6895ik2.x, f), C2018fi.m6560ri(pointFM6895ik.y, pointFM6895ik2.y, f));
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m6808ri(boolean z) {
        this.f4918ik = z;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f4920ri.size() + "closed=" + this.f4918ik + AbstractJsonLexerKt.END_OBJ;
    }
}
