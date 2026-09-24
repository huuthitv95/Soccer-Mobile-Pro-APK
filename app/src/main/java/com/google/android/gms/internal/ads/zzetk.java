package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzetk implements zzhbf {
    final /* synthetic */ zzetf zza;
    final /* synthetic */ zzfps zzb;
    final /* synthetic */ zzfpi zzc;
    final /* synthetic */ zzdnq zzd;
    final /* synthetic */ zzetn zze;

    zzetk(zzetn zzetnVar, zzetf zzetfVar, zzfps zzfpsVar, zzfpi zzfpiVar, zzdnq zzdnqVar) {
        this.zza = zzetfVar;
        this.zzb = zzfpsVar;
        this.zzc = zzfpiVar;
        this.zzd = zzdnqVar;
        Objects.requireNonNull(zzetnVar);
        this.zze = zzetnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        zzfps zzfpsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgL)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Native ad failed to load", th);
        }
        zzdnq zzdnqVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzdnqVar.zza().zzg(th);
        zzdnqVar.zzb().zzdJ(zzeVarZzg);
        zzetn zzetnVar = this.zze;
        zzetnVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeti
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze.zzf().zze().zzdJ(zzeVarZzg);
            }
        });
        zzflj.zza(zzeVarZzg.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbjx.zzc.zze()).booleanValue() || (zzfpsVar = this.zzb) == null) {
            zzfpv zzfpvVarZzg = zzetnVar.zzg();
            zzfpi zzfpiVar = this.zzc;
            zzfpiVar.zzh(zzeVarZzg);
            zzfpiVar.zzj(th);
            zzfpiVar.zzd(false);
            zzfpvVarZzg.zzb(zzfpiVar.zzm());
            return;
        }
        zzfpsVar.zzf(zzeVarZzg);
        zzfpi zzfpiVar2 = this.zzc;
        zzfpiVar2.zzj(th);
        zzfpiVar2.zzd(false);
        zzfpsVar.zza(zzfpiVar2);
        zzfpsVar.zzh();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0061 A[Catch: all -> 0x0087, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x003d, B:10:0x0041, B:12:0x0085, B:11:0x0061), top: B:17:0x0007 }] */
    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfps zzfpsVar;
        zzetn zzetnVar = this.zze;
        zzcxh zzcxhVar = (zzcxh) obj;
        synchronized (zzetnVar) {
            if (zzcxhVar != null) {
                zzcxhVar.zzt();
                zzcxhVar.zzq().zza(zzetnVar.zzf().zzc());
                this.zza.zzb(zzcxhVar);
                zzetnVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzetj
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzf().zzd().zzg();
                    }
                });
                if (((Boolean) zzbjx.zzc.zze()).booleanValue() || (zzfpsVar = this.zzb) == null) {
                    zzfpv zzfpvVarZzg = zzetnVar.zzg();
                    zzfpi zzfpiVar = this.zzc;
                    zzfpiVar.zzg(zzcxhVar.zzr().zzb);
                    zzfpiVar.zzi(zzcxhVar.zzn().zze());
                    zzfpiVar.zzd(true);
                    zzfpvVarZzg.zzb(zzfpiVar.zzm());
                } else {
                    zzfpsVar.zze(zzcxhVar.zzr().zzb);
                    zzfpsVar.zzg(zzcxhVar.zzn().zze());
                    zzfpi zzfpiVar2 = this.zzc;
                    zzfpiVar2.zzd(true);
                    zzfpsVar.zza(zzfpiVar2);
                    zzfpsVar.zzh();
                }
            } else {
                zzcxhVar.zzq().zza(zzetnVar.zzf().zzc());
                this.zza.zzb(zzcxhVar);
                zzetnVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzetj
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzf().zzd().zzg();
                    }
                });
                if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
                    zzfpv zzfpvVarZzg2 = zzetnVar.zzg();
                    zzfpi zzfpiVar3 = this.zzc;
                    zzfpiVar3.zzg(zzcxhVar.zzr().zzb);
                    zzfpiVar3.zzi(zzcxhVar.zzn().zze());
                    zzfpiVar3.zzd(true);
                    zzfpvVarZzg2.zzb(zzfpiVar3.zzm());
                } else {
                    zzfpv zzfpvVarZzg3 = zzetnVar.zzg();
                    zzfpi zzfpiVar4 = this.zzc;
                    zzfpiVar4.zzg(zzcxhVar.zzr().zzb);
                    zzfpiVar4.zzi(zzcxhVar.zzn().zze());
                    zzfpiVar4.zzd(true);
                    zzfpvVarZzg3.zzb(zzfpiVar4.zzm());
                }
            }
            throw th;
        }
    }
}
