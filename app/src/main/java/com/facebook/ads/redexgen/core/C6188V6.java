package com.facebook.ads.redexgen.core;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.V6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6188V6 {
    public double A00;
    public EnumC6194VC A01;
    public EnumC6195VD A02;
    public String A03;
    public String A04;
    public Map<String, String> A05;
    public boolean A06;

    public final C6188V6 A00(double d) {
        this.A00 = d;
        return this;
    }

    public final C6188V6 A01(EnumC6194VC enumC6194VC) {
        this.A01 = enumC6194VC;
        return this;
    }

    public final C6188V6 A02(EnumC6195VD enumC6195VD) {
        this.A02 = enumC6195VD;
        return this;
    }

    public final C6188V6 A03(String str) {
        this.A03 = str;
        return this;
    }

    public final C6188V6 A04(String str) {
        this.A04 = str;
        return this;
    }

    public final C6188V6 A05(Map<String, String> mData) {
        this.A05 = mData;
        return this;
    }

    public final C6188V6 A06(boolean z) {
        this.A06 = z;
        return this;
    }

    public final C6189V7 A07(C6067T8 c6067t8) {
        return new C6189V7(c6067t8, this.A04, this.A00, this.A03, this.A05, this.A01, this.A02, this.A06);
    }
}
