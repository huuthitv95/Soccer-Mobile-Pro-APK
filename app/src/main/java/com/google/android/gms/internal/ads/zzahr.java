package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzahr {
    private final zzahq zza;
    private final zzahb zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private long[] zzm;
    private int[] zzn;

    public zzahr(int i, zzahq zzahqVar, zzahb zzahbVar) {
        this.zza = zzahqVar;
        int iZzc = zzahqVar.zzc();
        boolean z = true;
        if (iZzc != 1) {
            if (iZzc == 2) {
                iZzc = 2;
            } else {
                z = false;
            }
        }
        zzgsw.zza(z);
        this.zzc = zzj(i, iZzc == 2 ? 1667497984 : 1651965952);
        this.zze = zzahqVar.zzd();
        this.zzb = zzahbVar;
        this.zzd = iZzc == 2 ? zzj(i, 1650720768) : -1;
        this.zzl = -1L;
        this.zzm = new long[512];
        this.zzn = new int[512];
        this.zzf = zzahqVar.zzd;
    }

    private final long zzh(int i) {
        return (this.zze * ((long) i)) / ((long) this.zzf);
    }

    private final zzagt zzi(int i) {
        return new zzagt(((long) this.zzn[i]) * zzh(1), this.zzm[i]);
    }

    private static int zzj(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    public final void zza(long j, boolean z) {
        if (this.zzl == -1) {
            this.zzl = j;
        }
        if (z) {
            if (this.zzk == this.zzn.length) {
                long[] jArr = this.zzm;
                this.zzm = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzn;
                this.zzn = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzm;
            int i = this.zzk;
            jArr2[i] = j;
            this.zzn[i] = this.zzj;
            this.zzk = i + 1;
        }
        this.zzj++;
    }

    public final void zzb() {
        int i;
        this.zzm = Arrays.copyOf(this.zzm, this.zzk);
        this.zzn = Arrays.copyOf(this.zzn, this.zzk);
        if ((this.zzc & 1651965952) != 1651965952 || this.zza.zzf == 0 || (i = this.zzk) <= 0) {
            return;
        }
        this.zzf = i;
    }

    public final boolean zzc(int i) {
        return this.zzc == i || this.zzd == i;
    }

    public final void zzd(int i) {
        this.zzg = i;
        this.zzh = i;
    }

    public final boolean zze(zzafq zzafqVar) throws IOException {
        int i = this.zzh;
        zzahb zzahbVar = this.zzb;
        int iZza = i - zzahbVar.zza(zzafqVar, i, false);
        this.zzh = iZza;
        boolean z = iZza == 0;
        if (z) {
            if (this.zzg > 0) {
                zzahbVar.zze(zzh(this.zzi), Arrays.binarySearch(this.zzn, this.zzi) >= 0 ? 1 : 0, this.zzg, 0, null);
            }
            this.zzi++;
        }
        return z;
    }

    public final void zzf(long j) {
        if (this.zzk == 0) {
            this.zzi = 0;
        } else {
            this.zzi = this.zzn[zzfk.zzo(this.zzm, j, true, true)];
        }
    }

    public final zzagq zzg(long j) {
        if (this.zzk == 0) {
            zzagt zzagtVar = new zzagt(0L, this.zzl);
            return new zzagq(zzagtVar, zzagtVar);
        }
        int iZzh = (int) (j / zzh(1));
        int iZzn = zzfk.zzn(this.zzn, iZzh, true, true);
        if (this.zzn[iZzn] == iZzh) {
            zzagt zzagtVarZzi = zzi(iZzn);
            return new zzagq(zzagtVarZzi, zzagtVarZzi);
        }
        zzagt zzagtVarZzi2 = zzi(iZzn);
        int i = iZzn + 1;
        return i < this.zzm.length ? new zzagq(zzagtVarZzi2, zzi(i)) : new zzagq(zzagtVarZzi2, zzagtVarZzi2);
    }
}
