package com.facebook.ads.redexgen.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.en */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6783en extends ViewOutlineProvider {
    public final /* synthetic */ C6786eq A00;

    public C6783en(C6786eq c6786eq) {
        this.A00 = c6786eq;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 8.0f);
    }
}
