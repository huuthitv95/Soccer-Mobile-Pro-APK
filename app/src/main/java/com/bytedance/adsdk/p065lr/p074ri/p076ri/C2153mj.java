package com.bytedance.adsdk.p065lr.p074ri.p076ri;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.bytedance.adsdk.p065lr.C2023fi;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p066di.C2018fi;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2075fi;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2078ka;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.xha;
import com.bytedance.adsdk.p065lr.p074ri.C2142ri;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.C2130bu;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.C2134ik;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.ri.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C2153mj implements AbstractC2139ri.ri, InterfaceC2149fi, InterfaceC2157sf {

    /* JADX INFO: renamed from: ac */
    private AbstractC2139ri<Float, Float> f5286ac;

    /* JADX INFO: renamed from: aw */
    private final AbstractC2139ri<Integer, Integer> f5287aw;
    private final AbstractC2139ri<PointF, PointF> bgr;

    /* JADX INFO: renamed from: bu */
    private C2130bu f5288bu;

    /* JADX INFO: renamed from: co */
    private final AbstractC2139ri<C2078ka, C2078ka> f5289co;
    private C2134ik ihz;

    /* JADX INFO: renamed from: ik */
    private final boolean f5292ik;
    private final RectF jbs;

    /* JADX INFO: renamed from: ka */
    private final AbstractC2068ri f5293ka;

    /* JADX INFO: renamed from: lr */
    private final String f5294lr;

    /* JADX INFO: renamed from: mj */
    private final Paint f5295mj;

    /* JADX INFO: renamed from: nr */
    private final jbs f5296nr;

    /* JADX INFO: renamed from: qt */
    private final List<InterfaceC2144aw> f5297qt;

    /* JADX INFO: renamed from: ri */
    float f5298ri;

    /* JADX INFO: renamed from: sf */
    private final xha f5299sf;
    private AbstractC2139ri<ColorFilter, ColorFilter> slm;
    private final int tan;

    /* JADX INFO: renamed from: vr */
    private final AbstractC2139ri<PointF, PointF> f5300vr;
    private final Path xha;

    /* JADX INFO: renamed from: fi */
    private final LongSparseArray<LinearGradient> f5291fi = new LongSparseArray<>();

    /* JADX INFO: renamed from: di */
    private final LongSparseArray<RadialGradient> f5290di = new LongSparseArray<>();

    public C2153mj(jbs jbsVar, com.bytedance.adsdk.p065lr.xha xhaVar, AbstractC2068ri abstractC2068ri, C2075fi c2075fi) {
        Path path = new Path();
        this.xha = path;
        this.f5295mj = new C2142ri(1);
        this.jbs = new RectF();
        this.f5297qt = new ArrayList();
        this.f5298ri = 0.0f;
        this.f5293ka = abstractC2068ri;
        this.f5294lr = c2075fi.m6834ri();
        this.f5292ik = c2075fi.m6833mj();
        this.f5296nr = jbsVar;
        this.f5299sf = c2075fi.m6832lr();
        path.setFillType(c2075fi.m6830ik());
        this.tan = (int) (xhaVar.m7184fi() / 32.0f);
        AbstractC2139ri<C2078ka, C2078ka> abstractC2139riMo6903ri = c2075fi.m6831ka().mo6903ri();
        this.f5289co = abstractC2139riMo6903ri;
        abstractC2139riMo6903ri.m7111ri(this);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri);
        AbstractC2139ri<Integer, Integer> abstractC2139riMo6903ri2 = c2075fi.m6829fi().mo6903ri();
        this.f5287aw = abstractC2139riMo6903ri2;
        abstractC2139riMo6903ri2.m7111ri(this);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri2);
        AbstractC2139ri<PointF, PointF> abstractC2139riMo6903ri3 = c2075fi.m6828di().mo6903ri();
        this.bgr = abstractC2139riMo6903ri3;
        abstractC2139riMo6903ri3.m7111ri(this);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri3);
        AbstractC2139ri<PointF, PointF> abstractC2139riMo6903ri4 = c2075fi.xha().mo6903ri();
        this.f5300vr = abstractC2139riMo6903ri4;
        abstractC2139riMo6903ri4.m7111ri(this);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri4);
        if (abstractC2068ri.mo6788qt() != null) {
            AbstractC2139ri<Float, Float> abstractC2139riMo6903ri5 = abstractC2068ri.mo6788qt().m6874ri().mo6903ri();
            this.f5286ac = abstractC2139riMo6903ri5;
            abstractC2139riMo6903ri5.m7111ri(this);
            abstractC2068ri.m6793ri(this.f5286ac);
        }
        if (abstractC2068ri.mo6795sf() != null) {
            this.ihz = new C2134ik(this, abstractC2068ri, abstractC2068ri.mo6795sf());
        }
    }

    /* JADX INFO: renamed from: ik */
    private RadialGradient m7161ik() {
        long jM7162ka = m7162ka();
        RadialGradient radialGradient = this.f5290di.get(jM7162ka);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFXha = this.bgr.xha();
        PointF pointFXha2 = this.f5300vr.xha();
        C2078ka c2078kaXha = this.f5289co.xha();
        int[] iArrM7164ri = m7164ri(c2078kaXha.m6841lr());
        float[] fArrM6844ri = c2078kaXha.m6844ri();
        float f = pointFXha.x;
        float f2 = pointFXha.y;
        float fHypot = (float) Math.hypot(pointFXha2.x - f, pointFXha2.y - f2);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f, f2, fHypot, iArrM7164ri, fArrM6844ri, Shader.TileMode.CLAMP);
        this.f5290di.put(jM7162ka, radialGradient2);
        return radialGradient2;
    }

    /* JADX INFO: renamed from: ka */
    private int m7162ka() {
        int iRound = Math.round(this.bgr.m7108mj() * this.tan);
        int iRound2 = Math.round(this.f5300vr.m7108mj() * this.tan);
        int iRound3 = Math.round(this.f5289co.m7108mj() * this.tan);
        int i = iRound != 0 ? iRound * IronSourceError.ERROR_NON_EXISTENT_INSTANCE : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    /* JADX INFO: renamed from: lr */
    private LinearGradient m7163lr() {
        long jM7162ka = m7162ka();
        LinearGradient linearGradient = this.f5291fi.get(jM7162ka);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFXha = this.bgr.xha();
        PointF pointFXha2 = this.f5300vr.xha();
        C2078ka c2078kaXha = this.f5289co.xha();
        LinearGradient linearGradient2 = new LinearGradient(pointFXha.x, pointFXha.y, pointFXha2.x, pointFXha2.y, m7164ri(c2078kaXha.m6841lr()), c2078kaXha.m6844ri(), Shader.TileMode.CLAMP);
        this.f5291fi.put(jM7162ka, linearGradient2);
        return linearGradient2;
    }

    /* JADX INFO: renamed from: ri */
    private int[] m7164ri(int[] iArr) {
        if (this.f5288bu == null) {
            return iArr;
        }
        throw null;
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ri
    /* JADX INFO: renamed from: ri */
    public void mo6789ri() {
        this.f5296nr.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2149fi
    /* JADX INFO: renamed from: ri */
    public void mo6791ri(Canvas canvas, Matrix matrix, int i) {
        if (this.f5292ik) {
            return;
        }
        C2023fi.m6599ri("GradientFillContent#draw");
        this.xha.reset();
        for (int i2 = 0; i2 < this.f5297qt.size(); i2++) {
            this.xha.addPath(this.f5297qt.get(i2).mo7131ka(), matrix);
        }
        this.xha.computeBounds(this.jbs, false);
        Shader shaderM7163lr = this.f5299sf == xha.LINEAR ? m7163lr() : m7161ik();
        shaderM7163lr.setLocalMatrix(matrix);
        this.f5295mj.setShader(shaderM7163lr);
        AbstractC2139ri<ColorFilter, ColorFilter> abstractC2139ri = this.slm;
        if (abstractC2139ri != null) {
            this.f5295mj.setColorFilter(abstractC2139ri.xha());
        }
        AbstractC2139ri<Float, Float> abstractC2139ri2 = this.f5286ac;
        if (abstractC2139ri2 != null) {
            float fFloatValue = abstractC2139ri2.xha().floatValue();
            if (fFloatValue == 0.0f) {
                this.f5295mj.setMaskFilter(null);
            } else if (fFloatValue != this.f5298ri) {
                this.f5295mj.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f5298ri = fFloatValue;
        }
        C2134ik c2134ik = this.ihz;
        if (c2134ik != null) {
            c2134ik.m7093ri(this.f5295mj);
        }
        this.f5295mj.setAlpha(C2018fi.m6564ri((int) ((((i / 255.0f) * this.f5287aw.xha().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.xha, this.f5295mj);
        C2023fi.m6596lr("GradientFillContent#draw");
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2149fi
    /* JADX INFO: renamed from: ri */
    public void mo6710ri(RectF rectF, Matrix matrix, boolean z) {
        this.xha.reset();
        for (int i = 0; i < this.f5297qt.size(); i++) {
            this.xha.addPath(this.f5297qt.get(i).mo7131ka(), matrix);
        }
        this.xha.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik
    /* JADX INFO: renamed from: ri */
    public void mo6794ri(List<InterfaceC2150ik> list, List<InterfaceC2150ik> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC2150ik interfaceC2150ik = list2.get(i);
            if (interfaceC2150ik instanceof InterfaceC2144aw) {
                this.f5297qt.add((InterfaceC2144aw) interfaceC2150ik);
            }
        }
    }
}
