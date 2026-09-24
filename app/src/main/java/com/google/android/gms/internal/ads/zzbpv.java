package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C11744X3;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
@ParametersAreNonnullByDefault
public final class zzbpv implements zzbpe {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final void zza(Object obj, Map map) {
        String strConcat;
        String str = (String) map.get("id");
        String str2 = (String) map.get(C11744X3.g.f26257e);
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            strConcat = "";
        } else {
            String.valueOf(str4);
            strConcat = "\n".concat(String.valueOf(str4));
        }
        synchronized (this.zza) {
            zzbpu zzbpuVar = (zzbpu) this.zzb.remove(str);
            if (zzbpuVar == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                sb.append("Received result for unexpected method invocation: ");
                sb.append(str);
                String string = sb.toString();
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + strConcat.length());
                sb2.append(str3);
                sb2.append(strConcat);
                zzbpuVar.zzb(sb2.toString());
                return;
            }
            if (str5 == null) {
                zzbpuVar.zza(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    String string2 = jSONObject.toString(2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(string2).length() + 13);
                    sb3.append("Result GMSG: ");
                    sb3.append(string2);
                    com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                }
                zzbpuVar.zza(jSONObject);
            } catch (JSONException e) {
                zzbpuVar.zzb(e.getMessage());
            }
        }
    }

    public final void zzb(String str, zzbpu zzbpuVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbpuVar);
        }
    }

    public final ListenableFuture zzc(zzbsm zzbsmVar, String str, JSONObject jSONObject) {
        zzcfk zzcfkVar = new zzcfk();
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzb(string, new zzbpt(this, zzcfkVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            zzbsmVar.zzb(str, jSONObject2);
            return zzcfkVar;
        } catch (Exception e) {
            zzcfkVar.zzd(e);
            return zzcfkVar;
        }
    }
}
