package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzddw implements zzimi {
    private final zzimr zza;

    private zzddw(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzddw zzc(zzimr zzimrVar) {
        return new zzddw(zzimrVar);
    }

    public static zzddv zzd(Set set) {
        return new zzddv(set);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzddv zzb() {
        return new zzddv(((zzimu) this.zza).zzb());
    }
}
