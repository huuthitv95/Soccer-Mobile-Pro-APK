package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzamj extends zzams {
    private zzagc zza;
    private zzami zzb;

    zzamj() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    protected final long zzb(zzes zzesVar) {
        if (!zzd(zzesVar.zzi())) {
            return -1L;
        }
        int i = (zzesVar.zzi()[2] & 255) >> 4;
        if (i == 6) {
            zzesVar.zzk(4);
            zzesVar.zzO();
        } else if (i == 7) {
            i = 7;
            zzesVar.zzk(4);
            zzesVar.zzO();
        }
        int iZzc = zzafx.zzc(zzesVar, i);
        zzesVar.zzh(0);
        return iZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzes zzesVar, long j, zzamq zzamqVar) {
        byte[] bArrZzi = zzesVar.zzi();
        zzagc zzagcVar = this.zza;
        if (zzagcVar == null) {
            zzagc zzagcVar2 = new zzagc(bArrZzi, 17);
            this.zza = zzagcVar2;
            zzt zztVarZza = zzagcVar2.zzc(Arrays.copyOfRange(bArrZzi, 9, zzesVar.zze()), null).zza();
            zztVarZza.zzn("audio/ogg");
            zzamqVar.zza = zztVarZza.zzO();
            return true;
        }
        if ((bArrZzi[0] & 127) == 3) {
            zzagb zzagbVarZzc = zzafz.zzc(zzesVar);
            zzagc zzagcVarZze = zzagcVar.zze(zzagbVarZzc);
            this.zza = zzagcVarZze;
            this.zzb = new zzami(zzagcVarZze, zzagbVarZzc);
            return true;
        }
        if (!zzd(bArrZzi)) {
            return true;
        }
        zzami zzamiVar = this.zzb;
        if (zzamiVar != null) {
            zzamiVar.zzd(j);
            zzamqVar.zzb = this.zzb;
        }
        zzamqVar.zza.getClass();
        return false;
    }
}
