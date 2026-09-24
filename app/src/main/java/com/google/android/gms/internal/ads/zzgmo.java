package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgmo implements zzgmj {
    private final zzgec zza;
    private final zzgec zzb;
    private final zzgec zzc;
    private final zzgec zzd;
    private final zzimc zze;
    private final zzimc zzf;
    private final File zzg;
    private final ExecutorService zzh;
    private final zzgpu zzi;

    zzgmo(zzgec zzgecVar, zzgec zzgecVar2, zzimc zzimcVar, zzgec zzgecVar3, zzgec zzgecVar4, zzimc zzimcVar2, File file, ExecutorService executorService, zzgpu zzgpuVar) {
        this.zza = zzgecVar;
        this.zzc = zzgecVar2;
        this.zze = zzimcVar;
        this.zzb = zzgecVar3;
        this.zzd = zzgecVar4;
        this.zzf = zzimcVar2;
        this.zzg = file;
        this.zzh = executorService;
        this.zzi = zzgpuVar;
    }

    private final ListenableFuture zzj(byte[] bArr) {
        ListenableFuture listenableFutureZzc = this.zzd.zzc(bArr);
        this.zzi.zze(15305, listenableFutureZzc);
        return listenableFutureZzc;
    }

    private final ListenableFuture zzk(zzgfd zzgfdVar) {
        ListenableFuture listenableFutureZzc = this.zzb.zzc(zzgfdVar);
        this.zzi.zze(15303, listenableFutureZzc);
        return listenableFutureZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgmi
    public final ListenableFuture zza() {
        return zzhbi.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new Boolean(this.zza.zzf());
            }
        }, this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgmi
    public final ListenableFuture zzb() {
        ListenableFuture listenableFutureZzb = this.zza.zzb();
        this.zzi.zze(15302, listenableFutureZzb);
        return listenableFutureZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgmi
    public final ListenableFuture zzc(final zzgfd zzgfdVar, byte[] bArr, byte[] bArr2) {
        ListenableFuture listenableFutureZzc = ((zzgec) this.zzf.zzb()).zzc(bArr);
        this.zzi.zze(15307, listenableFutureZzc);
        return (zzhba) zzhbi.zzj(zzhba.zzw(zzhbi.zzl(listenableFutureZzc, zzj(bArr2))), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzgmm
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzi(zzgfdVar, (List) obj);
            }
        }, zzhbz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgmi
    public final ListenableFuture zzd(final zzgfd zzgfdVar, byte[] bArr) {
        return (zzhba) zzhbi.zzj(zzhba.zzw(zzj(bArr)), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzgml
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzh(zzgfdVar, (Void) obj);
            }
        }, zzhbz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final ListenableFuture zze() {
        zzhba zzhbaVar = (zzhba) zzhbi.zzk(zzhba.zzw(this.zza.zzb()), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzgmk
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzg((zzgfd) obj);
            }
        }, zzhbz.zza());
        this.zzi.zze(15314, zzhbaVar);
        return zzhbaVar;
    }

    final /* synthetic */ boolean zzf() {
        zzgec zzgecVar;
        try {
            zzgec zzgecVar2 = this.zzb;
            File fileZza = zzgecVar2.zza();
            if (!fileZza.exists()) {
                zzgecVar2.zza().delete();
                ((zzgec) this.zzf.zzb()).zza().delete();
                this.zzd.zza().delete();
                return false;
            }
            File fileZza2 = ((zzgec) this.zzf.zzb()).zza();
            File fileZza3 = ((zzgec) this.zze.zzb()).zza();
            try {
                if (fileZza2.exists()) {
                    File parentFile = fileZza3.getParentFile();
                    if (parentFile != null) {
                        zzfyb.zze(parentFile);
                    }
                    zzgzg.zzb(fileZza3);
                    zzgzg.zzc(fileZza2, fileZza3);
                }
                File fileZza4 = this.zzd.zza();
                File fileZza5 = this.zzc.zza();
                try {
                    if (fileZza4.exists()) {
                        zzgzg.zzb(fileZza5);
                        zzgzg.zzc(fileZza4, fileZza5);
                    }
                    File fileZza6 = this.zza.zza();
                    try {
                        if (fileZza.exists()) {
                            zzgzg.zzb(fileZza6);
                            zzgzg.zzc(fileZza, fileZza6);
                        }
                        this.zzb.zza().delete();
                        ((zzgec) this.zzf.zzb()).zza().delete();
                        this.zzd.zza().delete();
                        return true;
                    } catch (IOException | SecurityException e) {
                        this.zzi.zzd(15313, e);
                        zzgecVar = this.zzb;
                        zzgecVar.zza().delete();
                        ((zzgec) this.zzf.zzb()).zza().delete();
                        this.zzd.zza().delete();
                        return false;
                    }
                } catch (IOException | SecurityException e2) {
                    this.zzi.zzd(15312, e2);
                    zzgecVar = this.zzb;
                }
            } catch (IOException | SecurityException e3) {
                this.zzi.zzd(15311, e3);
                zzgecVar = this.zzb;
            }
        } catch (Throwable th) {
            this.zzb.zza().delete();
            ((zzgec) this.zzf.zzb()).zza().delete();
            this.zzd.zza().delete();
            throw th;
        }
    }

    final /* synthetic */ zzfxz zzg(zzgfd zzgfdVar) {
        if (zzgfdVar == null || zzgfdVar.equals(zzgfd.zzg())) {
            return null;
        }
        zzbdp zzbdpVarZza = zzgfdVar.zza();
        File fileZza = ((zzgec) this.zze.zzb()).zza();
        zzgec zzgecVar = this.zzc;
        return new zzfxz(zzbdpVarZza, fileZza, zzgecVar.zza(), this.zzg);
    }

    final /* synthetic */ ListenableFuture zzh(zzgfd zzgfdVar, Void r2) {
        return zzk(zzgfdVar);
    }

    final /* synthetic */ ListenableFuture zzi(zzgfd zzgfdVar, List list) {
        return zzk(zzgfdVar);
    }
}
