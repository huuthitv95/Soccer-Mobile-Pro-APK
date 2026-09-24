package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgqi extends zzgrk {
    private String zza;
    private String zzb;

    zzgqi() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrk
    public final zzgrk zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgrk
    public final zzgrk zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgrk
    public final zzgrl zzc() {
        return new zzgqj(this.zza, this.zzb, null);
    }
}
