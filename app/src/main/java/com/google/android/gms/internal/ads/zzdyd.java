package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdyd implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzdyd(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzdyd zzc(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzdyd(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdyc zzb() {
        return new zzdyc((zzbhd) this.zza.zzb(), ((zzimm) this.zzb).zzb());
    }
}
