package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzagz implements zzafs {
    private final long zzb;
    private final zzafs zzc;

    public zzagz(long j, zzafs zzafsVar) {
        this.zzb = j;
        this.zzc = zzafsVar;
    }

    final /* synthetic */ long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final zzahb zzu(int i, int i2) {
        return this.zzc.zzu(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final void zzv() {
        this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final void zzw(zzags zzagsVar) {
        this.zzc.zzw(new zzagy(this, zzagsVar, zzagsVar));
    }
}
