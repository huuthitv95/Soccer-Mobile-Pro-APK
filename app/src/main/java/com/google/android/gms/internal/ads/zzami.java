package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzami implements zzamo {
    private final zzagc zza;
    private final zzagb zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzami(zzagc zzagcVar, zzagb zzagbVar) {
        this.zza = zzagcVar;
        this.zzb = zzagbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamo
    public final long zza(zzafq zzafqVar) {
        long j = this.zzd;
        if (j < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzamo
    public final void zzb(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzfk.zzo(jArr, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzamo
    public final zzags zzc() {
        zzgsw.zzi(this.zzc != -1);
        return new zzaga(this.zza, this.zzc);
    }

    public final void zzd(long j) {
        this.zzc = j;
    }
}
