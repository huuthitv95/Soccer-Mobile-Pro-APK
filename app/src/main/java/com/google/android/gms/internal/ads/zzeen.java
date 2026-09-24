package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeen implements zzimi {
    private final zzimr zza;

    private zzeen(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
    }

    public static zzeen zzc(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzeen(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzefj zzb() {
        return new zzefj((Context) this.zza.zzb(), zzfno.zzc());
    }
}
