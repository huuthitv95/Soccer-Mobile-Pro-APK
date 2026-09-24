package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzalk implements zzafp {
    private static final byte[] zza;
    private static final zzv zzb;
    private long zzA;
    private long zzB;
    private zzalj zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzafs zzI;
    private zzahb[] zzJ;
    private zzahb[] zzK;
    private boolean zzL;
    private long zzM;
    private final zzanc zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzes zzg;
    private final zzes zzh;
    private final zzes zzi;
    private final byte[] zzj;
    private final zzes zzk;
    private final zzaiu zzl;
    private final zzes zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzgy zzp;
    private final zzafe zzq;
    private zzgvz zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private zzes zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    static {
        int i = zzalg.zza;
        zza = new byte[]{-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
        zzt zztVar = new zzt();
        zztVar.zzo("application/x-emsg");
        zzb = zztVar.zzO();
    }

    @Deprecated
    public zzalk() {
        this(zzanc.zza, 32, null, null, zzgvz.zzi(), null);
    }

    private final void zzi() {
        this.zzs = 0;
        this.zzv = 0;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0400  */
    /* JADX WARN: Code duplicated, block: B:142:0x0415 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x0417  */
    /* JADX WARN: Code duplicated, block: B:144:0x0420  */
    /* JADX WARN: Code duplicated, block: B:147:0x0429  */
    /* JADX WARN: Code duplicated, block: B:148:0x0434  */
    /* JADX WARN: Code duplicated, block: B:151:0x043d  */
    /* JADX WARN: Code duplicated, block: B:152:0x0442  */
    /* JADX WARN: Code duplicated, block: B:153:0x0444 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x0446  */
    /* JADX WARN: Code duplicated, block: B:155:0x044b  */
    /* JADX WARN: Code duplicated, block: B:156:0x044d A[PHI: r32
  0x044d: PHI (r32v4 int) = (r5v57 int), (r32v5 int) binds: [B:152:0x0442, B:155:0x044b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:158:0x0451  */
    /* JADX WARN: Code duplicated, block: B:159:0x045a  */
    /* JADX WARN: Code duplicated, block: B:162:0x0474  */
    /* JADX WARN: Code duplicated, block: B:165:0x0486 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x0488 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x048a  */
    /* JADX WARN: Code duplicated, block: B:168:0x048f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0492  */
    private final void zzj(long j) throws zzat {
        zzap zzapVar;
        int i;
        int i2;
        byte[] bArr;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        int i7;
        boolean z2;
        int i8;
        long j2;
        long j3;
        int i9;
        int iZzB;
        int iZzB2;
        int iZzB3;
        int iZzB4;
        long jZzv;
        boolean z3;
        long[] jArr2;
        while (true) {
            ArrayDeque arrayDeque = this.zzn;
            if (arrayDeque.isEmpty() || ((zzfw) arrayDeque.peek()).zza != j) {
                break;
            }
            zzfw zzfwVar = (zzfw) arrayDeque.pop();
            int i10 = zzfwVar.zzd;
            int i11 = 12;
            int i12 = 8;
            char c = 1;
            if (i10 == 1836019574) {
                zzq zzqVarZzn = zzn(zzfwVar.zzb);
                zzfw zzfwVarZzd = zzfwVar.zzd(1836475768);
                zzfwVarZzd.getClass();
                SparseArray sparseArray = new SparseArray();
                List list = zzfwVarZzd.zzb;
                int size = list.size();
                int i13 = 0;
                long jZzz = -9223372036854775807L;
                while (i13 < size) {
                    zzfx zzfxVar = (zzfx) list.get(i13);
                    int i14 = zzfxVar.zzd;
                    if (i14 == 1953654136) {
                        zzes zzesVar = zzfxVar.zza;
                        zzesVar.zzh(i11);
                        Pair pairCreate = Pair.create(Integer.valueOf(zzesVar.zzB()), new zzale(zzesVar.zzB() - 1, zzesVar.zzB(), zzesVar.zzB(), zzesVar.zzB()));
                        sparseArray.put(((Integer) pairCreate.first).intValue(), (zzale) pairCreate.second);
                    } else if (i14 == 1835362404) {
                        zzes zzesVar2 = zzfxVar.zza;
                        zzesVar2.zzh(8);
                        jZzz = zzald.zza(zzesVar2.zzB()) == 0 ? zzesVar2.zzz() : zzesVar2.zzJ();
                    }
                    i13++;
                    i11 = 12;
                }
                zzfw zzfwVarZzd2 = zzfwVar.zzd(1835365473);
                zzap zzapVarZze = zzfwVarZzd2 != null ? zzald.zze(zzfwVarZzd2) : null;
                zzagi zzagiVar = new zzagi();
                zzfx zzfxVarZzc = zzfwVar.zzc(1969517665);
                if (zzfxVarZzc != null) {
                    zzap zzapVarZzc = zzald.zzc(zzfxVarZzc);
                    zzagiVar.zza(zzapVarZzc);
                    zzapVar = zzapVarZzc;
                } else {
                    zzapVar = null;
                }
                zzfx zzfxVarZzc2 = zzfwVar.zzc(1836476516);
                zzfxVarZzc2.getClass();
                zzap zzapVar2 = new zzap(-9223372036854775807L, zzald.zzd(zzfxVarZzc2.zza));
                List listZzb = zzald.zzb(zzfwVar, zzagiVar, jZzz, zzqVarZzn, (this.zzd & 16) != 0, false, new zzgsn(this) { // from class: com.google.android.gms.internal.ads.zzalf
                    @Override // com.google.android.gms.internal.ads.zzgsn
                    public final /* synthetic */ Object apply(Object obj) {
                        return (zzamb) obj;
                    }
                }, false);
                int size2 = listZzb.size();
                SparseArray sparseArray2 = this.zzf;
                if (sparseArray2.size() == 0) {
                    String strZza = zzaln.zza(listZzb);
                    int i15 = 0;
                    while (i15 < size2) {
                        zzame zzameVar = (zzame) listZzb.get(i15);
                        zzamb zzambVar = zzameVar.zza;
                        zzafs zzafsVar = this.zzI;
                        int i16 = zzambVar.zzb;
                        zzahb zzahbVarZzu = zzafsVar.zzu(i15, i16);
                        char c2 = c;
                        long j4 = zzambVar.zze;
                        zzahbVarZzu.zzO(j4);
                        int i17 = i15;
                        zzv zzvVar = zzambVar.zzg;
                        zzap zzapVar3 = zzapVar2;
                        zzt zztVarZza = zzvVar.zza();
                        zztVarZza.zzn(strZza);
                        zzalm.zzb(i16, zzagiVar, zztVarZza);
                        zzagi zzagiVar2 = zzagiVar;
                        String str = strZza;
                        zzap[] zzapVarArr = new zzap[2];
                        zzapVarArr[0] = zzapVar;
                        zzapVarArr[c2] = zzapVar3;
                        zzalm.zza(i16, zzapVarZze, zztVarZza, zzvVar.zzl, zzapVarArr);
                        int i18 = zzambVar.zza;
                        sparseArray2.put(i18, new zzalj(zzahbVarZzu, zzameVar, zzo(sparseArray, i18), zztVarZza.zzO()));
                        this.zzA = Math.max(this.zzA, j4);
                        i15 = i17 + 1;
                        c = c2;
                        zzagiVar = zzagiVar2;
                        zzapVar2 = zzapVar3;
                        strZza = str;
                    }
                    this.zzI.zzv();
                } else {
                    zzgsw.zzi(sparseArray2.size() == size2);
                    for (int i19 = 0; i19 < size2; i19++) {
                        zzame zzameVar2 = (zzame) listZzb.get(i19);
                        int i20 = zzameVar2.zza.zza;
                        ((zzalj) sparseArray2.get(i20)).zza(zzameVar2, zzo(sparseArray, i20));
                    }
                }
            } else {
                boolean z4 = true;
                int i21 = 16;
                int i22 = 0;
                if (i10 == 1836019558) {
                    SparseArray sparseArray3 = this.zzf;
                    int i23 = this.zzd;
                    byte[] bArr2 = this.zzj;
                    List list2 = zzfwVar.zzc;
                    int size3 = list2.size();
                    int i24 = 0;
                    while (i24 < size3) {
                        zzfw zzfwVar2 = (zzfw) list2.get(i24);
                        if (zzfwVar2.zzd == 1953653094) {
                            zzfx zzfxVarZzc3 = zzfwVar2.zzc(1952868452);
                            zzfxVarZzc3.getClass();
                            zzes zzesVar3 = zzfxVarZzc3.zza;
                            zzesVar3.zzh(i12);
                            int iZzB5 = zzesVar3.zzB();
                            int i25 = zzald.zza;
                            zzalj zzaljVar = (zzalj) sparseArray3.get(zzesVar3.zzB());
                            if (zzaljVar == null) {
                                zzaljVar = null;
                            } else {
                                if ((iZzB5 & 1) != 0) {
                                    long jZzJ = zzesVar3.zzJ();
                                    zzamd zzamdVar = zzaljVar.zzb;
                                    zzamdVar.zzb = jZzJ;
                                    zzamdVar.zzc = jZzJ;
                                }
                                zzale zzaleVar = zzaljVar.zze;
                                zzaljVar.zzb.zza = new zzale((iZzB5 & 2) != 0 ? zzesVar3.zzB() - 1 : zzaleVar.zza, (iZzB5 & 8) != 0 ? zzesVar3.zzB() : zzaleVar.zzb, (iZzB5 & 16) != 0 ? zzesVar3.zzB() : zzaleVar.zzc, (iZzB5 & 32) != 0 ? zzesVar3.zzB() : zzaleVar.zzd);
                            }
                            if (zzaljVar == null) {
                                i = 8;
                            } else {
                                zzamd zzamdVar2 = zzaljVar.zzb;
                                long j5 = zzamdVar2.zzp;
                                boolean z5 = zzamdVar2.zzq;
                                zzaljVar.zzc();
                                boolean z6 = z4;
                                zzaljVar.zzl(z6);
                                zzfx zzfxVarZzc4 = zzfwVar2.zzc(1952867444);
                                if (zzfxVarZzc4 == null || (i23 & 2) != 0) {
                                    zzamdVar2.zzp = j5;
                                    zzamdVar2.zzq = z5;
                                } else {
                                    zzes zzesVar4 = zzfxVarZzc4.zza;
                                    zzesVar4.zzh(8);
                                    zzamdVar2.zzp = zzald.zza(zzesVar4.zzB()) == z6 ? zzesVar4.zzJ() : zzesVar4.zzz();
                                    zzamdVar2.zzq = z6;
                                }
                                List list3 = zzfwVar2.zzb;
                                int size4 = list3.size();
                                i23 = i23;
                                int i26 = i22;
                                int i27 = i26;
                                int i28 = i27;
                                while (true) {
                                    i2 = 1953658222;
                                    if (i26 >= size4) {
                                        break;
                                    }
                                    List list4 = list2;
                                    zzfx zzfxVar2 = (zzfx) list3.get(i26);
                                    int i29 = size3;
                                    if (zzfxVar2.zzd == 1953658222) {
                                        zzes zzesVar5 = zzfxVar2.zza;
                                        zzesVar5.zzh(12);
                                        int iZzH = zzesVar5.zzH();
                                        if (iZzH > 0) {
                                            i28 += iZzH;
                                            i27++;
                                        }
                                    }
                                    i26++;
                                    size3 = i29;
                                    list2 = list4;
                                }
                                list2 = list2;
                                size3 = size3;
                                int i30 = i22;
                                zzaljVar.zzh = i30;
                                zzaljVar.zzg = i30;
                                zzaljVar.zzf = i30;
                                zzamdVar2.zzd = i27;
                                zzamdVar2.zze = i28;
                                if (zzamdVar2.zzg.length < i27) {
                                    zzamdVar2.zzf = new long[i27];
                                    zzamdVar2.zzg = new int[i27];
                                }
                                if (zzamdVar2.zzh.length < i28) {
                                    int i31 = (i28 * Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) / 100;
                                    zzamdVar2.zzh = new int[i31];
                                    zzamdVar2.zzi = new long[i31];
                                    zzamdVar2.zzj = new boolean[i31];
                                    zzamdVar2.zzl = new boolean[i31];
                                }
                                int i32 = 0;
                                int i33 = 0;
                                int i34 = 0;
                                while (i32 < size4) {
                                    long j6 = 0;
                                    zzfx zzfxVar3 = (zzfx) list3.get(i32);
                                    if (zzfxVar3.zzd == i2) {
                                        int i35 = i33 + 1;
                                        zzes zzesVar6 = zzfxVar3.zza;
                                        zzesVar6.zzh(8);
                                        int iZzB6 = zzesVar6.zzB();
                                        zzamb zzambVar2 = zzaljVar.zzd.zza;
                                        int i36 = i33;
                                        zzale zzaleVar2 = zzamdVar2.zza;
                                        String str2 = zzfk.zza;
                                        zzamdVar2.zzg[i36] = zzesVar6.zzH();
                                        long[] jArr3 = zzamdVar2.zzf;
                                        int i37 = i34;
                                        long j7 = zzamdVar2.zzb;
                                        jArr3[i36] = j7;
                                        if ((iZzB6 & 1) != 0) {
                                            jArr3[i36] = j7 + ((long) zzesVar6.zzB());
                                        }
                                        boolean z7 = (iZzB6 & 4) != 0;
                                        int i38 = zzaleVar2.zzd;
                                        int iZzB7 = z7 ? zzesVar6.zzB() : i38;
                                        boolean z8 = z7;
                                        int i39 = iZzB6 & 256;
                                        int i40 = iZzB6 & 512;
                                        int i41 = iZzB6 & 1024;
                                        int i42 = iZzB6 & 2048;
                                        long[] jArr4 = zzambVar2.zzi;
                                        if (jArr4 != null) {
                                            i4 = i41;
                                            if (jArr4.length == 1 && (jArr2 = zzambVar2.zzj) != null) {
                                                long j8 = jArr4[0];
                                                if (j8 == 0) {
                                                    i5 = i38;
                                                    i6 = iZzB7;
                                                } else {
                                                    i5 = i38;
                                                    i6 = iZzB7;
                                                    if (zzfk.zzv(j8, 1000000L, zzambVar2.zzd, RoundingMode.DOWN) + zzfk.zzv(jArr2[0], 1000000L, zzambVar2.zzc, RoundingMode.DOWN) >= zzambVar2.zze) {
                                                    }
                                                }
                                                j6 = jArr2[0];
                                            }
                                            iArr = zzamdVar2.zzh;
                                            jArr = zzamdVar2.zzi;
                                            zArr = zzamdVar2.zzj;
                                            i7 = i5;
                                            if (zzambVar2.zzb == 2 || (i23 & 1) == 0) {
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                            i8 = i37 + zzamdVar2.zzg[i36];
                                            j2 = zzambVar2.zzc;
                                            j3 = zzamdVar2.zzp;
                                            i9 = i37;
                                            while (i9 < i8) {
                                                if (i39 != 0) {
                                                    iZzB = zzesVar6.zzB();
                                                } else {
                                                    iZzB = zzaleVar2.zzb;
                                                }
                                                zzk(iZzB);
                                                if (i40 != 0) {
                                                    iZzB2 = zzesVar6.zzB();
                                                } else {
                                                    iZzB2 = zzaleVar2.zzc;
                                                }
                                                zzk(iZzB2);
                                                if (i4 != 0) {
                                                    iZzB3 = zzesVar6.zzB();
                                                } else if (i9 != 0) {
                                                    iZzB3 = i7;
                                                } else if (z8) {
                                                    iZzB3 = i6;
                                                    i9 = 0;
                                                } else {
                                                    i9 = 0;
                                                    iZzB3 = i7;
                                                }
                                                if (i42 != 0) {
                                                    iZzB4 = zzesVar6.zzB();
                                                } else {
                                                    iZzB4 = 0;
                                                }
                                                zzale zzaleVar3 = zzaleVar2;
                                                jZzv = zzfk.zzv((((long) iZzB4) + j3) - j6, 1000000L, j2, RoundingMode.DOWN);
                                                jArr[i9] = jZzv;
                                                if (!zzamdVar2.zzq) {
                                                    jArr[i9] = jZzv + zzaljVar.zzd.zzi;
                                                }
                                                iArr[i9] = iZzB2;
                                                if (((iZzB3 >> 16) & 1) != 0) {
                                                    z3 = false;
                                                } else if (z2) {
                                                    z3 = true;
                                                } else if (i9 == 0) {
                                                    z3 = true;
                                                    i9 = 0;
                                                } else {
                                                    z3 = false;
                                                }
                                                zArr[i9] = z3;
                                                j3 += (long) iZzB;
                                                i9++;
                                                z2 = z2;
                                                zzaleVar2 = zzaleVar3;
                                            }
                                            zzamdVar2.zzp = j3;
                                            i34 = i8;
                                            i33 = i35;
                                        } else {
                                            i4 = i41;
                                        }
                                        i5 = i38;
                                        i6 = iZzB7;
                                        iArr = zzamdVar2.zzh;
                                        jArr = zzamdVar2.zzi;
                                        zArr = zzamdVar2.zzj;
                                        i7 = i5;
                                        if (zzambVar2.zzb == 2) {
                                            z2 = false;
                                        } else {
                                            z2 = false;
                                        }
                                        i8 = i37 + zzamdVar2.zzg[i36];
                                        j2 = zzambVar2.zzc;
                                        j3 = zzamdVar2.zzp;
                                        i9 = i37;
                                        while (i9 < i8) {
                                            if (i39 != 0) {
                                                iZzB = zzesVar6.zzB();
                                            } else {
                                                iZzB = zzaleVar2.zzb;
                                            }
                                            zzk(iZzB);
                                            if (i40 != 0) {
                                                iZzB2 = zzesVar6.zzB();
                                            } else {
                                                iZzB2 = zzaleVar2.zzc;
                                            }
                                            zzk(iZzB2);
                                            if (i4 != 0) {
                                                iZzB3 = zzesVar6.zzB();
                                            } else if (i9 != 0) {
                                                iZzB3 = i7;
                                            } else if (z8) {
                                                iZzB3 = i6;
                                                i9 = 0;
                                            } else {
                                                i9 = 0;
                                                iZzB3 = i7;
                                            }
                                            if (i42 != 0) {
                                                iZzB4 = zzesVar6.zzB();
                                            } else {
                                                iZzB4 = 0;
                                            }
                                            zzale zzaleVar4 = zzaleVar2;
                                            jZzv = zzfk.zzv((((long) iZzB4) + j3) - j6, 1000000L, j2, RoundingMode.DOWN);
                                            jArr[i9] = jZzv;
                                            if (!zzamdVar2.zzq) {
                                                jArr[i9] = jZzv + zzaljVar.zzd.zzi;
                                            }
                                            iArr[i9] = iZzB2;
                                            if (((iZzB3 >> 16) & 1) != 0) {
                                                z3 = false;
                                            } else if (z2) {
                                                z3 = true;
                                            } else if (i9 == 0) {
                                                z3 = true;
                                                i9 = 0;
                                            } else {
                                                z3 = false;
                                            }
                                            zArr[i9] = z3;
                                            j3 += (long) iZzB;
                                            i9++;
                                            z2 = z2;
                                            zzaleVar2 = zzaleVar4;
                                        }
                                        zzamdVar2.zzp = j3;
                                        i34 = i8;
                                        i33 = i35;
                                    }
                                    i32++;
                                    i24 = i24;
                                    i2 = 1953658222;
                                }
                                i24 = i24;
                                zzamb zzambVar3 = zzaljVar.zzd.zza;
                                zzale zzaleVar5 = zzamdVar2.zza;
                                zzaleVar5.getClass();
                                zzamc zzamcVarZza = zzambVar3.zza(zzaleVar5.zza);
                                zzfx zzfxVarZzc5 = zzfwVar2.zzc(1935763834);
                                if (zzfxVarZzc5 != null) {
                                    zzamcVarZza.getClass();
                                    int i43 = zzamcVarZza.zzd;
                                    zzes zzesVar7 = zzfxVarZzc5.zza;
                                    zzesVar7.zzh(8);
                                    if ((zzesVar7.zzB() & 1) == 1) {
                                        zzesVar7.zzk(8);
                                    }
                                    int iZzs = zzesVar7.zzs();
                                    int iZzH2 = zzesVar7.zzH();
                                    int i44 = zzamdVar2.zze;
                                    if (iZzH2 > i44) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(iZzH2).length() + 56 + String.valueOf(i44).length());
                                        sb.append("Saiz sample count ");
                                        sb.append(iZzH2);
                                        sb.append(" is greater than fragment sample count");
                                        sb.append(i44);
                                        throw zzat.zzb(sb.toString(), null);
                                    }
                                    if (iZzs == 0) {
                                        boolean[] zArr2 = zzamdVar2.zzl;
                                        i3 = 0;
                                        for (int i45 = 0; i45 < iZzH2; i45++) {
                                            int iZzs2 = zzesVar7.zzs();
                                            i3 += iZzs2;
                                            zArr2[i45] = iZzs2 > i43;
                                        }
                                        z = false;
                                    } else {
                                        boolean z9 = iZzs > i43;
                                        i3 = iZzs * iZzH2;
                                        z = false;
                                        Arrays.fill(zzamdVar2.zzl, 0, iZzH2, z9);
                                    }
                                    Arrays.fill(zzamdVar2.zzl, iZzH2, zzamdVar2.zze, z);
                                    if (i3 > 0) {
                                        zzamdVar2.zza(i3);
                                    }
                                }
                                zzfx zzfxVarZzc6 = zzfwVar2.zzc(1935763823);
                                if (zzfxVarZzc6 != null) {
                                    zzes zzesVar8 = zzfxVarZzc6.zza;
                                    zzesVar8.zzh(8);
                                    int iZzB8 = zzesVar8.zzB();
                                    if ((iZzB8 & 1) == 1) {
                                        zzesVar8.zzk(8);
                                    }
                                    int iZzH3 = zzesVar8.zzH();
                                    if (iZzH3 != 1) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzH3).length() + 29);
                                        sb2.append("Unexpected saio entry count: ");
                                        sb2.append(iZzH3);
                                        throw zzat.zzb(sb2.toString(), null);
                                    }
                                    zzamdVar2.zzc += zzald.zza(iZzB8) == 0 ? zzesVar8.zzz() : zzesVar8.zzJ();
                                }
                                zzfx zzfxVarZzc7 = zzfwVar2.zzc(1936027235);
                                if (zzfxVarZzc7 != null) {
                                    zzl(zzfxVarZzc7.zza, 0, zzamdVar2);
                                }
                                String str3 = zzamcVarZza != null ? zzamcVarZza.zzb : null;
                                zzes zzesVar9 = null;
                                zzes zzesVar10 = null;
                                for (int i46 = 0; i46 < list3.size(); i46++) {
                                    zzfx zzfxVar4 = (zzfx) list3.get(i46);
                                    zzes zzesVar11 = zzfxVar4.zza;
                                    int i47 = zzfxVar4.zzd;
                                    if (i47 == 1935828848) {
                                        zzesVar11.zzh(12);
                                        if (zzesVar11.zzB() == 1936025959) {
                                            zzesVar9 = zzesVar11;
                                        }
                                    } else if (i47 == 1936158820) {
                                        zzesVar11.zzh(12);
                                        if (zzesVar11.zzB() == 1936025959) {
                                            zzesVar10 = zzesVar11;
                                        }
                                    }
                                }
                                if (zzesVar9 == null || zzesVar10 == null) {
                                    z4 = true;
                                } else {
                                    zzesVar9.zzh(8);
                                    int iZza = zzald.zza(zzesVar9.zzB());
                                    zzesVar9.zzk(4);
                                    if (iZza == 1) {
                                        zzesVar9.zzk(4);
                                    }
                                    if (zzesVar9.zzB() != 1) {
                                        throw zzat.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzesVar10.zzh(8);
                                    int iZza2 = zzald.zza(zzesVar10.zzB());
                                    zzesVar10.zzk(4);
                                    if (iZza2 == 1) {
                                        if (zzesVar10.zzz() == 0) {
                                            throw zzat.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (iZza2 >= 2) {
                                        zzesVar10.zzk(4);
                                    }
                                    if (zzesVar10.zzz() != 1) {
                                        throw zzat.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    z4 = true;
                                    zzesVar10.zzk(1);
                                    int iZzs3 = zzesVar10.zzs();
                                    int i48 = (iZzs3 & 240) >> 4;
                                    int i49 = iZzs3 & 15;
                                    if (zzesVar10.zzs() == 1) {
                                        int iZzs4 = zzesVar10.zzs();
                                        int i50 = i21;
                                        byte[] bArr3 = new byte[i50];
                                        zzesVar10.zzm(bArr3, 0, i50);
                                        if (iZzs4 == 0) {
                                            int iZzs5 = zzesVar10.zzs();
                                            byte[] bArr4 = new byte[iZzs5];
                                            zzesVar10.zzm(bArr4, 0, iZzs5);
                                            bArr = bArr4;
                                        } else {
                                            bArr = null;
                                        }
                                        zzamdVar2.zzk = true;
                                        zzamdVar2.zzm = new zzamc(true, str3, iZzs4, bArr3, i48, i49, bArr);
                                    }
                                }
                                int size5 = list3.size();
                                for (int i51 = 0; i51 < size5; i51++) {
                                    zzfx zzfxVar5 = (zzfx) list3.get(i51);
                                    if (zzfxVar5.zzd == 1970628964) {
                                        zzes zzesVar12 = zzfxVar5.zza;
                                        zzesVar12.zzh(8);
                                        zzesVar12.zzm(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zza)) {
                                            zzl(zzesVar12, 16, zzamdVar2);
                                        }
                                    }
                                }
                                i = 8;
                                i22 = 0;
                                i21 = 16;
                            }
                            i24++;
                            i12 = i;
                            i22 = i22;
                            z4 = z4;
                            i21 = i21;
                            i23 = i23;
                            size3 = size3;
                            list2 = list2;
                        } else {
                            i = i12;
                        }
                        i24++;
                        i12 = i;
                        i22 = i22;
                        z4 = z4;
                        i21 = i21;
                        i23 = i23;
                        size3 = size3;
                        list2 = list2;
                    }
                    int i52 = i22;
                    zzq zzqVarZzn2 = zzn(zzfwVar.zzb);
                    if (zzqVarZzn2 != null) {
                        int size6 = sparseArray3.size();
                        for (int i53 = i52; i53 < size6; i53++) {
                            ((zzalj) sparseArray3.valueAt(i53)).zzb(zzqVarZzn2);
                        }
                    }
                    if (this.zzz != -9223372036854775807L) {
                        int size7 = sparseArray3.size();
                        for (int i54 = i52; i54 < size7; i54++) {
                            zzalj zzaljVar2 = (zzalj) sparseArray3.valueAt(i54);
                            long j9 = this.zzz;
                            int i55 = zzaljVar2.zzf;
                            while (true) {
                                zzamd zzamdVar3 = zzaljVar2.zzb;
                                if (i55 >= zzamdVar3.zze || zzamdVar3.zzi[i55] > j9) {
                                    break;
                                }
                                if (zzamdVar3.zzj[i55]) {
                                    zzaljVar2.zzi = i55;
                                }
                                i55++;
                            }
                        }
                        this.zzz = -9223372036854775807L;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((zzfw) arrayDeque.peek()).zzb(zzfwVar);
                }
            }
        }
        zzi();
    }

    private static int zzk(int i) throws zzat {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw zzat.zzb(sb.toString(), null);
    }

    private static void zzl(zzes zzesVar, int i, zzamd zzamdVar) throws zzat {
        zzesVar.zzh(i + 8);
        int iZzB = zzesVar.zzB();
        int i2 = zzald.zza;
        if ((iZzB & 1) != 0) {
            throw zzat.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iZzB & 2) != 0;
        int iZzH = zzesVar.zzH();
        if (iZzH == 0) {
            Arrays.fill(zzamdVar.zzl, 0, zzamdVar.zze, false);
            return;
        }
        int i3 = zzamdVar.zze;
        if (iZzH != i3) {
            StringBuilder sb = new StringBuilder(String.valueOf(iZzH).length() + 58 + String.valueOf(i3).length());
            sb.append("Senc sample count ");
            sb.append(iZzH);
            sb.append(" is different from fragment sample count");
            sb.append(i3);
            throw zzat.zzb(sb.toString(), null);
        }
        Arrays.fill(zzamdVar.zzl, 0, iZzH, z);
        zzamdVar.zza(zzesVar.zzd());
        zzes zzesVar2 = zzamdVar.zzn;
        zzesVar.zzm(zzesVar2.zzi(), 0, zzesVar2.zze());
        zzesVar2.zzh(0);
        zzamdVar.zzo = false;
    }

    private static Pair zzm(zzes zzesVar, long j) throws zzat {
        long jZzJ;
        long jZzJ2;
        zzes zzesVar2 = zzesVar;
        zzesVar2.zzh(8);
        int iZza = zzald.zza(zzesVar2.zzB());
        zzesVar2.zzk(4);
        long jZzz = zzesVar2.zzz();
        if (iZza == 0) {
            jZzJ = zzesVar2.zzz();
            jZzJ2 = zzesVar2.zzz();
        } else {
            jZzJ = zzesVar2.zzJ();
            jZzJ2 = zzesVar2.zzJ();
        }
        long j2 = j + jZzJ2;
        long jZzv = zzfk.zzv(jZzJ, 1000000L, jZzz, RoundingMode.DOWN);
        zzesVar2.zzk(2);
        int iZzt = zzesVar2.zzt();
        int[] iArr = new int[iZzt];
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        long[] jArr3 = new long[iZzt];
        long j3 = j2;
        long j4 = jZzv;
        int i = 0;
        while (i < iZzt) {
            int iZzB = zzesVar2.zzB();
            if ((Integer.MIN_VALUE & iZzB) != 0) {
                throw zzat.zzb("Unhandled indirect reference", null);
            }
            long jZzz2 = zzesVar2.zzz();
            iArr[i] = iZzB & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            jZzJ += jZzz2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jZzv2 = zzfk.zzv(jZzJ, 1000000L, jZzz, RoundingMode.DOWN);
            jArr4[i] = jZzv2 - jArr5[i];
            zzesVar2.zzk(4);
            j3 += (long) iArr[i];
            i++;
            zzesVar2 = zzesVar;
            iZzt = iZzt;
            j4 = jZzv2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jZzv), new zzafd(iArr, jArr, jArr2, jArr3));
    }

    private static zzq zzn(List list) {
        int i;
        UUID[] uuidArr;
        zzalx zzalxVar;
        int size = list.size();
        int i2 = 0;
        ArrayList arrayList = null;
        while (i2 < size) {
            zzfx zzfxVar = (zzfx) list.get(i2);
            if (zzfxVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrZzi = zzfxVar.zza.zzi();
                zzes zzesVar = new zzes(bArrZzi);
                if (zzesVar.zze() < 32) {
                    i = i2;
                    zzalxVar = null;
                } else {
                    zzesVar.zzh(0);
                    int iZzd = zzesVar.zzd();
                    int iZzB = zzesVar.zzB();
                    if (iZzB != iZzd) {
                        StringBuilder sb = new StringBuilder(String.valueOf(iZzB).length() + 52 + String.valueOf(iZzd).length());
                        sb.append("Advertised atom size (");
                        sb.append(iZzB);
                        sb.append(") does not match buffer size: ");
                        sb.append(iZzd);
                        zzef.zzc("PsshAtomUtil", sb.toString());
                    } else {
                        int iZzB2 = zzesVar.zzB();
                        if (iZzB2 != 1886614376) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzB2).length() + 23);
                            sb2.append("Atom type is not pssh: ");
                            sb2.append(iZzB2);
                            zzef.zzc("PsshAtomUtil", sb2.toString());
                        } else {
                            int iZza = zzald.zza(zzesVar.zzB());
                            if (iZza > 1) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(iZza).length() + 26);
                                sb3.append("Unsupported pssh version: ");
                                sb3.append(iZza);
                                zzef.zzc("PsshAtomUtil", sb3.toString());
                            } else {
                                UUID uuid = new UUID(zzesVar.zzD(), zzesVar.zzD());
                                if (iZza == 1) {
                                    int iZzH = zzesVar.zzH();
                                    uuidArr = new UUID[iZzH];
                                    int i3 = 0;
                                    while (i3 < iZzH) {
                                        UUID[] uuidArr2 = uuidArr;
                                        int i4 = i3;
                                        uuidArr2[i4] = new UUID(zzesVar.zzD(), zzesVar.zzD());
                                        i3 = i4 + 1;
                                        i2 = i2;
                                        uuidArr = uuidArr2;
                                    }
                                } else {
                                    uuidArr = null;
                                }
                                i = i2;
                                int iZzH2 = zzesVar.zzH();
                                int iZzd2 = zzesVar.zzd();
                                if (iZzH2 != iZzd2) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(iZzH2).length() + 49 + String.valueOf(iZzd2).length());
                                    sb4.append("Atom data size (");
                                    sb4.append(iZzH2);
                                    sb4.append(") does not match the bytes left: ");
                                    sb4.append(iZzd2);
                                    zzef.zzc("PsshAtomUtil", sb4.toString());
                                    zzalxVar = null;
                                } else {
                                    byte[] bArr = new byte[iZzH2];
                                    zzesVar.zzm(bArr, 0, iZzH2);
                                    zzalxVar = new zzalx(uuid, iZza, bArr, uuidArr);
                                }
                            }
                        }
                    }
                    i = i2;
                    zzalxVar = null;
                }
                UUID uuid2 = zzalxVar == null ? null : zzalxVar.zza;
                if (uuid2 == null) {
                    zzef.zzc("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzp(uuid2, null, "video/mp4", bArrZzi));
                }
                i2 = i + 1;
            } else {
                i = i2;
            }
            i2 = i + 1;
        }
        if (arrayList == null) {
            return null;
        }
        return new zzq(arrayList);
    }

    private static final zzale zzo(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzale) sparseArray.valueAt(0);
        }
        zzale zzaleVar = (zzale) sparseArray.get(i);
        zzaleVar.getClass();
        return zzaleVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        zzagw zzagwVarZza = zzama.zza(zzafqVar);
        this.zzr = zzagwVarZza != null ? zzgvz.zzj(zzagwVarZza) : zzgvz.zzi();
        return zzagwVarZza == null;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final /* synthetic */ List zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        int i;
        int i2 = this.zzd;
        if ((i2 & 32) == 0) {
            zzafsVar = new zzanf(zzafsVar, this.zzc);
        }
        this.zzI = zzafsVar;
        zzi();
        zzahb[] zzahbVarArr = new zzahb[2];
        this.zzJ = zzahbVarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            zzahbVarArr[0] = this.zzI.zzu(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        zzahb[] zzahbVarArr2 = (zzahb[]) zzfk.zzb(this.zzJ, i);
        this.zzJ = zzahbVarArr2;
        for (zzahb zzahbVar : zzahbVarArr2) {
            zzahbVar.zzA(zzb);
        }
        List list = this.zze;
        this.zzK = new zzahb[list.size()];
        while (i4 < this.zzK.length) {
            zzahb zzahbVarZzu = this.zzI.zzu(i3, 3);
            zzahbVarZzu.zzA((zzv) list.get(i4));
            this.zzK[i4] = zzahbVarZzu;
            i4++;
            i3++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x01ae  */
    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        zzalj zzaljVar;
        char c;
        int i;
        int iZza;
        int iZzc;
        int i2;
        int iZzi;
        String strZzM;
        String strZzM2;
        long jZzv;
        long jZzz;
        long j;
        long j2;
        while (true) {
            int i3 = this.zzs;
            char c2 = 2;
            if (i3 == 0) {
                if (this.zzv == 0) {
                    zzes zzesVar = this.zzm;
                    if (!zzafqVar.zzb(zzesVar.zzi(), 0, 8, true)) {
                        if (this.zzM == -1) {
                            this.zzp.zze();
                            return -1;
                        }
                        zzagpVar.zza = 0L;
                        this.zzM = -1L;
                        this.zzI.zzw(this.zzq.zzb());
                        return 1;
                    }
                    this.zzv = 8;
                    zzesVar.zzh(0);
                    this.zzu = zzesVar.zzz();
                    this.zzt = zzesVar.zzB();
                }
                long j3 = this.zzu;
                if (j3 == 1) {
                    zzes zzesVar2 = this.zzm;
                    zzafqVar.zzc(zzesVar2.zzi(), 8, 8);
                    this.zzv += 8;
                    this.zzu = zzesVar2.zzJ();
                } else if (j3 == 0) {
                    long jZzo = zzafqVar.zzo();
                    if (jZzo == -1) {
                        ArrayDeque arrayDeque = this.zzn;
                        jZzo = !arrayDeque.isEmpty() ? ((zzfw) arrayDeque.peek()).zza : -1L;
                    }
                    if (jZzo != -1) {
                        this.zzu = (jZzo - zzafqVar.zzn()) + ((long) this.zzv);
                    }
                }
                long j4 = this.zzu;
                int i4 = this.zzv;
                long j5 = i4;
                if (j4 < j5) {
                    if (this.zzt != 1718773093 || i4 != 8) {
                        throw zzat.zzc("Atom size less than header length (unsupported).");
                    }
                    this.zzu = j5;
                    j4 = j5;
                }
                if (this.zzM != -1) {
                    if (this.zzt == 1936286840) {
                        zzes zzesVar3 = this.zzk;
                        zzesVar3.zza((int) j4);
                        System.arraycopy(this.zzm.zzi(), 0, zzesVar3.zzi(), 0, 8);
                        zzafqVar.zzc(zzesVar3.zzi(), 8, (int) (this.zzu - ((long) this.zzv)));
                        this.zzq.zza((zzafd) zzm(new zzfx(1936286840, zzesVar3).zza, zzafqVar.zzm()).second);
                    } else {
                        zzafqVar.zze((int) (j4 - j5), true);
                    }
                    zzi();
                } else {
                    long jZzn = zzafqVar.zzn() - j5;
                    int i5 = this.zzt;
                    if ((i5 == 1836019558 || i5 == 1835295092) && !this.zzL) {
                        this.zzI.zzw(new zzagr(this.zzA, jZzn));
                        this.zzL = true;
                    }
                    if (this.zzt == 1836019558) {
                        SparseArray sparseArray = this.zzf;
                        int size = sparseArray.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            zzamd zzamdVar = ((zzalj) sparseArray.valueAt(i6)).zzb;
                            zzamdVar.zzc = jZzn;
                            zzamdVar.zzb = jZzn;
                        }
                    }
                    int i7 = this.zzt;
                    if (i7 == 1835295092) {
                        this.zzC = null;
                        this.zzx = jZzn + this.zzu;
                        this.zzs = 2;
                    } else if (i7 == 1836019574 || i7 == 1953653099 || i7 == 1835297121 || i7 == 1835626086 || i7 == 1937007212 || i7 == 1836019558 || i7 == 1953653094 || i7 == 1836475768 || i7 == 1701082227 || i7 == 1835365473) {
                        long jZzn2 = zzafqVar.zzn();
                        long j6 = this.zzu;
                        long j7 = jZzn2 + j6;
                        if (j6 != this.zzv && i7 == 1835365473) {
                            zzes zzesVar4 = this.zzk;
                            zzesVar4.zza(8);
                            zzafqVar.zzi(zzesVar4.zzi(), 0, 8);
                            zzald.zzf(zzesVar4);
                            zzafqVar.zzf(zzesVar4.zzg());
                            zzafqVar.zzl();
                        }
                        long j8 = j7 - 8;
                        this.zzn.push(new zzfw(this.zzt, j8));
                        if (this.zzu == this.zzv) {
                            zzj(j8);
                        } else {
                            zzi();
                        }
                    } else if (i7 == 1751411826 || i7 == 1835296868 || i7 == 1836476516 || i7 == 1936286840 || i7 == 1937011556 || i7 == 1937011827 || i7 == 1668576371 || i7 == 1937011555 || i7 == 1937011578 || i7 == 1937013298 || i7 == 1937007471 || i7 == 1668232756 || i7 == 1937011571 || i7 == 1952867444 || i7 == 1952868452 || i7 == 1953196132 || i7 == 1953654136 || i7 == 1953658222 || i7 == 1886614376 || i7 == 1935763834 || i7 == 1935763823 || i7 == 1936027235 || i7 == 1970628964 || i7 == 1935828848 || i7 == 1936158820 || i7 == 1701606260 || i7 == 1835362404 || i7 == 1701671783 || i7 == 1969517665 || i7 == 1801812339 || i7 == 1768715124) {
                        if (this.zzv != 8) {
                            throw zzat.zzc("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.zzu > 2147483647L) {
                            throw zzat.zzc("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        zzes zzesVar5 = new zzes((int) this.zzu);
                        System.arraycopy(this.zzm.zzi(), 0, zzesVar5.zzi(), 0, 8);
                        this.zzw = zzesVar5;
                        this.zzs = 1;
                    } else {
                        if (this.zzu > 2147483647L) {
                            throw zzat.zzc("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.zzw = null;
                        this.zzs = 1;
                    }
                }
            } else if (i3 != 1) {
                long j9 = Long.MAX_VALUE;
                if (i3 != 2) {
                    zzaljVar = this.zzC;
                    if (zzaljVar != null) {
                        c = 2;
                        break;
                    }
                    SparseArray sparseArray2 = this.zzf;
                    int size2 = sparseArray2.size();
                    long j10 = Long.MAX_VALUE;
                    int i8 = 0;
                    zzalj zzaljVar2 = null;
                    while (i8 < size2) {
                        char c3 = c2;
                        zzalj zzaljVar3 = (zzalj) sparseArray2.valueAt(i8);
                        if ((zzaljVar3.zzk() || zzaljVar3.zzf != zzaljVar3.zzd.zzb) && (!zzaljVar3.zzk() || zzaljVar3.zzh != zzaljVar3.zzb.zzd)) {
                            long jZze = zzaljVar3.zze();
                            if (jZze < j10) {
                                zzaljVar2 = zzaljVar3;
                                j10 = jZze;
                            }
                        }
                        i8++;
                        c2 = c3;
                    }
                    c = c2;
                    if (zzaljVar2 != null) {
                        int iZze = (int) (zzaljVar2.zze() - zzafqVar.zzn());
                        if (iZze < 0) {
                            zzef.zzc("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            iZze = 0;
                        }
                        zzafqVar.zzf(iZze);
                        this.zzC = zzaljVar2;
                        zzaljVar = zzaljVar2;
                        break;
                    }
                    int iZzn = (int) (this.zzx - zzafqVar.zzn());
                    if (iZzn < 0) {
                        throw zzat.zzb("Offset to end of mdat was negative.", null);
                    }
                    zzafqVar.zzf(iZzn);
                    zzi();
                } else {
                    SparseArray sparseArray3 = this.zzf;
                    int size3 = sparseArray3.size();
                    zzalj zzaljVar4 = null;
                    for (int i9 = 0; i9 < size3; i9++) {
                        zzamd zzamdVar2 = ((zzalj) sparseArray3.valueAt(i9)).zzb;
                        if (zzamdVar2.zzo) {
                            long j11 = zzamdVar2.zzc;
                            if (j11 < j9) {
                                zzaljVar4 = (zzalj) sparseArray3.valueAt(i9);
                                j9 = j11;
                            }
                        }
                    }
                    if (zzaljVar4 == null) {
                        this.zzs = 3;
                    } else {
                        int iZzn2 = (int) (j9 - zzafqVar.zzn());
                        if (iZzn2 < 0) {
                            throw zzat.zzb("Offset to encryption data was negative.", null);
                        }
                        zzafqVar.zzf(iZzn2);
                        zzamd zzamdVar3 = zzaljVar4.zzb;
                        zzes zzesVar6 = zzamdVar3.zzn;
                        zzafqVar.zzc(zzesVar6.zzi(), 0, zzesVar6.zze());
                        zzesVar6.zzh(0);
                        zzamdVar3.zzo = false;
                    }
                }
            } else {
                long j12 = this.zzu - ((long) this.zzv);
                zzes zzesVar7 = this.zzw;
                int i10 = (int) j12;
                if (zzesVar7 != null) {
                    zzafqVar.zzc(zzesVar7.zzi(), 8, i10);
                    zzfx zzfxVar = new zzfx(this.zzt, zzesVar7);
                    ArrayDeque arrayDeque2 = this.zzn;
                    if (arrayDeque2.isEmpty()) {
                        int i11 = zzfxVar.zzd;
                        if (i11 == 1936286840) {
                            Pair pairZzm = zzm(zzfxVar.zza, zzafqVar.zzn());
                            this.zzq.zza((zzafd) pairZzm.second);
                            this.zzB = ((Long) pairZzm.first).longValue();
                            if (!this.zzL) {
                                this.zzI.zzw((zzags) pairZzm.second);
                                this.zzL = true;
                            }
                        } else if (i11 == 1701671783) {
                            zzes zzesVar8 = zzfxVar.zza;
                            if (this.zzJ.length != 0) {
                                zzesVar8.zzh(8);
                                int iZza2 = zzald.zza(zzesVar8.zzB());
                                if (iZza2 == 0) {
                                    strZzM = zzesVar8.zzM((char) 0);
                                    strZzM.getClass();
                                    strZzM2 = zzesVar8.zzM((char) 0);
                                    strZzM2.getClass();
                                    long jZzz2 = zzesVar8.zzz();
                                    long jZzv2 = zzfk.zzv(zzesVar8.zzz(), 1000000L, jZzz2, RoundingMode.DOWN);
                                    long j13 = this.zzB;
                                    long j14 = j13 != -9223372036854775807L ? j13 + jZzv2 : -9223372036854775807L;
                                    jZzv = zzfk.zzv(zzesVar8.zzz(), 1000L, jZzz2, RoundingMode.DOWN);
                                    jZzz = zzesVar8.zzz();
                                    j = jZzv2;
                                    j2 = j14;
                                } else if (iZza2 != 1) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(iZza2).length() + 35);
                                    sb.append("Skipping unsupported emsg version: ");
                                    sb.append(iZza2);
                                    zzef.zzc("FragmentedMp4Extractor", sb.toString());
                                } else {
                                    long jZzz3 = zzesVar8.zzz();
                                    long jZzv3 = zzfk.zzv(zzesVar8.zzJ(), 1000000L, jZzz3, RoundingMode.DOWN);
                                    long jZzv4 = zzfk.zzv(zzesVar8.zzz(), 1000L, jZzz3, RoundingMode.DOWN);
                                    long jZzz4 = zzesVar8.zzz();
                                    strZzM = zzesVar8.zzM((char) 0);
                                    strZzM.getClass();
                                    strZzM2 = zzesVar8.zzM((char) 0);
                                    strZzM2.getClass();
                                    jZzv = jZzv4;
                                    jZzz = jZzz4;
                                    j = -9223372036854775807L;
                                    j2 = jZzv3;
                                }
                                String str = strZzM;
                                String str2 = strZzM2;
                                byte[] bArr = new byte[zzesVar8.zzd()];
                                zzesVar8.zzm(bArr, 0, zzesVar8.zzd());
                                zzes zzesVar9 = new zzes(this.zzl.zza(new zzait(str, str2, jZzv, jZzz, bArr)));
                                int iZzd = zzesVar9.zzd();
                                for (zzahb zzahbVar : this.zzJ) {
                                    zzesVar9.zzh(0);
                                    zzahbVar.zzc(zzesVar9, iZzd);
                                }
                                if (j2 == -9223372036854775807L) {
                                    this.zzo.addLast(new zzali(j, true, iZzd));
                                    this.zzy += iZzd;
                                } else {
                                    ArrayDeque arrayDeque3 = this.zzo;
                                    if (arrayDeque3.isEmpty()) {
                                        for (zzahb zzahbVar2 : this.zzJ) {
                                            zzahbVar2.zze(j2, 1, iZzd, 0, null);
                                        }
                                    } else {
                                        arrayDeque3.addLast(new zzali(j2, false, iZzd));
                                        this.zzy += iZzd;
                                    }
                                }
                            }
                        }
                    } else {
                        ((zzfw) arrayDeque2.peek()).zza(zzfxVar);
                    }
                } else {
                    zzafqVar.zzf(i10);
                }
                zzj(zzafqVar.zzn());
            }
        }
        int i12 = 4;
        if (this.zzs == 3) {
            this.zzD = zzaljVar.zzf();
            String str3 = zzaljVar.zzd.zza.zzg.zzp;
            this.zzG = !(!Objects.equals(str3, "video/avc") ? !Objects.equals(str3, "video/hevc") || (this.zzd & 128) == 0 : (this.zzd & 64) == 0);
            if (zzaljVar.zzf < zzaljVar.zzi) {
                zzafqVar.zzf(this.zzD);
                zzamc zzamcVarZzj = zzaljVar.zzj();
                if (zzamcVarZzj != null) {
                    zzamd zzamdVar4 = zzaljVar.zzb;
                    zzes zzesVar10 = zzamdVar4.zzn;
                    int i13 = zzamcVarZzj.zzd;
                    if (i13 != 0) {
                        zzesVar10.zzk(i13);
                    }
                    if (zzamdVar4.zzb(zzaljVar.zzf)) {
                        zzesVar10.zzk(zzesVar10.zzt() * 6);
                    }
                }
                if (!zzaljVar.zzh()) {
                    this.zzC = null;
                }
                this.zzs = 3;
                return 0;
            }
            if (zzaljVar.zzd.zza.zzh == 1) {
                this.zzD -= 8;
                zzafqVar.zzf(8);
            }
            if ("audio/ac4".equals(zzaljVar.zzd.zza.zzg.zzp)) {
                this.zzE = zzaljVar.zzi(this.zzD, 7);
                int i14 = this.zzD;
                zzes zzesVar11 = this.zzk;
                zzaet.zzc(i14, zzesVar11);
                zzaljVar.zza.zzc(zzesVar11, 7);
                iZzi = this.zzE + 7;
                this.zzE = iZzi;
                i2 = 0;
            } else {
                i2 = 0;
                iZzi = zzaljVar.zzi(this.zzD, 0);
                this.zzE = iZzi;
            }
            this.zzD += iZzi;
            this.zzs = 4;
            this.zzF = i2;
        }
        zzamb zzambVar = zzaljVar.zzd.zza;
        zzahb zzahbVar3 = zzaljVar.zza;
        long jZzd = zzaljVar.zzd();
        int i15 = zzambVar.zzk;
        if (i15 == 0) {
            while (true) {
                int i16 = this.zzE;
                int i17 = this.zzD;
                if (i16 >= i17) {
                    break;
                }
                this.zzE += zzahbVar3.zza(zzafqVar, i17 - i16, false);
            }
        } else {
            zzes zzesVar12 = this.zzh;
            byte[] bArrZzi = zzesVar12.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[c] = 0;
            int i18 = 4 - i15;
            while (this.zzE < this.zzD) {
                int i19 = this.zzF;
                if (i19 == 0) {
                    if (this.zzK.length > 0 || !this.zzG) {
                        iZzc = zzgo.zzc(zzambVar.zzg);
                        if (i15 + iZzc > this.zzD - this.zzE) {
                            iZzc = 0;
                        }
                    } else {
                        iZzc = 0;
                    }
                    zzafqVar.zzc(bArrZzi, i18, i15 + iZzc);
                    zzesVar12.zzh(0);
                    int iZzB = zzesVar12.zzB();
                    if (iZzB < 0) {
                        throw zzat.zzb("Invalid NAL length", null);
                    }
                    this.zzF = iZzB - iZzc;
                    zzes zzesVar13 = this.zzg;
                    zzesVar13.zzh(0);
                    zzahbVar3.zzc(zzesVar13, i12);
                    this.zzE += i12;
                    this.zzD += i18;
                    this.zzH = this.zzK.length > 0 && iZzc > 0 && zzgo.zzb(zzambVar.zzg, bArrZzi, i12);
                    zzahbVar3.zzc(zzesVar12, iZzc);
                    this.zzE += iZzc;
                    if (iZzc > 0 && !this.zzG && zzgo.zzd(bArrZzi, i12, iZzc, zzambVar.zzg)) {
                        this.zzG = true;
                    }
                } else {
                    if (this.zzH) {
                        zzes zzesVar14 = this.zzi;
                        zzesVar14.zza(i19);
                        zzafqVar.zzc(zzesVar14.zzi(), 0, this.zzF);
                        zzahbVar3.zzc(zzesVar14, this.zzF);
                        iZza = this.zzF;
                        i = i12;
                        int iZza3 = zzgo.zza(zzesVar14.zzi(), zzesVar14.zze());
                        zzesVar14.zzh(0);
                        zzesVar14.zzf(iZza3);
                        int i20 = zzambVar.zzg.zzr;
                        if (i20 == -1) {
                            zzgy zzgyVar = this.zzp;
                            if (zzgyVar.zzb() != 0) {
                                zzgyVar.zza(0);
                            }
                        } else {
                            zzgy zzgyVar2 = this.zzp;
                            if (zzgyVar2.zzb() != i20) {
                                zzgyVar2.zza(i20);
                            }
                        }
                        zzgy zzgyVar3 = this.zzp;
                        zzgyVar3.zzc(jZzd, zzesVar14);
                        if ((zzaljVar.zzg() & 4) != 0) {
                            zzgyVar3.zze();
                        }
                    } else {
                        i = i12;
                        iZza = zzahbVar3.zza(zzafqVar, i19, false);
                    }
                    this.zzE += iZza;
                    this.zzF -= iZza;
                    i12 = i;
                }
            }
        }
        int iZzg = zzaljVar.zzg();
        if (!this.zzG) {
            iZzg |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        }
        int i21 = iZzg;
        zzamc zzamcVarZzj2 = zzaljVar.zzj();
        zzahbVar3.zze(jZzd, i21, this.zzD, 0, zzamcVarZzj2 != null ? zzamcVarZzj2.zzc : null);
        while (true) {
            ArrayDeque arrayDeque4 = this.zzo;
            if (arrayDeque4.isEmpty()) {
                break;
            }
            zzali zzaliVar = (zzali) arrayDeque4.removeFirst();
            int i22 = this.zzy;
            int i23 = zzaliVar.zzc;
            this.zzy = i22 - i23;
            long j15 = zzaliVar.zza;
            if (zzaliVar.zzb) {
                j15 += jZzd;
            }
            long j16 = j15;
            for (zzahb zzahbVar4 : this.zzJ) {
                zzahbVar4.zze(j16, 1, i23, this.zzy, null);
            }
        }
        if (!zzaljVar.zzh()) {
            this.zzC = null;
        }
        this.zzs = 3;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((zzalj) sparseArray.valueAt(i)).zzc();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzd();
        this.zzz = j2;
        this.zzn.clear();
        zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ zzafp zzg() {
        return zzafp.CC.$default$zzg(this);
    }

    final /* synthetic */ void zzh(long j, zzes zzesVar) {
        zzafc.zza(j, zzesVar, this.zzK);
    }

    public zzalk(zzanc zzancVar, int i, zzfh zzfhVar, zzamb zzambVar, List list, zzahb zzahbVar) {
        this.zzc = zzancVar;
        this.zzd = i;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzaiu();
        this.zzm = new zzes(16);
        this.zzg = new zzes(zzgo.zza);
        this.zzh = new zzes(6);
        this.zzi = new zzes();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzes(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzgvz.zzi();
        this.zzA = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzI = zzafs.zza;
        this.zzJ = new zzahb[0];
        this.zzK = new zzahb[0];
        this.zzp = new zzgy(new zzgx() { // from class: com.google.android.gms.internal.ads.zzalh
            @Override // com.google.android.gms.internal.ads.zzgx
            public final /* synthetic */ void zza(long j, zzes zzesVar) {
                this.zza.zzh(j, zzesVar);
            }
        });
        this.zzq = new zzafe();
        this.zzM = -1L;
    }
}
