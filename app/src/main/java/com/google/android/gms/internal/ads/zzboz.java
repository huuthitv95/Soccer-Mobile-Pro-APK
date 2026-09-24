package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzboz implements zzbpe {
    static final /* synthetic */ zzboz zza = new zzboz();

    private /* synthetic */ zzboz() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzclu zzcluVar = (zzclu) obj;
        zzbpe zzbpeVar = zzbpd.zza;
        String str = (String) map.get("u");
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzg)).booleanValue() && str.isEmpty()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL is empty from httpTrack GMSG.");
        } else {
            zzcjz zzcjzVar = (zzcjz) zzcluVar;
            new com.google.android.gms.ads.internal.util.zzbt(zzcluVar.getContext(), ((zzcmc) zzcluVar).zzs().afmaVersion, str, null, zzcjzVar.zzC() != null ? zzcjzVar.zzC().zzax : null).zzb();
        }
    }
}
