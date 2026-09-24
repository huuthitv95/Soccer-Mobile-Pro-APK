package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzans implements zzane {
    private final zzes zza = new zzes();
    private final zzes zzb = new zzes();
    private final zzanr zzc = new zzanr();
    private Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzane
    public final void zza(byte[] bArr, int i, int i2, zzand zzandVar, zzds zzdsVar) {
        zzes zzesVar = this.zza;
        zzesVar.zzb(bArr, i2 + i);
        zzesVar.zzh(i);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        zzes zzesVar2 = this.zzb;
        if (zzfk.zzN(zzesVar, zzesVar2, this.zzd)) {
            zzesVar.zzb(zzesVar2.zzi(), zzesVar2.zze());
        }
        zzanr zzanrVar = this.zzc;
        zzanrVar.zzb();
        ArrayList arrayList = new ArrayList();
        while (zzesVar.zzd() >= 3) {
            int iZze = zzesVar.zze();
            int iZzs = zzesVar.zzs();
            int iZzt = zzesVar.zzt();
            int iZzg = zzesVar.zzg() + iZzt;
            zzcx zzcxVar = null;
            if (iZzg > iZze) {
                zzesVar.zzh(iZze);
            } else {
                if (iZzs != 128) {
                    switch (iZzs) {
                        case 20:
                            zzanrVar.zzc(zzesVar, iZzt);
                            break;
                        case 21:
                            zzanrVar.zzd(zzesVar, iZzt);
                            break;
                        case 22:
                            zzanrVar.zze(zzesVar, iZzt);
                            break;
                    }
                } else {
                    zzcx zzcxVarZza = zzanrVar.zza();
                    zzanrVar.zzb();
                    zzcxVar = zzcxVarZza;
                }
                zzesVar.zzh(iZzg);
            }
            if (zzcxVar != null) {
                arrayList.add(zzcxVar);
            }
        }
        zzdsVar.zza(new zzamw(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
