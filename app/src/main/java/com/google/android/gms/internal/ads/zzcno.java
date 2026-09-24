package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcno implements zzimi {
    private final zzimr zza;

    private zzcno(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
    }

    public static zzcno zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzcno(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzco)).booleanValue() ? Collections.singleton(new zzdke((zzebm) this.zza.zzb(), zzfno.zzc())) : Collections.EMPTY_SET;
        zzimq.zzb(setSingleton);
        return setSingleton;
    }
}
