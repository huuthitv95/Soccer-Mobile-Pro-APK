package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzevb implements zzfby {
    private final zzhbs zza;
    private final zzfkm zzb;
    private final zzcew zzc;

    public zzevb(zzhbs zzhbsVar, zzfkm zzfkmVar, zzcew zzcewVar) {
        this.zza = zzhbsVar;
        this.zzb = zzfkmVar;
        this.zzc = zzcewVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzeva
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 9;
    }

    final /* synthetic */ zzevc zzc() {
        return new zzevc(this.zzb.zzk, this.zzc.zzl());
    }
}
