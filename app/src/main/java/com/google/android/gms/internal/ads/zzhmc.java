package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhmc {
    private static final zzhmc zzb = new zzhmc();
    private final Map zza = new HashMap();

    public static zzhmc zza() {
        return zzb;
    }

    public final synchronized void zzb(zzhmb zzhmbVar, Class cls) throws GeneralSecurityException {
        Map map = this.zza;
        zzhmb zzhmbVar2 = (zzhmb) map.get(cls);
        if (zzhmbVar2 != null && !zzhmbVar2.equals(zzhmbVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
        map.put(cls, zzhmbVar);
    }
}
