package com.facebook.ads.redexgen.core;

import android.media.MediaFormat;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7383oq implements InterfaceC5262G2, InterfaceC5287GR, InterfaceC47617c {
    public static byte[] A04;
    public static String[] A05 = {"s2pX1dUuV9yMGkOQMpNHWy9uhNawnk9Y", "g94kU4b", "NzGTwCFJguijRpsE4vnu2khyHl2vzHxI", "mcwg2", "3H7kdFWigyqN00XNlLPoaD6s2Om", "arwBjFb", "zwCIEju4cqvLZ8D4reT2LOc82uEYQHt6", "4voNbHG588W1rePZ0VIdJriIAfqG9T"};
    public InterfaceC5262G2 A00;
    public InterfaceC5262G2 A01;
    public InterfaceC5287GR A02;
    public InterfaceC5287GR A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{2, 0, 17, 51, Ascii.f22492FF, 1, 0, 10, 35, Ascii.ETB, 4, 8, 0, 40, 0, 17, 4, 1, 4, 17, 4, 41, Ascii.f22492FF, Ascii.SYN, 17, 0, Ascii.f22503VT, 0, Ascii.ETB};
    }

    static {
        A01();
    }

    public C7383oq() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC47617c
    public final void A9i(int i, Object obj) {
        switch (i) {
            case 7:
                this.A01 = (InterfaceC5262G2) obj;
                return;
            case 8:
                this.A02 = (InterfaceC5287GR) obj;
                return;
            case 10000:
                if (0 == 0) {
                    this.A00 = null;
                    this.A03 = null;
                    return;
                }
                throw new NullPointerException(A00(0, 29, 100));
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5262G2
    public final void AGS(long j, long j2, C7472qI c7472qI, MediaFormat mediaFormat) {
        if (this.A00 != null) {
            InterfaceC5262G2 interfaceC5262G2 = this.A00;
            if (A05[0].charAt(20) != 'W') {
                throw new RuntimeException();
            }
            A05[4] = "rCzQpO90p93bI0FQ7tWj9IORt31";
            interfaceC5262G2.AGS(j, j2, c7472qI, mediaFormat);
        }
        if (this.A01 != null) {
            this.A01.AGS(j, j2, c7472qI, mediaFormat);
        }
    }
}
