package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcpm implements zzfjn {
    final zzimr zza;
    final zzimr zzb;
    final zzimr zzc;
    final zzimr zzd;
    final zzimr zze;
    final zzimr zzf;
    final zzimr zzg;
    final zzimr zzh;
    private final zzcol zzi;

    zzcpm(zzcol zzcolVar, Context context, String str) {
        this.zzi = zzcolVar;
        zzimi zzimiVarZza = zzimj.zza(context);
        this.zza = zzimiVarZza;
        zzimr zzimrVar = zzcolVar.zzby;
        zzfhn zzfhnVarZzc = zzfhn.zzc(zzimiVarZza, zzimrVar, zzcolVar.zzbz);
        this.zzb = zzfhnVarZzc;
        zzimr zzimrVarZza = zzimh.zza(zzfiy.zza(zzimrVar));
        this.zzc = zzimrVarZza;
        zzimr zzimrVarZza2 = zzimh.zza(zzfkk.zza());
        this.zzd = zzimrVarZza2;
        zzimr zzimrVarZza3 = zzimh.zza(zzfjh.zza(zzimiVarZza, zzcolVar.zza, zzcolVar.zzaf, zzfhnVarZzc, zzimrVarZza, zzfko.zza(), zzimrVarZza2));
        this.zze = zzimrVarZza3;
        this.zzf = zzimh.zza(zzfjr.zza(zzimrVarZza3, zzimrVarZza, zzimrVarZza2));
        zzimi zzimiVarZzc = zzimj.zzc(str);
        this.zzg = zzimiVarZzc;
        this.zzh = zzimh.zza(zzfjl.zza(zzimiVarZzc, zzimrVarZza3, zzimiVarZza, zzimrVarZza, zzimrVarZza2, zzcolVar.zzi, zzcolVar.zzai, zzcolVar.zzp));
    }

    @Override // com.google.android.gms.internal.ads.zzfjn
    public final zzfjq zza() {
        return (zzfjq) this.zzf.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfjn
    public final zzfjk zzb() {
        return (zzfjk) this.zzh.zzb();
    }
}
