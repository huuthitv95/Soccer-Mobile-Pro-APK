package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaeg {
    private final Handler zza;
    private final zzaeh zzb;

    public zzaeg(Handler handler, zzaeh zzaehVar) {
        if (zzaehVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzaehVar;
    }

    public final void zza(final zziv zzivVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaef
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzl(zzivVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(str, j, j2);
                }
            });
        }
    }

    public final void zzc(final zzv zzvVar, final zziw zziwVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzn(zzvVar, zziwVar);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzo(i, j);
                }
            });
        }
    }

    public final void zze(final long j, final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzady
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzp(j, i);
                }
            });
        }
    }

    public final void zzf(final zzbv zzbvVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzq(zzbvVar);
                }
            });
        }
    }

    public final void zzg(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaea
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void zzh(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaeb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs(str);
                }
            });
        }
    }

    public final void zzi(final zziv zzivVar) {
        zzivVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaec
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt(zzivVar);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaed
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(exc);
                }
            });
        }
    }

    public final void zzk(final zzit zzitVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaee
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(zzitVar);
                }
            });
        }
    }

    final /* synthetic */ void zzl(zziv zzivVar) {
        String str = zzfk.zza;
        this.zzb.zzb(zzivVar);
    }

    final /* synthetic */ void zzm(String str, long j, long j2) {
        String str2 = zzfk.zza;
        this.zzb.zzc(str, j, j2);
    }

    final /* synthetic */ void zzn(zzv zzvVar, zziw zziwVar) {
        String str = zzfk.zza;
        this.zzb.zzd(zzvVar, zziwVar);
    }

    final /* synthetic */ void zzo(int i, long j) {
        String str = zzfk.zza;
        this.zzb.zze(i, j);
    }

    final /* synthetic */ void zzp(long j, int i) {
        String str = zzfk.zza;
        this.zzb.zzj(j, i);
    }

    final /* synthetic */ void zzq(zzbv zzbvVar) {
        String str = zzfk.zza;
        this.zzb.zzf(zzbvVar);
    }

    final /* synthetic */ void zzr(Object obj, long j) {
        String str = zzfk.zza;
        this.zzb.zzg(obj, j);
    }

    final /* synthetic */ void zzs(String str) {
        String str2 = zzfk.zza;
        this.zzb.zzh(str);
    }

    final /* synthetic */ void zzt(zziv zzivVar) {
        zzivVar.zza();
        String str = zzfk.zza;
        this.zzb.zzi(zzivVar);
    }

    final /* synthetic */ void zzu(Exception exc) {
        String str = zzfk.zza;
        this.zzb.zzk(exc);
    }

    final /* synthetic */ void zzv(zzit zzitVar) {
        String str = zzfk.zza;
        this.zzb.zzz(zzitVar);
    }
}
