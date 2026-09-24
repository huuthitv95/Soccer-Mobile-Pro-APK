package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdmf implements zzimi {
    private final zzdlr zza;
    private final zzimr zzb;

    private zzdmf(zzdlr zzdlrVar, zzimr zzimrVar) {
        this.zza = zzdlrVar;
        this.zzb = zzimrVar;
    }

    public static zzdmf zza(zzdlr zzdlrVar, zzimr zzimrVar) {
        return new zzdmf(zzdlrVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZze = this.zza.zze((zzday) this.zzb.zzb());
        zzimq.zzb(setZze);
        return setZze;
    }
}
