package com.facebook.ads.redexgen.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6499aC extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C6506aJ A01;

    public C6499aC(C6506aJ c6506aJ, float f) {
        this.A01 = c6506aJ;
        this.A00 = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(AbstractC6332XV.A00, AbstractC6332XV.A00, view.getWidth(), view.getHeight(), this.A00);
    }
}
