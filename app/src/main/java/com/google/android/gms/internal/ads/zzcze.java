package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcze implements zzimi {
    private final zzimr zza;

    private zzcze(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
    }

    public static zzcze zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzcze(zzimrVar, zzimrVar2);
    }

    public static zzdke zzc(zzctj zzctjVar, Executor executor) {
        return new zzdke(zzctjVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc((zzctj) this.zza.zzb(), zzfno.zzc());
    }
}
