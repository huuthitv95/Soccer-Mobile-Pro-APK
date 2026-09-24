package com.bytedance.adsdk.p065lr.p074ri.p076ri;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.bytedance.adsdk.p065lr.C2023fi;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p066di.C2017di;
import com.bytedance.adsdk.p065lr.p066di.C2018fi;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.tan;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2093ka;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.p074ri.C2142ri;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.C2132di;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.C2134ik;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.C2135ka;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2156ri implements AbstractC2139ri.ri, InterfaceC2149fi, InterfaceC2157sf {

    /* JADX INFO: renamed from: aw */
    private final List<AbstractC2139ri<?, Float>> f5307aw;
    private final AbstractC2139ri<?, Float> bgr;

    /* JADX INFO: renamed from: bu */
    private C2134ik f5308bu;

    /* JADX INFO: renamed from: co */
    private final AbstractC2139ri<?, Integer> f5309co;

    /* JADX INFO: renamed from: ik */
    float f5312ik;

    /* JADX INFO: renamed from: lr */
    final Paint f5314lr;

    /* JADX INFO: renamed from: mj */
    private final jbs f5315mj;

    /* JADX INFO: renamed from: qt */
    private final float[] f5316qt;

    /* JADX INFO: renamed from: ri */
    protected final AbstractC2068ri f5317ri;

    /* JADX INFO: renamed from: sf */
    private final AbstractC2139ri<?, Float> f5318sf;
    private AbstractC2139ri<Float, Float> slm;

    /* JADX INFO: renamed from: vr */
    private AbstractC2139ri<ColorFilter, ColorFilter> f5319vr;

    /* JADX INFO: renamed from: ka */
    private final PathMeasure f5313ka = new PathMeasure();

    /* JADX INFO: renamed from: fi */
    private final Path f5311fi = new Path();

    /* JADX INFO: renamed from: di */
    private final Path f5310di = new Path();
    private final RectF xha = new RectF();
    private final List<ri> jbs = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.ri.ri$ri */
    private static final class ri {

        /* JADX INFO: renamed from: lr */
        private final ihz f5320lr;

        /* JADX INFO: renamed from: ri */
        private final List<InterfaceC2144aw> f5321ri;

        private ri(ihz ihzVar) {
            this.f5321ri = new ArrayList();
            this.f5320lr = ihzVar;
        }
    }

    AbstractC2156ri(jbs jbsVar, AbstractC2068ri abstractC2068ri, Paint.Cap cap, Paint.Join join, float f, C2093ka c2093ka, C2094lr c2094lr, List<C2094lr> list, C2094lr c2094lr2) {
        C2142ri c2142ri = new C2142ri(1);
        this.f5314lr = c2142ri;
        this.f5312ik = 0.0f;
        this.f5315mj = jbsVar;
        this.f5317ri = abstractC2068ri;
        c2142ri.setStyle(Paint.Style.STROKE);
        c2142ri.setStrokeCap(cap);
        c2142ri.setStrokeJoin(join);
        c2142ri.setStrokeMiter(f);
        this.f5309co = c2093ka.mo6903ri();
        this.f5318sf = c2094lr.mo6903ri();
        if (c2094lr2 == null) {
            this.bgr = null;
        } else {
            this.bgr = c2094lr2.mo6903ri();
        }
        this.f5307aw = new ArrayList(list.size());
        this.f5316qt = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f5307aw.add(list.get(i).mo6903ri());
        }
        abstractC2068ri.m6793ri(this.f5309co);
        abstractC2068ri.m6793ri(this.f5318sf);
        for (int i2 = 0; i2 < this.f5307aw.size(); i2++) {
            abstractC2068ri.m6793ri(this.f5307aw.get(i2));
        }
        AbstractC2139ri<?, Float> abstractC2139ri = this.bgr;
        if (abstractC2139ri != null) {
            abstractC2068ri.m6793ri(abstractC2139ri);
        }
        this.f5309co.m7111ri(this);
        this.f5318sf.m7111ri(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f5307aw.get(i3).m7111ri(this);
        }
        AbstractC2139ri<?, Float> abstractC2139ri2 = this.bgr;
        if (abstractC2139ri2 != null) {
            abstractC2139ri2.m7111ri(this);
        }
        if (abstractC2068ri.mo6788qt() != null) {
            AbstractC2139ri<Float, Float> abstractC2139riMo6903ri = abstractC2068ri.mo6788qt().m6874ri().mo6903ri();
            this.slm = abstractC2139riMo6903ri;
            abstractC2139riMo6903ri.m7111ri(this);
            abstractC2068ri.m6793ri(this.slm);
        }
        if (abstractC2068ri.mo6795sf() != null) {
            this.f5308bu = new C2134ik(this, abstractC2068ri, abstractC2068ri.mo6795sf());
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0110  */
    /* JADX INFO: renamed from: ri */
    private void m7166ri(Canvas canvas, ri riVar, Matrix matrix) {
        float f;
        float f2;
        float fMin;
        C2023fi.m6599ri("StrokeContent#applyTrimPath");
        if (riVar.f5320lr == null) {
            C2023fi.m6596lr("StrokeContent#applyTrimPath");
            return;
        }
        this.f5311fi.reset();
        for (int size = riVar.f5321ri.size() - 1; size >= 0; size--) {
            this.f5311fi.addPath(((InterfaceC2144aw) riVar.f5321ri.get(size)).mo7131ka(), matrix);
        }
        float fFloatValue = riVar.f5320lr.m7146ik().xha().floatValue() / 100.0f;
        float fFloatValue2 = riVar.f5320lr.m7147ka().xha().floatValue() / 100.0f;
        float fFloatValue3 = riVar.f5320lr.m7145fi().xha().floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.f5311fi, this.f5314lr);
            C2023fi.m6596lr("StrokeContent#applyTrimPath");
            return;
        }
        this.f5313ka.setPath(this.f5311fi, false);
        float length = this.f5313ka.getLength();
        while (this.f5313ka.nextContour()) {
            length += this.f5313ka.getLength();
        }
        float f3 = fFloatValue3 * length;
        float f4 = (fFloatValue * length) + f3;
        float fMin2 = Math.min((fFloatValue2 * length) + f3, (f4 + length) - 1.0f);
        float f5 = 0.0f;
        for (int size2 = riVar.f5321ri.size() - 1; size2 >= 0; size2--) {
            this.f5310di.set(((InterfaceC2144aw) riVar.f5321ri.get(size2)).mo7131ka());
            this.f5310di.transform(matrix);
            this.f5313ka.setPath(this.f5310di, false);
            float length2 = this.f5313ka.getLength();
            if (fMin2 > length) {
                float f6 = fMin2 - length;
                if (f6 >= f5 + length2 || f5 >= f6) {
                    f = f5 + length2;
                    if (f < f4 && f5 <= fMin2) {
                        if (f > fMin2 || f4 >= f5) {
                            f2 = f4 < f5 ? 0.0f : (f4 - f5) / length2;
                            fMin = fMin2 > f ? 1.0f : (fMin2 - f5) / length2;
                        } else {
                            canvas.drawPath(this.f5310di, this.f5314lr);
                        }
                    }
                } else {
                    f2 = f4 > length ? (f4 - length) / length2 : 0.0f;
                    fMin = Math.min(f6 / length2, 1.0f);
                }
                C2017di.m6548ri(this.f5310di, f2, fMin, 0.0f);
                canvas.drawPath(this.f5310di, this.f5314lr);
            } else {
                f = f5 + length2;
                if (f < f4) {
                }
            }
            f5 += length2;
        }
        C2023fi.m6596lr("StrokeContent#applyTrimPath");
    }

    /* JADX INFO: renamed from: ri */
    private void m7167ri(Matrix matrix) {
        C2023fi.m6599ri("StrokeContent#applyDashPattern");
        if (this.f5307aw.isEmpty()) {
            C2023fi.m6596lr("StrokeContent#applyDashPattern");
            return;
        }
        float fM6542ri = C2017di.m6542ri(matrix);
        for (int i = 0; i < this.f5307aw.size(); i++) {
            this.f5316qt[i] = this.f5307aw.get(i).xha().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f5316qt;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f5316qt;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.f5316qt;
            fArr3[i] = fArr3[i] * fM6542ri;
        }
        AbstractC2139ri<?, Float> abstractC2139ri = this.bgr;
        this.f5314lr.setPathEffect(new DashPathEffect(this.f5316qt, abstractC2139ri == null ? 0.0f : fM6542ri * abstractC2139ri.xha().floatValue()));
        C2023fi.m6596lr("StrokeContent#applyDashPattern");
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ri
    /* JADX INFO: renamed from: ri */
    public void mo6789ri() {
        this.f5315mj.invalidateSelf();
    }

    /* JADX INFO: renamed from: ri */
    public void mo6791ri(Canvas canvas, Matrix matrix, int i) {
        C2023fi.m6599ri("StrokeContent#draw");
        if (C2017di.m6539lr(matrix)) {
            C2023fi.m6596lr("StrokeContent#draw");
            return;
        }
        this.f5314lr.setAlpha(C2018fi.m6564ri((int) ((((i / 255.0f) * ((C2132di) this.f5309co).jbs()) / 100.0f) * 255.0f), 0, 255));
        this.f5314lr.setStrokeWidth(((C2135ka) this.f5318sf).jbs() * C2017di.m6542ri(matrix));
        if (this.f5314lr.getStrokeWidth() <= 0.0f) {
            C2023fi.m6596lr("StrokeContent#draw");
            return;
        }
        m7167ri(matrix);
        AbstractC2139ri<ColorFilter, ColorFilter> abstractC2139ri = this.f5319vr;
        if (abstractC2139ri != null) {
            this.f5314lr.setColorFilter(abstractC2139ri.xha());
        }
        AbstractC2139ri<Float, Float> abstractC2139ri2 = this.slm;
        if (abstractC2139ri2 != null) {
            float fFloatValue = abstractC2139ri2.xha().floatValue();
            if (fFloatValue == 0.0f) {
                this.f5314lr.setMaskFilter(null);
            } else if (fFloatValue != this.f5312ik) {
                this.f5314lr.setMaskFilter(this.f5317ri.m6784lr(fFloatValue));
            }
            this.f5312ik = fFloatValue;
        }
        C2134ik c2134ik = this.f5308bu;
        if (c2134ik != null) {
            c2134ik.m7093ri(this.f5314lr);
        }
        for (int i2 = 0; i2 < this.jbs.size(); i2++) {
            ri riVar = this.jbs.get(i2);
            if (riVar.f5320lr != null) {
                m7166ri(canvas, riVar, matrix);
            } else {
                C2023fi.m6599ri("StrokeContent#buildPath");
                this.f5311fi.reset();
                for (int size = riVar.f5321ri.size() - 1; size >= 0; size--) {
                    this.f5311fi.addPath(((InterfaceC2144aw) riVar.f5321ri.get(size)).mo7131ka(), matrix);
                }
                C2023fi.m6596lr("StrokeContent#buildPath");
                C2023fi.m6599ri("StrokeContent#drawPath");
                canvas.drawPath(this.f5311fi, this.f5314lr);
                C2023fi.m6596lr("StrokeContent#drawPath");
            }
        }
        C2023fi.m6596lr("StrokeContent#draw");
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2149fi
    /* JADX INFO: renamed from: ri */
    public void mo6710ri(RectF rectF, Matrix matrix, boolean z) {
        C2023fi.m6599ri("StrokeContent#getBounds");
        this.f5311fi.reset();
        for (int i = 0; i < this.jbs.size(); i++) {
            ri riVar = this.jbs.get(i);
            for (int i2 = 0; i2 < riVar.f5321ri.size(); i2++) {
                this.f5311fi.addPath(((InterfaceC2144aw) riVar.f5321ri.get(i2)).mo7131ka(), matrix);
            }
        }
        this.f5311fi.computeBounds(this.xha, false);
        float fJbs = ((C2135ka) this.f5318sf).jbs();
        RectF rectF2 = this.xha;
        float f = fJbs / 2.0f;
        rectF2.set(rectF2.left - f, this.xha.top - f, this.xha.right + f, this.xha.bottom + f);
        rectF.set(this.xha);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C2023fi.m6596lr("StrokeContent#getBounds");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik
    /* JADX INFO: renamed from: ri */
    public void mo6794ri(List<InterfaceC2150ik> list, List<InterfaceC2150ik> list2) {
        ihz ihzVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC2150ik interfaceC2150ik = list.get(size);
            if (interfaceC2150ik instanceof ihz) {
                ihz ihzVar2 = (ihz) interfaceC2150ik;
                if (ihzVar2.m7148lr() == tan.EnumC2085ri.INDIVIDUALLY) {
                    ihzVar = ihzVar2;
                }
            }
        }
        if (ihzVar != null) {
            ihzVar.m7149ri(this);
        }
        ri riVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            InterfaceC2150ik interfaceC2150ik2 = list2.get(size2);
            if (interfaceC2150ik2 instanceof ihz) {
                ihz ihzVar3 = (ihz) interfaceC2150ik2;
                if (ihzVar3.m7148lr() == tan.EnumC2085ri.INDIVIDUALLY) {
                    if (riVar != null) {
                        this.jbs.add(riVar);
                    }
                    riVar = new ri(ihzVar3);
                    ihzVar3.m7149ri(this);
                } else if (!(interfaceC2150ik2 instanceof InterfaceC2144aw)) {
                    if (riVar == null) {
                        riVar = new ri(ihzVar);
                    }
                    riVar.f5321ri.add((InterfaceC2144aw) interfaceC2150ik2);
                }
            } else if (!(interfaceC2150ik2 instanceof InterfaceC2144aw)) {
                if (riVar == null) {
                    riVar = new ri(ihzVar);
                }
                riVar.f5321ri.add((InterfaceC2144aw) interfaceC2150ik2);
            }
        }
        if (riVar != null) {
            this.jbs.add(riVar);
        }
    }
}
