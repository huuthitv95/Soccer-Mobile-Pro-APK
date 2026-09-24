package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzemq implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzemq(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzemq zzc(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzemq(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzemp zzb() {
        return new zzemp((Context) this.zza.zzb(), (zzcwe) this.zzb.zzb());
    }
}
