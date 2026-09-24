package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface zzhbt extends ScheduledExecutorService, zzhbs {

    /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzhbt$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
    public final /* synthetic */ class CC {
    }

    zzhbr zzd(Runnable runnable, long j, TimeUnit timeUnit);

    zzhbr zze(Callable callable, long j, TimeUnit timeUnit);

    zzhbr zzf(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    zzhbr zzg(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
