package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzakp {
    public final zzagm zza;
    public final long zzb;
    public final long zzc;
    public final zzakl zzd;
    public final int zze;
    public final int zzf;
    public final long[] zzg;

    private zzakp(zzagm zzagmVar, long j, long j2, long[] jArr, zzakl zzaklVar, int i, int i2) {
        this.zza = new zzagm(zzagmVar);
        this.zzb = j;
        this.zzc = j2;
        this.zzg = jArr;
        this.zzd = zzaklVar;
        this.zze = i;
        this.zzf = i2;
    }

    public static zzakp zza(zzagm zzagmVar, zzes zzesVar) {
        long[] jArr;
        int i;
        int i2;
        int iZzB = zzesVar.zzB();
        int iZzH = (iZzB & 1) != 0 ? zzesVar.zzH() : -1;
        long jZzz = (iZzB & 2) != 0 ? zzesVar.zzz() : -1L;
        zzakl zzaklVarZzb = null;
        if ((iZzB & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr2[i3] = zzesVar.zzs();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iZzB & 8) != 0) {
            zzesVar.zzk(4);
        }
        if (zzesVar.zzd() >= 24) {
            zzesVar.zzk(11);
            zzaklVarZzb = zzakl.zzb(Float.intBitsToFloat(zzesVar.zzB()), zzesVar.zzt(), zzesVar.zzt());
            zzesVar.zzk(2);
            int iZzx = zzesVar.zzx();
            i2 = iZzx & 4095;
            i = iZzx >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new zzakp(zzagmVar, iZzH, jZzz, jArr, zzaklVarZzb, i, i2);
    }

    public final long zzb() {
        long j = this.zzb;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        zzagm zzagmVar = this.zza;
        return zzfk.zzt((j * ((long) zzagmVar.zzg)) - 1, zzagmVar.zzd);
    }
}
