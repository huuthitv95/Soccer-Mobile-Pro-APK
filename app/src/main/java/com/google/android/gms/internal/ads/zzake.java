package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzake extends zzaff implements zzakn {
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzake(long j, long j2, int i, int i2, boolean z) {
        this(j, j2, i, i2, false, true);
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final long zzf(long j) {
        return zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final long zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final int zzh() {
        return this.zzb;
    }

    public final zzake zzi(long j) {
        return new zzake(j, this.zza, this.zzb, this.zzc, false, false);
    }

    private zzake(long j, long j2, int i, int i2, boolean z, boolean z2) {
        super(j, j2, i, i2, false, z2);
        this.zza = j2;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j == -1 ? -1L : j;
    }

    public zzake(long j, long j2, zzagm zzagmVar, boolean z) {
        this(j, j2, zzagmVar.zzf, zzagmVar.zzc, false, true);
    }
}
