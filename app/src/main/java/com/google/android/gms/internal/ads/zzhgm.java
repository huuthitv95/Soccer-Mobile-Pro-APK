package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhgm {
    public static final /* synthetic */ int zza = 0;
    private static final zzhdd zzb = zzhlo.zze("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzhcu.class, zzhse.SYMMETRIC, zzhsy.zze());
    private static final zzhlf zzc = zzhgl.zza;
    private static final zzhmx zzd = zzhmx.zzd(zzhgk.zza, zzhgv.class, zzhcu.class);

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzhkh.zza(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i = zzhhe.zza;
        zzhhe.zza(zzhmj.zza());
        zzhma.zza().zzb(zzc, zzhgz.class);
        zzhmg.zza().zzb(zzd);
        zzhlg.zza().zzb(zzb, true);
    }
}
