package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Handler;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9p */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C48819p implements InterfaceC7321np, InterfaceC5332HA, InterfaceC5217FI<C7319nn>, InterfaceC5221FM, InterfaceC5100DP {
    public static byte[] A0e;
    public static String[] A0f = {"o2fAJH6DTExx5HfWJCXs", "", "TsjJo55j6Kq128TfeQrvBtnORCvXohBg", "QpymssT", "p1Azi7mByqrjPk9ZTQVOCdIp8WANOiZ", "P8K3es9juVbjT7QsA9zjw4fZ7CWDxkC3", "f2TCNbDOQ", "8xae32DDfRwM"};
    public static final C7472qI A0g;
    public static final Map<String, String> A0h;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public InterfaceC7322nq A06;
    public C5095DK A07;
    public InterfaceC5356HY A08;
    public IcyHeaders A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public C5094DJ[] A0K;
    public C7306na[] A0L;
    public final long A0M;
    public final Uri A0N;
    public final Handler A0O;
    public final C454548 A0P;
    public final InterfaceC7408pF A0Q;
    public final C4892A1 A0R;
    public final InterfaceC4897A6 A0S;
    public final C5083D8 A0T;
    public final InterfaceC5088DD A0U;
    public final InterfaceC5093DI A0V;
    public final InterfaceC5199F0 A0W;
    public final InterfaceC5214FF A0X;
    public final C7277n7 A0Y;
    public final Runnable A0Z;
    public final Runnable A0a;
    public final String A0b;
    public final boolean A0c;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"})
    public final boolean A0d;

    public static String A0B(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0e, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0I() {
        A0e = new byte[]{-76, -81, -55, -33, -109, -77, -53, -38, -57, -86, -57, -38, -57, -29, 6, -8, -5, -4, 9, -47, -25, 9, 6, -2, 9, -4, 10, 10, 0, Ascii.f22490CR, -4, -28, -4, -5, 0, -8, -25, -4, 9, 0, 6, -5, -62, -27, -41, -38, -33, -28, -35, -106, -36, -33, -28, -33, -23, -34, -37, -38, -106, -40, -37, -36, -27, -24, -37, -106, -26, -24, -37, -26, -41, -24, -41, -22, -33, -27, -28, -106, -33, -23, -106, -39, -27, -29, -26, -30, -37, -22, -37, -92, -49, -14, -28, -25, -20, -15, -22, -93, -23, -20, -15, -20, -10, -21, -24, -25, -93, -27, -24, -23, -14, -11, -24, -93, -13, -11, -24, -13, -28, -11, -28, -9, -20, -14, -15, -93, -20, -10, -93, -26, -14, -16, -13, -17, -24, -9, -24, -79, -93, -40, -43, -52, -67, -93, -12, 3, 3, -1, -4, -10, -12, 7, -4, 2, 1, -62, Ascii.f22503VT, -64, -4, -10, Ascii.f22492FF, -6, -12, 10, 47, 54, 45, 45};
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC7321np
    public final long AJ9(InterfaceC7284nE[] interfaceC7284nEArr, boolean[] zArr, InterfaceC5104DT[] interfaceC5104DTArr, boolean[] zArr2, long j) {
        long jAJ8 = j;
        A0E();
        C7302nW c7302nW = this.A07.A00;
        boolean[] zArr3 = this.A07.A01;
        int i = this.A01;
        int i2 = 0;
        while (true) {
            int i3 = 0;
            if (i2 >= interfaceC7284nEArr.length) {
                boolean z = !this.A0J ? jAJ8 == 0 : i != 0;
                for (int i4 = 0; i4 < interfaceC7284nEArr.length; i4++) {
                    InterfaceC5104DT interfaceC5104DT = interfaceC5104DTArr[i4];
                    if (A0f[0].length() != 20) {
                        break;
                    }
                    String[] strArr = A0f;
                    strArr[6] = "NEStfGRt7";
                    strArr[7] = "7J9sRP18njyY";
                    if (interfaceC5104DT == null && interfaceC7284nEArr[i4] != null) {
                        InterfaceC7284nE interfaceC7284nE = interfaceC7284nEArr[i4];
                        AbstractC45353y.A08(interfaceC7284nE.length() == 1);
                        AbstractC45353y.A08(interfaceC7284nE.A8H(0) == 0);
                        int iA04 = c7302nW.A04(interfaceC7284nE.A9L());
                        AbstractC45353y.A08(!zArr3[iA04]);
                        this.A01++;
                        zArr3[iA04] = true;
                        interfaceC5104DTArr[i4] = new C7318nm(this, iA04);
                        zArr2[i4] = true;
                        if (!z) {
                            C7306na c7306na = this.A0L[iA04];
                            z = (c7306na.A0f(jAJ8, true) || c7306na.A0O() == 0) ? false : true;
                        }
                    }
                }
                if (this.A01 == 0) {
                    this.A0F = false;
                    this.A0E = false;
                    if (this.A0Y.A0E()) {
                        C7306na[] c7306naArr = this.A0L;
                        int length = c7306naArr.length;
                        while (i3 < length) {
                            c7306naArr[i3].A0V();
                            i3++;
                        }
                        this.A0Y.A09();
                    } else {
                        C7306na[] c7306naArr2 = this.A0L;
                        int length2 = c7306naArr2.length;
                        while (i3 < length2) {
                            c7306naArr2[i3].A0Z();
                            i3++;
                        }
                    }
                } else if (z) {
                    jAJ8 = AJ8(jAJ8, false);
                    for (int i5 = 0; i5 < interfaceC5104DTArr.length; i5++) {
                        if (interfaceC5104DTArr[i5] != null) {
                            zArr2[i5] = true;
                        }
                    }
                }
                this.A0J = true;
                return jAJ8;
            }
            if (interfaceC5104DTArr[i2] != null) {
                if (interfaceC7284nEArr[i2] != null) {
                    boolean z2 = zArr[i2];
                    String[] strArr2 = A0f;
                    if (strArr2[2].charAt(7) != strArr2[5].charAt(7)) {
                        break;
                    }
                    A0f[0] = "eW7kSByjGiBvUls6sdXN";
                    if (!z2) {
                        int i6 = ((C7318nm) interfaceC5104DTArr[i2]).A00;
                        AbstractC45353y.A08(zArr3[i6]);
                        this.A01--;
                        zArr3[i6] = false;
                        interfaceC5104DTArr[i2] = null;
                    }
                } else {
                    int i7 = ((C7318nm) interfaceC5104DTArr[i2]).A00;
                    AbstractC45353y.A08(zArr3[i7]);
                    this.A01--;
                    zArr3[i7] = false;
                    interfaceC5104DTArr[i2] = null;
                }
            }
            i2++;
        }
        throw new RuntimeException();
    }

    static {
        A0I();
        A0h = A0D();
        A0g = new C44672p().A0y(A0B(161, 3, 77)).A11(A0B(144, 17, 79)).A14();
    }

    public C48819p(Uri uri, InterfaceC7408pF interfaceC7408pF, InterfaceC5088DD interfaceC5088DD, InterfaceC4897A6 interfaceC4897A6, C4892A1 c4892a1, InterfaceC5214FF interfaceC5214FF, C5083D8 c5083d8, InterfaceC5093DI interfaceC5093DI, InterfaceC5199F0 interfaceC5199F0, String str, int i, InterfaceExecutorC5236Fb interfaceExecutorC5236Fb) {
        C7277n7 c7277n7;
        this.A0N = uri;
        this.A0Q = interfaceC7408pF;
        this.A0S = interfaceC4897A6;
        this.A0R = c4892a1;
        this.A0X = interfaceC5214FF;
        this.A0T = c5083d8;
        this.A0V = interfaceC5093DI;
        this.A0W = interfaceC5199F0;
        this.A0b = str;
        this.A0M = i;
        if (interfaceExecutorC5236Fb != null) {
            c7277n7 = new C7277n7(interfaceExecutorC5236Fb);
        } else {
            c7277n7 = new C7277n7(A0B(13, 29, 83));
        }
        this.A0Y = c7277n7;
        this.A0U = interfaceC5088DD;
        this.A0P = new C454548();
        this.A0Z = new Runnable() { // from class: com.facebook.ads.redexgen.X.DG
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0F();
            }
        };
        this.A0a = new Runnable() { // from class: com.facebook.ads.redexgen.X.DH
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0b();
            }
        };
        this.A0O = AbstractC46115C.A0Y();
        this.A0K = new C5094DJ[0];
        this.A0L = new C7306na[0];
        this.A05 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        this.A00 = 1;
        this.A0d = MetaExoPlayerUpgradeConfig.A03(EnumC7071jX.A0e) || MetaExoPlayerUpgradeConfig.A03(EnumC7071jX.A1j);
        this.A0c = MetaExoPlayerUpgradeConfig.A03(EnumC7071jX.A0g);
    }

    private int A00() {
        int i = 0;
        for (C7306na c7306na : this.A0L) {
            int extractedSamplesCount = c7306na.A0P();
            i += extractedSamplesCount;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    public long A03(boolean z) {
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.A0L.length; i++) {
            if (z) {
                jMax = Math.max(jMax, this.A0L[i].A0T());
            } else {
                Object objA01 = AbstractC45353y.A01(this.A07);
                String[] strArr = A0f;
                if (strArr[6].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0f;
                strArr2[6] = "FDopTuaFs";
                strArr2[7] = "ze95XzERDUjm";
                if (((C5095DK) objA01).A01[i]) {
                    jMax = Math.max(jMax, this.A0L[i].A0T());
                }
            }
        }
        return jMax;
    }

    private C7306na A06(C5094DJ c5094dj) {
        int length = this.A0L.length;
        for (int i = 0; i < length; i++) {
            if (c5094dj.equals(this.A0K[i])) {
                return this.A0L[i];
            }
        }
        C7306na c7306naA0B = C7306na.A0B(this.A0W, this.A0S, this.A0R);
        c7306naA0B.A0d(this);
        int trackCount = length + 1;
        C5094DJ[] c5094djArr = (C5094DJ[]) Arrays.copyOf(this.A0K, trackCount);
        c5094djArr[length] = c5094dj;
        this.A0K = (C5094DJ[]) AbstractC46115C.A1H(c5094djArr);
        int trackCount2 = length + 1;
        C7306na[] c7306naArr = (C7306na[]) Arrays.copyOf(this.A0L, trackCount2);
        c7306naArr[length] = c7306naA0B;
        this.A0L = (C7306na[]) AbstractC46115C.A1H(c7306naArr);
        return c7306naA0B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5217FI
    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final C5218FJ AEf(C7319nn c7319nn, long j, long j2, IOException iOException, int i) {
        C5218FJ c5218fjA01;
        C4907AG c4907ag = c7319nn.A08;
        C5065Cq c5065Cq = new C5065Cq(c7319nn.A05, c7319nn.A01, c4907ag.A01(), c4907ag.A02(), j, j2, c4907ag.A00());
        long jA8u = this.A0X.A8u(new C5213FE(c5065Cq, new C5067Cs(1, -1, null, 0, null, AbstractC46115C.A0P(c7319nn.A00), AbstractC46115C.A0P(this.A03)), iOException, i));
        if (jA8u == -9223372036854775807L) {
            c5218fjA01 = C7277n7.A06;
        } else {
            int iA00 = A00();
            boolean z = iA00 > this.A02;
            if (A0U(c7319nn, iA00)) {
                c5218fjA01 = C7277n7.A01(z, jA8u);
            } else {
                c5218fjA01 = C7277n7.A05;
            }
        }
        this.A0T.A07(c5065Cq, 1, -1, null, 0, null, c7319nn.A00, this.A03, iOException, !c5218fjA01.A02());
        return c5218fjA01;
    }

    public static Map<String, String> A0D() {
        HashMap map = new HashMap();
        map.put(A0B(1, 12, 34), A0B(0, 1, 63));
        Map<String, String> headers = Collections.unmodifiableMap(map);
        return headers;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private void A0E() {
        AbstractC45353y.A08(this.A0G);
        AbstractC45353y.A01(this.A07);
        AbstractC45353y.A01(this.A08);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F() {
        Metadata metadataA05;
        if (this.A0H || this.A0G) {
            return;
        }
        boolean z = this.A0I;
        String[] strArr = A0f;
        if (strArr[1].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[2] = "grMxxjGjFdBhxw9MDZtvFg4OZy35nlzN";
        strArr2[5] = "E38rNlujzeckGRbn7d7aukKxtTtuF9Uw";
        if (!z || this.A08 == null) {
            return;
        }
        for (C7306na c7306na : this.A0L) {
            if (c7306na.A0U() == null) {
                return;
            }
        }
        this.A0P.A02();
        int length = this.A0L.length;
        C7435pg[] c7435pgArr = new C7435pg[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            C7472qI c7472qIA14 = (C7472qI) AbstractC45353y.A01(this.A0L[i].A0U());
            String str = c7472qIA14.A0W;
            boolean zA0C = AbstractC44953J.A0C(str);
            boolean z2 = zA0C || AbstractC44953J.A0F(str);
            zArr[i] = z2;
            this.A0A |= z2;
            IcyHeaders icyHeaders = this.A09;
            if (icyHeaders != null) {
                if (zA0C || this.A0K[i].A01) {
                    Metadata metadata = c7472qIA14.A0P;
                    if (metadata == null) {
                        metadataA05 = new Metadata(icyHeaders);
                    } else {
                        metadataA05 = metadata.A05(icyHeaders);
                    }
                    C44672p c44672pA0v = c7472qIA14.A07().A0v(metadataA05);
                    if (A0f[0].length() != 20) {
                        throw new RuntimeException();
                    }
                    String[] strArr3 = A0f;
                    strArr3[2] = "WsODqr3j7Qd6qKAaI5Z8JETVOkriGcMH";
                    strArr3[5] = "rCf1buyjz0YjJBdswvkAeWhqIr4TjJn3";
                    c7472qIA14 = c44672pA0v.A14();
                }
                if (zA0C) {
                    int trackCount = c7472qIA14.A04;
                    if (trackCount == -1) {
                        int trackCount2 = c7472qIA14.A0D;
                        if (trackCount2 == -1) {
                            int trackCount3 = icyHeaders.A00;
                            if (trackCount3 != -1) {
                                C44672p c44672pA07 = c7472qIA14.A07();
                                int trackCount4 = icyHeaders.A00;
                                c7472qIA14 = c44672pA07.A0a(trackCount4).A14();
                            }
                        }
                    }
                }
            }
            c7435pgArr[i] = new C7435pg(c7472qIA14);
        }
        this.A07 = new C5095DK(new C7302nW(c7435pgArr), zArr);
        this.A0G = true;
        ((InterfaceC7322nq) AbstractC45353y.A01(this.A06)).AFS(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G() {
        this.A0O.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.DF
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0c();
            }
        });
    }

    private void A0H() {
        C7319nn c7319nn = new C7319nn(this, this.A0N, this.A0Q, this.A0U, this, this.A0P);
        if (this.A0G) {
            AbstractC45353y.A08(A0S());
            if (this.A03 != -9223372036854775807L && this.A05 >= this.A03) {
                this.A0D = true;
                this.A05 = -9223372036854775807L;
                return;
            }
            c7319nn.A04(((InterfaceC5356HY) AbstractC45353y.A01(this.A08)).A91(this.A05).A00.A00, this.A05);
            for (C7306na c7306na : this.A0L) {
                c7306na.A0b(this.A05);
            }
            this.A05 = -9223372036854775807L;
        }
        this.A02 = A00();
        this.A0T.A06(new C5065Cq(c7319nn.A05, c7319nn.A01, this.A0Y.A08(c7319nn, this, this.A0X.A8Z(this.A00))), 1, -1, null, 0, null, c7319nn.A00, this.A03, 0);
    }

    private final void A0J() throws IOException {
        this.A0Y.A0B(this.A0X.A8Z(this.A00));
    }

    private void A0K(int i) {
        A0E();
        boolean[] zArr = this.A07.A03;
        if (!zArr[i]) {
            C7472qI c7472qIA08 = this.A07.A00.A05(i).A08(0);
            this.A0T.A03(AbstractC44953J.A01(c7472qIA08.A0W), c7472qIA08, 0, null, this.A04);
            zArr[i] = true;
        }
    }

    private void A0L(int i) {
        A0E();
        boolean[] zArr = this.A07.A02;
        if (this.A0F && zArr[i]) {
            if (this.A0L[i].A0g(false)) {
                return;
            }
            this.A05 = 0L;
            this.A0F = false;
            this.A0E = true;
            this.A04 = 0L;
            this.A02 = 0;
            for (C7306na c7306na : this.A0L) {
                c7306na.A0Z();
            }
            ((InterfaceC7322nq) AbstractC45353y.A01(this.A06)).ADV(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5217FI
    /* JADX INFO: renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public final void AEe(C7319nn c7319nn, long j, long j2) {
        long largestQueuedTimestampUs;
        if (this.A03 == -9223372036854775807L && this.A08 != null) {
            boolean zAAj = this.A08.AAj();
            long jA03 = A03(true);
            String[] strArr = A0f;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0f;
            strArr2[6] = "VBgm4XD5c";
            strArr2[7] = "eM9hzsMViOdm";
            if (jA03 == Long.MIN_VALUE) {
                largestQueuedTimestampUs = 0;
            } else {
                largestQueuedTimestampUs = 10000 + jA03;
            }
            this.A03 = largestQueuedTimestampUs;
            this.A0V.AG0(this.A03, zAAj, this.A0C);
        }
        C4907AG c4907ag = c7319nn.A08;
        this.A0T.A08(new C5065Cq(c7319nn.A05, c7319nn.A01, c4907ag.A01(), c4907ag.A02(), j, j2, c4907ag.A00()), 1, -1, null, 0, null, c7319nn.A00, this.A03, c7319nn, null);
        this.A0D = true;
        ((InterfaceC7322nq) AbstractC45353y.A01(this.A06)).ADV(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5217FI
    /* JADX INFO: renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public final void AEi(C7319nn c7319nn, long j, long j2, int i) {
        C5065Cq c5065Cq;
        C4907AG dataSource = c7319nn.A08;
        if (i == 0) {
            c5065Cq = new C5065Cq(c7319nn.A05, c7319nn.A01, j);
        } else {
            c5065Cq = new C5065Cq(c7319nn.A05, c7319nn.A01, dataSource.A01(), dataSource.A02(), j, j2, dataSource.A00());
        }
        this.A0T.A06(c5065Cq, 1, -1, null, 0, null, c7319nn.A00, this.A03, i);
        String[] strArr = A0f;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[6] = "RSQzFltms";
        strArr2[7] = "MablvJN0SXK9";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5217FI
    /* JADX INFO: renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public final void AEc(C7319nn c7319nn, long j, long j2, boolean z) {
        C4907AG dataSource = c7319nn.A08;
        this.A0T.A05(new C5065Cq(c7319nn.A05, c7319nn.A01, dataSource.A01(), dataSource.A02(), j, j2, dataSource.A00()), 1, -1, null, 0, null, c7319nn.A00, this.A03);
        if (!z) {
            for (C7306na c7306na : this.A0L) {
                c7306na.A0Z();
            }
            if (this.A01 > 0) {
                ((InterfaceC7322nq) AbstractC45353y.A01(this.A06)).ADV(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0R, reason: merged with bridge method [inline-methods] */
    public void A0e(InterfaceC5356HY interfaceC5356HY) {
        this.A08 = interfaceC5356HY;
        this.A03 = interfaceC5356HY.A7t();
        this.A0C = !this.A0B && interfaceC5356HY.A7t() == -9223372036854775807L;
        this.A00 = this.A0C ? 7 : 1;
        this.A0V.AG0(this.A03, interfaceC5356HY.AAj(), this.A0C);
        if (!this.A0G) {
            A0F();
        }
    }

    private boolean A0S() {
        return this.A05 != -9223372036854775807L;
    }

    private boolean A0T() {
        return this.A0E || A0S();
    }

    private boolean A0U(C7319nn c7319nn, int i) {
        if (this.A0B || (this.A08 != null && this.A08.A7t() != -9223372036854775807L)) {
            this.A02 = i;
            return true;
        }
        if (this.A0G && !A0T()) {
            this.A0F = true;
            return false;
        }
        this.A0E = this.A0G;
        this.A04 = 0L;
        this.A02 = 0;
        for (C7306na c7306na : this.A0L) {
            c7306na.A0Z();
        }
        c7319nn.A04(0L, 0L);
        return true;
    }

    private boolean A0V(boolean[] zArr, long j) {
        int length = this.A0L.length;
        for (int i = 0; i < length; i++) {
            if (!this.A0L[i].A0f(j, false) && (zArr[i] || !this.A0A)) {
                return false;
            }
        }
        return true;
    }

    public final int A0X(int i, long j) {
        if (A0T()) {
            return 0;
        }
        A0K(i);
        C7306na c7306na = this.A0L[i];
        int iA0Q = c7306na.A0Q(j, this.A0D);
        c7306na.A0a(iA0Q);
        if (iA0Q == 0) {
            A0L(i);
        }
        return iA0Q;
    }

    public final int A0Y(int i, C47226z c47226z, C7393p0 c7393p0, int i2) {
        if (A0T()) {
            return -3;
        }
        A0K(i);
        int result = this.A0L[i].A0R(c47226z, c7393p0, i2, this.A0D);
        if (result == -3) {
            A0L(i);
        }
        return result;
    }

    public final InterfaceC5361Hd A0Z() {
        return A06(new C5094DJ(0, true));
    }

    public final void A0a() {
        if (this.A0G) {
            for (C7306na c7306na : this.A0L) {
                c7306na.A0X();
            }
        }
        this.A0Y.A0C(this);
        this.A0O.removeCallbacksAndMessages(null);
        this.A06 = null;
        this.A0H = true;
    }

    public final /* synthetic */ void A0b() {
        if (!this.A0H) {
            ((InterfaceC7322nq) AbstractC45353y.A01(this.A06)).ADV(this);
        }
    }

    public final /* synthetic */ void A0c() {
        this.A0B = true;
    }

    public final void A0d(int i) throws IOException {
        this.A0L[i].A0W();
        A0J();
    }

    public final boolean A0f(int i) {
        return !A0T() && this.A0L[i].A0g(this.A0D);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5108DX
    @MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4s(long j) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7321np
    public final boolean A5C(long j) {
        if (this.A0D || this.A0Y.A0D() || this.A0F) {
            return false;
        }
        if (this.A0G && this.A01 == 0) {
            return false;
        }
        boolean zA04 = this.A0P.A04();
        boolean continuedLoading = this.A0Y.A0E();
        if (!continuedLoading) {
            A0H();
            return true;
        }
        return zA04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7321np
    public final void A60(long j, boolean z) {
        A0E();
        if (A0S()) {
            return;
        }
        boolean[] zArr = this.A07.A01;
        int length = this.A0L.length;
        for (int i = 0; i < length; i++) {
            C7306na[] c7306naArr = this.A0L;
            String[] strArr = A0f;
            String str = strArr[6];
            String str2 = strArr[7];
            int trackCount = str.length();
            if (trackCount == str2.length()) {
                throw new RuntimeException();
            }
            A0f[0] = "xFMIvf7swbs88yH1ASsn";
            c7306naArr[i].A0c(j, z, zArr[i]);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5332HA
    public final void A6O() {
        this.A0I = true;
        this.A0O.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7321np
    public final long A6r(long j, C47797u c47797u) {
        A0E();
        if (!this.A08.AAj()) {
            return 0L;
        }
        C5355HX c5355hxA91 = this.A08.A91(j);
        long j2 = c5355hxA91.A00.A01;
        String[] strArr = A0f;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[2] = "A6SKS5Ejxr3dBguC5asmpR7Eo1U8ekaX";
        strArr2[5] = "H67kjT3j1V6FB1MougrbLEHHMAKkStlF";
        return c47797u.A00(j, j2, c5355hxA91.A01.A01);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5108DX
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Added in D9949576 for unstall buffer")
    public final long A76(long j) {
        if (this.A0d && !this.A0G) {
            return 0L;
        }
        if (this.A0D) {
            return this.A03 - j;
        }
        return A78() - j;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC7321np
    public final long A78() {
        C7306na[] c7306naArr;
        int length;
        int trackCount;
        A0E();
        if (this.A0D || this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        boolean zA0S = A0S();
        String[] strArr = A0f;
        if (strArr[1].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0f[0] = "YocKG9EsUqAPXBELOuFE";
        if (zA0S) {
            return this.A05;
        }
        long jA03 = Long.MAX_VALUE;
        if (this.A0A) {
            int length2 = this.A0L.length;
            for (int i = 0; i < length2; i++) {
                if (this.A07.A02[i]) {
                    C5095DK c5095dk = this.A07;
                    if (A0f[3].length() == 29) {
                        throw new RuntimeException();
                    }
                    A0f[0] = "CWn0xvSWDOv6yRiyH00v";
                    if (c5095dk.A01[i]) {
                        C7306na[] c7306naArr2 = this.A0L;
                        String[] strArr2 = A0f;
                        String str = strArr2[2];
                        String str2 = strArr2[5];
                        int iCharAt = str.charAt(7);
                        int trackCount2 = str2.charAt(7);
                        if (iCharAt != trackCount2) {
                            if (!c7306naArr2[i].A0e()) {
                                c7306naArr = this.A0L;
                                String[] strArr3 = A0f;
                                String str3 = strArr3[6];
                                String str4 = strArr3[7];
                                length = str3.length();
                                trackCount = str4.length();
                                if (length != trackCount) {
                                    String[] strArr4 = A0f;
                                    strArr4[2] = "XlyJfiuja8URoHVDmmAk9tswNdXWeReZ";
                                    strArr4[5] = "M3k0l25jfFhaASrq1DtlqcrTUVRM508s";
                                    jA03 = Math.min(jA03, c7306naArr[i].A0T());
                                } else {
                                    jA03 = Math.min(jA03, c7306naArr[i].A0T());
                                }
                            }
                        } else {
                            String[] strArr5 = A0f;
                            strArr5[6] = "r97slta5r";
                            strArr5[7] = "NJT5wUbHJHvk";
                            if (!c7306naArr2[i].A0e()) {
                                c7306naArr = this.A0L;
                                String[] strArr6 = A0f;
                                String str5 = strArr6[6];
                                String str6 = strArr6[7];
                                length = str5.length();
                                trackCount = str6.length();
                                if (length != trackCount) {
                                    String[] strArr7 = A0f;
                                    strArr7[2] = "XlyJfiuja8URoHVDmmAk9tswNdXWeReZ";
                                    strArr7[5] = "M3k0l25jfFhaASrq1DtlqcrTUVRM508s";
                                    jA03 = Math.min(jA03, c7306naArr[i].A0T());
                                } else {
                                    jA03 = Math.min(jA03, c7306naArr[i].A0T());
                                }
                            }
                        }
                    }
                }
            }
        }
        if (jA03 == Long.MAX_VALUE) {
            jA03 = A03(false);
        }
        if (jA03 == Long.MIN_VALUE) {
            return this.A04;
        }
        return jA03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7321np
    public final long A8b() {
        return A78();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7321np
    public final C7302nW A9M() {
        A0E();
        return this.A07.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7321np
    public final void ACS() throws IOException {
        A0J();
        if (this.A0D && !this.A0G) {
            if (this.A0c) {
                throw C44963K.A01(A0B(90, 54, 63) + (this.A0N != null ? this.A0N.toString() : A0B(164, 4, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE)), null);
            }
            throw C44963K.A01(A0B(42, 48, 50), null);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5221FM
    public final void AEj() {
        for (C7306na c7306na : this.A0L) {
            c7306na.A0Y();
        }
        this.A0U.AHb();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5100DP
    public final void AGL(C7472qI c7472qI) {
        this.A0O.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7321np
    public final void AH5(InterfaceC7322nq interfaceC7322nq, long j) {
        this.A06 = interfaceC7322nq;
        this.A0P.A04();
        A0H();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7321np
    public final long AHQ() {
        if (!this.A0E) {
            return -9223372036854775807L;
        }
        boolean z = this.A0D;
        if (A0f[0].length() == 20) {
            String[] strArr = A0f;
            strArr[1] = "";
            strArr[4] = "OLDtf0M6xpFiQAaUF2mFzXoKXa03XjZ";
            if (z || A00() > this.A02) {
                this.A0E = false;
                long j = this.A04;
                if (A0f[0].length() == 20) {
                    String[] strArr2 = A0f;
                    strArr2[6] = "30bUCuPdV";
                    strArr2[7] = "qvk1tPvPLdJz";
                    return j;
                }
            } else {
                return -9223372036854775807L;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7321np
    public final void AHW(long j) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5332HA
    public final void AJ7(final InterfaceC5356HY interfaceC5356HY) {
        this.A0O.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.DE
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0e(interfaceC5356HY);
            }
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7321np
    public final long AJ8(@MetaExoPlayerCustomization long j, boolean z) {
        A0E();
        boolean[] zArr = this.A07.A02;
        if (!this.A08.AAj()) {
            j = 0;
        }
        int i = 0;
        this.A0E = false;
        this.A04 = j;
        if (A0S()) {
            this.A05 = j;
            return j;
        }
        if (this.A00 != 7 && A0V(zArr, j)) {
            return j;
        }
        this.A0F = false;
        this.A05 = j;
        this.A0D = false;
        if (this.A0Y.A0E()) {
            C7306na[] c7306naArr = this.A0L;
            int length = c7306naArr.length;
            while (i < length) {
                c7306naArr[i].A0V();
                String[] strArr = A0f;
                if (strArr[6].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0f;
                strArr2[2] = "OrOS7Vhjp4VBbz175mMxq2SuFvjpl5bQ";
                strArr2[5] = "EAKZg7yj0ctHJiN4FHg90oFZJxg2ecfG";
                i++;
            }
            this.A0Y.A09();
            return j;
        }
        this.A0Y.A0A();
        C7306na[] c7306naArr2 = this.A0L;
        int length2 = c7306naArr2.length;
        while (i < length2) {
            c7306naArr2[i].A0Z();
            String[] strArr3 = A0f;
            if (strArr3[2].charAt(7) != strArr3[5].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0f;
            strArr4[6] = "p5drqiHAR";
            strArr4[7] = "h8TdfbRbJweW";
            i++;
        }
        return j;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5108DX
    @MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AJc(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5332HA
    public final InterfaceC5361Hd AKS(int i, int i2) {
        return A06(new C5094DJ(i, false));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5108DX
    @MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AKb(byte b) {
    }
}
