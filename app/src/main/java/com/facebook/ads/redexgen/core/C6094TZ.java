package com.facebook.ads.redexgen.core;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.TZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6094TZ extends AbstractRunnableC6279Wc {
    public static byte[] A02;
    public static String[] A03 = {"rr4pEtDer0K6hYSMypGI4SVA4", "qv2m0fG", "2OIR1Yv9Y7RzsB5MK8fjyIRTaeFBsJy", "02JyCSWW55zn1AQ6h7F4FoBumR9MK", "PV14KCf6Ep37wllo1HHxqudNmgtveNCD", "8xcTKK5W7UNHePnVaLckl2F", "lGpL0wggi73mqN0I3cVtORcNpouSV80j", "84RqxglWV7M6OmuSAB1gnMVf4"};
    public final /* synthetic */ C6252WA A00;
    public final /* synthetic */ C6255WD A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{121, 115, 97, 124, 127, 112, 112, 123, 108, 97, 117, 123, 103, Ascii.DC2, 51, 124, 50, 57, 40, 43, 51, 46, 55, 124, 63, 51, 50, 50, 57, 63, 40, 53, 51, 50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        this.A01.A00 = System.currentTimeMillis();
        if (AbstractC6362Xz.A00(this.A01.A05) == EnumC6361Xy.A07) {
            this.A01.A0A();
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String strA00 = A00(13, 21, 62);
            this.A01.A05.A0F().A3W(C6364Y1.A01(this.A01.A01), adErrorType.getErrorCode(), strA00, adErrorType.isPublicError());
            this.A01.A0E(new C6229Vm(adErrorType, strA00));
            return;
        }
        C6108Tn.A08(this.A01.A05);
        AbstractC6033SZ.A07(this.A01.A05);
        boolean z = true;
        Map<String, String> mapA0A = this.A00.A0A(C6136UG.A00().A01(this.A01.A05, true).A7y(this.A00.A05()));
        this.A01.A03 = mapA0A;
        try {
            PackageManager packageManager = this.A01.A05.getPackageManager();
            if (packageManager != null) {
                mapA0A.put(A00(1, 12, 92), new String(Base64.encode((this.A01.A05.getPackageName() + A00(0, 1, 59) + packageManager.getInstallerPackageName(this.A01.A05.getPackageName())).getBytes(), 2)));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.A00.A07() != EnumC6232Vq.A04 && this.A00.A07() != EnumC6232Vq.A06 && this.A00.A07() != EnumC6232Vq.A05 && this.A00.A07() != null) {
                z = false;
            }
            C6871gD.A02(z, this.A01.A05).AGy(this.A01.A07, new C6867g9().A05(this.A01.A03).A08(), this.A01.A03(C6364Y1.A00(), this.A00));
        } catch (Exception e) {
            AdErrorType adErrorType2 = AdErrorType.AD_REQUEST_FAILED;
            String message = e.getMessage();
            this.A01.A05.A0F().A3W(C6364Y1.A01(this.A01.A01), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            C6255WD c6255wd = this.A01;
            C6229Vm c6229VmA01 = C6229Vm.A01(adErrorType2, message);
            if (A03[3].length() != 29) {
                throw new RuntimeException();
            }
            A03[3] = "TysUXKeFt8WChM0CalDFmuBH7ELd8";
            c6255wd.A0E(c6229VmA01);
        }
    }

    static {
        A01();
    }

    public C6094TZ(C6255WD c6255wd, C6252WA c6252wa) {
        this.A01 = c6255wd;
        this.A00 = c6252wa;
    }
}
