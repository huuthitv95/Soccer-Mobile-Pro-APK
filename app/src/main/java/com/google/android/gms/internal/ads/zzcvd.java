package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcvd implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;
    private final zzimr zzd;
    private final zzimr zze;
    private final zzimr zzf;
    private final zzimr zzg;
    private final zzimr zzh;
    private final zzimr zzi;
    private final zzimr zzj;

    private zzcvd(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5, zzimr zzimrVar6, zzimr zzimrVar7, zzimr zzimrVar8, zzimr zzimrVar9, zzimr zzimrVar10) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
        this.zzd = zzimrVar4;
        this.zze = zzimrVar5;
        this.zzf = zzimrVar6;
        this.zzg = zzimrVar7;
        this.zzh = zzimrVar8;
        this.zzi = zzimrVar9;
        this.zzj = zzimrVar10;
    }

    public static zzcvd zzc(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5, zzimr zzimrVar6, zzimr zzimrVar7, zzimr zzimrVar8, zzimr zzimrVar9, zzimr zzimrVar10) {
        return new zzcvd(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4, zzimrVar5, zzimrVar6, zzimrVar7, zzimrVar8, zzimrVar9, zzimrVar10);
    }

    public static zzcvc zzd(zzcxg zzcxgVar, Context context, zzfju zzfjuVar, View view, zzcki zzckiVar, zzcxf zzcxfVar, zzdpr zzdprVar, zzdko zzdkoVar, zzimc zzimcVar, Executor executor) {
        return new zzcvc(zzcxgVar, context, zzfjuVar, view, zzckiVar, zzcxfVar, zzdprVar, zzdkoVar, zzimcVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcvc zzb() {
        return new zzcvc(((zzczo) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcvj) this.zzc).zza(), ((zzcvi) this.zzd).zza(), ((zzcvx) this.zze).zza(), ((zzcvk) this.zzf).zza(), ((zzdno) this.zzg).zza(), (zzdko) this.zzh.zzb(), zzimh.zzc(this.zzi), (Executor) this.zzj.zzb());
    }
}
