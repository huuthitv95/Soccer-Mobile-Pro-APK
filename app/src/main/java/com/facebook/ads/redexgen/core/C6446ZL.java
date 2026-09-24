package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6446ZL implements InterfaceC6133UD {
    public final /* synthetic */ String[] A00;

    public C6446ZL(String[] strArr) {
        this.A00 = strArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6133UD
    public final boolean A3A(String str) {
        for (String str2 : this.A00) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }
}
