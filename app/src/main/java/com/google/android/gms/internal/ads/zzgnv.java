package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgnv implements zzgnr {
    private final zzgec zza;
    private final zzgec zzb;
    private final zzimc zzc;
    private final zzgoj zzd;
    private final zzgpu zze;
    private final ExecutorService zzf;

    zzgnv(zzgec zzgecVar, zzgec zzgecVar2, zzimc zzimcVar, zzgoj zzgojVar, ExecutorService executorService, zzgpu zzgpuVar) {
        this.zza = zzgecVar;
        this.zzb = zzgecVar2;
        this.zzc = zzimcVar;
        this.zzd = zzgojVar;
        this.zze = zzgpuVar;
        this.zzf = executorService;
    }

    private final ListenableFuture zzj(zzgfd zzgfdVar) {
        ListenableFuture listenableFutureZzc = this.zza.zzc(zzgfdVar);
        this.zze.zze(20303, listenableFutureZzc);
        return listenableFutureZzc;
    }

    private final ListenableFuture zzk(byte[] bArr) {
        ListenableFuture listenableFutureZzc = this.zzb.zzc(bArr);
        this.zze.zze(20305, listenableFutureZzc);
        return listenableFutureZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgmi
    public final ListenableFuture zza() {
        return zzhbi.zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzgmi
    public final ListenableFuture zzb() {
        ListenableFuture listenableFutureZzb = this.zza.zzb();
        this.zze.zze(20302, listenableFutureZzb);
        return listenableFutureZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgmi
    public final ListenableFuture zzc(final zzgfd zzgfdVar, byte[] bArr, byte[] bArr2) {
        ListenableFuture listenableFutureZzc = ((zzgec) this.zzc.zzb()).zzc(bArr);
        this.zze.zze(20307, listenableFutureZzc);
        return (zzhba) zzhbi.zzj(zzhba.zzw(zzhbi.zzl(listenableFutureZzc, zzk(bArr2))), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzgnt
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzi(zzgfdVar, (List) obj);
            }
        }, zzhbz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgmi
    public final ListenableFuture zzd(final zzgfd zzgfdVar, byte[] bArr) {
        return (zzhba) zzhbi.zzj(zzhba.zzw(zzk(bArr)), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzgns
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzh(zzgfdVar, (Void) obj);
            }
        }, zzhbz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgnr
    public final ListenableFuture zze() {
        ListenableFuture listenableFutureZzb = this.zzb.zzb();
        this.zze.zze(20304, listenableFutureZzb);
        return listenableFutureZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgnr
    public final ListenableFuture zzf() {
        ListenableFuture listenableFutureZzd = zzhbi.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgnu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzg();
            }
        }, this.zzf);
        this.zze.zze(20312, listenableFutureZzd);
        return listenableFutureZzd;
    }

    final /* synthetic */ byte[] zzg() {
        return zzgdj.zzb(this.zzd.zza(), false);
    }

    final /* synthetic */ ListenableFuture zzh(zzgfd zzgfdVar, Void r2) {
        return zzj(zzgfdVar);
    }

    final /* synthetic */ ListenableFuture zzi(zzgfd zzgfdVar, List list) {
        return zzj(zzgfdVar);
    }
}
