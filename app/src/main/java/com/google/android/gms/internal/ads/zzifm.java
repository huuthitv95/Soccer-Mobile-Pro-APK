package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzifm {
    private static final zzifm zza = new zzifm();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzifv zzb = new zziet();

    private zzifm() {
    }

    static zzifm zza() {
        return zza;
    }

    final zzifu zzb(Class cls) {
        zziee.zza(cls, "messageType");
        ConcurrentMap concurrentMap = this.zzc;
        zzifu zzifuVarZza = (zzifu) concurrentMap.get(cls);
        if (zzifuVarZza == null) {
            zzifuVarZza = this.zzb.zza(cls);
            zzifu zzifuVar = (zzifu) concurrentMap.putIfAbsent(cls, zzifuVarZza);
            if (zzifuVar != null) {
                return zzifuVar;
            }
        }
        return zzifuVarZza;
    }
}
