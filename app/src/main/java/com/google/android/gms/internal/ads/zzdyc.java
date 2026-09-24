package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdyc implements zzfoz {
    private final Map zza;
    private final zzbhd zzb;

    zzdyc(zzbhd zzbhdVar, Map map) {
        this.zza = map;
        this.zzb = zzbhdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdL(zzfos zzfosVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdM(zzfos zzfosVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfosVar)) {
            this.zzb.zzc(((zzdyb) map.get(zzfosVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdN(zzfos zzfosVar, String str, Throwable th) {
        Map map = this.zza;
        if (map.containsKey(zzfosVar)) {
            this.zzb.zzc(((zzdyb) map.get(zzfosVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdO(zzfos zzfosVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfosVar)) {
            this.zzb.zzc(((zzdyb) map.get(zzfosVar)).zzb);
        }
    }
}
