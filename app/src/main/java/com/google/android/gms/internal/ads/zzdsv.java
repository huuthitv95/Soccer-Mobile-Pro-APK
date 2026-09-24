package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdsv {
    private final Executor zza;
    private final zzdsq zzb;
    private final zzdyu zzc;

    zzdsv(Executor executor, zzdsq zzdsqVar, zzdyu zzdyuVar) {
        this.zza = executor;
        this.zzb = zzdsqVar;
        this.zzc = zzdyuVar;
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str) {
        ListenableFuture listenableFutureZza;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return zzhbi.zza(Collections.EMPTY_LIST);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcU)).booleanValue()) {
            this.zzc.zzf(zzdyi.NATIVE_ASSETS_LOADING_CUSTOM_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                listenableFutureZza = zzhbi.zza(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString("name");
                if (strOptString == null) {
                    listenableFutureZza = zzhbi.zza(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    listenableFutureZza = TypedValues.Custom.S_STRING.equals(strOptString2) ? zzhbi.zza(new zzdss(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? zzhbi.zzk(this.zzb.zza(jSONObjectOptJSONObject, "image_value", null), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzdst
                        @Override // com.google.android.gms.internal.ads.zzgsn
                        public final /* synthetic */ Object apply(Object obj) {
                            return new zzdss(strOptString, (zzbld) obj);
                        }
                    }, this.zza) : zzhbi.zza(null);
                }
            }
            arrayList.add(listenableFutureZza);
        }
        return zzhbi.zzk(zzhbi.zzm(arrayList), zzdsu.zza, this.zza);
    }
}
