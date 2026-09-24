package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhkp {
    final zzhkq zza;
    final long[] zzb;

    zzhkp() {
        this(new zzhkq(), new long[10]);
    }

    zzhkp(zzhkq zzhkqVar, long[] jArr) {
        this.zza = zzhkqVar;
        this.zzb = jArr;
    }

    zzhkp(zzhkp zzhkpVar) {
        this.zza = new zzhkq(zzhkpVar.zza);
        this.zzb = Arrays.copyOf(zzhkpVar.zzb, 10);
    }
}
