package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbte implements zzcfm {
    final /* synthetic */ zzbtc zza;

    zzbte(zzbth zzbthVar, zzbtc zzbtcVar) {
        this.zza = zzbtcVar;
        Objects.requireNonNull(zzbthVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("Rejecting reference for JS Engine.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziF)).booleanValue()) {
            this.zza.zzh(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.zza.zzg();
        }
    }
}
