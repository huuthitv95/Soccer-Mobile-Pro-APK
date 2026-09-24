package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Random;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfsi {
    private final long zza;
    private final long zzb;
    private final Clock zzf;
    private long zzg;
    private long zzd = 5;
    private long zze = 0;
    private final Random zzh = new Random();
    private long zzc = 0;

    public zzfsi(long j, double d, long j2, double d2, Clock clock) {
        this.zza = j;
        this.zzb = j2;
        this.zzf = clock;
        zza();
    }

    public final void zza() {
        this.zzg = this.zza;
        this.zzc = 0L;
        this.zze = 0L;
    }

    public final long zzb() {
        double d = this.zzg;
        double d2 = 0.2d * d;
        long j = (long) (d + d2);
        long j2 = (long) (d - d2);
        return j2 + ((long) (this.zzh.nextDouble() * ((j - j2) + 1)));
    }

    public final void zzc() {
        this.zze = this.zzf.currentTimeMillis() + zzb();
        double d = this.zzg;
        this.zzg = Math.min((long) (d + d), this.zzb);
        this.zzc++;
    }

    public final boolean zzd() {
        return this.zzf.currentTimeMillis() < this.zze;
    }

    public final boolean zze() {
        zzbhv zzbhvVar = zzbie.zzI;
        return ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).intValue() >= 0 && this.zzc > Math.max(this.zzd, (long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).intValue()) && this.zzg >= this.zzb;
    }

    public final synchronized void zzf(int i) {
        Preconditions.checkArgument(i > 0);
        this.zzd = i;
    }
}
