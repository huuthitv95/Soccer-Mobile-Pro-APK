package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcoe implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzcoe(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzcoe zzc(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        return new zzcoe(zzimrVar, zzimrVar2, zzimrVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcak zzb() {
        Context contextZza = ((zzcng) this.zza).zza();
        zzfpv zzfpvVar = (zzfpv) this.zzb.zzb();
        zzhbs zzhbsVarZzc = zzfno.zzc();
        zzbtw zzbtwVarZza = com.google.android.gms.ads.internal.zzt.zzr().zza(contextZza, VersionInfoParcel.forPackage(), zzfpvVar);
        zzbtq zzbtqVar = zzbtt.zza;
        zzbtwVarZza.zza("google.afma.request.getAdDictionary", zzbtqVar, zzbtqVar);
        return new zzcan(contextZza, com.google.android.gms.ads.internal.zzt.zzr().zza(contextZza, VersionInfoParcel.forPackage(), zzfpvVar).zza("google.afma.sdkConstants.getSdkConstants", zzbtqVar, zzbtqVar), VersionInfoParcel.forPackage(), zzhbsVarZzc);
    }
}
