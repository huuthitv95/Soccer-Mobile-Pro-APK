package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhev {
    public static final /* synthetic */ int zza = 0;
    private static final zzhmx zzb = zzhmx.zzd(zzheu.zza, zzher.class, zzhcu.class);
    private static final zzhdd zzc = zzhlo.zze("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzhcu.class, zzhse.SYMMETRIC, zzhqf.zzg());
    private static final zzhmb zzd = zzhet.zza;
    private static final zzhlf zze = zzhes.zza;
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (!zzhkh.zza(i)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = zzhig.zza;
        zzhig.zza(zzhmj.zza());
        zzhmg.zza().zzb(zzb);
        zzhmf zzhmfVarZza = zzhmf.zza();
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", zzhho.zze);
        zzhew zzhewVar = new zzhew(null);
        zzhewVar.zza(16);
        zzhewVar.zzb(32);
        zzhewVar.zzd(16);
        zzhewVar.zzc(16);
        zzhex zzhexVar = zzhex.zzc;
        zzhewVar.zzf(zzhexVar);
        zzhey zzheyVar = zzhey.zzc;
        zzhewVar.zze(zzheyVar);
        map.put("AES128_CTR_HMAC_SHA256_RAW", zzhewVar.zzg());
        map.put("AES256_CTR_HMAC_SHA256", zzhho.zzf);
        zzhew zzhewVar2 = new zzhew(null);
        zzhewVar2.zza(32);
        zzhewVar2.zzb(32);
        zzhewVar2.zzd(32);
        zzhewVar2.zzc(16);
        zzhewVar2.zzf(zzhexVar);
        zzhewVar2.zze(zzheyVar);
        map.put("AES256_CTR_HMAC_SHA256_RAW", zzhewVar2.zzg());
        zzhmfVarZza.zzd(Collections.unmodifiableMap(map));
        zzhmc.zza().zzb(zzd, zzhez.class);
        zzhma.zza().zzb(zze, zzhez.class);
        zzhlg.zza().zzf(zzc, i, true);
    }
}
