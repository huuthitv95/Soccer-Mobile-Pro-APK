package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzegu {
    private final zzcmx zza;
    private final Context zzb;
    private final Executor zzc;

    zzegu(zzcmx zzcmxVar, Context context, Executor executor) {
        this.zza = zzcmxVar;
        this.zzb = context;
        this.zzc = executor;
    }

    public final void zza() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb();
            }
        });
    }

    final /* synthetic */ void zzb() {
        zzegw zzegwVarZzh = this.zza.zzh();
        zzegwVarZzh.zzb(this.zzb);
        zzegwVarZzh.zza().zza().zza();
    }
}
