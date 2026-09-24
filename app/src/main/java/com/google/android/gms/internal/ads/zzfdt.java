package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfdt implements zzfby {
    public zzfdt(zzceg zzcegVar, zzhbs zzhbsVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        final ListenableFuture listenableFutureZza = zzhbi.zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgO)).booleanValue()) {
            listenableFutureZza = zzhbi.zza(null);
        }
        final ListenableFuture listenableFutureZza2 = zzhbi.zza(null);
        return zzhbi.zzo(listenableFutureZza, listenableFutureZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfds
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfdu((String) listenableFutureZza.get(), (String) listenableFutureZza2.get());
            }
        }, zzcff.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 47;
    }
}
