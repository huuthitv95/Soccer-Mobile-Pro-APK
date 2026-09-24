package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.C11744X3;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzewe implements zzfbw {
    private final double zza;
    private final boolean zzb;

    public zzewe(double d, boolean z) {
        this.zza = d;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfbw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleZza = zzflb.zza(bundle, C11744X3.i.f26328G);
        bundle.putBundle(C11744X3.i.f26328G, bundleZza);
        Bundle bundleZza2 = zzflb.zza(bundleZza, "battery");
        bundleZza.putBundle("battery", bundleZza2);
        bundleZza2.putBoolean("is_charging", this.zzb);
        bundleZza2.putDouble("battery_level", this.zza);
    }
}
