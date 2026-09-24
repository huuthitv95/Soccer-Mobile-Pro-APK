package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdxk implements zzimi {
    private final zzimr zza;

    private zzdxk(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar2;
    }

    public static zzdxk zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzdxk(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzhbs zzhbsVarZzc = zzfno.zzc();
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzge)).booleanValue() ? Collections.singleton(new zzdke(((zzdyd) this.zza).zzb(), zzhbsVarZzc)) : Collections.EMPTY_SET;
        zzimq.zzb(setSingleton);
        return setSingleton;
    }
}
