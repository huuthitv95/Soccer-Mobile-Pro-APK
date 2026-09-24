package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzedz {
    private final zzhbs zza;
    private final zzhbs zzb;
    private final zzefj zzc;
    private final zzimc zzd;

    public zzedz(zzhbs zzhbsVar, zzhbs zzhbsVar2, zzefj zzefjVar, zzimc zzimcVar) {
        this.zza = zzhbsVar;
        this.zzb = zzhbsVar2;
        this.zzc = zzefjVar;
        this.zzd = zzimcVar;
    }

    public final ListenableFuture zza(final zzcar zzcarVar) {
        ListenableFuture listenableFutureZzh;
        String str = zzcarVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzF(str)) {
            listenableFutureZzh = zzhbi.zzc(new zzegf(1));
        } else {
            listenableFutureZzh = zzhbi.zzh(this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzedy
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzb(zzcarVar);
                }
            }), ExecutionException.class, zzedv.zza, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzhbi.zzh(listenableFutureZzh, zzegf.class, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzedw
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzcarVar, callingUid, (zzegf) obj);
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzegg zzb(zzcar zzcarVar) {
        return (zzegg) this.zzc.zza(zzcarVar).get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgD)).intValue(), TimeUnit.SECONDS);
    }

    final /* synthetic */ ListenableFuture zzc(final zzcar zzcarVar, int i, zzegf zzegfVar) {
        Bundle bundle;
        if (zzcarVar != null && (bundle = zzcarVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzhbi.zzj(((zzehw) this.zzd.zzb()).zzb(zzcarVar, i), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzedx
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzhbi.zza(new zzegg((InputStream) obj, zzcarVar));
            }
        }, this.zzb);
    }
}
