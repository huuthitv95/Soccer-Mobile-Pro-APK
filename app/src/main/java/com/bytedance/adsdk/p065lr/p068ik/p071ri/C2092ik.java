package com.bytedance.adsdk.p065lr.p068ik.p071ri;

import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2078ka;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.C2133fi;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2092ik extends bgr<C2078ka, C2078ka> {
    public C2092ik(List<C2167ri<C2078ka>> list) {
        super(m6913ri(list));
    }

    /* JADX INFO: renamed from: ri */
    private static C2167ri<C2078ka> m6912ri(C2167ri<C2078ka> c2167ri) {
        C2078ka c2078ka = c2167ri.f5404ri;
        C2078ka c2078ka2 = c2167ri.f5401lr;
        if (c2078ka == null || c2078ka2 == null || c2078ka.m6844ri().length == c2078ka2.m6844ri().length) {
            return c2167ri;
        }
        float[] fArrM6914ri = m6914ri(c2078ka.m6844ri(), c2078ka2.m6844ri());
        return c2167ri.m7211ri(c2078ka.m6842ri(fArrM6914ri), c2078ka2.m6842ri(fArrM6914ri));
    }

    /* JADX INFO: renamed from: ri */
    private static List<C2167ri<C2078ka>> m6913ri(List<C2167ri<C2078ka>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, m6912ri(list.get(i)));
        }
        return list;
    }

    /* JADX INFO: renamed from: ri */
    static float[] m6914ri(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = fArr3[i2];
            if (f2 != f) {
                fArr3[i] = f2;
                i++;
                f = fArr3[i2];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i);
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p071ri.bgr, com.bytedance.adsdk.p065lr.p068ik.p071ri.InterfaceC2088aw
    /* JADX INFO: renamed from: ik */
    public /* bridge */ /* synthetic */ List mo6901ik() {
        return super.mo6901ik();
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p071ri.bgr, com.bytedance.adsdk.p065lr.p068ik.p071ri.InterfaceC2088aw
    /* JADX INFO: renamed from: lr */
    public /* bridge */ /* synthetic */ boolean mo6902lr() {
        return super.mo6902lr();
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p071ri.InterfaceC2088aw
    /* JADX INFO: renamed from: ri */
    public AbstractC2139ri<C2078ka, C2078ka> mo6903ri() {
        return new C2133fi(this.f5035ri);
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p071ri.bgr
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
