package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcrf {
    private final Map zza;
    private final Map zzb;

    zzcrf(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfke zzfkeVar) throws Exception {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        for (zzfkc zzfkcVar : zzfkeVar.zzb.zzc) {
            Map map = this.zza;
            String str = zzfkcVar.zza;
            if (!map.containsKey(str) || (jSONObject2 = zzfkcVar.zzb) == null) {
                Map map2 = this.zzb;
                if (map2.containsKey(str) && (jSONObject = zzfkcVar.zzb) != null) {
                    zzcrh zzcrhVar = (zzcrh) map2.get(str);
                    HashMap map3 = new HashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strOptString = jSONObject.optString(next);
                        if (strOptString != null) {
                            map3.put(next, strOptString);
                        }
                    }
                    zzcrhVar.zza(map3);
                }
            } else {
                ((zzcri) map.get(str)).zza(jSONObject2);
            }
        }
    }
}
