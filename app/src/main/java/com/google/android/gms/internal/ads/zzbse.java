package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbse implements zzbpe {
    final /* synthetic */ zzbsl zza;
    private final zzbpe zzb;

    public zzbse(zzbsl zzbslVar, zzbpe zzbpeVar) {
        Objects.requireNonNull(zzbslVar);
        this.zza = zzbslVar;
        this.zzb = zzbpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        this.zzb.zza(this.zza, map);
    }

    final /* synthetic */ zzbpe zzb() {
        return this.zzb;
    }
}
