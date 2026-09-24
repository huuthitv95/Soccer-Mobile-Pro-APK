package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzepj extends zzeqk {
    private final zzdkv zza;

    public zzepj(zzdcd zzdcdVar, zzdkk zzdkkVar, zzdcx zzdcxVar, zzddm zzddmVar, zzddr zzddrVar, zzdcs zzdcsVar, zzdhj zzdhjVar, zzdli zzdliVar, zzdeq zzdeqVar, zzdkv zzdkvVar, zzdhf zzdhfVar) {
        super(zzdcdVar, zzdkkVar, zzdcxVar, zzddmVar, zzddrVar, zzdhjVar, zzdeqVar, zzdliVar, zzdhfVar, zzdcsVar);
        this.zza = zzdkvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqk, com.google.android.gms.internal.ads.zzbuw
    public final void zzn() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzeqk, com.google.android.gms.internal.ads.zzbuw
    public final void zzo() {
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeqk, com.google.android.gms.internal.ads.zzbuw
    public final void zzp(zzcbp zzcbpVar) {
        this.zza.zzb(zzcbpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqk, com.google.android.gms.internal.ads.zzbuw
    public final void zzr(zzcbt zzcbtVar) throws RemoteException {
        this.zza.zzb(new zzcbp(zzcbtVar.zze(), zzcbtVar.zzf()));
    }

    @Override // com.google.android.gms.internal.ads.zzeqk, com.google.android.gms.internal.ads.zzbuw
    public final void zzt() throws RemoteException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzeqk, com.google.android.gms.internal.ads.zzbuw
    public final void zzz() throws RemoteException {
        this.zza.zzb(null);
    }
}
