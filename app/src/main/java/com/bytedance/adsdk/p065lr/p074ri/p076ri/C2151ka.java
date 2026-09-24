package com.bytedance.adsdk.p065lr.p074ri.p076ri;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p066di.C2017di;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.InterfaceC2076ik;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2089co;
import com.bytedance.adsdk.p065lr.p074ri.C2142ri;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.slm;
import com.bytedance.adsdk.p065lr.xha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.ri.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2151ka implements AbstractC2139ri.ri, InterfaceC2144aw, InterfaceC2149fi {

    /* JADX INFO: renamed from: di */
    private final String f5276di;

    /* JADX INFO: renamed from: fi */
    private final RectF f5277fi;

    /* JADX INFO: renamed from: ik */
    private final Matrix f5278ik;
    private final jbs jbs;

    /* JADX INFO: renamed from: ka */
    private final Path f5279ka;

    /* JADX INFO: renamed from: lr */
    private final RectF f5280lr;

    /* JADX INFO: renamed from: mj */
    private final List<InterfaceC2150ik> f5281mj;

    /* JADX INFO: renamed from: qt */
    private List<InterfaceC2144aw> f5282qt;

    /* JADX INFO: renamed from: ri */
    private final Paint f5283ri;

    /* JADX INFO: renamed from: sf */
    private slm f5284sf;
    private final boolean xha;

    public C2151ka(jbs jbsVar, AbstractC2068ri abstractC2068ri, com.bytedance.adsdk.p065lr.p068ik.p070lr.slm slmVar, xha xhaVar) {
        this(jbsVar, abstractC2068ri, slmVar.m6882ri(), slmVar.m6880ik(), m7156ri(jbsVar, xhaVar, abstractC2068ri, slmVar.m6881lr()), m7155ri(slmVar.m6881lr()));
    }

    C2151ka(jbs jbsVar, AbstractC2068ri abstractC2068ri, String str, boolean z, List<InterfaceC2150ik> list, C2089co c2089co) {
        this.f5283ri = new C2142ri();
        this.f5280lr = new RectF();
        this.f5278ik = new Matrix();
        this.f5279ka = new Path();
        this.f5277fi = new RectF();
        this.f5276di = str;
        this.jbs = jbsVar;
        this.xha = z;
        this.f5281mj = list;
        if (c2089co != null) {
            slm slmVarM6910qt = c2089co.m6910qt();
            this.f5284sf = slmVarM6910qt;
            slmVarM6910qt.m7128ri(abstractC2068ri);
            this.f5284sf.m7129ri(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC2150ik interfaceC2150ik = list.get(size);
            if (interfaceC2150ik instanceof InterfaceC2155qt) {
                arrayList.add((InterfaceC2155qt) interfaceC2150ik);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC2155qt) arrayList.get(size2)).mo7142ri(list.listIterator(list.size()));
        }
    }

    /* JADX INFO: renamed from: fi */
    private boolean m7154fi() {
        int i = 0;
        for (int i2 = 0; i2 < this.f5281mj.size(); i2++) {
            if ((this.f5281mj.get(i2) instanceof InterfaceC2149fi) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ri */
    static C2089co m7155ri(List<InterfaceC2076ik> list) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC2076ik interfaceC2076ik = list.get(i);
            if (interfaceC2076ik instanceof C2089co) {
                return (C2089co) interfaceC2076ik;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    private static List<InterfaceC2150ik> m7156ri(jbs jbsVar, xha xhaVar, AbstractC2068ri abstractC2068ri, List<InterfaceC2076ik> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            InterfaceC2150ik interfaceC2150ikMo6801ri = list.get(i).mo6801ri(jbsVar, xhaVar, abstractC2068ri);
            if (interfaceC2150ikMo6801ri != null) {
                arrayList.add(interfaceC2150ikMo6801ri);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ik */
    Matrix m7157ik() {
        slm slmVar = this.f5284sf;
        if (slmVar != null) {
            return slmVar.m7123ka();
        }
        this.f5278ik.reset();
        return this.f5278ik;
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2144aw
    /* JADX INFO: renamed from: ka */
    public Path mo7131ka() {
        this.f5278ik.reset();
        slm slmVar = this.f5284sf;
        if (slmVar != null) {
            this.f5278ik.set(slmVar.m7123ka());
        }
        this.f5279ka.reset();
        if (this.xha) {
            return this.f5279ka;
        }
        for (int size = this.f5281mj.size() - 1; size >= 0; size--) {
            InterfaceC2150ik interfaceC2150ik = this.f5281mj.get(size);
            if (interfaceC2150ik instanceof InterfaceC2144aw) {
                this.f5279ka.addPath(((InterfaceC2144aw) interfaceC2150ik).mo7131ka(), this.f5278ik);
            }
        }
        return this.f5279ka;
    }

    /* JADX INFO: renamed from: lr */
    List<InterfaceC2144aw> m7158lr() {
        if (this.f5282qt == null) {
            this.f5282qt = new ArrayList();
            for (int i = 0; i < this.f5281mj.size(); i++) {
                InterfaceC2150ik interfaceC2150ik = this.f5281mj.get(i);
                if (interfaceC2150ik instanceof InterfaceC2144aw) {
                    this.f5282qt.add((InterfaceC2144aw) interfaceC2150ik);
                }
            }
        }
        return this.f5282qt;
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ri
    /* JADX INFO: renamed from: ri */
    public void mo6789ri() {
        this.jbs.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2149fi
    /* JADX INFO: renamed from: ri */
    public void mo6791ri(Canvas canvas, Matrix matrix, int i) {
        if (this.xha) {
            return;
        }
        this.f5278ik.set(matrix);
        slm slmVar = this.f5284sf;
        if (slmVar != null) {
            this.f5278ik.preConcat(slmVar.m7123ka());
            i = (int) (((((this.f5284sf.m7126ri() == null ? 100 : this.f5284sf.m7126ri().xha().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.jbs.jbs() && m7154fi() && i != 255;
        if (z) {
            this.f5280lr.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo6710ri(this.f5280lr, this.f5278ik, true);
            this.f5283ri.setAlpha(i);
            C2017di.m6546ri(canvas, this.f5280lr, this.f5283ri);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f5281mj.size() - 1; size >= 0; size--) {
            InterfaceC2150ik interfaceC2150ik = this.f5281mj.get(size);
            if (interfaceC2150ik instanceof InterfaceC2149fi) {
                ((InterfaceC2149fi) interfaceC2150ik).mo6791ri(canvas, this.f5278ik, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2149fi
    /* JADX INFO: renamed from: ri */
    public void mo6710ri(RectF rectF, Matrix matrix, boolean z) {
        this.f5278ik.set(matrix);
        slm slmVar = this.f5284sf;
        if (slmVar != null) {
            this.f5278ik.preConcat(slmVar.m7123ka());
        }
        this.f5277fi.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f5281mj.size() - 1; size >= 0; size--) {
            InterfaceC2150ik interfaceC2150ik = this.f5281mj.get(size);
            if (interfaceC2150ik instanceof InterfaceC2149fi) {
                ((InterfaceC2149fi) interfaceC2150ik).mo6710ri(this.f5277fi, this.f5278ik, z);
                rectF.union(this.f5277fi);
            }
        }
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik
    /* JADX INFO: renamed from: ri */
    public void mo6794ri(List<InterfaceC2150ik> list, List<InterfaceC2150ik> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f5281mj.size());
        arrayList.addAll(list);
        for (int size = this.f5281mj.size() - 1; size >= 0; size--) {
            InterfaceC2150ik interfaceC2150ik = this.f5281mj.get(size);
            interfaceC2150ik.mo6794ri(arrayList, this.f5281mj.subList(0, size));
            arrayList.add(interfaceC2150ik);
        }
    }
}
