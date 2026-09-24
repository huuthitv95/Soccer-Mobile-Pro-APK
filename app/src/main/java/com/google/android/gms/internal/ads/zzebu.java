package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzebu implements zzimi {
    private final zzimr zza;

    private zzebu(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
    }

    public static zzebu zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzebu(zzimrVar, zzimrVar2);
    }

    public static zzdke zzc(zzebt zzebtVar, Executor executor) {
        return new zzdke(zzebtVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc((zzebt) this.zza.zzb(), zzfno.zzc());
    }
}
