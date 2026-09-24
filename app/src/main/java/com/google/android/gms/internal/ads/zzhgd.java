package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhgd {
    public static final /* synthetic */ int zza = 0;
    private static final zzhmx zzb = zzhmx.zzd(zzhgc.zza, zzhga.class, zzhcu.class);
    private static final zzhlf zzc = zzhgb.zza;
    private static final zzhdd zzd = zzhlo.zze("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzhcu.class, zzhse.SYMMETRIC, zzhrd.zze());

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzhkh.zza(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i = zzhjf.zza;
        zzhjf.zza(zzhmj.zza());
        zzhmg.zza().zzb(zzb);
        zzhma.zza().zzb(zzc, zzhgf.class);
        zzhmf zzhmfVarZza = zzhmf.zza();
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", zzhgf.zzb(zzhge.zza));
        map.put("CHACHA20_POLY1305_RAW", zzhgf.zzb(zzhge.zzc));
        zzhmfVarZza.zzd(Collections.unmodifiableMap(map));
        zzhlg.zza().zzb(zzd, true);
    }
}
