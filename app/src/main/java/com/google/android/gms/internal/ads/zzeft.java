package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeft implements zzimi {
    private final zzimr zza;

    private zzeft(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
    }

    public static zzeft zzc(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzeft(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzefs zzb() {
        return new zzefs(((zzcng) this.zza).zza(), zzfno.zzc());
    }
}
