package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzmm {
    private static final zzxc zzu = new zzxc(new Object(), -1);
    public final zzbf zza;
    public final zzxc zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzje zzf;
    public final boolean zzg;
    public final zzzf zzh;
    public final zzaba zzi;
    public final List zzj;
    public final zzxc zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzav zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzmm(zzbf zzbfVar, zzxc zzxcVar, long j, long j2, int i, zzje zzjeVar, boolean z, zzzf zzzfVar, zzaba zzabaVar, List list, zzxc zzxcVar2, boolean z2, int i2, int i3, zzav zzavVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.zza = zzbfVar;
        this.zzb = zzxcVar;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
        this.zzf = zzjeVar;
        this.zzg = z;
        this.zzh = zzzfVar;
        this.zzi = zzabaVar;
        this.zzj = list;
        this.zzk = zzxcVar2;
        this.zzl = z2;
        this.zzm = i2;
        this.zzn = i3;
        this.zzo = zzavVar;
        this.zzq = j3;
        this.zzr = j4;
        this.zzs = j5;
        this.zzt = j6;
    }

    public static zzmm zza(zzaba zzabaVar) {
        zzbf zzbfVar = zzbf.zza;
        zzxc zzxcVar = zzu;
        return new zzmm(zzbfVar, zzxcVar, -9223372036854775807L, 0L, 1, null, false, zzzf.zza, zzabaVar, zzgvz.zzi(), zzxcVar, false, 1, 0, zzav.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzxc zzb() {
        return zzu;
    }

    public final zzmm zzc(zzxc zzxcVar, long j, long j2, long j3, long j4, zzzf zzzfVar, zzaba zzabaVar, List list) {
        zzxc zzxcVar2 = this.zzk;
        boolean z = this.zzl;
        int i = this.zzm;
        int i2 = this.zzn;
        zzav zzavVar = this.zzo;
        long j5 = this.zzq;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new zzmm(this.zza, zzxcVar, j2, j3, this.zze, this.zzf, this.zzg, zzzfVar, zzabaVar, list, zzxcVar2, z, i, i2, zzavVar, j5, j4, j, jElapsedRealtime, false);
    }

    public final zzmm zzd(zzbf zzbfVar) {
        return new zzmm(zzbfVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmm zze(int i) {
        return new zzmm(this.zza, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmm zzf(zzje zzjeVar) {
        return new zzmm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzjeVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmm zzg(boolean z) {
        return new zzmm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, z, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmm zzh(zzxc zzxcVar) {
        return new zzmm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzxcVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmm zzi(boolean z, int i, int i2) {
        return new zzmm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i, i2, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzj() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
