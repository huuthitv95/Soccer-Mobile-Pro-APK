package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhlg {
    private static final Logger zza = Logger.getLogger(zzhlg.class.getName());
    private static final zzhlg zzd = new zzhlg();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    public static zzhlg zza() {
        return zzd;
    }

    private final synchronized zzhdd zzg(String str) throws GeneralSecurityException {
        ConcurrentMap concurrentMap;
        concurrentMap = this.zzb;
        if (!concurrentMap.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
            sb.append("No key manager found for key type ");
            sb.append(str);
            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb.toString());
        }
        return (zzhdd) concurrentMap.get(str);
    }

    private final synchronized void zzh(zzhdd zzhddVar, boolean z, boolean z2) throws GeneralSecurityException {
        String strZzb = zzhddVar.zzb();
        if (z2) {
            ConcurrentMap concurrentMap = this.zzc;
            if (concurrentMap.containsKey(strZzb) && !((Boolean) concurrentMap.get(strZzb)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(strZzb));
            }
        }
        ConcurrentMap concurrentMap2 = this.zzb;
        zzhdd zzhddVar2 = (zzhdd) concurrentMap2.get(strZzb);
        if (zzhddVar2 != null && !zzhddVar2.getClass().equals(zzhddVar.getClass())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(strZzb));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strZzb, zzhddVar2.getClass().getName(), zzhddVar.getClass().getName()));
        }
        concurrentMap2.putIfAbsent(strZzb, zzhddVar);
        this.zzc.put(strZzb, Boolean.valueOf(z2));
    }

    public final synchronized void zzb(zzhdd zzhddVar, boolean z) throws GeneralSecurityException {
        zzf(zzhddVar, 1, z);
    }

    public final zzhdd zzc(String str, Class cls) throws GeneralSecurityException {
        zzhdd zzhddVarZzg = zzg(str);
        if (zzhddVarZzg.zzc().equals(cls)) {
            return zzhddVarZzg;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzhddVarZzg.getClass());
        String string = zzhddVarZzg.zzc().toString();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 53 + String.valueOf(strValueOf).length() + 23 + string.length());
        sb.append("Primitive type ");
        sb.append(name);
        sb.append(" not supported by key manager of type ");
        sb.append(strValueOf);
        sb.append(", which only supports: ");
        sb.append(string);
        throw new GeneralSecurityException(sb.toString());
    }

    public final zzhdd zzd(String str) throws GeneralSecurityException {
        return zzg(str);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzc.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzhdd zzhddVar, int i, boolean z) throws GeneralSecurityException {
        if (!zzhkh.zza(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzhddVar, false, z);
    }
}
