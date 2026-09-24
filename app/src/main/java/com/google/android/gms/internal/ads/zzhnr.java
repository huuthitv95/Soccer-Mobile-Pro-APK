package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhnr {

    @Nullable
    private zzhnz zza = null;

    @Nullable
    private zziao zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhnr() {
    }

    /* synthetic */ zzhnr(byte[] bArr) {
    }

    public final zzhnr zza(zzhnz zzhnzVar) {
        this.zza = zzhnzVar;
        return this;
    }

    public final zzhnr zzb(zziao zziaoVar) throws GeneralSecurityException {
        this.zzb = zziaoVar;
        return this;
    }

    public final zzhnr zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhns zzd() throws GeneralSecurityException {
        zziao zziaoVar;
        zziam zziamVarZza;
        zzhnz zzhnzVar = this.zza;
        if (zzhnzVar == null || (zziaoVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhnzVar.zzc() != zziaoVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhnzVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhny.zzd) {
            zziamVarZza = zzhmk.zza;
        } else if (this.zza.zzf() == zzhny.zzc || this.zza.zzf() == zzhny.zzb) {
            zziamVarZza = zzhmk.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhny.zza) {
                String strValueOf = String.valueOf(this.zza.zzf());
                String.valueOf(strValueOf);
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(strValueOf)));
            }
            zziamVarZza = zzhmk.zzb(this.zzc.intValue());
        }
        return new zzhns(this.zza, this.zzb, zziamVarZza, this.zzc, null);
    }
}
