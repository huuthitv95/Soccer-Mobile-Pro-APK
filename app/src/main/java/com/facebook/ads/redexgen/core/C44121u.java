package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1u */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C44121u implements InterfaceC4938Al {
    public static byte[] A09;
    public static String[] A0A = {"5g", "bfnfjiUri9kvxuLEKnZU3kJc1ieY23zz", "NIX", "B1MUzprhDDigVQ4p3NlPN3VyWdkPEAJB", "UzK", "rOCmuOM4l5uJjn2akKGm2JxYL79BUlOr", "kAulvLpzcmVynuK8kNGYEaaJbNqcwElD", "7ScKsdjGN77oK2tO1d"};
    public static final String A0B;
    public long A00;
    public InterfaceC7520rK A01;
    public final InterfaceC7519rJ A02;
    public final C7511rB A03;
    public final C7511rB A04;
    public final List<Rect> A05;
    public final Map<String, C7510rA> A06;
    public final boolean A07;
    public final boolean A08;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "GBjOApmdB9meVYu3h8dWYwSrfWPE5QmB";
            strArr2[6] = "rSzbUr5mB5cqWCHa6t40U5C3uIAdU8ry";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 73);
            i4++;
        }
    }

    public static void A03() {
        A09 = new byte[]{Ascii.DC4, 40, 41, 51, 96, 54, 41, 37, 55, 48, 47, 41, 46, 52, 96, 40, 33, 51, 96, 46, 47, 52, 96, 34, 37, 37, 46, 96, 45, 37, 33, 51, 53, 50, 37, 36, 96, 47, 50, 96, 41, 51, 96, 33, 96, 39, 50, 47, 53, 48, 96, 55, 40, 41, 35, 40, 96, 55, 41, 44, 44, 96, 46, 37, 54, 37, 50, 96, 50, 37, 52, 53, 50, 46, 96, 33, 96, 45, 37, 33, 51, 53, 50, 37, 45, 37, 46, 52, 96, 51, 41, 46, 35, 37, 96, 41, 52, 103, 51, 96, 45, 33, 36, 37, 96, 53, 48, 96, 47, 38, 96, 51, 53, 34, 54, 41, 37, 55, 51, 96, 52, 40, 33, 52, 96, 35, 47, 53, 44, 36, 96, 34, 37, 96, 47, 38, 38, 51, 35, 50, 37, 37, 46, Ascii.DLE, Ascii.ESC, 9, 45, Ascii.f22494GS, Ascii.f22502US, Ascii.DLE, Base64.padSymbol, 38, 63, 63, 115, 37, 58, 54, 36, 115, 35, 33, 60, 35, 54, 33, 39, 42, 115, 53, 60, 33, 115, 33, 54, 62, 60, 37, 54, 55, 115, 58, 39, 54, 62, 115, Ascii.f22498RS, 2, Ascii.f22503VT, Ascii.f22491EM, 63, 8, Ascii.f22494GS, 2, Ascii.f22502US, Ascii.f22491EM};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC4938Al
    public final void A6P(List<C7523rN<?, ?>> list) {
        if (list != null && !list.isEmpty()) {
            A06(list);
        }
        A05(this.A04);
        A04(this.A04);
        A05(this.A03);
        A04(this.A03);
        if (0 != 0) {
            new C7509r9(toString(), this, this.A05, this.A04.A00(), this.A03.A00());
            throw new NullPointerException(A02(143, 7, 55));
        }
    }

    static {
        A03();
        A0B = C44121u.class.getSimpleName();
    }

    public C44121u(InterfaceC7519rJ interfaceC7519rJ) {
        this(interfaceC7519rJ, false, false);
    }

    public C44121u(InterfaceC7519rJ interfaceC7519rJ, boolean z, boolean z2) {
        this.A06 = new HashMap();
        this.A04 = new C7511rB();
        this.A03 = new C7511rB();
        this.A05 = new ArrayList(1);
        this.A02 = interfaceC7519rJ;
        this.A08 = z;
        this.A07 = z2;
    }

    public static Rect A00(C7510rA c7510rA) {
        if (c7510rA == null || c7510rA.A02.top == Integer.MIN_VALUE || c7510rA.A02.left == Integer.MIN_VALUE || c7510rA.A02.right == Integer.MIN_VALUE || c7510rA.A02.bottom == Integer.MIN_VALUE) {
            throw new IllegalStateException(A02(0, 143, 9));
        }
        return c7510rA.A02;
    }

    private C7510rA A01(C7523rN c7523rN, Rect rect, Rect rect2) {
        C7510rA c7510rAA03 = this.A06.get(c7523rN.A02);
        if (this.A04.A06(c7523rN)) {
            if (c7510rAA03 != null) {
                c7510rAA03.A01 = EnumC7514rE.A04;
            } else {
                c7510rAA03 = C7510rA.A03(this.A00);
                this.A06.put(c7523rN.A02, c7510rAA03);
            }
        }
        if (c7510rAA03 != null) {
            c7510rAA03.A02.set(rect2);
            c7510rAA03.A03.add(new Rect(rect));
        }
        return c7510rAA03;
    }

    private void A04(C7511rB c7511rB) {
        for (C7523rN c7523rN : c7511rB.A01()) {
            C7510rA c7510rA = this.A06.get(c7523rN.A02);
            if (c7510rA == null) {
                if (0 != 0) {
                    String str = A02(150, 36, 26) + c7523rN.A02;
                    throw new NullPointerException(A02(186, 10, 36));
                }
            } else {
                c7510rA.A01 = EnumC7514rE.A03;
                c7510rA.A03.clear();
                if (A07(c7523rN)) {
                    c7523rN.A03(this);
                }
                if (this.A08) {
                    this.A06.remove(c7510rA);
                }
            }
        }
    }

    private void A05(C7511rB c7511rB) {
        for (C7523rN visible : c7511rB.A00()) {
            if (A07(visible)) {
                visible.A03(this);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    private void A06(List<C7523rN<?, ?>> list) {
        for (C7523rN<?, ?> c7523rN : list) {
            if (this.A06.get(c7523rN.A02) != null) {
                boolean z = c7523rN.A04;
                if (A0A[0].length() != 2) {
                    throw new RuntimeException();
                }
                A0A[7] = "nPwsVC";
                if (z) {
                    EnumC7514rE enumC7514rE = c7523rN.A01;
                    String[] strArr = A0A;
                    if (strArr[5].length() != strArr[6].length()) {
                        A0A[0] = "zj";
                        if (enumC7514rE != null) {
                            if (c7523rN.A01 != EnumC7514rE.A03) {
                                c7523rN.A03(this);
                            }
                        }
                    } else {
                        String[] strArr2 = A0A;
                        strArr2[4] = "4Gl";
                        strArr2[2] = "t26";
                        if (enumC7514rE != null) {
                            if (c7523rN.A01 != EnumC7514rE.A03) {
                                c7523rN.A03(this);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public static boolean A07(C7523rN<?, ?> c7523rN) {
        if (c7523rN.A04) {
            EnumC7524rO enumC7524rO = c7523rN.A00;
            EnumC7524rO enumC7524rO2 = EnumC7524rO.A04;
            String[] strArr = A0A;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A0A[7] = "iICfc1p4CYNR1vFaz";
            if (enumC7524rO == enumC7524rO2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d3  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC4938Al
    public final void A46(C7523rN c7523rN, Rect rect, Rect rect2, boolean z) {
        EnumC7514rE enumC7514rE;
        A01(c7523rN, rect, rect2);
        C7523rN c7523rN2 = c7523rN.A05;
        C7523rN parentViewpointData = C7523rN.A0B;
        if (c7523rN2 == parentViewpointData || c7523rN2 == null) {
            return;
        }
        boolean zA06 = this.A03.A06(c7523rN2);
        C7510rA c7510rAA03 = this.A06.get(c7523rN2.A02);
        if (zA06) {
            if (c7510rAA03 == null) {
                c7510rAA03 = C7510rA.A03(this.A00);
                c7510rAA03.A02.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                this.A06.put(c7523rN2.A02, c7510rAA03);
            } else {
                c7510rAA03.A03.clear();
                if (this.A07) {
                    boolean zA04 = c7523rN2.A04();
                    if (A0A[0].length() != 2) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0A;
                    strArr[5] = "H54AceamXdthsYm78mtSydojeY2Fx6Sn";
                    strArr[6] = "PVfiJKIqQ6L9JP1UYx1CLIU2NiQOo1Yq";
                    if (zA04) {
                        enumC7514rE = EnumC7514rE.A04;
                        if (A0A[7].length() != 26) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0A;
                        strArr2[5] = "tsuWg7tiHeCbTZ79GKvfVJLQxaexBCGH";
                        strArr2[6] = "f1Y9d3aTAam6AIKjxx39fqUFlMtOCeIE";
                        c7510rAA03.A01 = enumC7514rE;
                    }
                } else {
                    enumC7514rE = EnumC7514rE.A04;
                    if (A0A[7].length() != 26) {
                        throw new RuntimeException();
                    }
                    String[] strArr3 = A0A;
                    strArr3[5] = "tsuWg7tiHeCbTZ79GKvfVJLQxaexBCGH";
                    strArr3[6] = "f1Y9d3aTAam6AIKjxx39fqUFlMtOCeIE";
                    c7510rAA03.A01 = enumC7514rE;
                }
            }
            if (z) {
                c7510rAA03.A02.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        } else if (z && c7510rAA03 != null) {
            c7510rAA03.A02.set(Math.min(rect2.left, c7510rAA03.A02.left), Math.min(rect2.top, c7510rAA03.A02.top), Math.max(rect2.right, c7510rAA03.A02.right), Math.max(rect2.bottom, c7510rAA03.A02.bottom));
        }
        if (c7510rAA03 == null) {
            return;
        }
        c7510rAA03.A03.add(new Rect(rect));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC4938Al
    public final void A4h(long j, List<Rect> list) {
        this.A00 = j;
        this.A05.clear();
        Iterator<Rect> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "xWg";
            strArr2[2] = "l5f";
            if (zHasNext) {
                this.A05.add(new Rect(it.next()));
            } else {
                Iterator it2 = this.A04.A01().iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    if (A0A[0].length() == 2) {
                        String[] strArr3 = A0A;
                        strArr3[3] = "KXc0LwnJCEJYYpq44EYPYXvj71LHxLBt";
                        strArr3[1] = "SZ9db6jeJg1WeryC8zmRUBHGUrGxU8hd";
                        if (!zHasNext2) {
                            break;
                        }
                        this.A06.remove(((C7523rN) it2.next()).A02);
                    } else {
                        if (!zHasNext2) {
                            break;
                        }
                        this.A06.remove(((C7523rN) it2.next()).A02);
                    }
                }
                Collection<C7523rN> collectionA01 = this.A03.A01();
                if (A0A[0].length() != 2) {
                    throw new RuntimeException();
                }
                A0A[0] = "Au";
                for (C7523rN viewpointData : collectionA01) {
                    this.A06.remove(viewpointData.A02);
                }
                Iterator<C7510rA> it3 = this.A06.values().iterator();
                while (it3.hasNext()) {
                    it3.next().A03.clear();
                }
                this.A04.A04();
                this.A03.A04();
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7513rD
    public final void A8D(C7523rN c7523rN, Rect rect) {
        if (!this.A06.containsKey(c7523rN.A02)) {
            return;
        }
        rect.setEmpty();
        for (Rect rect2 : this.A06.get(c7523rN.A02).A03) {
            if (A0A[7].length() == 26) {
                throw new RuntimeException();
            }
            A0A[7] = "8y";
            rect.union(rect2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7513rD
    public final EnumC7514rE A9U(C7523rN c7523rN) {
        if (!this.A06.containsKey(c7523rN.A02)) {
            return EnumC7514rE.A02;
        }
        EnumC7514rE enumC7514rE = this.A06.get(c7523rN.A02).A01;
        if (c7523rN.A04) {
            if (c7523rN.A00 == EnumC7524rO.A04) {
                EnumC7514rE viewState = EnumC7514rE.A03;
                return viewState;
            }
            EnumC7514rE viewState2 = EnumC7514rE.A04;
            if (enumC7514rE == viewState2 && !c7523rN.A04()) {
                EnumC7514rE viewState3 = EnumC7514rE.A02;
                return viewState3;
            }
        }
        return enumC7514rE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7513rD
    public final void A9W(Rect rect) {
        rect.setEmpty();
        Iterator<Rect> it = this.A05.iterator();
        while (it.hasNext()) {
            rect.union(it.next());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7513rD
    public final float A9X(C7523rN c7523rN) {
        C7510rA c7510rA = this.A06.get(c7523rN.A02);
        if (c7510rA != null) {
            Rect rectA00 = A00(c7510rA);
            int iHeight = rectA00.height() * rectA00.width();
            int totalVisibleArea = 0;
            for (Rect rect : c7510rA.A03) {
                totalVisibleArea += rect.height() * rect.width();
            }
            return totalVisibleArea / iHeight;
        }
        return 0.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC4938Al
    public final void AJu(InterfaceC7520rK interfaceC7520rK) {
        this.A01 = interfaceC7520rK;
    }
}
