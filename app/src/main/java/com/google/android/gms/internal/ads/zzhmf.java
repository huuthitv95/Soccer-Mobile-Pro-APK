package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhmf {
    private static final zzhmf zzb = new zzhmf();
    private final Map zza = new HashMap();

    zzhmf() {
    }

    public static zzhmf zza() {
        return zzb;
    }

    public final synchronized void zzb(String str, zzhdt zzhdtVar) throws GeneralSecurityException {
        Map map = this.zza;
        if (!map.containsKey(str)) {
            map.put(str, zzhdtVar);
            return;
        }
        if (((zzhdt) map.get(str)).equals(zzhdtVar)) {
            return;
        }
        String strValueOf = String.valueOf(map.get(str));
        String strValueOf2 = String.valueOf(zzhdtVar);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 45 + String.valueOf(strValueOf).length() + 17 + String.valueOf(strValueOf2).length());
        sb.append("Parameters object with name ");
        sb.append(str);
        sb.append(" already exists (");
        sb.append(strValueOf);
        sb.append("), cannot insert ");
        sb.append(strValueOf2);
        throw new GeneralSecurityException(sb.toString());
    }

    public final synchronized zzhdt zzc(String str) throws GeneralSecurityException {
        Map map;
        map = this.zza;
        if (!map.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (zzhdt) map.get("AES128_GCM");
    }

    public final synchronized void zzd(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            zzb((String) entry.getKey(), (zzhdt) entry.getValue());
        }
    }
}
