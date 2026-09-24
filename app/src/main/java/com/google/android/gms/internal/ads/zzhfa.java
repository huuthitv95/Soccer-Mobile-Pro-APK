package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhfa {

    @Nullable
    private zzhfh zza = null;

    @Nullable
    private zziao zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhfa() {
    }

    /* synthetic */ zzhfa(byte[] bArr) {
    }

    public final zzhfa zza(zzhfh zzhfhVar) {
        this.zza = zzhfhVar;
        return this;
    }

    public final zzhfa zzb(zziao zziaoVar) {
        this.zzb = zziaoVar;
        return this;
    }

    public final zzhfa zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhfb zzd() throws GeneralSecurityException {
        zziao zziaoVar;
        zziam zziamVarZzb;
        zzhfh zzhfhVar = this.zza;
        if (zzhfhVar == null || (zziaoVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhfhVar.zzc() != zziaoVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhfhVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzhfg.zzc) {
            zziamVarZzb = zzhmk.zza;
        } else if (this.zza.zze() == zzhfg.zzb) {
            zziamVarZzb = zzhmk.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhfg.zza) {
                String strValueOf = String.valueOf(this.zza.zze());
                String.valueOf(strValueOf);
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(strValueOf)));
            }
            zziamVarZzb = zzhmk.zzb(this.zzc.intValue());
        }
        return new zzhfb(this.zza, this.zzb, zziamVarZzb, this.zzc, null);
    }
}
