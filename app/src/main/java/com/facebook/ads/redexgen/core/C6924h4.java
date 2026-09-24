package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.h4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6924h4 implements InterfaceC6006S8 {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C6008SA A01;
    public final /* synthetic */ C6140UK A02;

    public C6924h4(C6008SA c6008sa, ImageView imageView, C6140UK c6140uk) {
        this.A01 = c6008sa;
        this.A00 = imageView;
        this.A02 = c6140uk;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6006S8
    public final void AE8(Drawable drawable) {
        C6140UK.A0f(drawable, this.A00);
        this.A02.A1P(drawable);
    }
}
