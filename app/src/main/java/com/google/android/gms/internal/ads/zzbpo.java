package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbpo implements com.google.android.gms.ads.internal.overlay.zzaa {
    final /* synthetic */ zzbpr zza;

    zzbpo(zzbpr zzbprVar) {
        Objects.requireNonNull(zzbprVar);
        this.zza = zzbprVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zza(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzb(int i) {
        this.zza.zzg(i);
    }
}
