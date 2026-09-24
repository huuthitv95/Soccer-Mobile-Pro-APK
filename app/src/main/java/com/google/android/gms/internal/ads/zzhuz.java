package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhuz {
    public static final /* synthetic */ int zza = 0;
    private static final zzhmx zzb = zzhmx.zzd(zzhux.zza, zzhuu.class, zzhdv.class);
    private static final zzhmx zzc = zzhmx.zzd(zzhuy.zza, zzhva.class, zzhdw.class);
    private static final zzhdu zzd = zzhlo.zzf("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", zzhdv.class, zzhrs.zzg());
    private static final zzhdd zze = zzhlo.zze("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", zzhdw.class, zzhse.ASYMMETRIC_PUBLIC, zzhru.zzg());
    private static final zzhmb zzf = zzhuw.zza;
    private static final zzhlf zzg = zzhuv.zza;

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzhkh.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i = zzhxt.zza;
        zzhxt.zza(zzhmj.zza());
        zzhmf zzhmfVarZza = zzhmf.zza();
        HashMap map = new HashMap();
        map.put("ED25519", zzhut.zzb(zzhus.zza));
        zzhus zzhusVar = zzhus.zzd;
        map.put("ED25519_RAW", zzhut.zzb(zzhusVar));
        map.put("ED25519WithRawOutput", zzhut.zzb(zzhusVar));
        zzhmfVarZza.zzd(Collections.unmodifiableMap(map));
        zzhma.zza().zzb(zzg, zzhut.class);
        zzhmc.zza().zzb(zzf, zzhut.class);
        zzhmg.zza().zzb(zzb);
        zzhmg.zza().zzb(zzc);
        zzhlg.zza().zzb(zzd, true);
        zzhlg.zza().zzb(zze, false);
    }
}
