package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdbl implements zzimi {
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
    private final zzimr zzk;

    private zzdbl(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5, zzimr zzimrVar6, zzimr zzimrVar7, zzimr zzimrVar8, zzimr zzimrVar9, zzimr zzimrVar10, zzimr zzimrVar11, zzimr zzimrVar12) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
        this.zzd = zzimrVar4;
        this.zze = zzimrVar6;
        this.zzf = zzimrVar7;
        this.zzg = zzimrVar8;
        this.zzh = zzimrVar9;
        this.zzi = zzimrVar10;
        this.zzj = zzimrVar11;
        this.zzk = zzimrVar12;
    }

    public static zzdbl zzc(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5, zzimr zzimrVar6, zzimr zzimrVar7, zzimr zzimrVar8, zzimr zzimrVar9, zzimr zzimrVar10, zzimr zzimrVar11, zzimr zzimrVar12) {
        return new zzdbl(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4, zzimrVar5, zzimrVar6, zzimrVar7, zzimrVar8, zzimrVar9, zzimrVar10, zzimrVar11, zzimrVar12);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdbk zzb() {
        return new zzdbk((zzfoy) this.zza.zzb(), ((zzcnw) this.zzb).zza(), (ApplicationInfo) this.zzc.zzb(), ((zzeem) this.zzd).zzb(), zzexf.zzc(), (PackageInfo) this.zze.zzb(), zzimh.zzc(this.zzf), ((zzcna) this.zzg).zzb(), (String) this.zzh.zzb(), ((zzfcc) this.zzi).zzb(), ((zzdbw) this.zzj).zza(), (zzdhy) this.zzk.zzb());
    }
}
