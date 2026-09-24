package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeye implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;

    private zzeye(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        this.zza = zzimrVar2;
        this.zzb = zzimrVar3;
        this.zzc = zzimrVar4;
    }

    public static zzeye zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        return new zzeye(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfak zzfakVar;
        zzezr zzezrVarZzc = zzezt.zzc();
        zzewm zzewmVar = (zzewm) this.zza.zzb();
        List list = (List) this.zzb.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (list.contains("24")) {
            zzfakVar = new zzfak(zzewmVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznE)).intValue(), scheduledExecutorService);
        } else {
            zzfakVar = new zzfak(zzezrVarZzc, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznE)).intValue(), scheduledExecutorService);
        }
        return zzfakVar;
    }
}
