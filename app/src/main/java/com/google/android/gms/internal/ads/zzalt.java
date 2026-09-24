package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzalt implements zzags {
    private final long zza;
    private final zzalu[] zzb;
    private final int zzc;

    public zzalt(long j, zzalu[] zzaluVarArr, int i) {
        this.zza = j;
        this.zzb = zzaluVarArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final boolean zzb() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0075 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzags
    public final zzagq zzc(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int i;
        long jZzh;
        long jZzh2;
        zzame zzameVar;
        int iZzb;
        zzalu[] zzaluVarArr = this.zzb;
        if (zzaluVarArr.length == 0) {
            zzagt zzagtVar = zzagt.zza;
            return new zzagq(zzagtVar, zzagtVar);
        }
        int i2 = this.zzc;
        if (i2 != -1) {
            zzame zzameVar2 = zzaluVarArr[i2].zzb;
            int iZzl = zzalv.zzl(zzameVar2, j);
            if (iZzl == -1) {
                zzagt zzagtVar2 = zzagt.zza;
                return new zzagq(zzagtVar2, zzagtVar2);
            }
            long[] jArr = zzameVar2.zzf;
            j3 = jArr[iZzl];
            long[] jArr2 = zzameVar2.zzc;
            j2 = jArr2[iZzl];
            if (j3 < j && iZzl < zzameVar2.zzb - 1 && (iZzb = zzameVar2.zzb(j)) != -1 && iZzb != iZzl) {
                j4 = jArr[iZzb];
                j5 = jArr2[iZzb];
            }
            jZzh = j2;
            jZzh2 = j5;
            for (i = 0; i < zzaluVarArr.length; i++) {
                if (i != i2) {
                    zzameVar = zzaluVarArr[i].zzb;
                    jZzh = zzalv.zzh(zzameVar, j3, jZzh);
                    if (j4 != -9223372036854775807L) {
                        jZzh2 = zzalv.zzh(zzameVar, j4, jZzh2);
                    }
                }
            }
            zzagt zzagtVar3 = new zzagt(j3, jZzh);
            return j4 == -9223372036854775807L ? new zzagq(zzagtVar3, zzagtVar3) : new zzagq(zzagtVar3, new zzagt(j4, jZzh2));
        }
        j2 = Long.MAX_VALUE;
        j3 = j;
        j4 = -9223372036854775807L;
        j5 = -1;
        jZzh = j2;
        jZzh2 = j5;
        while (i < zzaluVarArr.length) {
            if (i != i2) {
                zzameVar = zzaluVarArr[i].zzb;
                jZzh = zzalv.zzh(zzameVar, j3, jZzh);
                if (j4 != -9223372036854775807L) {
                    jZzh2 = zzalv.zzh(zzameVar, j4, jZzh2);
                }
            }
        }
        zzagt zzagtVar4 = new zzagt(j3, jZzh);
        if (j4 == -9223372036854775807L) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public /* synthetic */ boolean zzj() {
        return zzags.CC.$default$zzj(this);
    }
}
