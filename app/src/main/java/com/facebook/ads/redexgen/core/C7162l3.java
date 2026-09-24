package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.common.primitives.SignedBytes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.l3 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7162l3 implements InterfaceC5331H9 {
    public static byte[] A0J;
    public static String[] A0K = {"3dZ2NVLPQqqn6A0EUODs8QMiUtGNdx7Z", "xuFjaEC88iswWSp8XVRYQuG7fGDdMX6m", "rjdehGUhBmpCCREwTfVtgF2pvaVk7Y4r", "d6Khp0uOfqWTO1N40QwEt8A6fbOPCRXM", "7DUxEGbk65Je624GBbCgY3TRasgIHugx", "67QtD18zbra6Hv1RLsjBMCgdjZH6dqot", "3juCdNiTPJNnKT5EWnyWnOXcFndGfbid", "ecCIYKwUzA4Q5tjuLJWmpRk8GBJuqhXU"};
    public static final InterfaceC5335HD A0L;
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC5332HA A03;
    public C7166l7 A04;
    public InterfaceC5586LH A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final SparseArray<InterfaceC5586LH> A0B;
    public final SparseBooleanArray A0C;
    public final SparseBooleanArray A0D;
    public final SparseIntArray A0E;
    public final C45944v A0F;
    public final C5579LA A0G;
    public final InterfaceC5583LE A0H;
    public final List<C460253> A0I;

    public static String A0D(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0K[5].charAt(9) == '6') {
                throw new RuntimeException();
            }
            A0K[5] = "URhJNiPfEIrBtOuckipDqR7YK4paNHr3";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 30);
            i4++;
        }
    }

    public static void A0G() {
        A0J = new byte[]{SignedBytes.MAX_POWER_OF_TWO, 98, 109, 109, 108, 119, 35, 101, 106, 109, 103, 35, 112, 122, 109, 96, 35, 97, 122, 119, 102, 45, 35, 78, 108, 112, 119, 35, 111, 106, 104, 102, 111, 122, 35, 109, 108, 119, 35, 98, 35, 87, 113, 98, 109, 112, 115, 108, 113, 119, 35, 80, 119, 113, 102, 98, 110, 45};
    }

    static {
        A0G();
        A0L = new InterfaceC5335HD() { // from class: com.facebook.ads.redexgen.X.l6
            @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
            public final InterfaceC5331H9[] A5N() {
                return C7162l3.A0M();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
            public final /* synthetic */ InterfaceC5331H9[] A5O(Uri uri, Map map) {
                return AbstractC5334HC.A01(this, uri, map);
            }
        };
    }

    public C7162l3() {
        this(0);
    }

    public C7162l3(int i) {
        this(1, i, 112800);
    }

    public C7162l3(int i, int i2, int i3) {
        this(i, new C460253(0L), new C7184lP(i2), i3);
    }

    public C7162l3(int i, C460253 c460253, InterfaceC5583LE interfaceC5583LE, int i2) {
        this.A0H = (InterfaceC5583LE) AbstractC45353y.A01(interfaceC5583LE);
        this.A0A = i2;
        this.A09 = i;
        if (i == 1 || i == 2) {
            this.A0I = Collections.singletonList(c460253);
        } else {
            this.A0I = new ArrayList();
            this.A0I.add(c460253);
        }
        this.A0F = new C45944v(new byte[9400], 0);
        this.A0C = new SparseBooleanArray();
        this.A0D = new SparseBooleanArray();
        this.A0B = new SparseArray<>();
        this.A0E = new SparseIntArray();
        this.A0G = new C5579LA(i2);
        this.A03 = InterfaceC5332HA.A00;
        this.A01 = -1;
        A0F();
    }

    private int A00() throws C44963K {
        int iA09 = this.A0F.A09();
        int limit = this.A0F.A0A();
        int iA00 = AbstractC5587LI.A00(this.A0F.A0l(), iA09, limit);
        this.A0F.A0f(iA00);
        int endOfPacket = iA00 + 188;
        if (endOfPacket > limit) {
            int i = this.A00;
            String[] strArr = A0K;
            String str = strArr[0];
            String str2 = strArr[6];
            int limit2 = str.charAt(22);
            int searchStart = str2.charAt(22);
            if (limit2 == searchStart) {
                throw new RuntimeException();
            }
            A0K[3] = "oFbhmyTyFkRbH7nwLSukkKpVMF9MBiPP";
            this.A00 = i + (iA00 - iA09);
            if (this.A09 == 2 && this.A00 > 376) {
                throw C44963K.A01(A0D(0, 58, 29), null);
            }
        } else {
            this.A00 = 0;
        }
        return endOfPacket;
    }

    public static /* synthetic */ int A02(C7162l3 c7162l3) {
        int i = c7162l3.A02;
        c7162l3.A02 = i + 1;
        return i;
    }

    private void A0F() {
        this.A0C.clear();
        this.A0B.clear();
        SparseArray<InterfaceC5586LH> sparseArrayA5Q = this.A0H.A5Q();
        int size = sparseArrayA5Q.size();
        for (int i = 0; i < size; i++) {
            SparseArray<InterfaceC5586LH> sparseArray = this.A0B;
            int initialPayloadReadersSize = A0K[7].charAt(31);
            if (initialPayloadReadersSize != 85) {
                throw new RuntimeException();
            }
            A0K[5] = "Ni66o4kKOCTyHVW4880FmErKiABvWzx3";
            int initialPayloadReadersSize2 = sparseArrayA5Q.keyAt(i);
            sparseArray.put(initialPayloadReadersSize2, sparseArrayA5Q.valueAt(i));
        }
        this.A0B.put(0, new C7168l9(new C7164l5(this)));
        this.A05 = null;
    }

    private void A0H(long j) {
        if (!this.A06) {
            this.A06 = true;
            if (this.A0G.A08() != -9223372036854775807L) {
                this.A04 = new C7166l7(this.A0G.A09(), this.A0G.A08(), j, this.A01, this.A0A);
                this.A03.AJ7(this.A04.A07());
            } else {
                this.A03.AJ7(new C7258mn(this.A0G.A08()));
            }
        }
    }

    private boolean A0I(int i) {
        return this.A09 == 2 || this.A08 || !this.A0D.get(i, false);
    }

    private boolean A0J(InterfaceC7263ms interfaceC7263ms) throws IOException {
        byte[] bArrA0l = this.A0F.A0l();
        if (9400 - this.A0F.A09() < 188) {
            int bytesLeft = this.A0F.A07();
            if (bytesLeft > 0) {
                System.arraycopy(bArrA0l, this.A0F.A09(), bArrA0l, 0, bytesLeft);
            }
            this.A0F.A0j(bArrA0l, bytesLeft);
        }
        while (this.A0F.A07() < 188) {
            int iA0A = this.A0F.A0A();
            int limit = interfaceC7263ms.read(bArrA0l, iA0A, 9400 - iA0A);
            if (limit == -1) {
                return false;
            }
            this.A0F.A0e(iA0A + limit);
        }
        return true;
    }

    public static /* synthetic */ InterfaceC5331H9[] A0M() {
        return new InterfaceC5331H9[]{new C7162l3()};
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AAC(InterfaceC5332HA interfaceC5332HA) {
        this.A03 = interfaceC5332HA;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final int AHL(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv) throws IOException {
        InterfaceC5586LH payloadReader;
        int i;
        long jA8O = interfaceC7263ms.A8O();
        if (this.A08) {
            if (((jA8O == -1 || this.A09 == 2) ? false : true) && !this.A0G.A0A()) {
                return this.A0G.A07(interfaceC7263ms, c5353hv, this.A01);
            }
            A0H(jA8O);
            if (this.A07) {
                this.A07 = false;
                AJ6(0L, 0L);
                if (interfaceC7263ms.A8n() != 0) {
                    c5353hv.A00 = 0L;
                    return 1;
                }
            }
            C7166l7 c7166l7 = this.A04;
            if (A0K[3].charAt(3) != 'h') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[0] = "sDiEMLnvjhOTPJNI7EdeGtcVnMMFmFVg";
            strArr[6] = "irXGtuFGajwAGmxrojJd4OjCXPAtU7cs";
            if (c7166l7 != null && this.A04.A09()) {
                return this.A04.A06(interfaceC7263ms, c5353hv);
            }
        }
        boolean zA0J = A0J(interfaceC7263ms);
        if (A0K[5].charAt(9) == '6') {
            throw new RuntimeException();
        }
        A0K[3] = "pbqhdVjd4r56PJWJm8ke7L1TPhAXhQlh";
        if (!zA0J) {
            return -1;
        }
        int iA00 = A00();
        int iA0A = this.A0F.A0A();
        if (iA00 > iA0A) {
            return 0;
        }
        int iA0C = this.A0F.A0C();
        if ((8388608 & iA0C) == 0) {
            int limit = 0 | ((4194304 & iA0C) != 0 ? 1 : 0);
            int packetHeaderFlags = (2096896 & iA0C) >> 8;
            int tsPacketHeader = (iA0C & 32) != 0 ? 1 : 0;
            if ((iA0C & 16) != 0) {
                payloadReader = this.A0B.get(packetHeaderFlags);
            } else {
                payloadReader = null;
            }
            if (payloadReader == null) {
                this.A0F.A0f(iA00);
                return 0;
            }
            if (this.A09 != 2) {
                int i2 = iA0C & 15;
                int i3 = this.A0E.get(packetHeaderFlags, i2 - 1);
                this.A0E.put(packetHeaderFlags, i2);
                if (i3 == i2) {
                    this.A0F.A0f(iA00);
                    return 0;
                }
                if (i2 != ((i3 + 1) & 15)) {
                    payloadReader.AJ5();
                }
            }
            if (tsPacketHeader != 0) {
                int iA0I = this.A0F.A0I();
                if ((this.A0F.A0I() & 64) != 0) {
                    i = 2;
                } else {
                    i = 0;
                }
                limit |= i;
                this.A0F.A0g(iA0I - 1);
            }
            boolean z = this.A08;
            if (A0I(packetHeaderFlags)) {
                this.A0F.A0e(iA00);
                payloadReader.A5B(this.A0F, limit);
                this.A0F.A0e(iA0A);
            }
            if (this.A09 != 2 && !z && this.A08 && jA8O != -1) {
                this.A07 = true;
            }
            this.A0F.A0f(iA00);
            return 0;
        }
        this.A0F.A0f(iA00);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AHb() {
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AJ6(long j, long j2) {
        AbstractC45353y.A08(this.A09 != 2);
        int size = this.A0I.size();
        for (int i = 0; i < size; i++) {
            C460253 c460253 = this.A0I.get(i);
            boolean z = c460253.A04() == -9223372036854775807L;
            if (!z) {
                long jA02 = c460253.A02();
                if (jA02 != -9223372036854775807L) {
                    String[] strArr = A0K;
                    if (strArr[0].charAt(22) == strArr[6].charAt(22)) {
                        throw new RuntimeException();
                    }
                    A0K[1] = "xsireMETvYUgN4sfQ27n1BF88Hpbgatm";
                    if (jA02 == 0 || jA02 == j2) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
            }
            if (z) {
                c460253.A07(j2);
            }
        }
        if (A0K[3].charAt(3) == 'h') {
            A0K[5] = "QQ4ASPHg1MFvfTvzRH6TwvvGrvMhPJon";
            if (j2 != 0 && this.A04 != null) {
                this.A04.A08(j2);
            }
            this.A0F.A0d(0);
            this.A0E.clear();
            for (int i2 = 0; i2 < this.A0B.size(); i2++) {
                this.A0B.valueAt(i2).AJ5();
            }
            this.A00 = 0;
            if (A0K[5].charAt(9) != '6') {
                String[] strArr2 = A0K;
                strArr2[0] = "GowRIOwCagyGa1SkNIlwyA0nrp7kipic";
                strArr2[6] = "k5JpOZ1RkOAyzQMCpU3mmbngvjfdQ1X3";
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final boolean AK5(InterfaceC7263ms interfaceC7263ms) throws IOException {
        byte[] bArrA0l = this.A0F.A0l();
        interfaceC7263ms.AGt(bArrA0l, 0, 940);
        for (int i = 0; i < 188; i++) {
            boolean isSyncBytePatternCorrect = true;
            for (int i2 = 0; i2 < 5; i2++) {
                int startPosCandidate = bArrA0l[(i2 * 188) + i];
                if (startPosCandidate != 71) {
                    isSyncBytePatternCorrect = false;
                    break;
                }
            }
            if (isSyncBytePatternCorrect) {
                interfaceC7263ms.AK3(i);
                return true;
            }
        }
        return false;
    }
}
