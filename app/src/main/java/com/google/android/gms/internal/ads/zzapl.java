package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzapl implements zzapm {
    private final List zza;
    private final zzahb[] zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private final String zzb = "video/mp2t";
    private long zzg = -9223372036854775807L;

    public zzapl(List list, String str) {
        this.zza = list;
        this.zzc = new zzahb[list.size()];
    }

    private final boolean zzf(zzes zzesVar, int i) {
        if (zzesVar.zzd() == 0) {
            return false;
        }
        if (zzesVar.zzs() != i) {
            this.zzd = false;
        }
        this.zze--;
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        this.zzd = false;
        this.zzg = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        int i = 0;
        while (true) {
            zzahb[] zzahbVarArr = this.zzc;
            if (i >= zzahbVarArr.length) {
                return;
            }
            zzaqx zzaqxVar = (zzaqx) this.zza.get(i);
            zzaraVar.zza();
            zzahb zzahbVarZzu = zzafsVar.zzu(zzaraVar.zzb(), 3);
            zzt zztVar = new zzt();
            zztVar.zza(zzaraVar.zzc());
            zztVar.zzn(this.zzb);
            zztVar.zzo("application/dvbsubs");
            zztVar.zzr(Collections.singletonList(zzaqxVar.zzb));
            zztVar.zze(zzaqxVar.zza);
            zzahbVarZzu.zzA(zztVar.zzO());
            zzahbVarArr[i] = zzahbVarZzu;
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zzg = j;
        this.zzf = 0;
        this.zze = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzd(zzes zzesVar) {
        if (this.zzd) {
            if (this.zze != 2 || zzf(zzesVar, 32)) {
                if (this.zze != 1 || zzf(zzesVar, 0)) {
                    int iZzg = zzesVar.zzg();
                    int iZzd = zzesVar.zzd();
                    for (zzahb zzahbVar : this.zzc) {
                        zzesVar.zzh(iZzg);
                        zzahbVar.zzc(zzesVar, iZzd);
                    }
                    this.zzf += iZzd;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
        if (this.zzd) {
            zzgsw.zzi(this.zzg != -9223372036854775807L);
            for (zzahb zzahbVar : this.zzc) {
                zzahbVar.zze(this.zzg, 1, this.zzf, 0, null);
            }
            this.zzd = false;
        }
    }
}
