package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfsg extends zzbfz {
    private zzfsb zza;
    private String zzb;

    zzfsg(zzfsb zzfsbVar, String str) {
        this.zza = zzfsbVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzb(zzbfx zzbfxVar) {
        zzfsb zzfsbVar = this.zza;
        if (zzfsbVar == null) {
            return;
        }
        zzfsbVar.zza(zzbfxVar);
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzc(int i) {
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfsb zzfsbVar = this.zza;
        if (zzfsbVar == null) {
            return;
        }
        String string = zzeVar.zzb().toString();
        String str = this.zzb;
        StringBuilder sb = new StringBuilder(string.length() + 60 + String.valueOf(str).length());
        sb.append("Failed to load app open ad with error parcel: ");
        sb.append(string);
        sb.append(" for ad unit: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        ((zzfta) zzfsbVar).zza.zzD(zzeVar);
        this.zza = null;
        this.zzb = null;
    }
}
