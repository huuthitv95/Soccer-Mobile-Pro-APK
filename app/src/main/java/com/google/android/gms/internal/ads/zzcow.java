package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcow {
    private zzcmz zza;
    private zzcpt zzb;
    private zzfpc zzc;
    private zzcqh zzd;
    private zzflp zze;

    private zzcow() {
        throw null;
    }

    /* synthetic */ zzcow(byte[] bArr) {
    }

    public final zzcow zza(zzcmz zzcmzVar) {
        this.zza = zzcmzVar;
        return this;
    }

    public final zzcow zzb(zzcpt zzcptVar) {
        this.zzb = zzcptVar;
        return this;
    }

    public final zzcmx zzc() {
        zzimq.zzc(this.zza, zzcmz.class);
        zzimq.zzc(this.zzb, zzcpt.class);
        if (this.zzc == null) {
            this.zzc = new zzfpc();
        }
        if (this.zzd == null) {
            this.zzd = new zzcqh();
        }
        if (this.zze == null) {
            this.zze = new zzflp();
        }
        return new zzcol(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }
}
