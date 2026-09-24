package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfas implements zzfby {
    private final Context zza;
    private final zzhbs zzb;
    private final zzfkm zzc;
    private final VersionInfoParcel zzd;

    zzfas(Context context, zzhbs zzhbsVar, zzfkm zzfkmVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzhbsVar;
        this.zzc = zzfkmVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return this.zzb.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfar
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 53;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0043 A[Catch: IOException -> 0x0124, TryCatch #0 {IOException -> 0x0124, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:9:0x002f, B:14:0x0055, B:15:0x0079, B:17:0x008b, B:19:0x00a1, B:21:0x00aa, B:26:0x00d0, B:28:0x00ee, B:29:0x0112, B:31:0x011d, B:24:0x00be, B:12:0x0043), top: B:36:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0055 A[Catch: IOException -> 0x0124, TryCatch #0 {IOException -> 0x0124, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:9:0x002f, B:14:0x0055, B:15:0x0079, B:17:0x008b, B:19:0x00a1, B:21:0x00aa, B:26:0x00d0, B:28:0x00ee, B:29:0x0112, B:31:0x011d, B:24:0x00be, B:12:0x0043), top: B:36:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x00be A[Catch: IOException -> 0x0124, TryCatch #0 {IOException -> 0x0124, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:9:0x002f, B:14:0x0055, B:15:0x0079, B:17:0x008b, B:19:0x00a1, B:21:0x00aa, B:26:0x00d0, B:28:0x00ee, B:29:0x0112, B:31:0x011d, B:24:0x00be, B:12:0x0043), top: B:36:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00d0 A[Catch: IOException -> 0x0124, TryCatch #0 {IOException -> 0x0124, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:9:0x002f, B:14:0x0055, B:15:0x0079, B:17:0x008b, B:19:0x00a1, B:21:0x00aa, B:26:0x00d0, B:28:0x00ee, B:29:0x0112, B:31:0x011d, B:24:0x00be, B:12:0x0043), top: B:36:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ee A[Catch: IOException -> 0x0124, TryCatch #0 {IOException -> 0x0124, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:9:0x002f, B:14:0x0055, B:15:0x0079, B:17:0x008b, B:19:0x00a1, B:21:0x00aa, B:26:0x00d0, B:28:0x00ee, B:29:0x0112, B:31:0x011d, B:24:0x00be, B:12:0x0043), top: B:36:0x0000 }] */
    final /* synthetic */ zzfat zzc() {
        zzgbq zzgbqVar;
        boolean z;
        boolean zZze;
        zzgbv zzgbvVarZzh;
        zzgbr zzgbrVarZza;
        try {
            Context context = this.zza;
            boolean zZza = this.zzc.zza();
            zzgbq zzgbqVar2 = new zzgbq();
            zzgbq zzgbqVar3 = new zzgbq();
            boolean zZzc = true;
            if (zZza) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzea)).booleanValue()) {
                    return new zzfat(true);
                }
            }
            if (!zZza) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdW)).booleanValue()) {
                    zzgbqVar2 = zzgbu.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeh)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                } else if (zZza) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdY)).booleanValue()) {
                        zzgbqVar2 = zzgbu.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeh)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                    }
                }
            } else if (zZza) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdY)).booleanValue()) {
                    zzgbqVar2 = zzgbu.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeh)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzee)).booleanValue()) {
                if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzed)).intValue()) {
                    zzgbv.zzh(context).zzj();
                }
            }
            if (zZza) {
                if (zZza) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdZ)).booleanValue()) {
                        zzgbvVarZzh = zzgbv.zzh(context);
                        zzgbrVarZza = zzgbr.zza(context);
                        if (this.zzd.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzed)).intValue()) {
                            zzgbqVar3 = zzgbvVarZzh.zzi(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzei)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                            zZzc = zzgbrVarZza.zzc();
                        }
                        zZze = zzgbrVarZza.zze();
                        zzgbqVar = zzgbqVar3;
                        z = zZzc;
                    }
                }
                zzgbqVar = zzgbqVar3;
                z = true;
                zZze = true;
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdX)).booleanValue()) {
                    zzgbvVarZzh = zzgbv.zzh(context);
                    zzgbrVarZza = zzgbr.zza(context);
                    if (this.zzd.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzed)).intValue()) {
                        zzgbqVar3 = zzgbvVarZzh.zzi(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzei)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                        zZzc = zzgbrVarZza.zzc();
                    }
                    zZze = zzgbrVarZza.zze();
                    zzgbqVar = zzgbqVar3;
                    z = zZzc;
                } else {
                    if (zZza) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdZ)).booleanValue()) {
                            zzgbvVarZzh = zzgbv.zzh(context);
                            zzgbrVarZza = zzgbr.zza(context);
                            if (this.zzd.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzed)).intValue()) {
                                zzgbqVar3 = zzgbvVarZzh.zzi(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzei)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                                zZzc = zzgbrVarZza.zzc();
                            }
                            zZze = zzgbrVarZza.zze();
                            zzgbqVar = zzgbqVar3;
                            z = zZzc;
                        }
                    }
                    zzgbqVar = zzgbqVar3;
                    z = true;
                    zZze = true;
                }
            }
            return new zzfat(zzgbqVar2, zzgbqVar, z, zZze, zZza);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PerAppIdSignal");
            return new zzfat(this.zzc.zza());
        }
    }
}
