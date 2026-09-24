package com.facebook.ads.redexgen.core;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ee */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5177Ee implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ C5178Ef A00;
    public final /* synthetic */ C48739h A01;

    public C5177Ee(C5178Ef c5178Ef, C48739h c48739h) {
        this.A00 = c5178Ef;
        this.A01 = c48739h;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }
}
