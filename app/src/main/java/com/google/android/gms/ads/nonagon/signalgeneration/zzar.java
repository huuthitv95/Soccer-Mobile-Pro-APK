package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdlb;
import com.google.android.gms.internal.ads.zzhbf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzar implements zzhbf {
    final /* synthetic */ zzdlb zza;

    zzar(zzdlb zzdlbVar) {
        this.zza = zzdlbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        this.zza.zzb(th.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* synthetic */ void zzb(Object obj) {
        this.zza.zza((zzbc) obj);
    }
}
