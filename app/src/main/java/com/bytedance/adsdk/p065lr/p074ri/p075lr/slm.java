package com.bytedance.adsdk.p065lr.p074ri.p075lr;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2089co;
import com.bytedance.adsdk.p065lr.xha.C2165ik;

/* JADX INFO: loaded from: classes3.dex */
public class slm {

    /* JADX INFO: renamed from: aw */
    private AbstractC2139ri<?, Float> f5216aw;
    private AbstractC2139ri<?, Float> bgr;

    /* JADX INFO: renamed from: co */
    private C2135ka f5217co;

    /* JADX INFO: renamed from: di */
    private AbstractC2139ri<PointF, PointF> f5218di;

    /* JADX INFO: renamed from: fi */
    private final float[] f5219fi;

    /* JADX INFO: renamed from: ik */
    private final Matrix f5220ik;
    private AbstractC2139ri<Float, Float> jbs;

    /* JADX INFO: renamed from: ka */
    private final Matrix f5221ka;

    /* JADX INFO: renamed from: lr */
    private final Matrix f5222lr;

    /* JADX INFO: renamed from: mj */
    private AbstractC2139ri<C2165ik, C2165ik> f5223mj;

    /* JADX INFO: renamed from: qt */
    private AbstractC2139ri<Integer, Integer> f5224qt;

    /* JADX INFO: renamed from: ri */
    private final Matrix f5225ri = new Matrix();

    /* JADX INFO: renamed from: sf */
    private C2135ka f5226sf;
    private AbstractC2139ri<?, PointF> xha;

    public slm(C2089co c2089co) {
        this.f5218di = c2089co.m6911ri() == null ? null : c2089co.m6911ri().mo6903ri();
        this.xha = c2089co.m6908lr() == null ? null : c2089co.m6908lr().mo6903ri();
        this.f5223mj = c2089co.m6906ik() == null ? null : c2089co.m6906ik().mo6903ri();
        this.jbs = c2089co.m6907ka() == null ? null : c2089co.m6907ka().mo6903ri();
        C2135ka c2135ka = c2089co.m6909mj() == null ? null : (C2135ka) c2089co.m6909mj().mo6903ri();
        this.f5226sf = c2135ka;
        if (c2135ka != null) {
            this.f5222lr = new Matrix();
            this.f5220ik = new Matrix();
            this.f5221ka = new Matrix();
            this.f5219fi = new float[9];
        } else {
            this.f5222lr = null;
            this.f5220ik = null;
            this.f5221ka = null;
            this.f5219fi = null;
        }
        this.f5217co = c2089co.jbs() == null ? null : (C2135ka) c2089co.jbs().mo6903ri();
        if (c2089co.m6905fi() != null) {
            this.f5224qt = c2089co.m6905fi().mo6903ri();
        }
        if (c2089co.m6904di() != null) {
            this.f5216aw = c2089co.m6904di().mo6903ri();
        } else {
            this.f5216aw = null;
        }
        if (c2089co.xha() != null) {
            this.bgr = c2089co.xha().mo6903ri();
        } else {
            this.bgr = null;
        }
    }

    /* JADX INFO: renamed from: fi */
    private void m7121fi() {
        for (int i = 0; i < 9; i++) {
            this.f5219fi[i] = 0.0f;
        }
    }

    /* JADX INFO: renamed from: ik */
    public AbstractC2139ri<?, Float> m7122ik() {
        return this.bgr;
    }

