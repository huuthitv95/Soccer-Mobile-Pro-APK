package com.bytedance.adsdk.p065lr.p068ik.p069ik;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import com.bytedance.adsdk.p065lr.C2023fi;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p066di.C2017di;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri;
import com.bytedance.adsdk.p065lr.xha;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.ik.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2065lr extends AbstractC2068ri {

    /* JADX INFO: renamed from: co */
    private boolean f4859co;
    private final RectF jbs;

    /* JADX INFO: renamed from: mj */
    private final List<AbstractC2068ri> f4860mj;

    /* JADX INFO: renamed from: qt */
    private final RectF f4861qt;

    /* JADX INFO: renamed from: sf */
    private final Paint f4862sf;
    private AbstractC2139ri<Float, Float> xha;

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.ik.lr$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: ri */
        static final /* synthetic */ int[] f4863ri;

        static {
            int[] iArr = new int[C2058fi.lr.values().length];
            f4863ri = iArr;
            try {
                iArr[C2058fi.lr.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4863ri[C2058fi.lr.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C2065lr(jbs jbsVar, C2058fi c2058fi, List<C2058fi> list, xha xhaVar, Context context) {
        int i;
        AbstractC2068ri abstractC2068ri;
        C2058fi.lr lrVarM6715co;
        int i2;
        super(jbsVar, c2058fi);
        this.f4860mj = new ArrayList();
        this.jbs = new RectF();
        this.f4861qt = new RectF();
        this.f4862sf = new Paint();
        this.f4859co = true;
        C2094lr c2094lrIhz = c2058fi.ihz();
        if (c2094lrIhz != null) {
            AbstractC2139ri<Float, Float> abstractC2139riMo6903ri = c2094lrIhz.mo6903ri();
            this.xha = abstractC2139riMo6903ri;
            m6793ri(abstractC2139riMo6903ri);
            this.xha.m7111ri(this);
        } else {
            this.xha = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(xhaVar.m7180aw().size());
        int size = list.size() - 1;
        AbstractC2068ri abstractC2068ri2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C2058fi c2058fi2 = list.get(size);
            AbstractC2068ri abstractC2068riM6771ri = AbstractC2068ri.m6771ri(this, c2058fi2, jbsVar, xhaVar, context);
            if (abstractC2068riM6771ri != null) {
                longSparseArray.put(abstractC2068riM6771ri.m6785lr().m6717fi(), abstractC2068riM6771ri);
                if (abstractC2068ri2 != null) {
                    abstractC2068ri2.m6792ri(abstractC2068riM6771ri);
                    abstractC2068ri2 = null;
                } else {
                    this.f4860mj.add(0, abstractC2068riM6771ri);
                    if (c2058fi2 != null && (lrVarM6715co = c2058fi2.m6715co()) != null && ((i2 = AnonymousClass1.f4863ri[lrVarM6715co.ordinal()]) == 1 || i2 == 2)) {
                        abstractC2068ri2 = abstractC2068riM6771ri;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.size(); i++) {
            AbstractC2068ri abstractC2068ri3 = (AbstractC2068ri) longSparseArray.get(longSparseArray.keyAt(i));
            if (abstractC2068ri3 != null && (abstractC2068ri = (AbstractC2068ri) longSparseArray.get(abstractC2068ri3.m6785lr().m6712aw())) != null) {
                abstractC2068ri3.m6786lr(abstractC2068ri);
            }
        }
    }

    /* JADX INFO: renamed from: co */
    public List<AbstractC2068ri> m6756co() {
        return this.f4860mj;
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri
    /* JADX INFO: renamed from: lr */
    public void mo6709lr(Canvas canvas, Matrix matrix, int i) {
        super.mo6709lr(canvas, matrix, i);
        C2023fi.m6599ri("CompositionLayer#draw");
        this.f4861qt.set(0.0f, 0.0f, this.f4879ik.m6721mj(), this.f4879ik.jbs());
        matrix.mapRect(this.f4861qt);
        boolean z = this.f4881lr.jbs() && this.f4860mj.size() > 1 && i != 255;
        if (z) {
            this.f4862sf.setAlpha(i);
            C2017di.m6546ri(canvas, this.f4861qt, this.f4862sf);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f4860mj.size() - 1; size >= 0; size--) {
            if (((this.f4859co || !"__container".equals(this.f4879ik.m6716di())) && !this.f4861qt.isEmpty()) ? canvas.clipRect(this.f4861qt) : true) {
                this.f4860mj.get(size).mo6791ri(canvas, matrix, i);
            }
        }
        canvas.restore();
        C2023fi.m6596lr("CompositionLayer#draw");
    }

    /* JADX INFO: renamed from: lr */
    public void m6757lr(boolean z) {
        this.f4859co = z;
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri
    /* JADX INFO: renamed from: ri */
    public void mo6758ri(float f) {
        super.mo6758ri(f);
        if (this.xha != null) {
            f = ((this.xha.xha().floatValue() * this.f4879ik.m6724ri().m7182co()) - this.f4879ik.m6724ri().m7183di()) / (this.f4881lr.m6988su().m7181bu() + 0.01f);
        }
        if (this.xha == null) {
            f -= this.f4879ik.m6718ik();
        }
        if (this.f4879ik.m6720lr() != 0.0f && !"__container".equals(this.f4879ik.m6716di())) {
            f /= this.f4879ik.m6720lr();
        }
        for (int size = this.f4860mj.size() - 1; size >= 0; size--) {
            this.f4860mj.get(size).mo6758ri(f);
        }
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri, com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2149fi
    /* JADX INFO: renamed from: ri */
    public void mo6710ri(RectF rectF, Matrix matrix, boolean z) {
        super.mo6710ri(rectF, matrix, z);
        for (int size = this.f4860mj.size() - 1; size >= 0; size--) {
            this.jbs.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f4860mj.get(size).mo6710ri(this.jbs, this.f4885ri, true);
            rectF.union(this.jbs);
        }
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri
    /* JADX INFO: renamed from: ri */
    public void mo6759ri(boolean z) {
        super.mo6759ri(z);
        Iterator<AbstractC2068ri> it = this.f4860mj.iterator();
        while (it.hasNext()) {
            it.next().mo6759ri(z);
        }
    }
}
