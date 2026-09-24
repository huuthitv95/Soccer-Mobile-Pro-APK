package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzftm {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ScheduledExecutorService zzc;
    private final zzfoc zzd;
    private final ClientApi zze = new ClientApi();
    private final zzfli zzf;
    private final Clock zzg;
    private final zzfrz zzh;

    zzftm(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, zzfoc zzfocVar, zzfli zzfliVar, Clock clock, zzfrz zzfrzVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfocVar;
        this.zzg = clock;
        this.zzf = zzfliVar;
        this.zzh = zzfrzVar;
    }

    private final zzfsi zzc() {
        return new zzfsi(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzF)).longValue(), 2.0d, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzG)).longValue(), 0.2d, this.zzg);
    }

    public final zzftl zza(com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            ClientApi clientApi = this.zze;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzb;
            return new zzfsm(clientApi, context, versionInfoParcel.clientJarVersion, this.zzf, zzfpVar, zzcbVar, this.zzc, this.zzd, zzc(), this.zzg);
        }
        if (iOrdinal == 2) {
            ClientApi clientApi2 = this.zze;
            Context context2 = this.zza;
            VersionInfoParcel versionInfoParcel2 = this.zzb;
            return new zzftq(clientApi2, context2, versionInfoParcel2.clientJarVersion, this.zzf, zzfpVar, zzcbVar, this.zzc, this.zzd, zzc(), this.zzg);
        }
        if (iOrdinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.zze;
        Context context3 = this.zza;
        VersionInfoParcel versionInfoParcel3 = this.zzb;
        return new zzfsh(clientApi3, context3, versionInfoParcel3.clientJarVersion, this.zzf, zzfpVar, zzcbVar, this.zzc, this.zzd, zzc(), this.zzg);
    }

    public final zzftl zzb(String str, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            ClientApi clientApi = this.zze;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzb;
            return new zzfsm(str, clientApi, context, versionInfoParcel.clientJarVersion, this.zzf, zzfpVar, zzceVar, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
        }
        if (iOrdinal == 2) {
            ClientApi clientApi2 = this.zze;
            Context context2 = this.zza;
            VersionInfoParcel versionInfoParcel2 = this.zzb;
            return new zzftq(str, clientApi2, context2, versionInfoParcel2.clientJarVersion, this.zzf, zzfpVar, zzceVar, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
        }
        if (iOrdinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.zze;
        Context context3 = this.zza;
        VersionInfoParcel versionInfoParcel3 = this.zzb;
        return new zzfsh(str, clientApi3, context3, versionInfoParcel3.clientJarVersion, this.zzf, zzfpVar, zzceVar, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
    }
}
