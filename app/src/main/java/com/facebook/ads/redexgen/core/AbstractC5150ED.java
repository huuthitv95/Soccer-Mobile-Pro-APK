package com.facebook.ads.redexgen.core;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ED */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5150ED extends RelativeLayout implements InterfaceC6790eu {
    public C5183Ek A00;

    public AbstractC5150ED(C6902gi c6902gi) {
        super(c6902gi);
    }

    public AbstractC5150ED(C6902gi c6902gi, AttributeSet attributeSet, int i) {
        super(c6902gi, attributeSet, i);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6790eu
    public final void AAv(C5183Ek c5183Ek) {
        this.A00 = c5183Ek;
        A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6790eu
    public final void AKV(C5183Ek c5183Ek) {
        A08();
        this.A00 = null;
    }

    public C5183Ek getVideoView() {
        return this.A00;
    }
}
