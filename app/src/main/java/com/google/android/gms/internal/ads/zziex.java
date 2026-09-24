package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zziex {
    zziex() {
    }

    public static final boolean zza(Object obj) {
        return !((zziew) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zziew zziewVarZzc = (zziew) obj;
        zziew zziewVar = (zziew) obj2;
        if (!zziewVar.isEmpty()) {
            if (!zziewVarZzc.zze()) {
                zziewVarZzc = zziewVarZzc.zzc();
            }
            zziewVarZzc.zzb(zziewVar);
        }
        return zziewVarZzc;
    }
}
