package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzftp extends zzccc {
    private zzcbw zza;
    private zzfsb zzb;
    private String zzc;

    zzftp(zzcbw zzcbwVar, zzfsb zzfsbVar, String str) {
        this.zza = zzcbwVar;
        this.zzb = zzfsbVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final void zze() {
        zzfsb zzfsbVar = this.zzb;
        zzcbw zzcbwVar = this.zza;
        if (zzcbwVar == null || zzfsbVar == null) {
            return;
        }
        zzfsbVar.zza(zzcbwVar);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final void zzf(int i) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfsb zzfsbVar = this.zzb;
        if (this.zza == null || zzfsbVar == null) {
            return;
        }
        String string = zzeVar.zzb().toString();
        String str = this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 51 + String.valueOf(str).length());
        sb.append("Failed to load rewarded ad with error: ");
        sb.append(string);
        sb.append(", adUnitId: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        ((zzfta) zzfsbVar).zza.zzD(zzeVar);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }
}
