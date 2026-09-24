package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.FD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5212FD extends C6596bl {
    public final ImageView A00;
    public final C6902gi A01;

    public C5212FD(C6902gi c6902gi) {
        super(c6902gi);
        this.A01 = c6902gi;
        this.A00 = new ImageView(c6902gi);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        AsyncTaskC5591LM downloadImageTask = new AsyncTaskC5591LM(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
