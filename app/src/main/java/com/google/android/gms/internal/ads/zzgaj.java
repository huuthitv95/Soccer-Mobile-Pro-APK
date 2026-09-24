package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgaj {
    private final zzgaf zza;

    public final /* synthetic */ zzgah zza() {
        zzidr zzidrVarZzbu = this.zza.zzbu();
        Intrinsics.checkNotNullExpressionValue(zzidrVarZzbu, "build(...)");
        return (zzgah) zzidrVarZzbu;
    }

    public final /* synthetic */ zzigx zzb() {
        Map mapZzb = this.zza.zzb();
        Intrinsics.checkNotNullExpressionValue(mapZzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zzigx(mapZzb);
    }

    public final void zzc(zzigx zzigxVar, String key, zzgad value) {
        Intrinsics.checkNotNullParameter(zzigxVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.zza.zzc(key, value);
    }

    public final /* synthetic */ void zzd(zzigx zzigxVar, String key) {
        Intrinsics.checkNotNullParameter(zzigxVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        this.zza.zza(key);
    }
}
