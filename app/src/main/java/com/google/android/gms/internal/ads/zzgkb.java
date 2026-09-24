package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgkb {
    private final zzgok zza;
    private final zzglr zzb;
    private final zzgmi zzc;
    private final zzgpu zzd;
    private final zzgdu zze;
    private final boolean zzf;
    private final long zzg;
    private final long zzh;

    zzgkb(zzgok zzgokVar, zzglr zzglrVar, zzgmi zzgmiVar, zzgpu zzgpuVar, zzgdu zzgduVar, boolean z, long j, long j2) {
        this.zza = zzgokVar;
        this.zzb = zzglrVar;
        this.zzc = zzgmiVar;
        this.zzd = zzgpuVar;
        this.zze = zzgduVar;
        this.zzf = z;
        this.zzg = j;
        this.zzh = j2;
    }

    private final ListenableFuture zzh(final int i) {
        zzhba zzhbaVar = (zzhba) zzhbi.zzg((zzhba) zzhbi.zzg((zzhba) zzhbi.zzg((zzhba) zzhbi.zzk((zzhba) zzhbi.zzj((zzhba) zzhbi.zzk(zzhba.zzw(this.zzb.zza()), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzgjs
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                zzgfb zzgfbVar = (zzgfb) obj;
                this.zza.zzd(zzgfbVar);
                return zzgfbVar;
            }
        }, zzhbz.zza()), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzgjt
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zze((zzgfb) obj);
            }
        }, zzhbz.zza()), zzgju.zza, zzhbz.zza()), zzgjn.class, zzgjv.zza, zzhbz.zza()), zzgjo.class, zzgjw.zza, zzhbz.zza()), zzgjm.class, new zzgsn() { // from class: com.google.android.gms.internal.ads.zzgjx
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzf(i, (zzgjm) obj);
            }
        }, zzhbz.zza());
        this.zzd.zze(1002, zzhbaVar);
        return zzhbaVar;
    }

    final void zza(long j) {
        if (j > 0) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgjz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            }, j);
        } else {
            zzb();
        }
    }

    final ListenableFuture zzb() {
        zzhba zzhbaVar = (zzhba) zzhbi.zzg(zzhba.zzw(this.zzc.zzb()), Throwable.class, zzgjq.zza, zzhbz.zza());
        final zzgok zzgokVar = this.zza;
        Objects.requireNonNull(zzgokVar);
        return (zzhba) zzhbi.zzj((zzhba) zzhbi.zzk(zzhbaVar, new zzgsn() { // from class: com.google.android.gms.internal.ads.zzgjp
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                return new Boolean(zzgokVar.zza((zzgfd) obj));
            }
        }, zzhbz.zza()), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzgjr
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc((Boolean) obj);
            }
        }, zzhbz.zza());
    }

    final /* synthetic */ ListenableFuture zzc(Boolean bool) {
        if (bool.booleanValue()) {
            return zzh(0);
        }
        this.zzd.zzb(1003);
        return zzhbi.zza(zzgka.RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID);
    }

    final /* synthetic */ zzgfb zzd(zzgfb zzgfbVar) {
        int iZzj = zzgfbVar.zzj() - 1;
        if (iZzj == 1 || iZzj == 2) {
            return zzgfbVar;
        }
        if (iZzj == 3) {
            zzgpu zzgpuVar = this.zzd;
            int iZzj2 = zzgfbVar.zzj() - 1;
            StringBuilder sb = new StringBuilder(String.valueOf(iZzj2).length());
            sb.append(iZzj2);
            zzgpuVar.zzc(1004, sb.toString());
            throw new zzgjo(zzgfbVar.zzj() - 1);
        }
        if (iZzj != 12) {
            zzgpu zzgpuVar2 = this.zzd;
            int iZzj3 = zzgfbVar.zzj() - 1;
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj3).length());
            sb2.append(iZzj3);
            zzgpuVar2.zzc(1005, sb2.toString());
            throw new zzgjn(zzgfbVar.zzj() - 1);
        }
        zzgpu zzgpuVar3 = this.zzd;
        int iZzj4 = zzgfbVar.zzj() - 1;
        StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj4).length());
        sb3.append(iZzj4);
        zzgpuVar3.zzc(1005, sb3.toString());
        throw new zzgjm(zzgfbVar.zzj() - 1);
    }

    final /* synthetic */ ListenableFuture zze(zzgfb zzgfbVar) {
        if (zzgfbVar.zzj() == 2) {
            return this.zzc.zzd(zzgfbVar.zza(), zzgfbVar.zzb().zzA());
        }
        if (zzgfbVar.zzj() == 3) {
            return this.zzc.zzc(zzgfbVar.zza(), zzgfbVar.zzc().zzA(), zzgfbVar.zzb().zzA());
        }
        throw new AssertionError("Unreachable");
    }

    final /* synthetic */ zzgka zzf(final int i, zzgjm zzgjmVar) {
        if (this.zzf && i < this.zzg) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgjy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg(i);
                }
            }, this.zzh * ((long) Math.pow(2.0d, i)));
        }
        return zzgka.RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION;
    }

    final /* synthetic */ void zzg(int i) {
        zzh(i + 1);
    }
}
