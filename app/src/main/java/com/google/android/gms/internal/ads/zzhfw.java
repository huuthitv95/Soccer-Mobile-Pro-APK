package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhfw {
    public static final /* synthetic */ int zza = 0;
    private static final zzhmx zzb = zzhmx.zzd(zzhft.zza, zzhfs.class, zzhcu.class);
    private static final zzhlf zzc = zzhfv.zza;
    private static final zzhmb zzd = zzhfu.zza;
    private static final zzhdd zze = zzhlo.zze("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzhcu.class, zzhse.SYMMETRIC, zzhqz.zze());

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzhkh.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i = zzhiz.zza;
        zzhiz.zza(zzhmj.zza());
        zzhmf zzhmfVarZza = zzhmf.zza();
        HashMap map = new HashMap();
        zzhfx zzhfxVar = new zzhfx(null);
        zzhfxVar.zza(16);
        zzhfy zzhfyVar = zzhfy.zza;
        zzhfxVar.zzb(zzhfyVar);
        map.put("AES128_GCM_SIV", zzhfxVar.zzc());
        zzhfx zzhfxVar2 = new zzhfx(null);
        zzhfxVar2.zza(16);
        zzhfy zzhfyVar2 = zzhfy.zzc;
        zzhfxVar2.zzb(zzhfyVar2);
        map.put("AES128_GCM_SIV_RAW", zzhfxVar2.zzc());
        zzhfx zzhfxVar3 = new zzhfx(null);
        zzhfxVar3.zza(32);
        zzhfxVar3.zzb(zzhfyVar);
        map.put("AES256_GCM_SIV", zzhfxVar3.zzc());
        zzhfx zzhfxVar4 = new zzhfx(null);
        zzhfxVar4.zza(32);
        zzhfxVar4.zzb(zzhfyVar2);
        map.put("AES256_GCM_SIV_RAW", zzhfxVar4.zzc());
        zzhmfVarZza.zzd(Collections.unmodifiableMap(map));
        zzhmc.zza().zzb(zzd, zzhfz.class);
        zzhma.zza().zzb(zzc, zzhfz.class);
        zzhmg.zza().zzb(zzb);
        zzhlg.zza().zzb(zze, true);
    }
}
