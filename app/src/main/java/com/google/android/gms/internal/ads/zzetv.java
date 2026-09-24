package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzetv implements zzfby {
    private final Clock zza;
    private final zzfkm zzb;
    private final long zzc;

    zzetv(Clock clock, zzfkm zzfkmVar, long j) {
        this.zza = clock;
        this.zzb = zzfkmVar;
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return zzhbi.zza(new zzetw(this.zzb, this.zza.currentTimeMillis(), this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 4;
    }
}
