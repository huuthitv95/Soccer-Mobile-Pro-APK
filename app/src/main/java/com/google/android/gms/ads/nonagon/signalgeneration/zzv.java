package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzdyu;
import com.google.android.gms.internal.ads.zzdze;
import com.google.android.gms.internal.ads.zzfke;
import com.google.android.gms.internal.ads.zzfkm;
import com.google.android.gms.internal.ads.zzfpx;
import com.google.firebase.ktx.BuildConfig;
import com.ironsource.C11366Bc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzv {
    public static boolean zza(zzfke zzfkeVar) {
        return zzg(zzfkeVar.zza.zza) != 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    public static String zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.VERSION_NAME;
        }
        switch (str) {
            case "requester_type_0":
                return "0";
            case "requester_type_1":
                return "1";
            case "requester_type_2":
                return "2";
            case "requester_type_3":
                return ExifInterface.GPS_MEASUREMENT_3D;
            case "requester_type_4":
                return "4";
            case "requester_type_5":
                return CampaignEx.CLICKMODE_ON;
            case "requester_type_6":
                return "6";
            case "requester_type_7":
                return C11366Bc.f23952e;
            case "requester_type_8":
                return "8";
            default:
                return str;
        }
    }

    public static String zzc(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        return (zzmVar == null || (bundle = zzmVar.zzc) == null) ? BuildConfig.VERSION_NAME : bundle.getString("query_info_type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    public static zzfpx zzd(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return zzfpx.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        switch (string) {
            case "requester_type_0":
                return zzfpx.SCAR_REQUEST_TYPE_ADMOB;
            case "requester_type_1":
                return zzfpx.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
            case "requester_type_2":
                return zzfpx.SCAR_REQUEST_TYPE_GBID;
            case "requester_type_3":
                return zzfpx.SCAR_REQUEST_TYPE_GOLDENEYE;
            case "requester_type_4":
                return zzfpx.SCAR_REQUEST_TYPE_YAVIN;
            case "requester_type_5":
                return zzfpx.SCAR_REQUEST_TYPE_UNITY;
            case "requester_type_6":
                return zzfpx.SCAR_REQUEST_TYPE_PAW;
            case "requester_type_7":
                return zzfpx.SCAR_REQUEST_TYPE_GUILDER;
            case "requester_type_8":
                return zzfpx.SCAR_REQUEST_TYPE_GAM_S2S;
            default:
                return zzfpx.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
    }

    public static void zze(final zzdze zzdzeVar, zzdyu zzdyuVar, final String str, final Pair... pairArr) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhT)).booleanValue()) {
            final zzdyu zzdyuVar2 = null;
            zzcff.zza.execute(new Runnable(zzdyuVar2, str, pairArr) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
                private final /* synthetic */ String zzb;
                private final /* synthetic */ Pair[] zzc;

                {
                    this.zzb = str;
                    this.zzc = pairArr;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzv.zzf(this.zza, null, this.zzb, this.zzc);
                }
            });
        }
    }

    static /* synthetic */ void zzf(zzdze zzdzeVar, zzdyu zzdyuVar, String str, Pair[] pairArr) {
        ConcurrentHashMap concurrentHashMapZzd = zzdzeVar.zzd();
        zzh(concurrentHashMapZzd, "action", str);
        for (Pair pair : pairArr) {
            zzh(concurrentHashMapZzd, (String) pair.first, (String) pair.second);
        }
        zzdzeVar.zzb(concurrentHashMapZzd);
    }

    public static int zzg(zzfkm zzfkmVar) {
        if (zzfkmVar.zzs) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfkmVar.zzd;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar.zzs;
        if (zzcVar == null && zzmVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzmVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }

    private static void zzh(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
