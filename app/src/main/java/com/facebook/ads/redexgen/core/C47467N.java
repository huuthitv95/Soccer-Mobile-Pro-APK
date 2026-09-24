package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7N */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C47467N extends AbstractC6950hU {
    public static String[] A02 = {"ZvwGPtqIyq", "yiAZi4T0ry", "MW2e2TOPDP9pjEe4rTD", "HlrRgmhjIEURNOsi3rdB558cP", "dU7euze3hj2U1ev62XjIRTQ2vrQriAnf", "8gl08jl5gi3EpiFcU", "SXjkVQ4wGxN0zpwvt09Xfw5qzXSeRw0d", "Y5nQdyuIxyo1Orqk0oN6DnQ8XCev4LBn"};
    public AbstractC5922Qm A00;
    public AbstractC5922Qm A01;

    private int A00(AbstractC5938R2 abstractC5938R2, View view, AbstractC5922Qm abstractC5922Qm) {
        int containerCenter;
        int iA0F = abstractC5922Qm.A0F(view) + (abstractC5922Qm.A0D(view) / 2);
        if (abstractC5938R2.A1V()) {
            int iA0A = abstractC5922Qm.A0A();
            int childCenter = abstractC5922Qm.A0B();
            containerCenter = iA0A + (childCenter / 2);
        } else {
            int childCenter2 = abstractC5922Qm.A06();
            containerCenter = childCenter2 / 2;
        }
        return iA0F - containerCenter;
    }

    private View A01(AbstractC5938R2 abstractC5938R2, AbstractC5922Qm abstractC5922Qm) {
        int i;
        int iA0Y = abstractC5938R2.A0Y();
        if (iA0Y == 0) {
            return null;
        }
        View view = null;
        if (abstractC5938R2.A1V()) {
            int iA0A = abstractC5922Qm.A0A();
            int childCount = abstractC5922Qm.A0B();
            i = iA0A + (childCount / 2);
        } else {
            int childCount2 = abstractC5922Qm.A06();
            i = childCount2 / 2;
        }
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < iA0Y; i3++) {
            View viewA0v = abstractC5938R2.A0v(i3);
            int iA0F = abstractC5922Qm.A0F(viewA0v);
            int childCount3 = abstractC5922Qm.A0D(viewA0v);
            int childCount4 = Math.abs((iA0F + (childCount3 / 2)) - i);
            if (childCount4 < i2) {
                i2 = childCount4;
                String[] strArr = A02;
                String str = strArr[0];
                String str2 = strArr[1];
                int length = str.length();
                int childCount5 = str2.length();
                if (length != childCount5) {
                    throw new RuntimeException();
                }
                A02[5] = "j4bRVUHHACnikA";
                view = viewA0v;
            }
        }
        return view;
    }

    private View A02(AbstractC5938R2 abstractC5938R2, AbstractC5922Qm abstractC5922Qm) {
        int iA0Y = abstractC5938R2.A0Y();
        if (iA0Y == 0) {
            return null;
        }
        View view = null;
        int i = Integer.MAX_VALUE;
        if (A02[7].charAt(21) == '9') {
            throw new RuntimeException();
        }
        A02[7] = "DwjJFjjR1ioErHTPj2QZ0AbXqU5bWHnc";
        for (int childCount = 0; childCount < iA0Y; childCount++) {
            View viewA0v = abstractC5938R2.A0v(childCount);
            int iA0F = abstractC5922Qm.A0F(viewA0v);
            if (iA0F < i) {
                i = iA0F;
                view = viewA0v;
            }
        }
        return view;
    }

    private AbstractC5922Qm A03(AbstractC5938R2 abstractC5938R2) {
        if (this.A00 == null || this.A00.A02 != abstractC5938R2) {
            this.A00 = AbstractC5922Qm.A00(abstractC5938R2);
        }
        return this.A00;
    }

    private AbstractC5922Qm A04(AbstractC5938R2 abstractC5938R2) {
        if (this.A01 == null || this.A01.A02 != abstractC5938R2) {
            this.A01 = AbstractC5922Qm.A01(abstractC5938R2);
        }
        return this.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.core.AbstractC6950hU
    public final int A0C(AbstractC5938R2 abstractC5938R2, int i, int i2) {
        int iA0r;
        int centerPosition;
        int iA0b = abstractC5938R2.A0b();
        if (iA0b == 0) {
            return -1;
        }
        View viewA02 = null;
        if (abstractC5938R2.A23()) {
            viewA02 = A02(abstractC5938R2, A04(abstractC5938R2));
        } else if (abstractC5938R2.A22()) {
            viewA02 = A02(abstractC5938R2, A03(abstractC5938R2));
        }
        if (viewA02 == null || (iA0r = abstractC5938R2.A0r(viewA02)) == -1) {
            return -1;
        }
        if (abstractC5938R2.A22()) {
            centerPosition = i > 0 ? 1 : 0;
        } else {
            centerPosition = i2 > 0 ? 1 : 0;
        }
        boolean z = false;
        if (abstractC5938R2 instanceof InterfaceC5950RE) {
            int itemCount = iA0b - 1;
            PointF pointFA56 = ((InterfaceC5950RE) abstractC5938R2).A56(itemCount);
            if (pointFA56 != null) {
                z = pointFA56.x < 0.0f || pointFA56.y < 0.0f;
            }
        }
        if (z) {
            return centerPosition != 0 ? iA0r - 1 : iA0r;
        }
        return centerPosition != 0 ? iA0r + 1 : iA0r;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6950hU
    public final View A0D(AbstractC5938R2 abstractC5938R2) {
        if (abstractC5938R2.A23()) {
            return A01(abstractC5938R2, A04(abstractC5938R2));
        }
        if (abstractC5938R2.A22()) {
            View viewA01 = A01(abstractC5938R2, A03(abstractC5938R2));
            if (A02[4].charAt(24) != 'v') {
                throw new RuntimeException();
            }
            A02[5] = "ku3zp";
            return viewA01;
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6950hU
    public final C6971hq A0E(AbstractC5938R2 abstractC5938R2) {
        if (!(abstractC5938R2 instanceof InterfaceC5950RE)) {
            return null;
        }
        final Context context = super.A00.getContext();
        return new C6971hq(context) { // from class: com.facebook.ads.redexgen.X.7O
            @Override // com.facebook.ads.redexgen.core.C6971hq, com.facebook.ads.redexgen.core.AbstractC5951RF
            public final void A0I(View view, C5953RH c5953rh, C5949RD c5949rd) {
                int[] iArrA0H = this.A00.A0H(((AbstractC6950hU) this.A00).A00.getLayoutManager(), view);
                int time = iArrA0H[0];
                int dy = iArrA0H[1];
                int dx = A0M(Math.max(Math.abs(time), Math.abs(dy)));
                if (dx > 0) {
                    c5949rd.A04(time, dy, dx, ((C6971hq) this).A04);
                }
            }

            @Override // com.facebook.ads.redexgen.core.C6971hq
            public final float A0J(DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }

            @Override // com.facebook.ads.redexgen.core.C6971hq
            public final int A0L(int i) {
                return Math.min(100, super.A0L(i));
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6950hU
    public final int[] A0H(AbstractC5938R2 abstractC5938R2, View view) {
        int[] iArr = new int[2];
        if (abstractC5938R2.A22()) {
            iArr[0] = A00(abstractC5938R2, view, A03(abstractC5938R2));
        } else {
            iArr[0] = 0;
        }
        if (abstractC5938R2.A23()) {
            iArr[1] = A00(abstractC5938R2, view, A04(abstractC5938R2));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
