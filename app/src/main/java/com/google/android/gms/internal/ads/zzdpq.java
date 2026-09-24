package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdpq {
    zzbmq zza;
    zzbmn zzb;
    zzbnd zzc;
    zzbna zzd;
    zzbry zze;
    final SimpleArrayMap zzf = new SimpleArrayMap();
    final SimpleArrayMap zzg = new SimpleArrayMap();

    public final zzdpq zza(zzbmq zzbmqVar) {
        this.zza = zzbmqVar;
        return this;
    }

    public final zzdpq zzb(zzbmn zzbmnVar) {
        this.zzb = zzbmnVar;
        return this;
    }

    public final zzdpq zzc(zzbnd zzbndVar) {
        this.zzc = zzbndVar;
        return this;
    }

    public final zzdpq zzd(zzbna zzbnaVar) {
        this.zzd = zzbnaVar;
        return this;
    }

    public final zzdpq zze(zzbry zzbryVar) {
        this.zze = zzbryVar;
        return this;
    }

    public final zzdpq zzf(String str, zzbmw zzbmwVar, zzbmt zzbmtVar) {
        this.zzf.put(str, zzbmwVar);
        if (zzbmtVar != null) {
            this.zzg.put(str, zzbmtVar);
        }
        return this;
    }

    public final zzdpr zzg() {
        return new zzdpr(this, null);
    }
}
