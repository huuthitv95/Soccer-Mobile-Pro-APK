package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhum {

    @Nullable
    private zzhuj zza = null;

    @Nullable
    private ECPoint zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhum() {
    }

    /* synthetic */ zzhum(byte[] bArr) {
    }

    public final zzhum zza(zzhuj zzhujVar) {
        this.zza = zzhujVar;
        return this;
    }

    public final zzhum zzb(ECPoint eCPoint) {
        this.zzb = eCPoint;
        return this;
    }

    public final zzhum zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhun zzd() throws GeneralSecurityException {
        zziam zziamVarZza;
        zzhuj zzhujVar = this.zza;
        if (zzhujVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ECPoint eCPoint = this.zzb;
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        zzhkw.zza(eCPoint, zzhujVar.zzd().zza().getCurve());
        if (this.zza.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhui.zzd) {
            zziamVarZza = zzhmk.zza;
        } else if (this.zza.zzf() == zzhui.zzc || this.zza.zzf() == zzhui.zzb) {
            zziamVarZza = zzhmk.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhui.zza) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(this.zza.zzf().toString()));
            }
            zziamVarZza = zzhmk.zzb(this.zzc.intValue());
        }
        return new zzhun(this.zza, this.zzb, zziamVarZza, this.zzc, null);
    }
}
