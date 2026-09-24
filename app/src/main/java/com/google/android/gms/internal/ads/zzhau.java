package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhau extends zzhav {
    final /* synthetic */ zzhaw zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhau(zzhaw zzhawVar, Callable callable, Executor executor) {
        super(zzhawVar, executor);
        Objects.requireNonNull(zzhawVar);
        this.zza = zzhawVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    final void zzb(Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    final String zzc() {
        return this.zzc.toString();
    }
}
