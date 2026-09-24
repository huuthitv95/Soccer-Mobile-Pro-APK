package com.facebook.ads.redexgen.core;

import android.util.Log;
import androidx.media3.extractor.p007ts.TsExtractor;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.io */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7028io implements InterfaceC5768OE {
    public static byte[] A05;
    public static String[] A06 = {"LqS4Vpkhy9E", "ge1EwIuJY0TovlYE8lSK4ibgoBpAWn9a", "g9aMV", "tM0yo6k6wg7fwB8A5Xyw1gAw", "QSFbFVun0ml7C8TY77Vqi1TYUccnWCEL", "t0vPMbYvCUeZJjWwsMbVoEbKc6G6LcPD", "iAyfyMUWIOpY9gjOpihEXzDIF", "NOfvqhzewpei8jQqPEPmMqHVwiKNDwof"};
    public AdError A00;
    public EnumC5767OD A01 = EnumC5767OD.A02;
    public EnumC5767OD A02 = EnumC5767OD.A02;
    public final AbstractC7024ik A03;
    public final C6902gi A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {125, 41, 50, 125, Ascii.f22492FF, 2, 123, 77, 87, 2, 65, 67, 76, 2, 65, 74, 67, 76, 69, 71, 2, 107, 76, 86, 71, 69, 80, 67, 86, 75, 77, 76, 2, 103, 80, 80, 77, 80, 2, 79, 77, 70, 71, 2, SignedBytes.MAX_POWER_OF_TWO, 91, 2, 81, 71, 86, 86, 75, 76, 69, 2, 99, 70, 113, 71, 86, 86, 75, 76, 69, 81, Ascii.f22492FF, 81, 71, 86, 107, 76, 86, 71, 69, 80, 67, 86, 75, 77, 76, 103, 80, 80, 77, 80, 111, 77, 70, 71, 10, Ascii.f22503VT, 37, 33, 34, Ascii.SYN, 7, 10, 6, Ascii.f22490CR, 0, 6, 45, 6, Ascii.ETB, Ascii.DC4, Ascii.f22492FF, 17, 8, 65, 117, 104, 106, 39, 90, 127, 98, 99, 106, 45, 100, 99, 121, 104, 127, 99, 108, 97, 45, 121, 127, 108, 99, 126, 100, 121, 100, 98, 99, 35, 125, 108, 117, 106, 105, 103, 98, 46, 47, 121, 98, 101, 125, 34, 35, 120, 100, 109, 120, 44, 101, 127, 44, 109, 96, 126, 105, 109, 104, 117, 44, SignedBytes.MAX_POWER_OF_TWO, 67, 77, 72, 69, 66, 75, 32, 44, SignedBytes.MAX_POWER_OF_TWO, 67, 77, 72, 73, 72, 44, 99, 126, 44, 95, 68, 67, 91, 69, 66, 75, 123, 103, 110, 123, 47, 102, 124, 47, 110, 99, 125, 106, 110, 107, 118, 47, 92, 71, SignedBytes.MAX_POWER_OF_TWO, 88, 70, 65, 72, 121, 101, 108, 121, 45, 100, 126, 45, 99, 98, 121, 45, 65, 66, 76, 73, 72, 73};
        String[] strArr = A06;
        if (strArr[1].charAt(28) == strArr[5].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[1] = "uHXyGv91YS5AZybwuzmh7pK9ZkTxCxly";
        strArr2[5] = "aSclBZwoH94XlBt4xX3FAXD0bzJVnGEs";
        A05 = bArr;
    }

    static {
        A01();
    }

    public C7028io(C6902gi c6902gi, AbstractC7024ik abstractC7024ik) {
        this.A04 = c6902gi;
        this.A03 = abstractC7024ik;
    }

    private void A02(EnumC5767OD enumC5767OD, EnumC5767OD enumC5767OD2) {
        String strA00 = A00(113, 26, 44);
        StringBuilder sb = new StringBuilder();
        String errorTitle = A00(108, 5, 38);
        StringBuilder sbAppend = sb.append(errorTitle).append(enumC5767OD);
        String errorTitle2 = A00(0, 4, 124);
        String string = sbAppend.append(errorTitle2).append(enumC5767OD2).toString();
        InterfaceC6097Tc interfaceC6097TcA08 = this.A04.A08();
        int i = AbstractC6098Td.A0e;
        C6099Te c6099Te = new C6099Te(strA00, string);
        String errorTitle3 = A00(TsExtractor.TS_STREAM_TYPE_DTS_UHD, 3, 61);
        interfaceC6097TcA08.ABC(errorTitle3, i, c6099Te);
        String errorTitle4 = strA00 + ' ' + string;
        this.A04.A0F().ALA(errorTitle4);
    }

    private void A03(String str, String str2, boolean z) {
        AdSettings.IntegrationErrorMode integrationErrorModeA00 = AbstractC5764OA.A00(this.A04);
        String str3 = String.format(Locale.US, AdErrorType.INCORRECT_API_CALL_ERROR.getDefaultErrorMessage(), str, str2);
        String strA00 = A00(TsExtractor.TS_STREAM_TYPE_DTS_UHD, 3, 61);
        String strA01 = A00(91, 17, 66);
        if (!z) {
            Log.e(strA01, str3);
            this.A04.A08().ABC(strA00, AbstractC6098Td.A0c, new C6099Te(str3));
            this.A04.A0F().AL9(str3);
            return;
        }
        switch (C5766OC.A00[integrationErrorModeA00.ordinal()]) {
            case 1:
                String errorMessage = str3 + A00(4, 87, 3);
                throw new C5769OF(errorMessage);
            case 2:
                this.A03.A08();
                this.A03.A0B(10, AdErrorType.INCORRECT_STATE_ERROR, str3);
                this.A04.A0F().AL9(str3);
                Log.e(strA01, str3);
                this.A04.A08().ABC(strA00, AbstractC6098Td.A0c, new C6099Te(str3));
                break;
        }
        Log.e(strA01, str3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5768OE
    public final boolean A6U() {
        boolean z = (this.A01 == EnumC5767OD.A02 || this.A01 == EnumC5767OD.A04) && this.A02 != EnumC5767OD.A07;
        if (z) {
            this.A01 = EnumC5767OD.A06;
        } else {
            A03(A00(142, 6, 39), A00(154, 42, 45), false);
        }
        return !z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5768OE
    public final boolean A6V() {
        if (this.A01 == EnumC5767OD.A04 && this.A00 != null && this.A00.getErrorCode() == 2008) {
            this.A04.A0F().AI5();
            this.A03.A0B(10, AdErrorType.AD_PRESENTATION_ERROR, null);
            return true;
        }
        EnumC5767OD enumC5767OD = this.A01;
        EnumC5767OD enumC5767OD2 = EnumC5767OD.A05;
        String[] strArr = A06;
        if (strArr[6].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[4] = "mF60z106z8KVykzxhCmjg96dV72kpnud";
        strArr2[7] = "JHGcNRxcSq72OhujKZnAiyvPQwA3qgql";
        boolean z = enumC5767OD == enumC5767OD2 && (this.A02 != EnumC5767OD.A07 || C6171Up.A0i(this.A04));
        if (z) {
            this.A01 = EnumC5767OD.A02;
            this.A02 = EnumC5767OD.A07;
        } else {
            EnumC5767OD enumC5767OD3 = this.A01;
            EnumC5767OD enumC5767OD4 = EnumC5767OD.A05;
            String strA00 = A00(148, 6, 43);
            if (enumC5767OD3 != enumC5767OD4) {
                A03(strA00, A00(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 18, 44), true);
            } else {
                A03(strA00, A00(196, 23, 46), false);
            }
        }
        return !z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5768OE
    public final EnumC5767OD A6p() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5768OE
    public final EnumC5767OD A6q() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5768OE
    public final void AAw() {
        this.A01 = EnumC5767OD.A06;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5768OE
    public final void AJM(EnumC5767OD enumC5767OD) {
        this.A01 = enumC5767OD;
        this.A02 = enumC5767OD;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5768OE
    public final void AJR(AdError adError) {
        this.A01 = EnumC5767OD.A04;
        this.A02 = EnumC5767OD.A04;
        this.A00 = adError;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5768OE
    public final void AJW() {
        if (this.A01 != EnumC5767OD.A06) {
            A02(this.A01, EnumC5767OD.A05);
        }
        EnumC5767OD enumC5767OD = EnumC5767OD.A05;
        String[] strArr = A06;
        if (strArr[4].charAt(13) == strArr[7].charAt(13)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[6] = "0CQ8O9HdNp0eBnIGd0pIqA2Cb";
        strArr2[2] = "A9QPt";
        this.A01 = enumC5767OD;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5768OE
    public final void AJm() {
        if (this.A02 != EnumC5767OD.A07) {
            A02(this.A01, EnumC5767OD.A08);
        }
        this.A02 = EnumC5767OD.A08;
    }
}
