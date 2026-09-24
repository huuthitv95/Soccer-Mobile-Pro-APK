package com.google.android.gms.internal.ads;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcuh {
    private final zzdyz zza;
    private final zzfke zzb;

    zzcuh(zzdyz zzdyzVar, zzfke zzfkeVar) {
        this.zza = zzdyzVar;
        this.zzb = zzfkeVar;
    }

    public final void zza(long j, int i) {
        String str;
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zza(this.zzb.zzb.zzb);
        zzdyyVarZza.zzc("action", "ad_closed");
        zzdyyVarZza.zzc("show_time", String.valueOf(j));
        zzdyyVarZza.zzc(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
        int i2 = i - 1;
        if (i2 == 0) {
            str = CmcdData.Factory.STREAMING_FORMAT_HLS;
        } else if (i2 == 1) {
            str = "bb";
        } else if (i2 == 2) {
            str = "cc";
        } else if (i2 != 3) {
            str = i2 != 4 ? "u" : CampaignEx.KEY_ACTIVITY_PATH_AND_NAME;
        } else {
            str = "cb";
        }
        zzdyyVarZza.zzc("acr", str);
        zzdyyVarZza.zzd();
    }
}
