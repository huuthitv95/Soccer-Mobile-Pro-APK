package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhwz {
    public static final /* synthetic */ int zza = 0;
    private static final zzhmx zzb = zzhmx.zzd(zzhww.zza, zzhwt.class, zzhdv.class);
    private static final zzhmx zzc = zzhmx.zzd(zzhwy.zza, zzhwv.class, zzhdw.class);
    private static final zzhdu zzd = zzhlo.zzf("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", zzhdv.class, zzhtr.zzl());
    private static final zzhdd zze = zzhlo.zze("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", zzhdw.class, zzhse.ASYMMETRIC_PUBLIC, zzhtt.zzi());
    private static final zzhlf zzf = zzhwx.zza;
    private static final int zzg = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzg;
        if (!zzhkh.zza(i)) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = zzhyn.zza;
        zzhyn.zza(zzhmj.zza());
        zzhmf zzhmfVarZza = zzhmf.zza();
        HashMap map = new HashMap();
        BigInteger bigInteger = zzhwr.zza;
        zzhwo zzhwoVar = new zzhwo(null);
        zzhwp zzhwpVar = zzhwp.zza;
        zzhwoVar.zzd(zzhwpVar);
        zzhwoVar.zze(zzhwpVar);
        zzhwoVar.zzf(32);
        zzhwoVar.zza(3072);
        BigInteger bigInteger2 = zzhwr.zza;
        zzhwoVar.zzb(bigInteger2);
        zzhwq zzhwqVar = zzhwq.zza;
        zzhwoVar.zzc(zzhwqVar);
        map.put("RSA_SSA_PSS_3072_SHA256_F4", zzhwoVar.zzg());
        zzhwo zzhwoVar2 = new zzhwo(null);
        zzhwoVar2.zzd(zzhwpVar);
        zzhwoVar2.zze(zzhwpVar);
        zzhwoVar2.zzf(32);
        zzhwoVar2.zza(3072);
        zzhwoVar2.zzb(bigInteger2);
        zzhwq zzhwqVar2 = zzhwq.zzd;
        zzhwoVar2.zzc(zzhwqVar2);
        map.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", zzhwoVar2.zzg());
        map.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", zzhvt.zzk);
        zzhwo zzhwoVar3 = new zzhwo(null);
        zzhwp zzhwpVar2 = zzhwp.zzc;
        zzhwoVar3.zzd(zzhwpVar2);
        zzhwoVar3.zze(zzhwpVar2);
        zzhwoVar3.zzf(64);
        zzhwoVar3.zza(4096);
        zzhwoVar3.zzb(bigInteger2);
        zzhwoVar3.zzc(zzhwqVar);
        map.put("RSA_SSA_PSS_4096_SHA512_F4", zzhwoVar3.zzg());
        zzhwo zzhwoVar4 = new zzhwo(null);
        zzhwoVar4.zzd(zzhwpVar2);
        zzhwoVar4.zze(zzhwpVar2);
        zzhwoVar4.zzf(64);
        zzhwoVar4.zza(4096);
        zzhwoVar4.zzb(bigInteger2);
        zzhwoVar4.zzc(zzhwqVar2);
        map.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", zzhwoVar4.zzg());
        map.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", zzhvt.zzl);
        zzhmfVarZza.zzd(Collections.unmodifiableMap(map));
        zzhmg.zza().zzb(zzb);
        zzhmg.zza().zzb(zzc);
        zzhma.zza().zzb(zzf, zzhwr.class);
        zzhlg.zza().zzf(zzd, i, true);
        zzhlg.zza().zzf(zze, i, false);
    }
}
