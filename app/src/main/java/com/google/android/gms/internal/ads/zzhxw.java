package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhxw implements zzhdv {
    private zzhxw(zzhdv zzhdvVar, byte[] bArr, byte[] bArr2) {
    }

    public static zzhdv zzb(zzhlr zzhlrVar) throws GeneralSecurityException {
        zzhne zzhneVarZzc = zzhlrVar.zzc(zzhda.zza());
        return new zzhxw((zzhdv) zzhlg.zza().zzc(zzhneVarZzc.zzg(), zzhdv.class).zza(zzhneVarZzc.zzb()), zzhxx.zzc(zzhneVarZzc), zzhxx.zzd(zzhneVarZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzhdv
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
