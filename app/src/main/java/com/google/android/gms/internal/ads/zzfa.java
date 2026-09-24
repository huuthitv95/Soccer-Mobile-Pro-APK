package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfa {
    final /* synthetic */ zzfb zza;
    private final int zzb;
    private int zzc;
    private boolean zzd;
    private long zze;

    public zzfa(zzfb zzfbVar, int i) {
        Objects.requireNonNull(zzfbVar);
        this.zza = zzfbVar;
        this.zzb = i;
    }

    public final void zza() {
        zzfb zzfbVar = this.zza;
        int iZzi = zzfbVar.zzd().zzi();
        if (!zzfbVar.zzd().zzk() || zzfbVar.zzd().zzh() == 1 || zzfbVar.zzd().zzh() == 4 || iZzi == 0 || iZzi == 1) {
            if (this.zzd) {
                zzfbVar.zzg().zzk(4);
            }
            this.zzd = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzd && this.zzc == iZzi) {
            long j = jElapsedRealtime - this.zze;
            int i = this.zzb;
            if (j >= i) {
                zzfbVar.zze().zza(new zzfc(4, i));
                return;
            }
            return;
        }
        this.zzd = true;
        this.zze = jElapsedRealtime;
        this.zzc = iZzi;
        zzfbVar.zzg().zzk(4);
        zzfbVar.zzg().zzi(4, this.zzb);
    }
}
