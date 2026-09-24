package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzghp implements zzgij {
    private final Map zza;
    private final zzaxf zzb;
    private final zzgps zzc;
    private final long zzd;

    zzghp(zzaxf zzaxfVar, Map map, zzgco zzgcoVar, zzgpu zzgpuVar) {
        this.zza = map;
        this.zzb = zzaxfVar;
        this.zzc = zzgpuVar.zza(112);
        this.zzd = zzgcoVar.zzl();
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zza();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Void zza() throws Exception {
        zzayf zzayfVar;
        try {
            try {
                this.zzc.zza();
                ListenableFuture listenableFuture = (ListenableFuture) this.zza.get("gs");
                if (listenableFuture != null && (zzayfVar = (zzayf) listenableFuture.get(this.zzd, TimeUnit.MILLISECONDS)) != null) {
                    zzaxf zzaxfVar = this.zzb;
                    synchronized (zzaxfVar) {
                        zzaxfVar.zzad(zzayfVar.zzh());
                        zzaxfVar.zzN(zzayfVar.zzd());
                    }
                }
            } catch (Throwable th) {
                this.zzc.zzc();
                throw th;
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e) {
            this.zzc.zzb(e);
        }
        this.zzc.zzc();
        return null;
    }
}
