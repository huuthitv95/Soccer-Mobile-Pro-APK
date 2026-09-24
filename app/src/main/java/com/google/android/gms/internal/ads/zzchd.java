package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzchd implements Runnable {
    private final zzcgp zza;
    private boolean zzb = false;

    zzchd(zzcgp zzcgpVar) {
        this.zza = zzcgpVar;
    }

    private final void zzc() {
        zzfzw zzfzwVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzfzwVar.removeCallbacks(this);
        zzfzwVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzF();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzF();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
