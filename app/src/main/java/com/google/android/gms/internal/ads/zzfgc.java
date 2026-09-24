package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfgc implements zzhbf {
    final /* synthetic */ zzfps zza;
    final /* synthetic */ zzfpi zzb;
    final /* synthetic */ zzcwe zzc;
    final /* synthetic */ zzfgg zzd;

    zzfgc(zzfgg zzfggVar, zzfps zzfpsVar, zzfpi zzfpiVar, zzcwe zzcweVar) {
        this.zza = zzfpsVar;
        this.zzb = zzfpiVar;
        this.zzc = zzcweVar;
        Objects.requireNonNull(zzfggVar);
        this.zzd = zzfggVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        zzfps zzfpsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgL)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Banner ad failed to load", th);
        }
        zzfgg zzfggVar = this.zzd;
        synchronized (zzfggVar) {
            zzcwe zzcweVar = this.zzc;
            com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzcweVar.zzc().zzg(th);
            zzfggVar.zzs(zzeVarZzg);
            zzcweVar.zzb().zzdJ(zzeVarZzg);
            zzflj.zza(zzeVarZzg.zza, th, "BannerAdLoader.onFailure");
            if (zzfggVar.zzr()) {
                zzfggVar.zzn();
                zzfggVar.zzo().zzd(zzfggVar.zzq().zzc());
            }
            if (!((Boolean) zzbjx.zzc.zze()).booleanValue() || (zzfpsVar = this.zza) == null) {
                zzfpv zzfpvVarZzp = zzfggVar.zzp();
                zzfpi zzfpiVar = this.zzb;
                zzfpiVar.zzh(zzeVarZzg);
                zzfpiVar.zzj(th);
                zzfpiVar.zzd(false);
                zzfpvVarZzp.zzb(zzfpiVar.zzm());
            } else {
                zzfpsVar.zzf(zzeVarZzg);
                zzfpi zzfpiVar2 = this.zzb;
                zzfpiVar2.zzj(th);
                zzfpiVar2.zzd(false);
                zzfpsVar.zza(zzfpiVar2);
                zzfpsVar.zzh();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[Catch: all -> 0x006c, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0010, B:9:0x0013, B:11:0x0022, B:13:0x0026, B:15:0x006a, B:14:0x0046), top: B:20:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0010 A[Catch: all -> 0x006c, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0010, B:9:0x0013, B:11:0x0022, B:13:0x0026, B:15:0x006a, B:14:0x0046), top: B:20:0x0007 }] */
    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfps zzfpsVar;
        zzfgg zzfggVar = this.zzd;
        zzcuz zzcuzVar = (zzcuz) obj;
        synchronized (zzfggVar) {
            if (zzcuzVar != null) {
                zzcuzVar.zzt();
                if (zzfggVar.zzr()) {
                    zzfggVar.zzc();
                }
                if (((Boolean) zzbjx.zzc.zze()).booleanValue() || (zzfpsVar = this.zza) == null) {
                    zzfpv zzfpvVarZzp = zzfggVar.zzp();
                    zzfpi zzfpiVar = this.zzb;
                    zzfpiVar.zzg(zzcuzVar.zzr().zzb);
                    zzfpiVar.zzi(zzcuzVar.zzn().zze());
                    zzfpiVar.zzd(true);
                    zzfpvVarZzp.zzb(zzfpiVar.zzm());
                } else {
                    zzfpsVar.zze(zzcuzVar.zzr().zzb);
                    zzfpsVar.zzg(zzcuzVar.zzn().zze());
                    zzfpi zzfpiVar2 = this.zzb;
                    zzfpiVar2.zzd(true);
                    zzfpsVar.zza(zzfpiVar2);
                    zzfpsVar.zzh();
                }
            } else {
                if (zzfggVar.zzr()) {
                    zzfggVar.zzc();
                }
                if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
                    zzfpv zzfpvVarZzp2 = zzfggVar.zzp();
                    zzfpi zzfpiVar3 = this.zzb;
                    zzfpiVar3.zzg(zzcuzVar.zzr().zzb);
                    zzfpiVar3.zzi(zzcuzVar.zzn().zze());
                    zzfpiVar3.zzd(true);
                    zzfpvVarZzp2.zzb(zzfpiVar3.zzm());
                } else {
                    zzfpv zzfpvVarZzp3 = zzfggVar.zzp();
                    zzfpi zzfpiVar4 = this.zzb;
                    zzfpiVar4.zzg(zzcuzVar.zzr().zzb);
                    zzfpiVar4.zzi(zzcuzVar.zzn().zze());
                    zzfpiVar4.zzd(true);
                    zzfpvVarZzp3.zzb(zzfpiVar4.zzm());
                }
            }
            throw th;
        }
    }
}
