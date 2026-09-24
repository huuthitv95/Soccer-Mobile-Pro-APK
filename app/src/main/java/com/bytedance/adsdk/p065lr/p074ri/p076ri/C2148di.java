package com.bytedance.adsdk.p065lr.p074ri.p076ri;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2079lr;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.tan;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.ri.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2148di implements AbstractC2139ri.ri, InterfaceC2144aw, InterfaceC2157sf {

    /* JADX INFO: renamed from: di */
    private final C2079lr f5255di;

    /* JADX INFO: renamed from: fi */
    private final AbstractC2139ri<?, PointF> f5256fi;

    /* JADX INFO: renamed from: ik */
    private final jbs f5257ik;

    /* JADX INFO: renamed from: ka */
    private final AbstractC2139ri<?, PointF> f5258ka;

    /* JADX INFO: renamed from: lr */
    private final String f5259lr;

    /* JADX INFO: renamed from: mj */
    private boolean f5260mj;

    /* JADX INFO: renamed from: ri */
    private final Path f5261ri = new Path();
    private final C2152lr xha = new C2152lr();

    public C2148di(jbs jbsVar, AbstractC2068ri abstractC2068ri, C2079lr c2079lr) {
        this.f5259lr = c2079lr.m6849ri();
        this.f5257ik = jbsVar;
        AbstractC2139ri<PointF, PointF> abstractC2139riMo6903ri = c2079lr.m6846ik().mo6903ri();
        this.f5258ka = abstractC2139riMo6903ri;
        AbstractC2139ri<PointF, PointF> abstractC2139riMo6903ri2 = c2079lr.m6848lr().mo6903ri();
        this.f5256fi = abstractC2139riMo6903ri2;
        this.f5255di = c2079lr;
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri2);
        abstractC2139riMo6903ri.m7111ri(this);
        abstractC2139riMo6903ri2.m7111ri(this);
    }

    /* JADX INFO: renamed from: lr */
    private void m7143lr() {
        this.f5260mj = false;
        this.f5257ik.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2144aw
    /* JADX INFO: renamed from: ka */
    public Path mo7131ka() {
        if (this.f5260mj) {
            return this.f5261ri;
        }
        this.f5261ri.reset();
        if (this.f5255di.m6845fi()) {
            this.f5260mj = true;
            return this.f5261ri;
        }
        PointF pointFXha = this.f5258ka.xha();
        float f = pointFXha.x / 2.0f;
        float f2 = pointFXha.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f5261ri.reset();
        if (this.f5255di.m6847ka()) {
            float f5 = -f2;
            this.f5261ri.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f5261ri.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.f5261ri.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.f5261ri.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.f5261ri.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.f5261ri.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.f5261ri.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.f5261ri.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.f5261ri.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.f5261ri.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointFXha2 = this.f5256fi.xha();
        this.f5261ri.offset(pointFXha2.x, pointFXha2.y);
        this.f5261ri.close();
        this.xha.m7159ri(this.f5261ri);
        this.f5260mj = true;
        return this.f5261ri;
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ri
    /* JADX INFO: renamed from: ri */
    public void mo6789ri() {
        m7143lr();
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik
    /* JADX INFO: renamed from: ri */
    public void mo6794ri(List<InterfaceC2150ik> list, List<InterfaceC2150ik> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC2150ik interfaceC2150ik = list.get(i);
            if (interfaceC2150ik instanceof ihz) {
                ihz ihzVar = (ihz) interfaceC2150ik;
                if (ihzVar.m7148lr() == tan.EnumC2085ri.SIMULTANEOUSLY) {
                    this.xha.m7160ri(ihzVar);
                    ihzVar.m7149ri(this);
                }
            }
        }
    }
}
