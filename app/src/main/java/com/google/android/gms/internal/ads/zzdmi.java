package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdmi implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzdmi(zzdlr zzdlrVar, zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzdmi zzc(zzdlr zzdlrVar, zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzdmi(zzdlrVar, zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcdk zzb() {
        return new zzcdk(((zzcng) this.zza).zza(), ((zzdbw) this.zzb).zza().zzg);
    }
}
