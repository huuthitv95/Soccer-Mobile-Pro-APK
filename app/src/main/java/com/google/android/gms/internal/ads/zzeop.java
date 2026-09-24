package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzeop implements zzhbf {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfjw zzb;
    final /* synthetic */ zzfjt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfrk zze;
    final /* synthetic */ zzfke zzf;
    final /* synthetic */ zzeor zzg;

    zzeop(zzeor zzeorVar, long j, zzfjw zzfjwVar, zzfjt zzfjtVar, String str, zzfrk zzfrkVar, zzfke zzfkeVar) {
        this.zza = j;
        this.zzb = zzfjwVar;
        this.zzc = zzfjtVar;
        this.zzd = str;
        this.zze = zzfrkVar;
        this.zzf = zzfkeVar;
        Objects.requireNonNull(zzeorVar);
        this.zzg = zzeorVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006a A[Catch: all -> 0x00ef, TryCatch #0 {, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:36:0x0079, B:37:0x007f, B:39:0x0091, B:40:0x00a6, B:42:0x00ac, B:44:0x00ae, B:52:0x00e6, B:53:0x00ed, B:47:0x00cb, B:49:0x00cf, B:51:0x00d9), top: B:59:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0076 A[Catch: all -> 0x00ef, TryCatch #0 {, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:36:0x0079, B:37:0x007f, B:39:0x0091, B:40:0x00a6, B:42:0x00ac, B:44:0x00ae, B:52:0x00e6, B:53:0x00ed, B:47:0x00cb, B:49:0x00cf, B:51:0x00d9), top: B:59:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[Catch: all -> 0x00ef, TryCatch #0 {, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:36:0x0079, B:37:0x007f, B:39:0x0091, B:40:0x00a6, B:42:0x00ac, B:44:0x00ae, B:52:0x00e6, B:53:0x00ed, B:47:0x00cb, B:49:0x00cf, B:51:0x00d9), top: B:59:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac A[Catch: all -> 0x00ef, DONT_GENERATE, TryCatch #0 {, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:36:0x0079, B:37:0x007f, B:39:0x0091, B:40:0x00a6, B:42:0x00ac, B:44:0x00ae, B:52:0x00e6, B:53:0x00ed, B:47:0x00cb, B:49:0x00cf, B:51:0x00d9), top: B:59:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae A[Catch: all -> 0x00ef, TryCatch #0 {, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:36:0x0079, B:37:0x007f, B:39:0x0091, B:40:0x00a6, B:42:0x00ac, B:44:0x00ae, B:52:0x00e6, B:53:0x00ed, B:47:0x00cb, B:49:0x00cf, B:51:0x00d9), top: B:59:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb A[Catch: all -> 0x00ef, TryCatch #0 {, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:36:0x0079, B:37:0x007f, B:39:0x0091, B:40:0x00a6, B:42:0x00ac, B:44:0x00ae, B:52:0x00e6, B:53:0x00ed, B:47:0x00cb, B:49:0x00cf, B:51:0x00d9), top: B:59:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        int i;
        int i2;
        com.google.android.gms.ads.internal.client.zze zzeVarZzb;
        Integer numValueOf;
        com.google.android.gms.ads.internal.client.zze zzeVarZza;
        int i3;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzeor zzeorVar = this.zzg;
        long jElapsedRealtime = zzeorVar.zzj().elapsedRealtime() - this.zza;
        if (!(th instanceof TimeoutException)) {
            if (th instanceof zzenz) {
                i = 3;
            } else if (th instanceof CancellationException) {
                i2 = 4;
            } else {
                if (!(th instanceof zzfkt)) {
                    if (th instanceof zzedr) {
                        i2 = zzflo.zza(th).zza == 3 ? 1 : 6;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcn)).booleanValue() && (th instanceof zzelk) && (zzeVarZzb = ((zzelk) th).zzb()) != null) {
                            numValueOf = Integer.valueOf(zzeVarZzb.zza);
                            i = i2;
                        }
                    } else {
                        i = 6;
                    }
                    synchronized (zzeorVar) {
                        if (zzeorVar.zzn()) {
                            zzeorVar.zzk().zza(this.zzb, this.zzc, i, th instanceof zzelk ? (zzelk) th : null, jElapsedRealtime);
                            jElapsedRealtime = jElapsedRealtime;
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjC)).booleanValue()) {
                            zzfro zzfroVarZzl = zzeorVar.zzl();
                            zzfrk zzfrkVar = this.zze;
                            zzfke zzfkeVar = this.zzf;
                            zzfjt zzfjtVar = this.zzc;
                            zzfroVarZzl.zza(zzfrkVar.zza(zzfkeVar, zzfjtVar, zzfjtVar.zzn), zzfjtVar.zzax);
                        }
                        if (zzeorVar.zzp()) {
                            return;
                        }
                        LinkedHashMap linkedHashMapZzm = zzeorVar.zzm();
                        zzfjt zzfjtVar2 = this.zzc;
                        linkedHashMapZzm.put(zzfjtVar2, new zzeoq(this.zzd, zzfjtVar2.zzaf, i, jElapsedRealtime, numValueOf));
                        zzeVarZza = zzflo.zza(th);
                        i3 = zzeVarZza.zza;
                        if ((i3 != 3 || i3 == 0) && (zzeVar = zzeVarZza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                        }
                        zzeorVar.zzo().zze(zzfjtVar2, jElapsedRealtime, zzeVarZza);
                    }
                }
                i2 = 5;
            }
            numValueOf = null;
            synchronized (zzeorVar) {
                if (zzeorVar.zzn()) {
                    zzeorVar.zzk().zza(this.zzb, this.zzc, i, th instanceof zzelk ? (zzelk) th : null, jElapsedRealtime);
                    jElapsedRealtime = jElapsedRealtime;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjC)).booleanValue()) {
                    zzfro zzfroVarZzl2 = zzeorVar.zzl();
                    zzfrk zzfrkVar2 = this.zze;
                    zzfke zzfkeVar2 = this.zzf;
                    zzfjt zzfjtVar3 = this.zzc;
                    zzfroVarZzl2.zza(zzfrkVar2.zza(zzfkeVar2, zzfjtVar3, zzfjtVar3.zzn), zzfjtVar3.zzax);
                }
                if (zzeorVar.zzp()) {
                    return;
                }
                LinkedHashMap linkedHashMapZzm2 = zzeorVar.zzm();
                zzfjt zzfjtVar4 = this.zzc;
                linkedHashMapZzm2.put(zzfjtVar4, new zzeoq(this.zzd, zzfjtVar4.zzaf, i, jElapsedRealtime, numValueOf));
                zzeVarZza = zzflo.zza(th);
                i3 = zzeVarZza.zza;
                zzeVarZza = i3 != 3 ? zzflo.zza(new zzelk(13, zzeVarZza.zzd)) : zzflo.zza(new zzelk(13, zzeVarZza.zzd));
                zzeorVar.zzo().zze(zzfjtVar4, jElapsedRealtime, zzeVarZza);
            }
        }
        i2 = 2;
        i = i2;
        numValueOf = null;
        synchronized (zzeorVar) {
            if (zzeorVar.zzn()) {
                zzeorVar.zzk().zza(this.zzb, this.zzc, i, th instanceof zzelk ? (zzelk) th : null, jElapsedRealtime);
                jElapsedRealtime = jElapsedRealtime;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjC)).booleanValue()) {
                zzfro zzfroVarZzl3 = zzeorVar.zzl();
                zzfrk zzfrkVar3 = this.zze;
                zzfke zzfkeVar3 = this.zzf;
                zzfjt zzfjtVar5 = this.zzc;
                zzfroVarZzl3.zza(zzfrkVar3.zza(zzfkeVar3, zzfjtVar5, zzfjtVar5.zzn), zzfjtVar5.zzax);
            }
            if (zzeorVar.zzp()) {
                return;
            }
            LinkedHashMap linkedHashMapZzm3 = zzeorVar.zzm();
            zzfjt zzfjtVar6 = this.zzc;
            linkedHashMapZzm3.put(zzfjtVar6, new zzeoq(this.zzd, zzfjtVar6.zzaf, i, jElapsedRealtime, numValueOf));
            zzeVarZza = zzflo.zza(th);
            i3 = zzeVarZza.zza;
            if (i3 != 3) {
            }
            zzeorVar.zzo().zze(zzfjtVar6, jElapsedRealtime, zzeVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zzb(Object obj) {
        long j;
        zzeor zzeorVar = this.zzg;
        long jElapsedRealtime = zzeorVar.zzj().elapsedRealtime() - this.zza;
        synchronized (zzeorVar) {
            if (zzeorVar.zzn()) {
                j = jElapsedRealtime;
                zzeorVar.zzk().zza(this.zzb, this.zzc, 0, null, j);
            } else {
                j = jElapsedRealtime;
            }
            if (zzeorVar.zzp()) {
                return;
            }
            zzfjt zzfjtVar = this.zzc;
            if (zzeorVar.zzi(zzfjtVar)) {
                ((zzeoq) zzeorVar.zzm().get(zzfjtVar)).zzd = j;
            } else {
                long j2 = j;
                j = j2;
                zzeorVar.zzm().put(zzfjtVar, new zzeoq(this.zzd, zzfjtVar.zzaf, 0, j2, null));
            }
            zzeorVar.zzo().zzd(zzfjtVar, j, null);
        }
    }
}
