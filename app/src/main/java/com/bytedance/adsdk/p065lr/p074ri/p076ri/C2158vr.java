package com.bytedance.adsdk.p065lr.p074ri.p076ri;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2084sf;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.tan;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.C2135ka;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.ri.vr */
/* JADX INFO: loaded from: classes3.dex */
public class C2158vr implements AbstractC2139ri.ri, InterfaceC2144aw, InterfaceC2157sf {

    /* JADX INFO: renamed from: di */
    private final AbstractC2139ri<?, PointF> f5330di;

    /* JADX INFO: renamed from: fi */
    private final jbs f5331fi;

    /* JADX INFO: renamed from: ik */
    private final String f5332ik;

    /* JADX INFO: renamed from: ka */
    private final boolean f5333ka;

    /* JADX INFO: renamed from: mj */
    private final AbstractC2139ri<?, Float> f5335mj;

    /* JADX INFO: renamed from: sf */
    private boolean f5338sf;
    private final AbstractC2139ri<?, PointF> xha;

    /* JADX INFO: renamed from: ri */
    private final Path f5337ri = new Path();

    /* JADX INFO: renamed from: lr */
    private final RectF f5334lr = new RectF();
    private final C2152lr jbs = new C2152lr();

    /* JADX INFO: renamed from: qt */
    private AbstractC2139ri<Float, Float> f5336qt = null;

    public C2158vr(jbs jbsVar, AbstractC2068ri abstractC2068ri, C2084sf c2084sf) {
        this.f5332ik = c2084sf.m6879ri();
        this.f5333ka = c2084sf.m6875fi();
        this.f5331fi = jbsVar;
        AbstractC2139ri<PointF, PointF> abstractC2139riMo6903ri = c2084sf.m6877ka().mo6903ri();
        this.f5330di = abstractC2139riMo6903ri;
        AbstractC2139ri<PointF, PointF> abstractC2139riMo6903ri2 = c2084sf.m6876ik().mo6903ri();
        this.xha = abstractC2139riMo6903ri2;
        AbstractC2139ri<Float, Float> abstractC2139riMo6903ri3 = c2084sf.m6878lr().mo6903ri();
        this.f5335mj = abstractC2139riMo6903ri3;
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri2);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri3);
        abstractC2139riMo6903ri.m7111ri(this);
        abstractC2139riMo6903ri2.m7111ri(this);
        abstractC2139riMo6903ri3.m7111ri(this);
    }

    /* JADX INFO: renamed from: lr */
    private void m7170lr() {
        this.f5338sf = false;
        this.f5331fi.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2144aw
    /* JADX INFO: renamed from: ka */
    public Path mo7131ka() {
        AbstractC2139ri<Float, Float> abstractC2139ri;
        if (this.f5338sf) {
            return this.f5337ri;
        }
        this.f5337ri.reset();
        if (this.f5333ka) {
            this.f5338sf = true;
            return this.f5337ri;
        }
        PointF pointFXha = this.xha.xha();
        float f = pointFXha.x / 2.0f;
        float f2 = pointFXha.y / 2.0f;
        AbstractC2139ri<?, Float> abstractC2139ri2 = this.f5335mj;
        float fJbs = abstractC2139ri2 == null ? 0.0f : ((C2135ka) abstractC2139ri2).jbs();
        if (fJbs == 0.0f && (abstractC2139ri = this.f5336qt) != null) {
            fJbs = Math.min(abstractC2139ri.xha().floatValue(), Math.min(f, f2));
        }
        float fMin = Math.min(f, f2);
        if (fJbs > fMin) {
            fJbs = fMin;
        }
        PointF pointFXha2 = this.f5330di.xha();
        this.f5337ri.moveTo(pointFXha2.x + f, (pointFXha2.y - f2) + fJbs);
        this.f5337ri.lineTo(pointFXha2.x + f, (pointFXha2.y + f2) - fJbs);
        if (fJbs > 0.0f) {
            float f3 = fJbs * 2.0f;
            this.f5334lr.set((pointFXha2.x + f) - f3, (pointFXha2.y + f2) - f3, pointFXha2.x + f, pointFXha2.y + f2);
            this.f5337ri.arcTo(this.f5334lr, 0.0f, 90.0f, false);
        }
        this.f5337ri.lineTo((pointFXha2.x - f) + fJbs, pointFXha2.y + f2);
        if (fJbs > 0.0f) {
            float f4 = fJbs * 2.0f;
            this.f5334lr.set(pointFXha2.x - f, (pointFXha2.y + f2) - f4, (pointFXha2.x - f) + f4, pointFXha2.y + f2);
            this.f5337ri.arcTo(this.f5334lr, 90.0f, 90.0f, false);
        }
        this.f5337ri.lineTo(pointFXha2.x - f, (pointFXha2.y - f2) + fJbs);
        if (fJbs > 0.0f) {
            float f5 = fJbs * 2.0f;
            this.f5334lr.set(pointFXha2.x - f, pointFXha2.y - f2, (pointFXha2.x - f) + f5, (pointFXha2.y - f2) + f5);
            this.f5337ri.arcTo(this.f5334lr, 180.0f, 90.0f, false);
        }
        this.f5337ri.lineTo((pointFXha2.x + f) - fJbs, pointFXha2.y - f2);
        if (fJbs > 0.0f) {
            float f6 = fJbs * 2.0f;
            this.f5334lr.set((pointFXha2.x + f) - f6, pointFXha2.y - f2, pointFXha2.x + f, (pointFXha2.y - f2) + f6);
            this.f5337ri.arcTo(this.f5334lr, 270.0f, 90.0f, false);
        }
        this.f5337ri.close();
        this.jbs.m7159ri(this.f5337ri);
        this.f5338sf = true;
        return this.f5337ri;
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ri
    /* JADX INFO: renamed from: ri */
    public void mo6789ri() {
        m7170lr();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik
    /* JADX INFO: renamed from: ri */
    public void mo6794ri(List<InterfaceC2150ik> list, List<InterfaceC2150ik> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC2150ik interfaceC2150ik = list.get(i);
            if (interfaceC2150ik instanceof ihz) {
                ihz ihzVar = (ihz) interfaceC2150ik;
                if (ihzVar.m7148lr() == tan.EnumC2085ri.SIMULTANEOUSLY) {
                    this.jbs.m7160ri(ihzVar);
                    ihzVar.m7149ri(this);
                } else if (interfaceC2150ik instanceof C2146bu) {
                    this.f5336qt = ((C2146bu) interfaceC2150ik).m7138lr();
                }
            } else if (interfaceC2150ik instanceof C2146bu) {
                this.f5336qt = ((C2146bu) interfaceC2150ik).m7138lr();
            }
        }
    }
}
