package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzell {
    private final String zzc;
    private zzfjw zzd = null;
    private zzfjt zze = null;
    private com.google.android.gms.ads.internal.client.zzv zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzell(String str) {
        this.zzc = str;
    }

    private final synchronized void zzj(zzfjt zzfjtVar, int i) {
        Map map = this.zzb;
        String strZzl = zzl(zzfjtVar);
        if (map.containsKey(strZzl)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = zzfjtVar.zzv;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        com.google.android.gms.ads.internal.client.zzv zzvVar = new com.google.android.gms.ads.internal.client.zzv(zzfjtVar.zzE, 0L, null, bundle, zzfjtVar.zzF, zzfjtVar.zzG, zzfjtVar.zzH, zzfjtVar.zzI);
        try {
            this.zza.add(i, zzvVar);
        } catch (IndexOutOfBoundsException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(strZzl, zzvVar);
    }

    private final void zzk(zzfjt zzfjtVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z) {
        Map map = this.zzb;
        String strZzl = zzl(zzfjtVar);
        if (map.containsKey(strZzl)) {
            if (this.zze == null) {
                this.zze = zzfjtVar;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(strZzl);
            zzvVar.zzb = j;
            zzvVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhJ)).booleanValue() && z) {
                this.zzf = zzvVar;
            }
        }
    }

    private static String zzl(zzfjt zzfjtVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzew)).booleanValue() ? zzfjtVar.zzap : zzfjtVar.zzw;
    }

    public final void zza(zzfjw zzfjwVar) {
        this.zzd = zzfjwVar;
    }

    public final void zzb(zzfjt zzfjtVar) {
        zzj(zzfjtVar, this.zza.size());
    }

    public final synchronized void zzc(String str, List list) {
        try {
            Map map = this.zzb;
            if (map.containsKey(str)) {
                com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(str);
                List list2 = this.zza;
                int iIndexOf = list2.indexOf(zzvVar);
                try {
                    list2.remove(iIndexOf);
                } catch (IndexOutOfBoundsException e) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
                }
                this.zzb.remove(str);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzj((zzfjt) it.next(), iIndexOf);
                    iIndexOf++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzd(zzfjt zzfjtVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzk(zzfjtVar, j, null, true);
    }

    public final void zze(zzfjt zzfjtVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzk(zzfjtVar, j, zzeVar, false);
    }

    public final zzdby zzf() {
        return new zzdby(this.zze, "", this, this.zzd, this.zzc);
    }

    public final com.google.android.gms.ads.internal.client.zzv zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zza;
    }

    public final void zzi(zzfjt zzfjtVar) {
        Map map = this.zzb;
        Object obj = map.get(zzl(zzfjtVar));
        List list = this.zza;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.zzf);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.zzf = (com.google.android.gms.ads.internal.client.zzv) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) list.get(iIndexOf);
            zzvVar.zzb = 0L;
            zzvVar.zzc = null;
        }
    }
}
