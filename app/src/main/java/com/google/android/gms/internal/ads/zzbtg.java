package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbtg implements zzcfo {
    final /* synthetic */ zzbth zza;

    zzbtg(zzbth zzbthVar) {
        Objects.requireNonNull(zzbthVar);
        this.zza = zzbthVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzbsd zzbsdVar = (zzbsd) obj;
        zzcff.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy > Destroying engine.");
                zzbsd zzbsdVar2 = zzbsdVar;
                zzbsdVar2.zzn("/result", zzbpd.zzo);
                zzbsdVar2.zzj();
            }
        });
    }
}
