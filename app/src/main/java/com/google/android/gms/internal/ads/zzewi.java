package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzewi implements zzimi {
    private final zzimr zza;

    private zzewi(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzewi zzc(zzimr zzimrVar) {
        return new zzewi(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzewh zzb() {
        return new zzewh((zzfgs) this.zza.zzb());
    }
}
