package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbkw {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    static zzbku zza() {
        return (zzbku) zza.get();
    }

    static zzbkv zzb() {
        return (zzbkv) zzb.get();
    }

    public static void zzc(zzbku zzbkuVar) {
        zza.set(zzbkuVar);
    }
}
