package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhko extends zzhkn {
    private final long[] zzd;

    zzhko() {
        super(new long[10], new long[10], new long[10]);
        this.zzd = new long[10];
    }

    @Override // com.google.android.gms.internal.ads.zzhkn
    public final void zza(long[] jArr, long[] jArr2) {
        zzhkz.zze(jArr, jArr2, this.zzd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhko(zzhkr zzhkrVar) {
        super(new long[10], new long[10], new long[10]);
        long[] jArr = new long[10];
        this.zzd = jArr;
        long[] jArr2 = this.zza;
        zzhkq zzhkqVar = zzhkrVar.zza;
        zzhkz.zza(jArr2, zzhkqVar.zzb, zzhkqVar.zza);
        long[] jArr3 = this.zzb;
        zzhkq zzhkqVar2 = zzhkrVar.zza;
        zzhkz.zzb(jArr3, zzhkqVar2.zzb, zzhkqVar2.zza);
        System.arraycopy(zzhkrVar.zza.zzc, 0, jArr, 0, 10);
        zzhkz.zze(this.zzc, zzhkrVar.zzb, zzhku.zzb);
    }
}
