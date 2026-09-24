package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhyp implements zzhdw {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};
    private final RSAPublicKey zzc;
    private final String zzd;
    private final PSSParameterSpec zze;
    private final byte[] zzf;
    private final byte[] zzg;
    private final Provider zzh;

    private zzhyp(RSAPublicKey rSAPublicKey, zzhwp zzhwpVar, zzhwp zzhwpVar2, int i, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhkh.zza(2)) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!zzhwpVar.equals(zzhwpVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        zziak.zzc(rSAPublicKey.getModulus().bitLength());
        zziak.zzd(rSAPublicKey.getPublicExponent());
        this.zzc = rSAPublicKey;
        this.zzd = zzc(zzhwpVar);
        this.zze = zzd(zzhwpVar, zzhwpVar2, i);
        this.zzf = bArr;
        this.zzg = bArr2;
        this.zzh = provider;
    }

    @Nullable
    static Provider zzb() {
        if (!zzhnq.zzc() || zzhnq.zzd().intValue() > 23) {
            return zzhkl.zza();
        }
        return null;
    }

    static String zzc(zzhwp zzhwpVar) {
        if (zzhwpVar == zzhwp.zza) {
            return "SHA256withRSA/PSS";
        }
        if (zzhwpVar == zzhwp.zzb) {
            return "SHA384withRSA/PSS";
        }
        if (zzhwpVar == zzhwp.zzc) {
            return "SHA512withRSA/PSS";
        }
        String strValueOf = String.valueOf(zzhwpVar);
        String.valueOf(strValueOf);
        throw new IllegalArgumentException("Unsupported hash: ".concat(String.valueOf(strValueOf)));
    }

    static PSSParameterSpec zzd(zzhwp zzhwpVar, zzhwp zzhwpVar2, int i) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        zzhwp zzhwpVar3 = zzhwp.zza;
        if (zzhwpVar == zzhwpVar3) {
            str = "SHA-256";
        } else if (zzhwpVar == zzhwp.zzb) {
            str = "SHA-384";
        } else {
            if (zzhwpVar != zzhwp.zzc) {
                String strValueOf = String.valueOf(zzhwpVar);
                String.valueOf(strValueOf);
                throw new IllegalArgumentException("Unsupported MD hash: ".concat(String.valueOf(strValueOf)));
            }
            str = "SHA-512";
        }
        if (zzhwpVar2 == zzhwpVar3) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (zzhwpVar2 == zzhwp.zzb) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (zzhwpVar2 != zzhwp.zzc) {
                String strValueOf2 = String.valueOf(zzhwpVar2);
                String.valueOf(strValueOf2);
                throw new IllegalArgumentException("Unsupported MGF1 hash: ".concat(String.valueOf(strValueOf2)));
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i, 1);
    }

    public static zzhdw zze(zzhwv zzhwvVar) throws GeneralSecurityException {
        Provider providerZzb = zzb();
        if (providerZzb == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA", providerZzb).generatePublic(new RSAPublicKeySpec(zzhwvVar.zzd(), zzhwvVar.zzf().zzd()));
        zzhwr zzhwrVarZzf = zzhwvVar.zzf();
        return new zzhyp(rSAPublicKey, zzhwrVarZzf.zzf(), zzhwrVarZzf.zzg(), zzhwrVarZzf.zzh(), zzhwvVar.zze().zzc(), zzhwvVar.zzf().zze().equals(zzhwq.zzc) ? zzb : zza, providerZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhdw
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzf;
        if (!zzhnq.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str = this.zzd;
        Provider provider = this.zzh;
        RSAPublicKey rSAPublicKey = this.zzc;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.setParameter(this.zze);
        signature.update(bArr2);
        byte[] bArr4 = this.zzg;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (!signature.verify(bArr, length2, length - length2)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }
}
