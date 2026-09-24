package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdwz implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;
    private final zzimr zzd;
    private final zzimr zze;

    private zzdwz(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
        this.zzd = zzimrVar4;
        this.zze = zzimrVar5;
    }

    public static zzdwz zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5) {
        return new zzdwz(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4, zzimrVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzcng) this.zza).zza();
        final String strZzb = ((zzeem) this.zzb).zzb();
        VersionInfoParcel versionInfoParcelZza = ((zzcnw) this.zzc).zza();
        final zzbhj.zza.EnumC15492zza enumC15492zza = (zzbhj.zza.EnumC15492zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbhd zzbhdVar = new zzbhd(new zzbhi(contextZza));
        zzbhj.zzar.zza zzaVarZzs = zzbhj.zzar.zzs();
        zzaVarZzs.zzc(versionInfoParcelZza.buddyApkVersion);
        zzaVarZzs.zzg(versionInfoParcelZza.clientJarVersion);
        zzaVarZzs.zzk(true != versionInfoParcelZza.isClientJar ? 2 : 0);
        final zzbhj.zzar zzarVarZzbu = zzaVarZzs.zzbu();
        zzbhdVar.zzb(new zzbhc() { // from class: com.google.android.gms.internal.ads.zzdwy
            @Override // com.google.android.gms.internal.ads.zzbhc
            public final /* synthetic */ void zza(zzbhj.zzt.zza zzaVar) {
                zzbhj.zza.zzb zzbVarZzcc = zzaVar.zzY().zzcc();
                zzbVarZzcc.zzc(enumC15492zza);
                zzaVar.zzaa(zzbVarZzcc);
                zzbhj.zzm.zza zzaVarZzcc = zzaVar.zzG().zzcc();
                zzaVarZzcc.zzd(strZzb);
                zzaVarZzcc.zzs(zzarVarZzbu);
                zzaVar.zzI(zzaVarZzcc);
                zzaVar.zzh(str);
            }
        });
        return zzbhdVar;
    }
}
