package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdig implements zzimi {
    private final zzdif zza;
    private final zzimr zzb;

    private zzdig(zzdif zzdifVar, zzimr zzimrVar) {
        this.zza = zzdifVar;
        this.zzb = zzimrVar;
    }

    public static zzdig zza(zzdif zzdifVar, zzimr zzimrVar) {
        return new zzdig(zzdifVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdch zzdchVarZzp = this.zza.zzp(((zzimu) this.zzb).zzb());
        zzimq.zzb(zzdchVarZzp);
        return zzdchVarZzp;
    }
}
