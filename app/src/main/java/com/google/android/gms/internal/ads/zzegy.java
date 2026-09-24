package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzegy implements zzefk {
    final /* synthetic */ zzehb zza;

    zzegy(zzehb zzehbVar) {
        Objects.requireNonNull(zzehbVar);
        this.zza = zzehbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefk
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpA)).booleanValue()) {
            zzdyy zzdyyVarZza = this.zza.zzd().zza();
            zzdyyVarZza.zzc("action", "ptard");
            zzdyyVarZza.zzc("ptard", "r");
            zzdyyVarZza.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefk
    public final void zzb(RemoteException remoteException) {
        this.zza.zzc();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpB)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(remoteException, "Preconnect Remote");
        }
    }
}
