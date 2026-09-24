package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaca implements zzacb {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzds zzb;

    zzaca(Executor executor, zzds zzdsVar) {
        this.zza = executor;
        this.zzb = zzdsVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzacb
    public final void zza() {
        this.zzb.zza(this.zza);
    }
}
