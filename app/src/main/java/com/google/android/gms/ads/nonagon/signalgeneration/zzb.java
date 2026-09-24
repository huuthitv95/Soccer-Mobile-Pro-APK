package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcng;
import com.google.android.gms.internal.ads.zzcnw;
import com.google.android.gms.internal.ads.zzcqp;
import com.google.android.gms.internal.ads.zzexf;
import com.google.android.gms.internal.ads.zzimi;
import com.google.android.gms.internal.ads.zzimr;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzb implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzb(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar4;
    }

    public static zzb zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        return new zzb(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zza(((zzcng) this.zza).zza(), zzcqp.zza(), zzexf.zzc(), ((zzcnw) this.zzb).zza());
    }
}
