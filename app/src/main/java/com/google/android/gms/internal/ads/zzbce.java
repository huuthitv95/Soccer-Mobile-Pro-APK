package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbce implements Callable {
    private final zzbbl zza;
    private final zzaxf zzb;

    public zzbce(zzbbl zzbblVar, zzaxf zzaxfVar) {
        this.zza = zzbblVar;
        this.zzb = zzaxfVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbbl zzbblVar = this.zza;
        if (zzbblVar.zzm() != null) {
            zzbblVar.zzm().get();
        }
        zzayf zzayfVarZzl = zzbblVar.zzl();
        if (zzayfVarZzl == null) {
            return null;
        }
        try {
            zzaxf zzaxfVar = this.zzb;
            synchronized (zzaxfVar) {
                try {
                    zzaxfVar.zzaY(zzayfVarZzl.zzaN(), zzidb.zza());
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        } catch (zzieg | NullPointerException unused) {
            return null;
        }
    }
}
