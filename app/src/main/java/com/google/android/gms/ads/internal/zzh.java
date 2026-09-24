package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfxo;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzh implements zzfxo {
    final /* synthetic */ zzk zza;

    zzh(zzk zzkVar) {
        Objects.requireNonNull(zzkVar);
        this.zza = zzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final void zza(int i, long j) {
        this.zza.zzo().zzb(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final void zzb(int i, long j, String str) {
        this.zza.zzo().zzf(i, System.currentTimeMillis() - j, str);
    }
}
