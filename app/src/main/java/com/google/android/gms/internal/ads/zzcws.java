package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcws implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzcws(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzcws zzc(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzcws(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcwr zzb() {
        return new zzcwr(((zzcvx) this.zza).zza(), (Executor) this.zzb.zzb());
    }
}
