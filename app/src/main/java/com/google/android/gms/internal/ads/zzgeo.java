package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgeo {
    private final zzimc zza;
    private final zzimc zzb;
    private final ExecutorService zzc;
    private final zzimc zzd;
    private ListenableFuture zze = null;

    zzgeo(zzimc zzimcVar, zzimc zzimcVar2, ExecutorService executorService, zzimc zzimcVar3) {
        this.zza = zzimcVar;
        this.zzb = zzimcVar2;
        this.zzc = executorService;
        this.zzd = zzimcVar3;
    }

    public final synchronized ListenableFuture zza() {
        ListenableFuture listenableFuture = this.zze;
        if (listenableFuture != null) {
            return listenableFuture;
        }
        Set set = (Set) this.zzb.zzb();
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzgem) it.next()).zza());
        }
        zzgpu zzgpuVar = (zzgpu) this.zzd.zzb();
        ListenableFuture listenableFutureZzk = zzhbi.zzk(zzhbi.zzm(arrayList), zzgen.zza, this.zzc);
        zzgpuVar.zze(2, listenableFutureZzk);
        this.zze = listenableFutureZzk;
        Iterator it2 = ((Set) this.zza.zzb()).iterator();
        while (it2.hasNext()) {
            ((zzgem) it2.next()).zza();
        }
        ListenableFuture listenableFuture2 = this.zze;
        if (listenableFuture2 == null) {
            throw null;
        }
        return listenableFuture2;
    }

    public final synchronized ListenableFuture zzb() {
        ListenableFuture listenableFuture;
        listenableFuture = this.zze;
        if (listenableFuture == null) {
            throw null;
        }
        return listenableFuture;
    }
}
