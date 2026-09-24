package com.facebook.ads.redexgen.core;

import android.media.MediaCodec;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.BA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4963BA extends Exception {
    public static byte[] A05;
    public final C4956B3 A00;
    public final C4963BA A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    static {
        A05();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{0, Ascii.f22492FF, 49, Ascii.DLE, Ascii.SYN, Ascii.SUB, 17, Ascii.DLE, 7, 85, Ascii.f22493FS, Ascii.ESC, Ascii.f22493FS, 1, 85, 19, Ascii.DC4, Ascii.f22493FS, Ascii.f22491EM, Ascii.DLE, 17, 79, 85, 101, 68, 66, 78, 69, 68, 83, 1, 72, 79, 72, 85, 1, 71, SignedBytes.MAX_POWER_OF_TWO, 72, 77, 68, 69, Ascii.ESC, 1, 122, 63, 78, 66, Ascii.f22494GS, 17, 19, 80, Ascii.CAN, Ascii.f22502US, Ascii.f22494GS, Ascii.ESC, Ascii.f22493FS, 17, 17, Ascii.NAK, 80, Ascii.f22502US, Ascii.SUB, Ascii.f22490CR, 80, Ascii.f22502US, Ascii.DLE, Ascii.SUB, Ascii.f22492FF, 17, Ascii.ETB, Ascii.SUB, 6, 80, 19, Ascii.ESC, Ascii.SUB, Ascii.ETB, Ascii.f22502US, 77, 80, Ascii.ESC, 6, 17, Ascii.f22500SO, Ascii.DC2, Ascii.f22502US, 7, Ascii.ESC, Ascii.f22492FF, 80, 19, Ascii.ESC, Ascii.SUB, Ascii.ETB, Ascii.f22502US, Ascii.f22494GS, 17, Ascii.SUB, Ascii.ESC, Ascii.f22494GS, 80, 51, Ascii.ESC, Ascii.SUB, Ascii.ETB, Ascii.f22502US, Base64.padSymbol, 17, Ascii.SUB, Ascii.ESC, Ascii.f22494GS, 44, Ascii.ESC, Ascii.DLE, Ascii.SUB, Ascii.ESC, Ascii.f22492FF, Ascii.ESC, Ascii.f22492FF, 33, 36, 47, 45, Ascii.NAK};
    }

    public C4963BA(C7472qI c7472qI, Throwable th, boolean z, int i) {
        this(A03(23, 22, 80) + i + A03(45, 3, 19) + c7472qI, th, c7472qI.A0W, z, null, A02(i), null);
    }

    public C4963BA(C7472qI c7472qI, Throwable th, boolean z, C4956B3 c4956b3) {
        this(A03(2, 21, 4) + c4956b3.A03 + A03(0, 2, 93) + c7472qI, th, c7472qI.A0W, z, c4956b3, AbstractC46115C.A02 >= 21 ? A04(th) : null, null);
    }

    public C4963BA(String str, Throwable th, String str2, boolean z, C4956B3 c4956b3, String str3, C4963BA c4963ba) {
        super(str, th);
        this.A03 = str2;
        this.A04 = z;
        this.A00 = c4956b3;
        this.A02 = str3;
        this.A01 = c4963ba;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C4963BA A00(C4963BA c4963ba) {
        return new C4963BA(getMessage(), getCause(), this.A03, this.A04, this.A00, this.A02, c4963ba);
    }

    public static String A02(int i) {
        String strA03 = i < 0 ? A03(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 4, 59) : A03(0, 0, 98);
        StringBuilder sb = new StringBuilder();
        String sign = A03(48, 73, 15);
        return sb.append(sign).append(strA03).append(Math.abs(i)).toString();
    }

    public static String A04(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
