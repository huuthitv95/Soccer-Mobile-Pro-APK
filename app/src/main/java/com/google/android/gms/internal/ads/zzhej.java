package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhej {
    public static final /* synthetic */ int zza = 0;
    private static final zzhlb zzb = zzb();

    public static zzhcz zza() throws GeneralSecurityException {
        if (zzhki.zza()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
        }
        return zzb;
    }

    private static zzhlb zzb() {
        try {
            zzhmy zzhmyVarZza = zzhnb.zza();
            zzhep.zzd(zzhmyVarZza);
            zzhmyVarZza.zza(zzhmx.zzd(zzheh.zza, zzher.class, zzhcu.class));
            zzhmyVarZza.zza(zzhmx.zzd(zzhef.zza, zzhfj.class, zzhcu.class));
            zzhmyVarZza.zza(zzhmx.zzd(zzheg.zza, zzhfs.class, zzhcu.class));
            zzhmyVarZza.zza(zzhmx.zzd(zzhee.zza, zzhfb.class, zzhcu.class));
            zzhmyVarZza.zza(zzhmx.zzd(zzhed.zza, zzhga.class, zzhcu.class));
            zzhmyVarZza.zza(zzhmx.zzd(zzhec.zza, zzhhv.class, zzhcu.class));
            zzhmyVarZza.zza(zzhmx.zzd(zzhei.zza, zzhhp.class, zzhcu.class));
            return zzhlb.zzb(zzhmyVarZza.zzc());
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
