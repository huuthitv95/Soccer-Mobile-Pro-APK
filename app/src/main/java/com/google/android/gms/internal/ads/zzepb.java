package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzepb implements zzimi {
    private final zzepa zza;
    private final zzimr zzb;
    private final zzimr zzc;
    private final zzimr zzd;
    private final zzimr zze;

    private zzepb(zzepa zzepaVar, zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        this.zza = zzepaVar;
        this.zzb = zzimrVar;
        this.zzc = zzimrVar2;
        this.zzd = zzimrVar3;
        this.zze = zzimrVar4;
    }

    public static zzepb zza(zzepa zzepaVar, zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        return new zzepb(zzepaVar, zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return this.zza.zzb((Clock) this.zzb.zzb(), ((zzeou) this.zzc).zzb(), (zzell) this.zzd.zzb(), (zzfro) this.zze.zzb());
    }
}
