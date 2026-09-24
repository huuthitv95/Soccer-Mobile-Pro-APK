package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqt {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd = 0;

    public final zzqt zza(boolean z) {
        this.zza = z;
        return this;
    }

    public final zzqt zzb(boolean z) {
        this.zzb = z;
        return this;
    }

    public final zzqt zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzqt zzd(int i) {
        this.zzd = i;
        return this;
    }

    public final zzqu zze() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzqu(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }

    final /* synthetic */ boolean zzf() {
        return this.zza;
    }

    final /* synthetic */ boolean zzg() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzc;
    }

    final /* synthetic */ int zzi() {
        return this.zzd;
    }
}
