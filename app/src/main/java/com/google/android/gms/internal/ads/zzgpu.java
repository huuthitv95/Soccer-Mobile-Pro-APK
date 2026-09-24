package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgpu {
    private final zzgeq zza;
    private final zzgbx zzb;

    zzgpu(zzgbx zzgbxVar, zzgeq zzgeqVar) {
        this.zza = zzgeqVar;
        this.zzb = zzgbxVar;
    }

    public final zzgps zza(int i) {
        return new zzgps(i, this.zzb, this.zza);
    }

    public final void zzb(int i) {
        this.zza.zzb(i - 1, -1L, null, null);
    }

    public final void zzc(int i, String str) {
        this.zza.zzb(i - 1, -1L, null, str);
    }

    public final void zzd(int i, Throwable th) {
        this.zza.zzb(i - 1, -1L, th, null);
    }

    public final ListenableFuture zze(int i, ListenableFuture listenableFuture) {
        zzgps zzgpsVarZza = zza(i);
        zzgpsVarZza.zza();
        zzhbi.zzr(listenableFuture, new zzgpt(this, zzgpsVarZza), zzhbz.zza());
        return listenableFuture;
    }

    public final void zzf(int i, Runnable runnable) {
        zzgps zzgpsVarZza = zza(i);
        try {
            zzgpsVarZza.zza();
            runnable.run();
            zzgpsVarZza.zzc();
        } catch (Throwable th) {
            try {
                zzgpsVarZza.zzb(th);
                throw th;
            } catch (Throwable th2) {
                zzgpsVarZza.zzc();
                throw th2;
            }
        }
    }
}
