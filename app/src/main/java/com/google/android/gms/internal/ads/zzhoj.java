package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhoj {
    public static final /* synthetic */ int zza = 0;
    private static final zzhmx zzb = zzhmx.zzd(zzhof.zza, zzhoe.class, zzhoa.class);
    private static final zzhmx zzc = zzhmx.zzd(zzhoi.zza, zzhoe.class, zzhds.class);
    private static final zzhdd zzd = zzhlo.zze("type.googleapis.com/google.crypto.tink.HmacKey", zzhds.class, zzhse.SYMMETRIC, zzhry.zzh());
    private static final zzhmb zze = zzhoh.zza;
    private static final zzhlf zzf = zzhog.zza;
    private static final int zzg = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzg;
        if (!zzhkh.zza(i)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = zzhpo.zza;
        zzhpo.zza(zzhmj.zza());
        zzhmg.zza().zzb(zzb);
        zzhmg.zza().zzb(zzc);
        zzhmf zzhmfVarZza = zzhmf.zza();
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", zzhpa.zza);
        zzhok zzhokVar = new zzhok(null);
        zzhokVar.zza(32);
        zzhokVar.zzb(16);
        zzhom zzhomVar = zzhom.zzd;
        zzhokVar.zzc(zzhomVar);
        zzhol zzholVar = zzhol.zzc;
        zzhokVar.zzd(zzholVar);
        map.put("HMAC_SHA256_128BITTAG_RAW", zzhokVar.zze());
        zzhok zzhokVar2 = new zzhok(null);
        zzhokVar2.zza(32);
        zzhokVar2.zzb(32);
        zzhom zzhomVar2 = zzhom.zza;
        zzhokVar2.zzc(zzhomVar2);
        zzhokVar2.zzd(zzholVar);
        map.put("HMAC_SHA256_256BITTAG", zzhokVar2.zze());
        zzhok zzhokVar3 = new zzhok(null);
        zzhokVar3.zza(32);
        zzhokVar3.zzb(32);
        zzhokVar3.zzc(zzhomVar);
        zzhokVar3.zzd(zzholVar);
        map.put("HMAC_SHA256_256BITTAG_RAW", zzhokVar3.zze());
        zzhok zzhokVar4 = new zzhok(null);
        zzhokVar4.zza(64);
        zzhokVar4.zzb(16);
        zzhokVar4.zzc(zzhomVar2);
        zzhol zzholVar2 = zzhol.zze;
        zzhokVar4.zzd(zzholVar2);
        map.put("HMAC_SHA512_128BITTAG", zzhokVar4.zze());
        zzhok zzhokVar5 = new zzhok(null);
        zzhokVar5.zza(64);
        zzhokVar5.zzb(16);
        zzhokVar5.zzc(zzhomVar);
        zzhokVar5.zzd(zzholVar2);
        map.put("HMAC_SHA512_128BITTAG_RAW", zzhokVar5.zze());
        zzhok zzhokVar6 = new zzhok(null);
        zzhokVar6.zza(64);
        zzhokVar6.zzb(32);
        zzhokVar6.zzc(zzhomVar2);
        zzhokVar6.zzd(zzholVar2);
        map.put("HMAC_SHA512_256BITTAG", zzhokVar6.zze());
        zzhok zzhokVar7 = new zzhok(null);
        zzhokVar7.zza(64);
        zzhokVar7.zzb(32);
        zzhokVar7.zzc(zzhomVar);
        zzhokVar7.zzd(zzholVar2);
        map.put("HMAC_SHA512_256BITTAG_RAW", zzhokVar7.zze());
        map.put("HMAC_SHA512_512BITTAG", zzhpa.zzb);
        zzhok zzhokVar8 = new zzhok(null);
        zzhokVar8.zza(64);
        zzhokVar8.zzb(64);
        zzhokVar8.zzc(zzhomVar);
        zzhokVar8.zzd(zzholVar2);
        map.put("HMAC_SHA512_512BITTAG_RAW", zzhokVar8.zze());
        zzhmfVarZza.zzd(Collections.unmodifiableMap(map));
        zzhma.zza().zzb(zzf, zzhon.class);
        zzhmc.zza().zzb(zze, zzhon.class);
        zzhlg.zza().zzf(zzd, i, true);
    }
}
