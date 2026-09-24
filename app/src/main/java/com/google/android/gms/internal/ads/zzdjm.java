package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdjm implements zzimi {
    private final zzimr zza;

    private zzdjm(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdjm zzc(zzimr zzimrVar) {
        return new zzdjm(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdjl zzb() {
        return new zzdjl(((zzimu) this.zza).zzb());
    }
}
