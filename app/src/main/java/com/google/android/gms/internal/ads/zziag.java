package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zziag implements zzhdv {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    public static zzhdv zzb(zzhwt zzhwtVar) throws GeneralSecurityException {
        try {
            return zzhyo.zzb(zzhwtVar);
        } catch (NoSuchProviderException unused) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) ((KeyFactory) zzhzm.zzf.zzb("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(zzhwtVar.zze().zzd(), zzhwtVar.zzd().zzd(), zzhwtVar.zzi().zzb(zzhda.zza()), zzhwtVar.zzf().zzb(zzhda.zza()), zzhwtVar.zzh().zzb(zzhda.zza()), zzhwtVar.zzj().zzb(zzhda.zza()), zzhwtVar.zzk().zzb(zzhda.zza()), zzhwtVar.zzl().zzb(zzhda.zza())));
            zzhwr zzhwrVarZzd = zzhwtVar.zzd();
            zzhky zzhkyVar = zziai.zza;
            return new zziaf(rSAPrivateCrtKey, (zzhzv) zzhkyVar.zzb(zzhwrVarZzd.zzf()), (zzhzv) zzhkyVar.zzb(zzhwrVarZzd.zzg()), zzhwrVarZzd.zzh(), zzhwtVar.zze().zze().zzc(), zzhwtVar.zzd().zze().equals(zzhwq.zzc) ? zzb : zza, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdv
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
