package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzyn implements zzabc {
    public long zza;
    public long zzb;
    public zzabb zzc;
    public zzyn zzd;

    public zzyn(long j, int i) {
        zza(j, 65536);
    }

    public final void zza(long j, int i) {
        zzgsw.zzi(this.zzc == null);
        this.zza = j;
        this.zzb = j + PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }

    public final int zzb(long j) {
        long j2 = j - this.zza;
        int i = this.zzc.zzb;
        return (int) j2;
    }

    public final zzyn zzc() {
        this.zzc = null;
        zzyn zzynVar = this.zzd;
        this.zzd = null;
        return zzynVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final zzabc zze() {
        zzyn zzynVar = this.zzd;
        if (zzynVar == null || zzynVar.zzc == null) {
            return null;
        }
        return zzynVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final zzabb zzd() {
        zzabb zzabbVar = this.zzc;
        zzabbVar.getClass();
        return zzabbVar;
    }
}
