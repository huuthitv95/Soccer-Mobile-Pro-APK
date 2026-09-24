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
final /* synthetic */ class zzhwl implements zzhlf {
    static final /* synthetic */ zzhwl zza = new zzhwl();

    private /* synthetic */ zzhwl() {
    }

    @Override // com.google.android.gms.internal.ads.zzhlf
    public final /* synthetic */ zzhdc zza(zzhdt zzhdtVar, Integer num) throws GeneralSecurityException {
        zzhwf zzhwfVar = (zzhwf) zzhdtVar;
        int i = zzhwn.zza;
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzhzm.zze.zzb("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(zzhwfVar.zzc(), new BigInteger(1, zzhwfVar.zzd().toByteArray())));
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
        zzhwi zzhwiVar = new zzhwi(null);
        zzhwiVar.zza(zzhwfVar);
        zzhwiVar.zzb(rSAPublicKey.getModulus());
        zzhwiVar.zzc(num);
        zzhwj zzhwjVarZzd = zzhwiVar.zzd();
        zzhwg zzhwgVar = new zzhwg(null);
        zzhwgVar.zza(zzhwjVarZzd);
        zzhwgVar.zzb(zzian.zza(rSAPrivateCrtKey.getPrimeP(), zzhda.zza()), zzian.zza(rSAPrivateCrtKey.getPrimeQ(), zzhda.zza()));
        zzhwgVar.zzc(zzian.zza(rSAPrivateCrtKey.getPrivateExponent(), zzhda.zza()));
        zzhwgVar.zzd(zzian.zza(rSAPrivateCrtKey.getPrimeExponentP(), zzhda.zza()), zzian.zza(rSAPrivateCrtKey.getPrimeExponentQ(), zzhda.zza()));
        zzhwgVar.zze(zzian.zza(rSAPrivateCrtKey.getCrtCoefficient(), zzhda.zza()));
        return zzhwgVar.zzf();
    }
}
