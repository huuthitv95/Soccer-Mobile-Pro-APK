package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcto implements zzbpe {
    final /* synthetic */ zzctp zza;

    zzcto(zzctp zzctpVar) {
        Objects.requireNonNull(zzctpVar);
        this.zza = zzctpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final void zza(Object obj, Map map) {
        zzctp zzctpVar = this.zza;
        if (zzctpVar.zze(map)) {
            zzctpVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza.zzg().zzm();
                }
            });
        }
    }
}
