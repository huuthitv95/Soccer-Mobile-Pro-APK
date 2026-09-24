package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdod {
    private final JSONObject zza;
    private final zzdul zzb;
    private final com.google.android.gms.ads.internal.zzb zzc;
    private final zzcdb zzd;

    public zzdod(JSONObject jSONObject, zzdul zzdulVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdb zzcdbVar) {
        this.zza = jSONObject;
        this.zzb = zzdulVar;
        this.zzc = zzbVar;
        this.zzd = zzcdbVar;
    }

    final com.google.android.gms.ads.internal.zzb zza() {
        return this.zzc;
    }

    final zzcdb zzb() {
        return this.zzd;
    }

    public final JSONObject zzc() {
        return this.zza;
    }

    public final zzdul zzd() {
        return this.zzb;
    }
}
