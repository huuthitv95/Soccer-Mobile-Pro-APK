package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfpb implements zzimi {
    private final zzimr zza;

    private zzfpb(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzfpb zzc(zzimr zzimrVar) {
        return new zzfpb(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfox zzb() {
        return new zzfox(((zzimu) this.zza).zzb());
    }
}
