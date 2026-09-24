package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzagr implements zzags {
    private final long zza;
    private final zzagq zzb;

    @Override // com.google.android.gms.internal.ads.zzags
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final zzagq zzc(long j) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public /* synthetic */ boolean zzj() {
        return zzags.CC.$default$zzj(this);
    }

    public zzagr(long j, long j2) {
        this.zza = j;
        zzagt zzagtVar = j2 == 0 ? zzagt.zza : new zzagt(0L, j2);
        this.zzb = new zzagq(zzagtVar, zzagtVar);
    }
}
