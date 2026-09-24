package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzdbk;
import com.google.android.gms.internal.ads.zzdbl;
import com.google.android.gms.internal.ads.zzdlb;
import com.google.android.gms.internal.ads.zzfof;
import com.google.android.gms.internal.ads.zzfos;
import com.google.android.gms.internal.ads.zzfoy;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzimi;
import com.google.android.gms.internal.ads.zzimr;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzay implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;
    private final zzimr zzd;

    private zzay(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
        this.zzd = zzimrVar4;
    }

    public static zzay zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        return new zzay(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfoy zzfoyVar = (zzfoy) this.zza.zzb();
        zzba zzbaVarZzb = ((zzbb) this.zzb).zzb();
        zzdbk zzdbkVarZzb = ((zzdbl) this.zzc).zzb();
        zzdlb zzdlbVar = (zzdlb) this.zzd.zzb();
        zzfof zzfofVarZzi = zzfoyVar.zza(zzfos.GENERATE_SIGNALS, zzdbkVarZzb.zzb()).zzc(zzbaVarZzb).zzh(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgD)).intValue(), TimeUnit.SECONDS).zzi();
        zzhbi.zzr(zzfofVarZzi, new zzar(zzdlbVar), zzcff.zza);
        return zzfofVarZzi;
    }
}
