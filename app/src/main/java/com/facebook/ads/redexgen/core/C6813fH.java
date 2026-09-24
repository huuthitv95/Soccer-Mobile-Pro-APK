package com.facebook.ads.redexgen.core;

import android.graphics.Paint;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6813fH extends Paint {
    public final /* synthetic */ C6814fI A00;
    public final /* synthetic */ boolean A01;

    public C6813fH(C6814fI c6814fI, boolean z) {
        this.A00 = c6814fI;
        this.A01 = z;
        setStyle(Paint.Style.FILL_AND_STROKE);
        setStrokeCap(Paint.Cap.ROUND);
        setStrokeWidth(3.0f);
        setAntiAlias(true);
        setColor(this.A01 ? -1 : -10066330);
    }
}
