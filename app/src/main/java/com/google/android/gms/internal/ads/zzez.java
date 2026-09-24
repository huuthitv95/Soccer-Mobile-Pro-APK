package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzez {
    final /* synthetic */ zzfb zza;
    private final int zzb;
    private Object zzc;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;

    public zzez(zzfb zzfbVar, int i) {
        Objects.requireNonNull(zzfbVar);
        this.zza = zzfbVar;
        this.zzb = i;
    }

    public final void zza() {
        long jZzt;
        zzfb zzfbVar = this.zza;
        zzbf zzbfVarZzq = zzfbVar.zzd().zzq();
        Object objZzf = zzbfVarZzq.zzg() ? null : zzbfVarZzq.zzf(zzfbVar.zzd().zzr());
        zzbb zzbbVarZzd = zzfbVar.zzd();
        zzbb zzbbVarZzd2 = zzfbVar.zzd();
        zzbb zzbbVarZzd3 = zzfbVar.zzd();
        int iZzy = zzbbVarZzd.zzy();
        int iZzz = zzbbVarZzd2.zzz();
        long jZzu = zzbbVarZzd3.zzu();
        if (objZzf == null || iZzy != -1) {
            jZzt = iZzy != -1 ? zzfbVar.zzd().zzt() : -9223372036854775807L;
        } else {
            zzbfVarZzq.zzo(objZzf, zzfbVar.zzf());
            jZzu -= zzfk.zzr(0L);
            jZzt = zzfk.zzr(zzfbVar.zzf().zzd);
            iZzy = -1;
        }
        boolean zZza = zzfbVar.zzd().zza();
        if (!zZza || jZzt == -9223372036854775807L || jZzu < jZzt) {
            zzfbVar.zzg().zzk(3);
            if (zZza && jZzt != -9223372036854775807L) {
                zzfbVar.zzg().zzi(3, (int) Math.ceil((jZzt - jZzu) / zzfbVar.zzd().zzn().zzb));
            }
            this.zzf = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzf && Objects.equals(objZzf, this.zzc) && iZzy == this.zzd && iZzz == this.zze) {
            long j = jElapsedRealtime - this.zzg;
            int i = this.zzb;
            if (j >= i) {
                zzfbVar.zze().zza(new zzfc(3, i));
                return;
            }
            return;
        }
        this.zzf = true;
        this.zzg = jElapsedRealtime;
        this.zzc = objZzf;
        this.zzd = iZzy;
        this.zze = iZzz;
        zzfbVar.zzg().zzk(3);
        zzfbVar.zzg().zzi(3, this.zzb);
    }
}
