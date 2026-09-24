package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcng;
import com.google.android.gms.internal.ads.zzimi;
import com.google.android.gms.internal.ads.zzimr;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzca implements zzimi {
    private final zzimr zza;

    private zzca(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzca zza(zzimr zzimrVar) {
        return new zzca(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbz(((zzcng) this.zza).zza());
    }
}
