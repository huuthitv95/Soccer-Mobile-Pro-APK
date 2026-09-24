package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfpd implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;

    private zzfpd(zzfpc zzfpcVar, zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
    }

    public static zzfpd zza(zzfpc zzfpcVar, zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        return new zzfpd(zzfpcVar, zzimrVar, zzimrVar2, zzimrVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbtw zzbtwVarZzb = new zzbtn().zzb(((zzcng) this.zza).zza(), ((zzcnw) this.zzb).zza(), (zzfpv) this.zzc.zzb());
        zzimq.zzb(zzbtwVarZzb);
        return zzbtwVarZzb;
    }
}
