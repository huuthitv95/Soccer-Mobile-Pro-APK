package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbtc extends zzcfr {
    private final Object zza = new Object();
    private final zzbth zzb;
    private boolean zzc;

    public zzbtc(zzbth zzbthVar) {
        this.zzb = zzbthVar;
    }

    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("release: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock acquired");
            if (this.zzc) {
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock already released");
                return;
            }
            this.zzc = true;
            zze(new zzbsz(this), new zzcfn());
            zze(new zzbta(this), new zzbtb(this));
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock released");
        }
    }

    final /* synthetic */ zzbth zzb() {
        return this.zzb;
    }
}
