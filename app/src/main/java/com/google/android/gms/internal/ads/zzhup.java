package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzhup implements zzhlf {
    static final /* synthetic */ zzhup zza = new zzhup();

    private /* synthetic */ zzhup() {
    }

    @Override // com.google.android.gms.internal.ads.zzhlf
    public final /* synthetic */ zzhdc zza(zzhdt zzhdtVar, Integer num) throws GeneralSecurityException {
        zzhuj zzhujVar = (zzhuj) zzhdtVar;
        int i = zzhur.zza;
        ECParameterSpec eCParameterSpecZza = zzhujVar.zzd().zza();
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzhzm.zze.zzb("EC");
        keyPairGenerator.initialize(eCParameterSpecZza);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
        zzhum zzhumVar = new zzhum(null);
        zzhumVar.zza(zzhujVar);
        zzhumVar.zzc(num);
        zzhumVar.zzb(eCPublicKey.getW());
        zzhun zzhunVarZzd = zzhumVar.zzd();
        zzhuk zzhukVar = new zzhuk(null);
        zzhukVar.zza(zzhunVarZzd);
        zzhukVar.zzb(zzian.zza(eCPrivateKey.getS(), zzhda.zza()));
        return zzhukVar.zzc();
    }
}
