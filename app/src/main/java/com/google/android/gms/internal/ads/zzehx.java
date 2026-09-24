package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzehx implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;
    private final zzimr zzd;
    private final zzimr zze;

    private zzehx(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5, zzimr zzimrVar6, zzimr zzimrVar7, zzimr zzimrVar8) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar4;
        this.zzc = zzimrVar5;
        this.zzd = zzimrVar6;
        this.zze = zzimrVar8;
    }

    public static zzehx zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5, zzimr zzimrVar6, zzimr zzimrVar7, zzimr zzimrVar8) {
        return new zzehx(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4, zzimrVar5, zzimrVar6, zzimrVar7, zzimrVar8);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzehw(((zzcng) this.zza).zza(), zzfno.zzc(), zzcog.zza(), ((zzcns) this.zzb).zzb(), ((zzeif) this.zzc).zzb(), (ArrayDeque) this.zzd.zzb(), zzcod.zza(), (zzfpv) this.zze.zzb());
    }
}
