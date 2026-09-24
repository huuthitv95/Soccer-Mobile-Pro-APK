package com.google.android.gms.ads.nonagon.devicetier;

import com.google.android.gms.internal.ads.zzcng;
import com.google.android.gms.internal.ads.zzimi;
import com.google.android.gms.internal.ads.zzimr;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zza implements zzimi {
    private final zzimr zza;

    private zza(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zza zza(zzimr zzimrVar) {
        return new zza(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new DeviceTierManager(((zzcng) this.zza).zza());
    }
}
