package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhkv {
    static final zzhkv zzd = new zzhkv(BigInteger.ONE, BigInteger.ONE, BigInteger.ZERO);
    final BigInteger zza;
    final BigInteger zzb;
    final BigInteger zzc;

    zzhkv(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zza = bigInteger;
        this.zzb = bigInteger2;
        this.zzc = bigInteger3;
    }

    final boolean zza() {
        return this.zzc.equals(BigInteger.ZERO);
    }
}
