package com.google.android.gms.internal.ads;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzzm extends zzzo {
    protected zzzm(zzbg zzbgVar, int[] iArr, int i, zzabi zzabiVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzdo zzdoVar) {
        super(zzbgVar, iArr, 0);
        zzgvz.zzq(list);
    }

    static /* synthetic */ zzgvz zzd(zzaar[] zzaarVarArr) {
        int i;
        int i2;
        long[][] jArr;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= 2) {
                break;
            }
            zzaar zzaarVar = zzaarVarArr[i4];
            if (zzaarVar == null || zzaarVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i5 = zzgvz.zzd;
                zzgvw zzgvwVar = new zzgvw();
                zzgvwVar.zzf(new zzzk(0L, 0L));
                arrayList.add(zzgvwVar);
            }
            i4++;
        }
        long[][] jArr2 = new long[2][];
        for (int i6 = 0; i6 < 2; i6++) {
            zzaar zzaarVar2 = zzaarVarArr[i6];
            if (zzaarVar2 == null) {
                jArr2[i6] = new long[0];
            } else {
                int[] iArr = zzaarVar2.zzb;
                jArr2[i6] = new long[iArr.length];
                for (int i7 = 0; i7 < iArr.length; i7++) {
                    long j = zzaarVar2.zza.zza(iArr[i7]).zzj;
                    long[] jArr3 = jArr2[i6];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr3[i7] = j;
                }
                Arrays.sort(jArr2[i6]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i8 = 0; i8 < 2; i8++) {
            long[] jArr5 = jArr2[i8];
            jArr4[i8] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        zzi(arrayList, jArr4);
        zzgwu zzgwuVarZza = zzgxo.zzc(zzgxt.zzb()).zzb(2).zza();
        int i9 = 0;
        while (i9 < 2) {
            int length = jArr2[i9].length;
            if (length <= i) {
                i2 = i3;
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i10 = i3;
                while (true) {
                    long[] jArr6 = jArr2[i9];
                    int length2 = jArr6.length;
                    double dLog = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    if (i10 >= length2) {
                        break;
                    }
                    int i11 = i3;
                    long[][] jArr7 = jArr2;
                    long j2 = jArr6[i10];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i10] = dLog;
                    i10++;
                    i3 = i11;
                    jArr2 = jArr7;
                }
                i2 = i3;
                jArr = jArr2;
                int i12 = length - 1;
                double d = dArr[i12] - dArr[i2];
                int i13 = i2;
                while (i13 < i12) {
                    double d2 = dArr[i13];
                    i13++;
                    zzgwuVarZza.zze(Double.valueOf(d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1.0d : (((d2 + dArr[i13]) * 0.5d) - dArr[i2]) / d), Integer.valueOf(i9));
                    i = i;
                }
            }
            i9++;
            i3 = i2;
            jArr2 = jArr;
            i = i;
        }
        int i14 = i3;
        long[][] jArr8 = jArr2;
        zzgvz zzgvzVarZzq = zzgvz.zzq(zzgwuVarZza.zzt());
        for (int i15 = i14; i15 < zzgvzVarZzq.size(); i15++) {
            int iIntValue = ((Integer) zzgvzVarZzq.get(i15)).intValue();
            int i16 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i16;
            jArr4[iIntValue] = jArr8[iIntValue][i16];
            zzi(arrayList, jArr4);
        }
        for (int i17 = i14; i17 < 2; i17++) {
            if (arrayList.get(i17) != null) {
                long j3 = jArr4[i17];
                jArr4[i17] = j3 + j3;
            }
        }
        zzi(arrayList, jArr4);
        zzgvw zzgvwVar2 = new zzgvw();
        while (i14 < arrayList.size()) {
            zzgvw zzgvwVar3 = (zzgvw) arrayList.get(i14);
            zzgvwVar2.zzf(zzgvwVar3 == null ? zzgvz.zzi() : zzgvwVar3.zzi());
            i14++;
        }
        return zzgvwVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgvw zzgvwVar = (zzgvw) list.get(i2);
            if (zzgvwVar != null) {
                zzgvwVar.zzf(new zzzk(j, jArr[i2]));
            }
        }
    }
}
