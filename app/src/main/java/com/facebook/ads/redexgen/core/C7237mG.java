package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.MlltFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mG */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization("DoNotStrip")
public final class C7237mG implements InterfaceC5331H9 {
    public static byte[] A0K;
    public static String[] A0L = {"", "XN01ItT2bHY64Udo8U0rv5VGSzBxMc17", "LZob5GHcOm1BKJQ2vQEKg44UBdoAB", "Ux8BYUlKxCzUFwXHW791pvzO", "", "EYpHAHesBPuZwNRi93BVygfvwpQNuwRz", "BndnCdJGei78P0VEYjqxuWcWalVGolEJ", "FxTwI"};
    public static final InterfaceC5335HD A0M;
    public static final InterfaceC5398IE A0N;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public Metadata A06;
    public InterfaceC5332HA A07;
    public InterfaceC5361Hd A08;
    public InterfaceC5361Hd A09;
    public InterfaceC7236mF A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final long A0E;
    public final C45944v A0F;
    public final C5342HK A0G;
    public final C5344HM A0H;
    public final C5345HN A0I;
    public final InterfaceC5361Hd A0J;

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0K, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0K = new byte[]{-78, -60, -64, -47, -62, -57, -60, -61, 127, -45, -50, -50, 127, -52, -64, -51, -40, 127, -63, -40, -45, -60, -46, -115, -27, -35, -42, -33};
        if (A0L[5].charAt(24) == 'i') {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[1] = "rBULd6kp2sYKxjbrN7jKkVDhSodb4v28";
        strArr[6] = "gBWiztBtWh7JHxCzKYVaG6CraVXBuCHm";
    }

