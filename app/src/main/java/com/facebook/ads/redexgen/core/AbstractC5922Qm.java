package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qm */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5922Qm {
    public static byte[] A03;
    public int A00;
    public final Rect A01;
    public final AbstractC5938R2 A02;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-6, -1, 7, -14, -3, -6, -11, -79, 0, 3, -6, -10, -1, 5, -14, 5, -6, 0, -1};
    }

    public abstract int A06();

    public abstract int A07();

    public abstract int A08();

    public abstract int A09();

    public abstract int A0A();

    public abstract int A0B();

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract int A0E(View view);

    public abstract int A0F(View view);

    public abstract int A0G(View view);

    public abstract int A0H(View view);

    public abstract void A0J(int i);

    public AbstractC5922Qm(AbstractC5938R2 abstractC5938R2) {
        this.A00 = Integer.MIN_VALUE;
        this.A01 = new Rect();
        this.A02 = abstractC5938R2;
    }

    public /* synthetic */ AbstractC5922Qm(AbstractC5938R2 abstractC5938R2, C6970hp c6970hp) {
        this(abstractC5938R2);
    }

    public static C6970hp A00(AbstractC5938R2 abstractC5938R2) {
        return new C6970hp(abstractC5938R2);
    }

    public static C6969ho A01(AbstractC5938R2 abstractC5938R2) {
        return new C6969ho(abstractC5938R2);
    }

    public static AbstractC5922Qm A02(AbstractC5938R2 abstractC5938R2, int i) {
        switch (i) {
            case 0:
                return A00(abstractC5938R2);
            case 1:
                return A01(abstractC5938R2);
            default:
                throw new IllegalArgumentException(A03(0, 19, 19));
        }
    }

    public final int A05() {
        if (Integer.MIN_VALUE == this.A00) {
            return 0;
        }
        return A0B() - this.A00;
    }

    public final void A0I() {
        this.A00 = A0B();
    }
}
