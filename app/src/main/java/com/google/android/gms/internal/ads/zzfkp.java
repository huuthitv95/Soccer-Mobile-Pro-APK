package com.google.android.gms.internal.ads;

import com.facebook.share.internal.MessengerShareContentUtility;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfkp {
    private final JSONObject zza;

    public zzfkp(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    public final String zza() {
        if (zzc() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final boolean zzb() {
        return this.zza.optBoolean((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgp), true);
    }

    public final int zzc() {
        int iOptInt = this.zza.optInt(MessengerShareContentUtility.MEDIA_TYPE, -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
