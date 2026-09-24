package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.JJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5464JJ implements InterfaceC6684dB {
    public static byte[] A01;
    public static String[] A02 = {"j0Llx0J1MSgFmdDCajgZS", "WqPPZqRc0dX4AocYH9RDHKNy8FKfctFv", "x4SSjhhb9i0sKdnf0Wf5s", "xtX3gCAokrJDAeXWoUYA8plxhmXwCeOm", "uRKBJqZuIeGTpbClJ99Pe9ZmQekDyja2", "rD1ESZhEMARN2moY0NiI8P2eIcx2KKt8", "vMF11DxP2anc735da3YXnRmNGLge", "xeUiMncNmqcgkFgn7eafy8FxNu3C"};
    public final /* synthetic */ C466362 A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[2].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "mcgN6rOfJkIrJEn9BPtko0s6E0JP";
            strArr2[7] = "7NujJgKdrQLNFT4Mmbwt8V3uSlrM";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 20);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{47, 46, 88, Ascii.ESC, 10, Ascii.f22491EM, Ascii.f22503VT, Ascii.DLE, Ascii.f22494GS, Ascii.f22493FS, Ascii.f22493FS, Ascii.f22500SO, 9, 52, Ascii.f22494GS, 2, Ascii.f22500SO, Ascii.f22493FS};
    }

    static {
        A01();
    }

    public C5464JJ(C466362 c466362) {
        this.A00 = c466362;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6684dB
    public final void AFU() {
        C6898ge context = AbstractC6066T7.A00();
        if (context != null) {
            context.A08().ABC(A00(10, 8, 127), AbstractC6098Td.A2g, new C6099Te(A00(0, 10, 108)));
        }
    }
}
