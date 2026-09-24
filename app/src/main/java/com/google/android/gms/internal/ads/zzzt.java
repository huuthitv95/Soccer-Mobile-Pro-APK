package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzzt implements Comparator {
    static final /* synthetic */ zzzt zza = new zzzt();

    private /* synthetic */ zzzt() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        List list = (List) obj2;
        List list2 = (List) obj;
        return zzgvm.zzg().zza((zzaap) Collections.max(list2, zzaao.zza), (zzaap) Collections.max(list, zzaaj.zza), zzaak.zza).zzb(list2.size(), list.size()).zza((zzaap) Collections.max(list2, zzaal.zza), (zzaap) Collections.max(list, zzaam.zza), zzaan.zza).zze();
    }
}
