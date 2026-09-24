package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzehb {
    private final Context zza;
    private final zzhbs zzb;
    private final zzhbs zzc;
    private final zzimc zzd;
    private final VersionInfoParcel zze;
    private final zzegx zzf;
    private final zzdyz zzg;

    zzehb(Context context, zzhbs zzhbsVar, zzhbs zzhbsVar2, zzimc zzimcVar, VersionInfoParcel versionInfoParcel, zzegx zzegxVar, zzdyz zzdyzVar) {
        this.zza = context;
        this.zzb = zzhbsVar;
        this.zzc = zzhbsVar2;
        this.zzd = zzimcVar;
        this.zze = versionInfoParcel;
        this.zzf = zzegxVar;
        this.zzg = zzdyzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzc() {
        try {
            ((zzehw) this.zzd.zzb()).zzi(this.zze.afmaVersion);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpA)).booleanValue()) {
                zzdyy zzdyyVarZza = this.zzg.zza();
                zzdyyVarZza.zzc("action", "ptard");
                zzdyyVarZza.zzc("ptard", CmcdData.Factory.STREAM_TYPE_LIVE);
                zzdyyVarZza.zzd();
            }
        } catch (RemoteException | NullPointerException e) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpB)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "Preconnect Local");
            }
        }
    }

    public final void zza() {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzF(this.zza.getPackageName())) {
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            });
            return;
        }
        zzegy zzegyVar = new zzegy(this);
        zzehd zzehdVarZzb = this.zzf.zzb();
        zzehdVarZzb.zzb(zzegyVar);
        final zzefl zzeflVarZza = zzehdVarZzb.zza().zza();
        zzhbs zzhbsVar = this.zzb;
        Objects.requireNonNull(zzeflVarZza);
        zzhbsVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeha
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeflVarZza.zza();
            }
        });
    }

    final /* synthetic */ zzdyz zzd() {
        return this.zzg;
    }
}
