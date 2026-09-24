package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfq {
    private final zzfp zza;
    private final zzdy zzb;
    private final zzdy zzc;
    private boolean zzd;
    private boolean zze;

    public zzfq(Context context, Looper looper, zzdo zzdoVar) {
        this.zza = new zzfp(context.getApplicationContext());
        this.zzb = zzdoVar.zzd(looper, null);
        this.zzc = zzdoVar.zzd(Looper.getMainLooper(), null);
    }

    private final void zzg(final boolean z, final boolean z2) {
        if (zzh(z, z2)) {
            this.zzb.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zze(z, z2);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.zzc.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(atomicBoolean);
            }
        }, 1000L);
        this.zzb.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(atomicBoolean, z, z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzh(boolean z, boolean z2) {
        return z && z2;
    }

    public final void zza(boolean z) {
        if (this.zzd == z) {
            return;
        }
        this.zzd = z;
        zzg(z, this.zze);
    }

    public final void zzb(boolean z) {
        if (this.zze == z) {
            return;
        }
        this.zze = z;
        if (this.zzd) {
            zzg(true, z);
        }
    }

    final /* synthetic */ void zzc(final AtomicBoolean atomicBoolean) {
        if (atomicBoolean.get()) {
            final zzfp zzfpVar = this.zza;
            new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfpVar.zza(atomicBoolean);
                }
            }, "ExoPlayer:WakeLockManager").start();
        }
    }

    final /* synthetic */ void zzd(AtomicBoolean atomicBoolean, boolean z, boolean z2) {
        atomicBoolean.set(false);
        this.zza.zzb(z, z2);
    }

    final /* synthetic */ void zze(boolean z, boolean z2) {
        this.zza.zzb(z, z2);
    }
}
