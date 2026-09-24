package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface zzhbs extends ExecutorService {

    /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzhbs$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
    public final /* synthetic */ class CC {
    }

    ListenableFuture zza(Runnable runnable);

    ListenableFuture zzb(Runnable runnable, Object obj);

    ListenableFuture zzc(Callable callable);
}
