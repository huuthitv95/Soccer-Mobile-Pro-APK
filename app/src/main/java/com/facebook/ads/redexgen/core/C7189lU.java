package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lU */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7189lU implements InterfaceC5331H9 {
    public static String[] A03 = {"MPtFkEiIPrQJk6C68eapJqoHhp6zbLCW", "P1eCuU1JvuL46IL3Xh4EOSVLMCcJCOjT", "W4WpROs4sm5j6Tf0ztR0Y16lEj4WGQ", "4wLB1kD6U2fJ8LvWKaQYimBngFnzynrL", "j1g6H1G7HHWswscQmxGermXRDRDROF5f", "vYNShvJ8K3s57yIlGqGLfJHMZKUSU02I", "LyEFdcIU17ooQUQ0BZMXWJLXZvdofmIX", "P7XGal"};
    public static final InterfaceC5335HD A04 = new InterfaceC5335HD() { // from class: com.facebook.ads.redexgen.X.lV
        @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
        public final InterfaceC5331H9[] A5N() {
            return C7189lU.A00();
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
        public final /* synthetic */ InterfaceC5331H9[] A5O(Uri uri, Map map) {
            return AbstractC5334HC.A01(this, uri, map);
        }
    };
    public boolean A00;
    public final C7188lT A02 = new C7188lT();
    public final C45944v A01 = new C45944v(16384);

    public static /* synthetic */ InterfaceC5331H9[] A00() {
        return new InterfaceC5331H9[]{new C7189lU()};
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AAC(InterfaceC5332HA interfaceC5332HA) {
        this.A02.A5c(interfaceC5332HA, new C5585LG(0, 1));
        interfaceC5332HA.A6O();
        interfaceC5332HA.AJ7(new C7258mn(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final int AHL(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv) throws IOException {
        int i = interfaceC7263ms.read(this.A01.A0l(), 0, 16384);
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
        int length = 0;
        while (true) {
            byte[] bArrA0l = c45944v.A0l();
            if (A03[3].charAt(10) != 'f') {
                throw new RuntimeException();
            }
            A03[3] = "dKI30oOFAvfBQiacazr45UFgS6k9aj5a";
            interfaceC7263ms.AGt(bArrA0l, 0, 10);
            c45944v.A0f(0);
            if (c45944v.A0K() != 4801587) {
                interfaceC7263ms.AIl();
                interfaceC7263ms.A47(length);
                int i = length;
                int syncBytes = 0;
                while (true) {
                    interfaceC7263ms.AGt(c45944v.A0l(), 0, 7);
                    c45944v.A0f(0);
                    int headerPosition = c45944v.A0M();
                    if (headerPosition != 44096 && headerPosition != 44097) {
                        syncBytes = 0;
                        interfaceC7263ms.AIl();
                        i++;
                        if (i - length >= 8192) {
                            return false;
                        }
                        interfaceC7263ms.A47(i);
                    } else {
                        syncBytes++;
                        if (syncBytes >= 4) {
                            return true;
                        }
                        int headerPosition2 = AbstractC5316Gu.A02(c45944v.A0l(), headerPosition);
                        if (headerPosition2 == -1) {
                            return false;
                        }
                        interfaceC7263ms.A47(headerPosition2 - 7);
                    }
                }
            } else {
                c45944v.A0g(3);
                int iA0H = c45944v.A0H();
                length += iA0H + 10;
                interfaceC7263ms.A47(iA0H);
            }
        }
    }
}
