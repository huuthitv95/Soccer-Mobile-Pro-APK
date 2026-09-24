package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzboc implements zzbpe {
    zzboc() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcki zzckiVar = (zzcki) obj;
        if (TextUtils.isEmpty((CharSequence) map.get(RemoteConfigConstants.RequestFieldKey.APP_ID))) {
            com.google.android.gms.ads.internal.util.zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzgrf zzgrfVarZzl = zzgrg.zzl();
        zzgrfVarZzl.zzb((String) map.get(RemoteConfigConstants.RequestFieldKey.APP_ID));
        zzgrfVarZzl.zzg(zzckiVar.getWidth());
        zzgrfVarZzl.zza(zzckiVar.zzE().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzgrfVarZzl.zzc(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzgrfVarZzl.zzc(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzgrfVarZzl.zzd(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzgrfVarZzl.zzd(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzgrfVarZzl.zzh((String) map.get("enifd"));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzt().zzc(zzckiVar, zzgrfVarZzl.zzi());
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            com.google.android.gms.ads.internal.util.zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
