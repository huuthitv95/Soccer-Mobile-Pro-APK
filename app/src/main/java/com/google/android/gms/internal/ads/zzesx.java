package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzesx implements zzetf {
    final /* synthetic */ zzesy zza;

    zzesx(zzesy zzesyVar) {
        Objects.requireNonNull(zzesyVar);
        this.zza = zzesyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final void zza() {
        zzesy zzesyVar = this.zza;
        synchronized (zzesyVar) {
            zzesyVar.zzN(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzesy zzesyVar = this.zza;
        zzdln zzdlnVar = (zzdln) obj;
        synchronized (zzesyVar) {
            zzesyVar.zzN(zzdlnVar);
            zzesyVar.zzM().zzj();
        }
    }
}
