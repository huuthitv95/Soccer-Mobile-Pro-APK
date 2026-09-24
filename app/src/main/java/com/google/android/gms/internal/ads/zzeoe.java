package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeoe extends zzeog {
    private final zzcmx zza;
    private final zzdnl zzb;
    private final zzdbo zzc;
    private final zzdif zzd;
    private final zzeor zze;
    private final zzell zzf;

    public zzeoe(zzcmx zzcmxVar, zzdnl zzdnlVar, zzdbo zzdboVar, zzdif zzdifVar, zzeor zzeorVar, zzell zzellVar) {
        this.zza = zzcmxVar;
        this.zzb = zzdnlVar;
        this.zzc = zzdboVar;
        this.zzd = zzdifVar;
        this.zze = zzeorVar;
        this.zzf = zzellVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeog
    protected final ListenableFuture zzc(zzfkm zzfkmVar, Bundle bundle, zzfjt zzfjtVar, zzfke zzfkeVar) {
        zzdbo zzdboVar = this.zzc;
        zzdboVar.zzb(zzfkmVar);
        zzdboVar.zzc(bundle);
        zzdboVar.zzd(new zzdbi(zzfkeVar, zzfjtVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzew)).booleanValue()) {
            zzdboVar.zzg(this.zzf);
        }
        zzdnp zzdnpVarZzo = this.zza.zzo();
        zzdnpVarZzo.zzf(zzdboVar.zze());
        zzdnpVarZzo.zzg(this.zzd);
        zzdnpVarZzo.zze(this.zzb);
        zzdnpVarZzo.zzd(new zzcuw(null));
        zzcyl zzcylVarZza = zzdnpVarZzo.zza().zza();
        return zzcylVarZza.zzc(zzcylVarZza.zzb());
    }
}
