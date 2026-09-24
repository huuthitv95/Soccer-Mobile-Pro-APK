package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgfg implements zzhaq {
    final /* synthetic */ zzgfl zza;

    zzgfg(zzgfl zzgflVar) {
        Objects.requireNonNull(zzgflVar);
        this.zza = zzgflVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzgfe zzgfeVar = (zzgfe) obj;
        if (zzgfeVar != null) {
            return zzhbi.zza(zzgfeVar);
        }
        zzgfl zzgflVar = this.zza;
        zzgflVar.zza().zzb(51);
        return zzgflVar.zzd(zzgflVar.zze());
    }
}
