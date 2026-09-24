package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfhc implements zzgsn {
    final /* synthetic */ zzfhg zza;

    zzfhc(zzfhg zzfhgVar) {
        Objects.requireNonNull(zzfhgVar);
        this.zza = zzfhgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgsn
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", (zzegf) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzfhg zzfhgVar = this.zza;
        zzfhgVar.zzd(new zzfhe(null, zzfhgVar.zzb(), null));
        return zzfhgVar.zzc();
    }
}
