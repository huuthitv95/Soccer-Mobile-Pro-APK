package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9h */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C48739h extends AbstractC7283nD {
    public static byte[] A07;
    public static String[] A08 = {"yr7s5jzv1addyUjDczkFmKgb3TbXTjPI", "k5bxDF12X7IfueMvpCyLhsS14secbcRr", "A1nn9z9SPvnfAziOnMuSk0GZzxZ0jVfY", "Bn8GSVMc2Ww3cTp6j1ZQIVGuo4fvIYJ3", "KOSGSA", "kbDMqlVGuQuF7sZpY9G1V32bVqx23m", "bfxskyCfRQ3e5JfVyMYK1TBq", "KPf5jweXKATwb3ocWNu711OjnnCWcsTU"};
    public static final AbstractC7474qK<Integer> A09;
    public static final AbstractC7474qK<Integer> A0A;
    public C7478qQ A00;
    public C48749i A01;
    public C5178Ef A02;
    public final Context A03;
    public final InterfaceC5185Em A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("D25277746")
    private <T extends AbstractC5180Eh<T>> Pair<C5184El, Integer> A0A(int i, C5187Eo c5187Eo, int[][][] iArr, InterfaceC5179Eg<T> interfaceC5179Eg, Comparator<List<T>> comparator) {
        List arrayList;
        ArrayList arrayList2 = new ArrayList();
        int iA02 = c5187Eo.A02();
        for (int i2 = 0; i2 < iA02; i2++) {
            if (i == c5187Eo.A03(i2)) {
                C7302nW c7302nWA07 = c5187Eo.A07(i2);
                for (int i3 = 0; i3 < c7302nWA07.A01; i3++) {
                    C7435pg c7435pgA05 = c7302nWA07.A05(i3);
                    List<T> listA5F = interfaceC5179Eg.A5F(i2, c7435pgA05, iArr[i2][i3]);
                    boolean[] zArr = new boolean[c7435pgA05.A01];
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i4 = 0;
                    while (true) {
                        int i5 = c7435pgA05.A01;
                        if (A08[4].length() != 6) {
                            throw new RuntimeException();
                        }
                        A08[7] = "GGTbcpljDMs4NAqJNauGpoXnSvHOQ6AN";
                        if (i4 < i5) {
                            T t = listA5F.get(i4);
                            int iA08 = t.A08();
                            if (!zArr[i4] && iA08 != 0) {
                                if (iA08 == 1) {
                                    arrayList = AbstractC4978BP.A04(t);
                                    arrayList3.add(t);
                                } else {
                                    arrayList = new ArrayList();
                                    arrayList.add(t);
                                    int i6 = i4 + 1;
                                    while (i6 < c7435pgA05.A01) {
                                        T t2 = listA5F.get(i6);
                                        if (t2.A08() == 2 && t.A09(t2)) {
                                            arrayList.add(t2);
                                            zArr[i6] = true;
                                        }
                                        i6++;
                                        if (A08[1].charAt(16) == 'p') {
                                            A08[7] = "CPvHWQWYEszLaRsxiIiXKw3X1jOClslA";
                                        }
                                    }
                                }
                                arrayList4.add(arrayList);
                            }
                            i4++;
                        }
                    }
                    if (this.A01.A0A && !arrayList3.isEmpty() && arrayList3.size() == c7435pgA05.A01) {
                        arrayList4.clear();
                        if (A08[1].charAt(16) != 'p') {
                            A08[4] = "67hsDi";
                            arrayList4.add(arrayList3);
                        } else {
                            A08[4] = "yJ8LwG";
                            arrayList4.add(arrayList3);
                        }
                    }
                    arrayList2.addAll(arrayList4);
                }
            }
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        if (A08[1].charAt(16) != 'p') {
            throw new RuntimeException();
        }
        A08[4] = "ji0WxR";
        if (zIsEmpty) {
            return null;
        }
        List list = (List) Collections.max(arrayList2, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((AbstractC5180Eh) list.get(i7)).A01;
        }
        AbstractC5180Eh abstractC5180Eh = (AbstractC5180Eh) list.get(0);
        return Pair.create(new C5184El(abstractC5180Eh.A03, iArr2), Integer.valueOf(abstractC5180Eh.A00));
    }

    public static String A0J(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A08[5].length() == 27) {
                throw new RuntimeException();
            }
            A08[4] = "58VoVy";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 10);
            i4++;
        }
    }

    public static void A0M() {
        A07 = new byte[]{91, 92, -112, 127, -124, -118, 59, 126, -125, 124, -119, -119, -128, -121, 59, 126, -118, -112, -119, -113, 59, 126, -118, -119, -114, -113, -115, 124, -124, -119, -113, -114, 59, 126, 124, -119, -119, -118, -113, 59, 125, -128, 59, 124, -117, -117, -121, -124, -128, 127, 59, -110, -124, -113, -125, -118, -112, -113, 59, -115, -128, -127, -128, -115, -128, -119, 126, -128, 59, -113, -118, 59, 94, -118, -119, -113, -128, -109, -113, 73, 59, 93, -112, -124, -121, 127, 59, -113, -125, -128, 59, -113, -115, 124, 126, -122, 59, -114, -128, -121, -128, 126, -113, -118, -115, 59, -124, -119, -114, -113, 124, -119, 126, -128, 59, -110, -124, -113, -125, 59, -118, -119, -128, 59, -118, -127, 59, -113, -125, -128, 59, -119, -118, -119, 72, 127, -128, -117, -115, -128, 126, 124, -113, -128, 127, 59, 126, -118, -119, -114, -113, -115, -112, 126, -113, -118, -115, -114, 59, -113, -125, 124, -113, 59, -113, 124, -122, -128, 59, 124, 59, 94, -118, -119, -113, -128, -109, -113, 59, 124, -115, -126, -112, -120, -128, -119, -113, 73, -103, -70, -69, -74, -54, -63, -55, -87, -57, -74, -72, -64, -88, -70, -63, -70, -72, -55, -60, -57, -57, -37, -54, -49, -43, -107, -57, -55, -103, -83, -63, -80, -75, -69, 123, -83, -81, -128, -49, -29, -46, -41, -35, -99, -45, -49, -47, -95, -70, -50, -67, -62, -56, -120, -66, -70, -68, -116, -122, -61, -56, -68, -54, -61, -71, -119, 124, 119, 120, -126, 66, 116, -119, 67, 68, -98, -111, -116, -115, -105, 87, -119, -98, -117, -33, -46, -51, -50, -40, -104, -51, -40, -43, -53, -30, -106, -33, -46, -36, -46, -40, -41, -92, -105, -110, -109, -99, 93, -106, -109, -92, -111, -11, -24, -29, -28, -18, -82, -9, -84, -11, -19, -29, -83, -18, -19, -79, -83, -11, -17, -72};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0N(C7302nW c7302nW, C7431pc c7431pc, Map<Integer, C7433pe> map) {
        C7433pe c7433pe;
        for (int i = 0; i < c7302nW.A01; i++) {
            C7433pe c7433pe2 = c7431pc.A0G.get(c7302nW.A05(i));
            if (c7433pe2 != null && ((c7433pe = map.get(Integer.valueOf(c7433pe2.A01()))) == null || (c7433pe.A01.isEmpty() && !c7433pe2.A01.isEmpty()))) {
                map.put(Integer.valueOf(c7433pe2.A01()), c7433pe2);
            }
        }
    }

    static {
        A0M();
        A09 = AbstractC7474qK.A04(new Comparator() { // from class: com.facebook.ads.redexgen.X.EZ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C48739h.A05((Integer) obj, (Integer) obj2);
            }
        });
        A0A = AbstractC7474qK.A04(new Comparator() { // from class: com.facebook.ads.redexgen.X.Ea
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C48739h.A06((Integer) obj, (Integer) obj2);
            }
        });
    }

    @Deprecated
    public C48739h() {
        this(C48749i.A0J, new C7297nR());
    }

    @MetaExoPlayerCustomization(type = {"NEW_CONSTRUCTOR"}, value = "Backward Compatible Constructor")
    public C48739h(InterfaceC5185Em interfaceC5185Em) {
        this(C48749i.A0J, interfaceC5185Em);
    }

    @Deprecated
    public C48739h(C7431pc c7431pc, InterfaceC5185Em interfaceC5185Em) {
        this(c7431pc, interfaceC5185Em, null);
    }

    public C48739h(C7431pc c7431pc, InterfaceC5185Em interfaceC5185Em, Context context) {
        this.A05 = new Object();
        this.A03 = context != null ? context.getApplicationContext() : null;
        this.A04 = interfaceC5185Em;
        if (c7431pc instanceof C48749i) {
            this.A01 = (C48749i) c7431pc;
        } else {
            C48749i defaultParameters = context == null ? C48749i.A0J : C48749i.A02(context);
            this.A01 = defaultParameters.A0P().A0u(c7431pc).A0p();
        }
        this.A00 = C7478qQ.A07;
        this.A06 = context != null && AbstractC46115C.A18(context);
        if (!this.A06 && context != null && AbstractC46115C.A02 >= 32) {
            this.A02 = C5178Ef.A00(context);
        }
        if (this.A01.A08 && context == null) {
            AbstractC45794g.A07(A0J(188, 20, 75), A0J(1, 187, 17));
        }
    }

    public static int A00(int i, int i2) {
        if (i != 0 && i == i2) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount(i & i2);
    }

    public static int A02(C7472qI c7472qI, String str, boolean z) {
        String strA0K;
        if (TextUtils.isEmpty(str)) {
            String strA0K2 = A0K(str);
            strA0K = A0K(c7472qI.A0V);
            if (strA0K != null) {
            }
            if (z) {
                return 0;
            }
        }
        String str2 = c7472qI.A0V;
        String[] strArr = A08;
        if (strArr[6].length() != strArr[3].length()) {
            A08[7] = "utaRfuDCbQDIc6IM3a2tNPgwwhECnGgZ";
            if (str.equals(str2)) {
                if (A08[4].length() != 6) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[6] = "bdPum8qTTDlHeCQDHcvgSGFt";
                strArr2[3] = "zx28NE7Z14W3AzzAuoWnzSjL1M2eUdTs";
                return 4;
            }
            String strA0K3 = A0K(str);
            strA0K = A0K(c7472qI.A0V);
            if (strA0K != null || strA0K3 == null) {
                return (z && strA0K == null) ? 1 : 0;
            }
            if (strA0K.startsWith(strA0K3) || strA0K3.startsWith(strA0K)) {
                return 3;
            }
            String strA0J = A0J(0, 1, 36);
            String str3 = AbstractC46115C.A1P(strA0K, strA0J)[0];
            String formatMainLanguage = AbstractC46115C.A1P(strA0K3, strA0J)[0];
            String[] strArr3 = A08;
            String str4 = strArr3[6];
            String formatLanguage = strArr3[3];
            if (str4.length() != formatLanguage.length()) {
                A08[4] = "rXSrCW";
                if (!str3.equals(formatMainLanguage)) {
                    return 0;
                }
                return 2;
            }
        }
        throw new RuntimeException();
    }

    public static int A03(C7435pg c7435pg, int i, int i2, boolean z) {
        if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        int i3 = Integer.MAX_VALUE;
        for (int videoPixels = 0; videoPixels < maxVideoPixelsToRetain; videoPixels++) {
            C7472qI c7472qIA08 = c7435pg.A08(videoPixels);
            int maxVideoPixelsToRetain = c7472qIA08.A0L;
            if (maxVideoPixelsToRetain > 0) {
                int maxVideoPixelsToRetain2 = c7472qIA08.A0A;
                if (maxVideoPixelsToRetain2 > 0) {
                    int i4 = c7472qIA08.A0L;
                    int maxVideoPixelsToRetain3 = c7472qIA08.A0A;
                    Point pointA09 = A09(z, i, i2, i4, maxVideoPixelsToRetain3);
                    int i5 = c7472qIA08.A0L;
                    int maxVideoPixelsToRetain4 = c7472qIA08.A0A;
                    int i6 = i5 * maxVideoPixelsToRetain4;
                    int i7 = c7472qIA08.A0L;
                    int maxVideoPixelsToRetain5 = pointA09.x;
                    if (i7 >= ((int) (maxVideoPixelsToRetain5 * 0.98f))) {
                        int i8 = c7472qIA08.A0A;
                        int maxVideoPixelsToRetain6 = pointA09.y;
                        if (i8 >= ((int) (maxVideoPixelsToRetain6 * 0.98f)) && i6 < i3) {
                            i3 = i6;
                        }
                    }
                }
            }
        }
        return i3;
    }

    public static /* synthetic */ int A05(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        if (A08[4].length() != 6) {
            throw new RuntimeException();
        }
        A08[1] = "gB7bm57sTKDjvfC8pNahT9wGVNX6TDKL";
        return iIntValue - iIntValue2;
    }

    public static /* synthetic */ int A06(Integer num, Integer num2) {
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0089 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0013 A[RETURN] */
    public static int A07(String str) {
        byte b;
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals(A0J(272, 18, 95))) {
                    b = 0;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 5;
                    case 1:
                        return 4;
                    case 2:
                        return 3;
                    case 3:
                        return 2;
                    case 4:
                        return 1;
                    default:
                        return 0;
                }
            case -1662735862:
                String[] strArr = A08;
                if (strArr[6].length() != strArr[3].length()) {
                    A08[1] = "cKYBOGEqW486lDdcpu93NQ9TicEen6vk";
                    if (str.equals(A0J(253, 10, 9))) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    switch (b) {
                        case 0:
                            return 5;
                        case 1:
                            return 4;
                        case 2:
                            return 3;
                        case 3:
                            return 2;
                        case 4:
                            return 1;
                        default:
                            return 0;
                    }
                }
                throw new RuntimeException();
            case -1662541442:
                if (str.equals(A0J(290, 10, 36))) {
                    b = 2;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 5;
                    case 1:
                        return 4;
                    case 2:
                        return 3;
                    case 3:
                        return 2;
                    case 4:
                        return 1;
                    default:
                        return 0;
                }
            case 1331836730:
                if (str.equals(A0J(263, 9, 30))) {
                    b = 4;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 5;
                    case 1:
                        return 4;
                    case 2:
                        return 3;
                    case 3:
                        return 2;
                    case 4:
                        return 1;
                    default:
                        return 0;
                }
            case 1599127257:
                if (str.equals(A0J(300, 19, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE))) {
                    b = 3;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 5;
                    case 1:
                        return 4;
                    case 2:
                        return 3;
                    case 3:
                        return 2;
                    case 4:
                        return 1;
                    default:
                        return 0;
                }
            default:
                b = -1;
                switch (b) {
                    case 0:
                        return 5;
                    case 1:
                        return 4;
                    case 2:
                        return 3;
                    case 3:
                        return 2;
                    case 4:
                        return 1;
                    default:
                        return 0;
                }
        }
    }

    @MetaExoPlayerCustomization("Made public in D13395849")
    public static Point A09(boolean z, int tempViewportWidth, int i, int i2, int i3) {
        if (z) {
            if ((i2 > i3) != (tempViewportWidth > i)) {
                tempViewportWidth = i;
                i = tempViewportWidth;
            }
        }
        if (i2 * i >= i3 * tempViewportWidth) {
            return new Point(tempViewportWidth, AbstractC46115C.A05(tempViewportWidth * i3, i2));
        }
        return new Point(AbstractC46115C.A05(i * i2, i3), i);
    }

    private final Pair<C5184El, Integer> A0B(C5187Eo c5187Eo, int[][][] iArr, final C48749i c48749i, final String str) throws C4904AD {
        return A0A(3, c5187Eo, iArr, new InterfaceC5179Eg() { // from class: com.facebook.ads.redexgen.X.nN
            @Override // com.facebook.ads.redexgen.core.InterfaceC5179Eg
            public final List A5F(int i, C7435pg c7435pg, int[] iArr2) {
                return C7286nG.A02(i, c7435pg, c48749i, iArr2, str);
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.EY
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C7286nG.A01((List) obj, (List) obj2);
            }
        });
    }

    private final Pair<C5184El, Integer> A0C(C5187Eo c5187Eo, int[][][] iArr, int[] iArr2, final C48749i c48749i) throws C4904AD {
        final boolean z = false;
        for (int i = 0; i < c5187Eo.A02(); i++) {
            if (2 == c5187Eo.A03(i) && c5187Eo.A07(i).A01 > 0) {
                z = true;
                break;
            }
        }
        return A0A(1, c5187Eo, iArr, new InterfaceC5179Eg() { // from class: com.facebook.ads.redexgen.X.nO
            @Override // com.facebook.ads.redexgen.core.InterfaceC5179Eg
            public final List A5F(int i2, C7435pg c7435pg, int[] iArr3) {
                return this.A01.A0e(c48749i, z, i2, c7435pg, iArr3);
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.EX
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C7292nM.A02((List) obj, (List) obj2);
            }
        });
    }

    private final Pair<C5184El, Integer> A0D(C5187Eo c5187Eo, int[][][] iArr, final int[] iArr2, final C48749i c48749i, final String str) throws C4904AD {
        return A0A(2, c5187Eo, iArr, new InterfaceC5179Eg() { // from class: com.facebook.ads.redexgen.X.nQ
            @Override // com.facebook.ads.redexgen.core.InterfaceC5179Eg
            public final List A5F(int i, C7435pg c7435pg, int[] iArr3) {
                return C7285nF.A06(i, c7435pg, c48749i, iArr3, str, iArr2[i]);
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.EW
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C7285nF.A05((List) obj, (List) obj2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0077  */
    private final C5184El A0E(int i, C7302nW c7302nW, int[][] iArr, C48749i c48749i) throws C4904AD {
        C7435pg c7435pg = null;
        int i2 = 0;
        C5175Ec c5175Ec = null;
        for (int i3 = 0; i3 < c7302nW.A01; i3++) {
            C7435pg trackGroup = c7302nW.A05(i3);
            int[] iArr2 = iArr[i3];
            int groupIndex = 0;
            while (true) {
                int i4 = trackGroup.A01;
                int selectedTrackIndex = A08[7].charAt(4);
                if (selectedTrackIndex != 114) {
                    A08[7] = "eXe48tlcaaFOVphj3tBJsJZ33XViaUIe";
                    if (groupIndex < i4) {
                        int i5 = iArr2[groupIndex];
                        int selectedTrackIndex2 = A08[7].charAt(4);
                        if (selectedTrackIndex2 == 114) {
                            throw new RuntimeException();
                        }
                        A08[7] = "FFBXZuvHsKfXoft1igGzNsuMgLJqlaBK";
                        if (A0S(i5, c48749i.A0B)) {
                            C5175Ec trackScore = new C5175Ec(trackGroup.A08(groupIndex), iArr2[groupIndex]);
                            if (c5175Ec != null) {
                                int iA00 = trackScore.compareTo(c5175Ec);
                                String[] strArr = A08;
                                String str = strArr[0];
                                String str2 = strArr[2];
                                int selectedTrackIndex3 = str.charAt(9);
                                if (selectedTrackIndex3 != str2.charAt(9)) {
                                    A08[1] = "us6BKPnONaHSk6j2pgBHNNPTLKUclzqr";
                                    if (iA00 > 0) {
                                        c7435pg = trackGroup;
                                        i2 = groupIndex;
                                        c5175Ec = trackScore;
                                    }
                                }
                            } else {
                                c7435pg = trackGroup;
                                i2 = groupIndex;
                                c5175Ec = trackScore;
                            }
                        }
                        groupIndex++;
                    }
                }
                throw new RuntimeException();
            }
        }
        if (c7435pg == null) {
            return null;
        }
        return new C5184El(c7435pg, i2);
    }

    public static String A0K(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, A0J(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 3, 75))) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L() {
        boolean z;
        synchronized (this.A05) {
            z = this.A01.A08 && !this.A06 && AbstractC46115C.A02 >= 32 && this.A02 != null && this.A02.A06();
        }
        if (z) {
            A01();
        }
    }

    public static void A0P(C5187Eo c5187Eo, C7431pc c7431pc, C5184El[] c5184ElArr) {
        C5184El c5184El;
        int iA02 = c5187Eo.A02();
        HashMap map = new HashMap();
        for (int i = 0; i < iA02; i++) {
            A0N(c5187Eo.A07(i), c7431pc, map);
        }
        A0N(c5187Eo.A06(), c7431pc, map);
        for (int i2 = 0; i2 < iA02; i2++) {
            int rendererCount = c5187Eo.A03(i2);
            C7433pe c7433pe = (C7433pe) map.get(Integer.valueOf(rendererCount));
            if (c7433pe != null) {
                boolean zIsEmpty = c7433pe.A01.isEmpty();
                if (A08[7].charAt(4) == 'r') {
                    throw new RuntimeException();
                }
                A08[4] = "YbaSeo";
                if (!zIsEmpty && c5187Eo.A07(i2).A04(c7433pe.A00) != -1) {
                    c5184El = new C5184El(c7433pe.A00, AbstractC4945As.A0B(c7433pe.A01));
                } else {
                    c5184El = null;
                }
                c5184ElArr[i2] = c5184El;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    public static void A0Q(C5187Eo c5187Eo, C48749i c48749i, C5184El[] c5184ElArr) {
        C5184El c5184El;
        int iA02 = c5187Eo.A02();
        for (int i = 0; i < iA02; i++) {
            C7302nW c7302nWA07 = c5187Eo.A07(i);
            if (c48749i.A0S(i, c7302nWA07)) {
                C7287nH c7287nHA0Q = c48749i.A0Q(i, c7302nWA07);
                String[] strArr = A08;
                String str = strArr[6];
                String str2 = strArr[3];
                int rendererIndex = str.length();
                int rendererCount = str2.length();
                if (rendererIndex == rendererCount) {
                    throw new RuntimeException();
                }
                A08[5] = "K8f1XF422sl3cXXm";
                if (c7287nHA0Q != null) {
                    int length = c7287nHA0Q.A03.length;
                    String[] strArr2 = A08;
                    String str3 = strArr2[6];
                    String str4 = strArr2[3];
                    int rendererIndex2 = str3.length();
                    int rendererCount2 = str4.length();
                    if (rendererIndex2 == rendererCount2) {
                        throw new RuntimeException();
                    }
                    A08[4] = "KnBpd5";
                    if (length != 0) {
                        int rendererCount3 = c7287nHA0Q.A00;
                        C7435pg c7435pgA05 = c7302nWA07.A05(rendererCount3);
                        int[] iArr = c7287nHA0Q.A03;
                        int rendererIndex3 = c7287nHA0Q.A02;
                        c5184El = new C5184El(c7435pgA05, iArr, rendererIndex3);
                    } else {
                        c5184El = null;
                    }
                } else {
                    c5184El = null;
                }
                c5184ElArr[i] = c5184El;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (r4 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r4 != 2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r4 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0R(com.facebook.ads.redexgen.core.C5187Eo r11, int[][][] r12, com.facebook.ads.redexgen.core.C47777s[] r13, com.facebook.ads.redexgen.core.InterfaceC7284nE[] r14) {
        /*
            r9 = -1
            r8 = -1
            r10 = 1
            r7 = 0
        L4:
            int r3 = r11.A02()
            r6 = -1
            r5 = 1
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C48739h.A08
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 6
            if (r1 == r0) goto L1c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L1c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C48739h.A08
            java.lang.String r1 = "NZY9D9dgjYLNZ0XYpF4W2GrX5uVEwVhV"
            r0 = 1
            r2[r0] = r1
            if (r7 >= r3) goto L5e
            int r4 = r11.A03(r7)
            r3 = r14[r7]
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C48739h.A08
            r0 = 0
            r1 = r2[r0]
            r0 = 2
            r2 = r2[r0]
            r0 = 9
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L76
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C48739h.A08
            java.lang.String r1 = "nPMicF"
            r0 = 4
            r2[r0] = r1
            if (r4 == r5) goto L4b
        L48:
            r0 = 2
            if (r4 != r0) goto L88
        L4b:
            if (r3 == 0) goto L88
            r1 = r12[r7]
            com.facebook.ads.redexgen.X.nW r0 = r11.A07(r7)
            boolean r0 = A0W(r1, r0, r3)
            if (r0 == 0) goto L88
            if (r4 != r5) goto L72
            if (r9 == r6) goto L85
            r10 = 0
        L5e:
            if (r9 == r6) goto L70
            if (r8 == r6) goto L70
            r0 = 1
        L63:
            r10 = r10 & r0
            if (r10 == 0) goto L6f
            com.facebook.ads.redexgen.X.7s r0 = new com.facebook.ads.redexgen.X.7s
            r0.<init>(r5)
            r13[r9] = r0
            r13[r8] = r0
        L6f:
            return
        L70:
            r0 = 0
            goto L63
        L72:
            if (r8 == r6) goto L87
            r10 = 0
            goto L5e
        L76:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C48739h.A08
            java.lang.String r1 = "5F5ko3NIDU1YMXmZZUDVXdSE"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "1c60xx4jFCOb1nSxKeVAoj10cRAS07b7"
            r0 = 3
            r2[r0] = r1
            if (r4 == r5) goto L4b
            goto L48
        L85:
            r9 = r7
            goto L88
        L87:
            r8 = r7
        L88:
            int r7 = r7 + 1
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C48739h.A0R(com.facebook.ads.redexgen.X.Eo, int[][][], com.facebook.ads.redexgen.X.7s[], com.facebook.ads.redexgen.X.nE[]):void");
    }

    @MetaExoPlayerCustomization("Made public for customization on DashManifestHelper")
    public static boolean A0S(int i, boolean z) {
        int iA03 = AbstractC47677i.A03(i);
        return iA03 == 4 || (z && iA03 == 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0T(C7472qI c7472qI) {
        boolean z;
        synchronized (this.A05) {
            z = !this.A01.A08 || this.A06 || c7472qI.A06 <= 2 || (A0U(c7472qI) && (AbstractC46115C.A02 < 32 || this.A02 == null || !this.A02.A06())) || (AbstractC46115C.A02 >= 32 && this.A02 != null && this.A02.A06() && this.A02.A04() && this.A02.A05() && this.A02.A07(this.A00, c7472qI));
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    public static boolean A0U(C7472qI c7472qI) {
        byte b;
        if (c7472qI.A0W == null) {
            return false;
        }
        String str = c7472qI.A0W;
        switch (str.hashCode()) {
            case -2123537834:
                if (!str.equals(A0J(236, 14, 79))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 187078296:
                if (!str.equals(A0J(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 9, 92))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 187078297:
                if (!str.equals(A0J(Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 9, 66))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 1504578661:
                if (!str.equals(A0J(Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 10, 100))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public static boolean A0W(int[][] iArr, C7302nW c7302nW, InterfaceC7284nE interfaceC7284nE) {
        if (interfaceC7284nE == null) {
            return false;
        }
        int iA04 = c7302nW.A04(interfaceC7284nE.A9L());
        for (int i = 0; i < interfaceC7284nE.length(); i++) {
            int trackGroupIndex = AbstractC47677i.A05(iArr[iA04][interfaceC7284nE.A8H(i)]);
            if (trackGroupIndex != 32) {
                return false;
            }
        }
        return true;
    }

    private final C5184El[] A0X(C5187Eo c5187Eo, int[][][] iArr, int[] iArr2, C48749i c48749i) throws C4904AD {
        String str;
        int iA02 = c5187Eo.A02();
        C5184El[] c5184ElArr = new C5184El[iA02];
        Pair<C5184El, Integer> pairA0C = A0C(c5187Eo, iArr, iArr2, c48749i);
        if (pairA0C != null) {
            Object obj = pairA0C.second;
            String[] strArr = A08;
            String str2 = strArr[0];
            String str3 = strArr[2];
            int iCharAt = str2.charAt(9);
            int rendererCount = str3.charAt(9);
            if (iCharAt == rendererCount) {
                throw new RuntimeException();
            }
            A08[7] = "yBKbxgl1qoYBYNtasAVV61g1RQWhRN9O";
            c5184ElArr[((Integer) obj).intValue()] = (C5184El) pairA0C.first;
        }
        if (pairA0C == null) {
            str = null;
        } else {
            C7435pg c7435pg = ((C5184El) pairA0C.first).A01;
            int rendererCount2 = ((C5184El) pairA0C.first).A02[0];
            str = c7435pg.A08(rendererCount2).A0V;
        }
        Pair<C5184El, Integer> pairA0D = A0D(c5187Eo, iArr, iArr2, c48749i, str);
        if (pairA0D != null) {
            c5184ElArr[((Integer) pairA0D.second).intValue()] = (C5184El) pairA0D.first;
        }
        Pair<C5184El, Integer> pairA0B = A0B(c5187Eo, iArr, c48749i, str);
        if (pairA0B != null) {
            c5184ElArr[((Integer) pairA0B.second).intValue()] = (C5184El) pairA0B.first;
        }
        for (int i = 0; i < iA02; i++) {
            int i2 = c5187Eo.A03(i);
            if (i2 != 2 && i2 != 1) {
                String[] strArr2 = A08;
                String str4 = strArr2[0];
                String str5 = strArr2[2];
                int iCharAt2 = str4.charAt(9);
                int rendererCount3 = str5.charAt(9);
                if (iCharAt2 == rendererCount3) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A08;
                strArr3[6] = "1xsmyE1OdjkvrsbXr4cEFZBV";
                strArr3[3] = "D4xPicyrc2caIP01Cw6NBhV2pRXBVsmG";
                if (i2 != 3) {
                    c5184ElArr[i] = A0E(i2, c5187Eo.A07(i), iArr[i], c48749i);
                }
            }
        }
        return c5184ElArr;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5195Ew
    public final boolean A0Y() {
        return true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00a3 */
    @Override // com.facebook.ads.redexgen.core.AbstractC7283nD
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"MERGED"}, value = "final removed in D35162315")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<com.facebook.ads.redexgen.core.C47777s[], com.facebook.ads.redexgen.core.InterfaceC7284nE[]> A0d(com.facebook.ads.redexgen.core.C5187Eo r10, int[][][] r11, int[] r12, com.facebook.ads.redexgen.core.C7320no r13, com.facebook.ads.androidx.media3.common.Timeline r14) throws java.lang.Throwable {
        /*
            r9 = this;
            r8 = r9
            java.lang.Object r2 = r8.A05
            monitor-enter(r2)
            com.facebook.ads.redexgen.X.9i r6 = r8.A01     // Catch: java.lang.Throwable -> La0
            boolean r0 = r6.A08     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L23
            int r1 = com.facebook.ads.redexgen.core.AbstractC46115C.A02     // Catch: java.lang.Throwable -> La0
            r0 = 32
            if (r1 < r0) goto L23
            com.facebook.ads.redexgen.X.Ef r0 = r8.A02     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L23
            com.facebook.ads.redexgen.X.Ef r1 = r8.A02     // Catch: java.lang.Throwable -> La0
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> La0
            java.lang.Object r0 = com.facebook.ads.redexgen.core.AbstractC45353y.A02(r0)     // Catch: java.lang.Throwable -> La0
            android.os.Looper r0 = (android.os.Looper) r0     // Catch: java.lang.Throwable -> La0
            r1.A03(r8, r0)     // Catch: java.lang.Throwable -> La0
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La0
            int r5 = r10.A02()
            com.facebook.ads.redexgen.X.El[] r7 = r8.A0X(r10, r11, r12, r6)
            A0P(r10, r6, r7)
            A0Q(r10, r6, r7)
            r4 = 0
        L33:
            r3 = 0
            if (r4 >= r5) goto L51
            int r2 = r10.A03(r4)
            boolean r0 = r6.A0R(r4)
            if (r0 != 0) goto L4c
            com.facebook.ads.redexgen.X.BO<java.lang.Integer> r1 = r6.A0H
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L4e
        L4c:
            r7[r4] = r3
        L4e:
            int r4 = r4 + 1
            goto L33
        L51:
            com.facebook.ads.redexgen.X.Em r1 = r8.A04
            com.facebook.ads.redexgen.X.F6 r0 = r9.A00()
            com.facebook.ads.redexgen.X.nE[] r4 = r1.A5b(r7, r0, r13, r14)
            com.facebook.ads.redexgen.X.7s[] r3 = new com.facebook.ads.redexgen.core.C47777s[r5]
            r2 = 0
        L5e:
            if (r2 >= r5) goto L94
            int r7 = r10.A03(r2)
            boolean r0 = r6.A0R(r2)
            if (r0 != 0) goto L76
            com.facebook.ads.redexgen.X.BO<java.lang.Integer> r1 = r6.A0H
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L92
        L76:
            r0 = 1
        L77:
            if (r0 != 0) goto L90
            int r1 = r10.A03(r2)
            r0 = -2
            if (r1 == r0) goto L84
            r0 = r4[r2]
            if (r0 == 0) goto L90
        L84:
            r0 = 1
        L85:
            if (r0 == 0) goto L8e
            com.facebook.ads.redexgen.X.7s r0 = com.facebook.ads.redexgen.core.C47777s.A01
        L89:
            r3[r2] = r0
            int r2 = r2 + 1
            goto L5e
        L8e:
            r0 = 0
            goto L89
        L90:
            r0 = 0
            goto L85
        L92:
            r0 = 0
            goto L77
        L94:
            boolean r0 = r6.A0D
            if (r0 == 0) goto L9b
            A0R(r10, r11, r3, r4)
        L9b:
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
            return r0
        La0:
            r0 = move-exception
        La1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r0 = move-exception
            goto La1
        La5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C48739h.A0d(com.facebook.ads.redexgen.X.Eo, int[][][], int[], com.facebook.ads.redexgen.X.no, com.facebook.ads.androidx.media3.common.Timeline):android.util.Pair");
    }

    public final /* synthetic */ AbstractC4978BP A0e(C48749i c48749i, boolean z, int i, C7435pg c7435pg, int[] iArr) {
        return C7292nM.A03(i, c7435pg, c48749i, iArr, z, new InterfaceC7143kj() { // from class: com.facebook.ads.redexgen.X.nP
            @Override // com.facebook.ads.redexgen.core.InterfaceC7143kj
            public final boolean A4C(Object obj) {
                return this.A00.A0T((C7472qI) obj);
            }
        });
    }
}
