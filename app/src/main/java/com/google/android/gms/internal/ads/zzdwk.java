package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdwk {
    private final zzdyz zza;

    zzdwk(zzdyz zzdyzVar) {
        this.zza = zzdyzVar;
    }

    public final boolean zza(zzgad zzgadVar) {
        if (zzgadVar.zzj()) {
            zzdyy zzdyyVarZza = this.zza.zza();
            zzdyyVarZza.zzc("action", "aq_ad_closed");
            zzdyyVarZza.zzc("gqi", zzgadVar.zza());
            zzdyyVarZza.zzc("aq_ad_duration", String.valueOf(zzgadVar.zzb()));
            zzdyyVarZza.zzc("aq_ad_bounce_cnt", String.valueOf(zzgadVar.zzc()));
            zzdyyVarZza.zzc("aq_time_away", String.valueOf(zzgadVar.zzg()));
            boolean zEquals = zzdyyVarZza.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
            Boolean.valueOf(zEquals).getClass();
            return zEquals;
        }
        zzdyy zzdyyVarZza2 = this.zza.zza();
        zzdyyVarZza2.zzc("action", "aq_ad_kill");
        zzdyyVarZza2.zzc("gqi", zzgadVar.zza());
        zzdyyVarZza2.zzc("aq_ad_duration", String.valueOf(zzgadVar.zzb()));
        zzdyyVarZza2.zzc("aq_ad_bounce_cnt", String.valueOf(zzgadVar.zzc()));
        zzdyyVarZza2.zzc("aq_time_away", String.valueOf(zzgadVar.zzg()));
        zzdyyVarZza2.zzc("aq_is_os_kill", String.valueOf(zzgadVar.zze()));
        boolean zEquals2 = zzdyyVarZza2.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
        Boolean.valueOf(zEquals2).getClass();
        return zEquals2;
    }
}
