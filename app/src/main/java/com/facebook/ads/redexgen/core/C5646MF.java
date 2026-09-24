package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.MF */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5646MF implements InterfaceC6466Zf {
    public static byte[] A01;
    public static String[] A02 = {"8F1ylXiPLmOJlxHuSB0OfTD8ERnub0Jc", "S6BOYeNFrgFu99vNdASrFyo", "dJPilyeR7SZ6Rr21hdX", "myhsKKLHgmC4nogMMn1nxIO", "jSXY2xjzyKT8sDO", "m4o2VQ2UIP9pfbMg6FrqdCCZlyPN5tpn", "ArrKoNW9WxnAbKv8I1vfh8MoVmXkp7wv", "MU6Xe0UyfSgNRnTq3TqZG"};
    public final /* synthetic */ AbstractC6464Zd A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{1, Ascii.f22490CR, Ascii.f22499SI, 76, 4, 3, 1, 7, 0, Ascii.f22490CR, Ascii.f22490CR, 9, 76, 3, 6, 17, 76, 3, 6, Ascii.DLE, 7, Ascii.DC2, Ascii.f22490CR, Ascii.DLE, Ascii.SYN, Ascii.f22503VT, Ascii.f22492FF, 5, 76, 36, 43, 44, 43, 49, 42, Base64.padSymbol, 35, 38, Base64.padSymbol, 48, 39, 50, 45, 48, 54, 43, 44, 37, Base64.padSymbol, 36, 46, 45, 53};
    }

    static {
        A01();
    }

    public C5646MF(AbstractC6464Zd abstractC6464Zd) {
        this.A00 = abstractC6464Zd;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6466Zf
    public final void A53() {
        if (this.A00.A09 == null) {
            return;
        }
        this.A00.A09.A4j(A00(0, 53, 115));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6466Zf
    public final void A54() {
        this.A00.A0P();
        if (this.A00.A0A != null) {
            this.A00.A0A.AFi(true);
        }
        if (this.A00.A05 != null) {
            this.A00.A05.ACr();
        }
        this.A00.A0E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6466Zf
    public final void A9c() {
        if (this.A00.A04 == null) {
            A54();
            if (A02[0].charAt(15) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "E4Sw3glaT0j7tztglKcmJ4X";
            strArr[3] = "i6sG1P4DTWmVPFfNkRQLKmp";
            return;
        }
        AbstractC6464Zd.A03(this.A00);
        if (this.A00.A04.A02() == null) {
            this.A00.A0F();
        } else {
            this.A00.A0H(this.A00.A04.A02());
        }
        if (C6171Up.A2Z(this.A00.A07)) {
            this.A00.performAccessibilityAction(128, null);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6466Zf
    public final void AAp() {
        if (!TextUtils.isEmpty(this.A00.A06.A0I())) {
            C6307X6.A0O(new C6307X6(), this.A00.A07, AbstractC6312XB.A00(this.A00.A06.A0I()), this.A00.A0B);
        }
        this.A00.A03.A04();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6466Zf
    public final void AAq() {
        this.A00.A0P();
        if (this.A00.A0A != null) {
            this.A00.A0A.AFi(true);
        }
        if (!TextUtils.isEmpty(this.A00.A06.A0C())) {
            C6307X6.A0O(new C6307X6(), this.A00.A07, AbstractC6312XB.A00(this.A00.A06.A0C()), this.A00.A0B);
        }
        this.A00.A03.A06();
        this.A00.A0E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6466Zf
    public final void AEr(EnumC5798Oi enumC5798Oi) {
        C5800Ok c5800OkA0B;
        AbstractC6464Zd.A02(this.A00);
        this.A00.A02 = enumC5798Oi;
        if (this.A00.A02 != EnumC5798Oi.A04) {
            AbstractC6464Zd abstractC6464Zd = this.A00;
            if (A02[0].charAt(15) != 'S') {
                String[] strArr = A02;
                strArr[6] = "aVWWA7RlXQ4WxwD1lKH3adLgfY6YTeho";
                strArr[5] = "uW2I9G42iXHj1OU85KkNtz4HKFKkrOfh";
                c5800OkA0B = abstractC6464Zd.A06.A0B();
            } else {
                c5800OkA0B = abstractC6464Zd.A06.A0B();
            }
        } else {
            c5800OkA0B = this.A00.A06.A0A();
        }
        AbstractC6464Zd abstractC6464Zd2 = this.A00;
        String[] strArr2 = A02;
        if (strArr2[6].charAt(11) == strArr2[5].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A02;
        strArr3[1] = "uGU0gkKbqe2rkd9hIKZj6BU";
        strArr3[3] = "Cw3GzUJKwEhWx9AKZcDfceI";
        abstractC6464Zd2.A0H(c5800OkA0B);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6466Zf
    public final void AF4(C5800Ok c5800Ok) {
        AbstractC6464Zd.A02(this.A00);
        this.A00.A03.A07(c5800Ok.A01());
        if (!c5800Ok.A05().isEmpty()) {
            AbstractC6464Zd abstractC6464Zd = this.A00;
            String[] strArr = A02;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "wullz3k0Ma2cYDBinBI95xBWIfHYuzlI";
            strArr2[5] = "wkJ6jlNGXVBBqnzofRVuEUhlZdNAnE5y";
            abstractC6464Zd.A0H(c5800Ok);
            return;
        }
        this.A00.A0G(c5800Ok);
    }
}
