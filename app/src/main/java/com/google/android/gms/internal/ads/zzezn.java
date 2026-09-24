package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzezn implements zzfby {
    private final zzhbs zza;
    private final zzecf zzb;

    zzezn(zzhbs zzhbsVar, zzecf zzecfVar) {
        this.zza = zzhbsVar;
        this.zzb = zzecfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzezm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 23;
    }

    final /* synthetic */ zzezo zzc() {
        zzecf zzecfVar = this.zzb;
        return new zzezo(zzecfVar.zzg(), zzecfVar.zzd(), com.google.android.gms.ads.internal.zzt.zzo().zzk(), zzecfVar.zzq(), zzecfVar.zzm());
    }
}
