package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcaw implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcay zzb;

    zzcaw(zzcay zzcayVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzcayVar);
        this.zzb = zzcayVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0038  */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzcav zzcavVarZza;
        zzcay zzcayVar = this.zzb;
        WeakHashMap weakHashMapZzb = zzcayVar.zzb();
        Context context = this.zza;
        zzcax zzcaxVar = (zzcax) weakHashMapZzb.get(context);
        if (zzcaxVar != null) {
            if (zzcaxVar.zza + ((Long) zzbjt.zzd.zze()).longValue() < com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()) {
                zzcavVarZza = new zzcau(context).zza();
            } else {
                zzcavVarZza = new zzcau(context, zzcaxVar.zzb).zza();
            }
        } else {
            zzcavVarZza = new zzcau(context).zza();
        }
        zzcayVar.zzb().put(context, new zzcax(zzcayVar, zzcavVarZza));
        return zzcavVarZza;
    }
}
