package com.bytedance.adsdk.p065lr.p074ri.p076ri;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2074di;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2078ka;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.xha;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.C2130bu;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes3.dex */
public class jbs extends AbstractC2156ri {

    /* JADX INFO: renamed from: aw */
    private final AbstractC2139ri<PointF, PointF> f5268aw;
    private C2130bu bgr;

    /* JADX INFO: renamed from: co */
    private final AbstractC2139ri<PointF, PointF> f5269co;

    /* JADX INFO: renamed from: di */
    private final LongSparseArray<LinearGradient> f5270di;

    /* JADX INFO: renamed from: fi */
    private final boolean f5271fi;
    private final xha jbs;

    /* JADX INFO: renamed from: ka */
    private final String f5272ka;

    /* JADX INFO: renamed from: mj */
    private final RectF f5273mj;

    /* JADX INFO: renamed from: qt */
    private final int f5274qt;

    /* JADX INFO: renamed from: sf */
    private final AbstractC2139ri<C2078ka, C2078ka> f5275sf;
    private final LongSparseArray<RadialGradient> xha;

    public jbs(com.bytedance.adsdk.p065lr.jbs jbsVar, AbstractC2068ri abstractC2068ri, C2074di c2074di) {
        super(jbsVar, abstractC2068ri, c2074di.m6824mj().m6863ri(), c2074di.jbs().m6862ri(), c2074di.m6818co(), c2074di.m6822ka(), c2074di.xha(), c2074di.m6825qt(), c2074di.m6827sf());
        this.f5270di = new LongSparseArray<>();
        this.xha = new LongSparseArray<>();
        this.f5273mj = new RectF();
        this.f5272ka = c2074di.m6826ri();
        this.jbs = c2074di.m6823lr();
        this.f5271fi = c2074di.m6817aw();
        this.f5274qt = (int) (jbsVar.m6988su().m7184fi() / 32.0f);
        AbstractC2139ri<C2078ka, C2078ka> abstractC2139riMo6903ri = c2074di.m6821ik().mo6903ri();
        this.f5275sf = abstractC2139riMo6903ri;
        abstractC2139riMo6903ri.m7111ri(this);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri);
        AbstractC2139ri<PointF, PointF> abstractC2139riMo6903ri2 = c2074di.m6820fi().mo6903ri();
        this.f5269co = abstractC2139riMo6903ri2;
        abstractC2139riMo6903ri2.m7111ri(this);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri2);
        AbstractC2139ri<PointF, PointF> abstractC2139riMo6903ri3 = c2074di.m6819di().mo6903ri();
        this.f5268aw = abstractC2139riMo6903ri3;
        abstractC2139riMo6903ri3.m7111ri(this);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri3);
    }

    /* JADX INFO: renamed from: ik */
    private RadialGradient m7150ik() {
        long jM7151ka = m7151ka();
        RadialGradient radialGradient = this.xha.get(jM7151ka);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFXha = this.f5269co.xha();
        PointF pointFXha2 = this.f5268aw.xha();
        C2078ka c2078kaXha = this.f5275sf.xha();
        int[] iArrM7153ri = m7153ri(c2078kaXha.m6841lr());
        float[] fArrM6844ri = c2078kaXha.m6844ri();
        float f = pointFXha.x;
        float f2 = pointFXha.y;
        RadialGradient radialGradient2 = new RadialGradient(f, f2, (float) Math.hypot(pointFXha2.x - f, pointFXha2.y - f2), iArrM7153ri, fArrM6844ri, Shader.TileMode.CLAMP);
        this.xha.put(jM7151ka, radialGradient2);
        return radialGradient2;
    }

    /* JADX INFO: renamed from: ka */
    private int m7151ka() {
        int iRound = Math.round(this.f5269co.m7108mj() * this.f5274qt);
        int iRound2 = Math.round(this.f5268aw.m7108mj() * this.f5274qt);
        int iRound3 = Math.round(this.f5275sf.m7108mj() * this.f5274qt);
        int i = iRound != 0 ? iRound * IronSourceError.ERROR_NON_EXISTENT_INSTANCE : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    /* JADX INFO: renamed from: lr */
    private LinearGradient m7152lr() {
        long jM7151ka = m7151ka();
        LinearGradient linearGradient = this.f5270di.get(jM7151ka);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFXha = this.f5269co.xha();
        PointF pointFXha2 = this.f5268aw.xha();
        C2078ka c2078kaXha = this.f5275sf.xha();
        LinearGradient linearGradient2 = new LinearGradient(pointFXha.x, pointFXha.y, pointFXha2.x, pointFXha2.y, m7153ri(c2078kaXha.m6841lr()), c2078kaXha.m6844ri(), Shader.TileMode.CLAMP);
        this.f5270di.put(jM7151ka, linearGradient2);
        return linearGradient2;
    }

    /* JADX INFO: renamed from: ri */
    private int[] m7153ri(int[] iArr) {
        if (this.bgr == null) {
            return iArr;
        }
        throw null;
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.AbstractC2156ri, com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2149fi
    /* JADX INFO: renamed from: ri */
    public void mo6791ri(Canvas canvas, Matrix matrix, int i) {
        if (this.f5271fi) {
            return;
        }
        mo6710ri(this.f5273mj, matrix, false);
        Shader shaderM7152lr = this.jbs == xha.LINEAR ? m7152lr() : m7150ik();
        shaderM7152lr.setLocalMatrix(matrix);
        this.f5314lr.setShader(shaderM7152lr);
        super.mo6791ri(canvas, matrix, i);
    }
}
