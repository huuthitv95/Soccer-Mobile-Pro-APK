package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfjj implements zzetf {
    final /* synthetic */ zzfjk zza;

    zzfjj(zzfjk zzfjkVar) {
        Objects.requireNonNull(zzfjkVar);
        this.zza = zzfjkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final void zza() {
        zzfjk zzfjkVar = this.zza;
        synchronized (zzfjkVar) {
            zzfjkVar.zzx(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfjk zzfjkVar = this.zza;
        zzdva zzdvaVar = (zzdva) obj;
        synchronized (zzfjkVar) {
            zzfjkVar.zzx(zzdvaVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeu)).booleanValue()) {
                zzdvaVar.zzh().zza = zzfjkVar.zzv();
            }
            zzfjkVar.zzw().zzj();
        }
    }
}
