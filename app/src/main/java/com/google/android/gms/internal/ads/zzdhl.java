package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdhl implements zzdfl {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbS)).intValue();
    private int zzb = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzop)).intValue();

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzdP(zzcar zzcarVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final synchronized void zzdQ(zzfke zzfkeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbT)).booleanValue()) {
            try {
                zzfjw zzfjwVar = zzfkeVar.zzb.zzb;
                this.zza = zzfjwVar.zzc;
                this.zzb = zzfjwVar.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }
}
