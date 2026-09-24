package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzey {
    final /* synthetic */ zzfb zza;
    private final int zzb;
    private Object zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private boolean zzg;
    private long zzh;

    public zzey(zzfb zzfbVar, int i) {
        Objects.requireNonNull(zzfbVar);
        this.zza = zzfbVar;
        this.zzb = i;
    }

    public final void zza() {
        zzfb zzfbVar = this.zza;
        if (!zzfbVar.zzd().zza()) {
            if (this.zzg) {
                zzfbVar.zzg().zzk(2);
            }
            this.zzg = false;
            return;
        }
        zzbf zzbfVarZzq = zzfbVar.zzd().zzq();
        Object objZzf = zzbfVarZzq.zzg() ? null : zzbfVarZzq.zzf(zzfbVar.zzd().zzr());
        zzbb zzbbVarZzd = zzfbVar.zzd();
        zzbb zzbbVarZzd2 = zzfbVar.zzd();
        zzbb zzbbVarZzd3 = zzfbVar.zzd();
        int iZzy = zzbbVarZzd.zzy();
        int iZzz = zzbbVarZzd2.zzz();
        long jZzu = zzbbVarZzd3.zzu();
        if (objZzf != null && iZzy == -1) {
            zzbfVarZzq.zzo(objZzf, zzfbVar.zzf());
            jZzu -= zzfk.zzr(0L);
            iZzy = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzg && Objects.equals(objZzf, this.zzc) && iZzy == this.zzd && iZzz == this.zze && jZzu == this.zzf) {
            long j = jElapsedRealtime - this.zzh;
            int i = this.zzb;
            if (j >= i) {
                zzfbVar.zze().zza(new zzfc(2, i));
                return;
            }
            return;
        }
        this.zzg = true;
        this.zzh = jElapsedRealtime;
        this.zzc = objZzf;
        this.zzd = iZzy;
        this.zze = iZzz;
        this.zzf = jZzu;
        zzfbVar.zzg().zzk(2);
        zzfbVar.zzg().zzi(2, this.zzb);
    }
}
