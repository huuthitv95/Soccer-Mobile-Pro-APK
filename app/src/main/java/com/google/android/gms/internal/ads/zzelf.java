package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzelf implements zzimi {
    private final zzimr zza;

    private zzelf(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzelf zzc(zzimr zzimrVar) {
        return new zzelf(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzele zzb() {
        return new zzele(((zzcng) this.zza).zza());
    }
}
