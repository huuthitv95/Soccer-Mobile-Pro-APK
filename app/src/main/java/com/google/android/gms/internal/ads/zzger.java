package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzger implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;
    private final zzimr zzd;
    private final zzimr zze;

    private zzger(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
        this.zzd = zzimrVar4;
        this.zze = zzimrVar5;
    }

    public static zzger zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5) {
        return new zzger(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4, zzimrVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.zza.zzb();
        zzgdu zzgduVar = (zzgdu) this.zzb.zzb();
        ExecutorService executorService = (ExecutorService) this.zzc.zzb();
        zzgdn zzgdnVar = (zzgdn) this.zzd.zzb();
        zzgco zzgcoVar = (zzgco) this.zze.zzb();
        return new zzgez(context, zzgduVar, executorService, zzgdnVar, new Random(), zzgcoVar.zzg().zza(), zzgcoVar.zzg().zzc(), zzgcoVar.zzg().zzd(), zzgcoVar.zzg().zzb(), zzgcoVar.zzd(), zzgcoVar.zzG() - 1);
    }
}
