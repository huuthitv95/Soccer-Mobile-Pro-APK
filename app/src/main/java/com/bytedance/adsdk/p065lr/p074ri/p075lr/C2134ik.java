package com.bytedance.adsdk.p065lr.p074ri.p075lr;

import android.graphics.Color;
import android.graphics.Paint;
import com.bytedance.adsdk.p065lr.p067fi.C2044qt;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.lr.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2134ik implements AbstractC2139ri.ri {

    /* JADX INFO: renamed from: di */
    private final AbstractC2139ri<Float, Float> f5188di;

    /* JADX INFO: renamed from: fi */
    private final AbstractC2139ri<Float, Float> f5189fi;

    /* JADX INFO: renamed from: ik */
    private final AbstractC2139ri<Float, Float> f5190ik;

    /* JADX INFO: renamed from: ka */
    private final AbstractC2139ri<Float, Float> f5191ka;

    /* JADX INFO: renamed from: lr */
    private final AbstractC2139ri<Integer, Integer> f5192lr;

    /* JADX INFO: renamed from: ri */
    private final AbstractC2139ri.ri f5193ri;
    private boolean xha = true;

    public C2134ik(AbstractC2139ri.ri riVar, AbstractC2068ri abstractC2068ri, C2044qt c2044qt) {
        this.f5193ri = riVar;
        AbstractC2139ri<Integer, Integer> abstractC2139riMo6903ri = c2044qt.m6658ri().mo6903ri();
        this.f5192lr = abstractC2139riMo6903ri;
        abstractC2139riMo6903ri.m7111ri(this);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri);
        AbstractC2139ri<Float, Float> abstractC2139riMo6903ri2 = c2044qt.m6657lr().mo6903ri();
        this.f5190ik = abstractC2139riMo6903ri2;
        abstractC2139riMo6903ri2.m7111ri(this);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri2);
        AbstractC2139ri<Float, Float> abstractC2139riMo6903ri3 = c2044qt.m6655ik().mo6903ri();
        this.f5191ka = abstractC2139riMo6903ri3;
        abstractC2139riMo6903ri3.m7111ri(this);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri3);
        AbstractC2139ri<Float, Float> abstractC2139riMo6903ri4 = c2044qt.m6656ka().mo6903ri();
        this.f5189fi = abstractC2139riMo6903ri4;
        abstractC2139riMo6903ri4.m7111ri(this);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri4);
        AbstractC2139ri<Float, Float> abstractC2139riMo6903ri5 = c2044qt.m6654fi().mo6903ri();
        this.f5188di = abstractC2139riMo6903ri5;
        abstractC2139riMo6903ri5.m7111ri(this);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri5);
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ri
    /* JADX INFO: renamed from: ri */
    public void mo6789ri() {
        this.xha = true;
        this.f5193ri.mo6789ri();
    }

    /* JADX INFO: renamed from: ri */
    public void m7093ri(Paint paint) {
        if (this.xha) {
            this.xha = false;
            double dFloatValue = ((double) this.f5191ka.xha().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.f5189fi.xha().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.f5192lr.xha().intValue();
            paint.setShadowLayer(this.f5188di.xha().floatValue(), fSin, fCos, Color.argb(Math.round(this.f5190ik.xha().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }
}
