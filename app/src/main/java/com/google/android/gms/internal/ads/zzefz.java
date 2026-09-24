package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzefz implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzefz(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzefz zzc(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzefz(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzefy zzb() {
        return new zzefy(((zzcng) this.zza).zza(), (zzcdn) this.zzb.zzb());
    }
}
