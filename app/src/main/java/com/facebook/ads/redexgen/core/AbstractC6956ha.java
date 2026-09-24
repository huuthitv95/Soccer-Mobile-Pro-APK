package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ha */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6956ha extends AbstractC5934Qy {
    public static String[] A01 = {"ofgeN", "GcYePxlnDkyLzFZQt8gXTfFAd", "bIohWxIGlUqKJ41hMBKnFxYrg", "ROugplE3NXuve66PKoPS6E1ZAyp", "eD20R2wAf", "s8oLKbIochRuLWrY7HR296xJjla", "faP6eJ6K6STeOEuOEXCJ6OuUaXzDbpLW", "oXM2gF3tn"};
    public boolean A00 = true;

    public abstract boolean A0X(AbstractC5956RK abstractC5956RK);

    public abstract boolean A0Y(AbstractC5956RK abstractC5956RK);

    public abstract boolean A0Z(AbstractC5956RK abstractC5956RK, int i, int i2, int i3, int i4);

    public abstract boolean A0a(AbstractC5956RK abstractC5956RK, AbstractC5956RK abstractC5956RK2, int i, int i2, int i3, int i4);

    @Override // com.facebook.ads.redexgen.core.AbstractC5934Qy
    public final boolean A0N(AbstractC5956RK abstractC5956RK) {
        return !this.A00 || abstractC5956RK.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5934Qy
    public final boolean A0O(AbstractC5956RK abstractC5956RK, C5933Qx c5933Qx, C5933Qx c5933Qx2) {
        if (c5933Qx != null && (c5933Qx.A01 != c5933Qx2.A01 || c5933Qx.A03 != c5933Qx2.A03)) {
            return A0Z(abstractC5956RK, c5933Qx.A01, c5933Qx.A03, c5933Qx2.A01, c5933Qx2.A03);
        }
        return A0X(abstractC5956RK);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5934Qy
    public final boolean A0P(AbstractC5956RK abstractC5956RK, C5933Qx c5933Qx, C5933Qx c5933Qx2) {
        int i = c5933Qx.A01;
        int oldLeft = c5933Qx.A03;
        View view = abstractC5956RK.A0H;
        int oldTop = c5933Qx2 == null ? view.getLeft() : c5933Qx2.A01;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "jyZdeafgD";
        strArr2[4] = "NUmje91r8";
        int top = c5933Qx2 == null ? view.getTop() : c5933Qx2.A03;
        if (!abstractC5956RK.A0g() && (i != oldTop || oldLeft != top)) {
            view.layout(oldTop, top, view.getWidth() + oldTop, view.getHeight() + top);
            return A0Z(abstractC5956RK, i, oldLeft, oldTop, top);
        }
        return A0Y(abstractC5956RK);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5934Qy
    public final boolean A0Q(AbstractC5956RK abstractC5956RK, C5933Qx c5933Qx, C5933Qx c5933Qx2) {
        if (c5933Qx.A01 != c5933Qx2.A01 || c5933Qx.A03 != c5933Qx2.A03) {
            return A0Z(abstractC5956RK, c5933Qx.A01, c5933Qx.A03, c5933Qx2.A01, c5933Qx2.A03);
        }
        A0U(abstractC5956RK);
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5934Qy
    public final boolean A0R(AbstractC5956RK abstractC5956RK, AbstractC5956RK abstractC5956RK2, C5933Qx c5933Qx, C5933Qx c5933Qx2) {
        int i;
        int i2;
        int i3 = c5933Qx.A01;
        int i4 = c5933Qx.A03;
        if (abstractC5956RK2.A0l()) {
            i = c5933Qx.A01;
            i2 = c5933Qx.A03;
        } else {
            i = c5933Qx2.A01;
            i2 = c5933Qx2.A03;
        }
        return A0a(abstractC5956RK, abstractC5956RK2, i3, i4, i, i2);
    }

    public final void A0T(AbstractC5956RK abstractC5956RK) {
        A0K(abstractC5956RK);
    }

    public final void A0U(AbstractC5956RK abstractC5956RK) {
        A0K(abstractC5956RK);
    }

    public final void A0V(AbstractC5956RK abstractC5956RK) {
        A0K(abstractC5956RK);
    }

    public final void A0W(AbstractC5956RK abstractC5956RK, boolean z) {
        A0K(abstractC5956RK);
    }
}
