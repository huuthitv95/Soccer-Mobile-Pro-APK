package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhkr {
    final zzhkq zza;
    final long[] zzb;

    zzhkr() {
        this(new zzhkq(), new long[10]);
    }

    zzhkr(zzhkq zzhkqVar, long[] jArr) {
        this.zza = zzhkqVar;
        this.zzb = jArr;
    }

    static /* synthetic */ zzhkr zza(zzhkr zzhkrVar, zzhkp zzhkpVar) {
        zzb(zzhkrVar, zzhkpVar);
        return zzhkrVar;
    }

    private static zzhkr zzb(zzhkr zzhkrVar, zzhkp zzhkpVar) {
        zzhkq zzhkqVar = zzhkpVar.zza;
        zzhkq zzhkqVar2 = zzhkrVar.zza;
        long[] jArr = zzhkqVar2.zza;
        long[] jArr2 = zzhkqVar.zza;
        long[] jArr3 = zzhkpVar.zzb;
        zzhkz.zze(jArr, jArr2, jArr3);
        long[] jArr4 = zzhkqVar2.zzb;
        long[] jArr5 = zzhkqVar.zzb;
        long[] jArr6 = zzhkqVar.zzc;
        zzhkz.zze(jArr4, jArr5, jArr6);
        zzhkz.zze(zzhkqVar2.zzc, jArr6, jArr3);
        zzhkz.zze(zzhkrVar.zzb, jArr2, jArr5);
        return zzhkrVar;
    }

    zzhkr(zzhkp zzhkpVar) {
        this();
        zzb(this, zzhkpVar);
    }
}
