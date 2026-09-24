package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhhz {
    public static final /* synthetic */ int zza = 0;
    private static final zzhmx zzb = zzhmx.zzd(zzhhy.zza, zzhhv.class, zzhcu.class);
    private static final zzhdd zzc = zzhlo.zze("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzhcu.class, zzhse.SYMMETRIC, zzhub.zze());
    private static final zzhmb zzd = zzhhw.zza;
    private static final zzhlf zze = zzhhx.zza;

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzhkh.zza(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i = zzhka.zza;
        zzhka.zza(zzhmj.zza());
        zzhmg.zza().zzb(zzb);
        zzhmf zzhmfVarZza = zzhmf.zza();
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", zzhib.zzb(zzhia.zza));
        map.put("XCHACHA20_POLY1305_RAW", zzhib.zzb(zzhia.zzc));
        zzhmfVarZza.zzd(Collections.unmodifiableMap(map));
        zzhma.zza().zzb(zze, zzhib.class);
        zzhmc.zza().zzb(zzd, zzhib.class);
        zzhlg.zza().zzb(zzc, true);
    }
}
