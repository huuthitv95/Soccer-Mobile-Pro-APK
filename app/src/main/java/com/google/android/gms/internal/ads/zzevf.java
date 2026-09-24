package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzevf implements zzfby {
    private final Executor zza;
    private final zzcer zzb;

    zzevf(Executor executor, zzcer zzcerVar) {
        this.zza = executor;
        this.zzb = zzcerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdO)).booleanValue()) {
            return zzhbi.zza(new zzevg(null));
        }
        zzcer zzcerVar = this.zzb;
        return zzhbi.zzk(zzcerVar.zzq(), zzeve.zza, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 10;
    }
}
