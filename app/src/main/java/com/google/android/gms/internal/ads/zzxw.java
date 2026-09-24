package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzxw extends zzage {
    final /* synthetic */ zzyi zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzxw(zzyi zzyiVar, zzags zzagsVar) {
        super(zzagsVar);
        Objects.requireNonNull(zzyiVar);
        this.zza = zzyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzage, com.google.android.gms.internal.ads.zzags
    public final long zza() {
        return this.zza.zzQ();
    }
}
