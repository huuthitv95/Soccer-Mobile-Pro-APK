package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgkg implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzgkg(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzgkg zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzgkg(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbdh zzbdhVarZzb = zzfxn.zzb((Context) this.zza.zzb(), (zzfwq) this.zzb.zzb());
        zzimq.zzb(zzbdhVarZzb);
        return zzbdhVarZzb;
    }
}
