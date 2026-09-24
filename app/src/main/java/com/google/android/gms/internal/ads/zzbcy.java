package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzbcy implements Callable {
    protected final zzbbl zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzaxf zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzbcy(zzbbl zzbblVar, String str, String str2, zzaxf zzaxfVar, int i, int i2) {
        getClass().getSimpleName();
        this.zza = zzbblVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzaxfVar;
        this.zzf = i;
        this.zzg = i2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        int i;
        try {
            long jNanoTime = System.nanoTime();
            zzbbl zzbblVar = this.zza;
            Method methodZzo = zzbblVar.zzo(this.zzb, this.zzc);
            this.zze = methodZzo;
            if (methodZzo == null) {
                return null;
            }
            zza();
            zzbac zzbacVarZzh = zzbblVar.zzh();
            if (zzbacVarZzh == null || (i = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzbacVarZzh.zza(this.zzg, i, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected abstract void zza() throws IllegalAccessException, InvocationTargetException;
}
