package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzafe {
    private final Map zza = new LinkedHashMap();

    public final void zza(zzafd zzafdVar) {
        long[] jArr = zzafdVar.zze;
        if (jArr.length > 0) {
            Map map = this.zza;
            if (map.containsKey(Long.valueOf(jArr[0]))) {
                return;
            }
            map.put(Long.valueOf(jArr[0]), zzafdVar);
        }
    }

    public final zzafd zzb() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (zzafd zzafdVar : this.zza.values()) {
            arrayList.add(zzafdVar.zzb);
            arrayList2.add(zzafdVar.zzc);
            arrayList3.add(zzafdVar.zzd);
            arrayList4.add(zzafdVar.zze);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int i = (int) length;
        zzgsw.zze(length == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", length);
        int[] iArr3 = new int[i];
        int i2 = 0;
        for (int[] iArr4 : iArr) {
            int length2 = iArr4.length;
            System.arraycopy(iArr4, 0, iArr3, i2, length2);
            i2 += length2;
        }
        return new zzafd(iArr3, zzgzw.zza((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), zzgzw.zza((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), zzgzw.zza((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }
}
