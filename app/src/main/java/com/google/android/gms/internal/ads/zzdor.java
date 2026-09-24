package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzdor implements zzbee {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdpc zzb;

    zzdor(zzdpc zzdpcVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzdpcVar);
        this.zzb = zzdpcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbee
    public final void zzdj(zzbed zzbedVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcu)).booleanValue()) {
            synchronized (this) {
                if (zzbedVar.zzj) {
                    zzdpc zzdpcVar = this.zzb;
                    if (zzdpcVar.zzaa() != null) {
                        zzdpcVar.zzab().put(this.zza, true);
                        if (zzdpcVar.zzaa() == null) {
                            return;
                        } else {
                            zzdpcVar.zzu(zzdpcVar.zzaa().zzdF(), zzdpcVar.zzaa().zzi(), zzdpcVar.zzaa().zzj(), true);
                        }
                    }
                }
                return;
            }
        }
        if (zzbedVar.zzj) {
            zzdpc zzdpcVar2 = this.zzb;
            if (zzdpcVar2.zzaa() != null) {
                zzdpcVar2.zzab().put(this.zza, true);
                if (zzdpcVar2.zzaa() == null) {
                    return;
                }
                zzdpcVar2.zzu(zzdpcVar2.zzaa().zzdF(), zzdpcVar2.zzaa().zzi(), zzdpcVar2.zzaa().zzj(), true);
            }
        }
    }
}
