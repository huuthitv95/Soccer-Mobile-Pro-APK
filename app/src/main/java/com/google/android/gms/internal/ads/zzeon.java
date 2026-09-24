package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeon extends zzeog {
    private final zzcmx zza;
    private final zzdbo zzb;
    private final zzdif zzc;
    private final zzeor zzd;

    @Nullable
    private final zzfkf zze;
    private final zzell zzf;

    public zzeon(zzcmx zzcmxVar, zzdbo zzdboVar, zzdif zzdifVar, @Nullable zzfkf zzfkfVar, zzeor zzeorVar, zzell zzellVar) {
        this.zza = zzcmxVar;
        this.zzb = zzdboVar;
        this.zzc = zzdifVar;
        this.zze = zzfkfVar;
        this.zzd = zzeorVar;
        this.zzf = zzellVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeog
    protected final ListenableFuture zzc(zzfkm zzfkmVar, Bundle bundle, zzfjt zzfjtVar, zzfke zzfkeVar) {
        zzfkf zzfkfVar;
        zzdbo zzdboVar = this.zzb;
        zzdboVar.zzb(zzfkmVar);
        zzdboVar.zzc(bundle);
        zzdboVar.zzd(new zzdbi(zzfkeVar, zzfjtVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzev)).booleanValue() && (zzfkfVar = this.zze) != null) {
            zzdboVar.zzf(zzfkfVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzew)).booleanValue()) {
            zzdboVar.zzg(this.zzf);
        }
        zzdve zzdveVarZzp = this.zza.zzp();
        zzdveVarZzp.zzd(zzdboVar.zze());
        zzdveVarZzp.zze(this.zzc);
        zzcyl zzcylVarZza = zzdveVarZzp.zza().zza();
        return zzcylVarZza.zzc(zzcylVarZza.zzb());
    }
}
