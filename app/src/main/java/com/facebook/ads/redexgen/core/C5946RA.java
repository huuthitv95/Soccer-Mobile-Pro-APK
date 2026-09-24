package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.RA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5946RA {
    public static byte[] A09;
    public static String[] A0A = {"", "d6jyZ4YF4aAx6mY2oyMV8cMH3x1tTmGX", "6ShmsSFKDmdiSeaEbVJI0pMmhv", "Jy6CLSdjiTJVmxisrmhO9od6ZqYVQGpz", "aKDRqPZxmSwbRmY5O7VQCqOvGq0yRVmO", "vr6xx06LqTBYtEPA9ZzozSqPDwzkbNaY", "Y84hViIy7qYskGYmJ3QVEouknT", ""};
    public C5945R9 A01;
    public AbstractC5954RI A04;
    public final /* synthetic */ C47457M A08;
    public final ArrayList<AbstractC5956RK> A05 = new ArrayList<>();
    public ArrayList<AbstractC5956RK> A02 = null;
    public final ArrayList<AbstractC5956RK> A06 = new ArrayList<>();
    public final List<AbstractC5956RK> A07 = Collections.unmodifiableList(this.A05);
    public int A03 = 2;
    public int A00 = 2;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A09 = new byte[]{113, 56, 34, Ascii.DLE, 37, 37, 48, 50, 57, 52, 53, 107, 56, 86, 17, Ascii.CAN, Ascii.CAN, Ascii.f22490CR, Ascii.ESC, 10, 68, 32, 39, 41, SignedBytes.MAX_POWER_OF_TWO, 125, 108, 100, 41, 106, 102, 124, 103, 125, 51, 79, 72, Ascii.NAK, Ascii.DC2, 7, Ascii.DC2, 3, 92, 121, 91, 86, 86, 95, 94, Ascii.SUB, 73, 89, 72, 91, 74, Ascii.SUB, 76, 83, 95, 77, Ascii.SUB, 77, 83, 78, 82, Ascii.SUB, 91, 84, Ascii.SUB, 83, 84, 76, 91, 86, 83, 94, Ascii.SUB, 76, 83, 95, 77, Ascii.DC4, Ascii.SUB, 115, 84, 76, 91, 86, 83, 94, Ascii.SUB, 76, 83, 95, 77, 73, Ascii.SUB, 89, 91, 84, 84, 85, 78, Ascii.SUB, 88, 95, Ascii.SUB, 72, 95, 79, 73, 95, 94, Ascii.SUB, 92, 72, 85, 87, Ascii.SUB, 73, 89, 72, 91, 74, Ascii.SYN, Ascii.SUB, 78, 82, 95, 67, Ascii.SUB, 73, 82, 85, 79, 86, 94, Ascii.SUB, 72, 95, 88, 85, 79, 84, 94, Ascii.SUB, 92, 72, 85, 87, Ascii.SUB, 72, 95, 89, 67, 89, 86, 95, 72, Ascii.SUB, 74, 85, 85, 86, Ascii.DC4, 116, 83, 94, 82, 83, 78, 84, 78, 73, 88, 83, 94, 68, Ascii.f22494GS, 89, 88, 73, 88, 94, 73, 88, 89, 19, Ascii.f22494GS, 116, 83, 75, 92, 81, 84, 89, Ascii.f22494GS, 84, 73, 88, 80, Ascii.f22494GS, 77, 82, 78, 84, 73, 84, 82, 83, Ascii.f22494GS, Ascii.f22502US, 56, 53, 57, 56, 37, 63, 37, 34, 51, 56, 53, 47, 118, 50, 51, 34, 51, 53, 34, 51, 50, 120, 118, Ascii.f22502US, 56, 32, 55, 58, 63, 50, 118, 32, 63, 51, 33, 118, 62, 57, 58, 50, 51, 36, 118, 55, 50, 55, 38, 34, 51, 36, 118, 38, 57, 37, 63, 34, 63, 57, 56, 89, 126, 102, 113, 124, 121, 116, 48, 121, 100, 117, 125, 48, 96, 127, 99, 121, 100, 121, 127, 126, 48, Ascii.DC2, 34, 51, 32, 49, 49, 36, 37, 97, 46, 51, 97, 32, 53, 53, 32, 34, 41, 36, 37, 97, 55, 40, 36, 54, 50, 97, 44, 32, 56, 97, 47, 46, 53, 97, 35, 36, 97, 51, 36, 34, 56, 34, 45, 36, 37, 111, 97, 40, 50, Ascii.DC2, 34, 51, 32, 49, 123, 108, 85, 72, Ascii.CAN, 92, 93, 76, 89, 91, 80, 93, 92, Ascii.CAN, 78, 81, 93, 79, Ascii.CAN, 75, 80, 87, 77, 84, 92, Ascii.CAN, 90, 93, Ascii.CAN, 74, 93, 85, 87, 78, 93, 92, Ascii.CAN, 94, 74, 87, 85, Ascii.CAN, 106, 93, 91, 65, 91, 84, 93, 74, 110, 81, 93, 79, Ascii.CAN, 90, 93, 94, 87, 74, 93, Ascii.CAN, 81, 76, Ascii.CAN, 91, 89, 86, Ascii.CAN, 90, 93, Ascii.CAN, 74, 93, 91, 65, 91, 84, 93, 92, 2, Ascii.CAN, 87, 113, 122, 106, 109, 100, 35, 119, 108, 35, 113, 102, 96, 122, 96, 111, 102, 35, 98, 109, 35, 106, 100, 109, 108, 113, 102, 103, 35, 117, 106, 102, 116, 35, 107, 108, 111, 103, 102, 113, 45, 35, 90, 108, 118, 35, 112, 107, 108, 118, 111, 103, 35, 101, 106, 113, 112, 119, 35, 96, 98, 111, 111, 35, 112, 119, 108, 115, 74, 100, 109, 108, 113, 106, 109, 100, 85, 106, 102, 116, 43, 117, 106, 102, 116, 42, 35, 97, 102, 101, 108, 113, 102, 35, 96, 98, 111, 111, 106, 109, 100, 35, 113, 102, 96, 122, 96, 111, 102, 45, 48, 50, 35, 1, 62, 50, 32, 17, 56, 37, 7, 56, 36, 62, 35, 62, 56, 57, Ascii.SYN, 57, 51, 3, 46, 39, 50, Ascii.f22494GS, Ascii.DLE, 8, Ascii.f22498RS, 4, 5, 81, Ascii.CAN, Ascii.f22502US, Ascii.NAK, Ascii.DC4, 9, 81, 2, Ascii.f22491EM, Ascii.f22498RS, 4, Ascii.f22494GS, Ascii.NAK, 81, Ascii.f22502US, Ascii.f22498RS, 5, 81, 19, Ascii.DC4, 81, 92, SignedBytes.MAX_POWER_OF_TWO, 81, Ascii.DLE, Ascii.ETB, 5, Ascii.DC4, 3, 81, 4, Ascii.f22502US, Ascii.f22491EM, Ascii.CAN, Ascii.NAK, Ascii.CAN, Ascii.f22502US, Ascii.SYN, 81, Ascii.DLE, 81, 7, Ascii.CAN, Ascii.DC4, 6, 75, 69, 68, 124, 67, 79, 93, 120, 79, 73, 83, 73, 70, 79, 78};
    }

    static {
        A05();
    }

    public C5946RA(C47457M c47457m) {
        this.A08 = c47457m;
    }

    private final View A00(int i, boolean z) {
        return A0I(i, z, Long.MAX_VALUE).A0H;
    }

    private final AbstractC5956RK A01(int i) {
        int size;
        int iA04;
        if (this.A02 == null || (size = this.A02.size()) == 0) {
            return null;
        }
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC5956RK abstractC5956RK = this.A02.get(i2);
            if (!abstractC5956RK.A0m()) {
                int i3 = abstractC5956RK.A0O();
                if (i3 == i) {
                    abstractC5956RK.A0Z(32);
                    return abstractC5956RK;
                }
            }
        }
        if (this.A08.A04.A0M() && (iA04 = this.A08.A00.A04(i)) > 0) {
            int offsetPosition = this.A08.A04.A0B();
            if (iA04 < offsetPosition) {
                long jA0D = this.A08.A04.A0D(iA04);
                for (int i4 = 0; i4 < size; i4++) {
                    AbstractC5956RK abstractC5956RK2 = this.A02.get(i4);
                    if (!abstractC5956RK2.A0m() && abstractC5956RK2.A0Q() == jA0D) {
                        abstractC5956RK2.A0Z(32);
                        return abstractC5956RK2;
                    }
                }
            }
        }
        return null;
    }

    private final AbstractC5956RK A02(int i, boolean z) {
        View viewA08;
        int size = this.A05.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC5956RK abstractC5956RK = this.A05.get(i2);
            if (!abstractC5956RK.A0m()) {
                int scrapCount = abstractC5956RK.A0O();
                if (scrapCount == i && !abstractC5956RK.A0f() && (this.A08.A0s.A09 || !abstractC5956RK.A0g())) {
                    abstractC5956RK.A0Z(32);
                    return abstractC5956RK;
                }
            }
        }
        if (!z && (viewA08 = this.A08.A01.A08(i)) != null) {
            AbstractC5956RK abstractC5956RKA0F = C47457M.A0F(viewA08);
            this.A08.A01.A0G(viewA08);
            int iA07 = this.A08.A01.A07(viewA08);
            if (iA07 != -1) {
                this.A08.A01.A0C(iA07);
                A0S(viewA08);
                abstractC5956RKA0F.A0Z(8224);
                return abstractC5956RKA0F;
            }
            throw new IllegalStateException(A04(565, 52, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) + abstractC5956RKA0F + this.A08.A1J());
        }
        int size2 = this.A06.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC5956RK holder = this.A06.get(i3);
            String[] strArr = A0A;
            String str = strArr[7];
            String str2 = strArr[0];
            int cacheSize = str.length();
            int scrapCount2 = str2.length();
            if (cacheSize != scrapCount2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "JIr6ryR6hWTh2WYmHdarh5TP4xAypylw";
            strArr2[1] = "npmC62BAQEqZygYceoAiNhkQGghR92x0";
            if (!holder.A0f()) {
                int scrapCount3 = holder.A0O();
                if (scrapCount3 == i) {
                    if (!z) {
                        this.A06.remove(i3);
                    }
                    return holder;
                }
            }
        }
        return null;
    }

    private final AbstractC5956RK A03(long j, int i, boolean z) {
        int count = this.A05.size();
        for (int i2 = count - 1; i2 >= 0; i2--) {
            AbstractC5956RK abstractC5956RK = this.A05.get(i2);
            if (abstractC5956RK.A0Q() == j && !abstractC5956RK.A0m()) {
                int count2 = abstractC5956RK.A0N();
                if (i == count2) {
                    abstractC5956RK.A0Z(32);
                    boolean zA0g = abstractC5956RK.A0g();
                    String[] strArr = A0A;
                    String str = strArr[2];
                    String str2 = strArr[6];
                    int i3 = str.length();
                    int count3 = str2.length();
                    if (i3 == count3) {
                        String[] strArr2 = A0A;
                        strArr2[4] = "3Wf6vMFZ4V6K3VYEAeXlgILB3Kqn8tmj";
                        strArr2[1] = "2gRFj7AUivxslEY3Do0gPT185jjA6g6i";
                        if (zA0g && !this.A08.A0s.A07()) {
                            abstractC5956RK.A0a(2, 14);
                        }
                        return abstractC5956RK;
                    }
                } else if (z) {
                    continue;
                } else {
                    this.A05.remove(i2);
                    C47457M c47457m = this.A08;
                    View view = abstractC5956RK.A0H;
                    String[] strArr3 = A0A;
                    String str3 = strArr3[7];
                    String str4 = strArr3[0];
                    int i4 = str3.length();
                    int count4 = str4.length();
                    if (i4 == count4) {
                        String[] strArr4 = A0A;
                        strArr4[5] = "QSy8SYzj9TGZXONlvrRd2Hl7xNggaX2t";
                        strArr4[3] = "FStY7c67BTbAcWAeNWEJdNOuKPlMCdqH";
                        c47457m.removeDetachedView(view, false);
                        A0R(abstractC5956RK.A0H);
                    }
                }
                throw new RuntimeException();
            }
        }
        int count5 = this.A06.size();
        for (int i5 = count5 - 1; i5 >= 0; i5--) {
            AbstractC5956RK abstractC5956RK2 = this.A06.get(i5);
            if (abstractC5956RK2.A0Q() == j) {
                int count6 = abstractC5956RK2.A0N();
                if (i == count6) {
                    if (!z) {
                        this.A06.remove(i5);
                    }
                    return abstractC5956RK2;
                }
                if (!z) {
                    A07(i5);
                    String[] strArr5 = A0A;
                    String str5 = strArr5[7];
                    String str6 = strArr5[0];
                    int cacheSize = str5.length();
                    int count7 = str6.length();
                    if (cacheSize != count7) {
                        throw new RuntimeException();
                    }
                    String[] strArr6 = A0A;
                    strArr6[2] = "Px4MCeB3tpw5Kws4bgsL6OQ2tD";
                    strArr6[6] = "cZzmTfGm3PDqBsfSjCaAnG9aB7";
                    return null;
                }
            }
        }
        return null;
    }

    private final void A06() {
        int count = this.A06.size();
        for (int count2 = count - 1; count2 >= 0; count2--) {
            A07(count2);
        }
        this.A06.clear();
        if (C47457M.A1E) {
            this.A08.A02.A02();
        }
    }

    private final void A07(int i) {
        A0Z(this.A06.get(i), true);
        this.A06.remove(i);
    }

    private void A08(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                A08((ViewGroup) childAt, true);
            }
        }
        if (!z) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
        } else {
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    private void A09(AbstractC5956RK abstractC5956RK) {
        if (this.A08.A1q()) {
            View view = abstractC5956RK.A0H;
            if (AbstractC5857Ph.A00(view) == 0) {
                AbstractC5857Ph.A09(view, 1);
            }
            if (AbstractC5857Ph.A0F(view)) {
                return;
            }
            String[] strArr = A0A;
            if (strArr[4].charAt(14) != strArr[1].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "r5izwM6EITTd8J0QgfTuliuK3Ylx6gnH";
            strArr2[3] = "CLm8SGIYJT8sX0J5oMrTiG0qZUHKeksn";
            abstractC5956RK.A0Z(16384);
            AbstractC5857Ph.A0B(view, this.A08.A09.A0A());
        }
    }

    private void A0A(AbstractC5956RK abstractC5956RK) {
        if (abstractC5956RK.A0H instanceof ViewGroup) {
            A08((ViewGroup) abstractC5956RK.A0H, false);
        }
    }

    private final void A0B(AbstractC5956RK abstractC5956RK) {
        if (0 != 0) {
            throw new NullPointerException(A04(IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, 14, 32));
        }
        if (this.A08.A0s != null) {
            this.A08.A0t.A0B(abstractC5956RK);
        }
    }

    private final boolean A0C(AbstractC5956RK abstractC5956RK) {
        if (abstractC5956RK.A0g()) {
            return this.A08.A0s.A07();
        }
        if (abstractC5956RK.A03 >= 0 && abstractC5956RK.A03 < this.A08.A04.A0B()) {
            if (!this.A08.A0s.A07()) {
                int iA0C = this.A08.A04.A0C(abstractC5956RK.A03);
                int type = abstractC5956RK.A0N();
                if (iA0C != type) {
                    return false;
                }
            }
            return !this.A08.A04.A0M() || abstractC5956RK.A0Q() == this.A08.A04.A0D(abstractC5956RK.A03);
        }
        throw new IndexOutOfBoundsException(A04(211, 60, 92) + abstractC5956RK + this.A08.A1J());
    }

    private boolean A0D(AbstractC5956RK abstractC5956RK, int i, int i2, long j) {
        abstractC5956RK.A08 = this.A08;
        int iA0N = abstractC5956RK.A0N();
        long nanoTime = this.A08.getNanoTime();
        if (j != Long.MAX_VALUE && !this.A01.A0A(iA0N, nanoTime, j)) {
            return false;
        }
        this.A08.A04.A0J(abstractC5956RK, i);
        this.A01.A05(abstractC5956RK.A0N(), this.A08.getNanoTime() - nanoTime);
        A09(abstractC5956RK);
        if (this.A08.A0s.A07()) {
            abstractC5956RK.A04 = i2;
            return true;
        }
        return true;
    }

    public final int A0E() {
        return this.A05.size();
    }

    public final View A0F(int i) {
        return this.A05.get(i).A0H;
    }

    public final View A0G(int i) {
        return A00(i, false);
    }

    public final C5945R9 A0H() {
        if (this.A01 == null) {
            this.A01 = new C5945R9();
        }
        return this.A01;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0261  */
    /* JADX WARN: Code duplicated, block: B:103:0x0264  */
    /* JADX WARN: Code duplicated, block: B:105:0x026a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0276  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:87:0x0204  */
    /* JADX WARN: Code duplicated, block: B:93:0x021a  */
    /* JADX WARN: Code duplicated, block: B:94:0x021c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0236  */
    /* JADX WARN: Code duplicated, block: B:98:0x0244  */
    /* JADX WARN: Code duplicated, block: B:99:0x0252  */
    public final AbstractC5956RK A0I(int i, boolean z, long j) {
        boolean zA0D;
        ViewGroup.LayoutParams layoutParams;
        boolean zCheckLayoutParams;
        String[] strArr;
        C5939R3 c5939r3;
        int iA04;
        C47457M c47457mA0H;
        if (i >= 0 && i < this.A08.A0s.A03()) {
            boolean z2 = false;
            AbstractC5956RK abstractC5956RKA0E = null;
            boolean fromScrapOrHiddenOrCache = this.A08.A0s.A07();
            if (fromScrapOrHiddenOrCache) {
                abstractC5956RKA0E = A01(i);
                z2 = abstractC5956RKA0E != null;
            }
            if (abstractC5956RKA0E == null && (abstractC5956RKA0E = A02(i, z)) != null) {
                boolean fromScrapOrHiddenOrCache2 = A0C(abstractC5956RKA0E);
                if (!fromScrapOrHiddenOrCache2) {
                    if (!z) {
                        String[] strArr2 = A0A;
                        if (strArr2[2].length() == strArr2[6].length()) {
                            String[] strArr3 = A0A;
                            strArr3[7] = "";
                            strArr3[0] = "";
                            abstractC5956RKA0E.A0Z(4);
                            boolean fromScrapOrHiddenOrCache3 = abstractC5956RKA0E.A0h();
                            if (fromScrapOrHiddenOrCache3) {
                                this.A08.removeDetachedView(abstractC5956RKA0E.A0H, false);
                                abstractC5956RKA0E.A0Y();
                            } else {
                                boolean fromScrapOrHiddenOrCache4 = abstractC5956RKA0E.A0m();
                                if (fromScrapOrHiddenOrCache4) {
                                    abstractC5956RKA0E.A0U();
                                }
                            }
                            A0X(abstractC5956RKA0E);
                        }
                    }
                    abstractC5956RKA0E = null;
                } else {
                    z2 = true;
                }
                if (abstractC5956RKA0E == null) {
                    iA04 = this.A08.A00.A04(i);
                    if (iA04 >= 0) {
                    }
                    throw new IndexOutOfBoundsException(A04(165, 46, 55) + i + A04(13, 8, 116) + iA04 + A04(35, 8, 108) + this.A08.A0s.A03() + this.A08.A1J());
                }
                if (z2) {
                    abstractC5956RKA0E.A0a(0, 8192);
                    if (this.A08.A0s.A0C) {
                        int changeFlags = AbstractC5934Qy.A06(abstractC5956RKA0E);
                        C5933Qx info = this.A08.A05.A0F(this.A08.A0s, abstractC5956RKA0E, changeFlags | 4096, abstractC5956RKA0E.A0R());
                        this.A08.A1k(abstractC5956RKA0E, info);
                    }
                }
                zA0D = false;
                if (!this.A08.A0s.A07()) {
                    if (abstractC5956RKA0E.A0e()) {
                        zA0D = A0D(abstractC5956RKA0E, this.A08.A00.A04(i), i, j);
                    } else {
                        zA0D = A0D(abstractC5956RKA0E, this.A08.A00.A04(i), i, j);
                    }
                } else if (abstractC5956RKA0E.A0e()) {
                    zA0D = A0D(abstractC5956RKA0E, this.A08.A00.A04(i), i, j);
                } else {
                    zA0D = A0D(abstractC5956RKA0E, this.A08.A00.A04(i), i, j);
                }
                layoutParams = abstractC5956RKA0E.A0H.getLayoutParams();
                if (layoutParams == null) {
                    c5939r3 = (C5939R3) this.A08.generateDefaultLayoutParams();
                    abstractC5956RKA0E.A0H.setLayoutParams(c5939r3);
                } else {
                    zCheckLayoutParams = this.A08.checkLayoutParams(layoutParams);
                    strArr = A0A;
                    if (strArr[5].charAt(9) != strArr[3].charAt(9)) {
                        String[] strArr4 = A0A;
                        strArr4[2] = "zCboBEvvN0uPYmtuolLcQSfyvv";
                        strArr4[6] = "oQlbeeNPYINxaBCA8kGLswkn0x";
                        if (!zCheckLayoutParams) {
                            c5939r3 = (C5939R3) this.A08.generateLayoutParams(layoutParams);
                            abstractC5956RKA0E.A0H.setLayoutParams(c5939r3);
                        } else {
                            c5939r3 = (C5939R3) layoutParams;
                        }
                    } else {
                        String[] strArr5 = A0A;
                        strArr5[7] = "";
                        strArr5[0] = "";
                        if (!zCheckLayoutParams) {
                            c5939r3 = (C5939R3) this.A08.generateLayoutParams(layoutParams);
                            abstractC5956RKA0E.A0H.setLayoutParams(c5939r3);
                        } else {
                            c5939r3 = (C5939R3) layoutParams;
                        }
                    }
                }
                c5939r3.A00 = abstractC5956RKA0E;
                c5939r3.A02 = !z2 && zA0D;
                return abstractC5956RKA0E;
            }
            if (abstractC5956RKA0E == null) {
                iA04 = this.A08.A00.A04(i);
                if (iA04 >= 0 || iA04 >= this.A08.A04.A0B()) {
                    throw new IndexOutOfBoundsException(A04(165, 46, 55) + i + A04(13, 8, 116) + iA04 + A04(35, 8, 108) + this.A08.A0s.A03() + this.A08.A1J());
                }
                int offsetPosition = this.A08.A04.A0C(iA04);
                boolean fromScrapOrHiddenOrCache5 = this.A08.A04.A0M();
                if (fromScrapOrHiddenOrCache5 && (abstractC5956RKA0E = A03(this.A08.A04.A0D(iA04), offsetPosition, z)) != null) {
                    abstractC5956RKA0E.A03 = iA04;
                    z2 = true;
                }
                if (abstractC5956RKA0E == null && 0 != 0) {
                    throw new NullPointerException(A04(540, 25, 93));
                }
                if (abstractC5956RKA0E == null && (abstractC5956RKA0E = A0H().A03(offsetPosition)) != null) {
                    abstractC5956RKA0E.A0W();
                    boolean fromScrapOrHiddenOrCache6 = C47457M.A1C;
                    if (fromScrapOrHiddenOrCache6) {
                        A0A(abstractC5956RKA0E);
                    }
                }
                if (abstractC5956RKA0E == null) {
                    long nanoTime = this.A08.getNanoTime();
                    String[] strArr6 = A0A;
                    if (strArr6[4].charAt(14) == strArr6[1].charAt(14)) {
                        String[] strArr7 = A0A;
                        strArr7[5] = "boNM8OY2bTpFYgdjXbnYcgq0xZrcwPhs";
                        strArr7[3] = "UkhWCoe8HTTYlCSa40rnYF5pqDe823no";
                        if (j != Long.MAX_VALUE) {
                            boolean fromScrapOrHiddenOrCache7 = this.A01.A0B(offsetPosition, nanoTime, j);
                            if (!fromScrapOrHiddenOrCache7) {
                                return null;
                            }
                        }
                        abstractC5956RKA0E = this.A08.A04.A0E(this.A08, offsetPosition);
                        boolean fromScrapOrHiddenOrCache8 = C47457M.A1E;
                        if (fromScrapOrHiddenOrCache8 && (c47457mA0H = C47457M.A0H(abstractC5956RKA0E.A0H)) != null) {
                            abstractC5956RKA0E.A09 = new WeakReference<>(c47457mA0H);
                        }
                        this.A01.A06(offsetPosition, this.A08.getNanoTime() - nanoTime);
                    }
                }
            }
            if (z2 && !this.A08.A0s.A07() && abstractC5956RKA0E.A0o(8192)) {
                abstractC5956RKA0E.A0a(0, 8192);
                if (this.A08.A0s.A0C) {
                    int changeFlags2 = AbstractC5934Qy.A06(abstractC5956RKA0E);
                    C5933Qx info2 = this.A08.A05.A0F(this.A08.A0s, abstractC5956RKA0E, changeFlags2 | 4096, abstractC5956RKA0E.A0R());
                    this.A08.A1k(abstractC5956RKA0E, info2);
                }
            }
            zA0D = false;
            if (!this.A08.A0s.A07() && abstractC5956RKA0E.A0e()) {
                abstractC5956RKA0E.A04 = i;
            } else if (abstractC5956RKA0E.A0e() || abstractC5956RKA0E.A0k() || abstractC5956RKA0E.A0f()) {
                zA0D = A0D(abstractC5956RKA0E, this.A08.A00.A04(i), i, j);
            }
            layoutParams = abstractC5956RKA0E.A0H.getLayoutParams();
            if (layoutParams == null) {
                c5939r3 = (C5939R3) this.A08.generateDefaultLayoutParams();
                abstractC5956RKA0E.A0H.setLayoutParams(c5939r3);
            } else {
                zCheckLayoutParams = this.A08.checkLayoutParams(layoutParams);
                strArr = A0A;
                if (strArr[5].charAt(9) != strArr[3].charAt(9)) {
                    String[] strArr8 = A0A;
                    strArr8[2] = "zCboBEvvN0uPYmtuolLcQSfyvv";
                    strArr8[6] = "oQlbeeNPYINxaBCA8kGLswkn0x";
                    if (!zCheckLayoutParams) {
                        c5939r3 = (C5939R3) this.A08.generateLayoutParams(layoutParams);
                        abstractC5956RKA0E.A0H.setLayoutParams(c5939r3);
                    } else {
                        c5939r3 = (C5939R3) layoutParams;
                    }
                } else {
                    String[] strArr9 = A0A;
                    strArr9[7] = "";
                    strArr9[0] = "";
                    if (!zCheckLayoutParams) {
                        c5939r3 = (C5939R3) this.A08.generateLayoutParams(layoutParams);
                        abstractC5956RKA0E.A0H.setLayoutParams(c5939r3);
                    } else {
                        c5939r3 = (C5939R3) layoutParams;
                    }
                }
            }
            c5939r3.A00 = abstractC5956RKA0E;
            c5939r3.A02 = !z2 && zA0D;
            return abstractC5956RKA0E;
            throw new RuntimeException();
        }
        throw new IndexOutOfBoundsException(A04(271, 22, 26) + i + A04(12, 1, 26) + i + A04(21, 14, 3) + this.A08.A0s.A03() + this.A08.A1J());
    }

    public final List<AbstractC5956RK> A0J() {
        return this.A07;
    }

    public final void A0K() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A0S();
        }
        int i2 = this.A05.size();
        for (int scrapCount = 0; scrapCount < i2; scrapCount++) {
            this.A05.get(scrapCount).A0S();
        }
        if (this.A02 != null) {
            int changedScrapCount = this.A02.size();
            for (int scrapCount2 = 0; scrapCount2 < changedScrapCount; scrapCount2++) {
                this.A02.get(scrapCount2).A0S();
            }
        }
    }

    public final void A0L() {
        this.A05.clear();
        if (this.A02 != null) {
            this.A02.clear();
        }
    }

    public final void A0M() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            C5939R3 c5939r3 = (C5939R3) this.A06.get(i).A0H.getLayoutParams();
            if (c5939r3 != null) {
                c5939r3.A01 = true;
            }
        }
    }

    public final void A0N() {
        if (this.A08.A04 != null && this.A08.A04.A0M()) {
            int size = this.A06.size();
            for (int i = 0; i < size; i++) {
                AbstractC5956RK abstractC5956RK = this.A06.get(i);
                if (abstractC5956RK != null) {
                    abstractC5956RK.A0Z(6);
                    abstractC5956RK.A0c(null);
                }
            }
            return;
        }
        A06();
    }

    public final void A0O() {
        int i = this.A08.A06 != null ? this.A08.A06.A00 : 0;
        int extraCache = this.A03;
        this.A00 = extraCache + i;
        int extraCache2 = this.A06.size();
        for (int i2 = extraCache2 - 1; i2 >= 0; i2--) {
            int size = this.A06.size();
            int i3 = this.A00;
            String[] strArr = A0A;
            String str = strArr[5];
            String str2 = strArr[3];
            int i4 = str.charAt(9);
            int extraCache3 = str2.charAt(9);
            if (i4 != extraCache3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "FM5srU9o6TBj8QlSYYqmaX9MZyJMPTMr";
            strArr2[3] = "mnADOFh1HT7Eu0tfTP5EsiAEmob0QgOc";
            if (size > i3) {
                A07(i2);
            } else {
                return;
            }
        }
    }

    public final void A0P() {
        this.A05.clear();
        A06();
    }

    public final void A0Q(int i) {
        this.A03 = i;
        A0O();
    }

    public final void A0R(View view) {
        AbstractC5956RK abstractC5956RKA0F = C47457M.A0F(view);
        abstractC5956RKA0F.A0F = null;
        abstractC5956RKA0F.A0G = false;
        abstractC5956RKA0F.A0U();
        A0X(abstractC5956RKA0F);
    }

    public final void A0S(View view) {
        AbstractC5956RK abstractC5956RKA0F = C47457M.A0F(view);
        if (abstractC5956RKA0F.A0o(12) || !abstractC5956RKA0F.A0j() || this.A08.A1y(abstractC5956RKA0F)) {
            if (!abstractC5956RKA0F.A0f() || abstractC5956RKA0F.A0g() || this.A08.A04.A0M()) {
                abstractC5956RKA0F.A0b(this, false);
                this.A05.add(abstractC5956RKA0F);
                return;
            }
            throw new IllegalArgumentException(A04(43, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 48) + this.A08.A1J());
        }
        if (this.A02 == null) {
            this.A02 = new ArrayList<>();
        }
        abstractC5956RKA0F.A0b(this, true);
        this.A02.add(abstractC5956RKA0F);
    }

    public final void A0T(View view) {
        AbstractC5956RK abstractC5956RKA0F = C47457M.A0F(view);
        if (abstractC5956RKA0F.A0i()) {
            this.A08.removeDetachedView(view, false);
        }
        if (abstractC5956RKA0F.A0h()) {
            abstractC5956RKA0F.A0Y();
        } else if (abstractC5956RKA0F.A0m()) {
            abstractC5956RKA0F.A0U();
        }
        A0X(abstractC5956RKA0F);
    }

    public final void A0U(AbstractC5926Qq abstractC5926Qq, AbstractC5926Qq abstractC5926Qq2, boolean z) {
        A0P();
        A0H().A08(abstractC5926Qq, abstractC5926Qq2, z);
    }

    public final void A0V(C5945R9 c5945r9) {
        if (this.A01 != null) {
            this.A01.A04();
        }
        this.A01 = c5945r9;
        if (c5945r9 != null) {
            C5945R9 c5945r10 = this.A01;
            AbstractC5926Qq adapter = this.A08.getAdapter();
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "lsZK0accpgBQgJYjkQv5Abfcayw6pcR0";
            strArr2[1] = "Z7g3Rn3k4gV3vNYe90sCMa52PcoBzFf1";
            c5945r10.A07(adapter);
        }
    }

    public final void A0W(AbstractC5954RI abstractC5954RI) {
        this.A04 = abstractC5954RI;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00de  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x0100  */
    /* JADX WARN: Code duplicated, block: B:48:0x0104  */
    /* JADX WARN: Code duplicated, block: B:53:0x0122  */
    /* JADX WARN: Code duplicated, block: B:60:0x0137 A[LOOP:0: B:47:0x0102->B:60:0x0137, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0118 A[EDGE_INSN: B:65:0x0118->B:50:0x0118 BREAK  A[LOOP:0: B:47:0x0102->B:60:0x0137], SYNTHETIC] */
    public final void A0X(AbstractC5956RK abstractC5956RK) {
        boolean transientStatePreventsRecycling;
        boolean transientStatePreventsRecycling2;
        int size;
        String[] strArr;
        boolean transientStatePreventsRecycling3;
        boolean transientStatePreventsRecycling4;
        int i;
        boolean transientStatePreventsRecycling5;
        if (abstractC5956RK.A0h() || abstractC5956RK.A0H.getParent() != null) {
            throw new IllegalArgumentException(A04(293, 56, 75) + abstractC5956RK.A0h() + A04(0, 12, 91) + (abstractC5956RK.A0H.getParent() != null) + this.A08.A1J());
        }
        boolean zA0i = abstractC5956RK.A0i();
        String[] strArr2 = A0A;
        if (strArr2[4].charAt(14) == strArr2[1].charAt(14)) {
            String[] strArr3 = A0A;
            strArr3[2] = "XmVzY8sdohxIZJ5Ojk7HGi6GVO";
            strArr3[6] = "m3xjIJQIi7Ro4dRZ8OgPCgQ0SJ";
            if (!zA0i) {
                if (abstractC5956RK.A0l()) {
                    throw new IllegalArgumentException(A04(430, 110, 9) + this.A08.A1J());
                }
                boolean zA0F = abstractC5956RK.A0F();
                if (this.A08.A04 != null && zA0F) {
                    boolean transientStatePreventsRecycling6 = this.A08.A04.A0N(abstractC5956RK);
                    if (transientStatePreventsRecycling6) {
                        transientStatePreventsRecycling = true;
                    } else {
                        transientStatePreventsRecycling = false;
                    }
                } else {
                    transientStatePreventsRecycling = false;
                }
                int targetCacheIndex = 0;
                boolean z = false;
                if (transientStatePreventsRecycling) {
                    if (this.A00 > 0) {
                        transientStatePreventsRecycling2 = abstractC5956RK.A0o(IronSourceError.ERROR_CAPPED_PER_SESSION);
                        if (!transientStatePreventsRecycling2) {
                            size = this.A06.size();
                            if (size >= this.A00) {
                                A07(0);
                                size--;
                            }
                            strArr = A0A;
                            if (strArr[5].charAt(9) == strArr[3].charAt(9)) {
                                String[] strArr4 = A0A;
                                strArr4[4] = "Q1OZT6LnkVYbRcYxNkw6Mn7gWXto99yC";
                                strArr4[1] = "RVxEgLz70808ymY8dF1xTnmhZlFYlEUe";
                                transientStatePreventsRecycling3 = C47457M.A1E;
                                if (transientStatePreventsRecycling3) {
                                    transientStatePreventsRecycling4 = this.A08.A02.A05(abstractC5956RK.A03);
                                    if (!transientStatePreventsRecycling4) {
                                        i = size - 1;
                                        while (i >= 0) {
                                            transientStatePreventsRecycling5 = this.A08.A02.A05(this.A06.get(i).A03);
                                            if (!transientStatePreventsRecycling5) {
                                                break;
                                                break;
                                            }
                                            i--;
                                        }
                                        size = i + 1;
                                    }
                                }
                                this.A06.add(size, abstractC5956RK);
                                targetCacheIndex = 1;
                            }
                        }
                    }
                    if (targetCacheIndex == 0) {
                        A0Z(abstractC5956RK, true);
                        z = true;
                    }
                } else {
                    boolean transientStatePreventsRecycling7 = abstractC5956RK.A0n();
                    if (transientStatePreventsRecycling7) {
                        if (this.A00 > 0) {
                            transientStatePreventsRecycling2 = abstractC5956RK.A0o(IronSourceError.ERROR_CAPPED_PER_SESSION);
                            if (!transientStatePreventsRecycling2) {
                                size = this.A06.size();
                                if (size >= this.A00 && size > 0) {
                                    A07(0);
                                    size--;
                                }
                                strArr = A0A;
                                if (strArr[5].charAt(9) == strArr[3].charAt(9)) {
                                    String[] strArr5 = A0A;
                                    strArr5[4] = "Q1OZT6LnkVYbRcYxNkw6Mn7gWXto99yC";
                                    strArr5[1] = "RVxEgLz70808ymY8dF1xTnmhZlFYlEUe";
                                    transientStatePreventsRecycling3 = C47457M.A1E;
                                    if (transientStatePreventsRecycling3 && size > 0) {
                                        transientStatePreventsRecycling4 = this.A08.A02.A05(abstractC5956RK.A03);
                                        if (!transientStatePreventsRecycling4) {
                                            i = size - 1;
                                            while (i >= 0) {
                                                transientStatePreventsRecycling5 = this.A08.A02.A05(this.A06.get(i).A03);
                                                if (!transientStatePreventsRecycling5) {
                                                    break;
                                                } else {
                                                    i--;
                                                }
                                            }
                                            size = i + 1;
                                        }
                                    }
                                    this.A06.add(size, abstractC5956RK);
                                    targetCacheIndex = 1;
                                }
                            }
                        }
                        if (targetCacheIndex == 0) {
                            A0Z(abstractC5956RK, true);
                            z = true;
                        }
                    }
                }
                this.A08.A0t.A0B(abstractC5956RK);
                if (targetCacheIndex == 0 && !z && zA0F) {
                    abstractC5956RK.A08 = null;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(A04(349, 81, 50) + abstractC5956RK + this.A08.A1J());
        }
        throw new RuntimeException();
    }

    public final void A0Y(AbstractC5956RK abstractC5956RK) {
        if (abstractC5956RK.A0G) {
            ArrayList<AbstractC5956RK> arrayList = this.A02;
            String[] strArr = A0A;
            if (strArr[7].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "g9dUUHlnr2dNWy2bvXbXpUnxFV";
            strArr2[6] = "1VljHDZyW4yQ7QRXruVc6WBcEp";
            arrayList.remove(abstractC5956RK);
        } else {
            this.A05.remove(abstractC5956RK);
        }
        abstractC5956RK.A0F = null;
        abstractC5956RK.A0G = false;
        abstractC5956RK.A0U();
    }

    public final void A0Z(AbstractC5956RK abstractC5956RK, boolean z) {
        C47457M.A0s(abstractC5956RK);
        if (abstractC5956RK.A0o(16384)) {
            abstractC5956RK.A0a(0, 16384);
            AbstractC5857Ph.A0B(abstractC5956RK.A0H, null);
        }
        if (z) {
            A0B(abstractC5956RK);
        }
        abstractC5956RK.A08 = null;
        A0H().A09(abstractC5956RK);
    }
}
