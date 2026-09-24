package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhdz {
    public static byte[] zza(zzhdt zzhdtVar) throws GeneralSecurityException {
        return ((zzhnf) zzhmj.zza().zzk(zzhdtVar, zzhnf.class)).zzc().zzaN();
    }

    public static zzhdt zzb(byte[] bArr) throws GeneralSecurityException {
        try {
            zzhsi zzhsiVarZzd = zzhsi.zzd(bArr, zzidb.zza());
            zzhmj zzhmjVarZza = zzhmj.zza();
            zzhnf zzhnfVarZzb = zzhnf.zzb(zzhsiVarZzd);
            return !zzhmjVarZza.zzi(zzhnfVarZzb) ? new zzhls(zzhnfVarZzb) : zzhmjVarZza.zzj(zzhnfVarZzb);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }
}
