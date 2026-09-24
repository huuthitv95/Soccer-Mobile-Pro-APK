package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhbg implements Runnable {
    final Future zza;
    final zzhbf zzb;

    zzhbg(Future future, zzhbf zzhbfVar) {
        this.zza = future;
        this.zzb = zzhbfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thZza;
        Future future = this.zza;
        if ((future instanceof zzhck) && (thZza = zzhcl.zza((zzhck) future)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            this.zzb.zzb(zzhbi.zzs(future));
        } catch (ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final String toString() {
        zzgss zzgssVarZzb = zzgst.zzb(this);
        zzgssVarZzb.zza(this.zzb);
        return zzgssVarZzb.toString();
    }
}
