package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdzn implements zzimi {
    private final zzimr zza;

    private zzdzn(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdzn zza(zzimr zzimrVar) {
        return new zzdzn(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdzm((Clock) this.zza.zzb());
    }
}
