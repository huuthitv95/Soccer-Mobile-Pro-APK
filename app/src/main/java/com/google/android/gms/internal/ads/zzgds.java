package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgds implements zzgdm {
    private final int zza;
    private final byte[] zzb;

    zzgds(int i, byte[] bArr) {
        this.zza = i;
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgdm
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgdm
    public final String zzb() throws IOException {
        return new String(this.zzb);
    }
}
