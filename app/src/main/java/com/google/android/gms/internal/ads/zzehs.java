package com.google.android.gms.internal.ads;

import com.ironsource.C11494Ie;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzehs implements zzbtp {
    zzehs() {
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzeht zzehtVar = (zzeht) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkF)).booleanValue()) {
            zzcat zzcatVar = zzehtVar.zzc;
            jSONObject2.put("ad_request_url", zzcatVar.zze());
            jSONObject2.put("ad_request_post_body", zzcatVar.zzd());
        }
        zzcat zzcatVar2 = zzehtVar.zzc;
        jSONObject2.put("base_url", zzcatVar2.zzc());
        jSONObject2.put("signals", zzehtVar.zzb);
        zzehz zzehzVar = zzehtVar.zza;
        jSONObject3.put("body", zzehzVar.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzay.zza().zzm(zzehzVar.zzb));
        jSONObject3.put("response_code", zzehzVar.zza);
        jSONObject3.put("latency", zzehzVar.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put(C11494Ie.f24627n, jSONObject3);
        jSONObject.put("flags", zzcatVar2.zzh());
        return jSONObject;
    }
}
