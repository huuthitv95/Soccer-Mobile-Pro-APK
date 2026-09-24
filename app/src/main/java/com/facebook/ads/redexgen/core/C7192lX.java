package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7192lX implements InterfaceC5331H9 {
    public static String[] A03 = {"omX6mlrNbYq0LGa8KWDQoDOxuY4Jaqsm", "5vCbKZ7gcP1deFubK5J3aMrnVGjcBeMu", "ozZJ4UCdXiLAsxGuZMu8vrfsyQyOy2Qr", "457YRIf4cJgVa", "48ELt3GeP9QgscGCGAyy0GBjQnf8y1ot", "nP9Rki4V9hDzJun2MpMPW2v7tMuO22BO", "splStgYzXsMDywgFYcc1GmuRRae3j1Zq", "jQwA1XKYR4HrKvDtyQbVDHffCNmVjAZf"};
    public static final InterfaceC5335HD A04 = new InterfaceC5335HD() { // from class: com.facebook.ads.redexgen.X.lY
        @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
        public final InterfaceC5331H9[] A5N() {
            return C7192lX.A00();
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
        public final /* synthetic */ InterfaceC5331H9[] A5O(Uri uri, Map map) {
            return AbstractC5334HC.A01(this, uri, map);
        }
    };
    public boolean A00;
    public final C7191lW A02 = new C7191lW();
    public final C45944v A01 = new C45944v(2786);

    public static /* synthetic */ InterfaceC5331H9[] A00() {
        return new InterfaceC5331H9[]{new C7192lX()};
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AAC(InterfaceC5332HA interfaceC5332HA) {
        this.A02.A5c(interfaceC5332HA, new C5585LG(0, 1));
        interfaceC5332HA.A6O();
        interfaceC5332HA.AJ7(new C7258mn(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final int AHL(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv) throws IOException {
        int i = interfaceC7263ms.read(this.A01.A0l(), 0, 2786);
        if (i == -1) {
            return -1;
        }
        this.A01.A0f(0);
        this.A01.A0e(i);
        if (!this.A00) {
            this.A02.AGq(0L, 4);
            this.A00 = true;
        }
        this.A02.A5A(this.A01);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AJ6(long j, long j2) {
        this.A00 = false;
        this.A02.AJ5();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final boolean AK5(InterfaceC7263ms interfaceC7263ms) throws IOException {
        C45944v c45944v = new C45944v(10);
        int i = 0;
        while (true) {
            interfaceC7263ms.AGt(c45944v.A0l(), 0, 10);
            c45944v.A0f(0);
            if (c45944v.A0K() != 4801587) {
                interfaceC7263ms.AIl();
                interfaceC7263ms.A47(i);
                int i2 = i;
                int startPosition = 0;
                while (true) {
                    interfaceC7263ms.AGt(c45944v.A0l(), 0, 6);
                    c45944v.A0f(0);
                    int headerPosition = c45944v.A0M();
                    if (headerPosition != 2935) {
                        startPosition = 0;
                        interfaceC7263ms.AIl();
                        i2++;
                        int headerPosition2 = i2 - i;
                        if (headerPosition2 >= 8192) {
                            return false;
                        }
                        interfaceC7263ms.A47(i2);
                    } else {
                        startPosition++;
                        if (startPosition >= 4) {
                            return true;
                        }
                        int headerPosition3 = AbstractC5313Gr.A05(c45944v.A0l());
                        if (headerPosition3 == -1) {
                            return false;
                        }
                        interfaceC7263ms.A47(headerPosition3 - 6);
                    }
                }
            } else {
                c45944v.A0g(3);
                int length = c45944v.A0H();
                i += length + 10;
                String[] strArr = A03;
                if (strArr[2].charAt(6) == strArr[0].charAt(6)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[2] = "eBRvK0YAHsHMNfInXbOwvDfd4dSG53RM";
                strArr2[0] = "womotRNroMOUij9xAXX8qTzQtzDZBBtc";
                interfaceC7263ms.A47(length);
            }
        }
    }
}