    static {
        A0B();
        A0M = new InterfaceC5335HD() { // from class: com.facebook.ads.redexgen.X.mI
            @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
            public final InterfaceC5331H9[] A5N() {
                return C7237mG.A0G();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
            public final /* synthetic */ InterfaceC5331H9[] A5O(Uri uri, Map map) {
                return AbstractC5334HC.A01(this, uri, map);
            }
        };
        A0N = new InterfaceC5398IE() { // from class: com.facebook.ads.redexgen.X.mH
            @Override // com.facebook.ads.redexgen.core.InterfaceC5398IE
            public final boolean A6Q(int i, int i2, int i3, int i4, int i5) {
                return C7237mG.A0C(i, i2, i3, i4, i5);
            }
        };
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C7237mG() {
        this(0);
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C7237mG(int i) {
        this(i, -9223372036854775807L);
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C7237mG(int i, long j) {
        this.A0D = (i & 2) != 0 ? i | 1 : i;
        this.A0E = j;
        this.A0F = new C45944v(10);
        this.A0I = new C5345HN();
        this.A0G = new C5342HK();
        this.A02 = -9223372036854775807L;
        this.A0H = new C5344HM();
        this.A0J = new C7264mt();
        this.A08 = this.A0J;
    }

    public static int A00(C45944v c45944v, int i) {
        if (c45944v.A0A() >= i + 4) {
            c45944v.A0f(i);
            if (A0L[5].charAt(24) == 'i') {
                throw new RuntimeException();
            }
            A0L[3] = "hnNDf1WGfP5HptxyzX0WY3yEy4CiO";
            int iA0C = c45944v.A0C();
            if (iA0C == 1483304551 || iA0C == 1231971951) {
                return iA0C;
            }
        }
        if (c45944v.A0A() >= 40) {
            c45944v.A0f(36);
            return c45944v.A0C() == 1447187017 ? 1447187017 : 0;
        }
        return 0;
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private int A01(InterfaceC7263ms interfaceC7263ms) throws IOException {
        if (this.A01 == 0) {
            try {
                A0F(interfaceC7263ms, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A0A == null) {
            this.A0A = A07(interfaceC7263ms);
            this.A07.AJ7(this.A0A);
            this.A08.A6e(new C44672p().A11(this.A0I.A06).A0h(4096).A0b(this.A0I.A01).A0m(this.A0I.A03).A0d(this.A0G.A00).A0e(this.A0G.A01).A0v((this.A0D & 8) != 0 ? null : this.A06).A14());
            this.A03 = interfaceC7263ms.A8n();
        } else if (this.A03 != 0) {
            long jA8n = interfaceC7263ms.A8n();
            if (jA8n < this.A03) {
                interfaceC7263ms.AK3((int) (this.A03 - jA8n));
            }
        }
        return A02(interfaceC7263ms);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    private int A02(InterfaceC7263ms interfaceC7263ms) throws IOException {
        if (this.A00 == 0) {
            interfaceC7263ms.AIl();
            if (A0E(interfaceC7263ms)) {
                return -1;
            }
            this.A0F.A0f(0);
            int iA0C = this.A0F.A0C();
            int sampleHeaderData = this.A01;
            if (A0D(iA0C, sampleHeaderData)) {
                int sampleHeaderData2 = AbstractC5346HO.A00(iA0C);
                if (sampleHeaderData2 != -1) {
                    this.A0I.A00(iA0C);
                    if (this.A02 == -9223372036854775807L) {
                        this.A02 = this.A0A.A9H(interfaceC7263ms.A8n());
                        if (this.A0E != -9223372036854775807L) {
                            this.A02 += this.A0E - this.A0A.A9H(0L);
                        }
                    }
                    int sampleHeaderData3 = this.A0I.A02;
                    this.A00 = sampleHeaderData3;
                    if (this.A0A instanceof C48228b) {
                        C48228b c48228b = (C48228b) this.A0A;
                        long j = this.A04;
                        int sampleHeaderData4 = this.A0I.A04;
                        long jA03 = A03(j + ((long) sampleHeaderData4));
                        long jA8n = interfaceC7263ms.A8n();
                        int sampleHeaderData5 = this.A0I.A02;
                        c48228b.A01(jA03, jA8n + ((long) sampleHeaderData5));
                        if (this.A0C && c48228b.A02(this.A05)) {
                            this.A0C = false;
                            this.A08 = this.A09;
                        }
                    }
                }
            }
            interfaceC7263ms.AK3(1);
            this.A01 = 0;
            return 0;
        }
        int iAIp = this.A08.AIp(interfaceC7263ms, this.A00, true);
        if (iAIp == -1) {
            return -1;
        }
        int bytesAppended = this.A00;
        this.A00 = bytesAppended - iAIp;
        int bytesAppended2 = this.A00;
        if (bytesAppended2 > 0) {
            return 0;
        }
        this.A08.AIu(A03(this.A04), 1, this.A0I.A02, 0, null);
        if (A0L[5].charAt(24) == 'i') {
            throw new RuntimeException();
        }
        A0L[3] = "39D9RtME66Nzc4lHdRGQvnw";
        long j2 = this.A04;
        int bytesAppended3 = this.A0I.A04;
        this.A04 = j2 + ((long) bytesAppended3);
        this.A00 = 0;
        return 0;
    }

    private long A03(long j) {
        return this.A02 + ((1000000 * j) / ((long) this.A0I.A03));
    }

    public static long A04(Metadata metadata) {
        if (metadata != null) {
            int iA02 = metadata.A02();
            for (int i = 0; i < iA02; i++) {
                Metadata.Entry entryA03 = metadata.A03(i);
                if ((entryA03 instanceof TextInformationFrame) && ((Id3Frame) ((TextInformationFrame) entryA03)).A00.equals(A09(24, 4, 101))) {
                    return AbstractC46115C.A0O(Long.parseLong(((TextInformationFrame) entryA03).A02.get(0)));
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private C48298i A05(InterfaceC7263ms interfaceC7263ms, boolean z) throws IOException {
        interfaceC7263ms.AGt(this.A0F.A0l(), 0, 4);
        this.A0F.A0f(0);
        this.A0I.A00(this.A0F.A0C());
        return new C48298i(interfaceC7263ms.A8O(), interfaceC7263ms.A8n(), this.A0I, z);
    }

    public static C48188X A06(Metadata metadata, long j) {
        if (metadata != null) {
            int iA02 = metadata.A02();
            for (int i = 0; i < iA02; i++) {
                Metadata.Entry entry = metadata.A03(i);
                if (entry instanceof MlltFrame) {
                    return C48188X.A01(j, (MlltFrame) entry, A04(metadata));
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    private InterfaceC7236mF A07(InterfaceC7263ms interfaceC7263ms) throws IOException {
        long durationUs;
        InterfaceC7236mF interfaceC7236mFA08 = A08(interfaceC7263ms);
        InterfaceC7236mF seekFrameSeeker = A06(this.A06, interfaceC7263ms.A8n());
        if (this.A0B) {
            return new C48178W();
        }
        InterfaceC7236mF c48228b = null;
        if ((this.A0D & 4) != 0) {
            long jA7j = -1;
            if (seekFrameSeeker != null) {
                durationUs = seekFrameSeeker.A7t();
                jA7j = seekFrameSeeker.A7j();
            } else if (interfaceC7236mFA08 != null) {
                durationUs = interfaceC7236mFA08.A7t();
                jA7j = interfaceC7236mFA08.A7j();
            } else {
                durationUs = A04(this.A06);
            }
            c48228b = new C48228b(durationUs, interfaceC7263ms.A8n(), jA7j);
        } else if (seekFrameSeeker != null) {
            c48228b = seekFrameSeeker;
        } else if (interfaceC7236mFA08 != null) {
            c48228b = interfaceC7236mFA08;
        }
        boolean z = true;
        String[] strArr = A0L;
        if (strArr[1].charAt(10) == strArr[6].charAt(10)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0L;
        strArr2[7] = "puIT5";
        strArr2[4] = "";
        if (c48228b == null || (!c48228b.AAj() && (this.A0D & 1) != 0)) {
            int i = this.A0D;
            if (A0L[5].charAt(24) != 'i') {
                String[] strArr3 = A0L;
                strArr3[7] = "yAfIM";
                strArr3[4] = "";
                if ((i & 2) == 0) {
                    z = false;
                }
            } else {
                A0L[5] = "MGo95V6JQFDSGlQkmGWT48KfEqhrmySi";
                if ((i & 2) == 0) {
                    z = false;
                }
            }
            return A05(interfaceC7263ms, z);
        }
        return c48228b;
    }

    private InterfaceC7236mF A08(InterfaceC7263ms interfaceC7263ms) throws IOException {
        C45944v c45944v = new C45944v(this.A0I.A02);
        interfaceC7263ms.AGt(c45944v.A0l(), 0, this.A0I.A02);
        int i = 21;
        if ((this.A0I.A05 & 1) != 0) {
            if (this.A0I.A01 != 1) {
                i = 36;
            }
        } else if (this.A0I.A01 == 1) {
            i = 13;
        }
        int iA00 = A00(c45944v, i);
        if (iA00 == 1483304551 || iA00 == 1231971951) {
            C48158U c48158uA01 = C48158U.A01(interfaceC7263ms.A8O(), interfaceC7263ms.A8n(), this.A0I, c45944v);
            if (c48158uA01 != null && !this.A0G.A03()) {
                interfaceC7263ms.AIl();
                interfaceC7263ms.A47(i + ModuleDescriptor.MODULE_VERSION);
                C45944v frame = this.A0F;
                interfaceC7263ms.AGt(frame.A0l(), 0, 3);
                C45944v frame2 = this.A0F;
                frame2.A0f(0);
                C5342HK c5342hk = this.A0G;
                C45944v frame3 = this.A0F;
                c5342hk.A04(frame3.A0K());
            }
            interfaceC7263ms.AK3(this.A0I.A02);
            if (c48158uA01 != null && !c48158uA01.AAj() && iA00 == 1231971951) {
                C48298i c48298iA05 = A05(interfaceC7263ms, false);
                String[] strArr = A0L;
                String str = strArr[7];
                String str2 = strArr[4];
                int xingBase = str.length();
                if (xingBase == str2.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0L;
                strArr2[1] = "bGvlWKvJjPQrySHefRGmEijHbVzYOxUK";
                strArr2[6] = "fU58RXvZc6f3KsNNOCISAUQgLzoCeDCK";
                return c48298iA05;
            }
            return c48158uA01;
        }
        if (iA00 == 1447187017) {
            C48168V c48168vA00 = C48168V.A00(interfaceC7263ms.A8O(), interfaceC7263ms.A8n(), this.A0I, c45944v);
            interfaceC7263ms.AK3(this.A0I.A02);
            return c48168vA00;
        }
        interfaceC7263ms.AIl();
        return null;
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void A0A() {
        AbstractC45353y.A02(this.A09);
    }

    public static /* synthetic */ boolean A0C(int i, int i2, int i3, int i4, int i5) {
        if (i2 != 67 || i3 != 79 || i4 != 77 || (i5 != 77 && i != 2)) {
            if (i2 == 77) {
                if (A0L[5].charAt(24) == 'i') {
                    throw new RuntimeException();
                }
                String[] strArr = A0L;
                strArr[2] = "NxAl2v4obD3CfxY1bwrYNdaYMjSl6";
                strArr[0] = "";
                if (i3 != 76 || i4 != 76 || (i5 != 84 && i != 2)) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0D(int i, long j) {
        return ((long) ((-128000) & i)) == ((-128000) & j);
    }

    private boolean A0E(InterfaceC7263ms interfaceC7263ms) throws IOException {
        if (this.A0A != null) {
            long jA7j = this.A0A.A7j();
            if (jA7j != -1) {
                long dataEndPosition = interfaceC7263ms.A8i();
                if (dataEndPosition > jA7j - 4) {
                    return true;
                }
            }
        }
        try {
            return !interfaceC7263ms.AGu(this.A0F.A0l(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private boolean A0F(InterfaceC7263ms interfaceC7263ms, boolean z) throws IOException {
        int candidateSynchronizedHeaderData;
        int i = 0;
        int i2 = 0;
        int iA8i = 0;
        int searchedBytes = 0;
        int headerData = z ? 32768 : 131072;
        interfaceC7263ms.AIl();
        if (interfaceC7263ms.A8n() == 0) {
            int validFrameCount = this.A0D;
            int validFrameCount2 = (validFrameCount & 8) == 0 ? 1 : 0;
            this.A06 = this.A0H.A00(interfaceC7263ms, validFrameCount2 != 0 ? null : A0N);
            if (this.A06 != null) {
                this.A0G.A05(this.A06);
            }
            iA8i = (int) interfaceC7263ms.A8i();
            if (!z) {
                interfaceC7263ms.AK3(iA8i);
            }
        }
        while (true) {
            if (A0E(interfaceC7263ms)) {
                if (i > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.A0F.A0f(0);
            int iA0C = this.A0F.A0C();
            if ((i2 != 0 && !A0D(iA0C, i2)) || (candidateSynchronizedHeaderData = AbstractC5346HO.A00(iA0C)) == -1) {
                int candidateSynchronizedHeaderData2 = searchedBytes + 1;
                if (searchedBytes == headerData) {
                    if (z) {
                        return false;
                    }
                    throw C44963K.A01(A09(0, 24, 51), null);
                }
                i = 0;
                i2 = 0;
                if (z) {
                    interfaceC7263ms.AIl();
                    int validFrameCount3 = iA8i + candidateSynchronizedHeaderData2;
                    interfaceC7263ms.A47(validFrameCount3);
                } else {
                    interfaceC7263ms.AK3(1);
                }
                searchedBytes = candidateSynchronizedHeaderData2;
            } else {
                i++;
                if (i == 1) {
                    this.A0I.A00(iA0C);
                    i2 = iA0C;
                } else if (i == 4) {
                    break;
                }
                int validFrameCount4 = candidateSynchronizedHeaderData - 4;
                interfaceC7263ms.A47(validFrameCount4);
            }
        }
        if (z) {
            interfaceC7263ms.AK3(iA8i + searchedBytes);
        } else {
            interfaceC7263ms.AIl();
        }
        this.A01 = i2;
        if (A0L[5].charAt(24) == 105) {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[7] = "Yv6sT";
        strArr[4] = "";
        return true;
    }

    public static /* synthetic */ InterfaceC5331H9[] A0G() {
        return new InterfaceC5331H9[]{new C7237mG()};
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AAC(InterfaceC5332HA interfaceC5332HA) {
        this.A07 = interfaceC5332HA;
        this.A09 = this.A07.AKS(0, 1);
        this.A08 = this.A09;
        this.A07.A6O();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final int AHL(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv) throws IOException {
        A0A();
        int iA01 = A01(interfaceC7263ms);
        if (iA01 == -1 && (this.A0A instanceof C48228b)) {
            long jA03 = A03(this.A04);
            long durationUs = this.A0A.A7t();
            if (durationUs != jA03) {
                ((C48228b) this.A0A).A00(jA03);
                this.A07.AJ7(this.A0A);
            }
        }
        return iA01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AJ6(long j, long j2) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A04 = 0L;
        this.A00 = 0;
        this.A05 = j2;
        if ((this.A0A instanceof C48228b) && !((C48228b) this.A0A).A02(j2)) {
            this.A0C = true;
            this.A08 = this.A0J;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final boolean AK5(InterfaceC7263ms interfaceC7263ms) throws IOException {
        return A0F(interfaceC7263ms, true);
    }
}
