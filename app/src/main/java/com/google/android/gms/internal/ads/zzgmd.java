package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgmd implements zzglr {
    private final Context zza;
    private final ExecutorService zzb;
    private final zzgdn zzc;
    private final String zzd;
    private final String zze;
    private final zzgpu zzf;
    private final zzgmf zzg;
    private final int zzh;

    zzgmd(Context context, ExecutorService executorService, zzgco zzgcoVar, zzgdn zzgdnVar, zzgpu zzgpuVar, zzgmf zzgmfVar) {
        this.zza = context;
        this.zzb = executorService;
        this.zzc = zzgdnVar;
        this.zzf = zzgpuVar;
        this.zzg = zzgmfVar;
        this.zzd = zzgcoVar.zzd();
        int iZzI = zzgcoVar.zzI();
        if (iZzI == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        int i = iZzI - 2;
        this.zzh = i != 0 ? i != 1 ? 4 : 3 : 2;
        this.zze = zzgcoVar.zzk().zzc();
    }

    private static zzgfb zze(int i) {
        zzgfa zzgfaVarZzd = zzgfb.zzd();
        zzgfaVarZzd.zzd(i);
        return (zzgfb) zzgfaVarZzd.zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzglr
    public final ListenableFuture zza() {
        int i;
        zzbdc zzbdcVarZza = zzbdd.zza();
        byte[] bArrZza = zzaut.zza();
        zzicn zzicnVar = zzicn.zza;
        zzbdcVarZza.zza(zzicn.zzt(bArrZza, 0, bArrZza.length));
        zzbdcVarZza.zzb(Build.VERSION.SDK_INT);
        zzbdcVarZza.zzc(Build.MODEL);
        Context context = this.zza;
        zzbdcVarZza.zzd(context.getPackageName());
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = -1;
        }
        zzgdn zzgdnVar = this.zzc;
        zzgpu zzgpuVar = this.zzf;
        zzbdcVarZza.zze(i);
        zzbdcVarZza.zzf(this.zzd);
        zzbdcVarZza.zzg(3);
        zzbdcVarZza.zzh(this.zzh);
        zzhba zzhbaVar = (zzhba) zzhbi.zzg((zzhba) zzhbi.zzg((zzhba) zzhbi.zzk(zzhba.zzw(zzgdnVar.zza(Uri.parse(this.zze).buildUpon().appendQueryParameter("aspq", zzgdj.zza(((zzbdd) zzbdcVarZza.zzbu()).zzaN(), true)).build().toString())), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzgmc
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzb((zzgdm) obj);
            }
        }, this.zzb), UnknownHostException.class, new zzgsn() { // from class: com.google.android.gms.internal.ads.zzgma
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((UnknownHostException) obj);
            }
        }, zzhbz.zza()), SocketException.class, new zzgsn() { // from class: com.google.android.gms.internal.ads.zzgmb
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzd((SocketException) obj);
            }
        }, zzhbz.zza());
        zzgpuVar.zze(20002, zzhbaVar);
        return zzhbaVar;
    }

    final /* synthetic */ zzgfb zzb(zzgdm zzgdmVar) {
        if (zzgdmVar.zza() != 200) {
            this.zzf.zzc(20003, new String(zzaut.zza(), StandardCharsets.UTF_8));
            return zze(7);
        }
        try {
            String strZzb = zzgdmVar.zzb();
            if (TextUtils.isEmpty(strZzb)) {
                this.zzf.zzb(20004);
                return zze(8);
            }
            zzbdf zzbdfVarZzc = zzbdf.zzc(zzgdj.zzb(strZzb, true), zzidb.zzb());
            if (zzbdfVarZzc.zza().zzc() && zzbdfVarZzc.zza().zza()) {
                if (!this.zzg.zza(zzbdfVarZzc)) {
                    this.zzf.zzb(20006);
                    return zze(12);
                }
                zzgfa zzgfaVarZzd = zzgfb.zzd();
                zzgfc zzgfcVarZze = zzgfd.zze();
                zzgfcVarZze.zzb(zzbdfVarZzc.zza().zzb());
                zzgfcVarZze.zzd(zzbdfVarZzc.zzb());
                zzgfaVarZzd.zza((zzgfd) zzgfcVarZze.zzbu());
                zzgfaVarZzd.zzb(zzbdfVarZzc.zza().zzd());
                zzgfaVarZzd.zzd(2);
                return (zzgfb) zzgfaVarZzd.zzbu();
            }
            this.zzf.zzb(20004);
            return zze(8);
        } catch (Throwable th) {
            this.zzf.zzd(20005, th);
            return zze(6);
        }
    }

    final /* synthetic */ zzgfb zzc(UnknownHostException unknownHostException) {
        this.zzf.zzb(20007);
        return zze(13);
    }

    final /* synthetic */ zzgfb zzd(SocketException socketException) {
        this.zzf.zzb(20008);
        return zze(13);
    }
}
