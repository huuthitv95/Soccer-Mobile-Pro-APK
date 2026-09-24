package com.facebook.ads.redexgen.core;

import androidx.media3.common.PlaybackException;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import com.google.common.base.Ascii;
import com.ironsource.C11366Bc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qy */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5934Qy {
    public static byte[] A06;
    public static String[] A07 = {C11366Bc.f23952e, "BOchn05cOqPQPKgaZhD7MWqYHqoCKx7o", "EPTevQXo6AzOyuxFlfcAvx5eJdnVP8", "v", "6fNY9lNhy7nUhuOGP7YDUX6WqdzgNzMN", "SLjIMlZrt8LApw5SyAUFDc4ipDag7tTu", "zXvx6U5xIRhnU3fWG5rnYTWUnq20aSrc", "c4GOdlXhzm3270NA43EFNLoVECdVoF38"};
    public InterfaceC5932Qw A04 = null;
    public ArrayList<RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> A05 = new ArrayList<>();
    public long A00 = 120;
    public long A03 = 120;
    public long A02 = 250;
    public long A01 = 250;

    public static String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_END_OF_PLAYLIST);
            String[] strArr = A07;
            if (strArr[6].charAt(25) == strArr[5].charAt(25)) {
                throw new RuntimeException();
            }
            A07[2] = "awpTB9u15TkHVvPjjOCd09Fy8dol99E";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A06 = new byte[]{76, 75, Ascii.f22498RS, 75, 70, 74, 62, 81, 70, 76, 75, 80, 35, 70, 75, 70, 80, 69, 66, 65};
    }

    public abstract void A0H();

    public abstract void A0I();

    public abstract void A0L(AbstractC5956RK abstractC5956RK);

    public abstract boolean A0M();

    public abstract boolean A0N(AbstractC5956RK abstractC5956RK);

    public abstract boolean A0O(AbstractC5956RK abstractC5956RK, C5933Qx c5933Qx, C5933Qx c5933Qx2);

    public abstract boolean A0P(AbstractC5956RK abstractC5956RK, C5933Qx c5933Qx, C5933Qx c5933Qx2);

    public abstract boolean A0Q(AbstractC5956RK abstractC5956RK, C5933Qx c5933Qx, C5933Qx c5933Qx2);

    public abstract boolean A0R(AbstractC5956RK abstractC5956RK, AbstractC5956RK abstractC5956RK2, C5933Qx c5933Qx, C5933Qx c5933Qx2);

    static {
        A09();
    }

    public static int A06(AbstractC5956RK abstractC5956RK) {
        int i = abstractC5956RK.A0C & 14;
        if (abstractC5956RK.A0f()) {
            return 4;
        }
        int flags = i & 4;
        if (flags == 0) {
            int pos = abstractC5956RK.A0P();
            int oldPos = abstractC5956RK.A0M();
            if (pos != -1 && oldPos != -1 && pos != oldPos) {
                return i | 2048;
            }
            return i;
        }
        return i;
    }

    private final C5933Qx A07() {
        return new C5933Qx();
    }

    public final long A0A() {
        return this.A00;
    }

    public final long A0B() {
        return this.A01;
    }

    public final long A0C() {
        return this.A02;
    }

    public final long A0D() {
        return this.A03;
    }

    public final C5933Qx A0E(C5953RH c5953rh, AbstractC5956RK abstractC5956RK) {
        return A07().A01(abstractC5956RK);
    }

    public final C5933Qx A0F(C5953RH c5953rh, AbstractC5956RK abstractC5956RK, int i, List<Object> payloads) {
        return A07().A01(abstractC5956RK);
    }

    public final void A0G() {
        int count = this.A05.size();
        if (0 < count) {
            this.A05.get(0);
            throw new NullPointerException(A08(0, 20, 112));
        }
        this.A05.clear();
    }

    public final void A0J(InterfaceC5932Qw interfaceC5932Qw) {
        this.A04 = interfaceC5932Qw;
    }

    public final void A0K(AbstractC5956RK abstractC5956RK) {
        if (this.A04 != null) {
            this.A04.ACv(abstractC5956RK);
        }
    }

    public boolean A0S(AbstractC5956RK abstractC5956RK, List<Object> payloads) {
        return A0N(abstractC5956RK);
    }
}
