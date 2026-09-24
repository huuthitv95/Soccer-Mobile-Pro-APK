package com.bytedance.adsdk.p065lr.p074ri.p075lr;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.p065lr.p066di.C2017di;
import com.bytedance.adsdk.p065lr.xha;
import com.bytedance.adsdk.p065lr.xha.C2167ri;

/* JADX INFO: loaded from: classes3.dex */
public class jbs extends C2167ri<PointF> {

    /* JADX INFO: renamed from: qt */
    private Path f5194qt;

    /* JADX INFO: renamed from: sf */
    private final C2167ri<PointF> f5195sf;

    public jbs(xha xhaVar, C2167ri<PointF> c2167ri) {
        super(xhaVar, c2167ri.f5404ri, c2167ri.f5401lr, c2167ri.f5399ik, c2167ri.f5400ka, c2167ri.f5398fi, c2167ri.f5397di, c2167ri.xha);
        this.f5195sf = c2167ri;
        m7095ri();
    }

    /* JADX INFO: renamed from: lr */
    Path m7094lr() {
        return this.f5194qt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ri */
    public void m7095ri() {
        boolean z = (this.f5401lr == 0 || this.f5404ri == 0 || !((PointF) this.f5404ri).equals(((PointF) this.f5401lr).x, ((PointF) this.f5401lr).y)) ? false : true;
        if (this.f5404ri == 0 || this.f5401lr == 0 || z) {
            return;
        }
        this.f5194qt = C2017di.m6545ri((PointF) this.f5404ri, (PointF) this.f5401lr, this.f5195sf.f5402mj, this.f5195sf.jbs);
    }
}
