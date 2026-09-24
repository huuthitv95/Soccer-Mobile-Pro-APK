package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzepa {
    private zzeor zza;

    zzepa() {
    }

    private zzepa(zzeor zzeorVar) {
        this.zza = zzeorVar;
    }

    public static zzepa zza(zzeor zzeorVar) {
        return new zzepa(zzeorVar);
    }

    public final zzeor zzb(Clock clock, zzeot zzeotVar, zzell zzellVar, zzfro zzfroVar) {
        zzeor zzeorVar = this.zza;
        return zzeorVar != null ? zzeorVar : new zzeor(clock, zzeotVar, zzellVar, zzfroVar);
    }
}
