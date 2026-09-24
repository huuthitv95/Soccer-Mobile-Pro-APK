package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbif {
    static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbjo.zzd("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzbkb.zza);
        zzc(arrayList, zzbkb.zzb);
        zzc(arrayList, zzbkb.zzc);
        zzc(arrayList, zzbkb.zzd);
        zzc(arrayList, zzbkb.zze);
        zzc(arrayList, zzbkb.zzu);
        zzc(arrayList, zzbkb.zzf);
        zzc(arrayList, zzbkb.zzm);
        zzc(arrayList, zzbkb.zzn);
        zzc(arrayList, zzbkb.zzo);
        zzc(arrayList, zzbkb.zzp);
        zzc(arrayList, zzbkb.zzq);
        zzc(arrayList, zzbkb.zzr);
        zzc(arrayList, zzbkb.zzs);
        zzc(arrayList, zzbkb.zzt);
        zzc(arrayList, zzbkb.zzg);
        zzc(arrayList, zzbkb.zzh);
        zzc(arrayList, zzbkb.zzi);
        zzc(arrayList, zzbkb.zzj);
        zzc(arrayList, zzbkb.zzk);
        zzc(arrayList, zzbkb.zzl);
        return arrayList;
    }

    static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbkq.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbjo zzbjoVar) {
        String str = (String) zzbjoVar.zze();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
