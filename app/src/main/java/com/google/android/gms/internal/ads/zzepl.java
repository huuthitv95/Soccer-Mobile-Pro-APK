package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzepl implements zzeli {
    private final Map zza = new HashMap();
    private final zzdwq zzb;

    public zzepl(zzdwq zzdwqVar) {
        this.zzb = zzdwqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final zzelj zza(String str, JSONObject jSONObject) throws zzfkt {
        zzelj zzeljVar;
        synchronized (this) {
            Map map = this.zza;
            zzeljVar = (zzelj) map.get(str);
            if (zzeljVar == null) {
                zzeljVar = new zzelj(this.zzb.zza(str, jSONObject), new zzemw(), str);
                map.put(str, zzeljVar);
            }
        }
        return zzeljVar;
    }
}
