package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface zzbsb extends zzbsm, zzbsa {

    /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbsb$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
    public final /* synthetic */ class CC {
        public static void $default$zzc(zzbsb _this, String str, String str2) {
            StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length() + 2);
            sb.append(str);
            sb.append("(");
            sb.append(str2);
            sb.append(");");
            _this.zza(sb.toString());
        }

        public static void $default$zzd(zzbsb _this, String str, JSONObject jSONObject) {
            String string = jSONObject.toString();
            StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
            sb.append(str);
            sb.append("',");
            sb.append(string);
            sb.append(");");
            String string2 = sb.toString();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Dispatching AFMA event: ".concat(string2));
            _this.zza(sb.toString());
        }

        public static void $default$zze(zzbsb _this, String str, Map map) {
            try {
                _this.zzd(str, com.google.android.gms.ads.internal.client.zzay.zza().zzm(map));
            } catch (JSONException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    void zza(String str);

    @Override // com.google.android.gms.internal.ads.zzbsm
    void zzb(String str, JSONObject jSONObject);

    @Override // com.google.android.gms.internal.ads.zzbsm
    void zzc(String str, String str2);

    @Override // com.google.android.gms.internal.ads.zzbsa
    void zzd(String str, JSONObject jSONObject);

    @Override // com.google.android.gms.internal.ads.zzbsa
    void zze(String str, Map map);
}
