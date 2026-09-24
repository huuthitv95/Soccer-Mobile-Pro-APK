package com.facebook.ads.redexgen.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Y9 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6372Y9 extends ViewOutlineProvider {
    public final /* synthetic */ float A00;

    public C6372Y9(float f) {
        this.A00 = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(AbstractC6332XV.A00, AbstractC6332XV.A00, view.getWidth(), view.getHeight(), this.A00);
    }
}
