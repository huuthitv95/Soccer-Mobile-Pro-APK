package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcoy implements zzeaj {
    private final zzcol zza;
    private final zzcpb zzb;
    private Long zzc;
    private String zzd;

    /* synthetic */ zzcoy(zzcol zzcolVar, zzcpb zzcpbVar, byte[] bArr) {
        this.zza = zzcolVar;
        this.zzb = zzcpbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeaj
    public final zzeak zza() {
        zzimq.zzc(this.zzc, Long.class);
        zzimq.zzc(this.zzd, String.class);
        return new zzcoz(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzeaj
    public final /* bridge */ /* synthetic */ zzeaj zzc(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeaj
    public final /* bridge */ /* synthetic */ zzeaj zzb(String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }
}
