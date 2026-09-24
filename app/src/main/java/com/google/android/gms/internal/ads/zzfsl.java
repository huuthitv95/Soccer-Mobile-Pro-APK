package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfsl extends com.google.android.gms.ads.internal.client.zzbj {
    private com.google.android.gms.ads.internal.client.zzbu zza;
    private zzfsb zzb;
    private String zzc;

    zzfsl(com.google.android.gms.ads.internal.client.zzbu zzbuVar, zzfsb zzfsbVar, String str) {
        this.zza = zzbuVar;
        this.zzb = zzfsbVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb() {
        zzfsb zzfsbVar = this.zzb;
        com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zza;
        if (zzbuVar == null || zzfsbVar == null) {
            return;
        }
        zzfsbVar.zza(zzbuVar);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfsb zzfsbVar = this.zzb;
        if (this.zza == null || zzfsbVar == null) {
            return;
        }
        String string = zzeVar.zzb().toString();
        String str = this.zzc;
        StringBuilder sb = new StringBuilder(string.length() + 57 + String.valueOf(str).length());
        sb.append("Failed to load interstitial ad with error: ");
        sb.append(string);
        sb.append(" for ad unit: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        ((zzfta) zzfsbVar).zza.zzD(zzeVar);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }
}
