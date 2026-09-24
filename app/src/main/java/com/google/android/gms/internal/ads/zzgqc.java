package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgqc extends zzgqk {
    private String zza;
    private String zzb;

    zzgqc() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqk
    public final zzgqk zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgqk
    public final zzgqk zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgqk
    public final zzgql zzc() {
        return new zzgqd(this.zza, this.zzb, null);
    }
}
