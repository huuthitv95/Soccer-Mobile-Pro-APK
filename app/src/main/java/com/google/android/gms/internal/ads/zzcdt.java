package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcdt {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzcdg zzd;

    zzcdt(Context context, zzcdg zzcdgVar) {
        this.zzc = context;
        this.zzd = zzcdgVar;
    }

    final synchronized void zza(zzcdr zzcdrVar) {
        this.zzb.add(zzcdrVar);
    }

    final synchronized void zzb(String str) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            return;
        }
        SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
        zzcdq zzcdqVar = new zzcdq(this, str);
        map.put(str, zzcdqVar);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzcdqVar);
    }

    final /* synthetic */ void zzc(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.zzd.zzb();
        }
    }

    final /* synthetic */ List zzd() {
        return this.zzb;
    }
}
