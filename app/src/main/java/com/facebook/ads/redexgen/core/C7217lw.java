package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lw */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7217lw implements InterfaceC5331H9 {
    public static byte[] A03;
    public static String[] A04 = {"IFBRawCVF0AWJOiiVagp2bzm1iWWQKSj", "auHMqC8YUXWsvqiTg7", "x05hwyQceYKgfv4KdHsaZDzMFYGIFABO", "EiWauAjA92n8uYBsDF1eTop4V9uY", "nHLlm8XHOjaWHtwU5p4BIc0GM3UweWlu", "dBwF9hq9j3gGLabp", "n4a5QuSOEmxq5i2DA2", "Zy0ftHIbrTR5qGqkd"};
    public static final InterfaceC5335HD A05;
    public InterfaceC5332HA A00;
    public AbstractC5482Jb A01;
    public boolean A02;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A04[3].length() == 20) {
                throw new RuntimeException();
            }
            A04[3] = "IEdap1c7a0gADNuxefg";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 36);
            i4++;
        }
    }

    public static void A02() {
        A03 = new byte[]{96, 71, 79, 74, 67, 66, 6, 82, 73, 6, 66, 67, 82, 67, 84, 75, 79, 72, 67, 6, 68, 79, 82, 85, 82, 84, 67, 71, 75, 6, 82, 95, 86, 67};
    }

    static {
        A02();
        A05 = new InterfaceC5335HD() { // from class: com.facebook.ads.redexgen.X.lx
            @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
            public final InterfaceC5331H9[] A5N() {
                return C7217lw.A04();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
            public final /* synthetic */ InterfaceC5331H9[] A5O(Uri uri, Map map) {
                return AbstractC5334HC.A01(this, uri, map);
            }
        };
    }

    public static C45944v A00(C45944v c45944v) {
        c45944v.A0f(0);
        return c45944v;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private boolean A03(InterfaceC7263ms interfaceC7263ms) throws IOException {
        C5478JX c5478jx = new C5478JX();
        if (!c5478jx.A05(interfaceC7263ms, true) || (c5478jx.A04 & 2) != 2) {
            return false;
        }
        int length = Math.min(c5478jx.A00, 8);
        C45944v c45944v = new C45944v(length);
        interfaceC7263ms.AGt(c45944v.A0l(), 0, length);
        if (C7219ly.A01(A00(c45944v))) {
            this.A01 = new C7219ly();
        } else if (C7214lt.A06(A00(c45944v))) {
            this.A01 = new C7214lt();
        } else {
            if (!C7216lv.A02(A00(c45944v))) {
                return false;
            }
            this.A01 = new C7216lv();
        }
        return true;
    }

    public static /* synthetic */ InterfaceC5331H9[] A04() {
        return new InterfaceC5331H9[]{new C7217lw()};
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AAC(InterfaceC5332HA interfaceC5332HA) {
        this.A00 = interfaceC5332HA;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final int AHL(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv) throws IOException {
        AbstractC45353y.A02(this.A00);
        if (this.A01 == null) {
            if (A03(interfaceC7263ms)) {
                interfaceC7263ms.AIl();
            } else {
                throw C44963K.A01(A01(0, 34, 2), null);
            }
        }
        boolean z = this.A02;
        if (A04[0].charAt(6) == 'U') {
            throw new RuntimeException();
        }
        A04[5] = "ISTJLhLpuA8o4P7J";
        if (!z) {
            InterfaceC5361Hd interfaceC5361HdAKS = this.A00.AKS(0, 1);
            this.A00.A6O();
            this.A01.A08(this.A00, interfaceC5361HdAKS);
            this.A02 = true;
        }
        return this.A01.A04(interfaceC7263ms, c5353hv);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AJ6(long j, long j2) {
        if (this.A01 != null) {
            this.A01.A07(j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final boolean AK5(InterfaceC7263ms interfaceC7263ms) throws IOException {
        try {
            return A03(interfaceC7263ms);
        } catch (C44963K unused) {
            return false;
        }
    }
}
