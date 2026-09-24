package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzj {
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;

    private zzj() {
    }

    /* synthetic */ zzj(zzi zziVar) {
    }

    public final zzj zza(boolean z) {
        this.zzc = true;
        return this;
    }

    public final zzj zzb(boolean z) {
        this.zza = true;
        return this;
    }

    public final zzj zzc(boolean z) {
        this.zzb = true;
        return this;
    }

    public final zzl zzd() {
        return new zzl(this);
    }
}