    /* JADX INFO: renamed from: ka */
    public Matrix m7123ka() {
        PointF pointFXha;
        PointF pointFXha2;
        this.f5225ri.reset();
        AbstractC2139ri<?, PointF> abstractC2139ri = this.xha;
        if (abstractC2139ri != null && (pointFXha2 = abstractC2139ri.xha()) != null && (pointFXha2.x != 0.0f || pointFXha2.y != 0.0f)) {
            this.f5225ri.preTranslate(pointFXha2.x, pointFXha2.y);
        }
        AbstractC2139ri<Float, Float> abstractC2139ri2 = this.jbs;
        if (abstractC2139ri2 != null) {
            float fFloatValue = abstractC2139ri2 instanceof C2130bu ? abstractC2139ri2.xha().floatValue() : ((C2135ka) abstractC2139ri2).jbs();
            if (fFloatValue != 0.0f) {
                this.f5225ri.preRotate(fFloatValue);
            }
        }
        C2135ka c2135ka = this.f5226sf;
        if (c2135ka != null) {
            C2135ka c2135ka2 = this.f5217co;
            float fCos = c2135ka2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-c2135ka2.jbs()) + 90.0f));
            C2135ka c2135ka3 = this.f5217co;
            float fSin = c2135ka3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-c2135ka3.jbs()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(c2135ka.jbs()));
            m7121fi();
            float[] fArr = this.f5219fi;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f = -fSin;
            fArr[3] = f;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f5222lr.setValues(fArr);
            m7121fi();
            float[] fArr2 = this.f5219fi;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f5220ik.setValues(fArr2);
            m7121fi();
            float[] fArr3 = this.f5219fi;
            fArr3[0] = fCos;
            fArr3[1] = f;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f5221ka.setValues(fArr3);
            this.f5220ik.preConcat(this.f5222lr);
            this.f5221ka.preConcat(this.f5220ik);
            this.f5225ri.preConcat(this.f5221ka);
        }
        AbstractC2139ri<C2165ik, C2165ik> abstractC2139ri3 = this.f5223mj;
        if (abstractC2139ri3 != null) {
            C2165ik c2165ikXha = abstractC2139ri3.xha();
            if (c2165ikXha.m7204ri() != 1.0f || c2165ikXha.m7202lr() != 1.0f) {
                this.f5225ri.preScale(c2165ikXha.m7204ri(), c2165ikXha.m7202lr());
            }
        }
        AbstractC2139ri<PointF, PointF> abstractC2139ri4 = this.f5218di;
        if (abstractC2139ri4 != null && (((pointFXha = abstractC2139ri4.xha()) != null && pointFXha.x != 0.0f) || pointFXha.y != 0.0f)) {
            this.f5225ri.preTranslate(-pointFXha.x, -pointFXha.y);
        }
        return this.f5225ri;
    }

    /* JADX INFO: renamed from: lr */
    public Matrix m7124lr(float f) {
        AbstractC2139ri<?, PointF> abstractC2139ri = this.xha;
        PointF pointFXha = abstractC2139ri == null ? null : abstractC2139ri.xha();
        AbstractC2139ri<C2165ik, C2165ik> abstractC2139ri2 = this.f5223mj;
        C2165ik c2165ikXha = abstractC2139ri2 == null ? null : abstractC2139ri2.xha();
        this.f5225ri.reset();
        if (pointFXha != null) {
            this.f5225ri.preTranslate(pointFXha.x * f, pointFXha.y * f);
        }
        if (c2165ikXha != null) {
            double d = f;
            this.f5225ri.preScale((float) Math.pow(c2165ikXha.m7204ri(), d), (float) Math.pow(c2165ikXha.m7202lr(), d));
        }
        AbstractC2139ri<Float, Float> abstractC2139ri3 = this.jbs;
        if (abstractC2139ri3 != null) {
            float fFloatValue = abstractC2139ri3.xha().floatValue();
            AbstractC2139ri<PointF, PointF> abstractC2139ri4 = this.f5218di;
            PointF pointFXha2 = abstractC2139ri4 != null ? abstractC2139ri4.xha() : null;
            this.f5225ri.preRotate(fFloatValue * f, pointFXha2 == null ? 0.0f : pointFXha2.x, pointFXha2 != null ? pointFXha2.y : 0.0f);
        }
        return this.f5225ri;
    }

    /* JADX INFO: renamed from: lr */
    public AbstractC2139ri<?, Float> m7125lr() {
        return this.f5216aw;
    }

    /* JADX INFO: renamed from: ri */
    public AbstractC2139ri<?, Integer> m7126ri() {
        return this.f5224qt;
    }

    /* JADX INFO: renamed from: ri */
    public void m7127ri(float f) {
        AbstractC2139ri<Integer, Integer> abstractC2139ri = this.f5224qt;
        if (abstractC2139ri != null) {
            abstractC2139ri.mo7086ri(f);
        }
        AbstractC2139ri<?, Float> abstractC2139ri2 = this.f5216aw;
        if (abstractC2139ri2 != null) {
            abstractC2139ri2.mo7086ri(f);
        }
        AbstractC2139ri<?, Float> abstractC2139ri3 = this.bgr;
        if (abstractC2139ri3 != null) {
            abstractC2139ri3.mo7086ri(f);
        }
        AbstractC2139ri<PointF, PointF> abstractC2139ri4 = this.f5218di;
        if (abstractC2139ri4 != null) {
            abstractC2139ri4.mo7086ri(f);
        }
        AbstractC2139ri<?, PointF> abstractC2139ri5 = this.xha;
        if (abstractC2139ri5 != null) {
            abstractC2139ri5.mo7086ri(f);
        }
        AbstractC2139ri<C2165ik, C2165ik> abstractC2139ri6 = this.f5223mj;
        if (abstractC2139ri6 != null) {
            abstractC2139ri6.mo7086ri(f);
        }
        AbstractC2139ri<Float, Float> abstractC2139ri7 = this.jbs;
        if (abstractC2139ri7 != null) {
            abstractC2139ri7.mo7086ri(f);
        }
        C2135ka c2135ka = this.f5226sf;
        if (c2135ka != null) {
            c2135ka.mo7086ri(f);
        }
        C2135ka c2135ka2 = this.f5217co;
        if (c2135ka2 != null) {
            c2135ka2.mo7086ri(f);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7128ri(AbstractC2068ri abstractC2068ri) {
        abstractC2068ri.m6793ri(this.f5224qt);
        abstractC2068ri.m6793ri(this.f5216aw);
        abstractC2068ri.m6793ri(this.bgr);
        abstractC2068ri.m6793ri(this.f5218di);
        abstractC2068ri.m6793ri(this.xha);
        abstractC2068ri.m6793ri(this.f5223mj);
        abstractC2068ri.m6793ri(this.jbs);
        abstractC2068ri.m6793ri(this.f5226sf);
        abstractC2068ri.m6793ri(this.f5217co);
    }

    /* JADX INFO: renamed from: ri */
    public void m7129ri(AbstractC2139ri.ri riVar) {
        AbstractC2139ri<Integer, Integer> abstractC2139ri = this.f5224qt;
        if (abstractC2139ri != null) {
            abstractC2139ri.m7111ri(riVar);
        }
        AbstractC2139ri<?, Float> abstractC2139ri2 = this.f5216aw;
        if (abstractC2139ri2 != null) {
            abstractC2139ri2.m7111ri(riVar);
        }
        AbstractC2139ri<?, Float> abstractC2139ri3 = this.bgr;
        if (abstractC2139ri3 != null) {
            abstractC2139ri3.m7111ri(riVar);
        }
        AbstractC2139ri<PointF, PointF> abstractC2139ri4 = this.f5218di;
        if (abstractC2139ri4 != null) {
            abstractC2139ri4.m7111ri(riVar);
        }
        AbstractC2139ri<?, PointF> abstractC2139ri5 = this.xha;
        if (abstractC2139ri5 != null) {
            abstractC2139ri5.m7111ri(riVar);
        }
        AbstractC2139ri<C2165ik, C2165ik> abstractC2139ri6 = this.f5223mj;
        if (abstractC2139ri6 != null) {
            abstractC2139ri6.m7111ri(riVar);
        }
        AbstractC2139ri<Float, Float> abstractC2139ri7 = this.jbs;
        if (abstractC2139ri7 != null) {
            abstractC2139ri7.m7111ri(riVar);
        }
        C2135ka c2135ka = this.f5226sf;
        if (c2135ka != null) {
            c2135ka.m7111ri(riVar);
        }
        C2135ka c2135ka2 = this.f5217co;
        if (c2135ka2 != null) {
            c2135ka2.m7111ri(riVar);
        }
    }
}
