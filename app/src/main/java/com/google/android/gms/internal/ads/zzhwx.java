package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzhwx implements zzhlf {
    static final /* synthetic */ zzhwx zza = new zzhwx();

    private /* synthetic */ zzhwx() {
    }

    @Override // com.google.android.gms.internal.ads.zzhlf
    public final /* synthetic */ zzhdc zza(zzhdt zzhdtVar, Integer num) throws GeneralSecurityException {
        zzhwr zzhwrVar = (zzhwr) zzhdtVar;
        int i = zzhwz.zza;
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzhzm.zze.zzb("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(zzhwrVar.zzc(), new BigInteger(1, zzhwrVar.zzd().toByteArray())));
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
        zzhwu zzhwuVar = new zzhwu(null);
        zzhwuVar.zza(zzhwrVar);
        zzhwuVar.zzb(rSAPublicKey.getModulus());
        zzhwuVar.zzc(num);
        zzhwv zzhwvVarZzd = zzhwuVar.zzd();
        zzhws zzhwsVar = new zzhws(null);
        zzhwsVar.zza(zzhwvVarZzd);
        zzhwsVar.zzb(zzian.zza(rSAPrivateCrtKey.getPrimeP(), zzhda.zza()), zzian.zza(rSAPrivateCrtKey.getPrimeQ(), zzhda.zza()));
        zzhwsVar.zzc(zzian.zza(rSAPrivateCrtKey.getPrivateExponent(), zzhda.zza()));
        zzhwsVar.zzd(zzian.zza(rSAPrivateCrtKey.getPrimeExponentP(), zzhda.zza()), zzian.zza(rSAPrivateCrtKey.getPrimeExponentQ(), zzhda.zza()));
        zzhwsVar.zze(zzian.zza(rSAPrivateCrtKey.getCrtCoefficient(), zzhda.zza()));
        return zzhwsVar.zzf();
    }
}
