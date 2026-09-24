package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaoz implements zzamz {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzaoz(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            zzaop zzaopVar = (zzaop) list.get(i);
            long[] jArr = this.zzb;
            int i2 = i + i;
            jArr[i2] = zzaopVar.zzb;
            jArr[i2 + 1] = zzaopVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final long zzb(int i) {
        zzgsw.zza(i >= 0);
        long[] jArr = this.zzc;
        zzgsw.zza(i < jArr.length);
        return jArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final List zzc(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.zza;
            if (i >= list.size()) {
                break;
            }
            long[] jArr = this.zzb;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                zzaop zzaopVar = (zzaop) list.get(i);
                zzcx zzcxVar = zzaopVar.zza;
                if (zzcxVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzaopVar);
                } else {
                    arrayList.add(zzcxVar);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, zzaoy.zza);
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            zzcw zzcwVarZza = ((zzaop) arrayList2.get(i3)).zza.zza();
            zzcwVarZza.zzf((-1) - i3, 1);
            arrayList.add(zzcwVarZza.zzr());
        }
        return arrayList;
    }
}
