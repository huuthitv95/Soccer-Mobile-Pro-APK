package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfoj {
    public static final zzfop zza(ListenableFuture listenableFuture, Object obj, zzfoq zzfoqVar) {
        return new zzfop(zzfoqVar, obj, null, zzfoq.zza, Collections.EMPTY_LIST, listenableFuture, null);
    }

    public static final zzfop zzb(Callable callable, Object obj, zzfoq zzfoqVar) {
        return zzc(callable, zzfoqVar.zze(), obj, zzfoqVar);
    }

    public static final zzfop zzc(Callable callable, zzhbs zzhbsVar, Object obj, zzfoq zzfoqVar) {
        return new zzfop(zzfoqVar, obj, null, zzfoq.zza, Collections.EMPTY_LIST, zzhbsVar.zzc(callable), null);
    }

    public static final zzfop zzd(final zzfoe zzfoeVar, zzhbs zzhbsVar, Object obj, zzfoq zzfoqVar) {
        return zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfoi
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() throws Exception {
                zzfoeVar.zza();
                return null;
            }
        }, zzhbsVar, obj, zzfoqVar);
    }
}
