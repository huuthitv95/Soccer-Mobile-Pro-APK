package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzelz implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzelz(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzelz zzc(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzelz(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzely zzb() {
        return new zzely((Context) this.zza.zzb(), (zzcun) this.zzb.zzb());
    }
}
