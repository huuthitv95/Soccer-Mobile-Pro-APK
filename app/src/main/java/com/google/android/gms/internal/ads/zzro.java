package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzro {
    private final Handler zza;
    private final zzrp zzb;

    public zzro(Handler handler, zzrp zzrpVar) {
        if (zzrpVar == null) {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzrpVar;
    }

    final /* synthetic */ void zzA(int i) {
        String str = zzfk.zza;
        this.zzb.zzx(i);
    }

    final /* synthetic */ void zzB(zzit zzitVar) {
        String str = zzfk.zza;
        this.zzb.zzy(zzitVar);
    }

    public final void zza(final zziv zzivVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzo(zzivVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzra
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzp(str, j, j2);
                }
            });
        }
    }

    public final void zzc(final zzv zzvVar, final zziw zziwVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzre
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzq(zzvVar, zziwVar);
                }
            });
        }
    }

    public final void zzd(final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr(j);
                }
            });
        }
    }

    public final void zze(final int i, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs(i, j, j2);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt(str);
                }
            });
        }
    }

    public final void zzg(final zziv zzivVar) {
        zzivVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzri
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(zzivVar);
                }
            });
        }
    }

    public final void zzh(final boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(z);
                }
            });
        }
    }

    public final void zzi(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzw(exc);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzx(exc);
                }
            });
        }
    }

    public final void zzk(final zzrq zzrqVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzy(zzrqVar);
                }
            });
        }
    }

    public final void zzl(final zzrq zzrqVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzz(zzrqVar);
                }
            });
        }
    }

    public final void zzm(final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzA(i);
                }
            });
        }
    }

    public final void zzn(final zzit zzitVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzB(zzitVar);
                }
            });
        }
    }

    final /* synthetic */ void zzo(zziv zzivVar) {
        String str = zzfk.zza;
        this.zzb.zzl(zzivVar);
    }

    final /* synthetic */ void zzp(String str, long j, long j2) {
        String str2 = zzfk.zza;
        this.zzb.zzm(str, j, j2);
    }

    final /* synthetic */ void zzq(zzv zzvVar, zziw zziwVar) {
        String str = zzfk.zza;
        this.zzb.zzn(zzvVar, zziwVar);
    }

    final /* synthetic */ void zzr(long j) {
        String str = zzfk.zza;
        this.zzb.zzo(j);
    }

    final /* synthetic */ void zzs(int i, long j, long j2) {
        String str = zzfk.zza;
        this.zzb.zzp(i, j, j2);
    }

    final /* synthetic */ void zzt(String str) {
        String str2 = zzfk.zza;
        this.zzb.zzq(str);
    }

    final /* synthetic */ void zzu(zziv zzivVar) {
        zzivVar.zza();
        String str = zzfk.zza;
        this.zzb.zzr(zzivVar);
    }

    final /* synthetic */ void zzv(boolean z) {
        String str = zzfk.zza;
        this.zzb.zzs(z);
    }

    final /* synthetic */ void zzw(Exception exc) {
        String str = zzfk.zza;
        this.zzb.zzt(exc);
    }

    final /* synthetic */ void zzx(Exception exc) {
        String str = zzfk.zza;
        this.zzb.zzu(exc);
    }

    final /* synthetic */ void zzy(zzrq zzrqVar) {
        String str = zzfk.zza;
        this.zzb.zzv(zzrqVar);
    }

    final /* synthetic */ void zzz(zzrq zzrqVar) {
        String str = zzfk.zza;
        this.zzb.zzw(zzrqVar);
    }
}
