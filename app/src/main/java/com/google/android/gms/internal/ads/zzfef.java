package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfef implements zzimi {
    private final zzfed zza;

    private zzfef(zzfed zzfedVar) {
        this.zza = zzfedVar;
    }

    public static zzfef zzc(zzfed zzfedVar) {
        return new zzfef(zzfedVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Integer zzb() {
        return Integer.valueOf(this.zza.zzf());
    }
}
