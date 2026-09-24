package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lP */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7184lP implements InterfaceC5583LE {
    public static byte[] A02;
    public static String[] A03 = {"H5L2tIFZt", "7T8ctTOgfri2uFWYkrl4fLjFw3zYZmyw", "rpSuNqLmPSNrp8BaktpsZc4frut4njZi", "OS1ujTmztQNXT6hqD6nsoX0kfRSYmmsY", "PkY6KfFeVbpCvwlFdEj", "TmaVkoyYGnCbszGh0vcMc", "p0AihzwiszaEN", "o1l4pHohEGjnpBhSGl6NtukXiQnI0CCo"};
    public final int A00;
    public final List<C7472qI> A01;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 72);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private List<C7472qI> A03(C5582LD c5582ld) {
        String strA02;
        int i;
        if (A05(32)) {
            return this.A01;
        }
        C45944v c45944v = new C45944v(c5582ld.A03);
        List<C7472qI> arrayList = this.A01;
        while (c45944v.A07() > 0) {
            int iA0I = c45944v.A0I();
            int iA09 = c45944v.A09() + c45944v.A0I();
            if (iA0I == 134) {
                arrayList = new ArrayList<>();
                int iA0I2 = c45944v.A0I() & 31;
                for (int i2 = 0; i2 < iA0I2; i2++) {
                    String strA0W = c45944v.A0W(3);
                    int iA0I3 = c45944v.A0I();
                    boolean z = (iA0I3 & 128) != 0;
                    if (z) {
                        strA02 = A02(19, 19, 47);
                        i = iA0I3 & 63;
                    } else {
                        strA02 = A02(0, 19, 57);
                        i = 1;
                    }
                    byte bA0I = (byte) c45944v.A0I();
                    c45944v.A0g(1);
                    List<byte[]> listA04 = null;
                    if (z) {
                        boolean z2 = (bA0I & SignedBytes.MAX_POWER_OF_TWO) != 0;
                        if (A03[5].length() != 21) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[6] = "Fx9tcNCtSciYr";
                        strArr[4] = "fWuzF8xs7o61BMX22RC";
                        listA04 = AbstractC454346.A04(z2);
                    }
                    arrayList.add(new C44672p().A11(strA02).A10(strA0W).A0Z(i).A12(listA04).A14());
                }
            }
            c45944v.A0f(iA09);
        }
        return arrayList;
    }

    public static void A04() {
        A02 = new byte[]{-30, -15, -15, -19, -22, -28, -30, -11, -22, -16, -17, -80, -28, -26, -30, -82, -73, -79, -71, -40, -25, -25, -29, -32, -38, -40, -21, -32, -26, -27, -90, -38, -36, -40, -92, -82, -89, -81, Ascii.f22492FF, Ascii.ESC, Ascii.ESC, Ascii.ETB, Ascii.DC4, Ascii.f22500SO, Ascii.f22492FF, Ascii.f22502US, Ascii.DC4, Ascii.SUB, Ascii.f22491EM, -38, 33, Ascii.f22491EM, Ascii.f22499SI, -39, Ascii.f22499SI, 33, Ascii.f22490CR, -39, Ascii.f22492FF, Ascii.DC4, Ascii.f22502US, -61, -46, -46, -50, -53, -59, -61, -42, -53, -47, -48, -111, -38, -113, -43, -59, -42, -57, -107, -105};
    }

    static {
        A04();
    }

    public C7184lP() {
        this(0);
    }

    @MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    public C7184lP(int i) {
        this(i, MetaExoPlayerCustomizedCollections.A03(new C7472qI[0]));
    }

    public C7184lP(int i, List<C7472qI> list) {
        this.A00 = i;
        this.A01 = list;
    }

    private C5578L9 A00(C5582LD c5582ld) {
        return new C5578L9(A03(c5582ld));
    }

    private C5588LJ A01(C5582LD c5582ld) {
        return new C5588LJ(A03(c5582ld));
    }

    private boolean A05(int i) {
        return (this.A00 & i) != 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5583LE
    public final SparseArray<InterfaceC5586LH> A5Q() {
        return new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5583LE
    public final InterfaceC5586LH A5V(int i, C5582LD c5582ld) {
        switch (i) {
            case 2:
            case 128:
                return new C7173lE(new C7181lM(A01(c5582ld)));
            case 3:
            case 4:
                return new C7173lE(new C7175lG(c5582ld.A01));
            case 15:
                if (A05(2)) {
                    return null;
                }
                return new C7173lE(new C7185lQ(false, c5582ld.A01));
            case 16:
                return new C7173lE(new C7180lL(A01(c5582ld)));
            case 17:
                if (A05(2)) {
                    return null;
                }
                return new C7173lE(new C7176lH(c5582ld.A01));
            case 21:
                return new C7173lE(new C7177lI());
            case 27:
                if (A05(4)) {
                    return null;
                }
                return new C7173lE(new C7179lK(A00(c5582ld), A05(1), A05(8)));
            case 36:
                return new C7173lE(new C7178lJ(A00(c5582ld)));
            case 89:
                return new C7173lE(new C7182lN(c5582ld.A02));
            case 129:
            case 135:
                return new C7173lE(new C7191lW(c5582ld.A01));
            case 130:
                if (!A05(64)) {
                    return null;
                }
                break;
            case 134:
                if (A05(16)) {
                    return null;
                }
                return new C7168l9(new C7174lF(A02(61, 20, 26)));
            case 138:
                break;
            case 172:
                return new C7173lE(new C7188lT(c5582ld.A01));
            case 257:
                return new C7168l9(new C7174lF(A02(38, 23, 99)));
            default:
                return null;
        }
        return new C7173lE(new C7183lO(c5582ld.A01));
    }
}
