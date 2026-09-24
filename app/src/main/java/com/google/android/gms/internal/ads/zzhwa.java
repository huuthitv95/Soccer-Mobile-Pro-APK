package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhwa implements zzhdw {
    private final zzhmu zza;

    public zzhwa(zzhmu zzhmuVar, zzhlv zzhlvVar) {
        this.zza = zzhmuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhdw
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zzhvz zzhvzVar : this.zza.zza(bArr)) {
            try {
                zzhvzVar.zza.zza(bArr, bArr2);
                int i = zzhvzVar.zzb;
                int length = bArr2.length;
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
