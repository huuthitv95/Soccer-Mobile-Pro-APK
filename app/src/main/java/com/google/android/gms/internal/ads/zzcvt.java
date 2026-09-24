package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcvt implements zzimi {
    private final zzimr zza;

    private zzcvt(zzcvg zzcvgVar, zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzcvt zza(zzcvg zzcvgVar, zzimr zzimrVar) {
        return new zzcvt(zzcvgVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdke((zzcww) this.zza.zzb(), zzcff.zzh));
        zzimq.zzb(setSingleton);
        return setSingleton;
    }
}
