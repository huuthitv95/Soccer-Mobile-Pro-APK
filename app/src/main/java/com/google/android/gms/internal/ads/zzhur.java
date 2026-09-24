package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhur {
    public static final /* synthetic */ int zza = 0;
    private static final zzhmx zzb = zzhmx.zzd(zzhuo.zza, zzhul.class, zzhdv.class);
    private static final zzhmx zzc = zzhmx.zzd(zzhuq.zza, zzhun.class, zzhdw.class);
    private static final zzhdu zzd = zzhlo.zzf("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", zzhdv.class, zzhrl.zzg());
    private static final zzhdd zze = zzhlo.zze("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", zzhdw.class, zzhse.ASYMMETRIC_PUBLIC, zzhrn.zzi());
    private static final zzhlf zzf = zzhup.zza;
    private static final int zzg = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzg;
        if (!zzhkh.zza(i)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = zzhxk.zza;
        zzhxk.zza(zzhmj.zza());
        zzhmf zzhmfVarZza = zzhmf.zza();
        HashMap map = new HashMap();
        map.put("ECDSA_P256", zzhvt.zza);
        map.put("ECDSA_P256_IEEE_P1363", zzhvt.zzd);
        zzhue zzhueVar = new zzhue(null);
        zzhueVar.zzc(zzhug.zza);
        zzhueVar.zzb(zzhuf.zza);
        zzhueVar.zza(zzhuh.zza);
        zzhueVar.zzd(zzhui.zzd);
        map.put("ECDSA_P256_RAW", zzhueVar.zze());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", zzhvt.zzf);
        map.put("ECDSA_P384", zzhvt.zzb);
        map.put("ECDSA_P384_IEEE_P1363", zzhvt.zze);
        zzhue zzhueVar2 = new zzhue(null);
        zzhueVar2.zzc(zzhug.zzc);
        zzhuf zzhufVar = zzhuf.zzb;
        zzhueVar2.zzb(zzhufVar);
        zzhuh zzhuhVar = zzhuh.zzb;
        zzhueVar2.zza(zzhuhVar);
        zzhui zzhuiVar = zzhui.zza;
        zzhueVar2.zzd(zzhuiVar);
        map.put("ECDSA_P384_SHA512", zzhueVar2.zze());
        zzhue zzhueVar3 = new zzhue(null);
        zzhueVar3.zzc(zzhug.zzb);
        zzhueVar3.zzb(zzhufVar);
        zzhueVar3.zza(zzhuhVar);
        zzhueVar3.zzd(zzhuiVar);
        map.put("ECDSA_P384_SHA384", zzhueVar3.zze());
        map.put("ECDSA_P521", zzhvt.zzc);
        map.put("ECDSA_P521_IEEE_P1363", zzhvt.zzg);
        zzhmfVarZza.zzd(Collections.unmodifiableMap(map));
        zzhmg.zza().zzb(zzb);
        zzhmg.zza().zzb(zzc);
        zzhma.zza().zzb(zzf, zzhuj.class);
        zzhlg.zza().zzf(zzd, i, true);
        zzhlg.zza().zzf(zze, i, false);
    }
}
