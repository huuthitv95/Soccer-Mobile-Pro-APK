package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbos implements zzbpe {
    zzbos() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcki zzckiVar = (zzcki) obj;
        if (map.containsKey("start")) {
            zzckiVar.zzas(true);
        }
        if (map.containsKey("stop")) {
            zzckiVar.zzas(false);
        }
    }
}
