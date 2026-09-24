package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzql {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzql zza(boolean z) {
        this.zza = z;
        return this;
    }

    public final zzql zzb(boolean z) {
        this.zzb = z;
        return this;
    }

    public final zzql zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzqm zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzqm(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    final /* synthetic */ boolean zze() {
        return this.zza;
    }

    final /* synthetic */ boolean zzf() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzg() {
        return this.zzc;
    }
}
