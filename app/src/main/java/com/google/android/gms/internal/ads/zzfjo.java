package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfjo implements zzetf {
    final /* synthetic */ zzfjq zza;

    zzfjo(zzfjq zzfjqVar) {
        Objects.requireNonNull(zzfjqVar);
        this.zza = zzfjqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final void zza() {
        zzfjq zzfjqVar = this.zza;
        synchronized (zzfjqVar) {
            zzfjqVar.zzx(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfjq zzfjqVar = this.zza;
        zzdva zzdvaVar = (zzdva) obj;
        synchronized (zzfjqVar) {
            zzfjqVar.zzx(zzdvaVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeu)).booleanValue()) {
                zzdvaVar.zzh().zza = zzfjqVar.zzv();
            }
            zzfjqVar.zzw().zzj();
        }
    }
}
