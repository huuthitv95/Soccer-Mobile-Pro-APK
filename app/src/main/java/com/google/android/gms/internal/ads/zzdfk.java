package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdfk implements zzimi {
    private final zzimr zza;

    private zzdfk(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdfk zzc(zzimr zzimrVar) {
        return new zzdfk(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdfj zzb() {
        return new zzdfj(((zzimu) this.zza).zzb());
    }
}
