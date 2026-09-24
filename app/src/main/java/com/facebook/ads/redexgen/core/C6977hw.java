package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hw */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6977hw implements InterfaceC5888QD {
    public final /* synthetic */ C47497Q A00;
    public final /* synthetic */ C5883Q8 A01;

    public C6977hw(C47497Q c47497q, C5883Q8 c5883q8) {
        this.A00 = c47497q;
        this.A01 = c5883q8;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5888QD
    public final Object A5G(int i) {
        C5881Q6 compatInfo = this.A01.A00(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5888QD
    public final List<Object> A6Y(String str, int i) {
        List<C5881Q6> listA03 = this.A01.A03(str, i);
        if (listA03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = listA03.size();
        for (int i2 = 0; i2 < infoCount; i2++) {
            arrayList.add(listA03.get(i2).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5888QD
    public final Object A6Z(int i) {
        C5881Q6 compatInfo = this.A01.A01(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5888QD
    public final boolean AGv(int i, int i2, Bundle bundle) {
        return this.A01.A04(i, i2, bundle);
    }
}
