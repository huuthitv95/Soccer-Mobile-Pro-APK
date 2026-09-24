package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhgi {
    public static final /* synthetic */ int zza = 0;
    private static final zzhmx zzb = zzhmx.zzd(zzhgh.zza, zzhgn.class, zzhcu.class);
    private static final zzhdd zzc = zzhlo.zze("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzhcu.class, zzhse.REMOTE, zzhsu.zze());
    private static final zzhlf zzd = zzhgg.zza;

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzhkh.zza(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i = zzhgu.zza;
        zzhgu.zza(zzhmj.zza());
        zzhmg.zza().zzb(zzb);
        zzhma.zza().zzb(zzd, zzhgp.class);
        zzhlg.zza().zzb(zzc, true);
    }
}
