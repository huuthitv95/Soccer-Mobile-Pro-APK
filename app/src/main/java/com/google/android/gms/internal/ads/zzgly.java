package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgly implements zzglr {
    private final Context zza;
    private final zzimc zzb;
    private final zzgmi zzc;
    private final zzgpu zzd;
    private final ExecutorService zze;
    private final zzgkn zzf;
    private final zzfwq zzg;

    zzgly(Context context, zzimc zzimcVar, zzgmi zzgmiVar, zzgpu zzgpuVar, ExecutorService executorService, zzgkn zzgknVar, zzfwq zzfwqVar) {
        this.zza = context;
        this.zzb = zzimcVar;
        this.zzc = zzgmiVar;
        this.zzd = zzgpuVar;
        this.zze = executorService;
        this.zzf = zzgknVar;
        this.zzg = zzfwqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgfb zzf(int i) {
        zzgfa zzgfaVarZzd = zzgfb.zzd();
        zzgfaVarZzd.zzd(i);
        return (zzgfb) zzgfaVarZzd.zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzglr
    public final ListenableFuture zza() {
        final zzimc zzimcVar = this.zzb;
        Objects.requireNonNull(zzimcVar);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzglt
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzimcVar.zzb();
            }
        };
        ExecutorService executorService = this.zze;
        zzhba zzhbaVar = (zzhba) zzhbi.zzg((zzhba) zzhbi.zzk((zzhba) zzhbi.zzj((zzhba) zzhbi.zzk(zzhba.zzw(zzhbi.zzd(callable, executorService)), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzglx
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zzb((zzbdh) obj);
                return new Integer(0);
            }
        }, zzhbz.zza()), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzglu
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc((Integer) obj);
            }
        }, zzhbz.zza()), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzglv
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzd((zzgfd) obj);
            }
        }, executorService), zzgls.class, zzglw.zza, zzhbz.zza());
        this.zzd.zze(15202, zzhbaVar);
        return zzhbaVar;
    }

    final /* synthetic */ int zzb(zzbdh zzbdhVar) {
        if (zzfxn.zza(zzbdhVar)) {
            return 0;
        }
        this.zzd.zzc(15204, zzbdhVar.name());
        throw new zzgls(null);
    }

    final /* synthetic */ ListenableFuture zzc(Integer num) {
        return this.zzc.zzb();
    }

    final /* synthetic */ zzgfb zzd(zzgfd zzgfdVar) {
        String strZza = zzgfdVar.zza().zza();
        String strZzb = zzgfdVar.zza().zzb();
        zzgps zzgpsVarZza = this.zzd.zza(15203);
        try {
            zzgpsVarZza.zza();
            zzfye zzfyeVarZza = zzfwz.zza(this.zza, 1, (zzbdh) this.zzb.zzb(), strZza, strZzb, "1", this.zzg);
            zzgpsVarZza.zzc();
            int i = 2;
            if (zzfyeVarZza.zzc == 2) {
                this.zzd.zzb(15208);
                return zzf(4);
            }
            byte[] bArr = zzfyeVarZza.zzb;
            if (bArr == null || bArr.length == 0) {
                this.zzd.zzb(IronSourceConstants.errorCode_destroy);
                return zzf(8);
            }
            try {
                zzbdj zzbdjVarZze = zzbdj.zze(bArr, zzidb.zzb());
                if (zzbdjVarZze.zza().zza().isEmpty() || zzbdjVarZze.zza().zzb().isEmpty() || zzbdjVarZze.zzc().zzA().length == 0) {
                    this.zzd.zzb(15207);
                } else {
                    if (zzgfdVar.equals(zzgfd.zzg()) || !TextUtils.equals(zzgfdVar.zza().zza(), zzbdjVarZze.zza().zza()) || !TextUtils.equals(zzgfdVar.zza().zzb(), zzbdjVarZze.zza().zzb())) {
                        int i2 = zzfyeVarZza.zzc;
                        if (i2 == 4) {
                            if (!this.zzf.zza(zzbdjVarZze.zzb().zzA())) {
                                this.zzd.zzb(15206);
                                return zzf(12);
                            }
                            i2 = 4;
                        }
                        zzgfa zzgfaVarZzd = zzgfb.zzd();
                        if (i2 == 2) {
                            i = 4;
                        } else if (i2 != 3) {
                            if (i2 != 4) {
                                i = i2 != 6 ? 1 : 5;
                            } else {
                                i = 3;
                            }
                        }
                        zzgfaVarZzd.zzd(i);
                        zzgfc zzgfcVarZze = zzgfd.zze();
                        zzgfcVarZze.zza(zzbdjVarZze.zza());
                        zzgfcVarZze.zzc((zzbdh) this.zzb.zzb());
                        zzgfaVarZzd.zza((zzgfd) zzgfcVarZze.zzbu());
                        zzgfaVarZzd.zzc(zzbdjVarZze.zzb());
                        zzgfaVarZzd.zzb(zzbdjVarZze.zzc());
                        return (zzgfb) zzgfaVarZzd.zzbu();
                    }
                    this.zzd.zzb(15209);
                }
                return zzf(11);
            } catch (zzieg e) {
                this.zzd.zzd(15205, e);
                return zzf(9);
            } catch (NullPointerException unused) {
                this.zzd.zzb(15210);
                return zzf(10);
            }
        } catch (Throwable th) {
            try {
                zzgpsVarZza.zzb(th);
                throw th;
            } catch (Throwable th2) {
                zzgpsVarZza.zzc();
                throw th2;
            }
        }
    }
}
