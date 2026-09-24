package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgfl {
    private final zzimc zza;
    private final zzimc zzb;
    private final zzimc zzc;
    private final ExecutorService zzd;
    private final zzgpu zze;
    private final int zzf;

    zzgfl(zzimc zzimcVar, zzimc zzimcVar2, zzimc zzimcVar3, zzgco zzgcoVar, ExecutorService executorService, zzgpu zzgpuVar) {
        this.zza = zzimcVar;
        this.zzb = zzimcVar2;
        this.zzc = zzimcVar3;
        this.zzd = executorService;
        this.zze = zzgpuVar;
        this.zzf = zzgcoVar.zzH();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final ListenableFuture zzd(final int i) {
        return (zzhba) zzhbi.zzj(zzhba.zzw(zzhbi.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgfh
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(i);
            }
        }, this.zzd)), zzgfi.zza, zzhbz.zza());
    }

    final /* synthetic */ zzgpu zza() {
        return this.zze;
    }

    final ListenableFuture zzb(int i, boolean z) {
        ListenableFuture listenableFutureZzd = zzd(i);
        return (!z || i == this.zzf) ? listenableFutureZzd : (zzhba) zzhbi.zzj((zzhba) zzhbi.zzg(zzhba.zzw(listenableFutureZzd), Throwable.class, zzgfk.zza, zzhbz.zza()), new zzgfg(this), zzhbz.zza());
    }

    final /* synthetic */ int zze() {
        return this.zzf;
    }

    final /* synthetic */ zzgfe zzc(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return (zzgfe) this.zza.zzb();
        }
        if (i2 == 2) {
            return (zzgfe) this.zzb.zzb();
        }
        if (i2 == 3) {
            return (zzgfe) this.zzc.zzb();
        }
        throw new IllegalArgumentException();
    }
}
