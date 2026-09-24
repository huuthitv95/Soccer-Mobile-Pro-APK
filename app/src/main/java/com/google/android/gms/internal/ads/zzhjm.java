package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhjm extends zzhjk {
    public zzhjm(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhjk
    final zzhji zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzhjl(bArr, i);
    }
}
