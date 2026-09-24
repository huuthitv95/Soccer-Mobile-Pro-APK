package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzert implements zzetf {
    final /* synthetic */ zzeru zza;

    zzert(zzeru zzeruVar) {
        Objects.requireNonNull(zzeruVar);
        this.zza = zzeruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final void zza() {
        zzeru zzeruVar = this.zza;
        synchronized (zzeruVar) {
            zzeruVar.zzN(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeru zzeruVar = this.zza;
        zzcuz zzcuzVar = (zzcuz) obj;
        synchronized (zzeruVar) {
            if (zzeruVar.zzM() != null) {
                if (zzcuzVar.zzo() != null && zzeruVar.zzM().zzo() != null) {
                    zzcuzVar.zzo().zzb(zzeruVar.zzM().zzo().zza());
                }
                zzeruVar.zzM().zzd();
            }
            zzeruVar.zzN(zzcuzVar);
            zzeruVar.zzM().zzj();
        }
    }
}
