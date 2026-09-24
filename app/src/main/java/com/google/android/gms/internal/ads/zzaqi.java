package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaqi {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfh zza = new zzfh(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzes zzb = new zzes();

    zzaqi() {
    }

    public static long zze(zzes zzesVar) {
        int iZzg = zzesVar.zzg();
        if (zzesVar.zzd() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzesVar.zzm(bArr, 0, 9);
        zzesVar.zzh(iZzg);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        long j3 = (248 & j2) >> 3;
        long j4 = (bArr[1] & 255) << 20;
        long j5 = (j2 & 3) << 13;
        return j5 | j4 | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
    }

    private final int zzf(zzafq zzafqVar) {
        byte[] bArr = zzfk.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzafqVar.zzl();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final zzfh zzb() {
        return this.zza;
    }

    public final int zzc(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long jZzo = zzafqVar.zzo();
            int iMin = (int) Math.min(20000L, jZzo);
            long j2 = jZzo - ((long) iMin);
            if (zzafqVar.zzn() != j2) {
                zzagpVar.zza = j2;
                return 1;
            }
            zzes zzesVar = this.zzb;
            zzesVar.zza(iMin);
            zzafqVar.zzl();
            zzafqVar.zzi(zzesVar.zzi(), 0, iMin);
            int iZzg = zzesVar.zzg();
            for (int iZze = zzesVar.zze() - 4; iZze >= iZzg; iZze--) {
                if (zzg(zzesVar.zzi(), iZze) == 442) {
                    zzesVar.zzh(iZze + 4);
                    long jZze = zze(zzesVar);
                    if (jZze != -9223372036854775807L) {
                        j = jZze;
                        break;
                    }
                }
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zzf(zzafqVar);
            return 0;
        }
        if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zzf(zzafqVar);
                return 0;
            }
            zzfh zzfhVar = this.zza;
            this.zzh = zzfhVar.zzf(this.zzg) - zzfhVar.zze(j3);
            zzf(zzafqVar);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, zzafqVar.zzo());
        if (zzafqVar.zzn() != 0) {
            zzagpVar.zza = 0L;
            return 1;
        }
        zzes zzesVar2 = this.zzb;
        zzesVar2.zza(iMin2);
        zzafqVar.zzl();
        zzafqVar.zzi(zzesVar2.zzi(), 0, iMin2);
        int iZze2 = zzesVar2.zze();
        for (int iZzg2 = zzesVar2.zzg(); iZzg2 < iZze2 - 3; iZzg2++) {
            if (zzg(zzesVar2.zzi(), iZzg2) == 442) {
                zzesVar2.zzh(iZzg2 + 4);
                long jZze2 = zze(zzesVar2);
                if (jZze2 != -9223372036854775807L) {
                    j = jZze2;
                    break;
                }
            }
        }
        this.zzf = j;
        this.zzd = true;
        return 0;
    }

    public final long zzd() {
        return this.zzh;
    }
}
