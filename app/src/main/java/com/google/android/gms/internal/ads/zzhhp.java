package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhhp extends zzhek {
    private final zzhhu zza;
    private final zziao zzb;
    private final zziam zzc;

    @Nullable
    private final Integer zzd;

    private zzhhp(zzhhu zzhhuVar, zziao zziaoVar, zziam zziamVar, @Nullable Integer num) {
        this.zza = zzhhuVar;
        this.zzb = zziaoVar;
        this.zzc = zziamVar;
        this.zzd = num;
    }

    @Override // com.google.android.gms.internal.ads.zzhek, com.google.android.gms.internal.ads.zzhdc
    public final /* synthetic */ zzhdt zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final zziam zzc() {
        return this.zzc;
    }

    public final zziao zze() {
        return this.zzb;
    }

    public final zzhhu zzf() {
        return this.zza;
    }

    public static zzhhp zzd(zzhhu zzhhuVar, zziao zziaoVar, @Nullable Integer num) throws GeneralSecurityException {
        zziam zziamVarZzb;
        zzhht zzhhtVarZzc = zzhhuVar.zzc();
        zzhht zzhhtVar = zzhht.zzb;
        if (zzhhtVarZzc != zzhhtVar && num == null) {
            String string = zzhhuVar.zzc().toString();
            StringBuilder sb = new StringBuilder(string.length() + 62);
            sb.append("For given Variant ");
            sb.append(string);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzhhuVar.zzc() == zzhhtVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zziaoVar.zzd() != 32) {
            int iZzd = zziaoVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 68);
            sb2.append("XAesGcmKey key must be constructed with key of length 32 bytes, not ");
            sb2.append(iZzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        if (zzhhuVar.zzc() == zzhhtVar) {
            zziamVarZzb = zzhmk.zza;
        } else {
            if (zzhhuVar.zzc() != zzhht.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhhuVar.zzc().toString()));
            }
            zziamVarZzb = zzhmk.zzb(num.intValue());
        }
        return new zzhhp(zzhhuVar, zziaoVar, zziamVarZzb, num);
    }
}
