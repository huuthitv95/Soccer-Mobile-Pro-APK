package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzafb {
    protected final zzaev zza;
    protected final zzafa zzb;
    protected zzaex zzc;
    private final int zzd;

    protected zzafb(zzaey zzaeyVar, zzafa zzafaVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzafaVar;
        this.zzd = i;
        this.zza = new zzaev(zzaeyVar, j, 0L, j3, j4, j5, j6);
    }

    protected static final int zzf(zzafq zzafqVar, long j, zzagp zzagpVar) {
        if (j == zzafqVar.zzn()) {
            return 0;
        }
        zzagpVar.zza = j;
        return 1;
    }

    protected static final boolean zzg(zzafq zzafqVar, long j) throws IOException {
        long jZzn = j - zzafqVar.zzn();
        if (jZzn < 0 || jZzn > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        zzafqVar.zzf((int) jZzn);
        return true;
    }

    public final zzags zza() {
        return this.zza;
    }

    public final void zzb(long j) {
        zzaex zzaexVar = this.zzc;
        if (zzaexVar == null || zzaexVar.zze() != j) {
            zzaev zzaevVar = this.zza;
            this.zzc = new zzaex(j, zzaevVar.zzd(j), 0L, zzaevVar.zze(), zzaevVar.zzf(), zzaevVar.zzg(), zzaevVar.zzh());
        }
    }

    public final boolean zzc() {
        return this.zzc != null;
    }

    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        while (true) {
            zzaex zzaexVar = this.zzc;
            zzaexVar.getClass();
            long jZzb = zzaexVar.zzb();
            long jZzc = zzaexVar.zzc();
            long jZzh = zzaexVar.zzh();
            if (jZzc - jZzb <= this.zzd) {
                zze(false, jZzb);
                return zzf(zzafqVar, jZzb, zzagpVar);
            }
            if (!zzg(zzafqVar, jZzh)) {
                return zzf(zzafqVar, jZzh, zzagpVar);
            }
            zzafqVar.zzl();
            zzaez zzaezVarZza = this.zzb.zza(zzafqVar, zzaexVar.zzd());
            int iZzd = zzaezVarZza.zzd();
            if (iZzd == -3) {
                zze(false, jZzh);
                return zzf(zzafqVar, jZzh, zzagpVar);
            }
            if (iZzd == -2) {
                zzaexVar.zzf(zzaezVarZza.zze(), zzaezVarZza.zzf());
            } else {
                if (iZzd != -1) {
                    zzg(zzafqVar, zzaezVarZza.zzf());
                    zze(true, zzaezVarZza.zzf());
                    return zzf(zzafqVar, zzaezVarZza.zzf(), zzagpVar);
                }
                zzaexVar.zzg(zzaezVarZza.zze(), zzaezVarZza.zzf());
            }
        }
    }

    protected final void zze(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }
}
