package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import com.facebook.ads.androidx.media3.extractor.mp4.Mp4Extractor;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.m3 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7224m3 implements InterfaceC5331H9, InterfaceC5356HY {
    public static byte[] A0Q;
    public static String[] A0R = {"uzhMW", "LbToze1ZyMStOzMPMggUyU89k761Fydj", "roznHbdGo", "zeOiwqyw9G80TO", "hwgMtT9WWej", "AZ5CtgA3jsgDmrh", "c4g75mNjYzBkznfgxB8HcDFPfSogi", "Prtl1ARtkjOsoD"};
    public static final InterfaceC5335HD A0S;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D54927862 get video/audio duration for progressive")
    public long A0A;
    public long A0B;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D54927862 get video/audio duration for progressive")
    public long A0C;
    public C45944v A0D;
    public InterfaceC5332HA A0E;
    public MotionPhotoMetadata A0F;
    public C5459JE[] A0G;
    public long[][] A0H;
    public final int A0I;
    public final C45944v A0J;
    public final C45944v A0K;
    public final C45944v A0L;
    public final C45944v A0M;
    public final C5466JL A0N;
    public final ArrayDeque<C7235mE> A0O;
    public final List<Metadata.Entry> A0P;

    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:35:0x0107  */
    /* JADX WARN: Code duplicated, block: B:37:0x010b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0121 A[LOOP:1: B:39:0x011d->B:41:0x0121, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x013b  */
    /* JADX WARN: Code duplicated, block: B:49:0x016a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0178  */
    /* JADX WARN: Code duplicated, block: B:53:0x018b  */
    /* JADX WARN: Code duplicated, block: B:56:0x019f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 24
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private int A03(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv) throws IOException {
        long j;
        int i;
        int i2;
        byte[] bArrA0l;
        int i3;
        int i4;
        int iA0C;
        long jA8n = interfaceC7263ms.A8n();
        if (this.A08 == -1) {
            this.A08 = A01(jA8n);
            if (this.A08 == -1) {
                return -1;
            }
        }
        C5459JE c5459je = this.A0G[this.A08];
        InterfaceC5361Hd interfaceC5361Hd = c5459je.A01;
        int i5 = c5459je.A00;
        long j2 = c5459je.A04.A06[i5];
        int i6 = c5459je.A04.A05[i5];
        C5362He c5362He = c5459je.A02;
        long j3 = (j2 - jA8n) + ((long) this.A05);
        if (j3 < 0 || j3 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            c5353hv.A00 = j2;
            return 1;
        }
        int i7 = c5459je.A03.A02;
        if (A0R[2].length() != 19) {
            A0R[6] = "rX6gisAdcV7LBeXwmOhQV8Eb98OXk";
            if (i7 == 1) {
                j3 += 8;
                if (A0R[6].length() == 29) {
                    String[] strArr = A0R;
                    strArr[3] = "KKgaKTwS1RwNPE";
                    strArr[7] = "5hDvshmtbzc6vz";
                    i6 -= 8;
                    interfaceC7263ms.AK3((int) j3);
                    if (c5459je.A03.A01 != 0) {
                        bArrA0l = this.A0K.A0l();
                        bArrA0l[0] = 0;
                        bArrA0l[1] = 0;
                        bArrA0l[2] = 0;
                        i3 = c5459je.A03.A01;
                        i4 = 4 - c5459je.A03.A01;
                        while (this.A06 < i6) {
                            if (this.A07 == 0) {
                                interfaceC7263ms.readFully(bArrA0l, i4, i3);
                                this.A05 += i3;
                                this.A0K.A0f(0);
                                iA0C = this.A0K.A0C();
                                if (iA0C >= 0) {
                                    throw C44963K.A01(A09(48, 18, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), null);
                                }
                                this.A07 = iA0C;
                                this.A0L.A0f(0);
                                interfaceC5361Hd.AIr(this.A0L, 4);
                                this.A06 += 4;
                                i6 += i4;
                            } else {
                                int iAIp = interfaceC5361Hd.AIp(interfaceC7263ms, this.A07, false);
                                this.A05 += iAIp;
                                this.A06 += iAIp;
                                this.A07 -= iAIp;
                            }
                        }
                    } else {
                        if (A09(66, 9, 68).equals(c5459je.A03.A07.A0W)) {
                            if (this.A06 == 0) {
                                AbstractC5316Gu.A07(i6, this.A0M);
                                interfaceC5361Hd.AIr(this.A0M, 7);
                                this.A06 += 7;
                            }
                            i6 += 7;
                        } else if (c5362He != null) {
                            c5362He.A03(interfaceC7263ms);
                        }
                        while (this.A06 < i6) {
                            int iAIp2 = interfaceC5361Hd.AIp(interfaceC7263ms, i6 - this.A06, false);
                            this.A05 += iAIp2;
                            this.A06 += iAIp2;
                            this.A07 -= iAIp2;
                        }
                    }
                    j = c5459je.A04.A07[i5];
                    i = c5459je.A04.A04[i5];
                    if (A0R[4].length() == 11) {
                        String[] strArr2 = A0R;
                        strArr2[5] = "dniiMzQMBKOANx9";
                        strArr2[0] = "Fj7cY";
                        if (c5362He != null) {
                            i2 = 0;
                            c5362He.A04(interfaceC5361Hd, j, i, i6, 0, null);
                            if (i5 + 1 == c5459je.A04.A01) {
                                c5362He.A05(interfaceC5361Hd, null);
                            }
                        } else {
                            i2 = 0;
                            interfaceC5361Hd.AIu(j, i, i6, 0, null);
                        }
                        c5459je.A00++;
                        this.A08 = -1;
                        this.A05 = i2;
                        this.A06 = i2;
                        this.A07 = i2;
                        return i2;
                    }
                }
            } else {
                interfaceC7263ms.AK3((int) j3);
                if (c5459je.A03.A01 != 0) {
                    bArrA0l = this.A0K.A0l();
                    bArrA0l[0] = 0;
                    bArrA0l[1] = 0;
                    bArrA0l[2] = 0;
                    i3 = c5459je.A03.A01;
                    i4 = 4 - c5459je.A03.A01;
                    while (this.A06 < i6) {
                        if (this.A07 == 0) {
                            interfaceC7263ms.readFully(bArrA0l, i4, i3);
                            this.A05 += i3;
                            this.A0K.A0f(0);
                            iA0C = this.A0K.A0C();
                            if (iA0C >= 0) {
                                throw C44963K.A01(A09(48, 18, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), null);
                            }
                            this.A07 = iA0C;
                            this.A0L.A0f(0);
                            interfaceC5361Hd.AIr(this.A0L, 4);
                            this.A06 += 4;
                            i6 += i4;
                        } else {
                            int iAIp3 = interfaceC5361Hd.AIp(interfaceC7263ms, this.A07, false);
                            this.A05 += iAIp3;
                            this.A06 += iAIp3;
                            this.A07 -= iAIp3;
                        }
                    }
                } else {
                    if (A09(66, 9, 68).equals(c5459je.A03.A07.A0W)) {
                        if (this.A06 == 0) {
                            AbstractC5316Gu.A07(i6, this.A0M);
                            interfaceC5361Hd.AIr(this.A0M, 7);
                            this.A06 += 7;
                        }
                        i6 += 7;
                    } else if (c5362He != null) {
                        c5362He.A03(interfaceC7263ms);
                    }
                    while (this.A06 < i6) {
                        int iAIp4 = interfaceC5361Hd.AIp(interfaceC7263ms, i6 - this.A06, false);
                        this.A05 += iAIp4;
                        this.A06 += iAIp4;
                        this.A07 -= iAIp4;
                    }
                }
                j = c5459je.A04.A07[i5];
                i = c5459je.A04.A04[i5];
                if (A0R[4].length() == 11) {
                    String[] strArr3 = A0R;
                    strArr3[5] = "dniiMzQMBKOANx9";
                    strArr3[0] = "Fj7cY";
                    if (c5362He != null) {
                        i2 = 0;
                        c5362He.A04(interfaceC5361Hd, j, i, i6, 0, null);
                        if (i5 + 1 == c5459je.A04.A01) {
                            c5362He.A05(interfaceC5361Hd, null);
                        }
                    } else {
                        i2 = 0;
                        interfaceC5361Hd.AIu(j, i, i6, 0, null);
                    }
                    c5459je.A00++;
                    this.A08 = -1;
                    this.A05 = i2;
                    this.A06 = i2;
                    this.A07 = i2;
                    return i2;
                }
            }
        }
        throw new RuntimeException();
    }

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Q, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0Q = new byte[]{-47, 4, -1, -3, -80, 3, -7, 10, -11, -80, -4, -11, 3, 3, -80, 4, -8, -15, -2, -80, -8, -11, -15, -12, -11, 2, -80, -4, -11, -2, -9, 4, -8, -80, -72, 5, -2, 3, 5, 0, 0, -1, 2, 4, -11, -12, -71, -66, Ascii.DC2, 55, 63, 42, 53, 50, 45, -23, Ascii.ETB, 10, Ascii.NAK, -23, 53, 46, 55, 48, Base64.padSymbol, 49, -8, Ascii.f22492FF, -5, 0, 6, -58, -8, -6, -53, 49, 69, 52, 57, 63, -1, 68, 66, 69, 53, -3, 56, 52};
    }

    static {
        A0C();
        A0S = new InterfaceC5335HD() { // from class: com.facebook.ads.redexgen.X.m4
            @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
            public final InterfaceC5331H9[] A5N() {
                return C7224m3.A0M();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
            public final /* synthetic */ InterfaceC5331H9[] A5O(Uri uri, Map map) {
                return AbstractC5334HC.A01(this, uri, map);
            }
        };
    }

    public C7224m3() {
        this(0);
    }

    public C7224m3(int i) {
        this.A0I = i;
        this.A04 = (i & 4) != 0 ? 3 : 0;
        this.A0N = new C5466JL();
        this.A0P = new ArrayList();
        this.A0J = new C45944v(16);
        this.A0O = new ArrayDeque<>();
        this.A0L = new C45944v(AbstractC5350HS.A03);
        this.A0K = new C45944v(4);
        this.A0M = new C45944v();
        this.A08 = -1;
        this.A0E = InterfaceC5332HA.A00;
        this.A0G = new C5459JE[0];
    }

    public static int A00(int i) {
        switch (i) {
            case 1751476579:
                return 2;
            case 1903435808:
                if (A0R[6].length() != 29) {
                    throw new RuntimeException();
                }
                A0R[1] = "rbgKKZbH0NS3XFJda55b1nN6iCZjcLPR";
                return 1;
            default:
                if (A0R[6].length() != 29) {
                    throw new RuntimeException();
                }
                A0R[4] = "05jGjYjRxbz";
                return 0;
        }
    }

    private int A01(long j) {
        long j2 = Long.MAX_VALUE;
        int preferredTrackIndex = 1;
        int i = -1;
        long sampleOffset = Long.MAX_VALUE;
        long j3 = Long.MAX_VALUE;
        int i2 = 1;
        int trackIndex = -1;
        int i3 = 0;
        while (true) {
            C5459JE[] c5459jeArr = this.A0G;
            String[] strArr = A0R;
            if (strArr[3].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0R[6] = "Fcko3uaud46cO6nUcug7HhLZFNYBY";
            if (i3 >= c5459jeArr.length) {
                if (j3 == Long.MAX_VALUE || i2 == 0) {
                    return i;
                }
                long j4 = 10485760 + j3;
                if (A0R[1].charAt(1) == 'b') {
                    A0R[1] = "AbIM1W3wiFJMRqsWOI3P0CqvLybO2M00";
                    if (sampleOffset < j4) {
                        return i;
                    }
                } else if (sampleOffset < j4) {
                    return i;
                }
                return trackIndex;
            }
            C5459JE c5459je = this.A0G[i3];
            int i4 = c5459je.A00;
            if (i4 != c5459je.A04.A01) {
                long j5 = c5459je.A04.A06[i4];
                long minAccumulatedBytes = ((long[][]) AbstractC46115C.A0f(this.A0H))[i3][i4];
                long j6 = j5 - j;
                int i5 = (j6 < 0 || j6 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) ? 1 : 0;
                if ((i5 == 0 && preferredTrackIndex != 0) || (i5 == preferredTrackIndex && j6 < j2)) {
                    preferredTrackIndex = i5;
                    j2 = j6;
                    i = i3;
                    if (A0R[6].length() != 29) {
                        String[] strArr2 = A0R;
                        strArr2[5] = "nNk7RawiIyahd9Y";
                        strArr2[0] = "017pL";
                        sampleOffset = minAccumulatedBytes;
                    } else {
                        A0R[1] = "1bC0in6G1ApWSL3PegJBmoVzHl6EE3tw";
                        sampleOffset = minAccumulatedBytes;
                    }
                }
                if (minAccumulatedBytes < j3) {
                    j3 = minAccumulatedBytes;
                    i2 = i5;
                    trackIndex = i3;
                }
            }
            i3++;
        }
    }

    public static int A02(C45944v c45944v) {
        c45944v.A0f(8);
        int majorBrand = A00(c45944v.A0C());
        if (majorBrand != 0) {
            return majorBrand;
        }
        c45944v.A0g(4);
        while (c45944v.A07() > 0) {
            int majorBrand2 = A00(c45944v.A0C());
            if (majorBrand2 != 0) {
                return majorBrand2;
            }
        }
        return 0;
    }

    private int A04(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv) throws IOException {
        int iA07 = this.A0N.A07(interfaceC7263ms, c5353hv, this.A0P);
        if (iA07 == 1 && c5353hv.A00 == 0) {
            A0A();
        }
        return iA07;
    }

    public static int A05(C5472JR c5472jr, long j) {
        int iA00 = c5472jr.A00(j);
        if (iA00 == -1) {
            return c5472jr.A01(j);
        }
        return iA00;
    }

    public static long A06(C5472JR c5472jr, long j, long j2) {
        int iA05 = A05(c5472jr, j);
        if (iA05 == -1) {
            return j2;
        }
        return Math.min(c5472jr.A06[iA05], j2);
    }

    private final C5355HX A07(long j, int i) {
        long jA06;
        long j2;
        int mainTrackIndex;
        if (this.A0G.length == 0) {
            return new C5355HX(C5357HZ.A04);
        }
        long j3 = -9223372036854775807L;
        long jA07 = -1;
        int i2 = i != -1 ? i : this.A03;
        if (i2 != -1) {
            C5472JR c5472jr = this.A0G[i2].A04;
            int iA05 = A05(c5472jr, j);
            if (iA05 == -1) {
                return new C5355HX(C5357HZ.A04);
            }
            j2 = c5472jr.A07[iA05];
            jA06 = c5472jr.A06[iA05];
            if (A0R[6].length() != 29) {
                throw new RuntimeException();
            }
            A0R[1] = "zbT5rN6sguJCvWwII8HLCHwSkH7sQNQT";
            if (j2 < j && iA05 < c5472jr.A01 - 1 && (mainTrackIndex = c5472jr.A01(j)) != -1 && mainTrackIndex != iA05) {
                j3 = c5472jr.A07[mainTrackIndex];
                jA07 = c5472jr.A06[mainTrackIndex];
            }
        } else {
            jA06 = Long.MAX_VALUE;
            if (A0R[4].length() != 11) {
                j2 = j;
            } else {
                A0R[2] = "SenK5aC";
                j2 = j;
            }
        }
        if (i == -1) {
            for (int i3 = 0; i3 < this.A0G.length; i3++) {
                if (i3 != this.A03) {
                    C5472JR sampleTable = this.A0G[i3].A04;
                    jA06 = A06(sampleTable, j2, jA06);
                    if (j3 != -9223372036854775807L) {
                        jA07 = A06(sampleTable, j3, jA07);
                    }
                }
            }
        }
        C5357HZ c5357hz = new C5357HZ(j2, jA06);
        if (j3 == -9223372036854775807L) {
            return new C5355HX(c5357hz);
        }
        return new C5355HX(c5357hz, new C5357HZ(j3, jA07));
    }

    public static /* synthetic */ C5469JO A08(C5469JO c5469jo) {
        return c5469jo;
    }

    private void A0A() {
        this.A04 = 0;
        this.A00 = 0;
    }

    private void A0B() {
        if (this.A02 == 2 && (this.A0I & 2) != 0) {
            this.A0E.AKS(0, 4).A6e(new C44672p().A0v(this.A0F == null ? null : new Metadata(this.A0F)).A14());
            this.A0E.A6O();
            this.A0E.AJ7(new C7258mn(-9223372036854775807L));
        }
    }

    private void A0D(long j) throws C44963K {
        while (!this.A0O.isEmpty() && this.A0O.peek().A00 == j) {
            C7235mE c7235mEPop = this.A0O.pop();
            if (((AbstractC5439Iu) c7235mEPop).A00 == 1836019574) {
                A0G(c7235mEPop);
                this.A0O.clear();
                this.A04 = 2;
            } else if (!this.A0O.isEmpty()) {
                C7235mE containerAtom = this.A0O.peek();
                containerAtom.A08(c7235mEPop);
            }
        }
        if (this.A04 != 2) {
            A0A();
        }
    }

    private void A0E(long j) {
        if (this.A01 == 1836086884) {
            this.A0F = new MotionPhotoMetadata(0L, j, -9223372036854775807L, j + ((long) this.A00), this.A09 - ((long) this.A00));
        }
    }

    private void A0F(InterfaceC7263ms interfaceC7263ms) throws IOException {
        this.A0M.A0d(8);
        interfaceC7263ms.AGt(this.A0M.A0l(), 0, 8);
        AbstractC5445J0.A0Q(this.A0M);
        interfaceC7263ms.AK3(this.A0M.A09());
        interfaceC7263ms.AIl();
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Adding average bitrate calculation logic")
    private void A0G(C7235mE c7235mE) throws C44963K {
        int i;
        int size = -1;
        long jMax = -9223372036854775807L;
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        List<Mp4Extractor.Mp4Track> tracks = new ArrayList<>();
        Metadata udtaMetaMetadata = null;
        Metadata metadata = null;
        boolean z = this.A02 == 1;
        C5342HK c5342hk = new C5342HK();
        C7234mD c7234mDA07 = c7235mE.A07(1969517665);
        if (c7234mDA07 != null) {
            Pair<Metadata, Metadata> pairA0A = AbstractC5445J0.A0A(c7234mDA07);
            udtaMetaMetadata = (Metadata) pairA0A.first;
            metadata = (Metadata) pairA0A.second;
            if (udtaMetaMetadata != null) {
                c5342hk.A05(udtaMetaMetadata);
            }
        }
        Metadata metadataA0F = null;
        C7235mE c7235mEA06 = c7235mE.A06(1835365473);
        if (c7235mEA06 != null) {
            metadataA0F = AbstractC5445J0.A0F(c7235mEA06);
        }
        List<C5472JR> listA0O = AbstractC5445J0.A0O(c7235mE, c5342hk, -9223372036854775807L, null, (this.A0I & 1) != 0, z, new InterfaceC7123kO() { // from class: com.facebook.ads.redexgen.X.m5
            @Override // com.facebook.ads.redexgen.core.InterfaceC7123kO
            public final Object A4B(Object obj) {
                return C7224m3.A08((C5469JO) obj);
            }
        });
        int trackCount = listA0O.size();
        for (int i2 = 0; i2 < trackCount; i2++) {
            C5472JR c5472jr = listA0O.get(i2);
            int trackCount2 = c5472jr.A01;
            if (trackCount2 == 0) {
                int i3 = A0R[1].charAt(1);
                if (i3 != 98) {
                    throw new RuntimeException();
                }
                A0R[1] = "ibvFTefsgA7pkzOq8AzNcMz9gVb8PR75";
            } else {
                C5469JO track = c5472jr.A03;
                InterfaceC5332HA interfaceC5332HA = this.A0E;
                int trackCount3 = track.A03;
                C5459JE c5459je = new C5459JE(track, c5472jr, interfaceC5332HA.AKS(i2, trackCount3));
                long j3 = track.A04 != -9223372036854775807L ? track.A04 : c5472jr.A02;
                jMax = Math.max(jMax, j3);
                if (1 == track.A03) {
                    j2 = j3;
                } else if (2 == track.A03) {
                    j = j3;
                }
                if (A09(75, 13, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE).equals(track.A07.A0W)) {
                    int i4 = c5472jr.A00;
                    if (A0R[6].length() != 29) {
                        throw new RuntimeException();
                    }
                    A0R[6] = "30Puiqoz9JCJMsN9BhlLDaWtr32u3";
                    i = i4 * 16;
                } else {
                    i = c5472jr.A00 + 30;
                }
                C44672p formatBuilder = track.A07.A07();
                formatBuilder.A0h(i);
                if (track.A03 == 2 && j3 > 0 && c5472jr.A01 > 1) {
                    formatBuilder.A0X(c5472jr.A01 / (j3 / 1000000.0f));
                }
                if (jMax > 0 && c5472jr.A01 > 0) {
                    int i5 = c5472jr.A05.length;
                    if (i5 == c5472jr.A01) {
                        long j4 = 0;
                        for (int i6 = 0; i6 < sampleIndex; i6++) {
                            int sampleIndex = c5472jr.A05[i6];
                            j4 += (long) sampleIndex;
                        }
                        formatBuilder.A0a((int) ((8000000 * j4) / jMax));
                    }
                }
                int i7 = track.A03;
                AbstractC5456JB.A0D(i7, c5342hk, formatBuilder);
                int i8 = track.A03;
                Metadata[] metadataArr = new Metadata[2];
                metadataArr[0] = metadata;
                metadataArr[1] = this.A0P.isEmpty() ? null : new Metadata(this.A0P);
                AbstractC5456JB.A0C(i8, udtaMetaMetadata, metadataA0F, formatBuilder, metadataArr);
                c5459je.A01.A6e(formatBuilder.A14());
                int i9 = track.A03;
                if (i9 == 2 && size == -1) {
                    size = tracks.size();
                }
                tracks.add(c5459je);
            }
        }
        this.A03 = size;
        this.A0B = jMax;
        this.A0C = j;
        this.A0A = j2;
        this.A0G = (C5459JE[]) tracks.toArray(new C5459JE[0]);
        this.A0H = A0N(this.A0G);
        this.A0E.A6O();
        this.A0E.AJ7(this);
    }

    private void A0H(C5459JE c5459je, long j) {
        C5472JR c5472jr = c5459je.A04;
        int sampleIndex = c5472jr.A00(j);
        if (sampleIndex == -1) {
            sampleIndex = c5472jr.A01(j);
        }
        c5459je.A00 = sampleIndex;
        if (A0R[2].length() == 19) {
            throw new RuntimeException();
        }
        A0R[2] = "DxqZc2lJMNLNZhW19Xb8kO";
    }

    public static boolean A0I(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    public static boolean A0J(int i) {
        if (i != 1835296868 && i != 1836476516) {
            if (A0R[4].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A0R;
            strArr[3] = "UHuXZ9PGVGxrhu";
            strArr[7] = "Sv1JTBT1egKeuo";
            if (i != 1751411826 && i != 1937011556 && i != 1937011827 && i != 1937011571 && i != 1668576371 && i != 1701606260 && i != 1937011555 && i != 1937011578 && i != 1937013298) {
                if (A0R[2].length() != 19) {
                    A0R[6] = "0EWWhWMRQ7MgS85x4CKboIorprSqD";
                    if (i != 1937007471) {
                        if (i == 1668232756 && i != 1953196132 && i != 1718909296 && i != 1969517665 && i != 1801812339 && i != 1768715124) {
                            return false;
                        }
                    }
                } else if (i != 1937007471) {
                    if (i == 1668232756) {
                    }
                }
            }
        }
        return true;
    }

    private boolean A0K(InterfaceC7263ms interfaceC7263ms) throws IOException {
        C7235mE containerAtom;
        if (this.A00 == 0) {
            if (!interfaceC7263ms.AHR(this.A0J.A0l(), 0, 8, true)) {
                A0B();
                return false;
            }
            this.A00 = 8;
            this.A0J.A0f(0);
            this.A09 = this.A0J.A0Q();
            this.A01 = this.A0J.A0C();
        }
        if (this.A09 == 1) {
            if (A0R[2].length() == 19) {
                throw new RuntimeException();
            }
            A0R[2] = "uEfPCG8cZZkUCN4sq";
            interfaceC7263ms.readFully(this.A0J.A0l(), 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A09 = this.A0J.A0R();
        } else if (this.A09 == 0) {
            long jA8O = interfaceC7263ms.A8O();
            if (jA8O == -1 && (containerAtom = this.A0O.peek()) != null) {
                jA8O = containerAtom.A00;
            }
            if (jA8O != -1) {
                this.A09 = (jA8O - interfaceC7263ms.A8n()) + ((long) this.A00);
            }
        }
        if (this.A09 >= this.A00) {
            if (A0I(this.A01)) {
                long jA8n = (interfaceC7263ms.A8n() + this.A09) - ((long) this.A00);
                if (this.A09 != this.A00 && this.A01 == 1835365473) {
                    A0F(interfaceC7263ms);
                }
                this.A0O.push(new C7235mE(this.A01, jA8n));
                if (this.A09 == this.A00) {
                    A0D(jA8n);
                } else {
                    A0A();
                }
            } else if (A0J(this.A01)) {
                AbstractC45353y.A08(this.A00 == 8);
                AbstractC45353y.A08(this.A09 <= 2147483647L);
                C45944v c45944v = new C45944v((int) this.A09);
                C45944v atomData = this.A0J;
                System.arraycopy(atomData.A0l(), 0, c45944v.A0l(), 0, 8);
                this.A0D = c45944v;
                this.A04 = 1;
            } else {
                A0E(interfaceC7263ms.A8n() - ((long) this.A00));
                this.A0D = null;
                this.A04 = 1;
            }
            return true;
        }
        throw C44963K.A00(A09(0, 48, 61));
    }

    private boolean A0L(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv) throws IOException {
        long j = this.A09 - ((long) this.A00);
        long atomEndPosition = interfaceC7263ms.A8n() + j;
        boolean z = false;
        C45944v c45944v = this.A0D;
        if (c45944v != null) {
            interfaceC7263ms.readFully(c45944v.A0l(), this.A00, (int) j);
            if (this.A01 == 1718909296) {
                this.A02 = A02(c45944v);
            } else if (!this.A0O.isEmpty()) {
                this.A0O.peek().A09(new C7234mD(this.A01, c45944v));
            }
        } else if (j < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            interfaceC7263ms.AK3((int) j);
        } else {
            long atomPayloadSize = interfaceC7263ms.A8n();
            c5353hv.A00 = atomPayloadSize + j;
            z = true;
        }
        A0D(atomEndPosition);
        return z && this.A04 != 2;
    }

    public static /* synthetic */ InterfaceC5331H9[] A0M() {
        return new InterfaceC5331H9[]{new C7224m3()};
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x006c  */
    /* JADX WARN: Code duplicated, block: B:48:0x006f A[SYNTHETIC] */
    public static long[][] A0N(C5459JE[] c5459jeArr) {
        long[][] jArr = new long[c5459jeArr.length][];
        int[] iArr = new int[c5459jeArr.length];
        long[] jArr2 = new long[c5459jeArr.length];
        boolean[] tracksFinished = new boolean[c5459jeArr.length];
        for (int i = 0; i < c5459jeArr.length; i++) {
            jArr[i] = new long[c5459jeArr[i].A04.A01];
            jArr2[i] = c5459jeArr[i].A04.A07[0];
        }
        long j = 0;
        if (A0R[2].length() == 19) {
            throw new RuntimeException();
        }
        A0R[1] = "qbCXFrWy43oBbJoUYfYqc11BUuHVPZxe";
        int i2 = 0;
        while (i2 < c5459jeArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int minTimeTrackIndex = 0; minTimeTrackIndex < c5459jeArr.length; minTimeTrackIndex++) {
                boolean z = tracksFinished[minTimeTrackIndex];
                if (A0R[6].length() != 29) {
                    A0R[2] = "AIMWoJADevTWezna7TxcWd";
                    if (!z) {
                        if (jArr2[minTimeTrackIndex] <= j2) {
                            i3 = minTimeTrackIndex;
                            j2 = jArr2[minTimeTrackIndex];
                        }
                    }
                } else {
                    String[] strArr = A0R;
                    strArr[3] = "DkVrMcHnnNdNTj";
                    strArr[7] = "McjqbXJyC3Esle";
                    if (!z) {
                        if (jArr2[minTimeTrackIndex] <= j2) {
                            i3 = minTimeTrackIndex;
                            j2 = jArr2[minTimeTrackIndex];
                        }
                    }
                }
            }
            int i4 = iArr[i3];
            jArr[i3][i4] = j;
            j += (long) c5459jeArr[i3].A04.A05[i4];
            int i5 = i4 + 1;
            iArr[i3] = i5;
            if (i5 < jArr[i3].length) {
                C5459JE c5459je = c5459jeArr[i3];
                if (A0R[1].charAt(1) != 'b') {
                    jArr2[i3] = c5459je.A04.A07[i5];
                } else {
                    String[] strArr2 = A0R;
                    strArr2[5] = "FttiEMkEmxvjjK7";
                    strArr2[0] = "cOA5C";
                    jArr2[i3] = c5459je.A04.A07[i5];
                }
            } else {
                tracksFinished[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5356HY
    public final long A7t() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5356HY
    public final C5355HX A91(long j) {
        return A07(j, -1);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AAC(InterfaceC5332HA interfaceC5332HA) {
        this.A0E = interfaceC5332HA;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5356HY
    public final boolean AAj() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final int AHL(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv) throws IOException {
        while (true) {
            switch (this.A04) {
                case 0:
                    if (!A0K(interfaceC7263ms)) {
                        return -1;
                    }
                    break;
                    break;
                case 1:
                    if (A0L(interfaceC7263ms, c5353hv)) {
                        return 1;
                    }
                    break;
                case 2:
                    return A03(interfaceC7263ms, c5353hv);
                case 3:
                    return A04(interfaceC7263ms, c5353hv);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AJ6(long j, long j2) {
        this.A0O.clear();
        this.A00 = 0;
        this.A08 = -1;
        this.A05 = 0;
        this.A06 = 0;
        this.A07 = 0;
        if (j == 0) {
            int i = this.A04;
            String[] strArr = A0R;
            if (strArr[3].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0R;
            strArr2[3] = "BBO5nGzNDCjhdG";
            strArr2[7] = "Qq9RZt6cBQ724Z";
            if (i != 3) {
                A0A();
                return;
            } else {
                this.A0N.A08();
                this.A0P.clear();
                return;
            }
        }
        for (C5459JE c5459je : this.A0G) {
            A0H(c5459je, j2);
            if (c5459je.A02 != null) {
                c5459je.A02.A02();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final boolean AK5(InterfaceC7263ms interfaceC7263ms) throws IOException {
        return AbstractC5467JM.A02(interfaceC7263ms, (this.A0I & 2) != 0);
    }
}
