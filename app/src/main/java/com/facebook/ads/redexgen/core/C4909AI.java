package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4909AI implements InterfaceC7408pF {
    public static byte[] A00;
    public static final InterfaceC46335Y A01;
    public static final C4909AI A02;

    public static /* synthetic */ C4909AI A00() {
        return new C4909AI();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{Ascii.ETB, 43, 38, 36, 34, 47, 40, 43, 35, 34, 53, 3, 38, 51, 38, Ascii.DC4, 40, 50, 53, 36, 34, 103, 36, 38, 41, 41, 40, 51, 103, 37, 34, 103, 40, 55, 34, 41, 34, 35};
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7408pF
    public final /* synthetic */ Map A8t() {
        return AbstractC46325X.A00(this);
    }

    static {
        A02();
        A02 = new C4909AI();
        A01 = new InterfaceC46335Y() { // from class: com.facebook.ads.redexgen.X.p4
            @Override // com.facebook.ads.redexgen.core.InterfaceC46335Y
            public final InterfaceC7408pF A5I() {
                return C4909AI.A00();
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7408pF
    public final void A43(InterfaceC46545t interfaceC46545t) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7408pF
    public final Uri A9P() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7408pF
    public final long AGi(C46435i c46435i) throws IOException {
        throw new IOException(A01(0, 38, 57));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7408pF
    public final void close() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC44562c
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
