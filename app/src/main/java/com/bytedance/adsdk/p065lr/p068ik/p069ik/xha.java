package com.bytedance.adsdk.p065lr.p068ik.p069ik;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p067fi.C2044qt;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2083ri;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.slm;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.C2151ka;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class xha extends AbstractC2068ri {

    /* JADX INFO: renamed from: mj */
    private final C2065lr f4894mj;
    private final C2151ka xha;

    xha(jbs jbsVar, C2058fi c2058fi, C2065lr c2065lr, com.bytedance.adsdk.p065lr.xha xhaVar) {
        super(jbsVar, c2058fi);
        this.f4894mj = c2065lr;
        C2151ka c2151ka = new C2151ka(jbsVar, this, new slm("__container", c2058fi.bgr(), false), xhaVar);
        this.xha = c2151ka;
        c2151ka.mo6794ri(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri
    /* JADX INFO: renamed from: lr */
    public void mo6709lr(Canvas canvas, Matrix matrix, int i) {
        super.mo6709lr(canvas, matrix, i);
        this.xha.mo6791ri(canvas, matrix, i);
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri
    /* JADX INFO: renamed from: qt */
    public C2083ri mo6788qt() {
        C2083ri c2083riMo6788qt = super.mo6788qt();
        return c2083riMo6788qt != null ? c2083riMo6788qt : this.f4894mj.mo6788qt();
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri, com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2149fi
    /* JADX INFO: renamed from: ri */
    public void mo6710ri(RectF rectF, Matrix matrix, boolean z) {
        super.mo6710ri(rectF, matrix, z);
        this.xha.mo6710ri(rectF, this.f4885ri, z);
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri
    /* JADX INFO: renamed from: sf */
    public C2044qt mo6795sf() {
        C2044qt c2044qtMo6795sf = super.mo6795sf();
        return c2044qtMo6795sf != null ? c2044qtMo6795sf : this.f4894mj.mo6795sf();
    }
}
