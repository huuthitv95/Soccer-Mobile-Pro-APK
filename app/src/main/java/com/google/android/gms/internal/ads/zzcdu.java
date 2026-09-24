package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcdu implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzcdu(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzcdu zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzcdu(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcdt((Context) this.zza.zzb(), ((zzcdh) this.zzb).zzb());
    }
}
