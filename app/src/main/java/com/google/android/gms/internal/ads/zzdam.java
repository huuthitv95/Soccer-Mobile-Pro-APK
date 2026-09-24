package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdam implements zzdfl, zzdky {
    private final Context zza;
    private final zzfkm zzb;
    private final VersionInfoParcel zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzebk zze;
    private final zzfpv zzf;
    private final zzecf zzg;

    public zzdam(Context context, zzfkm zzfkmVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.util.zzg zzgVar, zzebk zzebkVar, zzfpv zzfpvVar, zzecf zzecfVar) {
        this.zza = context;
        this.zzb = zzfkmVar;
        this.zzc = versionInfoParcel;
        this.zzd = zzgVar;
        this.zze = zzebkVar;
        this.zzf = zzfpvVar;
        this.zzg = zzecfVar;
    }

    private final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeT)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzd;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzc;
            zzfkm zzfkmVar = this.zzb;
            zzfpv zzfpvVar = this.zzf;
            zzecf zzecfVar = this.zzg;
            com.google.android.gms.ads.internal.zzt.zzl().zzb(context, versionInfoParcel, zzfkmVar.zzg, zzgVar.zzi(), zzfpvVar, zzecfVar.zzs());
        }
        this.zze.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeU)).booleanValue()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzdP(zzcar zzcarVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzdQ(zzfke zzfkeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zze(String str) {
    }
}
