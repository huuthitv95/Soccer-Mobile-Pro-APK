package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhpp implements zzhds {
    private zzhpp(zzhds zzhdsVar, zzhtb zzhtbVar, byte[] bArr) {
    }

    public static zzhds zza(zzhlr zzhlrVar) throws GeneralSecurityException {
        byte[] bArrZzc;
        zzhne zzhneVarZzc = zzhlrVar.zzc(zzhda.zza());
        zzhds zzhdsVar = (zzhds) zzhlg.zza().zzc(zzhneVarZzc.zzg(), zzhds.class).zza(zzhneVarZzc.zzb());
        zzhtb zzhtbVarZzd = zzhneVarZzc.zzd();
        int iOrdinal = zzhtbVarZzd.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = zzhmk.zzb(zzhlrVar.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = zzhmk.zza(zzhlrVar.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrZzc = zzhmk.zza(zzhlrVar.zzb().intValue()).zzc();
        } else {
            bArrZzc = zzhmk.zza.zzc();
        }
        return new zzhpp(zzhdsVar, zzhtbVarZzd, bArrZzc);
    }
}
