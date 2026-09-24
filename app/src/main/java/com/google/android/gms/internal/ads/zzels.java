package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzels implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;
    private final zzimr zzd;
    private final zzimr zze;
    private final zzimr zzf;
    private final zzimr zzg;
    private final zzimr zzh;
    private final zzimr zzi;

    private zzels(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5, zzimr zzimrVar6, zzimr zzimrVar7, zzimr zzimrVar8, zzimr zzimrVar9, zzimr zzimrVar10) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
        this.zzd = zzimrVar4;
        this.zze = zzimrVar5;
        this.zzf = zzimrVar6;
        this.zzg = zzimrVar8;
        this.zzh = zzimrVar9;
        this.zzi = zzimrVar10;
    }

    public static zzels zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5, zzimr zzimrVar6, zzimr zzimrVar7, zzimr zzimrVar8, zzimr zzimrVar9, zzimr zzimrVar10) {
        return new zzels(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4, zzimrVar5, zzimrVar6, zzimrVar7, zzimrVar8, zzimrVar9, zzimrVar10);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzelr((zzcun) this.zza.zzb(), (Context) this.zzb.zzb(), (Executor) this.zzc.zzb(), (zzdvw) this.zzd.zzb(), ((zzdbw) this.zze).zza(), ((zzcnw) this.zzf).zza(), new zzbph(), (zzekf) this.zzg.zzb(), (zzdyu) this.zzh.zzb(), (zzdyz) this.zzi.zzb());
    }
}
