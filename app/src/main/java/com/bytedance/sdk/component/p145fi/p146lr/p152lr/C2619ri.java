package com.bytedance.sdk.component.p145fi.p146lr.p152lr;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.p145fi.InterfaceC2597lr;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.C2598di;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.C2600ik;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.C2601ka;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.C2605ri;
import com.bytedance.sdk.component.p145fi.tan;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2619ri<T> implements InterfaceC2614di {
    /* JADX INFO: renamed from: ri */
    private boolean m9733ri(C2600ik c2600ik) {
        int iM9633sf = c2600ik.m9633sf();
        return iM9633sf == 1 || iM9633sf == 2;
    }

    @Override // com.bytedance.sdk.component.p145fi.p146lr.p152lr.InterfaceC2614di
    /* JADX INFO: renamed from: ri */
    public String mo9721ri() {
        return "bitmap_cache";
    }

    @Override // com.bytedance.sdk.component.p145fi.p146lr.p152lr.InterfaceC2614di
    /* JADX INFO: renamed from: ri */
    public boolean mo9722ri(C2600ik c2600ik, tan tanVar, C2605ri c2605ri) {
        Bitmap bitmapRi;
        String strM9626mj = c2600ik.m9626mj();
        c2600ik.mo9571ri();
        InterfaceC2597lr interfaceC2597lrM9620bu = c2600ik.m9620bu();
        C2598di c2598diSlm = c2600ik.slm();
        if (interfaceC2597lrM9620bu == null || c2598diSlm == null || !interfaceC2597lrM9620bu.mo9574fi() || !m9733ri(c2600ik) || (bitmapRi = c2598diSlm.m9592ri(interfaceC2597lrM9620bu).mo9704ri(strM9626mj)) == null) {
            return true;
        }
        c2600ik.mo9571ri();
        c2605ri.m9697ri(new C2601ka().m9675ri(c2600ik, bitmapRi, null, false));
        return false;
    }
}
