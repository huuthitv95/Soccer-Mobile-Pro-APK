package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfae implements zzimi {
    private final zzimr zza;

    private zzfae(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar2;
    }

    public static zzfae zzc(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzfae(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfac zzb() {
        return new zzfac(zzfno.zzc(), ((zzcng) this.zza).zza());
    }
}
