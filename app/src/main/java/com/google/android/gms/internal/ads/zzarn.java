package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzarn implements zzags {
    private final zzark zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzarn(zzark zzarkVar, int i, long j, long j2) {
        this.zza = zzarkVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / ((long) zzarkVar.zzd);
        this.zzd = j3;
        this.zze = zze(j3);
    }

    private final long zze(long j) {
        return zzfk.zzv(j * ((long) this.zzb), 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final zzagq zzc(long j) {
        long j2 = this.zzb;
        zzark zzarkVar = this.zza;
        long j3 = (((long) zzarkVar.zzc) * j) / (j2 * 1000000);
        String str = zzfk.zza;
        long j4 = this.zzd - 1;
        long jMax = Math.max(0L, Math.min(j3, j4));
        long j5 = zzarkVar.zzd;
        long jZze = zze(jMax);
        long j6 = this.zzc;
        zzagt zzagtVar = new zzagt(jZze, (jMax * j5) + j6);
        if (jZze >= j || jMax == j4) {
            return new zzagq(zzagtVar, zzagtVar);
        }
        long j7 = jMax + 1;
        return new zzagq(zzagtVar, new zzagt(zze(j7), j6 + (j5 * j7)));
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public /* synthetic */ boolean zzj() {
        return zzags.CC.$default$zzj(this);
    }
}
