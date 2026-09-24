package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzeog implements zzelg {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zza(zzfke zzfkeVar, zzfjt zzfjtVar) {
        return !TextUtils.isEmpty(zzfjtVar.zzv.optString("pubid", ""));
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final ListenableFuture zzb(zzfke zzfkeVar, zzfjt zzfjtVar) {
        JSONObject jSONObject = zzfjtVar.zzv;
        String strOptString = jSONObject.optString("pubid", "");
        zzfkm zzfkmVar = zzfkeVar.zza.zza;
        zzfkl zzfklVar = new zzfkl();
        zzfklVar.zzz(zzfkmVar);
        zzfklVar.zzg(strOptString);
        zzfklVar.zzy(true);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfkmVar.zzd;
        Bundle bundleZzd = zzd(zzmVar.zzm);
        Bundle bundleZzd2 = zzd(bundleZzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleZzd2.putInt("gw", 1);
        String strOptString2 = jSONObject.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleZzd2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = jSONObject.optString("adJson", null);
        if (strOptString3 != null) {
            bundleZzd2.putString("_ad", strOptString3);
        }
        bundleZzd2.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = zzfjtVar.zzD;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundleZzd2.putString(next, strOptString4);
            }
        }
        bundleZzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleZzd2);
        zzfklVar.zza(new com.google.android.gms.ads.internal.client.zzm(zzmVar.zza, zzmVar.zzb, bundleZzd2, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, bundleZzd, zzmVar.zzn, zzmVar.zzo, zzmVar.zzp, zzmVar.zzq, zzmVar.zzr, zzmVar.zzs, zzmVar.zzt, zzmVar.zzu, zzmVar.zzv, zzmVar.zzw, zzmVar.zzx, zzmVar.zzy, zzmVar.zzz, zzmVar.zzA));
        zzfkm zzfkmVarZzA = zzfklVar.zzA();
        Bundle bundle = new Bundle();
        zzfjw zzfjwVar = zzfkeVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzfjwVar.zza));
        bundle2.putInt("refresh_interval", zzfjwVar.zzc);
        bundle2.putString("gws_query_id", zzfjwVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzfkmVar.zzg;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzfjtVar.zzw);
        bundle3.putString("ad_source_name", zzfjtVar.zzF);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzfjtVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzfjtVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfjtVar.zzp));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzfjtVar.zzm));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzfjtVar.zzg));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzfjtVar.zzh));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzfjtVar.zzi));
        bundle3.putString("transaction_id", zzfjtVar.zzj);
        bundle3.putString("valid_from_timestamp", zzfjtVar.zzk);
        bundle3.putBoolean("is_closable_area_disabled", zzfjtVar.zzP);
        bundle3.putString("recursive_server_response_data", zzfjtVar.zzao);
        bundle3.putBoolean("is_analytics_logging_enabled", zzfjtVar.zzW);
        zzcbp zzcbpVar = zzfjtVar.zzl;
        if (zzcbpVar != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzcbpVar.zzb);
            bundle4.putString("rb_type", zzcbpVar.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzfkmVarZzA, bundle, zzfjtVar, zzfkeVar);
    }

    protected abstract ListenableFuture zzc(zzfkm zzfkmVar, Bundle bundle, zzfjt zzfjtVar, zzfke zzfkeVar);
}
