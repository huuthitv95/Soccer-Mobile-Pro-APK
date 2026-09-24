package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzday implements zzdcf, zzdjr, zzdhh, zzdcv, zzbee {
    private final zzdcx zza;
    private final zzdey zzb;
    private final zzfjt zzc;
    private final ScheduledExecutorService zzd;
    private final Executor zze;
    private ScheduledFuture zzg;
    private final String zzi;
    private final zzhcb zzf = zzhcb.zze();
    private final AtomicBoolean zzh = new AtomicBoolean();

    zzday(zzdcx zzdcxVar, zzfjt zzfjtVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, zzdey zzdeyVar) {
        this.zza = zzdcxVar;
        this.zzc = zzfjtVar;
        this.zzd = scheduledExecutorService;
        this.zze = executor;
        this.zzi = str;
        this.zzb = zzdeyVar;
    }

    private final boolean zzl() {
        return this.zzi.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzd(zzcbd zzcbdVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final synchronized void zzdH() {
        if (this.zzc.zze == 4) {
            this.zza.zza();
            return;
        }
        zzhcb zzhcbVar = this.zzf;
        if (zzhcbVar.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzhcbVar.zza((Object) true);
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzdI() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzdK() {
    }

    @Override // com.google.android.gms.internal.ads.zzbee
    public final void zzdj(zzbed zzbedVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmT)).booleanValue() && zzl() && zzbedVar.zzj && this.zzh.compareAndSet(false, true) && this.zzc.zze != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzds() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzdt() {
        zzfjt zzfjtVar = this.zzc;
        if (zzfjtVar.zze == 3) {
            return;
        }
        int i = zzfjtVar.zzY;
        if (i == 0 || i == 1) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmT)).booleanValue() && zzl()) {
                return;
            }
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzg() {
        zzfjt zzfjtVar = this.zzc;
        int i = zzfjtVar.zze;
        if (i == 3) {
            return;
        }
        if (i == 4) {
            this.zzb.zza();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzch)).booleanValue() && zzfjtVar.zzY == 2) {
            int i2 = zzfjtVar.zzq;
            if (i2 == 0) {
                this.zza.zza();
            } else {
                zzhbi.zzr(this.zzf, new zzdaw(this), this.zze);
                this.zzg = this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdax
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzi();
                    }
                }, i2, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzh() {
    }

    final /* synthetic */ void zzi() {
        synchronized (this) {
            zzhcb zzhcbVar = this.zzf;
            if (zzhcbVar.isDone()) {
                return;
            }
            zzhcbVar.zza((Object) true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final synchronized void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzhcb zzhcbVar = this.zzf;
        if (zzhcbVar.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzhcbVar.zzb(new Exception());
    }

    final /* synthetic */ zzdcx zzk() {
        return this.zza;
    }
}
