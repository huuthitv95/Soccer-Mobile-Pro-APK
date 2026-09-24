package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhlr extends zzhdc {
    private final zzhne zza;

    public zzhlr(zzhne zzhneVar, @Nullable zzhdx zzhdxVar) throws GeneralSecurityException {
        zze(zzhneVar, zzhdxVar);
        this.zza = zzhneVar;
    }

    private static void zze(zzhne zzhneVar, @Nullable zzhdx zzhdxVar) throws GeneralSecurityException {
        int i = zzhlp.zzb[zzhneVar.zzc().ordinal()];
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final zzhdt zza() {
        zzhne zzhneVar = this.zza;
        return new zzhlq(zzhneVar.zzg(), zzhneVar.zzd(), null);
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    @Nullable
    public final Integer zzb() {
        return this.zza.zze();
    }

    public final zzhne zzc(@Nullable zzhdx zzhdxVar) throws GeneralSecurityException {
        zzhne zzhneVar = this.zza;
        zze(zzhneVar, zzhdxVar);
        return zzhneVar;
    }

    public final zziam zzd() throws GeneralSecurityException {
        zzhne zzhneVar = this.zza;
        if (zzhneVar.zzd().equals(zzhtb.RAW)) {
            return zziam.zza(new byte[0]);
        }
        if (zzhneVar.zzd().equals(zzhtb.TINK)) {
            return zzhmk.zzb(zzhneVar.zze().intValue());
        }
        if (zzhneVar.zzd().equals(zzhtb.LEGACY) || zzhneVar.zzd().equals(zzhtb.CRUNCHY)) {
            return zzhmk.zza(zzhneVar.zze().intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }
}
