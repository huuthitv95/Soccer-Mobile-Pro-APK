package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzboa implements zzbpe {
    zzboa() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzd;
        zzcki zzckiVar = (zzcki) obj;
        zzblf zzblfVarZzar = zzckiVar.zzar();
        if (zzblfVarZzar == null || (jSONObjectZzd = zzblfVarZzar.zzd()) == null) {
            zzckiVar.zzd("nativeClickMetaReady", new JSONObject());
        } else {
            zzckiVar.zzd("nativeClickMetaReady", jSONObjectZzd);
        }
    }
}
