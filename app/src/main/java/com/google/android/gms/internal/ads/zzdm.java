package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdm {
    private final zzdy zza;
    private final zzdy zzb;
    private final zzdl zzc;
    private Object zzd;
    private Object zze;
    private int zzf;

    public zzdm(Object obj, Looper looper, Looper looper2, zzdo zzdoVar, zzdl zzdlVar) {
        this.zza = zzdoVar.zzd(looper, null);
        this.zzb = zzdoVar.zzd(looper2, null);
        this.zzd = obj;
        this.zze = obj;
        this.zzc = zzdlVar;
    }

    private final void zzg(Runnable runnable) {
        zzdy zzdyVar = this.zzb;
        if (zzdyVar.zza().getThread().isAlive()) {
            zzdyVar.zzm(runnable);
        }
    }

    private final void zzh(Object obj) {
        Object obj2 = this.zzd;
        this.zzd = obj;
        if (obj2.equals(obj)) {
            return;
        }
        this.zzc.zza(obj2, obj);
    }

    public final void zza(zzgsn zzgsnVar, final zzgsn zzgsnVar2) {
        zzgsw.zzi(Looper.myLooper() == this.zzb.zza());
        this.zzf++;
        zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(zzgsnVar2);
            }
        });
        zzh(zzgsnVar.apply(this.zzd));
    }

    public final void zzb(final Object obj) {
        this.zze = obj;
        zzg(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze(obj);
            }
        });
    }

    public final void zzc(Runnable runnable) {
        zzdy zzdyVar = this.zza;
        if (zzdyVar.zza().getThread().isAlive()) {
            zzdyVar.zzm(runnable);
        }
    }

    final /* synthetic */ void zzd(zzgsn zzgsnVar) {
        final Object objApply = zzgsnVar.apply(this.zze);
        this.zze = objApply;
        zzg(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf(objApply);
            }
        });
    }

    final /* synthetic */ void zze(Object obj) {
        if (this.zzf == 0) {
            zzh(obj);
        }
    }

    final /* synthetic */ void zzf(Object obj) {
        int i = this.zzf - 1;
        this.zzf = i;
        if (i == 0) {
            zzh(obj);
        }
    }
}
