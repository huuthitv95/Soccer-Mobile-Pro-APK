package com.facebook.ads.redexgen.core;

import android.animation.ObjectAnimator;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bM */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC6571bM implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C46916U A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 45);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.f22492FF, 1, Ascii.f22494GS, 5, Ascii.f22492FF};
    }

    public RunnableC6571bM(C46916U c46916u) {
        this.A00 = c46916u;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String strA00 = A00(0, 5, 64);
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0U.A0F().AKi();
            ObjectAnimator.ofFloat(this.A00.A0Q, strA00, 1.0f, 0.0f).setDuration(100L).start();
            ObjectAnimator.ofFloat(this.A00.A0P, strA00, 1.0f, 0.0f).setDuration(100L).start();
            ObjectAnimator duration = ObjectAnimator.ofFloat(((AbstractC6564bF) this.A00).A09, strA00, 1.0f, 0.0f).setDuration(100L);
            duration.addListener(new C6570bL(this));
            duration.start();
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
