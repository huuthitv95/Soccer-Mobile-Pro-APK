package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhar extends zzhat {
    zzhar(zzgvv zzgvvVar, boolean z) {
        super(zzgvvVar, z);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final /* bridge */ /* synthetic */ Object zzD(List list) {
        ArrayList arrayListZzb = zzgwz.zzb(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhas zzhasVar = (zzhas) it.next();
            arrayListZzb.add(zzhasVar != null ? zzhasVar.zza : null);
        }
        return Collections.unmodifiableList(arrayListZzb);
    }
}
