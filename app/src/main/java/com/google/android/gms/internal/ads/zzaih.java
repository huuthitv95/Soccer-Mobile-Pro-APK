package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzaih {
    protected final zzahb zza;

    protected zzaih(zzahb zzahbVar) {
        this.zza = zzahbVar;
    }

    protected abstract boolean zza(zzes zzesVar) throws zzat;

    protected abstract boolean zzb(zzes zzesVar, long j) throws zzat;

    public final boolean zzf(zzes zzesVar, long j) throws zzat {
        return zza(zzesVar) && zzb(zzesVar, j);
    }
}
