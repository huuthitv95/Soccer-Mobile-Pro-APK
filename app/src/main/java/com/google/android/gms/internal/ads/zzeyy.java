package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeyy implements zzfby {
    private final Context zza;
    private final zzhbs zzb;

    zzeyy(zzhbs zzhbsVar, Context context) {
        this.zzb = zzhbsVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return this.zzb.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzeyx
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 57;
    }

    final /* synthetic */ zzeyz zzc() {
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzeyz(com.google.android.gms.ads.internal.util.zzs.zzu(this.zza));
    }
}
