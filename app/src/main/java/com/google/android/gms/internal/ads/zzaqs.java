package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaqs {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfh zza = new zzfh(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzes zzb = new zzes();

    zzaqs(int i) {
    }

    private final int zze(zzafq zzafqVar) {
        byte[] bArr = zzfk.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzafqVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zzafq zzafqVar, zzagp zzagpVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzafqVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (this.zze) {
            if (this.zzg == -9223372036854775807L) {
                zze(zzafqVar);
                return 0;
            }
            if (this.zzd) {
                long j2 = this.zzf;
                if (j2 == -9223372036854775807L) {
                    zze(zzafqVar);
                    return 0;
                }
                zzfh zzfhVar = this.zza;
                this.zzh = zzfhVar.zzf(this.zzg) - zzfhVar.zze(j2);
                zze(zzafqVar);
                return 0;
            }
            int iMin = (int) Math.min(112800L, zzafqVar.zzo());
            if (zzafqVar.zzn() != 0) {
                zzagpVar.zza = 0L;
                return 1;
            }
            zzes zzesVar = this.zzb;
            zzesVar.zza(iMin);
            zzafqVar.zzl();
            zzafqVar.zzi(zzesVar.zzi(), 0, iMin);
            int iZze = zzesVar.zze();
            for (int iZzg = zzesVar.zzg(); iZzg < iZze; iZzg++) {
                if (zzesVar.zzi()[iZzg] == 71) {
                    long jZzb = zzarc.zzb(zzesVar, iZzg, i);
                    if (jZzb != -9223372036854775807L) {
                        j = jZzb;
                        break;
                    }
                }
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        }
        long jZzo = zzafqVar.zzo();
        int iMin2 = (int) Math.min(112800L, jZzo);
        long j3 = jZzo - ((long) iMin2);
        if (zzafqVar.zzn() != j3) {
            zzagpVar.zza = j3;
            return 1;
        }
        zzes zzesVar2 = this.zzb;
        zzesVar2.zza(iMin2);
        zzafqVar.zzl();
        zzafqVar.zzi(zzesVar2.zzi(), 0, iMin2);
        int iZzg2 = zzesVar2.zzg();
        int iZze2 = zzesVar2.zze();
        for (int i2 = iZze2 - 188; i2 >= iZzg2; i2--) {
            byte[] bArrZzi = zzesVar2.zzi();
            int i3 = 0;
            for (int i4 = -4; i4 <= 4; i4++) {
                int i5 = (i4 * 188) + i2;
                if (i5 >= iZzg2 && i5 < iZze2 && bArrZzi[i5] == 71) {
                    i3++;
                    if (i3 == 5) {
                        long jZzb2 = zzarc.zzb(zzesVar2, i2, i);
                        if (jZzb2 == -9223372036854775807L) {
                            break;
                        }
                        j = jZzb2;
                        break;
                    }
                } else {
                    i3 = 0;
                }
            }
        }
        this.zzg = j;
        this.zze = true;
        return 0;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final zzfh zzd() {
        return this.zza;
    }
}
