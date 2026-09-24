package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.GV */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5291GV extends AbstractRunnableC6279Wc {
    public static byte[] A01;
    public static String[] A02 = {"ziFc1AxLwl06l9cm2ro8EEkTqcfxuLTc", "Ot3h47XlIqwqlb0VDKX34tYNREgAb88h", "XErmhi3UBKLFfekLEXmFG5T5AXnu", "x4ahbzSdp8w2tJq97wkZytqruvrbxvGd", "5eNtQA6JlDjBFR49aczWqHsgt2phfPFu", "5gzf4", "tgwS2khKEZgsCudiehRL6tpdm2kFQW", "Wy"};
    public final /* synthetic */ C45684V A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 14);
            if (A02[5].length() != 5) {
                throw new RuntimeException();
            }
            A02[2] = "VyWbJGKy3Ebs7lO";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{62, 1, Ascii.f22492FF, Ascii.f22490CR, 7, 72, 6, Ascii.f22490CR, Ascii.f22498RS, Ascii.f22490CR, Ascii.SUB, 72, Ascii.ESC, Ascii.f22493FS, 9, Ascii.SUB, Ascii.f22493FS, Ascii.f22490CR, Ascii.f22492FF, 72, Ascii.CAN, 4, 9, 17, 1, 6, Ascii.f22499SI};
    }

    static {
        A01();
    }

    public C5291GV(C45684V c45684v) {
        this.A00 = c45684v;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        if (!this.A00.A0F) {
            this.A00.A0Q(A00(0, 27, 102));
        }
    }
}
