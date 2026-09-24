package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhzb implements zzhdv {
    private final byte[] zza;

    private zzhzb(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!zzhkh.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        byte[] bArrZzb = zzhks.zzb(bArr);
        this.zza = bArrZzb;
        zzhks.zza(bArrZzb);
    }

    public static zzhdv zzb(zzhuu zzhuuVar) throws GeneralSecurityException {
        if (!zzhkh.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return zzhxu.zzb(zzhuuVar);
        } catch (GeneralSecurityException unused) {
            return new zzhzb(zzhuuVar.zzf().zzc(zzhda.zza()), zzhuuVar.zze().zze().zzc(), zzhuuVar.zzd().zzc().equals(zzhus.zzc) ? new byte[]{0} : new byte[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdv
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
