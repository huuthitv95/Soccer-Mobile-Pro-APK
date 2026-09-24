package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdoj implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzdoj(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzdoj zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzdoj(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdkg((Context) this.zza.zzb(), new HashSet(), ((zzcxy) this.zzb).zza());
    }
}
