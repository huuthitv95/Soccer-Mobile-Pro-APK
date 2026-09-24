package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzafz {
    public static boolean zzb(zzafq zzafqVar, zzafy zzafyVar) throws IOException {
        zzafqVar.zzl();
        zzer zzerVar = new zzer(new byte[4], 4);
        zzafqVar.zzi(zzerVar.zza, 0, 4);
        boolean zZzi = zzerVar.zzi();
        int iZzj = zzerVar.zzj(7);
        int iZzj2 = zzerVar.zzj(24) + 4;
        if (iZzj == 0) {
            byte[] bArr = new byte[38];
            zzafqVar.zzc(bArr, 0, 38);
            zzafyVar.zza = new zzagc(bArr, 4);
            return zZzi;
        }
        zzagc zzagcVar = zzafyVar.zza;
        if (zzagcVar == null) {
            throw new IllegalArgumentException();
        }
        if (iZzj == 3) {
            zzes zzesVar = new zzes(iZzj2);
            zzafqVar.zzc(zzesVar.zzi(), 0, iZzj2);
            zzafyVar.zza = zzagcVar.zze(zzc(zzesVar));
            return zZzi;
        }
        if (iZzj == 4) {
            zzes zzesVar2 = new zzes(iZzj2);
            zzafqVar.zzc(zzesVar2.zzi(), 0, iZzj2);
            zzesVar2.zzk(4);
            zzafyVar.zza = new zzagc(zzagcVar.zza, zzagcVar.zzb, zzagcVar.zzc, zzagcVar.zzd, zzagcVar.zze, zzagcVar.zzg, zzagcVar.zzh, zzagcVar.zzj, zzagcVar.zzk, zzagcVar.zzd(zzahh.zzc(Arrays.asList(zzahh.zzb(zzesVar2, false, false).zza))));
            return zZzi;
        }
        if (iZzj != 6) {
            zzafqVar.zzf(iZzj2);
            return zZzi;
        }
        zzes zzesVar3 = new zzes(iZzj2);
        zzafqVar.zzc(zzesVar3.zzi(), 0, iZzj2);
        zzesVar3.zzk(4);
        zzafyVar.zza = new zzagc(zzagcVar.zza, zzagcVar.zzb, zzagcVar.zzc, zzagcVar.zzd, zzagcVar.zze, zzagcVar.zzg, zzagcVar.zzh, zzagcVar.zzj, zzagcVar.zzk, zzagcVar.zzd(new zzap(zzgvz.zzj(zzaiv.zzb(zzesVar3)))));
        return zZzi;
    }

    public static zzagb zzc(zzes zzesVar) {
        zzesVar.zzk(1);
        int iZzx = zzesVar.zzx();
        long jZzg = zzesVar.zzg();
        long j = iZzx;
        int i = iZzx / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jZzD = zzesVar.zzD();
            if (jZzD == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jZzD;
            jArrCopyOf2[i2] = zzesVar.zzD();
            zzesVar.zzk(2);
        }
        zzesVar.zzk((int) ((jZzg + j) - ((long) zzesVar.zzg())));
        return new zzagb(jArrCopyOf, jArrCopyOf2);
    }

    public static zzap zza(zzafq zzafqVar, boolean z) throws IOException {
        zzap zzapVarZza = new zzagk().zza(zzafqVar, z ? null : zzajg.zza, 0);
        if (zzapVarZza == null || zzapVarZza.zza() == 0) {
            return null;
        }
        return zzapVarZza;
    }
}
