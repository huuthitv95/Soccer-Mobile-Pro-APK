package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgdx implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzgdx(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzgdx zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzgdx(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgdw((Executor) this.zza.zzb(), (zzgbx) this.zzb.zzb());
    }
}
