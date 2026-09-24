package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhyo implements zzhdv {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    private zzhyo(RSAPrivateCrtKey rSAPrivateCrtKey, zzhwp zzhwpVar, zzhwp zzhwpVar2, int i, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhkh.zza(2)) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zziak.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        zziak.zzd(rSAPrivateCrtKey.getPublicExponent());
        zzhyp.zzc(zzhwpVar);
        zzhyp.zzd(zzhwpVar, zzhwpVar2, i);
    }

    public static zzhdv zzb(zzhwt zzhwtVar) throws GeneralSecurityException {
        Provider providerZzb = zzhyp.zzb();
        if (providerZzb == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerZzb);
        zzhwr zzhwrVarZzd = zzhwtVar.zzd();
        return new zzhyo((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(zzhwtVar.zze().zzd(), zzhwrVarZzd.zzd(), zzhwtVar.zzi().zzb(zzhda.zza()), zzhwtVar.zzf().zzb(zzhda.zza()), zzhwtVar.zzh().zzb(zzhda.zza()), zzhwtVar.zzj().zzb(zzhda.zza()), zzhwtVar.zzk().zzb(zzhda.zza()), zzhwtVar.zzl().zzb(zzhda.zza()))), zzhwrVarZzd.zzf(), zzhwrVarZzd.zzg(), zzhwrVarZzd.zzh(), zzhwtVar.zze().zze().zzc(), zzhwrVarZzd.zze().equals(zzhwq.zzc) ? zzb : zza, providerZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhdv
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
