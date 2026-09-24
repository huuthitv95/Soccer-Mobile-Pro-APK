package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zziai implements zzhdw {
    static final zzhky zza;
    private static final byte[] zzb;
    private static final byte[] zzc;

    static {
        zzhkx zzhkxVarZza = zzhky.zza();
        zzhkxVarZza.zza(zzhzv.SHA256, zzhwp.zza);
        zzhkxVarZza.zza(zzhzv.SHA384, zzhwp.zzb);
        zzhkxVarZza.zza(zzhzv.SHA512, zzhwp.zzc);
        zza = zzhkxVarZza.zzb();
        zzb = new byte[0];
        zzc = new byte[]{0};
    }

    public static zzhdw zzb(zzhwv zzhwvVar) throws GeneralSecurityException {
        try {
            return zzhyp.zze(zzhwvVar);
        } catch (NoSuchProviderException unused) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) zzhzm.zzf.zzb("RSA")).generatePublic(new RSAPublicKeySpec(zzhwvVar.zzd(), zzhwvVar.zzf().zzd()));
            zzhwr zzhwrVarZzf = zzhwvVar.zzf();
            zzhky zzhkyVar = zza;
            return new zziah(rSAPublicKey, (zzhzv) zzhkyVar.zzb(zzhwrVarZzf.zzf()), (zzhzv) zzhkyVar.zzb(zzhwrVarZzf.zzg()), zzhwrVarZzf.zzh(), zzhwvVar.zze().zzc(), zzhwvVar.zzf().zze().equals(zzhwq.zzc) ? zzc : zzb, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdw
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
