package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcax {
    public final long zza;
    public final zzcav zzb;

    public zzcax(zzcay zzcayVar, zzcav zzcavVar) {
        Objects.requireNonNull(zzcayVar);
        this.zza = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        this.zzb = zzcavVar;
    }
}
