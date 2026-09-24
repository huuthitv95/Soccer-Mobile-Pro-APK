package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcfi {
    public static void zza(ListenableFuture listenableFuture, String str, Executor executor) {
        zzhbi.zzr(listenableFuture, new zzcfg(str), executor);
    }

    public static void zzb(ListenableFuture listenableFuture, String str) {
        zzhbi.zzr(listenableFuture, new zzcfh(str), zzcff.zzh);
    }
}
