package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhga extends zzhek {
    private final zzhgf zza;
    private final zziao zzb;
    private final zziam zzc;

    @Nullable
    private final Integer zzd;

    private zzhga(zzhgf zzhgfVar, zziao zziaoVar, zziam zziamVar, @Nullable Integer num) {
        this.zza = zzhgfVar;
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

    public final zzhgf zzf() {
        return this.zza;
    }

    public static zzhga zzd(zzhge zzhgeVar, zziao zziaoVar, @Nullable Integer num) throws GeneralSecurityException {
        zziam zziamVarZzb;
        zzhge zzhgeVar2 = zzhge.zzc;
        if (zzhgeVar != zzhgeVar2 && num == null) {
            String string = zzhgeVar.toString();
            StringBuilder sb = new StringBuilder(string.length() + 62);
            sb.append("For given Variant ");
            sb.append(string);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzhgeVar == zzhgeVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zziaoVar.zzd() != 32) {
            int iZzd = zziaoVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 74);
            sb2.append("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb2.append(iZzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        zzhgf zzhgfVarZzb = zzhgf.zzb(zzhgeVar);
        if (zzhgfVarZzb.zzc() == zzhgeVar2) {
            zziamVarZzb = zzhmk.zza;
        } else if (zzhgfVarZzb.zzc() == zzhge.zzb) {
            zziamVarZzb = zzhmk.zza(num.intValue());
        } else {
            if (zzhgfVarZzb.zzc() != zzhge.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhgfVarZzb.zzc().toString()));
            }
            zziamVarZzb = zzhmk.zzb(num.intValue());
        }
        return new zzhga(zzhgfVarZzb, zziaoVar, zziamVarZzb, num);
    }
}
