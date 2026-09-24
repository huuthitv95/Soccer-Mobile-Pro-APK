package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhgv extends zzhek {
    private final zzhgz zza;
    private final zziam zzb;

    @Nullable
    private final Integer zzc;

    private zzhgv(zzhgz zzhgzVar, zziam zziamVar, @Nullable Integer num) {
        this.zza = zzhgzVar;
        this.zzb = zziamVar;
        this.zzc = num;
    }

    public static zzhgv zzd(zzhgz zzhgzVar, @Nullable Integer num) throws GeneralSecurityException {
        zziam zziamVarZzb;
        if (zzhgzVar.zzc() == zzhgy.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zziamVarZzb = zzhmk.zza;
        } else {
            if (zzhgzVar.zzc() != zzhgy.zza) {
                String strValueOf = String.valueOf(zzhgzVar.zzc());
                String.valueOf(strValueOf);
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(strValueOf)));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zziamVarZzb = zzhmk.zzb(num.intValue());
        }
        return new zzhgv(zzhgzVar, zziamVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhek, com.google.android.gms.internal.ads.zzhdc
    public final /* synthetic */ zzhdt zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final Integer zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final zziam zzc() {
        return this.zzb;
    }

    public final zzhgz zze() {
        return this.zza;
    }
}
