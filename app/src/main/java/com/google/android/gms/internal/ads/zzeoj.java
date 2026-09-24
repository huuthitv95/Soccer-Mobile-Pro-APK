package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeoj extends zzeog {
    private final zzcmx zza;
    private final zzdbo zzb;
    private final zzeqw zzc;
    private final zzdif zzd;
    private final zzdnl zze;
    private final zzdfg zzf;
    private final ViewGroup zzg;
    private final zzdhl zzh;
    private final zzeor zzi;
    private final zzell zzj;

    public zzeoj(zzcmx zzcmxVar, zzdbo zzdboVar, zzeqw zzeqwVar, zzdif zzdifVar, zzdnl zzdnlVar, zzdfg zzdfgVar, ViewGroup viewGroup, zzdhl zzdhlVar, zzeor zzeorVar, zzell zzellVar) {
        this.zza = zzcmxVar;
        this.zzb = zzdboVar;
        this.zzc = zzeqwVar;
        this.zzd = zzdifVar;
        this.zze = zzdnlVar;
        this.zzf = zzdfgVar;
        this.zzg = viewGroup;
        this.zzh = zzdhlVar;
        this.zzi = zzeorVar;
        this.zzj = zzellVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeog
    protected final ListenableFuture zzc(zzfkm zzfkmVar, Bundle bundle, zzfjt zzfjtVar, zzfke zzfkeVar) {
        zzdbo zzdboVar = this.zzb;
        zzdboVar.zzb(zzfkmVar);
        zzdboVar.zzc(bundle);
        zzdboVar.zzd(new zzdbi(zzfkeVar, zzfjtVar, this.zzi));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzew)).booleanValue()) {
            zzdboVar.zzg(this.zzj);
        }
        zzcwd zzcwdVarZzi = this.zza.zzi();
        zzcwdVarZzi.zzl(zzdboVar.zze());
        zzcwdVarZzi.zzm(this.zzd);
        zzcwdVarZzi.zzk(this.zzc);
        zzcwdVarZzi.zzd(this.zze);
        zzcwdVarZzi.zzg(new zzcwz(this.zzf, this.zzh));
        zzcwdVarZzi.zze(new zzcuw(this.zzg));
        zzcyl zzcylVarZzc = zzcwdVarZzi.zza().zzc();
        return zzcylVarZzc.zzc(zzcylVarZzc.zzb());
    }
}
