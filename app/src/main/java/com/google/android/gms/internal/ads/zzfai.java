package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfai implements zzimi {
    private final zzimr zza;

    private zzfai(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar2;
    }

    public static zzfai zzc(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzfai(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfag zzb() {
        return new zzfag(zzfno.zzc(), (zzeac) this.zza.zzb());
    }
}
