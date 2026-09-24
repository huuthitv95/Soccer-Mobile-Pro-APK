package com.bytedance.adsdk.p065lr.p074ri.p076ri;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.p065lr.C2023fi;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p066di.C2018fi;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2086vr;
import com.bytedance.adsdk.p065lr.p074ri.C2142ri;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.C2134ik;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.C2136lr;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class xha implements AbstractC2139ri.ri, InterfaceC2149fi, InterfaceC2157sf {

    /* JADX INFO: renamed from: aw */
    private C2134ik f5339aw;

    /* JADX INFO: renamed from: co */
    private AbstractC2139ri<Float, Float> f5340co;

    /* JADX INFO: renamed from: di */
    private final boolean f5341di;

    /* JADX INFO: renamed from: fi */
    private final String f5342fi;

    /* JADX INFO: renamed from: ik */
    private final Paint f5343ik;
    private final AbstractC2139ri<Integer, Integer> jbs;

    /* JADX INFO: renamed from: ka */
    private final AbstractC2068ri f5344ka;

    /* JADX INFO: renamed from: lr */
    private final Path f5345lr;

    /* JADX INFO: renamed from: mj */
    private final AbstractC2139ri<Integer, Integer> f5346mj;

    /* JADX INFO: renamed from: qt */
    private AbstractC2139ri<ColorFilter, ColorFilter> f5347qt;

    /* JADX INFO: renamed from: ri */
    float f5348ri;

    /* JADX INFO: renamed from: sf */
    private final jbs f5349sf;
    private final List<InterfaceC2144aw> xha;

    public xha(jbs jbsVar, AbstractC2068ri abstractC2068ri, C2086vr c2086vr) {
        Path path = new Path();
        this.f5345lr = path;
        this.f5343ik = new C2142ri(1);
        this.xha = new ArrayList();
        this.f5344ka = abstractC2068ri;
        this.f5342fi = c2086vr.m6894ri();
        this.f5341di = c2086vr.m6890fi();
        this.f5349sf = jbsVar;
        if (abstractC2068ri.mo6788qt() != null) {
            AbstractC2139ri<Float, Float> abstractC2139riMo6903ri = abstractC2068ri.mo6788qt().m6874ri().mo6903ri();
            this.f5340co = abstractC2139riMo6903ri;
            abstractC2139riMo6903ri.m7111ri(this);
            abstractC2068ri.m6793ri(this.f5340co);
        }
        if (abstractC2068ri.mo6795sf() != null) {
            this.f5339aw = new C2134ik(this, abstractC2068ri, abstractC2068ri.mo6795sf());
        }
        if (c2086vr.m6893lr() == null || c2086vr.m6891ik() == null) {
            this.f5346mj = null;
            this.jbs = null;
            return;
        }
        path.setFillType(c2086vr.m6892ka());
        AbstractC2139ri<Integer, Integer> abstractC2139riMo6903ri2 = c2086vr.m6893lr().mo6903ri();
        this.f5346mj = abstractC2139riMo6903ri2;
        abstractC2139riMo6903ri2.m7111ri(this);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri2);
        AbstractC2139ri<Integer, Integer> abstractC2139riMo6903ri3 = c2086vr.m6891ik().mo6903ri();
        this.jbs = abstractC2139riMo6903ri3;
        abstractC2139riMo6903ri3.m7111ri(this);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri3);
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ri
    /* JADX INFO: renamed from: ri */
    public void mo6789ri() {
        this.f5349sf.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2149fi
    /* JADX INFO: renamed from: ri */
    public void mo6791ri(Canvas canvas, Matrix matrix, int i) {
        if (this.f5341di) {
            return;
        }
        C2023fi.m6599ri("FillContent#draw");
        this.f5343ik.setColor((C2018fi.m6564ri((int) ((((i / 255.0f) * this.jbs.xha().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((C2136lr) this.f5346mj).jbs() & ViewCompat.MEASURED_SIZE_MASK));
        AbstractC2139ri<ColorFilter, ColorFilter> abstractC2139ri = this.f5347qt;
        if (abstractC2139ri != null) {
            this.f5343ik.setColorFilter(abstractC2139ri.xha());
        }
        AbstractC2139ri<Float, Float> abstractC2139ri2 = this.f5340co;
        if (abstractC2139ri2 != null) {
            float fFloatValue = abstractC2139ri2.xha().floatValue();
            if (fFloatValue == 0.0f) {
                this.f5343ik.setMaskFilter(null);
            } else if (fFloatValue != this.f5348ri) {
                this.f5343ik.setMaskFilter(this.f5344ka.m6784lr(fFloatValue));
            }
            this.f5348ri = fFloatValue;
        }
        C2134ik c2134ik = this.f5339aw;
        if (c2134ik != null) {
            c2134ik.m7093ri(this.f5343ik);
        }
        this.f5345lr.reset();
        for (int i2 = 0; i2 < this.xha.size(); i2++) {
            this.f5345lr.addPath(this.xha.get(i2).mo7131ka(), matrix);
        }
        canvas.drawPath(this.f5345lr, this.f5343ik);
        C2023fi.m6596lr("FillContent#draw");
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2149fi
    /* JADX INFO: renamed from: ri */
    public void mo6710ri(RectF rectF, Matrix matrix, boolean z) {
        this.f5345lr.reset();
        for (int i = 0; i < this.xha.size(); i++) {
            this.f5345lr.addPath(this.xha.get(i).mo7131ka(), matrix);
        }
        this.f5345lr.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik
    /* JADX INFO: renamed from: ri */
    public void mo6794ri(List<InterfaceC2150ik> list, List<InterfaceC2150ik> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC2150ik interfaceC2150ik = list2.get(i);
            if (interfaceC2150ik instanceof InterfaceC2144aw) {
                this.xha.add((InterfaceC2144aw) interfaceC2150ik);
            }
        }
    }
}
