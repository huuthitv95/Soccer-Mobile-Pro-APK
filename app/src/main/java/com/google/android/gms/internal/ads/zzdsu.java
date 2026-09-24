package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzdsu implements zzgsn {
    static final /* synthetic */ zzdsu zza = new zzdsu();

    private /* synthetic */ zzdsu() {
    }

    @Override // com.google.android.gms.internal.ads.zzgsn
    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzdss zzdssVar : (List) obj) {
            if (zzdssVar != null) {
                arrayList.add(zzdssVar);
            }
        }
        return arrayList;
    }
}
