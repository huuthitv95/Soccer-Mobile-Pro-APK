package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhaf extends zzhah {
    zzhaf(ListenableFuture listenableFuture, zzhaq zzhaqVar) {
        super(listenableFuture, zzhaqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    final /* synthetic */ void zze(Object obj) {
        zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzhaq zzhaqVar = (zzhaq) obj;
        ListenableFuture listenableFutureZza = zzhaqVar.zza(obj2);
        zzgsw.zzl(listenableFutureZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhaqVar);
        return listenableFutureZza;
    }
}
