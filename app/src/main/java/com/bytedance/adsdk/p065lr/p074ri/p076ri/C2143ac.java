package com.bytedance.adsdk.p065lr.p074ri.p076ri;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2081nr;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.C2136lr;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.ri.ac */
/* JADX INFO: loaded from: classes3.dex */
public class C2143ac extends AbstractC2156ri {

    /* JADX INFO: renamed from: di */
    private final boolean f5227di;

    /* JADX INFO: renamed from: fi */
    private final String f5228fi;

    /* JADX INFO: renamed from: ka */
    private final AbstractC2068ri f5229ka;

    /* JADX INFO: renamed from: mj */
    private AbstractC2139ri<ColorFilter, ColorFilter> f5230mj;
    private final AbstractC2139ri<Integer, Integer> xha;

    public C2143ac(jbs jbsVar, AbstractC2068ri abstractC2068ri, C2081nr c2081nr) {
        super(jbsVar, abstractC2068ri, c2081nr.xha().m6863ri(), c2081nr.m6859mj().m6862ri(), c2081nr.jbs(), c2081nr.m6856ik(), c2081nr.m6857ka(), c2081nr.m6855fi(), c2081nr.m6854di());
        this.f5229ka = abstractC2068ri;
        this.f5228fi = c2081nr.m6861ri();
        this.f5227di = c2081nr.m6860qt();
        AbstractC2139ri<Integer, Integer> abstractC2139riMo6903ri = c2081nr.m6858lr().mo6903ri();
        this.xha = abstractC2139riMo6903ri;
        abstractC2139riMo6903ri.m7111ri(this);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri);
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.AbstractC2156ri, com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2149fi
    /* JADX INFO: renamed from: ri */
    public void mo6791ri(Canvas canvas, Matrix matrix, int i) {
        if (this.f5227di) {
            return;
        }
        this.f5314lr.setColor(((C2136lr) this.xha).jbs());
        if (this.f5230mj != null) {
            this.f5314lr.setColorFilter(this.f5230mj.xha());
        }
        super.mo6791ri(canvas, matrix, i);
    }
}
