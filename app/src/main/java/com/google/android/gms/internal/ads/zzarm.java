package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzarm {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 0, Ascii.DLE, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] zzc = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean zza(zzafq zzafqVar) throws IOException {
        zzes zzesVar = new zzes(8);
        int i = zzarl.zza(zzafqVar, zzesVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        zzafqVar.zzi(zzesVar.zzi(), 0, 4);
        zzesVar.zzh(0);
        int iZzB = zzesVar.zzB();
        if (iZzB == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iZzB).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(iZzB);
        zzef.zze("WavHeaderReader", sb.toString());
        return false;
    }

    public static zzark zzb(zzafq zzafqVar) throws IOException {
        byte[] bArr;
        int i;
        byte[] bArr2;
        zzes zzesVar = new zzes(16);
        long j = zzd(1718449184, zzafqVar, zzesVar).zzb;
        zzgsw.zzi(j >= 16);
        zzafqVar.zzi(zzesVar.zzi(), 0, 16);
        zzesVar.zzh(0);
        int iZzu = zzesVar.zzu();
        int iZzu2 = zzesVar.zzu();
        int iZzI = zzesVar.zzI();
        int iZzI2 = zzesVar.zzI();
        int iZzu3 = zzesVar.zzu();
        int iZzu4 = zzesVar.zzu();
        int i2 = ((int) j) - 16;
        if (i2 > 0) {
            bArr = new byte[i2];
            zzafqVar.zzi(bArr, 0, i2);
            if (iZzu == 65534) {
                if (i2 == 24) {
                    zzes zzesVar2 = new zzes(bArr);
                    zzesVar2.zzu();
                    int iZzu5 = zzesVar2.zzu();
                    if (iZzu5 != 0 && iZzu5 != iZzu4) {
                        StringBuilder sb = new StringBuilder(String.valueOf(iZzu5).length() + 33 + String.valueOf(iZzu4).length() + 19);
                        sb.append("validBits ( ");
                        sb.append(iZzu5);
                        sb.append(")  != bitsPerSample( ");
                        sb.append(iZzu4);
                        sb.append(") are not supported");
                        throw zzat.zzc(sb.toString());
                    }
                    int iZzI3 = zzesVar2.zzI();
                    if ((iZzI3 >> 18) != 0) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzI3).length() + 21);
                        sb2.append("invalid channel mask ");
                        sb2.append(iZzI3);
                        throw zzat.zzc(sb2.toString());
                    }
                    if (iZzI3 != 0 && Integer.bitCount(iZzI3) != iZzu2) {
                        int iBitCount = Integer.bitCount(iZzI3);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(iBitCount).length() + 46 + String.valueOf(iZzI3).length());
                        sb3.append("invalid number of channels (");
                        sb3.append(iBitCount);
                        sb3.append(") in channel mask ");
                        sb3.append(iZzI3);
                        throw zzat.zzc(sb3.toString());
                    }
                    iZzu = zzesVar2.zzu();
                    byte[] bArr3 = new byte[14];
                    zzesVar2.zzm(bArr3, 0, 14);
                    if (!Arrays.equals(bArr3, zzb) && !Arrays.equals(bArr3, zzc)) {
                        throw zzat.zzc("invalid wav format extension guid");
                    }
                } else {
                    bArr2 = bArr;
                    i = 65534;
                }
            }
            zzafqVar.zzf((int) (zzafqVar.zzm() - zzafqVar.zzn()));
            return new zzark(i, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2);
        }
        bArr = zzfk.zzb;
        i = iZzu;
        bArr2 = bArr;
        zzafqVar.zzf((int) (zzafqVar.zzm() - zzafqVar.zzn()));
        return new zzark(i, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2);
    }

    public static Pair zzc(zzafq zzafqVar) throws IOException {
        zzafqVar.zzl();
        zzarl zzarlVarZzd = zzd(1684108385, zzafqVar, new zzes(8));
        zzafqVar.zzf(8);
        return Pair.create(Long.valueOf(zzafqVar.zzn()), Long.valueOf(zzarlVarZzd.zzb));
    }

    private static zzarl zzd(int i, zzafq zzafqVar, zzes zzesVar) throws IOException {
        zzarl zzarlVarZza = zzarl.zza(zzafqVar, zzesVar);
        while (true) {
            int i2 = zzarlVarZza.zza;
            if (i2 == i) {
                return zzarlVarZza;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 28);
            sb.append("Ignoring unknown WAV chunk: ");
            sb.append(i2);
            zzef.zzc("WavHeaderReader", sb.toString());
            long j = zzarlVarZza.zzb;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 40);
                sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(i2);
                throw zzat.zzc(sb2.toString());
            }
            zzafqVar.zzf((int) j2);
            zzarlVarZza = zzarl.zza(zzafqVar, zzesVar);
        }
    }
}
