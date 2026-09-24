package com.facebook.ads.redexgen.core;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1z */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C44171z {
    public final AudioAttributes A00;

    public C44171z(C7478qQ c7478qQ) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c7478qQ.A02).setFlags(c7478qQ.A03).setUsage(c7478qQ.A05);
        if (AbstractC46115C.A02 >= 29) {
            C44151x.A00(usage, c7478qQ.A01);
        }
        if (AbstractC46115C.A02 >= 32) {
            C44161y.A00(usage, c7478qQ.A04);
        }
        this.A00 = usage.build();
    }
}
