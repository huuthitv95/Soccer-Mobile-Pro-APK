package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.SX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6031SX {
    public final long A00;
    public final EnumC6030SW A01;
    public final String A02;
    public final boolean A03;

    public C6031SX(String str, boolean z, EnumC6030SW enumC6030SW) {
        this(str, z, enumC6030SW, System.currentTimeMillis());
    }

    public C6031SX(String str, boolean z, EnumC6030SW enumC6030SW, long j) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = enumC6030SW;
        this.A00 = j;
    }

    public static C6031SX A00() {
        return new C6031SX("", true, EnumC6030SW.A05, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC6030SW A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
