package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeya implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzeya(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzeya zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzeya(zzimrVar, zzimrVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0036  */
    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgwj zzgwjVarZzh;
        zzeyy zzeyyVarZzb = ((zzeza) this.zza).zzb();
        Context contextZza = ((zzcng) this.zzb).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmL)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzE(contextZza)) {
                zzgwjVarZzh = zzgwj.zzi(zzeyyVarZzb);
            } else {
                zzgwjVarZzh = zzgwj.zzh();
            }
        } else {
            zzgwjVarZzh = zzgwj.zzh();
        }
        zzimq.zzb(zzgwjVarZzh);
        return zzgwjVarZzh;
    }
}
