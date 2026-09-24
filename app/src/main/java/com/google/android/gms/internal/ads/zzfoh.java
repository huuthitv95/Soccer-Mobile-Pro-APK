package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfoh {
    final /* synthetic */ zzfoq zza;
    private final Object zzb;
    private final List zzc;

    /* synthetic */ zzfoh(zzfoq zzfoqVar, Object obj, List list, byte[] bArr) {
        Objects.requireNonNull(zzfoqVar);
        this.zza = zzfoqVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfop zza(Callable callable) {
        List list = this.zzc;
        zzhbh zzhbhVarZzp = zzhbi.zzp(list);
        ListenableFuture listenableFutureZza = zzhbhVarZzp.zza(zzfog.zza, zzcff.zzh);
        zzfoq zzfoqVar = this.zza;
        return new zzfop(zzfoqVar, this.zzb, null, listenableFutureZza, list, zzhbhVarZzp.zza(callable, zzfoqVar.zze()), null);
    }
}
