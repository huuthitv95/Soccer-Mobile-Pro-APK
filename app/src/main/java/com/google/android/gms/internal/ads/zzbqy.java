package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbqy implements zzhaq {
    final /* synthetic */ zzbqq zza;

    zzbqy(zzbrc zzbrcVar, zzbqq zzbqqVar) {
        this.zza = zzbqqVar;
        Objects.requireNonNull(zzbrcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzcfk zzcfkVar = new zzcfk();
        ((zzbqw) obj).zze(this.zza, new zzbqx(this, zzcfkVar));
        return zzcfkVar;
    }
}
