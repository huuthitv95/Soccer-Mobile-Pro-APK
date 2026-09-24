package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzakg implements zzakn {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzakg(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == -9223372036854775807L ? zzfk.zzs(jArr2[jArr2.length - 1]) : j;
    }

    public static zzakg zze(long j, zzajk zzajkVar, long j2) {
        int[] iArr = zzajkVar.zzd;
        int length = iArr.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (zzajkVar.zzb + iArr[i3]);
            j3 += (long) (zzajkVar.zzc + zzajkVar.zze[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new zzakg(jArr, jArr2, j2);
    }

    private static Pair zzi(long j, long[] jArr, long[] jArr2) {
        int iZzo = zzfk.zzo(jArr, j, true, true);
        long j2 = jArr[iZzo];
        long j3 = jArr2[iZzo];
        int i = iZzo + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final zzagq zzc(long j) {
        String str = zzfk.zza;
        Pair pairZzi = zzi(zzfk.zzr(Math.max(0L, Math.min(j, this.zzc))), this.zzb, this.zza);
        zzagt zzagtVar = new zzagt(zzfk.zzs(((Long) pairZzi.first).longValue()), ((Long) pairZzi.second).longValue());
        return new zzagq(zzagtVar, zzagtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final long zzf(long j) {
        return zzfk.zzs(((Long) zzi(j, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final long zzg() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final int zzh() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public /* synthetic */ boolean zzj() {
        return zzags.CC.$default$zzj(this);
    }
}
