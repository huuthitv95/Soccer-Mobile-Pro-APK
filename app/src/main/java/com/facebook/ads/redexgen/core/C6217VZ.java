package com.facebook.ads.redexgen.core;

import androidx.media3.common.PlaybackException;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.VZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6217VZ implements InterfaceC6048Sp {
    public static byte[] A03;
    public static String[] A04 = {"mqH0C", "P", "Prv4rgxv4XvjDltPpSeqnrL7fWipLvZ8", "wRAQVkTW0Fdys8", "msKGEa7u", "", "70lhKNnmmmhMBIKZ0qoNvOWwjw91iHAS", "ylnG6cBHFe0YAiTdKU1DLGP7G6QidCUo"};
    public final /* synthetic */ C7094ju A00;
    public final /* synthetic */ C6140UK A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{Ascii.f22493FS, 55, 63, 66, 59, 58, -10, 74, 69, -10, 58, 69, 77, 68, 66, 69, 55, 58, -10, 55, -10, 67, 59, 58, 63, 55, 4};
    }

    static {
        A01();
    }

    public C6217VZ(C6140UK c6140uk, C7094ju c7094ju, boolean z) {
        this.A01 = c6140uk;
        this.A00 = c7094ju;
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6048Sp
    public final void ADL() {
        if (this.A01.A0e != null) {
            this.A01.A0e.A0J();
            this.A01.A0e = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String strA00 = A00(0, 27, 111);
        this.A01.A0g.A0F().A3N(C6364Y1.A01(this.A01.A00), adErrorType.getErrorCode(), strA00);
        if (this.A01.A0I != null) {
            this.A01.A0I.ADp(C6229Vm.A01(adErrorType, strA00));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6048Sp
    public final void ADT() {
        this.A01.A0e = this.A00;
        if (this.A02 && this.A01.A0B != null) {
            this.A01.A0B.A0L();
        }
        if (this.A01.A0I != null) {
            if (this.A01.A0G.equals(EnumC6214VW.A04) && !this.A01.A0r()) {
                this.A01.A0I.AEq();
            }
            if (this.A02) {
                C6140UK c6140uk = this.A01;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[0].length()) {
                    String[] strArr2 = A04;
                    strArr2[4] = "lirdd0Qr";
                    strArr2[0] = "muvxx";
                    if (C6171Up.A1s(c6140uk.A0g) && this.A01.A13() != null && this.A01.A13().A1g()) {
                        this.A01.A0P = AbstractC6686dD.A01(this.A01.A0g, this.A01.A13(), 4, new C6233Vr(this));
                        return;
                    } else {
                        C6140UK c6140uk2 = this.A01;
                        if (A04[3].length() != 28) {
                            A04[6] = "Y1qaffLCA6OgZ6gO9VGOLjOrervRHVYN";
                            c6140uk2.A0I.ACq();
                            return;
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
    }
}
