package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaol implements zzane {
    public static final zzamw zza = new zzamw(zzgvz.zzi(), -9223372036854775807L, -9223372036854775807L);
    private final zzes zzb = new zzes();
    private final zzes zzc = new zzes();
    private final zzaok zzd;
    private Inflater zze;

    public zzaol(List list) {
        zzaok zzaokVar = new zzaok();
        this.zzd = zzaokVar;
        zzaokVar.zza(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    @Override // com.google.android.gms.internal.ads.zzane
    public final void zza(byte[] bArr, int i, int i2, zzand zzandVar, zzds zzdsVar) {
        zzamw zzamwVar;
        zzes zzesVar = this.zzb;
        zzesVar.zzb(bArr, i2 + i);
        zzesVar.zzh(i);
        if (this.zze == null) {
            this.zze = new Inflater();
        }
        zzes zzesVar2 = this.zzc;
        if (zzfk.zzN(zzesVar, zzesVar2, this.zze)) {
            zzesVar.zzb(zzesVar2.zzi(), zzesVar2.zze());
        }
        zzaok zzaokVar = this.zzd;
        zzaokVar.zzc();
        int iZzd = zzesVar.zzd();
        if (iZzd < 2 || zzesVar.zzt() != iZzd) {
            zzamwVar = zza;
        } else {
            zzaokVar.zzd(zzesVar);
            long jZzf = zzaokVar.zzf();
            zzcx zzcxVarZzb = zzaokVar.zzb(zzesVar);
            long jZzf2 = -9223372036854775807L;
            if (jZzf != -9223372036854775807L) {
                if (zzaokVar.zze() != -9223372036854775807L) {
                    if (zzaokVar.zzf() > zzaokVar.zze()) {
                        jZzf2 = zzaokVar.zzf() - zzaokVar.zze();
                    } else {
                        jZzf2 = zzaokVar.zzf();
                    }
                } else {
                    jZzf2 = zzaokVar.zzf();
                }
            }
            zzamwVar = new zzamw(zzcxVarZzb != null ? zzgvz.zzj(zzcxVarZzb) : zzgvz.zzi(), zzaokVar.zze(), jZzf2);
        }
        zzdsVar.zza(zzamwVar);
    }
}
