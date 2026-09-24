package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeol extends zzeog {
    private final zzcmx zza;
    private final zzdbo zzb;
    private final zzeqw zzc;
    private final zzdif zzd;
    private final zzeor zze;
    private final zzell zzf;

    public zzeol(zzcmx zzcmxVar, zzdbo zzdboVar, zzeqw zzeqwVar, zzdif zzdifVar, zzeor zzeorVar, zzell zzellVar) {
        this.zza = zzcmxVar;
        this.zzb = zzdboVar;
        this.zzc = zzeqwVar;
        this.zzd = zzdifVar;
        this.zze = zzeorVar;
        this.zzf = zzellVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeog
    protected final ListenableFuture zzc(zzfkm zzfkmVar, Bundle bundle, zzfjt zzfjtVar, zzfke zzfkeVar) {
        zzdbo zzdboVar = this.zzb;
        zzdboVar.zzb(zzfkmVar);
        zzdboVar.zzc(bundle);
        zzdboVar.zzd(new zzdbi(zzfkeVar, zzfjtVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzew)).booleanValue()) {
            zzdboVar.zzg(this.zzf);
        }
        zzdmt zzdmtVarZzm = this.zza.zzm();
        zzdmtVarZzm.zze(zzdboVar.zze());
        zzdmtVarZzm.zzf(this.zzd);
        zzdmtVarZzm.zzd(this.zzc);
        zzcyl zzcylVarZzb = zzdmtVarZzm.zza().zzb();
        return zzcylVarZzb.zzc(zzcylVarZzb.zzb());
    }
}
