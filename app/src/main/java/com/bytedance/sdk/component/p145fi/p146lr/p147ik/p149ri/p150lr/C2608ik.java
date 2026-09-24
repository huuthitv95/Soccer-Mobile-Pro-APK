package com.bytedance.sdk.component.p145fi.p146lr.p147ik.p149ri.p150lr;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.p145fi.InterfaceC2591bu;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.p149ri.InterfaceC2611ri;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ik.ri.lr.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2608ik implements InterfaceC2591bu {

    /* JADX INFO: renamed from: lr */
    private final InterfaceC2611ri f7356lr;

    /* JADX INFO: renamed from: ri */
    private final InterfaceC2591bu f7357ri;

    public C2608ik(InterfaceC2591bu interfaceC2591bu) {
        this(interfaceC2591bu, null);
    }

    public C2608ik(InterfaceC2591bu interfaceC2591bu, InterfaceC2611ri interfaceC2611ri) {
        this.f7357ri = interfaceC2591bu;
        this.f7356lr = interfaceC2611ri;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2625ri
    /* JADX INFO: renamed from: lr, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo9703lr(String str) {
        return this.f7357ri.mo9703lr(str);
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2625ri
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Bitmap mo9704ri(String str) {
        return this.f7357ri.mo9704ri(str);
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2625ri
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo9705ri(String str, Bitmap bitmap) {
        boolean zRi = this.f7357ri.mo9705ri(str, bitmap);
        if (this.f7356lr != null) {
            Boolean.valueOf(zRi);
        }
        return zRi;
    }
}
