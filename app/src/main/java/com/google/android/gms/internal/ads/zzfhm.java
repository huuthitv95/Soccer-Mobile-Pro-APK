package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfhm implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;

    private zzfhm(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
    }

    public static zzfhm zzc(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        return new zzfhm(zzimrVar, zzimrVar2, zzimrVar3);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00a6  */
    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfhk zzb() {
        zzfhk zzfhaVar;
        Context context = (Context) this.zza.zzb();
        zzflx zzflxVar = (zzflx) this.zzb.zzb();
        zzfmp zzfmpVar = (zzfmp) this.zzc.zzb();
        zzcem zzcemVarZzi = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhm)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi() : com.google.android.gms.ads.internal.zzt.zzh().zzo().zzj();
        boolean z = false;
        if (zzcemVarZzi != null && zzcemVarZzi.zzi()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhC)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhl)).booleanValue() || z) {
                zzfmo zzfmoVarZza = zzfmpVar.zza(zzfmf.AppOpen, context, zzflxVar, new zzfgn(new zzfgm()));
                zzfhb zzfhbVar = new zzfhb(new zzfha());
                zzfmb zzfmbVar = zzfmoVarZza.zza;
                zzhbs zzhbsVar = zzcff.zza;
                zzfhaVar = new zzfgr(zzfhbVar, new zzfgx(zzfmbVar, zzhbsVar), zzfmoVarZza.zzb, zzfmbVar.zze().zzf, zzhbsVar);
            } else {
                zzfhaVar = new zzfha();
            }
        } else {
            zzfhaVar = new zzfha();
        }
        return zzfhaVar;
    }
}
