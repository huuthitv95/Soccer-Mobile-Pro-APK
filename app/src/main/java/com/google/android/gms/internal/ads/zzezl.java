package com.google.android.gms.internal.ads;

import android.content.Intent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzezl implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzezl(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzezl zzc(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzezl(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzezj zzb() {
        return new zzezj(((zzcng) this.zza).zza(), (Intent) this.zzb.zzb());
    }
}
