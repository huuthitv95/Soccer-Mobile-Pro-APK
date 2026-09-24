package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhzd implements zzhdw {
    public static zzhdw zzb(zzhva zzhvaVar) throws GeneralSecurityException {
        if (!zzhkh.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return zzhxv.zzb(zzhvaVar);
        } catch (GeneralSecurityException unused) {
            return new zzhzc(zzhvaVar.zzd().zzc(), zzhvaVar.zze().zzc(), zzhvaVar.zzf().zzc().equals(zzhus.zzc) ? new byte[]{0} : new byte[0], null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdw
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
