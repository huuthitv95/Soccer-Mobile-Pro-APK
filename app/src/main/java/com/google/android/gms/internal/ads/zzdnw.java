package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdnw implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;
    private final zzimr zzd;
    private final zzimr zze;
    private final zzimr zzf;

    private zzdnw(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5, zzimr zzimrVar6) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
        this.zzd = zzimrVar4;
        this.zze = zzimrVar5;
        this.zzf = zzimrVar6;
    }

    public static zzdnw zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5, zzimr zzimrVar6) {
        return new zzdnw(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4, zzimrVar5, zzimrVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcmx zzcmxVar = (zzcmx) this.zza.zzb();
        zzdbo zzdboVarZza = ((zzdbx) this.zzb).zza();
        zzdif zzdifVarZza = ((zzdja) this.zzc).zza();
        zzdnl zzdnlVarZza = ((zzdnn) this.zzd).zza();
        zzdfg zzdfgVarZzb = ((zzcuy) this.zze).zzb();
        zzeor zzeorVar = (zzeor) this.zzf.zzb();
        zzcwd zzcwdVarZzi = zzcmxVar.zzi();
        zzcwdVarZzi.zzl(zzdboVarZza.zze());
        zzcwdVarZzi.zzm(zzdifVarZza);
        zzcwdVarZzi.zzd(zzdnlVarZza);
        zzcwdVarZzi.zzk(new zzeqw(null));
        zzcwdVarZzi.zzg(new zzcwz(zzdfgVarZzb, null));
        zzcwdVarZzi.zze(new zzcuw(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzez)).booleanValue()) {
            zzcwdVarZzi.zzf(zzepa.zza(zzeorVar));
        }
        zzcxk zzcxkVarZzd = zzcwdVarZzi.zzh().zzd();
        zzimq.zzb(zzcxkVarZzd);
        return zzcxkVarZzd;
    }
}
