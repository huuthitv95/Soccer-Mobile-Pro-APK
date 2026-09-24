package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzhat extends zzhak {
    private List zza;

    zzhat(zzgvv zzgvvVar, boolean z) {
        super(zzgvvVar, z, true);
        List listZzb = zzgvvVar.isEmpty() ? Collections.EMPTY_LIST : zzgwz.zzb(zzgvvVar.size());
        for (int i = 0; i < zzgvvVar.size(); i++) {
            listZzb.add(null);
        }
        this.zza = listZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhak
    final void zzA(int i) {
        super.zzA(i);
        this.zza = null;
    }

    abstract Object zzD(List list);

    @Override // com.google.android.gms.internal.ads.zzhak
    final void zzw(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzhas(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhak
    final void zzx() {
        List list = this.zza;
        if (list != null) {
            zza(zzD(list));
        }
    }
}
