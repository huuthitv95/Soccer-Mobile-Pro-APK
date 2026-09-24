package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhva extends zzhxd {
    private final zzhut zza;
    private final zziam zzb;
    private final zziam zzc;

    @Nullable
    private final Integer zzd;

    private zzhva(zzhut zzhutVar, zziam zziamVar, zziam zziamVar2, @Nullable Integer num) {
        this.zza = zzhutVar;
        this.zzb = zziamVar;
        this.zzc = zziamVar2;
        this.zzd = num;
    }

    public static zzhva zzc(zzhus zzhusVar, zziam zziamVar, @Nullable Integer num) throws GeneralSecurityException {
        zziam zziamVarZza;
        zzhut zzhutVarZzb = zzhut.zzb(zzhusVar);
        zzhus zzhusVar2 = zzhus.zzd;
        if (!zzhusVar.equals(zzhusVar2) && num == null) {
            String string = zzhusVar.toString();
            StringBuilder sb = new StringBuilder(string.length() + 62);
            sb.append("For given Variant ");
            sb.append(string);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzhusVar.equals(zzhusVar2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zziamVar.zzd() != 32) {
            int iZzd = zziamVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 65);
            sb2.append("Ed25519 key must be constructed with key of length 32 bytes, not ");
            sb2.append(iZzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        if (zzhutVarZzb.zzc() == zzhusVar2) {
            zziamVarZza = zzhmk.zza;
        } else if (zzhutVarZzb.zzc() == zzhus.zzb || zzhutVarZzb.zzc() == zzhus.zzc) {
            zziamVarZza = zzhmk.zza(num.intValue());
        } else {
            if (zzhutVarZzb.zzc() != zzhus.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhutVarZzb.zzc().toString()));
            }
            zziamVarZza = zzhmk.zzb(num.intValue());
        }
        return new zzhva(zzhutVarZzb, zziamVar, zziamVarZza, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhxd, com.google.android.gms.internal.ads.zzhdc
    public final /* synthetic */ zzhdt zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    public final zziam zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhxd
    public final zziam zze() {
        return this.zzc;
    }

    public final zzhut zzf() {
        return this.zza;
    }
}
