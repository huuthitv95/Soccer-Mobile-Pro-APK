package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lR */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7186lR implements InterfaceC5331H9 {
    public static byte[] A0C;
    public static String[] A0D = {"Jp9jYTsvX0byW8PsTh8WCsi4kS5THTDZ", "u9JmQf2RUpXkbwKGcH1ldYLO1OaAnoG0", "zVRI5h7vLNN08I5W1BFePAuDidXDjkLB", "GupX0AjjIH906l5opBlPCY0Mrv7mkKOY", "YLyM9aD6SKjNKerJ1EloHyT", "oAaNr5RuznTKLecZmpLN", "Q5WjYzMQ2NaCiwYPtyRn68zXUmvTXGHf", "bi8dQH0GL9bk2fQxVP7KQMQdOg6RbrhP"};
    public static final InterfaceC5335HD A0E;
    public int A00;
    public long A01;
    public long A02;
    public InterfaceC5332HA A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final C45934u A08;
    public final C45944v A09;
    public final C45944v A0A;
    public final C7185lQ A0B;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{39, Ascii.f22503VT, 6, Ascii.f22492FF, 5, Ascii.CAN, 7, Ascii.f22499SI, Ascii.f22500SO, 74, 43, 46, 62, 57, 74, Ascii.f22491EM, Ascii.f22498RS, Ascii.CAN, Ascii.f22499SI, Ascii.f22503VT, 7};
    }

    static {
        A04();
        A0E = new InterfaceC5335HD() { // from class: com.facebook.ads.redexgen.X.lS
            @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
            public final InterfaceC5331H9[] A5N() {
                return C7186lR.A07();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
            public final /* synthetic */ InterfaceC5331H9[] A5O(Uri uri, Map map) {
                return AbstractC5334HC.A01(this, uri, map);
            }
        };
    }

    public C7186lR() {
        this(0);
    }

    public C7186lR(int i) {
        this.A07 = (i & 2) != 0 ? i | 1 : i;
        this.A0B = new C7185lQ(true);
        this.A09 = new C45944v(2048);
        this.A00 = -1;
        this.A01 = -1L;
        this.A0A = new C45944v(10);
        this.A08 = new C45934u(this.A0A.A0l());
    }

    public static int A00(int i, long j) {
        return (int) (((((long) i) * 8) * 1000000) / j);
    }

    private int A01(InterfaceC7263ms interfaceC7263ms) throws IOException {
        int i = 0;
        while (true) {
            interfaceC7263ms.AGt(this.A0A.A0l(), 0, 10);
            this.A0A.A0f(0);
            if (this.A0A.A0K() != 4801587) {
                break;
            }
            this.A0A.A0g(3);
            int length = this.A0A.A0H();
            int firstFramePosition = length + 10;
            i += firstFramePosition;
            interfaceC7263ms.A47(length);
        }
        interfaceC7263ms.AIl();
        interfaceC7263ms.A47(i);
        if (this.A01 == -1) {
            this.A01 = i;
        }
        return i;
    }

    private C7267mx A02(long j, boolean z) {
        return new C7267mx(j, this.A01, A00(this.A00, this.A0B.A0J()), this.A00, z);
    }

    @RequiresNonNull({"extractorOutput"})
    private void A05(long j, boolean z) {
        if (this.A05) {
            return;
        }
        boolean z2 = (this.A07 & 1) != 0 && this.A00 > 0;
        String[] strArr = A0D;
        if (strArr[2].charAt(14) != strArr[3].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[0] = "wRCLGMQDqXZHrYOEljE7cvu367IJP6qz";
        strArr2[1] = "FofxBB8LpAk5nYyyotl0uMBanfu6Lq1A";
        if (z2 && this.A0B.A0J() == -9223372036854775807L && !z) {
            return;
        }
        if (!z2 || this.A0B.A0J() == -9223372036854775807L) {
            this.A03.AJ7(new C7258mn(-9223372036854775807L));
        } else {
            this.A03.AJ7(A02(j, (this.A07 & 2) != 0));
        }
        this.A05 = true;
    }

    private void A06(InterfaceC7263ms interfaceC7263ms) throws IOException {
        int iA04;
        if (this.A04) {
            return;
        }
        this.A00 = -1;
        interfaceC7263ms.AIl();
        if (interfaceC7263ms.A8n() == 0) {
            A01(interfaceC7263ms);
        }
        int currentFrameSize = 0;
        long j = 0;
        do {
            try {
                if (!interfaceC7263ms.AGu(this.A0A.A0l(), 0, 2, true)) {
                    break;
                }
                this.A0A.A0f(0);
                if (C7185lQ.A0F(this.A0A.A0M())) {
                    if (!interfaceC7263ms.AGu(this.A0A.A0l(), 0, 4, true)) {
                        break;
                    }
                    this.A08.A08(14);
                    iA04 = this.A08.A04(13);
                    int numValidFrames = A0D[7].charAt(7);
                    if (numValidFrames != 114) {
                        A0D[4] = "EiGF";
                        if (iA04 > 6) {
                            j += (long) iA04;
                            currentFrameSize++;
                            if (currentFrameSize == 1000) {
                                break;
                            }
                        } else {
                            this.A04 = true;
                            throw C44963K.A01(A03(0, 21, 88), null);
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    currentFrameSize = 0;
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (interfaceC7263ms.A48(iA04 - 6, true));
        interfaceC7263ms.AIl();
        if (currentFrameSize > 0) {
            this.A00 = (int) (j / ((long) currentFrameSize));
        } else {
            this.A00 = -1;
        }
        this.A04 = true;
    }

    public static /* synthetic */ InterfaceC5331H9[] A07() {
        return new InterfaceC5331H9[]{new C7186lR()};
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AAC(InterfaceC5332HA interfaceC5332HA) {
        this.A03 = interfaceC5332HA;
        this.A0B.A5c(interfaceC5332HA, new C5585LG(0, 1));
        interfaceC5332HA.A6O();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final int AHL(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv) throws IOException {
        AbstractC45353y.A02(this.A03);
        long jA8O = interfaceC7263ms.A8O();
        if (((this.A07 & 2) == 0 && ((this.A07 & 1) == 0 || jA8O == -1)) ? false : true) {
            A06(interfaceC7263ms);
        }
        int bytesRead = interfaceC7263ms.read(this.A09.A0l(), 0, 2048);
        boolean z = bytesRead == -1;
        A05(jA8O, z);
        if (z) {
            return -1;
        }
        this.A09.A0f(0);
        this.A09.A0e(bytesRead);
        if (!this.A06) {
            this.A0B.AGq(this.A02, 4);
            this.A06 = true;
        }
        this.A0B.A5A(this.A09);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AJ6(long j, long j2) {
        this.A06 = false;
        this.A0B.AJ5();
        this.A02 = j2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final boolean AK5(InterfaceC7263ms interfaceC7263ms) throws IOException {
        int headerPosition;
        int iA01 = A01(interfaceC7263ms);
        int i = iA01;
        int frameSize = 0;
        int syncBytes = 0;
        do {
            interfaceC7263ms.AGt(this.A0A.A0l(), 0, 2);
            this.A0A.A0f(0);
            int startPosition = this.A0A.A0M();
            if (!C7185lQ.A0F(startPosition)) {
                syncBytes = 0;
                frameSize = 0;
                i++;
                interfaceC7263ms.AIl();
                interfaceC7263ms.A47(i);
            } else {
                syncBytes++;
                String[] strArr = A0D;
                String str = strArr[2];
                String str2 = strArr[3];
                int headerPosition2 = str.charAt(14);
                int startPosition2 = str2.charAt(14);
                if (headerPosition2 != startPosition2) {
                    throw new RuntimeException();
                }
                A0D[7] = "vlF0iwwjiK26GT4HTqGcAOiXXpcsHbpg";
                if (syncBytes >= 4 && frameSize > 188) {
                    return true;
                }
                interfaceC7263ms.AGt(this.A0A.A0l(), 0, 4);
                this.A08.A08(14);
                C45934u c45934u = this.A08;
                int headerPosition3 = A0D[5].length();
                if (headerPosition3 == 4) {
                    throw new RuntimeException();
                }
                A0D[4] = "LrBCAcAc8FKB1NeW";
                int headerPosition4 = c45934u.A04(13);
                if (headerPosition4 <= 6) {
                    syncBytes = 0;
                    frameSize = 0;
                    i++;
                    interfaceC7263ms.AIl();
                    interfaceC7263ms.A47(i);
                } else {
                    int startPosition3 = headerPosition4 - 6;
                    interfaceC7263ms.A47(startPosition3);
                    frameSize += headerPosition4;
                }
            }
            headerPosition = i - iA01;
        } while (headerPosition < 8192);
        return false;
    }
}
