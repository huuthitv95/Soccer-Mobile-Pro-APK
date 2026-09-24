package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzenl implements zzeli {
    private final zzdwq zza;

    public zzenl(zzdwq zzdwqVar) {
        this.zza = zzdwqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final zzelj zza(String str, JSONObject jSONObject) throws zzfkt {
        return new zzelj(this.zza.zza(str, jSONObject), new zzemv(), str);
    }
}
