package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeoh extends zzeog {
    private final zzcmx zza;
    private final zzdbo zzb;
    private final zzdif zzc;
    private final zzeor zzd;
    private final zzell zze;

    zzeoh(zzcmx zzcmxVar, zzdbo zzdboVar, zzdif zzdifVar, zzeor zzeorVar, zzell zzellVar) {
        this.zza = zzcmxVar;
        this.zzb = zzdboVar;
        this.zzc = zzdifVar;
        this.zzd = zzeorVar;
        this.zze = zzellVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeog
    protected final ListenableFuture zzc(zzfkm zzfkmVar, Bundle bundle, zzfjt zzfjtVar, zzfke zzfkeVar) {
        zzdbo zzdboVar = this.zzb;
        zzdboVar.zzb(zzfkmVar);
        zzdboVar.zzc(bundle);
        zzdboVar.zzd(new zzdbi(zzfkeVar, zzfjtVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzew)).booleanValue()) {
            zzdboVar.zzg(this.zze);
        }
        zzcum zzcumVarZzk = this.zza.zzk();
        zzcumVarZzk.zzd(zzdboVar.zze());
        zzcumVarZzk.zze(this.zzc);
        zzcyl zzcylVarZza = zzcumVarZzk.zza().zza();
        return zzcylVarZza.zzc(zzcylVarZza.zzb());
    }
}
