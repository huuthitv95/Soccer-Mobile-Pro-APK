package com.bytedance.adsdk.p065lr.p074ri.p076ri;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p066di.C2018fi;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2073co;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public class slm implements AbstractC2139ri.ri, InterfaceC2144aw, InterfaceC2149fi, InterfaceC2155qt, InterfaceC2157sf {

    /* JADX INFO: renamed from: di */
    private final boolean f5322di;

    /* JADX INFO: renamed from: fi */
    private final String f5323fi;

    /* JADX INFO: renamed from: ik */
    private final jbs f5324ik;
    private final com.bytedance.adsdk.p065lr.p074ri.p075lr.slm jbs;

    /* JADX INFO: renamed from: ka */
    private final AbstractC2068ri f5325ka;

    /* JADX INFO: renamed from: mj */
    private final AbstractC2139ri<Float, Float> f5327mj;

    /* JADX INFO: renamed from: qt */
    private C2151ka f5328qt;
    private final AbstractC2139ri<Float, Float> xha;

    /* JADX INFO: renamed from: ri */
    private final Matrix f5329ri = new Matrix();

    /* JADX INFO: renamed from: lr */
    private final Path f5326lr = new Path();

    public slm(jbs jbsVar, AbstractC2068ri abstractC2068ri, C2073co c2073co) {
        this.f5324ik = jbsVar;
        this.f5325ka = abstractC2068ri;
        this.f5323fi = c2073co.m6816ri();
        this.f5322di = c2073co.m6812fi();
        AbstractC2139ri<Float, Float> abstractC2139riMo6903ri = c2073co.m6815lr().mo6903ri();
        this.xha = abstractC2139riMo6903ri;
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri);
        abstractC2139riMo6903ri.m7111ri(this);
        AbstractC2139ri<Float, Float> abstractC2139riMo6903ri2 = c2073co.m6813ik().mo6903ri();
        this.f5327mj = abstractC2139riMo6903ri2;
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri2);
        abstractC2139riMo6903ri2.m7111ri(this);
        com.bytedance.adsdk.p065lr.p074ri.p075lr.slm slmVarM6910qt = c2073co.m6814ka().m6910qt();
        this.jbs = slmVarM6910qt;
        slmVarM6910qt.m7128ri(abstractC2068ri);
        slmVarM6910qt.m7129ri(this);
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2144aw
    /* JADX INFO: renamed from: ka */
    public Path mo7131ka() {
        Path pathMo7131ka = this.f5328qt.mo7131ka();
        this.f5326lr.reset();
        float fFloatValue = this.xha.xha().floatValue();
        float fFloatValue2 = this.f5327mj.xha().floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            this.f5329ri.set(this.jbs.m7124lr(i + fFloatValue2));
            this.f5326lr.addPath(pathMo7131ka, this.f5329ri);
        }
        return this.f5326lr;
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ri
    /* JADX INFO: renamed from: ri */
    public void mo6789ri() {
        this.f5324ik.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2149fi
    /* JADX INFO: renamed from: ri */
    public void mo6791ri(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = this.xha.xha().floatValue();
        float fFloatValue2 = this.f5327mj.xha().floatValue();
        float fFloatValue3 = this.jbs.m7125lr().xha().floatValue() / 100.0f;
        float fFloatValue4 = this.jbs.m7122ik().xha().floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.f5329ri.set(matrix);
            float f = i2;
            this.f5329ri.preConcat(this.jbs.m7124lr(f + fFloatValue2));
            this.f5328qt.mo6791ri(canvas, this.f5329ri, (int) (i * C2018fi.m6560ri(fFloatValue3, fFloatValue4, f / fFloatValue)));
        }
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2149fi
    /* JADX INFO: renamed from: ri */
    public void mo6710ri(RectF rectF, Matrix matrix, boolean z) {
        this.f5328qt.mo6710ri(rectF, matrix, z);
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik
    /* JADX INFO: renamed from: ri */
    public void mo6794ri(List<InterfaceC2150ik> list, List<InterfaceC2150ik> list2) {
        this.f5328qt.mo6794ri(list, list2);
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2155qt
    /* JADX INFO: renamed from: ri */
    public void mo7142ri(ListIterator<InterfaceC2150ik> listIterator) {
        if (this.f5328qt != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f5328qt = new C2151ka(this.f5324ik, this.f5325ka, "Repeater", this.f5322di, arrayList, null);
    }
}
