package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcfa {
    private zzhbs zza;
    private zzdyz zzb;
    private Context zzc;
    private final AtomicBoolean zzd = new AtomicBoolean(false);
    private final AtomicBoolean zze = new AtomicBoolean(false);
    private long zzf = -1;
    private long zzg = -1;

    public final void zza(zzhbs zzhbsVar, zzdyz zzdyzVar, Context context) {
        if (this.zzd.getAndSet(true)) {
            return;
        }
        this.zza = zzhbsVar;
        this.zzb = zzdyzVar;
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpk)).longValue();
        this.zzg = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpl)).longValue();
        this.zzc = context;
    }

    public final void zzb() {
        zzhbs zzhbsVar;
        if (!this.zzd.get() || this.zzf < 0 || this.zzg < 0 || !this.zze.compareAndSet(false, true) || (zzhbsVar = this.zza) == null) {
            return;
        }
        zzhbsVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcey
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    final /* synthetic */ void zzc() {
        zzdyz zzdyzVar;
        ActivityManager.MemoryInfo memoryInfoZze;
        while (this.zze.get()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcex
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    atomicBoolean.getAndSet(true);
                }
            });
            try {
                Thread.sleep(this.zzf);
                if (!atomicBoolean.get()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpm)).booleanValue() && (zzdyzVar = this.zzb) != null) {
                        zzdyy zzdyyVarZza = zzdyzVar.zza();
                        zzdyyVarZza.zzc("action", "panr");
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpO)).booleanValue() && (memoryInfoZze = com.google.android.gms.ads.internal.util.client.zzf.zze(this.zzc)) != null) {
                            zzdyyVarZza.zzc("mem_avl", String.valueOf(memoryInfoZze.availMem));
                            zzdyyVarZza.zzc("mem_tt", String.valueOf(memoryInfoZze.totalMem));
                            zzdyyVarZza.zzc("low_m", true != memoryInfoZze.lowMemory ? "0" : "1");
                        }
                        zzdyyVarZza.zzf();
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpn)).booleanValue()) {
                        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                        zzcez zzcezVar = new zzcez("Potential ANR detected");
                        zzcezVar.setStackTrace(stackTrace);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpo)).booleanValue()) {
                            zzbzm.zzc(this.zzc).zzi(zzcezVar, "AnrWatchdog", ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpp)).intValue() / 100.0f);
                        } else {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(zzcezVar, "AnrWatchdog");
                        }
                    }
                }
                do {
                    try {
                        Thread.sleep(this.zzg);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                } while (!atomicBoolean.get());
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
