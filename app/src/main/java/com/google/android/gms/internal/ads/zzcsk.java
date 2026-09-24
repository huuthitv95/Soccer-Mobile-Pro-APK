package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcsk implements zzimi {
    private final zzimr zza;

    private zzcsk(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzcsk zza(zzimr zzimrVar) {
        return new zzcsk(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcsj((Context) this.zza.zzb());
    }
}
