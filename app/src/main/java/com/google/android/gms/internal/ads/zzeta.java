package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzeta implements zzetf {
    final /* synthetic */ zzetb zza;

    zzeta(zzetb zzetbVar) {
        Objects.requireNonNull(zzetbVar);
        this.zza = zzetbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcxh zzcxhVar = (zzcxh) obj;
        zzetb zzetbVar = this.zza;
        synchronized (zzetbVar) {
            zzetbVar.zze(zzcxhVar.zzn());
            zzcxhVar.zzj();
        }
    }
}
