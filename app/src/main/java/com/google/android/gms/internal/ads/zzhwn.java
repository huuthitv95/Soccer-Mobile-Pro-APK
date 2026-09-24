package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhwn {
    public static final /* synthetic */ int zza = 0;
    private static final zzhmx zzb = zzhmx.zzd(zzhwk.zza, zzhwh.class, zzhdv.class);
    private static final zzhmx zzc = zzhmx.zzd(zzhwm.zza, zzhwj.class, zzhdw.class);
    private static final zzhdu zzd = zzhlo.zzf("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", zzhdv.class, zzhtj.zzl());
    private static final zzhdd zze = zzhlo.zze("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", zzhdw.class, zzhse.ASYMMETRIC_PUBLIC, zzhtl.zzi());
    private static final zzhlf zzf = zzhwl.zza;
    private static final int zzg = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzg;
        if (!zzhkh.zza(i)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = zzhye.zza;
        zzhye.zza(zzhmj.zza());
        zzhmf zzhmfVarZza = zzhmf.zza();
        HashMap map = new HashMap();
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4", zzhvt.zzh);
        BigInteger bigInteger = zzhwf.zza;
        zzhwc zzhwcVar = new zzhwc(null);
        zzhwcVar.zzd(zzhwd.zza);
        zzhwcVar.zza(3072);
        BigInteger bigInteger2 = zzhwf.zza;
        zzhwcVar.zzb(bigInteger2);
        zzhwe zzhweVar = zzhwe.zzd;
        zzhwcVar.zzc(zzhweVar);
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", zzhwcVar.zze());
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", zzhvt.zzi);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4", zzhvt.zzj);
        zzhwc zzhwcVar2 = new zzhwc(null);
        zzhwcVar2.zzd(zzhwd.zzc);
        zzhwcVar2.zza(4096);
        zzhwcVar2.zzb(bigInteger2);
        zzhwcVar2.zzc(zzhweVar);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", zzhwcVar2.zze());
        zzhmfVarZza.zzd(map);
        zzhmg.zza().zzb(zzb);
        zzhmg.zza().zzb(zzc);
        zzhma.zza().zzb(zzf, zzhwf.class);
        zzhlg.zza().zzf(zzd, i, true);
        zzhlg.zza().zzf(zze, i, false);
    }
}
