package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbgt extends zzcfk {
    final /* synthetic */ zzbgz zza;

    zzbgt(zzbgz zzbgzVar) {
        Objects.requireNonNull(zzbgzVar);
        this.zza = zzbgzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.zza.zzb();
        return super.cancel(z);
    }
}
