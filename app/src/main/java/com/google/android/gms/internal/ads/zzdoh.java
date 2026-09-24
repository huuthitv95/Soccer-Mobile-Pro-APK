package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdoh implements zzimi {
    private final zzimr zza;

    private zzdoh(zzdod zzdodVar, zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdoh zzc(zzdod zzdodVar, zzimr zzimrVar) {
        return new zzdoh(zzdodVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdpp zzb() {
        zzdob zzdobVar = (zzdob) this.zza.zzb();
        zzimq.zzb(zzdobVar);
        return zzdobVar;
    }
}
