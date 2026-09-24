package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhjn implements zzhcu {
    private final zzhcu zza;
    private final byte[] zzb;

    private zzhjn(zzhcu zzhcuVar, byte[] bArr) {
        this.zza = zzhcuVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzhcu zzb(zzhlr zzhlrVar) throws GeneralSecurityException {
        byte[] bArrZzc;
        zzhne zzhneVarZzc = zzhlrVar.zzc(zzhda.zza());
        zzhcu zzhcuVar = (zzhcu) zzhlg.zza().zzc(zzhneVarZzc.zzg(), zzhcu.class).zza(zzhneVarZzc.zzb());
        zzhtb zzhtbVarZzd = zzhneVarZzc.zzd();
        int iOrdinal = zzhtbVarZzd.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = zzhmk.zzb(zzhlrVar.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = zzhmk.zza(zzhlrVar.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                String strValueOf = String.valueOf(zzhtbVarZzd);
                String.valueOf(strValueOf);
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(strValueOf)));
            }
            bArrZzc = zzhmk.zza(zzhlrVar.zzb().intValue()).zzc();
        } else {
            bArrZzc = zzhmk.zza.zzc();
        }
        return new zzhjn(zzhcuVar, bArrZzc);
    }

    public static zzhcu zzc(zzhcu zzhcuVar, zziam zziamVar) {
        return new zzhjn(zzhcuVar, zziamVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzhcu
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzhnq.zze(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
