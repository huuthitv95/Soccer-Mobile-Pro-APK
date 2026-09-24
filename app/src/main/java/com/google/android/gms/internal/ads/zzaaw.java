package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzaaw extends zzaaz {
    protected abstract Pair zzh(zzaav zzaavVar, int[][][] iArr, int[] iArr2, zzxc zzxcVar, zzbf zzbfVar) throws zzje;

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final void zzq(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final zzaba zzr(zzmw[] zzmwVarArr, zzzf zzzfVar, zzxc zzxcVar, zzbf zzbfVar) throws zzje {
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbg[][] zzbgVarArr = new zzbg[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzzfVar.zzb;
            zzbgVarArr[i] = new zzbg[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzmwVarArr[i4].zzu();
        }
        int i5 = 0;
        while (i5 < zzzfVar.zzb) {
            zzbg zzbgVarZza = zzzfVar.zza(i5);
            int i6 = zzbgVarZza.zzc;
            int i7 = i3;
            int i8 = 0;
            int i9 = 0;
            boolean z = true;
            while (i8 < i3) {
                zzmw zzmwVar = zzmwVarArr[i8];
                int iMax = 0;
                for (int i10 = 0; i10 < zzbgVarZza.zza; i10++) {
                    iMax = Math.max(iMax, zzmwVar.zzad(zzbgVarZza.zza(i10)) & 7);
                }
                boolean z2 = iArr2[i8] == 0;
                if (iMax > i9) {
                    z = z2;
                    i7 = i8;
                    i9 = iMax;
                } else if (iMax == i9 && i6 == 5 && !z && z2) {
                    i7 = i8;
                    i9 = iMax;
                    z = true;
                }
                i8++;
                i3 = 2;
            }
            if (i7 == i3) {
                iArr = new int[zzbgVarZza.zza];
            } else {
                zzmw zzmwVar2 = zzmwVarArr[i7];
                int i11 = zzbgVarZza.zza;
                int[] iArr5 = new int[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    iArr5[i12] = zzmwVar2.zzad(zzbgVarZza.zza(i12));
                }
                iArr = iArr5;
            }
            int i13 = iArr2[i7];
            zzbgVarArr[i7][i13] = zzbgVarZza;
            iArr3[i7][i13] = iArr;
            iArr2[i7] = i13 + 1;
            i5++;
            i3 = 2;
        }
        zzzf[] zzzfVarArr = new zzzf[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i14 = 0;
        while (i14 < i3) {
            int i15 = iArr2[i14];
            zzzfVarArr[i14] = new zzzf((zzbg[]) zzfk.zzb(zzbgVarArr[i14], i15));
            iArr3[i14] = (int[][]) zzfk.zzb(iArr3[i14], i15);
            strArr[i14] = zzmwVarArr[i14].zzU();
            iArr6[i14] = zzmwVarArr[i14].zza();
            i14++;
            i3 = 2;
        }
        int i16 = i3;
        zzaav zzaavVar = new zzaav(strArr, iArr6, zzzfVarArr, iArr4, iArr3, new zzzf((zzbg[]) zzfk.zzb(zzbgVarArr[i16], iArr2[i16])));
        Pair pairZzh = zzh(zzaavVar, iArr3, iArr4, zzxcVar, zzbfVar);
        zzaax[] zzaaxVarArr = (zzaax[]) pairZzh.second;
        int length = zzaaxVarArr.length;
        List[] listArr = new List[length];
        for (int i17 = 0; i17 < zzaaxVarArr.length; i17++) {
            zzaax zzaaxVar = zzaaxVarArr[i17];
            listArr[i17] = zzaaxVar != null ? zzgvz.zzj(zzaaxVar) : zzgvz.zzi();
        }
        zzgvw zzgvwVar = new zzgvw();
        for (int i18 = 0; i18 < 2; i18++) {
            zzzf zzzfVarZzb = zzaavVar.zzb(i18);
            int i19 = 0;
            while (i19 < zzzfVarZzb.zzb) {
                zzbg zzbgVarZza2 = zzzfVarZzb.zza(i19);
                boolean z3 = zzaavVar.zzd(i18, i19, false) != 0;
                int i20 = zzbgVarZza2.zza;
                int[] iArr7 = new int[i20];
                boolean[] zArr = new boolean[i20];
                for (int i21 = 0; i21 < i20; i21++) {
                    iArr7[i21] = zzaavVar.zzc(i18, i19, i21) & 7;
                    int i22 = 0;
                    boolean z4 = false;
                    while (i22 < length) {
                        List list = listArr[i22];
                        int i23 = length;
                        List[] listArr2 = listArr;
                        int i24 = 0;
                        while (i24 < list.size()) {
                            zzaax zzaaxVar2 = (zzaax) list.get(i24);
                            int i25 = i24;
                            if (zzaaxVar2.zza().equals(zzbgVarZza2) && zzaaxVar2.zzg(i21) != -1) {
                                z4 = true;
                                break;
                            }
                            i24 = i25 + 1;
                        }
                        i22++;
                        length = i23;
                        listArr = listArr2;
                    }
                    zArr[i21] = z4;
                }
                zzgvwVar.zzf(new zzbm(zzbgVarZza2, z3, iArr7, zArr));
                i19++;
                length = length;
            }
        }
        zzzf zzzfVarZze = zzaavVar.zze();
        for (int i26 = 0; i26 < zzzfVarZze.zzb; i26++) {
            zzbg zzbgVarZza3 = zzzfVarZze.zza(i26);
            int i27 = zzbgVarZza3.zza;
            int[] iArr8 = new int[i27];
            Arrays.fill(iArr8, 0);
            zzgvwVar.zzf(new zzbm(zzbgVarZza3, false, iArr8, new boolean[i27]));
        }
        return new zzaba((zzmx[]) pairZzh.first, (zzaas[]) pairZzh.second, new zzbn(zzgvwVar.zzi()), zzaavVar);
    }
}
