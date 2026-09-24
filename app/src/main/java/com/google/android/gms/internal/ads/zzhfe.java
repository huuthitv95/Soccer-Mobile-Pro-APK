package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhfe {
    public static final /* synthetic */ int zza = 0;
    private static final zzhmx zzb = zzhmx.zzd(zzhfc.zza, zzhfb.class, zzhcu.class);
    private static final zzhdd zzc = zzhlo.zze("type.googleapis.com/google.crypto.tink.AesEaxKey", zzhcu.class, zzhse.SYMMETRIC, zzhqp.zzg());
    private static final zzhlf zzd = zzhfd.zza;

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzhkh.zza(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i = zzhil.zza;
        zzhil.zza(zzhmj.zza());
        zzhmg.zza().zzb(zzb);
        zzhmf zzhmfVarZza = zzhmf.zza();
        HashMap map = new HashMap();
        map.put("AES128_EAX", zzhho.zzc);
        zzhff zzhffVar = new zzhff(null);
        zzhffVar.zzb(16);
        zzhffVar.zza(16);
        zzhffVar.zzc(16);
        zzhfg zzhfgVar = zzhfg.zzc;
        zzhffVar.zzd(zzhfgVar);
        map.put("AES128_EAX_RAW", zzhffVar.zze());
        map.put("AES256_EAX", zzhho.zzd);
        zzhff zzhffVar2 = new zzhff(null);
        zzhffVar2.zzb(16);
        zzhffVar2.zza(32);
        zzhffVar2.zzc(16);
        zzhffVar2.zzd(zzhfgVar);
        map.put("AES256_EAX_RAW", zzhffVar2.zze());
        zzhmfVarZza.zzd(Collections.unmodifiableMap(map));
        zzhma.zza().zzb(zzd, zzhfh.class);
        zzhlg.zza().zzb(zzc, true);
    }
}
