package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhzy implements zzhps {
    final zzhps zza;
    final zzhps zzb;

    /* synthetic */ zzhzy(zzhps zzhpsVar, zzhps zzhpsVar2, byte[] bArr) {
        this.zza = zzhpsVar;
        this.zzb = zzhpsVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhps
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        return bArr.length <= 64 ? this.zza.zza(bArr, i) : this.zzb.zza(bArr, i);
    }
}
