package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcdh implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzcdh(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzcdh zzc(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzcdh(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcdg zzb() {
        return new zzcdg((Clock) this.zza.zzb(), (zzcde) this.zzb.zzb());
    }
}
