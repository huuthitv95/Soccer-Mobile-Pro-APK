package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaqt implements zzaqm {
    final /* synthetic */ zzaqw zza;
    private final zzer zzb;

    public zzaqt(zzaqw zzaqwVar) {
        Objects.requireNonNull(zzaqwVar);
        this.zza = zzaqwVar;
        this.zzb = new zzer(new byte[4], 4);
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zza(zzfh zzfhVar, zzafs zzafsVar, zzara zzaraVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zzb(zzes zzesVar) {
        if (zzesVar.zzs() == 0 && (zzesVar.zzs() & 128) != 0) {
            zzesVar.zzk(6);
            int iZzd = zzesVar.zzd() / 4;
            for (int i = 0; i < iZzd; i++) {
                zzer zzerVar = this.zzb;
                zzesVar.zzl(zzerVar, 4);
                int iZzj = zzerVar.zzj(16);
                zzerVar.zzh(3);
                if (iZzj == 0) {
                    zzerVar.zzh(13);
                } else {
                    int iZzj2 = zzerVar.zzj(13);
                    zzaqw zzaqwVar = this.zza;
                    if (zzaqwVar.zzj().get(iZzj2) == null) {
                        zzaqwVar.zzj().put(iZzj2, new zzaqn(new zzaqu(zzaqwVar, iZzj2)));
                        zzaqwVar.zzo(zzaqwVar.zzn() + 1);
                    }
                }
            }
            this.zza.zzj().remove(0);
        }
    }
}
