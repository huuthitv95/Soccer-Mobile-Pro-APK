package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcpg implements zzfhz {
    final zzimr zza;
    final zzimr zzb;
    final zzimr zzc;
    final zzimr zzd;
    final zzimr zze;
    final zzimr zzf;
    final zzimr zzg;
    private final zzcol zzh;

    zzcpg(zzcol zzcolVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzh = zzcolVar;
        zzimi zzimiVarZza = zzimj.zza(context);
        this.zza = zzimiVarZza;
        zzimi zzimiVarZza2 = zzimj.zza(zzrVar);
        this.zzb = zzimiVarZza2;
        zzimi zzimiVarZza3 = zzimj.zza(str);
        this.zzc = zzimiVarZza3;
        zzimr zzimrVar = zzcolVar.zzp;
        zzimr zzimrVarZza = zzimh.zza(zzesr.zza(zzimrVar));
        this.zzd = zzimrVarZza;
        zzimr zzimrVarZza2 = zzimh.zza(zzfiy.zza(zzcolVar.zzby));
        this.zze = zzimrVarZza2;
        zzimr zzimrVarZza3 = zzimh.zza(zzfhx.zza(zzimiVarZza, zzcolVar.zza, zzcolVar.zzaf, zzimrVarZza, zzimrVarZza2, zzfko.zza()));
        this.zzf = zzimrVarZza3;
        this.zzg = zzimh.zza(zzesz.zza(zzimiVarZza, zzimiVarZza2, zzimiVarZza3, zzimrVarZza3, zzimrVarZza, zzimrVarZza2, zzcolVar.zzi, zzcolVar.zzai, zzimrVar));
    }

    @Override // com.google.android.gms.internal.ads.zzfhz
    public final zzesy zza() {
        return (zzesy) this.zzg.zzb();
    }
}
