package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhxl implements zzhdv {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    private zzhxl(ECPrivateKey eCPrivateKey, zzhzv zzhzvVar, zzhzf zzhzfVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhkh.zza(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        zziaj.zza(zzhzvVar);
    }

    public static zzhdv zzb(zzhul zzhulVar) throws GeneralSecurityException {
        Provider providerZza = zzhkl.zza();
        return new zzhxl((ECPrivateKey) (providerZza != null ? KeyFactory.getInstance("EC", providerZza) : (KeyFactory) zzhzm.zzf.zzb("EC")).generatePrivate(new ECPrivateKeySpec(zzhulVar.zzf().zzb(zzhda.zza()), zzhzg.zzb((zzhze) zzhxm.zzc.zzb(zzhulVar.zzd().zzd())))), (zzhzv) zzhxm.zza.zzb(zzhulVar.zzd().zze()), (zzhzf) zzhxm.zzb.zzb(zzhulVar.zzd().zzc()), zzhulVar.zze().zze().zzc(), zzhulVar.zzd().zzf().equals(zzhui.zzc) ? zzb : zza, providerZza);
    }

    @Override // com.google.android.gms.internal.ads.zzhdv
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
