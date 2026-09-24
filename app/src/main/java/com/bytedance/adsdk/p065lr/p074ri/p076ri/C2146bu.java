package com.bytedance.adsdk.p065lr.p074ri.p076ri;

import android.graphics.PointF;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p068ik.C2087ri;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2071aw;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.bgr;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.ri.bu */
/* JADX INFO: loaded from: classes9.dex */
public class C2146bu implements AbstractC2139ri.ri, tan {

    /* JADX INFO: renamed from: ik */
    private final AbstractC2139ri<Float, Float> f5244ik;

    /* JADX INFO: renamed from: ka */
    private bgr f5245ka;

    /* JADX INFO: renamed from: lr */
    private final String f5246lr;

    /* JADX INFO: renamed from: ri */
    private final jbs f5247ri;

    public C2146bu(jbs jbsVar, AbstractC2068ri abstractC2068ri, C2071aw c2071aw) {
        this.f5247ri = jbsVar;
        this.f5246lr = c2071aw.m6802ri();
        AbstractC2139ri<Float, Float> abstractC2139riMo6903ri = c2071aw.m6800lr().mo6903ri();
        this.f5244ik = abstractC2139riMo6903ri;
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri);
        abstractC2139riMo6903ri.m7111ri(this);
    }

    /* JADX INFO: renamed from: lr */
    private static int m7135lr(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    /* JADX INFO: renamed from: lr */
    private bgr m7136lr(bgr bgrVar) {
        List<C2087ri> listM6803ik = bgrVar.m6803ik();
        boolean zM6804lr = bgrVar.m6804lr();
        int size = listM6803ik.size() - 1;
        int i = 0;
        while (size >= 0) {
            C2087ri c2087ri = listM6803ik.get(size);
            C2087ri c2087ri2 = listM6803ik.get(m7137ri(size - 1, listM6803ik.size()));
            PointF pointFM6895ik = (size != 0 || zM6804lr) ? c2087ri2.m6895ik() : bgrVar.m6805ri();
            i = (((size != 0 || zM6804lr) ? c2087ri2.m6897lr() : pointFM6895ik).equals(pointFM6895ik) && c2087ri.m6899ri().equals(pointFM6895ik) && !(!bgrVar.m6804lr() && size == 0 && size == listM6803ik.size() - 1)) ? i + 2 : i + 1;
            size--;
        }
        bgr bgrVar2 = this.f5245ka;
        if (bgrVar2 == null || bgrVar2.m6803ik().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C2087ri());
            }
            this.f5245ka = new bgr(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f5245ka.m6808ri(zM6804lr);
        return this.f5245ka;
    }

    /* JADX INFO: renamed from: ri */
    private static int m7137ri(int i, int i2) {
        return i - (m7135lr(i, i2) * i2);
    }

    /* JADX INFO: renamed from: lr */
    public AbstractC2139ri<Float, Float> m7138lr() {
        return this.f5244ik;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a1  */
    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.tan
    /* JADX INFO: renamed from: ri */
    public bgr mo7139ri(bgr bgrVar) {
        boolean z;
        List<C2087ri> listM6803ik = bgrVar.m6803ik();
        if (listM6803ik.size() > 2) {
            float fFloatValue = this.f5244ik.xha().floatValue();
            if (fFloatValue != 0.0f) {
                bgr bgrVarM7136lr = m7136lr(bgrVar);
                bgrVarM7136lr.m6806ri(bgrVar.m6805ri().x, bgrVar.m6805ri().y);
                List<C2087ri> listM6803ik2 = bgrVarM7136lr.m6803ik();
                boolean zM6804lr = bgrVar.m6804lr();
                int i = 0;
                int i2 = 0;
                while (i < listM6803ik.size()) {
                    C2087ri c2087ri = listM6803ik.get(i);
                    C2087ri c2087ri2 = listM6803ik.get(m7137ri(i - 1, listM6803ik.size()));
                    C2087ri c2087ri3 = listM6803ik.get(m7137ri(i - 2, listM6803ik.size()));
                    PointF pointFM6895ik = (i != 0 || zM6804lr) ? c2087ri2.m6895ik() : bgrVar.m6805ri();
                    PointF pointFM6897lr = (i != 0 || zM6804lr) ? c2087ri2.m6897lr() : pointFM6895ik;
                    PointF pointFM6899ri = c2087ri.m6899ri();
                    PointF pointFM6895ik2 = c2087ri3.m6895ik();
                    PointF pointFM6895ik3 = c2087ri.m6895ik();
                    if (!bgrVar.m6804lr() && i == 0) {
                        z = i == listM6803ik.size() + (-1);
                    }
                    if (pointFM6897lr.equals(pointFM6895ik) && pointFM6899ri.equals(pointFM6895ik) && !z) {
                        float f = pointFM6895ik.x - pointFM6895ik2.x;
                        float f2 = pointFM6895ik.y - pointFM6895ik2.y;
                        float f3 = pointFM6895ik3.x - pointFM6895ik.x;
                        float f4 = pointFM6895ik3.y - pointFM6895ik.y;
                        float fHypot = (float) Math.hypot(f, f2);
                        float fHypot2 = (float) Math.hypot(f3, f4);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f5 = pointFM6895ik.x + ((pointFM6895ik2.x - pointFM6895ik.x) * fMin);
                        float f6 = pointFM6895ik.y + ((pointFM6895ik2.y - pointFM6895ik.y) * fMin);
                        float f7 = pointFM6895ik.x + ((pointFM6895ik3.x - pointFM6895ik.x) * fMin2);
                        float f8 = pointFM6895ik.y + ((pointFM6895ik3.y - pointFM6895ik.y) * fMin2);
                        float f9 = f5 - ((f5 - pointFM6895ik.x) * 0.5519f);
                        float f10 = f6 - ((f6 - pointFM6895ik.y) * 0.5519f);
                        float f11 = f7 - ((f7 - pointFM6895ik.x) * 0.5519f);
                        float f12 = f8 - ((f8 - pointFM6895ik.y) * 0.5519f);
                        C2087ri c2087ri4 = listM6803ik2.get(m7137ri(i2 - 1, listM6803ik2.size()));
                        C2087ri c2087ri5 = listM6803ik2.get(i2);
                        c2087ri4.m6898lr(f5, f6);
                        c2087ri4.m6896ik(f5, f6);
                        if (i == 0) {
                            bgrVarM7136lr.m6806ri(f5, f6);
                        }
                        c2087ri5.m6900ri(f9, f10);
                        C2087ri c2087ri6 = listM6803ik2.get(i2 + 1);
                        c2087ri5.m6898lr(f11, f12);
                        c2087ri5.m6896ik(f7, f8);
                        c2087ri6.m6900ri(f7, f8);
                        i2 += 2;
                    } else {
                        C2087ri c2087ri7 = listM6803ik2.get(m7137ri(i2 - 1, listM6803ik2.size()));
                        C2087ri c2087ri8 = listM6803ik2.get(i2);
                        c2087ri7.m6898lr(c2087ri2.m6897lr().x, c2087ri2.m6897lr().y);
                        c2087ri7.m6896ik(c2087ri2.m6895ik().x, c2087ri2.m6895ik().y);
                        c2087ri8.m6900ri(c2087ri.m6899ri().x, c2087ri.m6899ri().y);
                        i2++;
                    }
                    i++;
                    listM6803ik = listM6803ik;
                    zM6804lr = zM6804lr;
                }
                return bgrVarM7136lr;
            }
        }
        return bgrVar;
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ri
    /* JADX INFO: renamed from: ri */
    public void mo6789ri() {
        this.f5247ri.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik
    /* JADX INFO: renamed from: ri */
    public void mo6794ri(List<InterfaceC2150ik> list, List<InterfaceC2150ik> list2) {
    }
}
