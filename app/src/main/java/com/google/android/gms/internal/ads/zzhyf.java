package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhyf implements zzhdv {
    private static final byte[] zzb = new byte[0];
    private static final byte[] zzc = {0};
    private static final byte[] zzd = {1, 2, 3};

    @Nullable
    Provider zza;
    private final RSAPrivateCrtKey zze;
    private final String zzf;
    private final byte[] zzg;
    private final byte[] zzh;
    private final zzhdw zzi;

    private zzhyf(RSAPrivateCrtKey rSAPrivateCrtKey, zzhwd zzhwdVar, byte[] bArr, byte[] bArr2, zzhdw zzhdwVar, @Nullable Provider provider) throws GeneralSecurityException {
        if (!zzhkh.zza(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (zzhwdVar != zzhwd.zza && zzhwdVar != zzhwd.zzb && zzhwdVar != zzhwd.zzc) {
            String strValueOf = String.valueOf(zzhwdVar);
            String.valueOf(strValueOf);
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(strValueOf)));
        }
        zziak.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        zziak.zzd(rSAPrivateCrtKey.getPublicExponent());
        this.zze = rSAPrivateCrtKey;
        this.zzf = zzhyg.zzc(zzhwdVar);
        this.zzg = bArr;
        this.zzh = bArr2;
        this.zzi = zzhdwVar;
        this.zza = provider;
    }

    public static zzhdv zzb(zzhwh zzhwhVar) throws GeneralSecurityException {
        Provider providerZzb = zzhyg.zzb();
        zzhyf zzhyfVar = new zzhyf((RSAPrivateCrtKey) (providerZzb != null ? KeyFactory.getInstance("RSA", providerZzb) : (KeyFactory) zzhzm.zzf.zzb("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(zzhwhVar.zze().zzd(), zzhwhVar.zzd().zzd(), zzhwhVar.zzi().zzb(zzhda.zza()), zzhwhVar.zzf().zzb(zzhda.zza()), zzhwhVar.zzh().zzb(zzhda.zza()), zzhwhVar.zzj().zzb(zzhda.zza()), zzhwhVar.zzk().zzb(zzhda.zza()), zzhwhVar.zzl().zzb(zzhda.zza()))), zzhwhVar.zzd().zzf(), zzhwhVar.zze().zze().zzc(), zzhwhVar.zzd().zze().equals(zzhwe.zzc) ? zzc : zzb, providerZzb != null ? zzhyg.zze(zzhwhVar.zze(), providerZzb) : zziae.zzb(zzhwhVar.zze()), providerZzb);
        zzhyfVar.zza(zzd);
        return zzhyfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhdv
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        Provider provider = this.zza;
        Signature signature = provider != null ? Signature.getInstance(this.zzf, provider) : (Signature) zzhzm.zzc.zzb(this.zzf);
        signature.initSign(this.zze);
        signature.update(bArr);
        byte[] bArr2 = this.zzh;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] bArrSign = signature.sign();
        byte[] bArr3 = this.zzg;
        if (bArr3.length > 0) {
            bArrSign = zzhyy.zza(bArr3, bArrSign);
        }
        try {
            this.zzi.zza(bArrSign, bArr);
            return bArrSign;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("RSA signature computation error", e);
        }
    }
}
