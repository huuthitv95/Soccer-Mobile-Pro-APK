package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfkx {
    public static zzbpe zza(final zzeju zzejuVar, final zzfro zzfroVar, final zzcsx zzcsxVar, final zzdkm zzdkmVar) {
        return new zzbpe() { // from class: com.google.android.gms.internal.ads.zzfkw
            @Override // com.google.android.gms.internal.ads.zzbpe
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcki zzckiVar = (zzcki) obj;
                zzbpd.zzc(map, zzdkmVar);
                String str = (String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                } else {
                    zzeju zzejuVar2 = zzejuVar;
                    zzfro zzfroVar2 = zzfroVar;
                    zzhbi.zzr(zzbpd.zza(zzckiVar, str), new zzfku(zzckiVar, zzcsxVar, zzfroVar2, zzejuVar2), zzcff.zza);
                }
            }
        };
    }

    public static zzbpe zzb(final zzeju zzejuVar, final zzfro zzfroVar) {
        return new zzbpe() { // from class: com.google.android.gms.internal.ads.zzfkv
            @Override // com.google.android.gms.internal.ads.zzbpe
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcjz zzcjzVar = (zzcjz) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
                    return;
                }
                zzfjt zzfjtVarZzC = zzcjzVar.zzC();
                if (zzfjtVarZzC != null && !zzfjtVarZzC.zzai) {
                    zzfroVar.zzb(str, zzfjtVarZzC.zzax, null, null);
                    return;
                }
                zzfjw zzfjwVarZzaC = ((zzclp) zzcjzVar).zzaC();
                if (zzfjwVarZzaC != null) {
                    zzejuVar.zze(new zzejw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), zzfjwVarZzaC.zzb, str, 2));
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                }
            }
        };
    }
}
