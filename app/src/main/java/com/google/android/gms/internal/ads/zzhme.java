package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhme {
    private static final zzhme zza = new zzhme();
    private static final zzhmd zzb = new zzhmd(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzhme zza() {
        return zza;
    }

    public final zzhlw zzb() {
        zzhlw zzhlwVar = (zzhlw) this.zzc.get();
        return zzhlwVar == null ? zzb : zzhlwVar;
    }
}
