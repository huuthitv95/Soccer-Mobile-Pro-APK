package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzll {
    public zzmm zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzll(zzmm zzmmVar) {
        this.zza = zzmmVar;
    }

    public final void zza(int i) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i);
        this.zzb += i;
    }

    public final void zzb(zzmm zzmmVar) {
        this.zze |= this.zza != zzmmVar;
        this.zza = zzmmVar;
    }

    public final void zzc(int i) {
        if (this.zzc && this.zzd != 5) {
            zzgsw.zza(i == 5);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i;
    }

    final /* synthetic */ boolean zzd() {
        return this.zze;
    }
}
