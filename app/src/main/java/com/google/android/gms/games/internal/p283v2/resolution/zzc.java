package com.google.android.gms.games.internal.p283v2.resolution;

import android.content.Intent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzc {
    private final boolean zza;
    private final Intent zzb;

    private zzc(boolean z, Intent intent) {
        this.zza = z;
        this.zzb = intent;
    }

    public static zzc zzb(Intent intent) {
        return new zzc(false, intent);
    }

    public static zzc zzc(Intent intent) {
        return new zzc(true, intent);
    }

    public final Intent zza() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zza;
    }
}
