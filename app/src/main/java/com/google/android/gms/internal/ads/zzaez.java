package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaez {
    public static final zzaez zza = new zzaez(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzaez(int i, long j, long j2) {
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzaez zza(long j, long j2) {
        return new zzaez(-1, j, j2);
    }

    public static zzaez zzb(long j, long j2) {
        return new zzaez(-2, j, j2);
    }

    public static zzaez zzc(long j) {
        return new zzaez(0, -9223372036854775807L, j);
    }

    final /* synthetic */ int zzd() {
        return this.zzb;
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ long zzf() {
        return this.zzd;
    }
}
