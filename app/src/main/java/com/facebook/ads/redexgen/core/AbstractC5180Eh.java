package com.facebook.ads.redexgen.core;

import com.facebook.ads.redexgen.core.AbstractC5180Eh;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eh */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5180Eh<T extends AbstractC5180Eh<T>> {
    public final int A00;
    public final int A01;
    public final C7472qI A02;
    public final C7435pg A03;

    public abstract int A08();

    public abstract boolean A09(T t);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eh != com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.Eh<T>> */
    public AbstractC5180Eh(int i, C7435pg c7435pg, int i2) {
        this.A00 = i;
        this.A03 = c7435pg;
        this.A01 = i2;
        this.A02 = c7435pg.A08(i2);
    }
}
