package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
class zzhkn {
    final long[] zza;
    final long[] zzb;
    final long[] zzc;

    zzhkn() {
        this(new long[10], new long[10], new long[10]);
    }

    zzhkn(long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = jArr3;
    }

    void zza(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    final void zzb(zzhkn zzhknVar, int i) {
        zzhkm.zza(this.zza, zzhknVar.zza, i);
        zzhkm.zza(this.zzb, zzhknVar.zzb, i);
        zzhkm.zza(this.zzc, zzhknVar.zzc, i);
    }

    zzhkn(zzhkn zzhknVar) {
        this.zza = Arrays.copyOf(zzhknVar.zza, 10);
        this.zzb = Arrays.copyOf(zzhknVar.zzb, 10);
        this.zzc = Arrays.copyOf(zzhknVar.zzc, 10);
    }
}
