package com.facebook.ads.redexgen.core;

import android.content.Intent;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ro */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5986Ro {
    public static byte[] A07;
    public static String[] A08 = {"WrVVpIlV0mVOOesXyJjac9RJgGDEsYiy", "55KqVxwk4ItPenJ0PbzoYHpl7VLiDDoF", "", "85Uc86a0UVsoWW8LIwye7frNycSrKuPv", "TRaam", "0wWSnm1p2XMm3vcxH", "", "BPzoua9RAnM56oYN7Gpf0cmvKga9OU"};
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final AudienceNetworkActivity A04;
    public final AudienceNetworkActivityApi A05;
    public final C6902gi A06;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 82);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-78, -19, -7, -9, -72, -16, -21, -19, -17, -20, -7, -7, -11, -72, -21, -18, -3, -72, -21, -18, -4, -17, -6, -7, -4, -2, -13, -8, -15, -72, -48, -45, -40, -45, -35, -46, -23, -53, -50, -23, -36, -49, -38, -39, -36, -34, -45, -40, -47, -23, -48, -42, -39, -31, Ascii.f22493FS, 40, 38, -25, Ascii.f22502US, Ascii.SUB, Ascii.f22493FS, Ascii.f22498RS, Ascii.ESC, 40, 40, 36, -25, Ascii.SUB, Ascii.f22494GS, 44, -25, 34, 39, 45, Ascii.f22498RS, 43, 44, 45, 34, 45, 34, Ascii.SUB, 37, -25, Ascii.SUB, Ascii.f22493FS, 45, 34, 47, 34, 45, 50, Ascii.CAN, Ascii.f22494GS, Ascii.f22498RS, 44, 45, 43, 40, 50, Ascii.f22498RS, Ascii.f22494GS, Ascii.DLE, Ascii.f22493FS, Ascii.SUB, -37, 19, Ascii.f22500SO, Ascii.DLE, Ascii.DC2, Ascii.f22499SI, Ascii.f22493FS, Ascii.f22493FS, Ascii.CAN, -37, Ascii.f22500SO, 17, 32, -37, Ascii.SYN, Ascii.ESC, 33, Ascii.DC2, Ascii.f22502US, 32, 33, Ascii.SYN, 33, Ascii.SYN, Ascii.f22500SO, Ascii.f22491EM, -37, 17, Ascii.SYN, 32, Ascii.SUB, Ascii.SYN, 32, 32, Ascii.DC2, 17, 46, 58, 56, -7, 49, 44, 46, 48, 45, 58, 58, 54, -7, 44, 47, 62, -7, 52, 57, 63, 48, Base64.padSymbol, 62, 63, 52, 63, 52, 44, 55, -7, 48, Base64.padSymbol, Base64.padSymbol, 58, Base64.padSymbol, -39, -27, -29, -92, -36, -41, -39, -37, -40, -27, -27, -31, -92, -41, -38, -23, -92, -33, -28, -22, -37, -24, -23, -22, -33, -22, -33, -41, -30, -92, -36, -33, -28, -33, -23, -34, -43, -41, -39, -22, -33, -20, -33, -22, -17, -4, 8, 6, -57, -1, -6, -4, -2, -5, 8, 8, 4, -57, -6, -3, Ascii.f22492FF, -57, 2, 7, Ascii.f22490CR, -2, Ascii.f22503VT, Ascii.f22492FF, Ascii.f22490CR, 2, Ascii.f22490CR, 2, -6, 5, -57, 2, 6, 9, Ascii.f22503VT, -2, Ascii.f22492FF, Ascii.f22492FF, 2, 8, 7, -57, 5, 8, 0, 0, -2, -3, Ascii.f22500SO, Ascii.f22502US, Ascii.f22500SO, Ascii.ETB, Ascii.f22494GS};
    }

    static {
        A01();
    }

    public C5986Ro(AudienceNetworkActivityApi audienceNetworkActivityApi, C6902gi c6902gi, AudienceNetworkActivity audienceNetworkActivity) {
        this.A05 = audienceNetworkActivityApi;
        this.A06 = c6902gi;
        this.A04 = audienceNetworkActivity;
    }

    private final void A02(boolean z) {
        this.A03 = z;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[RETURN, SYNTHETIC] */
    private final boolean A03(EnumC6262WK enumC6262WK) {
        if (enumC6262WK != EnumC6262WK.A0I && enumC6262WK != EnumC6262WK.A0H) {
            EnumC6262WK enumC6262WK2 = EnumC6262WK.A08;
            String[] strArr = A08;
            if (strArr[3].charAt(18) == strArr[0].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[4] = "QK9lt";
            strArr2[5] = "71ldustRCfnIbk6ZF";
            if (enumC6262WK != enumC6262WK2 && enumC6262WK != EnumC6262WK.A05 && enumC6262WK != EnumC6262WK.A0G) {
                EnumC6262WK enumC6262WK3 = EnumC6262WK.A0J;
                String[] strArr3 = A08;
                if (strArr3[6].length() != strArr3[2].length()) {
                    String[] strArr4 = A08;
                    strArr4[4] = "n7dEG";
                    strArr4[5] = "EMW1RUsZodH5Xcp8C";
                    if (enumC6262WK != enumC6262WK3) {
                        return false;
                    }
                } else {
                    String[] strArr5 = A08;
                    strArr5[6] = "";
                    strArr5[2] = "";
                    if (enumC6262WK != enumC6262WK3) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final void A04(EnumC6262WK enumC6262WK, String str) {
        boolean z = !this.A03 || C6171Up.A23(this.A06);
        boolean shouldCallOnDestroy = this.A02;
        if (!shouldCallOnDestroy && z) {
            boolean shouldCallOnDestroy2 = A03(enumC6262WK);
            if (shouldCallOnDestroy2) {
                A09(EnumC6795ez.A03.A03(), str);
            } else {
                A09(A00(54, 48, 103), str);
            }
            this.A02 = true;
        }
    }

    public final void A05(EnumC6262WK enumC6262WK, String str) {
        if (A03(enumC6262WK)) {
            A09(EnumC6795ez.A09.A03(), str);
        } else {
            A09(A00(ModuleDescriptor.MODULE_VERSION, 35, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), str);
        }
    }

    public final void A06(EnumC6262WK enumC6262WK, String str) {
        if (A03(enumC6262WK)) {
            A09(EnumC6795ez.A05.A03(), str);
        } else {
            A09(A00(102, 39, 91), str);
        }
        A02(true);
        A04(enumC6262WK, str);
    }

    public final void A07(EnumC6262WK enumC6262WK, String str) {
        if (C6171Up.A1x(this.A06) && !this.A01 && !this.A00) {
            InterfaceC5624Lt interfaceC5624LtA0F = this.A06.A0F();
            String[] strArr = A08;
            if (strArr[3].charAt(18) == strArr[0].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "ERQ6CJuvlb3tCwq1OYCzpUpdhNPz9IsE";
            strArr2[0] = "fdli8mgwNbZyMwMFsZ54k8DyiigEG2Sx";
            interfaceC5624LtA0F.ACd();
            A05(enumC6262WK, str);
        }
    }

    public final void A08(String str, C6141UL c6141ul, String str2) {
        Intent intent = new Intent(str + A00(0, 1, 38) + str2);
        if (c6141ul != null) {
            intent.putExtra(A00(268, 5, 87), c6141ul);
        }
        C5818P2.A00(this.A04).A07(intent);
    }

    public final void A09(String str, String str2) {
        if (A00(Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 47, 71).equals(str) || EnumC6795ez.A0A.A03().equals(str)) {
            this.A01 = true;
        }
        boolean zEquals = A00(ModuleDescriptor.MODULE_VERSION, 35, Sdk.SDKError.Reason.TPAT_ERROR_VALUE).equals(str);
        if (A08[7].length() == 29) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "q8Yu3i76ZTlYqxP4qtQeXX4gnui9AJbb";
        strArr[0] = "UYbwc2QJiguNdyXAgiRTefqPyIZvniQg";
        if (zEquals || EnumC6795ez.A09.A03().equals(str)) {
            this.A00 = true;
        }
        if (A00(1, 53, 56).equals(str)) {
            this.A05.finish(9);
        } else if (A00(176, 45, 36).equals(str)) {
            this.A05.finish(10);
        } else {
            A08(str, null, str2);
        }
    }
}
