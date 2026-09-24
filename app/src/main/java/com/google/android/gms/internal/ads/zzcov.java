package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcov implements zzfgj {
    final zzimr zza;
    final zzimr zzb;
    final zzimr zzc;
    final zzimr zzd;
    final zzimr zze;
    final zzimr zzf;
    private final Context zzg;
    private final com.google.android.gms.ads.internal.client.zzr zzh;
    private final String zzi;
    private final zzcol zzj;

    zzcov(zzcol zzcolVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzj = zzcolVar;
        this.zzg = context;
        this.zzh = zzrVar;
        this.zzi = str;
        zzimi zzimiVarZza = zzimj.zza(context);
        this.zza = zzimiVarZza;
        zzimi zzimiVarZza2 = zzimj.zza(zzrVar);
        this.zzb = zzimiVarZza2;
        zzimr zzimrVarZza = zzimh.zza(zzesr.zza(zzcolVar.zzp));
        this.zzc = zzimrVarZza;
        zzimr zzimrVarZza2 = zzimh.zza(zzesw.zza());
        this.zzd = zzimrVarZza2;
        zzimr zzimrVarZza3 = zzimh.zza(zzdhn.zza());
        this.zze = zzimrVarZza3;
        this.zzf = zzimh.zza(zzfgh.zza(zzimiVarZza, zzcolVar.zza, zzimiVarZza2, zzcolVar.zzaf, zzimrVarZza, zzimrVarZza2, zzfko.zza(), zzimrVarZza3));
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    public final zzeru zza() {
        zzfgg zzfggVar = (zzfgg) this.zzf.zzb();
        zzesq zzesqVar = (zzesq) this.zzc.zzb();
        zzcol zzcolVar = this.zzj;
        zzimr zzimrVar = zzcolVar.zzp;
        return new zzeru(this.zzg, this.zzh, this.zzi, zzfggVar, zzesqVar, zzcnw.zzd(zzcolVar.zzI()), (zzdyz) zzimrVar.zzb());
    }
}
