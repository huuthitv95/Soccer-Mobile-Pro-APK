package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfex implements zzhbf {
    final /* synthetic */ zzetf zza;
    final /* synthetic */ zzfps zzb;
    final /* synthetic */ zzfpi zzc;
    final /* synthetic */ zzfey zzd;
    final /* synthetic */ zzffb zze;

    zzfex(zzffb zzffbVar, zzetf zzetfVar, zzfps zzfpsVar, zzfpi zzfpiVar, zzfey zzfeyVar) {
        this.zza = zzetfVar;
        this.zzb = zzfpsVar;
        this.zzc = zzfpiVar;
        this.zzd = zzfeyVar;
        Objects.requireNonNull(zzffbVar);
        this.zze = zzffbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        zzfps zzfpsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgL)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th);
        }
        zzffb zzffbVar = this.zze;
        zzcuj zzcujVar = (zzcuj) zzffbVar.zzj().zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzcujVar == null ? zzflo.zzb(th, null) : zzcujVar.zza().zzg(th);
        synchronized (zzffbVar) {
            zzffbVar.zzl(null);
            if (zzcujVar != null) {
                zzcujVar.zze().zzdJ(zzeVarZzb);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjt)).booleanValue()) {
                    zzffbVar.zzh().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfew
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzi().zzdJ(zzeVarZzb);
                        }
                    });
                }
            } else {
                zzffbVar.zzi().zzdJ(zzeVarZzb);
                ((zzcuj) zzffbVar.zzg(this.zzd).zzh()).zza().zzd().zzo();
            }
            zzflj.zza(zzeVarZzb.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbjx.zzc.zze()).booleanValue() || (zzfpsVar = this.zzb) == null) {
                zzfpv zzfpvVarZzk = zzffbVar.zzk();
                zzfpi zzfpiVar = this.zzc;
                zzfpiVar.zzh(zzeVarZzb);
                zzfpiVar.zzj(th);
                zzfpiVar.zzd(false);
                zzfpvVarZzk.zzb(zzfpiVar.zzm());
            } else {
                zzfpsVar.zzf(zzeVarZzb);
                zzfpi zzfpiVar2 = this.zzc;
                zzfpiVar2.zzj(th);
                zzfpiVar2.zzd(false);
                zzfpsVar.zza(zzfpiVar2);
                zzfpsVar.zzh();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0063 A[Catch: all -> 0x0089, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0020, B:9:0x002b, B:11:0x003f, B:13:0x0043, B:15:0x0087, B:14:0x0063), top: B:20:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0020 A[Catch: all -> 0x0089, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0020, B:9:0x002b, B:11:0x003f, B:13:0x0043, B:15:0x0087, B:14:0x0063), top: B:20:0x0007 }] */
    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfps zzfpsVar;
        zzffb zzffbVar = this.zze;
        zzcxh zzcxhVar = (zzcxh) obj;
        synchronized (zzffbVar) {
            if (zzcxhVar != null) {
                zzcxhVar.zzt();
                zzffbVar.zzl(null);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjt)).booleanValue()) {
                    zzcxhVar.zzq().zzc(zzffbVar.zzi());
                }
                this.zza.zzb(zzcxhVar);
                if (((Boolean) zzbjx.zzc.zze()).booleanValue() || (zzfpsVar = this.zzb) == null) {
                    zzfpv zzfpvVarZzk = zzffbVar.zzk();
                    zzfpi zzfpiVar = this.zzc;
                    zzfpiVar.zzg(zzcxhVar.zzr().zzb);
                    zzfpiVar.zzi(zzcxhVar.zzn().zze());
                    zzfpiVar.zzd(true);
                    zzfpvVarZzk.zzb(zzfpiVar.zzm());
                } else {
                    zzfpsVar.zze(zzcxhVar.zzr().zzb);
                    zzfpsVar.zzg(zzcxhVar.zzn().zze());
                    zzfpi zzfpiVar2 = this.zzc;
                    zzfpiVar2.zzd(true);
                    zzfpsVar.zza(zzfpiVar2);
                    zzfpsVar.zzh();
                }
            } else {
                zzffbVar.zzl(null);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjt)).booleanValue()) {
                    zzcxhVar.zzq().zzc(zzffbVar.zzi());
                }
                this.zza.zzb(zzcxhVar);
                if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
                    zzfpv zzfpvVarZzk2 = zzffbVar.zzk();
                    zzfpi zzfpiVar3 = this.zzc;
                    zzfpiVar3.zzg(zzcxhVar.zzr().zzb);
                    zzfpiVar3.zzi(zzcxhVar.zzn().zze());
                    zzfpiVar3.zzd(true);
                    zzfpvVarZzk2.zzb(zzfpiVar3.zzm());
                } else {
                    zzfpv zzfpvVarZzk3 = zzffbVar.zzk();
                    zzfpi zzfpiVar4 = this.zzc;
                    zzfpiVar4.zzg(zzcxhVar.zzr().zzb);
                    zzfpiVar4.zzi(zzcxhVar.zzn().zze());
                    zzfpiVar4.zzd(true);
                    zzfpvVarZzk3.zzb(zzfpiVar4.zzm());
                }
            }
            throw th;
        }
    }
}
