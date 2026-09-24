package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzalv implements zzafp {
    public static final /* synthetic */ int zza = 0;
    private zzafs zzA;
    private zzalu[] zzB;
    private long[][] zzC;
    private int zzD;
    private zzaiq zzE;
    private final zzanc zzb;
    private final int zzc;
    private final zzes zzd;
    private final zzes zze;
    private final zzes zzf;
    private final zzes zzg;
    private final ArrayDeque zzh;
    private final zzalz zzi;
    private final List zzj;
    private zzgvz zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;
    private zzes zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private long zzx;
    private boolean zzy;
    private long zzz;

    static {
        int i = zzalr.zza;
    }

    @Deprecated
    public zzalv() {
        this(zzanc.zza, 16);
    }

    static /* synthetic */ long zzh(zzame zzameVar, long j, long j2) {
        int iZzl = zzl(zzameVar, j);
        return iZzl == -1 ? j2 : Math.min(zzameVar.zzc[iZzl], j2);
    }

    private final void zzj() {
        this.zzl = 0;
        this.zzo = 0;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0298  */
    /* JADX WARN: Code duplicated, block: B:125:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:128:0x02be  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:132:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:177:0x03bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0002 A[SYNTHETIC] */
    private final void zzk(long j) throws zzat {
        zzap zzapVarZze;
        ArrayDeque arrayDeque;
        zzap zzapVar;
        List list;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        int i2;
        long j2;
        int i3;
        zzap zzapVar2;
        List list2;
        zzap zzapVar3;
        int size;
        ArrayList arrayList3;
        zzfu zzfuVar;
        int i4;
        while (true) {
            ArrayDeque arrayDeque2 = this.zzh;
            if (arrayDeque2.isEmpty() || ((zzfw) arrayDeque2.peek()).zza != j) {
                break;
            }
            zzfw zzfwVar = (zzfw) arrayDeque2.pop();
            if (zzfwVar.zzd == 1836019574) {
                zzfw zzfwVarZzd = zzfwVar.zzd(1835365473);
                ArrayList arrayList4 = new ArrayList();
                if (zzfwVarZzd != null) {
                    zzapVarZze = zzald.zze(zzfwVarZzd);
                    if (this.zzy) {
                        zzapVarZze.getClass();
                        zzfu zzfuVar2 = (zzfu) zzapVarZze.zzc(zzfu.class, zzalp.zza);
                        if (zzfuVar2 != null && zzfuVar2.zzb[0] == 0) {
                            this.zzz = this.zzx + 16;
                        }
                        zzfu zzfuVar3 = (zzfu) zzapVarZze.zzc(zzfu.class, zzalq.zza);
                        zzfuVar3.getClass();
                        List listZzb = zzfuVar3.zzb();
                        ArrayList arrayList5 = new ArrayList(listZzb.size());
                        for (int i5 = 0; i5 < listZzb.size(); i5++) {
                            int iIntValue = ((Integer) listZzb.get(i5)).intValue();
                            if (iIntValue == 0) {
                                i4 = 1;
                            } else if (iIntValue == 1) {
                                i4 = 2;
                            } else if (iIntValue != 2) {
                                i4 = iIntValue != 3 ? 0 : 4;
                            } else {
                                i4 = 3;
                            }
                            arrayList5.add(Integer.valueOf(i4));
                        }
                        arrayList4 = arrayList5;
                    } else {
                        if (zzapVarZze != null && (this.zzc & 64) != 0 && (zzfuVar = (zzfu) zzapVarZze.zzc(zzfu.class, zzalo.zza)) != null) {
                            long jZzJ = new zzes(zzfuVar.zzb).zzJ();
                            if (jZzJ > 0) {
                                this.zzx = jZzJ;
                                this.zzw = true;
                                arrayDeque = arrayDeque2;
                            }
                        }
                        arrayDeque.clear();
                        if (!this.zzw) {
                            this.zzl = 2;
                        }
                    }
                } else {
                    zzapVarZze = null;
                }
                ArrayList arrayList6 = new ArrayList();
                boolean z = this.zzD == 1;
                ArrayList arrayList7 = arrayList4;
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
                zzap zzapVar4 = new zzap(-9223372036854775807L, zzald.zzd(zzfxVarZzc2.zza));
                int i6 = this.zzc;
                ArrayList arrayList8 = arrayList7;
                ArrayList arrayList9 = arrayList6;
                List listZzb2 = zzald.zzb(zzfwVar, zzagiVar, -9223372036854775807L, null, 1 == (i6 & 1), z, zzals.zza, false);
                if (this.zzy) {
                    zzgsw.zzj(arrayList8.size() == listZzb2.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", Integer.valueOf(arrayList8.size()), Integer.valueOf(listZzb2.size())));
                }
                String strZza = zzaln.zza(listZzb2);
                long j3 = -9223372036854775807L;
                long j4 = -9223372036854775807L;
                int i7 = 0;
                int i8 = 0;
                int i9 = -1;
                while (i7 < listZzb2.size()) {
                    zzame zzameVar = (zzame) listZzb2.get(i7);
                    int i10 = zzameVar.zzb;
                    if (i10 == 0) {
                        list = listZzb2;
                        size = i9;
                        arrayList2 = arrayList8;
                        arrayList3 = arrayList9;
                        i = i7;
                    } else {
                        zzamb zzambVar = zzameVar.zza;
                        zzafs zzafsVar = this.zzA;
                        int i11 = i8 + 1;
                        int i12 = zzambVar.zzb;
                        zzalu zzaluVar = new zzalu(zzambVar, zzameVar, zzafsVar.zzu(i8, i12));
                        List list3 = listZzb2;
                        long j5 = zzambVar.zze;
                        if (j5 == j4) {
                            j5 = zzameVar.zzi;
                        }
                        list = list3;
                        zzahb zzahbVar = zzaluVar.zzc;
                        zzahbVar.zzO(j5);
                        long jMax = Math.max(j3, j5);
                        zzv zzvVar = zzambVar.zzg;
                        String str = zzvVar.zzp;
                        int i13 = "audio/true-hd".equals(str) ? zzameVar.zze * 16 : zzameVar.zze + 30;
                        zzt zztVarZza = zzvVar.zza();
                        zztVarZza.zzp(i13);
                        if (i12 == 2) {
                            int i14 = zzvVar.zzf;
                            if ((i6 & 8) != 0) {
                                i14 |= i9 == -1 ? 1 : 2;
                            }
                            if (this.zzy) {
                                arrayList = arrayList8;
                                zztVarZza.zzh(((Integer) arrayList.get(i7)).intValue());
                                i14 |= 32768;
                            } else {
                                arrayList = arrayList8;
                            }
                            zztVarZza.zzg(i14);
                            i12 = 2;
                        } else {
                            arrayList = arrayList8;
                        }
                        if (zzas.zzb(str)) {
                            i = i7;
                            boolean z2 = zzameVar.zzj;
                            arrayList2 = arrayList;
                            int iMin = Math.min(!z2 ? zzameVar.zzh.length : i10, 20);
                            zzgsw.zzi(j5 != j4);
                            i2 = i9;
                            long jMin = Math.min(j5, 10000000L);
                            int i15 = 0;
                            int i16 = -1;
                            for (int i17 = 0; i17 < iMin; i17++) {
                                int i18 = z2 ? i17 : zzameVar.zzh[i17];
                                long j6 = zzameVar.zzf[i18];
                                if (j6 > jMin) {
                                    break;
                                }
                                if (j6 >= 0 && (i3 = zzameVar.zzd[i18]) > i15) {
                                    i15 = i3;
                                    i16 = i18;
                                }
                            }
                            if (i16 != -1) {
                                j2 = zzameVar.zzf[i16];
                            }
                            if (j2 != j4) {
                                zzapVar2 = new zzap(j4, new zzais(j2));
                            } else {
                                zzapVar2 = null;
                            }
                            zzalm.zzb(i12, zzagiVar, zztVarZza);
                            zzap zzapVar5 = zzvVar.zzl;
                            zzap[] zzapVarArr = new zzap[4];
                            list2 = this.zzj;
                            if (list2.isEmpty()) {
                                zzapVar3 = null;
                            } else {
                                zzapVar3 = new zzap(list2);
                            }
                            zzapVarArr[0] = zzapVar3;
                            zzapVarArr[1] = zzapVar;
                            zzapVarArr[2] = zzapVar4;
                            zzapVarArr[3] = zzapVar2;
                            zzalm.zza(i12, zzapVarZze, zztVarZza, zzapVar5, zzapVarArr);
                            zztVarZza.zzn(strZza);
                            if (Objects.equals(str, "audio/mpeg")) {
                                zzaluVar.zzf = zztVarZza.zzO();
                            } else {
                                zzahbVar.zzA(zztVarZza.zzO());
                            }
                            size = i2;
                            if (i12 == 2 && size == -1) {
                                size = arrayList9.size();
                            }
                            arrayList3 = arrayList9;
                            arrayList3.add(zzaluVar);
                            i8 = i11;
                            j3 = jMax;
                        } else {
                            i = i7;
                            arrayList2 = arrayList;
                            i2 = i9;
                        }
                        j2 = j4;
                        if (j2 != j4) {
                            zzapVar2 = new zzap(j4, new zzais(j2));
                        } else {
                            zzapVar2 = null;
                        }
                        zzalm.zzb(i12, zzagiVar, zztVarZza);
                        zzap zzapVar6 = zzvVar.zzl;
                        zzap[] zzapVarArr2 = new zzap[4];
                        list2 = this.zzj;
                        if (list2.isEmpty()) {
                            zzapVar3 = null;
                        } else {
                            zzapVar3 = new zzap(list2);
                        }
                        zzapVarArr2[0] = zzapVar3;
                        zzapVarArr2[1] = zzapVar;
                        zzapVarArr2[2] = zzapVar4;
                        zzapVarArr2[3] = zzapVar2;
                        zzalm.zza(i12, zzapVarZze, zztVarZza, zzapVar6, zzapVarArr2);
                        zztVarZza.zzn(strZza);
                        if (Objects.equals(str, "audio/mpeg")) {
                            zzaluVar.zzf = zztVarZza.zzO();
                        } else {
                            zzahbVar.zzA(zztVarZza.zzO());
                        }
                        size = i2;
                        if (i12 == 2) {
                            size = arrayList9.size();
                        }
                        arrayList3 = arrayList9;
                        arrayList3.add(zzaluVar);
                        i8 = i11;
                        j3 = jMax;
                    }
                    i7 = i + 1;
                    i9 = size;
                    arrayList9 = arrayList3;
                    arrayDeque2 = arrayDeque2;
                    listZzb2 = list;
                    arrayList8 = arrayList2;
                    j4 = -9223372036854775807L;
                }
                arrayDeque = arrayDeque2;
                int i19 = i9;
                int i20 = -1;
                zzalu[] zzaluVarArr = (zzalu[]) arrayList9.toArray(new zzalu[0]);
                this.zzB = zzaluVarArr;
                int length = zzaluVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i21 = 0; i21 < zzaluVarArr.length; i21++) {
                    jArr[i21] = new long[zzaluVarArr[i21].zzb.zzb];
                    jArr2[i21] = zzaluVarArr[i21].zzb.zzf[0];
                }
                int i22 = 0;
                long j7 = 0;
                while (i22 < zzaluVarArr.length) {
                    long j8 = Long.MAX_VALUE;
                    int i23 = i20;
                    for (int i24 = 0; i24 < zzaluVarArr.length; i24++) {
                        if (!zArr[i24]) {
                            long j9 = jArr2[i24];
                            if (j9 <= j8) {
                                i23 = i24;
                                j8 = j9;
                            }
                        }
                    }
                    int i25 = iArr[i23];
                    long[] jArr3 = jArr[i23];
                    jArr3[i25] = j7;
                    zzame zzameVar2 = zzaluVarArr[i23].zzb;
                    zzalu[] zzaluVarArr2 = zzaluVarArr;
                    j7 += (long) zzameVar2.zzd[i25];
                    int i26 = i25 + 1;
                    iArr[i23] = i26;
                    if (i26 < jArr3.length) {
                        jArr2[i23] = zzameVar2.zzf[i26];
                    } else {
                        zArr[i23] = true;
                        i22++;
                    }
                    zzaluVarArr = zzaluVarArr2;
                    i20 = -1;
                }
                this.zzC = jArr;
                this.zzA.zzv();
                this.zzA.zzw(new zzalt(j3, this.zzB, i19));
                arrayDeque.clear();
                if (!this.zzw) {
                    this.zzl = 2;
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((zzfw) arrayDeque2.peek()).zzb(zzfwVar);
            }
        }
        if (this.zzl != 2) {
            zzj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(zzame zzameVar, long j) {
        int iZza = zzameVar.zza(j);
        return iZza == -1 ? zzameVar.zzb(j) : iZza;
    }

    private static int zzm(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        zzagw zzagwVarZzb = zzama.zzb(zzafqVar, (this.zzc & 2) != 0);
        this.zzk = zzagwVarZzb != null ? zzgvz.zzj(zzagwVarZzb) : zzgvz.zzi();
        return zzagwVarZzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final /* synthetic */ List zzb() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        if ((this.zzc & 16) == 0) {
            zzafsVar = new zzanf(zzafsVar, this.zzb);
        }
        this.zzA = zzafsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = false;
        if (j == 0) {
            if (this.zzl != 3) {
                zzj();
                return;
            } else {
                this.zzi.zza();
                this.zzj.clear();
                return;
            }
        }
        for (zzalu zzaluVar : this.zzB) {
            zzame zzameVar = zzaluVar.zzb;
            int iZza = zzameVar.zza(j2);
            if (iZza == -1) {
                iZza = zzameVar.zzb(j2);
            }
            zzaluVar.zze = iZza;
            zzahc zzahcVar = zzaluVar.zzd;
            if (zzahcVar != null) {
                zzahcVar.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ zzafp zzg() {
        return zzafp.CC.$default$zzg(this);
    }

    public zzalv(zzanc zzancVar, int i) {
        this.zzb = zzancVar;
        this.zzc = i;
        this.zzk = zzgvz.zzi();
        this.zzl = (i & 4) != 0 ? 3 : 0;
        this.zzi = new zzalz();
        this.zzj = new ArrayList();
        this.zzg = new zzes(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzes(zzgo.zza);
        this.zze = new zzes(6);
        this.zzf = new zzes();
        this.zzq = -1;
        this.zzA = zzafs.zza;
        this.zzB = new zzalu[0];
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0343 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:279:0x034d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x0339 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0347 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        long j;
        long j2;
        zzahb zzahbVar;
        int i;
        int i2;
        int iZzc;
        boolean z;
        boolean z2;
        while (true) {
            int i3 = this.zzl;
            long j3 = 0;
            if (i3 == 0) {
                if (this.zzo == 0) {
                    zzes zzesVar = this.zzg;
                    if (!zzafqVar.zzb(zzesVar.zzi(), 0, 8, true)) {
                        if (this.zzD != 2 || (this.zzc & 2) == 0) {
                            return -1;
                        }
                        zzahb zzahbVarZzu = this.zzA.zzu(0, 4);
                        zzaiq zzaiqVar = this.zzE;
                        zzap zzapVar = zzaiqVar == null ? null : new zzap(-9223372036854775807L, zzaiqVar);
                        zzt zztVar = new zzt();
                        zztVar.zzl(zzapVar);
                        zzahbVarZzu.zzA(zztVar.zzO());
                        this.zzA.zzv();
                        this.zzA.zzw(new zzagr(-9223372036854775807L, 0L));
                        return -1;
                    }
                    this.zzo = 8;
                    zzesVar.zzh(0);
                    this.zzn = zzesVar.zzz();
                    this.zzm = zzesVar.zzB();
                }
                long j4 = this.zzn;
                if (j4 == 1) {
                    zzes zzesVar2 = this.zzg;
                    zzafqVar.zzc(zzesVar2.zzi(), 8, 8);
                    this.zzo += 8;
                    this.zzn = zzesVar2.zzJ();
                } else if (j4 == 0) {
                    long jZzo = zzafqVar.zzo();
                    if (jZzo == -1) {
                        zzfw zzfwVar = (zzfw) this.zzh.peek();
                        jZzo = zzfwVar != null ? zzfwVar.zza : -1L;
                    }
                    if (jZzo != -1) {
                        this.zzn = (jZzo - zzafqVar.zzn()) + ((long) this.zzo);
                    }
                }
                long j5 = this.zzn;
                int i4 = this.zzo;
                long j6 = i4;
                if (j5 < j6) {
                    if (this.zzm != 1718773093 || i4 != 8) {
                        throw zzat.zzc("Atom size less than header length (unsupported).");
                    }
                    this.zzn = j6;
                    i4 = 8;
                }
                int i5 = this.zzm;
                if (i5 == 1836019574 || i5 == 1953653099 || i5 == 1835297121 || i5 == 1835626086 || i5 == 1937007212 || i5 == 1701082227 || i5 == 1835365473 || i5 == 1635284069) {
                    long jZzn = zzafqVar.zzn();
                    long j7 = this.zzn;
                    long j8 = jZzn + j7;
                    long j9 = this.zzo;
                    if (j7 != j9 && this.zzm == 1835365473) {
                        zzes zzesVar3 = this.zzf;
                        zzesVar3.zza(8);
                        zzafqVar.zzi(zzesVar3.zzi(), 0, 8);
                        zzald.zzf(zzesVar3);
                        zzafqVar.zzf(zzesVar3.zzg());
                        zzafqVar.zzl();
                    }
                    long j10 = j8 - j9;
                    this.zzh.push(new zzfw(this.zzm, j10));
                    if (this.zzn == this.zzo) {
                        zzk(j10);
                    } else {
                        zzj();
                    }
                } else if (i5 == 1835296868 || i5 == 1836476516 || i5 == 1751411826 || i5 == 1937011556 || i5 == 1937011827 || i5 == 1937011571 || i5 == 1668576371 || i5 == 1701606260 || i5 == 1937011555 || i5 == 1937011578 || i5 == 1937013298 || i5 == 1937007471 || i5 == 1668232756 || i5 == 1953196132 || i5 == 1718909296 || i5 == 1969517665 || i5 == 1801812339 || i5 == 1768715124) {
                    zzgsw.zzi(i4 == 8);
                    zzgsw.zzi(this.zzn <= 2147483647L);
                    zzes zzesVar4 = new zzes((int) this.zzn);
                    System.arraycopy(this.zzg.zzi(), 0, zzesVar4.zzi(), 0, 8);
                    this.zzp = zzesVar4;
                    this.zzl = 1;
                } else {
                    long jZzn2 = zzafqVar.zzn();
                    long j11 = this.zzo;
                    long j12 = jZzn2 - j11;
                    if (this.zzm == 1836086884) {
                        this.zzE = new zzaiq(0L, j12, -9223372036854775807L, j12 + j11, this.zzn - j11);
                    }
                    this.zzp = null;
                    this.zzl = 1;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        this.zzi.zzb(zzafqVar, zzagpVar, this.zzj);
                        if (zzagpVar.zza == 0) {
                            zzj();
                        }
                        return 1;
                    }
                    long jZzn3 = zzafqVar.zzn();
                    int i6 = this.zzq;
                    if (i6 == -1) {
                        int i7 = -1;
                        int i8 = -1;
                        boolean z3 = true;
                        boolean z4 = true;
                        long j13 = Long.MAX_VALUE;
                        long j14 = Long.MAX_VALUE;
                        long j15 = Long.MAX_VALUE;
                        int i9 = 0;
                        j2 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                        while (true) {
                            zzalu[] zzaluVarArr = this.zzB;
                            if (i9 >= zzaluVarArr.length) {
                                break;
                            }
                            zzalu zzaluVar = zzaluVarArr[i9];
                            int i10 = zzaluVar.zze;
                            zzame zzameVar = zzaluVar.zzb;
                            long j16 = j3;
                            if (i10 != zzameVar.zzb) {
                                long j17 = zzameVar.zzc[i10];
                                long[][] jArr = this.zzC;
                                jArr.getClass();
                                long j18 = jArr[i9][i10];
                                long j19 = j17 - jZzn3;
                                boolean z5 = j19 < j16 || j19 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                if (z5) {
                                    z = z4;
                                } else {
                                    if (z4) {
                                        z4 = z5;
                                        i8 = i9;
                                        j14 = j18;
                                        j15 = j19;
                                    } else {
                                        z = false;
                                    }
                                    if (j18 < j13) {
                                        z3 = z5;
                                        i7 = i9;
                                        j13 = j18;
                                    }
                                }
                                if (z5 != z || j19 >= j15) {
                                    z4 = z;
                                } else {
                                    z4 = z5;
                                    i8 = i9;
                                    j14 = j18;
                                    j15 = j19;
                                }
                                if (j18 < j13) {
                                    z3 = z5;
                                    i7 = i9;
                                    j13 = j18;
                                }
                            }
                            i9++;
                            j3 = j16;
                        }
                        j = j3;
                        i6 = (j13 == Long.MAX_VALUE || !z3 || j14 < j13 + 10485760) ? i8 : i7;
                        this.zzq = i6;
                        if (i6 == -1) {
                            return -1;
                        }
                    } else {
                        j = 0;
                        j2 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                    }
                    zzalu zzaluVar2 = this.zzB[i6];
                    zzahb zzahbVar2 = zzaluVar2.zzc;
                    int i11 = zzaluVar2.zze;
                    zzame zzameVar2 = zzaluVar2.zzb;
                    long j20 = zzameVar2.zzc[i11] + this.zzz;
                    int[] iArr = zzameVar2.zzd;
                    int i12 = iArr[i11];
                    zzahc zzahcVar = zzaluVar2.zzd;
                    zzahb zzahbVar3 = zzahbVar2;
                    int i13 = 0;
                    long j21 = (j20 - jZzn3) + ((long) this.zzr);
                    if (j21 < j || j21 >= j2) {
                        zzagpVar.zza = j20;
                        return 1;
                    }
                    zzamb zzambVar = zzaluVar2.zza;
                    if (zzambVar.zzh == 1) {
                        j21 += 8;
                        i12 -= 8;
                    }
                    int i14 = i12;
                    zzafqVar.zzf((int) j21);
                    zzv zzvVar = zzambVar.zzg;
                    String str = zzvVar.zzp;
                    if (!Objects.equals(str, "video/avc") ? !Objects.equals(str, "video/hevc") || (this.zzc & 128) == 0 : (this.zzc & 32) == 0) {
                        this.zzu = true;
                    }
                    int i15 = zzambVar.zzk;
                    if (i15 == 0) {
                        zzahbVar = zzahbVar3;
                        if ("audio/ac4".equals(str)) {
                            if (this.zzs == 0) {
                                zzes zzesVar5 = this.zzf;
                                zzaet.zzc(i14, zzesVar5);
                                zzahbVar.zzc(zzesVar5, 7);
                                this.zzs += 7;
                            }
                            i14 += 7;
                        } else if (zzaluVar2.zzf != null && Objects.equals(str, "audio/mpeg")) {
                            zzv zzvVarZzO = zzaluVar2.zzf;
                            zzes zzesVar6 = this.zzf;
                            zzesVar6.zza(4);
                            zzafqVar.zzi(zzesVar6.zzi(), 0, 4);
                            zzafqVar.zzl();
                            zzagm zzagmVar = new zzagm();
                            if (zzagmVar.zza(zzesVar6.zzB()) && !Objects.equals(zzvVarZzO.zzp, zzagmVar.zzb)) {
                                zzt zztVarZza = zzvVarZzO.zza();
                                String str2 = zzagmVar.zzb;
                                str2.getClass();
                                zztVarZza.zzo(str2);
                                zzvVarZzO = zztVarZza.zzO();
                            }
                            zzahbVar.zzA(zzvVarZzO);
                            zzaluVar2.zzf = null;
                        } else if (zzahcVar != null) {
                            zzahcVar.zzb(zzafqVar);
                        }
                        while (true) {
                            int i16 = this.zzs;
                            if (i16 >= i14) {
                                break;
                            }
                            int iZza = zzahbVar.zza(zzafqVar, i14 - i16, false);
                            this.zzr += iZza;
                            this.zzs += iZza;
                            this.zzt -= iZza;
                        }
                    } else {
                        zzes zzesVar7 = this.zze;
                        byte[] bArrZzi = zzesVar7.zzi();
                        bArrZzi[0] = 0;
                        bArrZzi[1] = 0;
                        bArrZzi[2] = 0;
                        int i17 = 4 - i15;
                        i14 += i17;
                        while (this.zzs < i14) {
                            int i18 = this.zzt;
                            if (i18 == 0) {
                                if (this.zzu || zzgo.zzc(zzvVar) + i15 > iArr[i11] - this.zzr) {
                                    i2 = i15;
                                    iZzc = i13;
                                } else {
                                    iZzc = zzgo.zzc(zzvVar);
                                    i2 = i15 + iZzc;
                                }
                                zzafqVar.zzc(bArrZzi, i17, i2);
                                this.zzr += i2;
                                int i19 = i13;
                                zzesVar7.zzh(i19);
                                int iZzB = zzesVar7.zzB();
                                if (iZzB < 0) {
                                    throw zzat.zzb("Invalid NAL length", null);
                                }
                                this.zzt = iZzB - iZzc;
                                zzes zzesVar8 = this.zzd;
                                zzesVar8.zzh(i19);
                                i = i15;
                                zzahb zzahbVar4 = zzahbVar3;
                                zzahbVar4.zzc(zzesVar8, 4);
                                this.zzs += 4;
                                if (iZzc > 0) {
                                    zzahbVar4.zzc(zzesVar7, iZzc);
                                    this.zzs += iZzc;
                                    if (zzgo.zzd(bArrZzi, 4, iZzc, zzvVar)) {
                                        this.zzu = true;
                                        zzahbVar3 = zzahbVar4;
                                        i15 = i;
                                    }
                                    i13 = 0;
                                }
                                zzahbVar3 = zzahbVar4;
                            } else {
                                i = i15;
                                int iZza2 = zzahbVar3.zza(zzafqVar, i18, i13);
                                this.zzr += iZza2;
                                this.zzs += iZza2;
                                this.zzt -= iZza2;
                            }
                            i15 = i;
                            i13 = 0;
                        }
                        zzahbVar = zzahbVar3;
                    }
                    int i20 = i14;
                    long j22 = zzameVar2.zzf[i11];
                    int i21 = zzameVar2.zzg[i11];
                    if (!this.zzu) {
                        i21 |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    int i22 = i21;
                    if (zzahcVar != null) {
                        zzahb zzahbVar5 = zzahbVar;
                        zzahcVar.zzc(zzahbVar5, j22, i22, i20, 0, null);
                        if (i11 + 1 == zzameVar2.zzb) {
                            zzahcVar.zzd(zzahbVar5, null);
                        }
                    } else {
                        zzahbVar.zze(j22, i22, i20, 0, null);
                    }
                    zzaluVar2.zze++;
                    this.zzq = -1;
                    this.zzr = 0;
                    this.zzs = 0;
                    this.zzt = 0;
                    this.zzu = false;
                    return 0;
                }
                long j23 = this.zzn - ((long) this.zzo);
                long jZzn4 = zzafqVar.zzn() + j23;
                zzes zzesVar9 = this.zzp;
                if (zzesVar9 != null) {
                    zzafqVar.zzc(zzesVar9.zzi(), this.zzo, (int) j23);
                    if (this.zzm == 1718909296) {
                        this.zzv = true;
                        zzesVar9.zzh(8);
                        int iZzm = zzm(zzesVar9.zzB());
                        if (iZzm == 0) {
                            zzesVar9.zzk(4);
                            do {
                                if (zzesVar9.zzd() <= 0) {
                                    iZzm = 0;
                                    break;
                                }
                                iZzm = zzm(zzesVar9.zzB());
                            } while (iZzm == 0);
                        }
                        this.zzD = iZzm;
                    } else {
                        ArrayDeque arrayDeque = this.zzh;
                        if (!arrayDeque.isEmpty()) {
                            ((zzfw) arrayDeque.peek()).zza(new zzfx(this.zzm, zzesVar9));
                        }
                    }
                } else {
                    if (!this.zzv && this.zzm == 1835295092) {
                        this.zzD = 1;
                    }
                    if (j23 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        zzafqVar.zzf((int) j23);
                    } else {
                        zzagpVar.zza = zzafqVar.zzn() + j23;
                        z2 = true;
                    }
                    zzk(jZzn4);
                    if (this.zzw) {
                        this.zzy = true;
                        zzagpVar.zza = this.zzx;
                        this.zzw = false;
                    } else if (!z2) {
                        continue;
                    }
                    if (this.zzl != 2) {
                        return 1;
                    }
                }
                z2 = false;
                zzk(jZzn4);
                if (this.zzw) {
                    this.zzy = true;
                    zzagpVar.zza = this.zzx;
                    this.zzw = false;
                } else if (!z2) {
                    continue;
                }
                if (this.zzl != 2) {
                    return 1;
                }
            }
        }
    }
}
