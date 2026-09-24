package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeea implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzeea(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        this.zza = zzimrVar3;
        this.zzb = zzimrVar4;
    }

    public static zzeea zzc(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        return new zzeea(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzedz zzb() {
        return new zzedz(zzfnu.zzc(), zzfno.zzc(), ((zzeen) this.zza).zzb(), zzimh.zzc(this.zzb));
    }
}
