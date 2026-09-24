package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzlz {
    private final zzng zzc;
    private final zzdy zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjo zzh;
    private zzlw zzi;
    private zzlw zzj;
    private zzlw zzk;
    private zzlw zzl;
    private zzlw zzm;
    private int zzn;
    private Object zzo;
    private long zzp;
    private final zzlh zzr;
    private final zzbd zza = new zzbd();
    private final zzbe zzb = new zzbe();
    private List zzq = new ArrayList();

    public zzlz(zzng zzngVar, zzdy zzdyVar, zzlh zzlhVar, zzjo zzjoVar) {
        this.zzc = zzngVar;
        this.zzd = zzdyVar;
        this.zzr = zzlhVar;
        this.zzh = zzjoVar;
    }

    private static zzxc zzA(zzbf zzbfVar, Object obj, long j, long j2, zzbe zzbeVar, zzbd zzbdVar) {
        zzbfVar.zzo(obj, zzbdVar);
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzbfVar.zze(obj);
        zzbdVar.zzb();
        zzbfVar.zzo(obj, zzbdVar);
        int iZze = zzbdVar.zze(j);
        return iZze == -1 ? new zzxc(obj, j2, zzbdVar.zzf(j)) : new zzxc(obj, iZze, zzbdVar.zzd(iZze), j2);
    }

    private final void zzB() {
        int i = zzgvz.zzd;
        final zzgvw zzgvwVar = new zzgvw();
        for (zzlw zzlwVarZzp = this.zzi; zzlwVarZzp != null; zzlwVarZzp = zzlwVarZzp.zzp()) {
            zzgvwVar.zzf(zzlwVarZzp.zzg.zza);
        }
        zzlw zzlwVar = this.zzj;
        final zzxc zzxcVar = zzlwVar == null ? null : zzlwVar.zzg.zza;
        this.zzd.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzly
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgvwVar, zzxcVar);
            }
        });
    }

    private final long zzC(Object obj) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzlw zzlwVar = (zzlw) this.zzq.get(i);
            if (zzlwVar.zzb.equals(obj)) {
                return zzlwVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final int zzD(zzbf zzbfVar) {
        zzbf zzbfVar2;
        zzlw zzlwVarZzp = this.zzi;
        if (zzlwVarZzp == null) {
            return 0;
        }
        int iZze = zzbfVar.zze(zzlwVarZzp.zzb);
        while (true) {
            zzbfVar2 = zzbfVar;
            iZze = zzbfVar2.zzl(iZze, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzlwVarZzp.getClass();
                if (zzlwVarZzp.zzp() == null || zzlwVarZzp.zzg.zzi) {
                    break;
                }
                zzlwVarZzp = zzlwVarZzp.zzp();
            }
            zzlw zzlwVarZzp2 = zzlwVarZzp.zzp();
            if (iZze == -1 || zzlwVarZzp2 == null || zzbfVar2.zze(zzlwVarZzp2.zzb) != iZze) {
                break;
            }
            zzlwVarZzp = zzlwVarZzp2;
            zzbfVar = zzbfVar2;
        }
        int iZzs = zzs(zzlwVarZzp);
        zzlwVarZzp.zzg = zzx(zzbfVar2, zzlwVarZzp.zzg);
        return iZzs;
    }

    private final zzlx zzE(zzbf zzbfVar, zzlw zzlwVar, long j) {
        zzbf zzbfVar2;
        long j2;
        long j3;
        zzbe zzbeVar;
        long j4;
        long j5;
        Object obj;
        long j6;
        long j7;
        zzlx zzlxVar = zzlwVar.zzg;
        long jZza = zzlwVar.zza();
        long j8 = zzlxVar.zzf;
        long j9 = (jZza + j8) - j;
        long j10 = 0;
        if (!zzlxVar.zzi) {
            zzxc zzxcVar = zzlxVar.zza;
            Object obj2 = zzxcVar.zza;
            zzbd zzbdVar = this.zza;
            zzbfVar.zzo(obj2, zzbdVar);
            boolean z = zzlxVar.zzh;
            if (!zzxcVar.zzb()) {
                int i = zzxcVar.zze;
                if (i != -1) {
                    zzbdVar.zzi(i);
                }
                int iZzd = zzbdVar.zzd(i);
                zzbdVar.zzk(i);
                if (iZzd != zzbdVar.zzg(i)) {
                    return zzG(zzbfVar, obj2, i, iZzd, j8, zzxcVar.zzd, false);
                }
                zzK(zzbfVar, obj2, i);
                return zzH(zzbfVar, obj2, 0L, -9223372036854775807L, j8, zzxcVar.zzd, false);
            }
            int i2 = zzxcVar.zzb;
            if (zzbdVar.zzg(i2) == -1) {
                return null;
            }
            int iZza = zzbdVar.zzg.zza(i2).zza(zzxcVar.zzc);
            if (iZza < 0) {
                return zzG(zzbfVar, obj2, i2, iZza, zzlxVar.zzd, zzxcVar.zzd, false);
            }
            long jLongValue = zzlxVar.zzd;
            if (jLongValue == -9223372036854775807L) {
                zzbe zzbeVar2 = this.zzb;
                long jMax = zzL(zzbfVar, zzbdVar.zzc, zzbdVar.zzd, zzbeVar2) ? Math.max(0L, j9) : -9223372036854775807L;
                zzbfVar2 = zzbfVar;
                Pair pairZzn = zzbfVar2.zzn(zzbeVar2, zzbdVar, zzbdVar.zzc, -9223372036854775807L, jMax);
                if (pairZzn == null) {
                    return null;
                }
                jLongValue = ((Long) pairZzn.second).longValue();
                j3 = jMax;
                j2 = -9223372036854775807L;
            } else {
                zzbfVar2 = zzbfVar;
                j2 = jLongValue;
                j3 = -9223372036854775807L;
            }
            zzK(zzbfVar2, obj2, i2);
            return zzH(zzbfVar2, obj2, Math.max(0L, jLongValue), j3, j2, zzxcVar.zzd, false);
        }
        zzxc zzxcVar2 = zzlxVar.zza;
        Object obj3 = zzxcVar2.zza;
        int iZze = zzbfVar.zze(obj3);
        int i3 = this.zzf;
        boolean z2 = this.zzg;
        zzbe zzbeVar3 = this.zzb;
        zzbd zzbdVar2 = this.zza;
        int iZzl = zzbfVar.zzl(iZze, zzbdVar2, zzbeVar3, i3, z2);
        if (iZzl == -1) {
            return null;
        }
        int i4 = zzbfVar.zzd(iZzl, zzbdVar2, true).zzc;
        Object obj4 = zzbdVar2.zzb;
        obj4.getClass();
        long j11 = zzxcVar2.zzd;
        if (zzbfVar.zzb(i4, zzbeVar3, 0L).zzn == iZzl) {
            long jMax2 = zzL(zzbfVar, zzbdVar2.zzc, zzbdVar2.zzd, zzbeVar3) ? Math.max(0L, j9) : -9223372036854775807L;
            Pair pairZzn2 = zzbfVar.zzn(zzbeVar3, zzbdVar2, i4, -9223372036854775807L, jMax2);
            if (pairZzn2 == null) {
                return null;
            }
            Object obj5 = pairZzn2.first;
            long jLongValue2 = ((Long) pairZzn2.second).longValue();
            zzlw zzlwVarZzp = zzlwVar.zzp();
            if (zzlwVarZzp == null || !zzlwVarZzp.zzb.equals(obj5)) {
                long jZzC = zzC(obj5);
                if (jZzC == -1) {
                    jZzC = this.zze;
                    this.zze = 1 + jZzC;
                }
                j7 = jZzC;
            } else {
                j7 = zzlwVarZzp.zzg.zza.zzd;
            }
            long j12 = jMax2;
            zzbeVar = zzbeVar3;
            obj = obj5;
            j4 = j7;
            j6 = j12;
            j5 = jLongValue2;
            j10 = -9223372036854775807L;
        } else {
            zzbeVar = zzbeVar3;
            j4 = j11;
            j5 = 0;
            obj = obj4;
            j6 = -9223372036854775807L;
        }
        zzxc zzxcVarZzA = zzA(zzbfVar, obj, j5, j4, zzbeVar, zzbdVar2);
        long j13 = j5;
        if (j10 != -9223372036854775807L && zzlxVar.zzd != -9223372036854775807L) {
            zzbfVar.zzo(obj3, zzbdVar2).zzb();
            int i5 = zzbdVar2.zzg.zzd;
        }
        return zzF(zzbfVar, zzxcVarZzA, j10, j13, j6);
    }

    private final zzlx zzF(zzbf zzbfVar, zzxc zzxcVar, long j, long j2, long j3) {
        Object obj = zzxcVar.zza;
        zzbfVar.zzo(obj, this.zza);
        return zzxcVar.zzb() ? zzG(zzbfVar, obj, zzxcVar.zzb, zzxcVar.zzc, j, zzxcVar.zzd, false) : zzH(zzbfVar, obj, j2, j3, j, zzxcVar.zzd, false);
    }

    private final zzlx zzG(zzbf zzbfVar, Object obj, int i, int i2, long j, long j2, boolean z) {
        zzxc zzxcVar = new zzxc(obj, i, i2, j2);
        Object obj2 = zzxcVar.zza;
        int i3 = zzxcVar.zzb;
        int i4 = zzxcVar.zzc;
        zzbd zzbdVar = this.zza;
        long jZzh = zzbfVar.zzo(obj2, zzbdVar).zzh(i3, i4);
        if (i2 == zzbdVar.zzd(i)) {
            zzbdVar.zzj();
        }
        zzbdVar.zzk(i3);
        long jMax = 0;
        if (jZzh != -9223372036854775807L && jZzh <= 0) {
            jMax = Math.max(0L, (-1) + jZzh);
        }
        return new zzlx(zzxcVar, jMax, -9223372036854775807L, j, -9223372036854775807L, jZzh, false, false, false, false, false);
    }

    private final zzlx zzH(zzbf zzbfVar, Object obj, long j, long j2, long j3, long j4, boolean z) {
        long j5;
        long j6;
        long j7;
        long jMax = j;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        int iZzf = zzbdVar.zzf(jMax);
        if (iZzf == -1) {
            zzbdVar.zzb();
        } else {
            zzbdVar.zzk(iZzf);
        }
        zzxc zzxcVar = new zzxc(obj, j4, iZzf);
        boolean zZzM = zzM(zzxcVar);
        boolean zZzI = zzI(zzbfVar, zzxcVar);
        boolean zZzJ = zzJ(zzbfVar, zzxcVar, zZzM);
        if (iZzf != -1) {
            zzbdVar.zzk(iZzf);
        }
        if (iZzf != -1) {
            zzbdVar.zzi(iZzf);
        }
        if (iZzf != -1) {
            zzbdVar.zzc(iZzf);
            j5 = 0;
        } else {
            j5 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L) {
            j7 = j5;
            j6 = j7;
        } else {
            j6 = zzbdVar.zzd;
            j7 = -9223372036854775807L;
        }
        if (j6 != -9223372036854775807L && jMax >= j6) {
            jMax = Math.max(0L, j6 - 1);
        }
        return new zzlx(zzxcVar, jMax, j2, j3, j7, j6, false, false, zZzM, zZzI, zZzJ);
    }

    private final boolean zzI(zzbf zzbfVar, zzxc zzxcVar) {
        if (!zzM(zzxcVar)) {
            return false;
        }
        Object obj = zzxcVar.zza;
        return zzbfVar.zzb(zzbfVar.zzo(obj, this.zza).zzc, this.zzb, 0L).zzo == zzbfVar.zze(obj);
    }

    private final boolean zzJ(zzbf zzbfVar, zzxc zzxcVar, boolean z) {
        int iZze = zzbfVar.zze(zzxcVar.zza);
        zzbd zzbdVar = this.zza;
        int i = zzbfVar.zzd(iZze, zzbdVar, false).zzc;
        zzbe zzbeVar = this.zzb;
        return !zzbfVar.zzb(i, zzbeVar, 0L).zzi && zzbfVar.zzl(iZze, zzbdVar, zzbeVar, this.zzf, this.zzg) == -1 && z;
    }

    private final long zzK(zzbf zzbfVar, Object obj, int i) {
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        zzbdVar.zzc(i);
        long j = zzbdVar.zzg.zza(i).zzi;
        return 0L;
    }

    private static boolean zzL(zzbf zzbfVar, int i, long j, zzbe zzbeVar) {
        if (j == -9223372036854775807L) {
            zzbfVar.zzb(i, zzbeVar, 0L);
            if (zzbeVar.zzi && !zzbeVar.zzk) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zzM(zzxc zzxcVar) {
        return !zzxcVar.zzb() && zzxcVar.zze == -1;
    }

    public final int zza(zzbf zzbfVar, int i) {
        this.zzf = i;
        return zzD(zzbfVar);
    }

    public final int zzb(zzbf zzbfVar, boolean z) {
        this.zzg = z;
        return zzD(zzbfVar);
    }

    public final void zzc(zzbf zzbfVar, zzjo zzjoVar) {
        this.zzh = zzjoVar;
        long j = zzjoVar.zzb;
        zzj();
    }

    public final boolean zzd(zzxa zzxaVar) {
        zzlw zzlwVar = this.zzl;
        return zzlwVar != null && zzlwVar.zza == zzxaVar;
    }

    public final boolean zze(zzxa zzxaVar) {
        zzlw zzlwVar = this.zzm;
        return zzlwVar != null && zzlwVar.zza == zzxaVar;
    }

    public final void zzf(long j) {
        zzlw zzlwVar = this.zzl;
        if (zzlwVar != null) {
            zzlwVar.zzi(j);
        }
    }

    public final boolean zzg() {
        zzlw zzlwVar = this.zzl;
        if (zzlwVar != null) {
            return !zzlwVar.zzg.zzk && zzlwVar.zzd() && this.zzl.zzg.zzf != -9223372036854775807L && this.zzn < 100;
        }
        return true;
    }

    public final zzlx zzh(long j, zzmm zzmmVar) {
        zzlw zzlwVar = this.zzl;
        return zzlwVar == null ? zzF(zzmmVar.zza, zzmmVar.zzb, zzmmVar.zzc, zzmmVar.zzs, -9223372036854775807L) : zzE(zzmmVar.zza, zzlwVar, j);
    }

    public final void zzj() {
        if (this.zzq.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.zzq.size(); i++) {
            ((zzlw) this.zzq.get(i)).zzn();
        }
        this.zzq = arrayList;
        this.zzm = null;
        zzt();
    }

    public final zzlw zzk() {
        return this.zzl;
    }

    public final zzlw zzl() {
        return this.zzm;
    }

    public final zzlw zzm() {
        return this.zzi;
    }

    public final zzlw zzn() {
        return this.zzj;
    }

    public final zzlw zzo() {
        return this.zzk;
    }

    public final zzlw zzp() {
        zzlw zzlwVar = this.zzk;
        zzlw zzlwVar2 = this.zzj;
        if (zzlwVar == zzlwVar2) {
            zzlwVar2.getClass();
            this.zzk = zzlwVar2.zzp();
        }
        zzlwVar2.getClass();
        this.zzj = zzlwVar2.zzp();
        zzB();
        zzlw zzlwVar3 = this.zzj;
        zzlwVar3.getClass();
        return zzlwVar3;
    }

    public final zzlw zzq() {
        zzlw zzlwVar = this.zzk;
        zzlwVar.getClass();
        this.zzk = zzlwVar.zzp();
        zzB();
        zzlw zzlwVar2 = this.zzk;
        zzlwVar2.getClass();
        return zzlwVar2;
    }

    public final zzlw zzr() {
        zzlw zzlwVar = this.zzi;
        if (zzlwVar == null) {
            return null;
        }
        if (zzlwVar == this.zzj) {
            this.zzj = zzlwVar.zzp();
        }
        if (zzlwVar == this.zzk) {
            this.zzk = zzlwVar.zzp();
        }
        zzlwVar.zzn();
        int i = this.zzn - 1;
        this.zzn = i;
        if (i == 0) {
            this.zzl = null;
            zzlw zzlwVar2 = this.zzi;
            this.zzo = zzlwVar2.zzb;
            this.zzp = zzlwVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzp();
        zzB();
        return this.zzi;
    }

    public final void zzt() {
        zzlw zzlwVar = this.zzm;
        if (zzlwVar == null || zzlwVar.zze()) {
            this.zzm = null;
            for (int i = 0; i < this.zzq.size(); i++) {
                zzlw zzlwVar2 = (zzlw) this.zzq.get(i);
                if (!zzlwVar2.zze()) {
                    this.zzm = zzlwVar2;
                    return;
                }
            }
        }
    }

    public final zzlw zzu(zzxa zzxaVar) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzlw zzlwVar = (zzlw) this.zzq.get(i);
            if (zzlwVar.zza == zzxaVar) {
                return zzlwVar;
            }
        }
        return null;
    }

    public final void zzv() {
        if (this.zzn == 0) {
            return;
        }
        zzlw zzlwVarZzp = this.zzi;
        zzlwVarZzp.getClass();
        this.zzo = zzlwVarZzp.zzb;
        this.zzp = zzlwVarZzp.zzg.zza.zzd;
        while (zzlwVarZzp != null) {
            zzlwVarZzp.zzn();
            zzlwVarZzp = zzlwVarZzp.zzp();
        }
        this.zzi = null;
        this.zzl = null;
        this.zzj = null;
        this.zzk = null;
        this.zzn = 0;
        zzB();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    public final int zzw(zzbf zzbfVar, long j, long j2, long j3) {
        zzlx zzlxVarZzE;
        long j4;
        int i;
        zzlx zzlxVar;
        int i2;
        zzlw zzlwVarZzp = this.zzi;
        zzlw zzlwVar = null;
        while (zzlwVarZzp != null) {
            zzlx zzlxVar2 = zzlwVarZzp.zzg;
            if (zzlwVar != null) {
                zzlxVarZzE = zzE(zzbfVar, zzlwVar, j);
                if (zzlxVarZzE != null && zzlxVar2.zza.equals(zzlxVarZzE.zza)) {
                    long j5 = zzlxVar2.zzb;
                    long j6 = zzlxVarZzE.zzb;
                    if (j5 == j6) {
                        j4 = -9223372036854775807L;
                        i = 0;
                    } else {
                        j4 = -9223372036854775807L;
                        long j7 = zzlxVar2.zzc;
                        if (j7 != -9223372036854775807L) {
                            i = 0;
                            long j8 = zzlxVarZzE.zzc;
                            if (j8 != -9223372036854775807L) {
                                if (Math.abs((j6 - j8) - (j5 - j7)) >= 5000000) {
                                }
                            }
                        }
                    }
                    if (j5 != j6) {
                        zzlxVar = zzlxVar2;
                        zzlxVarZzE = zzlxVarZzE.zza(j5, zzlxVar.zzc);
                    } else {
                        zzlxVar = zzlxVar2;
                    }
                }
                return zzs(zzlwVar);
            }
            zzlxVarZzE = zzx(zzbfVar, zzlxVar2);
            zzlxVar = zzlxVar2;
            j4 = -9223372036854775807L;
            i = 0;
            zzlwVarZzp.zzg = zzlxVarZzE.zzb(zzlxVar.zzd);
            long j9 = zzlxVar.zzf;
            long j10 = zzlxVarZzE.zzf;
            if (j9 != j10) {
                zzlwVarZzp.zzs();
                long jZza = j10 == j4 ? Long.MAX_VALUE : j10 + zzlwVarZzp.zza();
                if (zzlwVarZzp == this.zzj) {
                    boolean z = zzlwVarZzp.zzg.zzh;
                    if (j2 == Long.MIN_VALUE || j2 >= jZza) {
                        i2 = 1;
                    } else {
                        i2 = i;
                    }
                } else {
                    i2 = i;
                }
                int i3 = (zzlwVarZzp != this.zzk || (j3 != Long.MIN_VALUE && j3 < jZza)) ? i : 1;
                int iZzs = zzs(zzlwVarZzp);
                if (iZzs != 0) {
                    return iZzs;
                }
                if (j9 == j4) {
                    long j11 = zzlxVar.zze;
                    j9 = j4;
                }
                int i4 = (i2 == 0 || j9 == j4) ? i : 1;
                return i3 != 0 ? i4 | 2 : i4;
            }
            zzlwVar = zzlwVarZzp;
            zzlwVarZzp = zzlwVarZzp.zzp();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0055  */
    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    public final zzlx zzx(zzbf zzbfVar, zzlx zzlxVar) {
        long j;
        long jZzh;
        long j2;
        long j3;
        int i;
        int i2;
        zzxc zzxcVar = zzlxVar.zza;
        boolean zZzM = zzM(zzxcVar);
        boolean zZzI = zzI(zzbfVar, zzxcVar);
        boolean zZzJ = zzJ(zzbfVar, zzxcVar, zZzM);
        Object obj = zzxcVar.zza;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        if (zzxcVar.zzb() || (i2 = zzxcVar.zze) == -1) {
            j = -9223372036854775807L;
        } else {
            zzbdVar.zzc(i2);
            j = 0;
        }
        if (!zzxcVar.zzb()) {
            if (j != -9223372036854775807L) {
                j2 = 0;
                j3 = 0;
            } else {
                jZzh = zzbdVar.zzd;
            }
            if (zzxcVar.zzb()) {
                zzbdVar.zzk(zzxcVar.zzb);
            } else {
                i = zzxcVar.zze;
                if (i != -1) {
                    zzbdVar.zzk(i);
                }
            }
            long j4 = zzlxVar.zzb;
            long j5 = zzlxVar.zzc;
            long j6 = zzlxVar.zzd;
            boolean z = zzlxVar.zzg;
            return new zzlx(zzxcVar, j4, j5, j6, j2, j3, false, false, zZzM, zZzI, zZzJ);
        }
        jZzh = zzbdVar.zzh(zzxcVar.zzb, zzxcVar.zzc);
        j2 = j;
        j3 = jZzh;
        if (zzxcVar.zzb()) {
            zzbdVar.zzk(zzxcVar.zzb);
        } else {
            i = zzxcVar.zze;
            if (i != -1) {
                zzbdVar.zzk(i);
            }
        }
        long j7 = zzlxVar.zzb;
        long j8 = zzlxVar.zzc;
        long j9 = zzlxVar.zzd;
        boolean z2 = zzlxVar.zzg;
        return new zzlx(zzxcVar, j7, j8, j9, j2, j3, false, false, zZzM, zZzI, zZzJ);
    }

    public final zzxc zzy(zzbf zzbfVar, Object obj, long j) {
        long jZzC;
        int iZze;
        zzbd zzbdVar = this.zza;
        int i = zzbfVar.zzo(obj, zzbdVar).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (iZze = zzbfVar.zze(obj2)) == -1 || zzbfVar.zzd(iZze, zzbdVar, false).zzc != i) {
            zzlw zzlwVarZzp = this.zzi;
            while (true) {
                if (zzlwVarZzp == null) {
                    zzlw zzlwVarZzp2 = this.zzi;
                    while (true) {
                        if (zzlwVarZzp2 == null) {
                            jZzC = zzC(obj);
                            if (jZzC != -1) {
                                break;
                            }
                            jZzC = this.zze;
                            this.zze = 1 + jZzC;
                            if (this.zzi != null) {
                                break;
                            }
                            this.zzo = obj;
                            this.zzp = jZzC;
                            break;
                        }
                        int iZze2 = zzbfVar.zze(zzlwVarZzp2.zzb);
                        if (iZze2 != -1 && zzbfVar.zzd(iZze2, zzbdVar, false).zzc == i) {
                            jZzC = zzlwVarZzp2.zzg.zza.zzd;
                            break;
                        }
                        zzlwVarZzp2 = zzlwVarZzp2.zzp();
                    }
                } else {
                    if (zzlwVarZzp.zzb.equals(obj)) {
                        jZzC = zzlwVarZzp.zzg.zza.zzd;
                        break;
                    }
                    zzlwVarZzp = zzlwVarZzp.zzp();
                }
            }
        } else {
            jZzC = this.zzp;
        }
        long j2 = jZzC;
        zzbfVar.zzo(obj, zzbdVar);
        int i2 = zzbdVar.zzc;
        zzbe zzbeVar = this.zzb;
        zzbfVar.zzb(i2, zzbeVar, 0L);
        Object obj3 = obj;
        for (int iZze3 = zzbfVar.zze(obj); iZze3 >= zzbeVar.zzn; iZze3--) {
            zzbfVar.zzd(iZze3, zzbdVar, true);
            zzbdVar.zzb();
            if (zzbdVar.zze(zzbdVar.zzd) != -1) {
                Object obj4 = zzbdVar.zzb;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return zzA(zzbfVar, obj3, j, j2, zzbeVar, zzbdVar);
    }

    final /* synthetic */ void zzz(zzgvw zzgvwVar, zzxc zzxcVar) {
        this.zzc.zzz(zzgvwVar.zzi(), zzxcVar);
    }

    public final zzlw zzi(zzlx zzlxVar) {
        zzlw zzlwVarZza;
        zzlw zzlwVar = this.zzl;
        long jZza = zzlwVar == null ? 1000000000000L : (zzlwVar.zza() + zzlwVar.zzg.zzf) - zzlxVar.zzb;
        int i = 0;
        while (true) {
            if (i >= this.zzq.size()) {
                zzlwVarZza = null;
                break;
            }
            zzlx zzlxVar2 = ((zzlw) this.zzq.get(i)).zzg;
            long j = zzlxVar2.zzf;
            long j2 = zzlxVar.zzf;
            if ((j == -9223372036854775807L || j == j2) && zzlxVar2.zzb == zzlxVar.zzb && zzlxVar2.zza.equals(zzlxVar.zza)) {
                zzlwVarZza = (zzlw) this.zzq.remove(i);
                break;
            }
            i++;
        }
        if (zzlwVarZza == null) {
            zzlwVarZza = this.zzr.zza(zzlxVar, jZza);
        } else {
            zzlwVarZza.zzg = zzlxVar;
            zzlwVarZza.zzb(jZza);
        }
        zzlw zzlwVar2 = this.zzl;
        if (zzlwVar2 != null) {
            zzlwVar2.zzo(zzlwVarZza);
        } else {
            this.zzi = zzlwVarZza;
            this.zzj = zzlwVarZza;
            this.zzk = zzlwVarZza;
        }
        this.zzo = null;
        this.zzl = zzlwVarZza;
        this.zzn++;
        zzB();
        return zzlwVarZza;
    }

    public final int zzs(zzlw zzlwVar) {
        zzlwVar.getClass();
        int i = 0;
        if (zzlwVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzlwVar;
        while (zzlwVar.zzp() != null) {
            zzlwVar = zzlwVar.zzp();
            zzlwVar.getClass();
            if (zzlwVar == this.zzj) {
                zzlw zzlwVar2 = this.zzi;
                this.zzj = zzlwVar2;
                this.zzk = zzlwVar2;
                i = 3;
            }
            if (zzlwVar == this.zzk) {
                this.zzk = this.zzj;
                i |= 2;
            }
            zzlwVar.zzn();
            this.zzn--;
        }
        zzlw zzlwVar3 = this.zzl;
        zzlwVar3.getClass();
        zzlwVar3.zzo(null);
        zzB();
        return i;
    }
}
