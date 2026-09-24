package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hm */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6967hm implements InterfaceC5900QP {
    public static byte[] A01;
    public final /* synthetic */ C47457M A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 72);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-26, 4, Ascii.f22499SI, Ascii.f22499SI, 8, 7, -61, 4, Ascii.ETB, Ascii.ETB, 4, 6, Ascii.f22503VT, -61, Ascii.DC2, 17, -61, 4, -61, 6, Ascii.f22503VT, Ascii.f22492FF, Ascii.f22499SI, 7, -61, Ascii.SUB, Ascii.f22503VT, Ascii.f22492FF, 6, Ascii.f22503VT, -61, Ascii.f22492FF, Ascii.SYN, -61, 17, Ascii.DC2, Ascii.ETB, -61, 7, 8, Ascii.ETB, 4, 6, Ascii.f22503VT, 8, 7, -35, -61, -53, -55, -44, -44, -51, -52, -120, -52, -51, -36, -55, -53, -48, -120, -41, -42, -120, -55, -42, -120, -55, -44, -38, -51, -55, -52, -31, -120, -52, -51, -36, -55, -53, -48, -51, -52, -120, -53, -48, -47, -44, -52, -120};
    }

    public C6967hm(C47457M c47457m) {
        this.A00 = c47457m;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5900QP
    public final void A4K(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AbstractC5956RK abstractC5956RKA0F = C47457M.A0F(view);
        if (abstractC5956RKA0F != null) {
            if (abstractC5956RKA0F.A0i() || abstractC5956RKA0F.A0l()) {
                abstractC5956RKA0F.A0V();
            } else {
                throw new IllegalArgumentException(A00(0, 48, 91) + abstractC5956RKA0F + this.A00.A1J());
            }
        }
        this.A00.attachViewToParent(view, i, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5900QP
    public final void A5w(int i) {
        AbstractC5956RK abstractC5956RKA0F;
        View view = A7H(i);
        if (view != null && (abstractC5956RKA0F = C47457M.A0F(view)) != null) {
            if (!abstractC5956RKA0F.A0i() || abstractC5956RKA0F.A0l()) {
                abstractC5956RKA0F.A0Z(256);
            } else {
                throw new IllegalArgumentException(A00(48, 43, 32) + abstractC5956RKA0F + this.A00.A1J());
            }
        }
        this.A00.detachViewFromParent(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5900QP
    public final View A7H(int i) {
        return this.A00.getChildAt(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5900QP
    public final int A7I() {
        return this.A00.getChildCount();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5900QP
    public final AbstractC5956RK A7L(View view) {
        return C47457M.A0F(view);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5900QP
    public final int AA7(View view) {
        return this.A00.indexOfChild(view);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5900QP
    public final void ADo(View view) {
        AbstractC5956RK abstractC5956RKA0F = C47457M.A0F(view);
        if (abstractC5956RKA0F != null) {
            abstractC5956RKA0F.A0D(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5900QP
    public final void AEa(View view) {
        AbstractC5956RK abstractC5956RKA0F = C47457M.A0F(view);
        if (abstractC5956RKA0F != null) {
            abstractC5956RKA0F.A0E(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5900QP
    public final void AIQ() {
        int iA7I = A7I();
        for (int i = 0; i < iA7I; i++) {
            View viewA7H = A7H(i);
            this.A00.A1g(viewA7H);
            viewA7H.clearAnimation();
        }
        this.A00.removeAllViews();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5900QP
    public final void AIW(int i) {
        View childAt = this.A00.getChildAt(i);
        if (childAt != null) {
            this.A00.A1g(childAt);
            childAt.clearAnimation();
        }
        this.A00.removeViewAt(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5900QP
    public final void addView(View view, int i) {
        this.A00.addView(view, i);
        this.A00.A1f(view);
    }
}
