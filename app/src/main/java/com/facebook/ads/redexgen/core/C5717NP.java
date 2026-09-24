package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.NP */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5717NP implements InterfaceC6751eG {
    public static byte[] A01;
    public static String[] A02 = {"BHXiYjXxfgjD7yDB", "kPfw5HKETqo8dV", "SlBKzsC69frNfTspgJs5v90302jxH173", "0t7u2eeKUCj5gcxeWZIOCTpidMAeGJtt", "hTXrvsDVbOi3Q9xrUBZOJj7T", "iLbLRTjnBQIJ87KFXaIFUijyWt7EPIGc", "0utayShxEdwMeaV3UZeoWviAuyaBWRmj", "gyVOCm6F1v6TZALkbG"};
    public final /* synthetic */ C5716NO A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.f22491EM, Ascii.ETB, 9, Ascii.SYN, 7, Ascii.DLE, Ascii.f22490CR, 7, Ascii.f22499SI};
    }

    static {
        A01();
    }

    public C5717NP(C5716NO c5716no) {
        this.A00 = c5716no;
    }

    public /* synthetic */ C5717NP(C5716NO c5716no, C5785OV c5785ov) {
        this(c5716no);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6751eG
    public final void ADX() {
        this.A00.A0W(true, A00(0, 9, 106));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6751eG
    public final void AEA() {
        if (!this.A00.A0f) {
            if (!TextUtils.isEmpty(this.A00.A0O.A2E())) {
                this.A00.A0S.ABJ(this.A00.A0O.A2E(), new C6558b9().A03(this.A00.A0B.getViewabilityChecker()).A02(this.A00.A0B.getTouchDataRecorder()).A05());
                C6288Wl.A00(this.A00.A0R).A0E(this.A00.A0X.A8l(), this.A00.A0O.A2E());
                C5734Ng.A07(this.A00.A0O.A2A(), this.A00.A0R);
                AbstractC5790Oa.A02(this.A00.A0O.A0y(), AbstractC6349Xm.A00(this.A00.A0O.A10()));
                this.A00.A0R.A0F().A3L();
                if (this.A00.A0P.A0c()) {
                    this.A00.A0R.A0F().AES();
                }
            }
            C5716NO c5716no = this.A00;
            String[] strArr = A02;
            if (strArr[5].charAt(12) == strArr[2].charAt(12)) {
                throw new RuntimeException();
            }
            A02[4] = "GzK3XL6hk7idJD";
            c5716no.A0W.A4j(this.A00.A0X.A8G());
            return;
        }
        this.A00.A0R.A0F().AET();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6751eG
    public final void AEh() {
        this.A00.A0W.A4j(this.A00.A0X.A81());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6751eG
    public final void AFQ() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6751eG
    public final void AGg() {
        this.A00.A0W.ADJ(15);
    }
}
