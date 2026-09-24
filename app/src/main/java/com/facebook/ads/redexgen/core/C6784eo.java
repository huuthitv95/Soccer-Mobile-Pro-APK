package com.facebook.ads.redexgen.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eo */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6784eo extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C6786eq A01;

    public C6784eo(C6786eq c6786eq, float f) {
        this.A01 = c6786eq;
        this.A00 = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00);
    }
}
