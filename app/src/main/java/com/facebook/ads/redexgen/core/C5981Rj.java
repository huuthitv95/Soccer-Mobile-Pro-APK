package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Build;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rj */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5981Rj {
    public static byte[] A04;
    public static String[] A05 = {"MJXAzUwyiLvMzZCrP1QJf8uMs9b", "sHuNTXgsBnW3HGqskl7KH5QkikNWpABj", "q8u9vKEVkpk3dMxroB1EFzM5kwDKfJOq", "eyGwnlQBA4bCraIcft5FxvFgN7f8TC5N", "FmmRYKiwjJl3dX1FB2pV6kIWJpsNLC6h", "flBitaWG3wpDSjkerYNuTkR3r5UhRox3", "xkUQOvOGGj42jMnQjSDdoLzQvdQiYUba", "XqZ9VL6XKZ5Y"};
    public final Intent A00;
    public final C5976Re A01;
    public final C6902gi A02;
    public final InterfaceC6192VA A03;

    public static String A0K(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0L() {
        A04 = new byte[]{99, 127, 4, 1, 58, 1, 4, 17, 4, 58, 7, Ascii.DLE, Ascii.f22503VT, 1, 9, 0, 43, 41, 36, 36, 45, 58, Ascii.f22493FS, 49, 56, 45, 119, 124, 117, 125, 122, 113, 112, 85, 112, 80, 117, 96, 117, 86, 97, 122, 112, 120, 113, 35, 44, 41, 49, 32, 55, 32, 33, Ascii.SUB, 38, 41, 44, 38, 46, Ascii.SUB, 33, 32, 41, 36, 60, Ascii.SUB, 40, 54, 123, 97, 77, 100, 32, 77, 118, 119, 97, 123, 117, 124, 116, 123, 110, 115, 108, 127, 91, 126, 94, 123, 110, 123, 88, 111, 116, 126, 118, 127, 32, 55, 37, 51, 32, 54, 55, 54, 4, 59, 54, 55, Base64.padSymbol, 19, 54, Ascii.SYN, 51, 38, 51, Ascii.DLE, 39, 60, 54, 62, 55, Ascii.SYN, 9, 4, 5, Ascii.f22499SI, 63, Ascii.DC4, 9, Ascii.f22490CR, 5, 63, Ascii.DLE, Ascii.f22499SI, Ascii.f22492FF, Ascii.f22492FF, 9, Ascii.f22500SO, 7, 63, 9, Ascii.f22500SO, Ascii.DC4, 5, Ascii.DC2, Ascii.SYN, 1, Ascii.f22492FF};
    }

    static {
        A0L();
    }

    public C5981Rj(C5976Re c5976Re, Intent intent, InterfaceC6192VA interfaceC6192VA, C6902gi c6902gi) {
        this.A01 = c5976Re;
        this.A00 = intent;
        this.A03 = interfaceC6192VA;
        this.A02 = c6902gi;
    }

    private AbstractC7077jd A00() {
        int i = Build.VERSION.SDK_INT;
        String strA0K = A0K(80, 18, 33);
        if (i >= 33) {
            return (AbstractC7077jd) this.A00.getSerializableExtra(strA0K, AbstractC7077jd.class);
        }
        Intent intent = this.A00;
        String[] strArr = A05;
        if (strArr[6].charAt(13) != strArr[2].charAt(13)) {
            throw new RuntimeException();
        }
        A05[1] = "LmjecX6z1NXmevkMdudhCsYVgseeBlBL";
        return (AbstractC7077jd) intent.getSerializableExtra(strA0K);
    }

    private C7069jT A01() {
        int i = Build.VERSION.SDK_INT;
        String strA0K = A0K(26, 19, 47);
        if (i >= 33) {
            return (C7069jT) this.A00.getSerializableExtra(strA0K, C7069jT.class);
        }
        return (C7069jT) this.A00.getSerializableExtra(strA0K);
    }

    private C47727n A02() {
        int i = Build.VERSION.SDK_INT;
        String strA0K = A0K(2, 14, 94);
        if (i >= 33) {
            return (C47727n) this.A00.getSerializableExtra(strA0K, C47727n.class);
        }
        return (C47727n) this.A00.getSerializableExtra(strA0K);
    }

    private C47707l A03() {
        int i = Build.VERSION.SDK_INT;
        String strA0K = A0K(98, 25, 105);
        if (i >= 33) {
            return (C47707l) this.A00.getSerializableExtra(strA0K, C47707l.class);
        }
        return (C47707l) this.A00.getSerializableExtra(strA0K);
    }

    private InterfaceC6407Yi A05() {
        boolean booleanExtra = this.A00.getBooleanExtra(A0K(68, 12, 41), false);
        boolean isV2Design = C6171Up.A2w(this.A02);
        if (isV2Design) {
            String stringExtra = this.A00.getStringExtra(A0K(45, 23, 126));
            C5976Re c5976Re = this.A01;
            C6902gi c6902gi = this.A02;
            InterfaceC6192VA interfaceC6192VA = this.A03;
            C6948hS c6948hS = new C6948hS(this.A01);
            String stringExtra2 = this.A00.getStringExtra(A0K(16, 10, 115));
            if (stringExtra == null) {
                stringExtra = A0K(0, 2, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
            }
            int i = Integer.parseInt(stringExtra);
            String clickDelayMs = A05[5];
            if (clickDelayMs.charAt(3) != 'i') {
                throw new RuntimeException();
            }
            A05[4] = "YY09SF1W0j6b6KfCSgRusx8TJPca7HgC";
            return new ViewOnClickListenerC47206x(c5976Re, c6902gi, interfaceC6192VA, c6948hS, stringExtra2, i);
        }
        return new C5849PZ(this.A01, this.A02, this.A03, new C6948hS(this.A01), booleanExtra);
    }

    private InterfaceC6407Yi A06() {
        C47727n c47727nA02 = A02();
        if (c47727nA02 == null) {
            return null;
        }
        return A08(new C473077(this.A01), c47727nA02, c47727nA02.A1G(), new C5648MH());
    }

    private InterfaceC6407Yi A07() {
        C47707l c47707lA03 = A03();
        if (c47707lA03 == null) {
            return null;
        }
        return A08(new C473077(this.A01), c47707lA03, c47707lA03.A1G(), new C5647MG());
    }

    private InterfaceC6407Yi A08(InterfaceC6406Yh interfaceC6406Yh, AbstractC7077jd abstractC7077jd, String str, InterfaceC6455ZU interfaceC6455ZU) {
        if (abstractC7077jd.A29().A0H().A07() != null) {
            C5742No c5742NoA07 = abstractC7077jd.A29().A0H().A07();
            if (abstractC7077jd.A1n()) {
                return new C5663MW(this.A02, this.A03, interfaceC6406Yh, abstractC7077jd, c5742NoA07, str, interfaceC6455ZU);
            }
            return new C5716NO(this.A02, this.A03, interfaceC6406Yh, abstractC7077jd, str, interfaceC6455ZU);
        }
        interfaceC6406Yh.A4j(interfaceC6455ZU.A81());
        interfaceC6406Yh.A4j(interfaceC6455ZU.A7w());
        return null;
    }

    private AbstractC5834PJ A09(EnumC6262WK enumC6262WK) {
        AbstractC7077jd abstractC7077jdA02;
        if (enumC6262WK == EnumC6262WK.A0G) {
            abstractC7077jdA02 = A03();
            String[] strArr = A05;
            if (strArr[6].charAt(13) != strArr[2].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[6] = "BHjTvXd0Vicw2MzqRZQvpavg35ntNS6w";
            strArr2[2] = "NWBwsXtlP0iXXM4o1NBUiSzzY7vvtUxs";
            if (abstractC7077jdA02 == null) {
                return null;
            }
        } else if (enumC6262WK != EnumC6262WK.A0A || (abstractC7077jdA02 = A02()) == null) {
            return null;
        }
        abstractC7077jdA02.A1L(this.A01.A08());
        if (abstractC7077jdA02.A1a()) {
            return new C45674U(this.A02, this.A03, new C6056Sx(this.A02), new C6948hS(this.A01), abstractC7077jdA02);
        }
        return new C45664T(this.A02, this.A03, new C6056Sx(this.A02), new C6948hS(this.A01), abstractC7077jdA02);
    }

    private final C5660MT A0A() {
        return new C5660MT(this.A02, this.A01);
    }

    private C5649MI A0B(RelativeLayout relativeLayout) {
        C5649MI c5649mi = new C5649MI(this.A02, new C6947hR(this), this.A03, new C6948hS(this.A01));
        c5649mi.A05(relativeLayout);
        c5649mi.A04(this.A00.getIntExtra(A0K(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 27, 91), 200));
        AbstractC6374YB.A0N(relativeLayout, ViewCompat.MEASURED_STATE_MASK);
        return c5649mi;
    }

    private C466766 A0C() {
        C47727n c47727nA02 = A02();
        if (c47727nA02 == null) {
            return null;
        }
        return new C466766(this.A02, this.A03, new C6948hS(this.A01), c47727nA02, new C5648MH(), 1);
    }

    private C466766 A0D() {
        C47707l c47707lA03 = A03();
        if (c47707lA03 == null) {
            return null;
        }
        return new C466766(this.A02, this.A03, new C6948hS(this.A01), c47707lA03, new C5647MG(), 0);
    }

    private C5458JD A0E() {
        C6685dC c6685dCA02;
        AbstractC7077jd abstractC7077jdA00 = A00();
        if (abstractC7077jdA00 == null || (c6685dCA02 = AbstractC6686dD.A02(abstractC7077jdA00.A1D())) == null) {
            return null;
        }
        return new C5458JD(this.A02, new C6948hS(this.A01), c6685dCA02, abstractC7077jdA00.A2E());
    }

    private C5300Ge A0F(EnumC6262WK enumC6262WK) {
        InterfaceC6455ZU c5647mg;
        InterfaceC6406Yh c473077;
        C7069jT c7069jTA01 = A01();
        if (c7069jTA01 == null) {
            return null;
        }
        if (enumC6262WK == EnumC6262WK.A04) {
            c5647mg = new C5648MH();
            c473077 = new C6948hS(this.A01);
        } else {
            c5647mg = new C5647MG();
            c473077 = new C473077(this.A01);
        }
        return new C5300Ge(this.A02, c5647mg, this.A03, c7069jTA01, new C6056Sx(this.A02), c473077);
    }

    private C45964x A0G() {
        C47727n c47727nA02 = A02();
        if (c47727nA02 != null) {
            return new C45964x(this.A02, new C5648MH(), this.A03, c47727nA02, new C6056Sx(this.A02), new C6948hS(this.A01));
        }
        if (A05[1].charAt(5) != 'X') {
            throw new RuntimeException();
        }
        A05[3] = "TvLwsmu9uaa0faVP4fF8b7PGg31O8U7I";
        return null;
    }

    private C45684V A0H() {
        C47727n c47727nA02 = A02();
        if (c47727nA02 == null) {
            return null;
        }
        return new C45684V(this.A02, new C5648MH(), this.A03, c47727nA02, new C6056Sx(this.A02), new C6948hS(this.A01));
    }

    private C45684V A0I() {
        C47707l c47707lA03 = A03();
        if (c47707lA03 == null) {
            return null;
        }
        return new C45684V(this.A02, new C5647MG(), this.A03, c47707lA03, new C6056Sx(this.A02), new C473077(this.A01));
    }

    private C5271GB A0J(EnumC6262WK enumC6262WK) {
        AbstractC7077jd abstractC7077jdA02;
        AbstractC7077jd abstractC7077jdA03;
        if (enumC6262WK == EnumC6262WK.A0J) {
            abstractC7077jdA02 = A03();
            if (abstractC7077jdA02 == null || (abstractC7077jdA03 = A03()) == null) {
                return null;
            }
        } else if (enumC6262WK != EnumC6262WK.A0E || (abstractC7077jdA02 = A02()) == null || (abstractC7077jdA03 = A02()) == null) {
            return null;
        }
        return new C5271GB(this.A02, this.A03, abstractC7077jdA02, abstractC7077jdA03, new C473077(this.A01), this.A01, enumC6262WK);
    }

    public final InterfaceC6407Yi A0M(EnumC6262WK enumC6262WK, RelativeLayout relativeLayout) {
        if (enumC6262WK == null) {
            return null;
        }
        switch (C5980Ri.A00[enumC6262WK.ordinal()]) {
            case 1:
                if (relativeLayout != null) {
                    return A0B(relativeLayout);
                }
                return null;
            case 2:
            case 3:
                return A09(enumC6262WK);
            case 4:
                return A0I();
            case 5:
                return A07();
            case 6:
                InterfaceC6407Yi interfaceC6407YiA05 = A05();
                if (A05[4].charAt(13) != '3') {
                    A05[1] = "IIJ0HXviRARge0yizoGTY0JUA2Nzjczv";
                    return interfaceC6407YiA05;
                }
                String[] strArr = A05;
                strArr[6] = "UHMFNKnwuKHYyMbevaCPtufG1H9dhH1t";
                strArr[2] = "s6UgSHR7PtydXMVItCKPjBxPhDp7nABU";
                return interfaceC6407YiA05;
            case 7:
                return A0H();
            case 8:
                return A0G();
            case 9:
                return A06();
            case 10:
                return A0E();
            case 11:
                C466766 c466766A0C = A0C();
                if (A05[5].charAt(3) != 'i') {
                    throw new RuntimeException();
                }
                A05[3] = "7AQwH6OZkLua7JLoKEhUfmskdEmJStMK";
                return c466766A0C;
            case 12:
                return A0D();
            case 13:
            case 14:
                return A0F(enumC6262WK);
            case 15:
                return A0A();
            case 16:
            case 17:
                return A0J(enumC6262WK);
            default:
                return null;
        }
    }
}
