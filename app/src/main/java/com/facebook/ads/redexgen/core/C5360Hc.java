package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hc */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5360Hc implements InterfaceC6557b8 {
    public final /* synthetic */ C460455 A00;

    public C5360Hc(C460455 c460455) {
        this.A00 = c460455;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6557b8
    public final void AE7(C6556b7 c6556b7) {
        if (this.A00.A02 != null && c6556b7.A00() != null) {
            this.A00.A02.setImageBitmap(c6556b7.A00());
            this.A00.A02.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.A00.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
