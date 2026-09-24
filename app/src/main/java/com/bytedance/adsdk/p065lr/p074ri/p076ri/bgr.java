package com.bytedance.adsdk.p065lr.p074ri.p076ri;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2082qt;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.tan;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class bgr implements AbstractC2139ri.ri, InterfaceC2144aw, InterfaceC2157sf {

    /* JADX INFO: renamed from: aw */
    private final AbstractC2139ri<?, Float> f5231aw;

    /* JADX INFO: renamed from: co */
    private final AbstractC2139ri<?, Float> f5232co;

    /* JADX INFO: renamed from: di */
    private final boolean f5233di;

    /* JADX INFO: renamed from: fi */
    private final boolean f5234fi;

    /* JADX INFO: renamed from: ik */
    private final jbs f5235ik;
    private final AbstractC2139ri<?, Float> jbs;

    /* JADX INFO: renamed from: ka */
    private final C2082qt.ri f5236ka;

    /* JADX INFO: renamed from: lr */
    private final String f5237lr;

    /* JADX INFO: renamed from: mj */
    private final AbstractC2139ri<?, PointF> f5238mj;

    /* JADX INFO: renamed from: qt */
    private final AbstractC2139ri<?, Float> f5239qt;

    /* JADX INFO: renamed from: sf */
    private final AbstractC2139ri<?, Float> f5241sf;

    /* JADX INFO: renamed from: vr */
    private boolean f5242vr;
    private final AbstractC2139ri<?, Float> xha;

    /* JADX INFO: renamed from: ri */
    private final Path f5240ri = new Path();
    private final C2152lr bgr = new C2152lr();

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.ri.bgr$1 */
    static /* synthetic */ class C21451 {

        /* JADX INFO: renamed from: ri */
        static final /* synthetic */ int[] f5243ri;

        static {
            int[] iArr = new int[C2082qt.ri.values().length];
            f5243ri = iArr;
            try {
                iArr[C2082qt.ri.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5243ri[C2082qt.ri.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public bgr(jbs jbsVar, AbstractC2068ri abstractC2068ri, C2082qt c2082qt) {
        this.f5235ik = jbsVar;
        this.f5237lr = c2082qt.m6871ri();
        C2082qt.ri riVarM6868lr = c2082qt.m6868lr();
        this.f5236ka = riVarM6868lr;
        this.f5234fi = c2082qt.m6870qt();
        this.f5233di = c2082qt.m6872sf();
        AbstractC2139ri<Float, Float> abstractC2139riMo6903ri = c2082qt.m6866ik().mo6903ri();
        this.xha = abstractC2139riMo6903ri;
        AbstractC2139ri<PointF, PointF> abstractC2139riMo6903ri2 = c2082qt.m6867ka().mo6903ri();
        this.f5238mj = abstractC2139riMo6903ri2;
        AbstractC2139ri<Float, Float> abstractC2139riMo6903ri3 = c2082qt.m6865fi().mo6903ri();
        this.jbs = abstractC2139riMo6903ri3;
        AbstractC2139ri<Float, Float> abstractC2139riMo6903ri4 = c2082qt.xha().mo6903ri();
        this.f5241sf = abstractC2139riMo6903ri4;
        AbstractC2139ri<Float, Float> abstractC2139riMo6903ri5 = c2082qt.jbs().mo6903ri();
        this.f5231aw = abstractC2139riMo6903ri5;
        if (riVarM6868lr == C2082qt.ri.STAR) {
            this.f5239qt = c2082qt.m6864di().mo6903ri();
            this.f5232co = c2082qt.m6869mj().mo6903ri();
        } else {
            this.f5239qt = null;
            this.f5232co = null;
        }
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri2);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri3);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri4);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri5);
        if (riVarM6868lr == C2082qt.ri.STAR) {
            abstractC2068ri.m6793ri(this.f5239qt);
            abstractC2068ri.m6793ri(this.f5232co);
        }
        abstractC2139riMo6903ri.m7111ri(this);
        abstractC2139riMo6903ri2.m7111ri(this);
        abstractC2139riMo6903ri3.m7111ri(this);
        abstractC2139riMo6903ri4.m7111ri(this);
        abstractC2139riMo6903ri5.m7111ri(this);
        if (riVarM6868lr == C2082qt.ri.STAR) {
            this.f5239qt.m7111ri(this);
            this.f5232co.m7111ri(this);
        }
    }

    /* JADX INFO: renamed from: fi */
    private void m7132fi() {
        int iFloor = (int) Math.floor(this.xha.xha().floatValue());
        AbstractC2139ri<?, Float> abstractC2139ri = this.jbs;
        double radians = Math.toRadians((abstractC2139ri == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : abstractC2139ri.xha().floatValue()) - 90.0d);
        double d = iFloor;
        float fFloatValue = this.f5231aw.xha().floatValue() / 100.0f;
        float fFloatValue2 = this.f5241sf.xha().floatValue();
        double d2 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d2);
        float fSin = (float) (Math.sin(radians) * d2);
        this.f5240ri.moveTo(fCos, fSin);
        double d3 = (float) (6.283185307179586d / d);
        double d4 = radians + d3;
        int i = 0;
        for (double dCeil = Math.ceil(d); i < dCeil; dCeil = dCeil) {
            float fCos2 = (float) (Math.cos(d4) * d2);
            int i2 = i;
            double d5 = d4;
            float fSin2 = (float) (d2 * Math.sin(d4));
            if (fFloatValue != 0.0f) {
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan3 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f = fFloatValue2 * fFloatValue * 0.25f;
                this.f5240ri.cubicTo(fCos - (f * fCos3), fSin - (f * fSin3), fCos2 + (((float) Math.cos(dAtan3)) * f), fSin2 + (f * ((float) Math.sin(dAtan3))), fCos2, fSin2);
                fCos = fCos2;
                fSin = fSin2;
            } else {
                fSin = fSin2;
                fCos = fCos2;
                this.f5240ri.lineTo(fCos, fSin);
            }
            d4 = d5 + d3;
            i = i2 + 1;
        }
        PointF pointFXha = this.f5238mj.xha();
        this.f5240ri.offset(pointFXha.x, pointFXha.y);
        this.f5240ri.close();
    }

    /* JADX INFO: renamed from: ik */
    private void m7133ik() {
        float f;
        float f2;
        float fCos;
        float fSin;
        float f3;
        double d;
        float f4;
        float f5;
        float f6;
        float fFloatValue = this.xha.xha().floatValue();
        AbstractC2139ri<?, Float> abstractC2139ri = this.jbs;
        double radians = Math.toRadians((abstractC2139ri == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : abstractC2139ri.xha().floatValue()) - 90.0d);
        double d2 = fFloatValue;
        float f7 = (float) (6.283185307179586d / d2);
        if (this.f5233di) {
            f7 *= -1.0f;
        }
        float f8 = f7 / 2.0f;
        float f9 = fFloatValue - ((int) fFloatValue);
        if (f9 != 0.0f) {
            radians += (double) ((1.0f - f9) * f8);
        }
        float fFloatValue2 = this.f5241sf.xha().floatValue();
        float fFloatValue3 = this.f5239qt.xha().floatValue();
        AbstractC2139ri<?, Float> abstractC2139ri2 = this.f5232co;
        float fFloatValue4 = abstractC2139ri2 != null ? abstractC2139ri2.xha().floatValue() / 100.0f : 0.0f;
        AbstractC2139ri<?, Float> abstractC2139ri3 = this.f5231aw;
        float fFloatValue5 = abstractC2139ri3 != null ? abstractC2139ri3.xha().floatValue() / 100.0f : 0.0f;
        if (f9 != 0.0f) {
            f4 = ((fFloatValue2 - fFloatValue3) * f9) + fFloatValue3;
            f2 = 0.0f;
            double d3 = f4;
            f = 2.0f;
            float fCos2 = (float) (d3 * Math.cos(radians));
            fSin = (float) (d3 * Math.sin(radians));
            this.f5240ri.moveTo(fCos2, fSin);
            d = radians + ((double) ((f7 * f9) / 2.0f));
            fCos = fCos2;
            f3 = f8;
        } else {
            f = 2.0f;
            f2 = 0.0f;
            double d4 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d4);
            fSin = (float) (d4 * Math.sin(radians));
            this.f5240ri.moveTo(fCos, fSin);
            f3 = f8;
            d = radians + ((double) f3);
            f4 = 0.0f;
        }
        double dCeil = Math.ceil(d2) * 2.0d;
        int i = 0;
        boolean z = false;
        double d5 = d;
        float f10 = fSin;
        float f11 = fCos;
        double d6 = d5;
        while (true) {
            double d7 = i;
            if (d7 >= dCeil) {
                PointF pointFXha = this.f5238mj.xha();
                this.f5240ri.offset(pointFXha.x, pointFXha.y);
                this.f5240ri.close();
                return;
            }
            float f12 = z ? fFloatValue2 : fFloatValue3;
            float f13 = (f4 == f2 || d7 != dCeil - 2.0d) ? f3 : (f7 * f9) / f;
            double d8 = (f4 == f2 || d7 != dCeil - 1.0d) ? f12 : f4;
            float fCos3 = (float) (d8 * Math.cos(d6));
            float f14 = f7;
            float fSin2 = (float) (d8 * Math.sin(d6));
            if (fFloatValue4 == f2 && fFloatValue5 == f2) {
                this.f5240ri.lineTo(fCos3, fSin2);
                f6 = fCos3;
                f5 = fSin2;
            } else {
                double dAtan2 = (float) (Math.atan2(f10, f11) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                float f15 = f11;
                float f16 = f10;
                f5 = fSin2;
                double dAtan3 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan3);
                float fSin4 = (float) Math.sin(dAtan3);
                float f17 = z ? fFloatValue4 : fFloatValue5;
                float f18 = z ? fFloatValue5 : fFloatValue4;
                float f19 = (z ? fFloatValue3 : fFloatValue2) * f17 * 0.47829f;
                float f20 = fCos4 * f19;
                float f21 = f19 * fSin3;
                float f22 = (z ? fFloatValue2 : fFloatValue3) * f18 * 0.47829f;
                float f23 = fCos5 * f22;
                float f24 = f22 * fSin4;
                if (f9 != 0.0f) {
                    if (i == 0) {
                        f20 *= f9;
                        f21 *= f9;
                    } else if (d7 == dCeil - 1.0d) {
                        f23 *= f9;
                        f24 *= f9;
                    }
                }
                f6 = fCos3;
                this.f5240ri.cubicTo(f15 - f20, f16 - f21, fCos3 + f23, f5 + f24, f6, f5);
            }
            d6 += (double) f13;
            z = !z;
            i++;
            f3 = f3;
            f11 = f6;
            f10 = f5;
            f7 = f14;
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m7134lr() {
        this.f5242vr = false;
        this.f5235ik.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2144aw
    /* JADX INFO: renamed from: ka */
    public Path mo7131ka() {
        if (this.f5242vr) {
            return this.f5240ri;
        }
        this.f5240ri.reset();
        if (this.f5234fi) {
            this.f5242vr = true;
            return this.f5240ri;
        }
        int i = C21451.f5243ri[this.f5236ka.ordinal()];
        if (i == 1) {
            m7133ik();
        } else if (i == 2) {
            m7132fi();
        }
        this.f5240ri.close();
        this.bgr.m7159ri(this.f5240ri);
        this.f5242vr = true;
        return this.f5240ri;
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ri
    /* JADX INFO: renamed from: ri */
    public void mo6789ri() {
        m7134lr();
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik
    /* JADX INFO: renamed from: ri */
    public void mo6794ri(List<InterfaceC2150ik> list, List<InterfaceC2150ik> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC2150ik interfaceC2150ik = list.get(i);
            if (interfaceC2150ik instanceof ihz) {
                ihz ihzVar = (ihz) interfaceC2150ik;
                if (ihzVar.m7148lr() == tan.EnumC2085ri.SIMULTANEOUSLY) {
                    this.bgr.m7160ri(ihzVar);
                    ihzVar.m7149ri(this);
                }
            }
        }
    }
}
