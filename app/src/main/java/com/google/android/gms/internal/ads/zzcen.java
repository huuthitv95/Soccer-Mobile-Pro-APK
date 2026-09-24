package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcen extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzcer zza;

    zzcen(zzcer zzcerVar) {
        Objects.requireNonNull(zzcerVar);
        this.zza = zzcerVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzcer zzcerVar = this.zza;
        zzbih zzbihVar = new zzbih(zzcerVar.zzz(), zzcerVar.zzA().afmaVersion);
        synchronized (zzcerVar.zzy()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzm();
                zzbik.zza(zzcerVar.zzB(), zzbihVar);
            } catch (IllegalArgumentException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot config CSI reporter.", e);
            }
        }
    }
}
