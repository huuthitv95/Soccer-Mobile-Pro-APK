package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgcd implements zzimi {
    private final zzimr zza;

    private zzgcd(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzgcd zza(zzimr zzimrVar) {
        return new zzgcd(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        File dir = ((Context) this.zza.zzb()).getDir("yqzdkcache", 0);
        zzimq.zzb(dir);
        return dir;
    }
}
