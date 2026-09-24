package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhzz implements zzhps {
    public static zzhps zzb(zzhpq zzhpqVar) throws GeneralSecurityException {
        zzhps zzhpsVarZzb = zzhpw.zzb(zzhpqVar);
        try {
            return new zzhzy(zzhpsVarZzb, zzhpx.zzb(zzhpqVar), null);
        } catch (GeneralSecurityException unused) {
            return zzhpsVarZzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhps
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        throw null;
    }
}
