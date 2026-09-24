package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzyo {
    private final zzabd zza;
    private final zzes zzb = new zzes(32);
    private zzyn zzc;
    private zzyn zzd;
    private zzyn zze;
    private long zzf;

    public zzyo(zzabd zzabdVar) {
        this.zza = zzabdVar;
        zzyn zzynVar = new zzyn(0L, 65536);
        this.zzc = zzynVar;
        this.zzd = zzynVar;
        this.zze = zzynVar;
    }

    private final int zzi(int i) {
        zzyn zzynVar = this.zze;
        if (zzynVar.zzc == null) {
            zzabb zzabbVarZza = this.zza.zza();
            zzyn zzynVar2 = new zzyn(this.zze.zzb, 65536);
            zzynVar.zzc = zzabbVarZza;
            zzynVar.zzd = zzynVar2;
        }
        return Math.min(i, (int) (this.zze.zzb - this.zzf));
    }

    private final void zzj(int i) {
        long j = this.zzf + ((long) i);
        this.zzf = j;
        zzyn zzynVar = this.zze;
        if (j == zzynVar.zzb) {
            this.zze = zzynVar.zzd;
        }
    }

    private static zzyn zzk(zzyn zzynVar, zzip zzipVar, zzyp zzypVar, zzes zzesVar) {
        zzyn zzynVarZzm;
        if (zzipVar.zzk()) {
            long j = zzypVar.zzb;
            int iZzt = 1;
            zzesVar.zza(1);
            zzyn zzynVarZzm2 = zzm(zzynVar, j, zzesVar.zzi(), 1);
            long j2 = j + 1;
            byte b = zzesVar.zzi()[0];
            int i = b & 128;
            int i2 = b & 127;
            zzim zzimVar = zzipVar.zzb;
            byte[] bArr = zzimVar.zza;
            if (bArr == null) {
                zzimVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i != 0;
            zzynVarZzm = zzm(zzynVarZzm2, j2, zzimVar.zza, i2);
            long j3 = j2 + ((long) i2);
            if (z) {
                zzesVar.zza(2);
                zzynVarZzm = zzm(zzynVarZzm, j3, zzesVar.zzi(), 2);
                j3 += 2;
                iZzt = zzesVar.zzt();
            }
            int i3 = iZzt;
            int[] iArr = zzimVar.zzd;
            if (iArr == null || iArr.length < i3) {
                iArr = new int[i3];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzimVar.zze;
            if (iArr3 == null || iArr3.length < i3) {
                iArr3 = new int[i3];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i4 = i3 * 6;
                zzesVar.zza(i4);
                zzynVarZzm = zzm(zzynVarZzm, j3, zzesVar.zzi(), i4);
                j3 += (long) i4;
                zzesVar.zzh(0);
                for (int i5 = 0; i5 < i3; i5++) {
                    iArr2[i5] = zzesVar.zzt();
                    iArr4[i5] = zzesVar.zzH();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzypVar.zza - ((int) (j3 - zzypVar.zzb));
            }
            zzaha zzahaVar = zzypVar.zzc;
            String str = zzfk.zza;
            zzimVar.zza(i3, iArr2, iArr4, zzahaVar.zzb, zzimVar.zza, zzahaVar.zza, zzahaVar.zzc, zzahaVar.zzd);
            long j4 = zzypVar.zzb;
            int i6 = (int) (j3 - j4);
            zzypVar.zzb = j4 + ((long) i6);
            zzypVar.zza -= i6;
        } else {
            zzynVarZzm = zzynVar;
        }
        if (!zzipVar.zze()) {
            zzipVar.zzj(zzypVar.zza);
            return zzl(zzynVarZzm, zzypVar.zzb, zzipVar.zzc, zzypVar.zza);
        }
        zzesVar.zza(4);
        zzyn zzynVarZzm3 = zzm(zzynVarZzm, zzypVar.zzb, zzesVar.zzi(), 4);
        int iZzH = zzesVar.zzH();
        zzypVar.zzb += 4;
        zzypVar.zza -= 4;
        zzipVar.zzj(iZzH);
        zzyn zzynVarZzl = zzl(zzynVarZzm3, zzypVar.zzb, zzipVar.zzc, iZzH);
        zzypVar.zzb += (long) iZzH;
        int i7 = zzypVar.zza - iZzH;
        zzypVar.zza = i7;
        ByteBuffer byteBuffer = zzipVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i7) {
            zzipVar.zzf = ByteBuffer.allocate(i7);
        } else {
            zzipVar.zzf.clear();
        }
        return zzl(zzynVarZzl, zzypVar.zzb, zzipVar.zzf, zzypVar.zza);
    }

    private static zzyn zzl(zzyn zzynVar, long j, ByteBuffer byteBuffer, int i) {
        zzyn zzynVarZzn = zzn(zzynVar, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (zzynVarZzn.zzb - j));
            byteBuffer.put(zzynVarZzn.zzc.zza, zzynVarZzn.zzb(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == zzynVarZzn.zzb) {
                zzynVarZzn = zzynVarZzn.zzd;
            }
        }
        return zzynVarZzn;
    }

    private static zzyn zzm(zzyn zzynVar, long j, byte[] bArr, int i) {
        zzyn zzynVarZzn = zzn(zzynVar, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (zzynVarZzn.zzb - j));
            System.arraycopy(zzynVarZzn.zzc.zza, zzynVarZzn.zzb(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == zzynVarZzn.zzb) {
                zzynVarZzn = zzynVarZzn.zzd;
            }
        }
        return zzynVarZzn;
    }

    private static zzyn zzn(zzyn zzynVar, long j) {
        while (j >= zzynVar.zzb) {
            zzynVar = zzynVar.zzd;
        }
        return zzynVar;
    }

    public final void zza() {
        zzyn zzynVar = this.zzc;
        if (zzynVar.zzc != null) {
            this.zza.zzc(zzynVar);
            zzynVar.zzc();
        }
        this.zzc.zza(0L, 65536);
        zzyn zzynVar2 = this.zzc;
        this.zzd = zzynVar2;
        this.zze = zzynVar2;
        this.zzf = 0L;
        this.zza.zzd();
    }

    public final void zzb() {
        this.zzd = this.zzc;
    }

    public final void zzc(zzip zzipVar, zzyp zzypVar) {
        this.zzd = zzk(this.zzd, zzipVar, zzypVar, this.zzb);
    }

    public final void zzd(zzip zzipVar, zzyp zzypVar) {
        zzk(this.zzd, zzipVar, zzypVar, this.zzb);
    }

    public final void zze(long j) {
        zzyn zzynVar;
        if (j != -1) {
            while (true) {
                zzynVar = this.zzc;
                if (j < zzynVar.zzb) {
                    break;
                }
                this.zza.zzb(zzynVar.zzc);
                this.zzc = this.zzc.zzc();
            }
            if (this.zzd.zza < zzynVar.zza) {
                this.zzd = zzynVar;
            }
        }
    }

    public final long zzf() {
        return this.zzf;
    }

    public final int zzg(zzj zzjVar, int i, boolean z) throws IOException {
        int iZzi = zzi(i);
        zzyn zzynVar = this.zze;
        int iZza = zzjVar.zza(zzynVar.zzc.zza, zzynVar.zzb(this.zzf), iZzi);
        if (iZza != -1) {
            zzj(iZza);
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzh(zzes zzesVar, int i) {
        while (i > 0) {
            int iZzi = zzi(i);
            zzyn zzynVar = this.zze;
            zzesVar.zzm(zzynVar.zzc.zza, zzynVar.zzb(this.zzf), iZzi);
            i -= iZzi;
            zzj(iZzi);
        }
    }
}
