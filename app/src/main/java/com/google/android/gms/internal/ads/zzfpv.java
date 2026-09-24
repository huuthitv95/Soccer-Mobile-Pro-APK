package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfpv implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdwn zzj;
    private final List zzk;
    private final zzcmu zzl;
    private final zzcaz zzn;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfpz zzg = zzfqc.zzb();
    private String zzh = "";
    private boolean zzm = false;

    public zzfpv(Context context, VersionInfoParcel versionInfoParcel, zzdwn zzdwnVar, zzeib zzeibVar, zzcaz zzcazVar, zzcmu zzcmuVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdwnVar;
        this.zzn = zzcazVar;
        this.zzl = zzcmuVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkc)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzs.zzj();
        } else {
            this.zzk = zzgvz.zzi();
        }
    }

    public static boolean zza() {
        boolean zBooleanValue;
        synchronized (zza) {
            if (zzb == null) {
                if (((Boolean) zzbjx.zzb.zze()).booleanValue()) {
                    zzb = Boolean.valueOf(Math.random() < ((Double) zzbjx.zza.zze()).doubleValue());
                } else {
                    zzb = false;
                }
            }
            zBooleanValue = zzb.booleanValue();
        }
        return zBooleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZzaN;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                if (this.zzg.zza() == 0) {
                    return;
                }
                try {
                    synchronized (obj) {
                        zzfpz zzfpzVar = this.zzg;
                        bArrZzaN = ((zzfqc) zzfpzVar.zzbu()).zzaN();
                        zzfpzVar.zzc();
                    }
                    zzehy zzehyVar = new zzehy((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjW), 60000, new HashMap(), bArrZzaN, CommonGatewayClient.HEADER_PROTOBUF, false);
                    new zzeia(this.zze, this.zzf.afmaVersion, this.zzn, Binder.getCallingUid(), null).zza(zzehyVar);
                } catch (Exception e) {
                    if ((e instanceof zzedr) && ((zzedr) e).zza() == 3) {
                        return;
                    }
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }

    public final void zzb(final zzfpl zzfplVar) {
        zzcff.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfpu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(zzfplVar);
            }
        });
    }

    final /* synthetic */ void zzc(zzfpl zzfplVar) {
        synchronized (zzd) {
            if (!this.zzm) {
                this.zzm = true;
                if (zza()) {
                    try {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        this.zzh = com.google.android.gms.ads.internal.util.zzs.zzr(this.zze);
                    } catch (RemoteException | RuntimeException e) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CuiMonitor.gettingAppIdFromManifest");
                    }
                    this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                    int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjX)).intValue();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzno)).booleanValue()) {
                        long j = iIntValue;
                        zzcff.zzd.scheduleWithFixedDelay(this, j, j, TimeUnit.MILLISECONDS);
                    } else {
                        long j2 = iIntValue;
                        zzcff.zzd.scheduleAtFixedRate(this, j2, j2, TimeUnit.MILLISECONDS);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkd)).booleanValue()) {
                        this.zzl.zza();
                    }
                }
            }
        }
        if (zza() && zzfplVar != null) {
            synchronized (zzc) {
                zzfpz zzfpzVar = this.zzg;
                if (zzfpzVar.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjY)).intValue()) {
                    return;
                }
                zzfpw zzfpwVarZza = zzfpy.zza();
                zzfpwVarZza.zzv(zzfplVar.zzm());
                zzfpwVarZza.zza(zzfplVar.zzb());
                zzfpwVarZza.zzb(zzfplVar.zza());
                zzfpwVarZza.zzw(3);
                zzfpwVarZza.zzd(this.zzf.afmaVersion);
                zzfpwVarZza.zze(this.zzh);
                zzfpwVarZza.zzf(Build.VERSION.RELEASE);
                zzfpwVarZza.zzg(Build.VERSION.SDK_INT);
                zzfpwVarZza.zzx(zzfplVar.zzo());
                zzfpwVarZza.zzi(zzfplVar.zzc());
                zzfpwVarZza.zzj(this.zzi);
                zzfpwVarZza.zzy(zzfplVar.zzn());
                zzfpwVarZza.zzk(zzfplVar.zzd());
                zzfpwVarZza.zzl(zzfplVar.zze());
                zzfpwVarZza.zzm(zzfplVar.zzf());
                zzfpwVarZza.zzn(this.zzj.zzd(zzfplVar.zzf()));
                zzfpwVarZza.zzo(zzfplVar.zzg());
                zzfpwVarZza.zzs(zzfplVar.zzh());
                zzfpwVarZza.zzr(zzfplVar.zzk());
                zzfpwVarZza.zzp(zzfplVar.zzi());
                zzfpwVarZza.zzq(zzfplVar.zzj());
                zzfpwVarZza.zzc(zzfplVar.zzl());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkc)).booleanValue()) {
                    zzfpwVarZza.zzh(this.zzk);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkd)).booleanValue()) {
                    zzcmu zzcmuVar = this.zzl;
                    zzihh zzihhVarZzd = zzcmuVar.zzd();
                    String strZzc = zzcmuVar.zzc();
                    if (zzihhVarZzd != null) {
                        zzfpwVarZza.zzt(zzihhVarZzd);
                    }
                    if (strZzc != null) {
                        zzfpwVarZza.zzu(strZzc);
                    }
                }
                zzfqa zzfqaVarZza = zzfqb.zza();
                zzfqaVarZza.zza(zzfpwVarZza);
                zzfpzVar.zzb(zzfqaVarZza);
            }
        }
    }
}
