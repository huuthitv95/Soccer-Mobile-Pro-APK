package com.google.android.gms.internal.ads;

import com.facebook.internal.security.OidcSecurityUtil;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhyg implements zzhdw {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};
    private final RSAPublicKey zzc;
    private final String zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private final Provider zzg;

    private zzhyg(RSAPublicKey rSAPublicKey, zzhwd zzhwdVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhkh.zza(2)) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        zziak.zzc(rSAPublicKey.getModulus().bitLength());
        zziak.zzd(rSAPublicKey.getPublicExponent());
        this.zzc = rSAPublicKey;
        this.zzd = zzc(zzhwdVar);
        this.zze = bArr;
        this.zzf = bArr2;
        this.zzg = provider;
    }

    @Nullable
    static Provider zzb() {
        if (zzhnq.zzc()) {
            zzhnq.zzd().intValue();
        }
        return zzhkl.zza();
    }

    public static String zzc(zzhwd zzhwdVar) throws GeneralSecurityException {
        if (zzhwdVar == zzhwd.zza) {
            return OidcSecurityUtil.SIGNATURE_ALGORITHM_SHA256;
        }
        if (zzhwdVar == zzhwd.zzb) {
            return "SHA384withRSA";
        }
        if (zzhwdVar == zzhwd.zzc) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    public static zzhdw zzd(zzhwj zzhwjVar) throws GeneralSecurityException {
        Provider providerZzb = zzb();
        if (providerZzb != null) {
            return zze(zzhwjVar, providerZzb);
        }
        throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
    }

    public static zzhdw zze(zzhwj zzhwjVar, Provider provider) throws GeneralSecurityException {
        return new zzhyg((RSAPublicKey) KeyFactory.getInstance("RSA", provider).generatePublic(new RSAPublicKeySpec(zzhwjVar.zzd(), zzhwjVar.zzf().zzd())), zzhwjVar.zzf().zzf(), zzhwjVar.zze().zzc(), zzhwjVar.zzf().zze().equals(zzhwe.zzc) ? zzb : zza, provider);
    }

    @Override // com.google.android.gms.internal.ads.zzhdw
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zze;
        if (!zzhnq.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str = this.zzd;
        Provider provider = this.zzg;
        RSAPublicKey rSAPublicKey = this.zzc;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.update(bArr2);
        byte[] bArr4 = this.zzf;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Invalid signature");
    }
}
