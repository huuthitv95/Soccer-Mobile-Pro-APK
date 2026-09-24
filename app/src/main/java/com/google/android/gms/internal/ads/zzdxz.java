package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdxz implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;

    private zzdxz(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar4;
    }

    public static zzdxz zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        return new zzdxz(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton;
        final String strZza = ((zzfei) this.zza).zza();
        Context contextZza = ((zzcng) this.zzb).zza();
        zzhbs zzhbsVarZzc = zzfno.zzc();
        Map mapZzb = ((zzimm) this.zzc).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzge)).booleanValue()) {
            zzbhd zzbhdVar = new zzbhd(new zzbhi(contextZza));
            zzbhdVar.zzb(new zzbhc() { // from class: com.google.android.gms.internal.ads.zzdya
                @Override // com.google.android.gms.internal.ads.zzbhc
                public final /* synthetic */ void zza(zzbhj.zzt.zza zzaVar) {
                    zzaVar.zzh(strZza);
                }
            });
            setSingleton = Collections.singleton(new zzdke(new zzdyc(zzbhdVar, mapZzb), zzhbsVarZzc));
        } else {
            setSingleton = Collections.EMPTY_SET;
        }
        zzimq.zzb(setSingleton);
        return setSingleton;
    }
}
