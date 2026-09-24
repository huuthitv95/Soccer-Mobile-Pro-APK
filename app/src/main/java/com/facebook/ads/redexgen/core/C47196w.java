package com.facebook.ads.redexgen.core;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6w */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C47196w extends C6971hq {
    public static String[] A01 = {"5vbH5h", "J", "C4GDfN5QjjsYSTm6MxZFmUsCMcA9wBBJ", "6VFwzkwOMMM2Di2Z85K5QmwqwgWhrd8W", "uhhUuQP5WsjWPtKrx", "v18Pv4VwePGedZr395LFzqQB6yfdWBSj", "eHjrumjSh1wPfIUStRl2rH8Zl9vSSm7d", "psLA63BrOeuZ89bQmrhMweOfIVNK7DGd"};
    public final /* synthetic */ C47186v A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.C6971hq
    public final int A0O(View view, int i) {
        AbstractC5938R2 abstractC5938R2A08 = A08();
        if (!abstractC5938R2A08.A22()) {
            return 0;
        }
        C5939R3 c5939r3 = (C5939R3) view.getLayoutParams();
        int iA0N = A0N(abstractC5938R2A08.A0m(view) - c5939r3.leftMargin, abstractC5938R2A08.A0p(view) + c5939r3.rightMargin, abstractC5938R2A08.A0g(), abstractC5938R2A08.A0j() - abstractC5938R2A08.A0h(), i) + this.A00.A02;
        if (A01[0].length() != 6) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "LE8phwfR0RxAHMOOl0X9IEx3wOgwcDNd";
        strArr[7] = "Bj9ROfqsKQjGAcpCTsOWpU0U4DTJlpud";
        return iA0N;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47196w(C47186v c47186v, C6902gi c6902gi) {
        super(c6902gi);
        this.A00 = c47186v;
    }

    @Override // com.facebook.ads.redexgen.core.C6971hq
    public final float A0J(DisplayMetrics displayMetrics) {
        return this.A00.A00 / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.core.C6971hq
    public final int A0K() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.C6971hq
    public final PointF A0P(int i) {
        return this.A00.A56(i);
    }
}
