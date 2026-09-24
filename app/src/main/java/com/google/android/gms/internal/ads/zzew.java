package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzew {
    final /* synthetic */ zzfb zza;
    private final int zzb;
    private Object zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;

    public zzew(zzfb zzfbVar, int i) {
        Objects.requireNonNull(zzfbVar);
        this.zza = zzfbVar;
        this.zzb = i;
    }

    public final void zza() {
        zzfb zzfbVar = this.zza;
        if (zzfbVar.zzd().zzh() != 2 || !zzfbVar.zzd().zzk() || zzfbVar.zzd().zzi() != 0) {
            if (this.zzh) {
                zzfbVar.zzg().zzk(1);
            }
            this.zzh = false;
            return;
        }
        zzbf zzbfVarZzq = zzfbVar.zzd().zzq();
        Object objZzf = zzbfVarZzq.zzg() ? null : zzbfVarZzq.zzf(zzfbVar.zzd().zzr());
        zzbb zzbbVarZzd = zzfbVar.zzd();
        zzbb zzbbVarZzd2 = zzfbVar.zzd();
        zzbb zzbbVarZzd3 = zzfbVar.zzd();
        zzbb zzbbVarZzd4 = zzfbVar.zzd();
        int iZzy = zzbbVarZzd.zzy();
        int iZzz = zzbbVarZzd2.zzz();
        long jZzv = zzbbVarZzd3.zzv();
        long jMax = Math.max(0L, zzfbVar.zzd().zzw() - Math.max(0L, jZzv - zzbbVarZzd4.zzu()));
        if (objZzf != null && iZzy == -1) {
            zzbfVarZzq.zzo(objZzf, zzfbVar.zzf());
            jZzv -= zzfk.zzr(0L);
            iZzy = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzh && Objects.equals(objZzf, this.zzc) && iZzy == this.zzd && iZzz == this.zze && jZzv == this.zzf && jMax == this.zzg) {
            long j = jElapsedRealtime - this.zzi;
            int i = this.zzb;
            if (j >= i) {
                zzfbVar.zze().zza(new zzfc(1, i));
                return;
            }
            return;
        }
        this.zzh = true;
        this.zzi = jElapsedRealtime;
        this.zzc = objZzf;
        this.zzd = iZzy;
        this.zze = iZzz;
        this.zzf = jZzv;
        this.zzg = jMax;
        zzfbVar.zzg().zzk(1);
        zzfbVar.zzg().zzi(1, this.zzb);
    }
}
