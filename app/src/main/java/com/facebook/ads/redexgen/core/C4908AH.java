package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4908AH implements InterfaceC7408pF {
    public static byte[] A03;
    public final int A00;
    public final AbstractC45153d A01;
    public final InterfaceC7408pF A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{1, 3, 0, -12, -10, -10, -11, -32, 3, -27, -7, 3, 0, 8};
    }

    public C4908AH(InterfaceC7408pF interfaceC7408pF, AbstractC45153d abstractC45153d, int i) {
        this.A02 = (InterfaceC7408pF) AbstractC45353y.A01(interfaceC7408pF);
        AbstractC45353y.A01(abstractC45153d);
        this.A01 = null;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7408pF
    public final void A43(InterfaceC46545t interfaceC46545t) {
        AbstractC45353y.A01(interfaceC46545t);
        this.A02.A43(interfaceC46545t);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7408pF
    public final Map<String, List<String>> A8t() {
        return this.A02.A8t();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7408pF
    public final Uri A9P() {
        return this.A02.A9P();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7408pF
    public final long AGi(C46435i c46435i) throws IOException {
        throw new NullPointerException(A00(0, 14, 104));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7408pF
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC44562c
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        throw new NullPointerException(A00(0, 14, 104));
    }
}
