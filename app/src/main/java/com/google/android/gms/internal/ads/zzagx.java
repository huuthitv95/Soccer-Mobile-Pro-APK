package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzagx extends zzagd {
    private final long zza;

    public zzagx(zzafq zzafqVar, long j) {
        super(zzafqVar);
        zzgsw.zza(zzafqVar.zzn() >= j);
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.ads.zzagd, com.google.android.gms.internal.ads.zzafq
    public final long zzm() {
        return super.zzm() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzagd, com.google.android.gms.internal.ads.zzafq
    public final long zzn() {
        return super.zzn() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzagd, com.google.android.gms.internal.ads.zzafq
    public final long zzo() {
        return super.zzo() - this.zza;
    }
}
