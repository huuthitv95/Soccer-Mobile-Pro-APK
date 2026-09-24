package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzhav extends zzhbp {
    private final Executor zza;
    final /* synthetic */ zzhaw zzb;

    zzhav(zzhaw zzhawVar, Executor executor) {
        Objects.requireNonNull(zzhawVar);
        this.zzb = zzhawVar;
        executor.getClass();
        this.zza = executor;
    }

    abstract void zzb(Object obj);

    @Override // com.google.android.gms.internal.ads.zzhbp
    final boolean zzd() {
        return this.zzb.isDone();
    }

    final void zze() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e) {
            this.zzb.zzb(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    final void zzf(Object obj) {
        this.zzb.zzD(null);
        zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    final void zzg(Throwable th) {
        zzhaw zzhawVar = this.zzb;
        zzhawVar.zzD(null);
        if (th instanceof ExecutionException) {
            zzhawVar.zzb(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            zzhawVar.cancel(false);
        } else {
            zzhawVar.zzb(th);
        }
    }
}
