package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcoq implements zzfev {
    final zzimr zza;
    final zzimr zzb;
    final zzimr zzc;
    final zzimr zzd;
    final zzimr zze;
    final zzimr zzf;
    private final zzcol zzg;

    zzcoq(zzcol zzcolVar, Context context, String str) {
        this.zzg = zzcolVar;
        zzimi zzimiVarZza = zzimj.zza(context);
        this.zza = zzimiVarZza;
        zzimi zzimiVarZza2 = zzimj.zza(str);
        this.zzb = zzimiVarZza2;
        zzimr zzimrVar = zzcolVar.zzby;
        zzfhm zzfhmVarZzc = zzfhm.zzc(zzimiVarZza, zzimrVar, zzcolVar.zzbz);
        this.zzc = zzfhmVarZzc;
        zzimr zzimrVarZza = zzimh.zza(zzfft.zza(zzimrVar));
        this.zzd = zzimrVarZza;
        zzimr zzimrVar2 = zzcolVar.zza;
        zzimr zzimrVar3 = zzcolVar.zzaf;
        zzfko zzfkoVarZza = zzfko.zza();
        zzimr zzimrVar4 = zzcolVar.zzi;
        zzimr zzimrVarZza2 = zzimh.zza(zzffv.zza(zzimiVarZza, zzimrVar2, zzimrVar3, zzfhmVarZzc, zzimrVarZza, zzfkoVarZza, zzimrVar4));
        this.zze = zzimrVarZza2;
        this.zzf = zzimh.zza(zzfgb.zza(zzimrVar3, zzimiVarZza, zzimiVarZza2, zzimrVarZza2, zzimrVarZza, zzimrVar4, zzcolVar.zzp));
    }

    @Override // com.google.android.gms.internal.ads.zzfev
    public final zzfga zza() {
        return (zzfga) this.zzf.zzb();
    }
}
