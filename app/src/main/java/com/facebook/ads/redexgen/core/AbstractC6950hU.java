package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hU */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6950hU extends AbstractC5941R5 {
    public static byte[] A03;
    public static String[] A04 = {"VI3k6vbyE", "wbKxmRtdnLanYPPQlq0AQ7UHjncjxjam", "7rHsxeXjhwTRluKKUSI3i7DNAgzyS", "RLsJgHk6VqLvU3GrilIJimxIkswsMvKT", "sHDfA32w1RYOD3HMFDMkWGxW2yjuY1ZH", "JEcuqbBofZsfD30FS8fTTaggCipMDK", "8NUawD4TiWbh8YzDjR1LHPIBKq0RidcG", "8EIjrQLLrDPWSel1MFlzfXR6TVhPBcGW"};
    public C47457M A00;
    public Scroller A01;
    public final AbstractC5943R7 A02 = new C6955hZ(this);

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A03 = new byte[]{-120, -75, 103, -80, -75, -70, -69, -88, -75, -86, -84, 103, -74, -83, 103, -106, -75, -115, -77, -80, -75, -82, -109, -80, -70, -69, -84, -75, -84, -71, 103, -88, -77, -71, -84, -88, -85, -64, 103, -70, -84, -69, 117};
    }

    public abstract int A0C(AbstractC5938R2 abstractC5938R2, int i, int i2);

    public abstract View A0D(AbstractC5938R2 abstractC5938R2);

    @Deprecated
    public abstract C6971hq A0E(AbstractC5938R2 abstractC5938R2);

    public abstract int[] A0H(AbstractC5938R2 abstractC5938R2, View view);

    static {
        A09();
    }

    private final C6971hq A05(AbstractC5938R2 abstractC5938R2) {
        return A0E(abstractC5938R2);
    }

    private void A07() {
        this.A00.A1i(this.A02);
        this.A00.setOnFlingListener(null);
    }

    private void A08() throws IllegalStateException {
        if (this.A00.getOnFlingListener() == null) {
            this.A00.A1h(this.A02);
            this.A00.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException(A06(0, 43, 56));
    }

    private boolean A0A(AbstractC5938R2 abstractC5938R2, int i, int i2) {
        C6971hq c6971hqA05;
        int iA0C;
        if (!(abstractC5938R2 instanceof InterfaceC5950RE) || (c6971hqA05 = A05(abstractC5938R2)) == null || (iA0C = A0C(abstractC5938R2, i, i2)) == -1) {
            return false;
        }
        c6971hqA05.A0A(iA0C);
        abstractC5938R2.A1N(c6971hqA05);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5941R5
    public final boolean A0B(int i, int i2) {
        AbstractC5938R2 layoutManager = this.A00.getLayoutManager();
        if (layoutManager == null || this.A00.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.A00.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && A0A(layoutManager, i, i2);
    }

    public final void A0F() {
        AbstractC5938R2 layoutManager;
        View viewA0D;
        if (this.A00 == null || (layoutManager = this.A00.getLayoutManager()) == null || (viewA0D = A0D(layoutManager)) == null) {
            return;
        }
        int[] iArrA0H = A0H(layoutManager, viewA0D);
        if (iArrA0H[0] != 0 || iArrA0H[1] != 0) {
            this.A00.A1e(iArrA0H[0], iArrA0H[1]);
        }
    }

    public final void A0G(C47457M c47457m) throws IllegalStateException {
        if (this.A00 == c47457m) {
            return;
        }
        C47457M c47457m2 = this.A00;
        if (A04[3].charAt(14) == 'w') {
            throw new RuntimeException();
        }
        A04[4] = "xzKGxret4GzWIxaR6oK37PWpSNYAUaFQ";
        if (c47457m2 != null) {
            A07();
        }
        this.A00 = c47457m;
        if (this.A00 != null) {
            A08();
            this.A01 = new Scroller(this.A00.getContext(), new DecelerateInterpolator());
            A0F();
        }
    }
}
