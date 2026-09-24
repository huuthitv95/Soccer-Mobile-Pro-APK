package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzecj implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzecj(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzecj zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzecj(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzecq(((zzcng) this.zza).zza(), ((zzcnw) this.zzb).zza());
    }
}
