package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfjc implements zzhbf {
    final /* synthetic */ zzetf zza;
    final /* synthetic */ zzfps zzb;
    final /* synthetic */ zzfpi zzc;
    final /* synthetic */ zzfjf zzd;
    final /* synthetic */ zzfjg zze;

    zzfjc(zzfjg zzfjgVar, zzetf zzetfVar, zzfps zzfpsVar, zzfpi zzfpiVar, zzfjf zzfjfVar) {
        this.zza = zzetfVar;
        this.zzb = zzfpsVar;
        this.zzc = zzfpiVar;
        this.zzd = zzfjfVar;
        Objects.requireNonNull(zzfjgVar);
        this.zze = zzfjgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        zzfps zzfpsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgL)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th);
        }
        zzfjg zzfjgVar = this.zze;
        zzdvf zzdvfVar = (zzdvf) zzfjgVar.zzh().zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzdvfVar == null ? zzflo.zzb(th, null) : zzdvfVar.zza().zzg(th);
        synchronized (zzfjgVar) {
            try {
                if (zzdvfVar != null) {
                    zzdvfVar.zze().zzdJ(zzeVarZzb);
                    zzfjgVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfjb
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzg().zzdJ(zzeVarZzb);
                        }
                    });
                } else {
                    zzfjgVar.zzg().zzdJ(zzeVarZzb);
                    zzfjgVar.zze(this.zzd).zzh().zza().zzd().zzo();
                }
                zzflj.zza(zzeVarZzb.zza, th, "RewardedAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbjx.zzc.zze()).booleanValue() || (zzfpsVar = this.zzb) == null) {
                    zzfpv zzfpvVarZzi = zzfjgVar.zzi();
                    zzfpi zzfpiVar = this.zzc;
                    zzfpiVar.zzh(zzeVarZzb);
                    zzfpiVar.zzj(th);
                    zzfpiVar.zzd(false);
                    zzfpvVarZzi.zzb(zzfpiVar.zzm());
                } else {
                    zzfpsVar.zzf(zzeVarZzb);
                    zzfpi zzfpiVar2 = this.zzc;
                    zzfpiVar2.zzj(th);
                    zzfpiVar2.zzd(false);
                    zzfpsVar.zza(zzfpiVar2);
                    zzfpsVar.zzh();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0067 A[Catch: all -> 0x008d, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0043, B:10:0x0047, B:12:0x008b, B:11:0x0067), top: B:17:0x0007 }] */
    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfps zzfpsVar;
        zzfjg zzfjgVar = this.zze;
        zzdva zzdvaVar = (zzdva) obj;
        synchronized (zzfjgVar) {
            if (zzdvaVar != null) {
                zzdvaVar.zzt();
                zzdvaVar.zzq().zzd(zzfjgVar.zzg());
                this.zza.zzb(zzdvaVar);
                Executor executorZzf = zzfjgVar.zzf();
                final zzfix zzfixVarZzg = zzfjgVar.zzg();
                Objects.requireNonNull(zzfixVarZzg);
                executorZzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfja
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfixVarZzg.zzg();
                    }
                });
                zzfjgVar.zzg().onAdMetadataChanged();
                if (((Boolean) zzbjx.zzc.zze()).booleanValue() || (zzfpsVar = this.zzb) == null) {
                    zzfpv zzfpvVarZzi = zzfjgVar.zzi();
                    zzfpi zzfpiVar = this.zzc;
                    zzfpiVar.zzg(zzdvaVar.zzr().zzb);
                    zzfpiVar.zzi(zzdvaVar.zzn().zze());
                    zzfpiVar.zzd(true);
                    zzfpvVarZzi.zzb(zzfpiVar.zzm());
                } else {
                    zzfpsVar.zze(zzdvaVar.zzr().zzb);
                    zzfpsVar.zzg(zzdvaVar.zzn().zze());
                    zzfpi zzfpiVar2 = this.zzc;
                    zzfpiVar2.zzd(true);
                    zzfpsVar.zza(zzfpiVar2);
                    zzfpsVar.zzh();
                }
            } else {
                zzdvaVar.zzq().zzd(zzfjgVar.zzg());
                this.zza.zzb(zzdvaVar);
                Executor executorZzf2 = zzfjgVar.zzf();
                final zzfix zzfixVarZzg2 = zzfjgVar.zzg();
                Objects.requireNonNull(zzfixVarZzg2);
                executorZzf2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfja
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfixVarZzg2.zzg();
                    }
                });
                zzfjgVar.zzg().onAdMetadataChanged();
                if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
                    zzfpv zzfpvVarZzi2 = zzfjgVar.zzi();
                    zzfpi zzfpiVar3 = this.zzc;
                    zzfpiVar3.zzg(zzdvaVar.zzr().zzb);
                    zzfpiVar3.zzi(zzdvaVar.zzn().zze());
                    zzfpiVar3.zzd(true);
                    zzfpvVarZzi2.zzb(zzfpiVar3.zzm());
                } else {
                    zzfpv zzfpvVarZzi3 = zzfjgVar.zzi();
                    zzfpi zzfpiVar4 = this.zzc;
                    zzfpiVar4.zzg(zzdvaVar.zzr().zzb);
                    zzfpiVar4.zzi(zzdvaVar.zzn().zze());
                    zzfpiVar4.zzd(true);
                    zzfpvVarZzi3.zzb(zzfpiVar4.zzm());
                }
            }
            throw th;
        }
    }
}
