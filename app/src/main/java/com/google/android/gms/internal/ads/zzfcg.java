package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfcg implements zzimi {
    private final zzimr zza;

    private zzfcg(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
    }

    public static zzfcg zzc(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzfcg(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfce zzb() {
        return new zzfce(((zzcng) this.zza).zza(), zzfno.zzc());
    }
}
