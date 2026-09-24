package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfbq implements zzfby {
    private final boolean zza;

    zzfbq(zzfho zzfhoVar) {
        this.zza = zzfhoVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return zzhbi.zza(new zzfbp(this.zza, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 36;
    }
}
