package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeyo implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;
    private final zzimr zzd;

    private zzeyo(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
        this.zzd = zzimrVar4;
    }

    public static zzeyo zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        return new zzeyo(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfak zzfakVar;
        zzfcn zzfcnVarZzb = ((zzfco) this.zza).zzb();
        zzewm zzewmVar = (zzewm) this.zzb.zzb();
        List list = (List) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        if (list.contains("39")) {
            zzfakVar = new zzfak(zzewmVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznw)).intValue(), scheduledExecutorService);
        } else {
            zzfakVar = new zzfak(zzfcnVarZzb, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznw)).intValue(), scheduledExecutorService);
        }
        return zzfakVar;
    }
}
