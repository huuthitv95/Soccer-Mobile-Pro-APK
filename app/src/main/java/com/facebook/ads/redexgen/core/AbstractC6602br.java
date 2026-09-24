package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.br */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6602br {
    public static final int A00 = AbstractC6374YB.A00();

    public static void A00(C6902gi c6902gi, ViewGroup viewGroup, String str) {
        new AsyncTaskC5591LM(viewGroup, c6902gi).A07(str);
        View view = new View(c6902gi);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC6374YB.A0U(view, c6902gi);
        viewGroup.addView(view, 0);
    }
}
