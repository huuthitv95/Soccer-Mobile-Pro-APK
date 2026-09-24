package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgzy extends zzhaa {
    zzgzy(ListenableFuture listenableFuture, Class cls, zzhaq zzhaqVar) {
        super(listenableFuture, cls, zzhaqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhaa
    final /* synthetic */ void zze(Object obj) {
        zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhaa
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        zzhaq zzhaqVar = (zzhaq) obj;
        ListenableFuture listenableFutureZza = zzhaqVar.zza(th);
        zzgsw.zzl(listenableFutureZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhaqVar);
        return listenableFutureZza;
    }
}
