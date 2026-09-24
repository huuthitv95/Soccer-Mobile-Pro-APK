package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzfoq {
    private static final ListenableFuture zza = zzhbi.zza(null);
    private final zzhbs zzb;
    private final ScheduledExecutorService zzc;
    private final zzfor zzd;

    public zzfoq(zzhbs zzhbsVar, ScheduledExecutorService scheduledExecutorService, zzfor zzforVar) {
        this.zzb = zzhbsVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzforVar;
    }

    public final zzfop zza(Object obj, ListenableFuture listenableFuture) {
        return new zzfop(this, obj, null, listenableFuture, Collections.singletonList(listenableFuture), listenableFuture, null);
    }

    public final zzfoh zzb(Object obj, ListenableFuture... listenableFutureArr) {
        return new zzfoh(this, obj, Arrays.asList(listenableFutureArr), null);
    }

    protected abstract String zzc(Object obj);

    final /* synthetic */ zzhbs zze() {
        return this.zzb;
    }

    final /* synthetic */ ScheduledExecutorService zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzfor zzg() {
        return this.zzd;
    }
}
