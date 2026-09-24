package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzewb implements zzimi {
    private final zzimr zza;

    private zzewb(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzewb zzc(zzimr zzimrVar) {
        return new zzewb(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzevz zzb() {
        return new zzevz(((zzdbw) this.zza).zza());
    }
}
