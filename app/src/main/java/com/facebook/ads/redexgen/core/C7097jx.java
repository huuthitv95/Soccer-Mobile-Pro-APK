package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jx */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7097jx extends AbstractC5696N4 {
    public static String[] A03 = {"bMkIe4HHzeEAIK", "wvvk6JXeoGYrQUt6QbLdYhjQYYfi53dR", "vUaO3wypQXV6NlpG4vA9ecCDTWnzdNvx", "btTnQ58GcbMs0xrA6ag", "uPcaf", "63yRelZMLNO9Px2VKweOh9y3", "uSQS7xV", "6B8EZAVNEh4nIf7eFA6RS1UfCbAYEEi0"};
    public final /* synthetic */ InterfaceC5701N9 A00;
    public final /* synthetic */ C478580 A01;
    public final /* synthetic */ C472976 A02;

    public C7097jx(C478580 c478580, C472976 c472976, InterfaceC5701N9 interfaceC5701N9) {
        this.A01 = c478580;
        this.A02 = c472976;
        this.A00 = interfaceC5701N9;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5696N4
    public final void A00() {
        this.A02.A0F().A4R(this.A00 != null);
        if (this.A00 != null) {
            InterfaceC5701N9 interfaceC5701N9 = this.A00;
            String[] strArr = A03;
            if (strArr[7].charAt(12) == strArr[2].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[7] = "cKnhjiPIAYzu4sHLc7xY44MJ7ERYjZpV";
            strArr2[2] = "VDOCXXkozOxHXBfHSThQ3rlqz7gvm39S";
            interfaceC5701N9.ADE(this.A01);
        }
    }
}
