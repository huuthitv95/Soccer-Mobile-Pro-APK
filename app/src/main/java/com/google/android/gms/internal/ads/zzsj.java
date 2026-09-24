package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzsj implements zzsw {
    final /* synthetic */ zzsq zza;

    /* synthetic */ zzsj(zzsq zzsqVar, byte[] bArr) {
        Objects.requireNonNull(zzsqVar);
        this.zza = zzsqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsw
    public final void zza(long j) {
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 41);
        sb.append("Ignoring impossibly large audio latency: ");
        sb.append(j);
        zzef.zzc("AudioTrackAudioOutput", sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzsw
    public final void zzb(final long j) {
        zzsq zzsqVar = this.zza;
        if (zzsqVar.zzu().zzb()) {
            zzee zzeeVarZzu = zzsqVar.zzu();
            zzeeVarZzu.zze(-1, new zzdz() { // from class: com.google.android.gms.internal.ads.zzsi
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj) {
                    ((zzqn) obj).zza(j);
                }
            });
            zzeeVarZzu.zzf();
        }
    }
}
