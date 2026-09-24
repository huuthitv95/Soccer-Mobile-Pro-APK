package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgmp implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;
    private final zzimr zzd;
    private final zzimr zze;
    private final zzimr zzf;
    private final zzimr zzg;
    private final zzimr zzh;
    private final zzimr zzi;

    private zzgmp(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5, zzimr zzimrVar6, zzimr zzimrVar7, zzimr zzimrVar8, zzimr zzimrVar9) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
        this.zzd = zzimrVar4;
        this.zze = zzimrVar5;
        this.zzf = zzimrVar6;
        this.zzg = zzimrVar7;
        this.zzh = zzimrVar8;
        this.zzi = zzimrVar9;
    }

    public static zzgmp zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5, zzimr zzimrVar6, zzimr zzimrVar7, zzimr zzimrVar8, zzimr zzimrVar9) {
        return new zzgmp(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4, zzimrVar5, zzimrVar6, zzimrVar7, zzimrVar8, zzimrVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgmo((zzgec) this.zza.zzb(), (zzgec) this.zzb.zzb(), zzimh.zzc(this.zzc), (zzgec) this.zzd.zzb(), (zzgec) this.zze.zzb(), zzimh.zzc(this.zzf), (File) this.zzg.zzb(), (ExecutorService) this.zzh.zzb(), (zzgpu) this.zzi.zzb());
    }
}
