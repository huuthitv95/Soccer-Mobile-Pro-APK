package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfhu implements zzhbf {
    final /* synthetic */ zzetf zza;
    final /* synthetic */ zzfps zzb;
    final /* synthetic */ zzfpi zzc;
    final /* synthetic */ zzdmu zzd;
    final /* synthetic */ zzfhw zze;

    zzfhu(zzfhw zzfhwVar, zzetf zzetfVar, zzfps zzfpsVar, zzfpi zzfpiVar, zzdmu zzdmuVar) {
        this.zza = zzetfVar;
        this.zzb = zzfpsVar;
        this.zzc = zzfpiVar;
        this.zzd = zzdmuVar;
        Objects.requireNonNull(zzfhwVar);
        this.zze = zzfhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        zzfps zzfpsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgL)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Interstitial ad failed to load", th);
        }
        zzdmu zzdmuVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzdmuVar.zzb().zzg(th);
        zzfhw zzfhwVar = this.zze;
        synchronized (zzfhwVar) {
            zzfhwVar.zzi(null);
            zzdmuVar.zza().zzdJ(zzeVarZzg);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzju)).booleanValue()) {
                zzfhwVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzf().zzdJ(zzeVarZzg);
                    }
                });
                zzfhwVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhs
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzg().zzdJ(zzeVarZzg);
                    }
                });
            }
            zzflj.zza(zzeVarZzg.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbjx.zzc.zze()).booleanValue() || (zzfpsVar = this.zzb) == null) {
                zzfpv zzfpvVarZzh = zzfhwVar.zzh();
                zzfpi zzfpiVar = this.zzc;
                zzfpiVar.zzh(zzeVarZzg);
                zzfpiVar.zzj(th);
                zzfpiVar.zzd(false);
                zzfpvVarZzh.zzb(zzfpiVar.zzm());
            } else {
                zzfpsVar.zzf(zzeVarZzg);
                zzfpi zzfpiVar2 = this.zzc;
                zzfpiVar2.zzj(th);
                zzfpiVar2.zzd(false);
                zzfpsVar.zza(zzfpiVar2);
                zzfpsVar.zzh();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0047 A[Catch: all -> 0x00b8, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0020, B:9:0x0032, B:11:0x0047, B:12:0x005f, B:14:0x006e, B:16:0x0072, B:18:0x00b6, B:17:0x0092), top: B:23:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0092 A[Catch: all -> 0x00b8, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0020, B:9:0x0032, B:11:0x0047, B:12:0x005f, B:14:0x006e, B:16:0x0072, B:18:0x00b6, B:17:0x0092), top: B:23:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0020 A[Catch: all -> 0x00b8, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0020, B:9:0x0032, B:11:0x0047, B:12:0x005f, B:14:0x006e, B:16:0x0072, B:18:0x00b6, B:17:0x0092), top: B:23:0x0007 }] */
    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbhv zzbhvVar;
        zzfps zzfpsVar;
        zzfhw zzfhwVar = this.zze;
        zzdln zzdlnVar = (zzdln) obj;
        synchronized (zzfhwVar) {
            if (zzdlnVar != null) {
                zzdlnVar.zzt();
                zzfhwVar.zzi(null);
                zzbhvVar = zzbie.zzju;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
                    zzdfv zzdfvVarZzq = zzdlnVar.zzq();
                    zzdfvVarZzq.zza(zzfhwVar.zzf());
                    zzdfvVarZzq.zzd(zzfhwVar.zzg());
                }
                this.zza.zzb(zzdlnVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
                    zzfhwVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfht
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzf().zzg();
                        }
                    });
                    zzfhwVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhq
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzg().zzg();
                        }
                    });
                }
                if (((Boolean) zzbjx.zzc.zze()).booleanValue() || (zzfpsVar = this.zzb) == null) {
                    zzfpv zzfpvVarZzh = zzfhwVar.zzh();
                    zzfpi zzfpiVar = this.zzc;
                    zzfpiVar.zzg(zzdlnVar.zzr().zzb);
                    zzfpiVar.zzi(zzdlnVar.zzn().zze());
                    zzfpiVar.zzd(true);
                    zzfpvVarZzh.zzb(zzfpiVar.zzm());
                } else {
                    zzfpsVar.zze(zzdlnVar.zzr().zzb);
                    zzfpsVar.zzg(zzdlnVar.zzn().zze());
                    zzfpi zzfpiVar2 = this.zzc;
                    zzfpiVar2.zzd(true);
                    zzfpsVar.zza(zzfpiVar2);
                    zzfpsVar.zzh();
                }
            } else {
                zzfhwVar.zzi(null);
                zzbhvVar = zzbie.zzju;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
                    zzdfv zzdfvVarZzq2 = zzdlnVar.zzq();
                    zzdfvVarZzq2.zza(zzfhwVar.zzf());
                    zzdfvVarZzq2.zzd(zzfhwVar.zzg());
                }
                this.zza.zzb(zzdlnVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
                    zzfhwVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfht
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzf().zzg();
                        }
                    });
                    zzfhwVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhq
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzg().zzg();
                        }
                    });
                }
                if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
                    zzfpv zzfpvVarZzh2 = zzfhwVar.zzh();
                    zzfpi zzfpiVar3 = this.zzc;
                    zzfpiVar3.zzg(zzdlnVar.zzr().zzb);
                    zzfpiVar3.zzi(zzdlnVar.zzn().zze());
                    zzfpiVar3.zzd(true);
                    zzfpvVarZzh2.zzb(zzfpiVar3.zzm());
                } else {
                    zzfpv zzfpvVarZzh3 = zzfhwVar.zzh();
                    zzfpi zzfpiVar4 = this.zzc;
                    zzfpiVar4.zzg(zzdlnVar.zzr().zzb);
                    zzfpiVar4.zzi(zzdlnVar.zzn().zze());
                    zzfpiVar4.zzd(true);
                    zzfpvVarZzh3.zzb(zzfpiVar4.zzm());
                }
            }
            throw th;
        }
    }
}
