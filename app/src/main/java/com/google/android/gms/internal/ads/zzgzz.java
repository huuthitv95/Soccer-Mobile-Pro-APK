package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgzz extends zzhaa {
    zzgzz(ListenableFuture listenableFuture, Class cls, zzgsn zzgsnVar) {
        super(listenableFuture, cls, zzgsnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhaa
    final void zze(Object obj) {
        zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhaa
    final /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        return ((zzgsn) obj).apply(th);
    }
}
