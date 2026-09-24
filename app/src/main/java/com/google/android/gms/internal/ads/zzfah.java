package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.Base64;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfah implements zzfbw {
    private final Map zza;

    public zzfah(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfbw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Map map = this.zza;
        if (map.isEmpty()) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziN)).booleanValue()) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : map.entrySet()) {
                ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
                if (!arrayDeque.isEmpty()) {
                    zzeaf zzeafVar = (zzeaf) entry.getKey();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", zzeafVar.zza());
                        jSONObject.put("event_type", zzeafVar.zzb());
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = arrayDeque.iterator();
                        while (it.hasNext()) {
                            jSONArray2.put((Long) it.next());
                        }
                        jSONObject.put("timestamps", jSONArray2);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.zze.zzb("Failed putting the on-device storage record.", e);
                    }
                }
            }
            if (jSONArray.length() > 0) {
                bundle.putString("on_device_storage_records", jSONArray.toString());
                return;
            }
            return;
        }
        Map map2 = this.zza;
        zzhcq zzhcqVarZzb = zzhct.zzb();
        for (Map.Entry entry2 : map2.entrySet()) {
            ArrayDeque arrayDeque2 = (ArrayDeque) entry2.getValue();
            if (!arrayDeque2.isEmpty()) {
                zzeaf zzeafVar2 = (zzeaf) entry2.getKey();
                int iZza = zzhcn.zza(zzeafVar2.zzb());
                if (iZza != 0) {
                    zzhco zzhcoVarZza = zzhcp.zza();
                    zzhcoVarZza.zza(zzeafVar2.zza());
                    zzhcoVarZza.zzb(iZza);
                    zzhcp zzhcpVar = (zzhcp) zzhcoVarZza.zzbu();
                    zzhcr zzhcrVarZza = zzhcs.zza();
                    zzhcrVarZza.zza(zzhcpVar);
                    zzhcrVarZza.zzb(arrayDeque2);
                    zzhcqVarZzb.zza(zzhcrVarZza);
                }
            }
        }
        zzhct zzhctVar = (zzhct) zzhcqVarZzb.zzbu();
        if (zzhctVar.zza() > 0) {
            bundle.putString("ods", Base64.encodeToString(zzhctVar.zzaN(), 11));
        }
    }
}
