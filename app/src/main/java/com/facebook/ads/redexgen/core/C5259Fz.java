package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5259Fz implements InterfaceC6665cs {
    public final /* synthetic */ C5258Fy A00;

    public C5259Fz(C5258Fy c5258Fy) {
        this.A00 = c5258Fy;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6665cs
    public final void AGW(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6665cs
    public final void AGY(View view) {
        AbstractC5487Jg abstractC5487Jg = (AbstractC5487Jg) view;
        abstractC5487Jg.A1T();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC5487Jg.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
