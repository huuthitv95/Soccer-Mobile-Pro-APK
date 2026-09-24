package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbgi implements zzbey {
    final /* synthetic */ zzbgl zza;

    zzbgi(zzbgl zzbglVar) {
        Objects.requireNonNull(zzbglVar);
        this.zza = zzbglVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbey
    public final void zza(boolean z) {
        if (z) {
            this.zza.zzf();
        } else {
            this.zza.zzg();
        }
    }
}
