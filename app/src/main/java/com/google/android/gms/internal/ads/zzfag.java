package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfag implements zzfby {
    private final zzhbs zza;
    private final zzeac zzb;

    zzfag(zzhbs zzhbsVar, zzeac zzeacVar) {
        this.zza = zzhbsVar;
        this.zzb = zzeacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfaf
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 62;
    }

    final /* synthetic */ zzfah zzc() {
        return new zzfah(this.zzb.zzb());
    }
}
