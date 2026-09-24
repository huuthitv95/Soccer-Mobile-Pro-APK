package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;
import org.json.JSONException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sl */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6044Sl implements InterfaceC6854fw {
    public static byte[] A03;
    public static String[] A04 = {"vUQacvUb1jgaOB1nXCILUaEr4ItZ5QEs", "N", "ozPzI", "iemFS7qx3ItQSdDQeBrvuJ9y9CMkfIqY", "EwROMxnfRd6F7268i4EpvPtVg3hQf", "a", "qVu8", "3RxrE6NsEsLt8TXu"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ C6252WA A01;
    public final /* synthetic */ C6255WD A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 120);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{85, 81, 3, 85, 87, 7, 80, 3, 60, 111, 51, 63, 51, 63, 107, 60, 44, 53, 41, 40, 35, Ascii.f22498RS, 5, 3, Ascii.SYN, Ascii.DC2, Ascii.f22499SI, 9, 8, 92, 70, 78, 120, 111, 107, 120, 111, Base64.padSymbol, 120, 111, 111, 114, 111, Base64.padSymbol, 114, 126, 126, 104, 111, 111, 120, 121, 124, 74, 93, 89, 74, 93, Ascii.f22499SI, 93, 74, 95, 67, 70, 74, 75, Ascii.f22499SI, 92, 90, 76, 76, 74, 92, 92, 73, 90, 67, 67, 86, 63, 62, 19, 63, Base64.padSymbol, 32, 60, 53, 36, 53, Ascii.DLE, 17, 58, Ascii.f22490CR, Ascii.f22490CR, Ascii.DLE, Ascii.f22490CR};
    }

    static {
        A01();
    }

    public C6044Sl(C6255WD c6255wd, C6252WA c6252wa, long j) {
        this.A02 = c6255wd;
        this.A01 = c6252wa;
        this.A00 = j;
    }

    private final void A02(C6866g8 c6866g8) {
        AbstractC6251W9.A06(this.A01);
        try {
            InterfaceC6852fu response = c6866g8.A00();
            if (response != null) {
                String strA73 = response.A73();
                C6258WG serverResponse = this.A02.A06.A07(this.A02.A05, strA73, this.A00);
                if (serverResponse.A01() == EnumC6257WF.A03) {
                    C5940R4 c5940r4 = (C5940R4) serverResponse;
                    String strA04 = c5940r4.A04();
                    AdErrorType adErrorTypeAdErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c5940r4.A03(), AdErrorType.ERROR_MESSAGE);
                    if (strA04 != null) {
                        strA73 = strA04;
                    }
                    this.A02.A05.A0F().A3W(C6364Y1.A01(this.A02.A01), adErrorTypeAdErrorTypeFromCode.getErrorCode(), strA73, adErrorTypeAdErrorTypeFromCode.isPublicError());
                    this.A02.A0E(C6229Vm.A01(adErrorTypeAdErrorTypeFromCode, strA73));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String message = c6866g8.getMessage();
            InterfaceC5624Lt interfaceC5624LtA0F = this.A02.A05.A0F();
            long jA01 = C6364Y1.A01(this.A02.A01);
            int errorCode = adErrorType.getErrorCode();
            boolean zIsPublicError = adErrorType.isPublicError();
            if (A04[2].length() == 29) {
                throw new RuntimeException();
            }
            A04[4] = "NZ18w";
            interfaceC5624LtA0F.A3W(jA01, errorCode, message, zIsPublicError);
            this.A02.A0E(C6229Vm.A01(adErrorType, message));
        } catch (JSONException e) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String errorMessage = c6866g8.getMessage();
            this.A02.A05.A0F().A3W(C6364Y1.A01(this.A02.A01), adErrorType2.getErrorCode(), A00(16, 15, 30) + e.getMessage(), adErrorType2.isPublicError());
            this.A02.A0E(C6229Vm.A01(adErrorType2, errorMessage));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6854fw
    public final void ADR(InterfaceC6852fu interfaceC6852fu) {
        AbstractC6240Vy.A05(A00(79, 10, 40), A00(52, 27, 87), A00(8, 8, 114));
        if (interfaceC6852fu != null) {
            String strA73 = interfaceC6852fu.A73();
            int iA02 = C6171Up.A02(this.A02.A05);
            String[] strArr = A04;
            String str = strArr[5];
            String response = strArr[1];
            if (str.length() != response.length()) {
                throw new RuntimeException();
            }
            A04[2] = "kblvpkFa8oUK1ItVGqcsW93nH";
            if (iA02 > 0) {
                C6288Wl.A00(this.A02.A05).A0C(strA73);
            }
            AbstractC6251W9.A06(this.A01);
            this.A02.A0O(strA73, this.A00, this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6854fw
    public final void ADq(Exception exc) {
        AbstractC6240Vy.A05(A00(89, 7, 7), A00(31, 21, 101), A00(0, 8, 30));
        if (C6866g8.class.equals(exc.getClass())) {
            A02((C6866g8) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = exc.getMessage();
        this.A02.A05.A0F().A3W(C6364Y1.A01(this.A02.A01), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A02.A0E(C6229Vm.A01(adErrorType, errorMessage));
    }
}
