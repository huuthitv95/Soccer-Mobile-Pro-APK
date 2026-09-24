package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbty implements zzcfm {
    final /* synthetic */ zzcfk zza;
    final /* synthetic */ zzbtc zzb;

    zzbty(zzbua zzbuaVar, zzcfk zzcfkVar, zzbtc zzbtcVar) {
        this.zza = zzcfkVar;
        this.zzb = zzbtcVar;
        Objects.requireNonNull(zzbuaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzbtl("Unable to obtain a JavascriptEngine."));
        this.zzb.zza();
    }
}
