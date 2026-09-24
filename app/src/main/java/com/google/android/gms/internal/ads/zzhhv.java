package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhhv extends zzhek {
    private final zzhib zza;
    private final zziao zzb;
    private final zziam zzc;

    @Nullable
    private final Integer zzd;

    private zzhhv(zzhib zzhibVar, zziao zziaoVar, zziam zziamVar, @Nullable Integer num) {
        this.zza = zzhibVar;
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

    public final zzhib zzf() {
        return this.zza;
    }

    public static zzhhv zzd(zzhia zzhiaVar, zziao zziaoVar, @Nullable Integer num) throws GeneralSecurityException {
        zziam zziamVarZzb;
        zzhia zzhiaVar2 = zzhia.zzc;
        if (zzhiaVar != zzhiaVar2 && num == null) {
            String string = zzhiaVar.toString();
            StringBuilder sb = new StringBuilder(string.length() + 62);
            sb.append("For given Variant ");
            sb.append(string);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzhiaVar == zzhiaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zziaoVar.zzd() != 32) {
            int iZzd = zziaoVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 75);
            sb2.append("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb2.append(iZzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        zzhib zzhibVarZzb = zzhib.zzb(zzhiaVar);
        if (zzhibVarZzb.zzc() == zzhiaVar2) {
            zziamVarZzb = zzhmk.zza;
        } else if (zzhibVarZzb.zzc() == zzhia.zzb) {
            zziamVarZzb = zzhmk.zza(num.intValue());
        } else {
            if (zzhibVarZzb.zzc() != zzhia.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhibVarZzb.zzc().toString()));
            }
            zziamVarZzb = zzhmk.zzb(num.intValue());
        }
        return new zzhhv(zzhibVarZzb, zziaoVar, zziamVarZzb, num);
    }
}
