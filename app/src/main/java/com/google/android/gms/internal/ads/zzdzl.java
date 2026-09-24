package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdzl implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzdzl(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzdzl zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzdzl(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdzk((String) this.zza.zzb(), (zzdze) this.zzb.zzb());
    }
}
