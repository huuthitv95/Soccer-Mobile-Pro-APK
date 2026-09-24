package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzdnj implements zzcxk {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzimx zzd;
    private final zzdpr zze;

    zzdnj(Map map, Map map2, Map map3, zzimx zzimxVar, zzdpr zzdprVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzimxVar;
        this.zze = zzdprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxk
    public final zzelg zza(int i, String str) {
        zzelg zzelgVarZza;
        zzelg zzelgVar = (zzelg) this.zza.get(str);
        if (zzelgVar != null) {
            return zzelgVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzenm zzenmVar = (zzenm) this.zzc.get(str);
            if (zzenmVar != null) {
                return zzcxp.zza(zzenmVar);
            }
            zzelgVarZza = (zzelg) this.zzb.get(str);
            if (zzelgVarZza == null) {
                return null;
            }
        } else if (this.zze.zzd() == null || (zzelgVarZza = ((zzcxk) this.zzd.zzb()).zza(i, str)) == null) {
            return null;
        }
        return zzcxp.zzb(zzelgVarZza);
    }
}
