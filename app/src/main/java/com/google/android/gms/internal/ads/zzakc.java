package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzakc {
    private final zzes zza = new zzes(8);
    private int zzb;

    private final long zzb(zzafq zzafqVar) throws IOException {
        int i;
        zzes zzesVar = this.zza;
        zzafg zzafgVar = (zzafg) zzafqVar;
        int i2 = 0;
        zzafgVar.zzh(zzesVar.zzi(), 0, 1, false);
        int i3 = zzesVar.zzi()[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        zzafgVar.zzh(zzesVar.zzi(), 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (zzesVar.zzi()[i2] & 255) + (i6 << 8);
        }
        this.zzb += i;
        return i6;
    }

    public final boolean zza(zzafq zzafqVar) throws IOException {
        long jZzo = zzafqVar.zzo();
        long j = 1024;
        if (jZzo != -1 && jZzo <= 1024) {
            j = jZzo;
        }
        zzes zzesVar = this.zza;
        zzafg zzafgVar = (zzafg) zzafqVar;
        zzafgVar.zzh(zzesVar.zzi(), 0, 4, false);
        this.zzb = 4;
        for (long jZzz = zzesVar.zzz(); jZzz != 440786851; jZzz = ((jZzz << 8) & (-256)) | ((long) (zzesVar.zzi()[0] & 255))) {
            int i = (int) j;
            int i2 = this.zzb + 1;
            this.zzb = i2;
            if (i2 == i) {
                return false;
            }
            zzafgVar.zzh(zzesVar.zzi(), 0, 1, false);
        }
        long jZzb = zzb(zzafqVar);
        long j2 = this.zzb;
        if (jZzb != Long.MIN_VALUE) {
            long j3 = j2 + jZzb;
            if (jZzo == -1 || j3 < jZzo) {
                while (true) {
                    long j4 = this.zzb;
                    if (j4 < j3) {
                        if (zzb(zzafqVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jZzb2 = zzb(zzafqVar);
                        if (jZzb2 < 0) {
                            return false;
                        }
                        if (jZzb2 != 0) {
                            int i3 = (int) jZzb2;
                            zzafgVar.zzj(i3, false);
                            this.zzb += i3;
                        }
                    } else if (j4 == j3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
