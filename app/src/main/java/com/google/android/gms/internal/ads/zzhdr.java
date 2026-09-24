package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhdr {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzhdq zza(String str) throws GeneralSecurityException {
        for (zzhdq zzhdqVar : zza) {
            if (zzhdqVar.zza()) {
                return zzhdqVar;
            }
        }
        String.valueOf(str);
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
