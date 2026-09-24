package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzlo implements Handler.Callback, zzwz, zzaay, zzmk, zzjb, zzmo, zzcc, zzadj {
    private static final long zza = zzfk.zzr(10000);
    private final boolean zzA;
    private zznc zzB;
    private boolean zzD;
    private boolean zzE;
    private zzln zzF;
    private int zzG;
    private zzmm zzH;
    private zzll zzI;
    private boolean zzJ;
    private boolean zzL;
    private boolean zzM;
    private boolean zzO;
    private boolean zzR;
    private int zzS;
    private zzln zzT;
    private long zzU;
    private long zzV;
    private int zzW;
    private boolean zzX;
    private zzje zzY;
    private zzjo zzaa;
    private boolean zzac;
    private final zzix zzae;
    private final zzmy[] zzb;
    private final zzmw[] zzc;
    private final boolean[] zzd;
    private final zzaaz zze;
    private final zzaba zzf;
    private final zzls zzg;
    private final zzabi zzh;
    private final zzdy zzi;
    private final zzmn zzj;
    private final Looper zzk;
    private final zzbe zzl;
    private final zzbd zzm;
    private final long zzn;
    private final zzjc zzo;
    private final ArrayList zzp;
    private final zzdo zzq;
    private final zzlm zzr;
    private final zzlz zzs;
    private final zzml zzt;
    private final long zzu;
    private final zzpz zzv;
    private final zzng zzw;
    private final zzdy zzx;
    private final boolean zzy;
    private final zzcd zzz;
    private long zzab = -9223372036854775807L;
    private int zzP = 0;
    private boolean zzQ = false;
    private boolean zzK = false;
    private float zzad = 1.0f;
    private zznb zzC = zznb.zza;
    private long zzZ = -9223372036854775807L;
    private long zzN = -9223372036854775807L;

    public zzlo(Context context, zzmu[] zzmuVarArr, zzmu[] zzmuVarArr2, zzaaz zzaazVar, zzaba zzabaVar, zzls zzlsVar, zzabi zzabiVar, int i, boolean z, zzng zzngVar, zznc zzncVar, zzix zzixVar, long j, boolean z2, boolean z3, Looper looper, zzdo zzdoVar, zzlm zzlmVar, zzpz zzpzVar, zzmn zzmnVar, zzjo zzjoVar, final zzadj zzadjVar, boolean z4) {
        this.zzr = zzlmVar;
        this.zze = zzaazVar;
        this.zzf = zzabaVar;
        this.zzg = zzlsVar;
        this.zzh = zzabiVar;
        int i2 = 0;
        this.zzB = zzncVar;
        this.zzae = zzixVar;
        this.zzu = j;
        this.zzq = zzdoVar;
        this.zzv = zzpzVar;
        this.zzaa = zzjoVar;
        this.zzw = zzngVar;
        this.zzA = z4;
        this.zzn = zzlsVar.zzf(zzpzVar);
        zzlsVar.zzg(zzpzVar);
        zzbf zzbfVar = zzbf.zza;
        this.zzH = zzmm.zza(zzabaVar);
        this.zzI = new zzll(this.zzH);
        int length = zzmuVarArr.length;
        this.zzc = new zzmw[2];
        this.zzd = new boolean[2];
        zzmv zzmvVarZzg = zzaazVar.zzg();
        this.zzb = new zzmy[2];
        boolean z5 = false;
        while (true) {
            int length2 = zzmuVarArr.length;
            if (i2 >= 2) {
                this.zzy = z5;
                this.zzo = new zzjc(this, zzdoVar);
                this.zzp = new ArrayList();
                this.zzl = new zzbe();
                this.zzm = new zzbd();
                zzaazVar.zzs(this, zzabiVar);
                this.zzX = true;
                zzdy zzdyVarZzd = zzdoVar.zzd(looper, null);
                this.zzx = zzdyVarZzd;
                this.zzs = new zzlz(zzngVar, zzdyVarZzd, new zzlh(this), zzjoVar);
                this.zzt = new zzml(this, zzngVar, zzdyVarZzd, zzpzVar);
                zzmn zzmnVar2 = new zzmn(null);
                this.zzj = zzmnVar2;
                Looper looperZza = zzmnVar2.zza();
                this.zzk = looperZza;
                zzdy zzdyVarZzd2 = zzdoVar.zzd(looperZza, this);
                this.zzi = zzdyVarZzd2;
                this.zzz = new zzcd(context, looperZza, this);
                zzdyVarZzd2.zzd(35, new zzadj() { // from class: com.google.android.gms.internal.ads.zzld
                    @Override // com.google.android.gms.internal.ads.zzadj
                    public final /* synthetic */ void zzcS(long j2, long j3, zzv zzvVar, MediaFormat mediaFormat) {
                        this.zza.zzcS(j2, j3, zzvVar, mediaFormat);
                    }
                }).zza();
                return;
            }
            zzmuVarArr[i2].zzc(i2, zzpzVar, zzdoVar);
            this.zzc[i2] = zzmuVarArr[i2].zzb();
            this.zzc[i2].zzv(zzmvVarZzg);
            zzmu zzmuVar = zzmuVarArr2[i2];
            if (zzmuVar != null) {
                zzmuVar.zzc(i2, zzpzVar, zzdoVar);
                z5 = true;
            }
            this.zzb[i2] = new zzmy(zzmuVarArr[i2], zzmuVarArr2[i2], i2);
            i2++;
        }
    }

    private final void zzA(IOException iOException, int i) {
        zzlz zzlzVar = this.zzs;
        zzje zzjeVarZza = zzje.zza(iOException, i);
        zzlw zzlwVarZzm = zzlzVar.zzm();
        if (zzlwVarZzm != null) {
            zzjeVarZza = zzjeVarZza.zzd(zzlwVarZzm.zzg.zza);
        }
        zzef.zzf("ExoPlayerImplInternal", "Playback error", zzjeVarZza);
        zzW(false, false);
        this.zzH = this.zzH.zzf(zzjeVarZza);
    }

    private final void zzB(int i) {
        zzmm zzmmVar = this.zzH;
        if (zzmmVar.zze != i) {
            if (i != 2) {
                this.zzZ = -9223372036854775807L;
            }
            if (i != 3) {
                boolean z = zzmmVar.zzp;
            }
            this.zzH = this.zzH.zze(i);
        }
    }

    private final void zzC() {
        this.zzI.zzb(this.zzH);
        if (this.zzI.zzd()) {
            this.zzr.zza(this.zzI);
            this.zzI = new zzll(this.zzH);
        }
    }

    private final void zzD(float f) throws zzje {
        this.zzad = f;
        float fZza = f * this.zzz.zza();
        int i = 0;
        while (true) {
            zzmy[] zzmyVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzmyVarArr[i].zzL(fZza);
            i++;
        }
    }

    private final void zzE(boolean z, int i, boolean z2, int i2) throws zzje {
        this.zzI.zza(z2 ? 1 : 0);
        zzG(z, i, i2);
    }

    private final void zzF() throws zzje {
        zzmm zzmmVar = this.zzH;
        zzG(zzmmVar.zzl, zzmmVar.zzn, zzmmVar.zzm);
    }

    private final void zzG(boolean z, int i, int i2) throws zzje {
        zzH(z, this.zzz.zzc(z, this.zzH.zze), i, i2);
    }

    private final void zzH(boolean z, int i, int i2, int i3) throws zzje {
        boolean z2;
        if (!z) {
            z2 = false;
        } else if (i != -1) {
            z2 = true;
        } else {
            i = -1;
            z2 = false;
        }
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.zzD;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        zzmm zzmmVar = this.zzH;
        if (zzmmVar.zzl == z2 && zzmmVar.zzn == i2 && zzmmVar.zzm == i3) {
            return;
        }
        this.zzH = zzmmVar.zzi(z2, i3, i2);
        zzaD(false, false);
        zzlz zzlzVar = this.zzs;
        for (zzlw zzlwVarZzm = zzlzVar.zzm(); zzlwVarZzm != null; zzlwVarZzm = zzlwVarZzm.zzp()) {
            for (zzaas zzaasVar : zzlwVarZzm.zzr().zzc) {
            }
        }
        if (!zzay()) {
            zzK();
            zzL();
            boolean z4 = this.zzH.zzp;
            zzlzVar.zzf(this.zzU);
            return;
        }
        int i4 = this.zzH.zze;
        if (i4 == 3) {
            this.zzo.zza();
            zzJ();
            this.zzi.zzh(2);
        } else if (i4 == 2) {
            this.zzi.zzh(2);
        }
    }

    private final void zzI(boolean z) throws zzje {
        zzxc zzxcVar = this.zzs.zzm().zzg.zza;
        long jZzT = zzT(zzxcVar, this.zzH.zzs, true, false);
        if (jZzT != this.zzH.zzs) {
            zzmm zzmmVar = this.zzH;
            this.zzH = zzap(zzxcVar, jZzT, zzmmVar.zzc, zzmmVar.zzd, z, 5);
        }
    }

    private final void zzJ() throws zzje {
        zzlw zzlwVarZzm = this.zzs.zzm();
        if (zzlwVarZzm == null) {
            return;
        }
        zzaba zzabaVarZzr = zzlwVarZzm.zzr();
        int i = 0;
        while (true) {
            zzmy[] zzmyVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            if (zzabaVarZzr.zza(i)) {
                zzmyVarArr[i].zzv();
            }
            i++;
        }
    }

    private final void zzK() throws zzje {
        this.zzo.zzb();
        int i = 0;
        while (true) {
            zzmy[] zzmyVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzmyVarArr[i].zzw();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzL() throws com.google.android.gms.internal.ads.zzje {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlo.zzL():void");
    }

    private final void zzM(zzav zzavVar) {
        this.zzi.zzk(16);
        this.zzo.zzi(zzavVar);
    }

    private final void zzN(final int i, final boolean z) {
        boolean[] zArr = this.zzd;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.zzx.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzle
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(i, z);
                }
            });
        }
    }

    private final long zzO(zzbf zzbfVar, Object obj, long j) {
        int i = zzbfVar.zzo(obj, this.zzm).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i, zzbeVar, 0L);
        if (zzbeVar.zzf == -9223372036854775807L || !zzbeVar.zzb() || !zzbeVar.zzi) {
            return -9223372036854775807L;
        }
        long j2 = zzbeVar.zzg;
        String str = zzfk.zza;
        return zzfk.zzs((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - zzbeVar.zzf) - j;
    }

    private final boolean zzP(zzbf zzbfVar, zzxc zzxcVar) {
        if (!zzxcVar.zzb() && !zzbfVar.zzg()) {
            int i = zzbfVar.zzo(zzxcVar.zza, this.zzm).zzc;
            zzbe zzbeVar = this.zzl;
            zzbfVar.zzb(i, zzbeVar, 0L);
            if (zzbeVar.zzb() && zzbeVar.zzi && zzbeVar.zzf != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private final void zzQ(long j) {
        long jMin = 1000;
        if (zzw()) {
            jMin = this.zzH.zze != 3 ? zza : 1000L;
            zzmy[] zzmyVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                jMin = Math.min(jMin, zzfk.zzr(zzmyVarArr[i].zzk(this.zzU, this.zzV)));
            }
            if (this.zzH.zzj()) {
                zzlz zzlzVar = this.zzs;
                zzlw zzlwVarZzp = zzlzVar.zzm() != null ? zzlzVar.zzm().zzp() : null;
                if (zzlwVarZzp != null) {
                    if (this.zzU + (zzfk.zzs(jMin) * this.zzH.zzo.zzb) >= zzlwVarZzp.zzc()) {
                        jMin = Math.min(jMin, zza);
                    }
                }
            }
        } else if (this.zzH.zze != 3 || zzay()) {
            jMin = zza;
        }
        this.zzi.zzj(2, j + jMin);
    }

    private final void zzR(zzln zzlnVar) throws Throwable {
        long jLongValue;
        zzxc zzxcVarZzy;
        boolean z;
        boolean z2;
        long j;
        long j2;
        long j3;
        long j4;
        long jZzk;
        zzmm zzmmVar;
        int i;
        if (this.zzE) {
            if (this.zzF != null) {
                this.zzG++;
                this.zzI.zza(1);
            }
            this.zzF = zzlnVar;
            return;
        }
        this.zzI.zza(1);
        zzbf zzbfVar = this.zzH.zza;
        int i2 = this.zzP;
        boolean z3 = this.zzQ;
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair pairZzaE = zzaE(zzbfVar, zzlnVar, true, i2, z3, zzbeVar, zzbdVar);
        long jMax = -9223372036854775807L;
        if (pairZzaE == null) {
            Pair pairZzY = zzY(this.zzH.zza);
            zzxc zzxcVar = (zzxc) pairZzY.first;
            jLongValue = ((Long) pairZzY.second).longValue();
            z = !this.zzH.zza.zzg();
            zzxcVarZzy = zzxcVar;
            jMax = -9223372036854775807L;
        } else {
            Object obj = pairZzaE.first;
            jLongValue = ((Long) pairZzaE.second).longValue();
            long j5 = zzlnVar.zzc;
            if (j5 != -9223372036854775807L) {
                jMax = jLongValue;
            }
            zzxcVarZzy = this.zzs.zzy(this.zzH.zza, obj, jLongValue);
            if (zzxcVarZzy.zzb()) {
                this.zzH.zza.zzo(zzxcVarZzy.zza, zzbdVar);
                int i3 = zzxcVarZzy.zzb;
                if (zzbdVar.zzd(i3) == zzxcVarZzy.zzc) {
                    zzbdVar.zzj();
                }
                zza zzaVarZza = zzbdVar.zzg.zza(i3);
                long j6 = zzaVarZza.zza;
                long j7 = zzaVarZza.zzi;
                jMax = Math.max(jMax, 0L);
                jLongValue = 0;
            } else if (j5 != -9223372036854775807L) {
                z = false;
            }
            z = true;
        }
        try {
            if (this.zzH.zza.zzg()) {
                this.zzT = zzlnVar;
            } else if (pairZzaE == null) {
                if (this.zzH.zze != 1) {
                    zzB(4);
                }
                zzX(false, true, false, true);
            } else {
                if (zzxcVarZzy.equals(this.zzH.zzb)) {
                    zzlw zzlwVarZzm = this.zzs.zzm();
                    if (zzlwVarZzm == null || !zzlwVarZzm.zze || jLongValue == 0) {
                        jZzk = jLongValue;
                    } else {
                        zzxa zzxaVar = zzlwVarZzm.zza;
                        long j8 = zzbeVar.zzm;
                        if (this.zzD && j8 != jMax) {
                            Double d = this.zzC.zzc;
                        }
                        jZzk = zzxaVar.zzk(jLongValue, this.zzB);
                    }
                    long j9 = jZzk;
                    if (zzfk.zzr(jZzk) == zzfk.zzr(this.zzH.zzs) && ((i = (zzmmVar = this.zzH).zze) == 2 || i == 3)) {
                        jLongValue = zzmmVar.zzs;
                    } else {
                        j2 = j9;
                    }
                } else {
                    j2 = jLongValue;
                }
                if (this.zzD) {
                    zzmy[] zzmyVarArr = this.zzb;
                    for (int i4 = 0; i4 < 2; i4++) {
                        zzmy zzmyVar = zzmyVarArr[i4];
                        if (zzmyVar.zzM() && zzmyVar.zze() == 2) {
                            this.zzE = true;
                            break;
                        }
                    }
                }
                long jZzS = zzS(zzxcVarZzy, j2, this.zzH.zze == 4);
                z2 = (jLongValue != jZzS) | z;
                try {
                    zzmm zzmmVar2 = this.zzH;
                    zzxc zzxcVar2 = zzxcVarZzy;
                    try {
                        zzbf zzbfVar2 = zzmmVar2.zza;
                        long j10 = jMax;
                        try {
                            zzag(zzbfVar2, zzxcVar2, zzbfVar2, zzmmVar2.zzb, j10, true);
                            zzxcVarZzy = zzxcVar2;
                            j3 = j10;
                            j4 = jZzS;
                            this.zzH = zzap(zzxcVarZzy, j4, j3, j4, z2, 2);
                        } catch (Throwable th) {
                            th = th;
                            zzxcVarZzy = zzxcVar2;
                            jMax = j10;
                            j = jZzS;
                            this.zzH = zzap(zzxcVarZzy, j, jMax, j, z2, 2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        zzxcVarZzy = zzxcVar2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            z2 = z;
            j3 = jMax;
            j4 = jLongValue;
            this.zzH = zzap(zzxcVarZzy, j4, j3, j4, z2, 2);
        } catch (Throwable th4) {
            th = th4;
            z2 = z;
            j = jLongValue;
        }
    }

    private final long zzS(zzxc zzxcVar, long j, boolean z) throws zzje {
        zzlz zzlzVar = this.zzs;
        return zzT(zzxcVar, j, zzlzVar.zzm() != zzlzVar.zzn(), z);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    private final long zzT(zzxc zzxcVar, long j, boolean z, boolean z2) throws zzje {
        zzK();
        boolean z3 = true;
        zzaD(false, true);
        if (z2 || this.zzH.zze == 3) {
            zzB(2);
        }
        zzlz zzlzVar = this.zzs;
        zzlw zzlwVarZzm = zzlzVar.zzm();
        zzlw zzlwVarZzp = zzlwVarZzm;
        while (zzlwVarZzp != null && !zzxcVar.equals(zzlwVarZzp.zzg.zza)) {
            zzlwVarZzp = zzlwVarZzp.zzp();
        }
        if (z || zzlwVarZzm != zzlwVarZzp || (zzlwVarZzp != null && zzlwVarZzp.zza() + j < 0)) {
            zzaa();
            if (zzlwVarZzp != null) {
                while (zzlzVar.zzm() != zzlwVarZzp) {
                    zzlzVar.zzr();
                }
                zzlzVar.zzs(zzlwVarZzp);
                zzlwVarZzp.zzb(1000000000000L);
                zzaq();
                zzlwVarZzp.zzh = true;
            }
        }
        zzab();
        if (zzlwVarZzp != null) {
            zzlzVar.zzs(zzlwVarZzp);
            if (!zzlwVarZzp.zze) {
                zzlwVarZzp.zzg = zzlwVarZzp.zzg.zza(j, -9223372036854775807L);
            } else if (zzlwVarZzp.zzf) {
                if (this.zzD) {
                    boolean z4 = this.zzC.zzi;
                    if (this.zzH.zza.zzg() || !zzlwVarZzp.zzg.zza.equals(this.zzH.zzb)) {
                        zzxa zzxaVar = zzlwVarZzp.zza;
                        j = zzxaVar.zzj(j);
                        zzxaVar.zzf(j - this.zzn, false);
                    } else {
                        long jZza = zzlwVarZzp.zza() + j;
                        zzmy[] zzmyVarArr = this.zzb;
                        boolean zZzF = true;
                        for (int i = 0; i < 2; i++) {
                            zzmy zzmyVar = zzmyVarArr[i];
                            if (zzmyVar.zzM()) {
                                zZzF &= zzmyVar.zzF(zzlwVarZzp, jZza);
                            }
                        }
                        if (zZzF) {
                            zzxa zzxaVar2 = zzlwVarZzp.zza;
                            long j2 = this.zzH.zzs;
                            zznc zzncVar = zznc.zzb;
                            if (zzxaVar2.zzk(j2, zzncVar) == zzxaVar2.zzk(j, zzncVar)) {
                                z3 = false;
                            } else {
                                zzxa zzxaVar3 = zzlwVarZzp.zza;
                                j = zzxaVar3.zzj(j);
                                zzxaVar3.zzf(j - this.zzn, false);
                            }
                        } else {
                            zzxa zzxaVar4 = zzlwVarZzp.zza;
                            j = zzxaVar4.zzj(j);
                            zzxaVar4.zzf(j - this.zzn, false);
                        }
                    }
                } else {
                    zzxa zzxaVar5 = zzlwVarZzp.zza;
                    j = zzxaVar5.zzj(j);
                    zzxaVar5.zzf(j - this.zzn, false);
                }
            }
            zzU(j, z3);
            zzan();
        } else {
            zzlzVar.zzv();
            zzU(j, true);
        }
        zzat(false);
        this.zzi.zzh(2);
        return j;
    }

    private final void zzU(long j, boolean z) throws zzje {
        zzlw zzlwVarZzm = this.zzs.zzm();
        long jZza = j + (zzlwVarZzm == null ? 1000000000000L : zzlwVarZzm.zza());
        this.zzU = jZza;
        this.zzo.zzc(jZza);
        zzmy[] zzmyVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            zzmyVarArr[i].zzE(zzlwVarZzm, this.zzU, z);
        }
        for (zzlw zzlwVarZzm2 = r0.zzm(); zzlwVarZzm2 != null; zzlwVarZzm2 = zzlwVarZzm2.zzp()) {
            for (zzaas zzaasVar : zzlwVarZzm2.zzr().zzc) {
            }
        }
    }

    private final void zzV() throws zzje {
        int i = 0;
        while (true) {
            zzmy[] zzmyVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzmyVarArr[i].zzz(this.zzD ? this.zzC : null);
            i++;
        }
    }

    private final void zzW(boolean z, boolean z2) {
        zzX(z || !this.zzR, false, true, false);
        this.zzI.zza(z2 ? 1 : 0);
        this.zzg.zzc(this.zzv);
        this.zzz.zzc(this.zzH.zzl, 1);
        zzB(1);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009b A[PHI: r2 r7 r9
  0x009b: PHI (r2v2 com.google.android.gms.internal.ads.zzxc) = (r2v1 com.google.android.gms.internal.ads.zzxc), (r2v19 com.google.android.gms.internal.ads.zzxc) binds: [B:28:0x0073, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r7v3 long) = (r7v2 long), (r7v11 long) binds: [B:28:0x0073, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r9v2 long) = (r9v1 long), (r9v7 long) binds: [B:28:0x0073, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e0 A[PHI: r3
  0x00e0: PHI (r3v3 com.google.android.gms.internal.ads.zzbf) = 
  (r3v2 com.google.android.gms.internal.ads.zzbf)
  (r3v2 com.google.android.gms.internal.ads.zzbf)
  (r3v6 com.google.android.gms.internal.ads.zzbf)
  (r3v6 com.google.android.gms.internal.ads.zzbf)
 binds: [B:34:0x00a9, B:36:0x00ad, B:38:0x00be, B:40:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    private final void zzX(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        zzxc zzxcVar;
        zzbf zzbfVar;
        this.zzi.zzk(2);
        this.zzE = false;
        if (this.zzF != null) {
            this.zzI.zza(1);
            this.zzF = null;
        }
        this.zzY = null;
        zzaD(false, true);
        this.zzo.zzb();
        this.zzU = 1000000000000L;
        try {
            zzaa();
        } catch (zzje | RuntimeException e) {
            zzef.zzf("ExoPlayerImplInternal", "Disable failed.", e);
        }
        if (z) {
            zzmy[] zzmyVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                try {
                    zzmyVarArr[i].zzG();
                } catch (RuntimeException e2) {
                    zzef.zzf("ExoPlayerImplInternal", "Reset failed.", e2);
                }
            }
        }
        this.zzS = 0;
        zzmm zzmmVar = this.zzH;
        zzxc zzxcVar2 = zzmmVar.zzb;
        long jLongValue = zzmmVar.zzs;
        long j = (this.zzH.zzb.zzb() || zzaC(this.zzH, this.zzm)) ? this.zzH.zzc : this.zzH.zzs;
        if (z2) {
            this.zzT = null;
            Pair pairZzY = zzY(this.zzH.zza);
            zzxcVar2 = (zzxc) pairZzY.first;
            jLongValue = ((Long) pairZzY.second).longValue();
            j = -9223372036854775807L;
            z5 = zzxcVar2.equals(this.zzH.zzb) ? false : true;
        }
        long j2 = jLongValue;
        long j3 = j;
        zzlz zzlzVar = this.zzs;
        zzlzVar.zzv();
        this.zzO = false;
        zzbf zzbfVarZzx = this.zzH.zza;
        if (z3 && (zzbfVarZzx instanceof zzms)) {
            zzbfVarZzx = ((zzms) zzbfVarZzx).zzx(this.zzt.zzq());
            if (zzxcVar2.zzb != -1) {
                Object obj = zzxcVar2.zza;
                zzbd zzbdVar = this.zzm;
                zzbfVarZzx.zzo(obj, zzbdVar);
                zzbe zzbeVar = this.zzl;
                zzbfVarZzx.zzb(zzbdVar.zzc, zzbeVar, 0L);
                if (zzbeVar.zzb()) {
                    zzbfVar = zzbfVarZzx;
                    zzxcVar = new zzxc(obj, zzxcVar2.zzd);
                } else {
                    zzxcVar = zzxcVar2;
                    zzbfVar = zzbfVarZzx;
                }
            } else {
                zzxcVar = zzxcVar2;
                zzbfVar = zzbfVarZzx;
            }
        } else {
            zzxcVar = zzxcVar2;
            zzbfVar = zzbfVarZzx;
        }
        zzmm zzmmVar2 = this.zzH;
        int i2 = zzmmVar2.zze;
        zzje zzjeVar = z4 ? null : zzmmVar2.zzf;
        zzzf zzzfVar = z5 ? zzzf.zza : zzmmVar2.zzh;
        zzaba zzabaVar = z5 ? this.zzf : this.zzH.zzi;
        List listZzi = z5 ? zzgvz.zzi() : this.zzH.zzj;
        zzmm zzmmVar3 = this.zzH;
        this.zzH = new zzmm(zzbfVar, zzxcVar, j3, j2, i2, zzjeVar, false, zzzfVar, zzabaVar, listZzi, zzxcVar, zzmmVar3.zzl, zzmmVar3.zzm, zzmmVar3.zzn, zzmmVar3.zzo, j2, 0L, j2, 0L, false);
        if (z3) {
            zzlzVar.zzj();
            this.zzt.zzg();
        }
    }

    private final Pair zzY(zzbf zzbfVar) {
        long j = 0;
        if (zzbfVar.zzg()) {
            return Pair.create(zzmm.zzb(), 0L);
        }
        int iZzk = zzbfVar.zzk(this.zzQ);
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair pairZzm = zzbfVar.zzm(zzbeVar, zzbdVar, iZzk, -9223372036854775807L);
        zzxc zzxcVarZzy = this.zzs.zzy(zzbfVar, pairZzm.first, 0L);
        long jLongValue = ((Long) pairZzm.second).longValue();
        if (zzxcVarZzy.zzb()) {
            zzbfVar.zzo(zzxcVarZzy.zza, zzbdVar);
            if (zzxcVarZzy.zzc == zzbdVar.zzd(zzxcVarZzy.zzb)) {
                zzbdVar.zzj();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(zzxcVarZzy, Long.valueOf(j));
    }

    private final void zzZ(zzbf zzbfVar, zzbf zzbfVar2) {
        if (zzbfVar.zzg() && zzbfVar2.zzg()) {
            return;
        }
        ArrayList arrayList = this.zzp;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
            return;
        }
        zzlk zzlkVar = (zzlk) arrayList.get(size);
        Object obj = zzlkVar.zzb;
        zzmq zzmqVar = zzlkVar.zza;
        String str = zzfk.zza;
        throw null;
    }

    private final boolean zzaA() {
        if (!this.zzy) {
            return false;
        }
        zzmy[] zzmyVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            if (zzmyVarArr[i].zzc()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaB, reason: merged with bridge method [inline-methods] */
    public final boolean zzw() {
        if (!this.zzD) {
            return false;
        }
        boolean z = this.zzC.zzg;
        return true;
    }

    private static boolean zzaC(zzmm zzmmVar, zzbd zzbdVar) {
        zzxc zzxcVar = zzmmVar.zzb;
        zzbf zzbfVar = zzmmVar.zza;
        return zzbfVar.zzg() || zzbfVar.zzo(zzxcVar.zza, zzbdVar).zzf;
    }

    private final void zzaD(boolean z, boolean z2) {
        this.zzM = z;
        long jElapsedRealtime = -9223372036854775807L;
        if (z && !z2) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.zzN = jElapsedRealtime;
    }

    private static Pair zzaE(zzbf zzbfVar, zzln zzlnVar, boolean z, int i, boolean z2, zzbe zzbeVar, zzbd zzbdVar) {
        zzbf zzbfVar2;
        zzbf zzbfVar3 = zzlnVar.zza;
        if (zzbfVar.zzg()) {
            return null;
        }
        if (true == zzbfVar3.zzg()) {
            zzbfVar2 = zzbfVar3;
            zzbfVar2 = zzbfVar;
        }
        try {
            zzbfVar2 = zzbfVar3;
            Pair pairZzm = zzbfVar2.zzm(zzbeVar, zzbdVar, zzlnVar.zzb, zzlnVar.zzc);
            zzbf zzbfVar4 = zzbfVar2;
            if (!zzbfVar.equals(zzbfVar4)) {
                if (zzbfVar.zze(pairZzm.first) == -1) {
                    int iZzr = zzr(zzbeVar, zzbdVar, i, z2, pairZzm.first, zzbfVar4, zzbfVar);
                    if (iZzr != -1) {
                        return zzbfVar.zzm(zzbeVar, zzbdVar, iZzr, -9223372036854775807L);
                    }
                    return null;
                }
                if (zzbfVar4.zzo(pairZzm.first, zzbdVar).zzf && zzbfVar4.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar4.zze(pairZzm.first)) {
                    return zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(pairZzm.first, zzbdVar).zzc, zzlnVar.zzc);
                }
            }
            return pairZzm;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private static final void zzaF(zzmq zzmqVar) throws zzje {
        zzmqVar.zzh();
        try {
            zzmqVar.zza().zzx(zzmqVar.zzc(), zzmqVar.zze());
        } finally {
            zzmqVar.zzi(true);
        }
    }

    private static final boolean zzaG(zzlw zzlwVar) {
        if (zzlwVar != null) {
            try {
                if (zzlwVar.zze) {
                    zzyu[] zzyuVarArr = zzlwVar.zzc;
                    for (int i = 0; i < 2; i++) {
                        zzyu zzyuVar = zzyuVarArr[i];
                        if (zzyuVar != null) {
                            zzyuVar.zzc();
                        }
                    }
                } else {
                    zzlwVar.zza.zzc();
                }
                if (zzlwVar.zzg() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void zzaa() throws zzje {
        int i = 0;
        while (true) {
            zzmy[] zzmyVarArr = this.zzb;
            if (i >= 2) {
                this.zzab = -9223372036854775807L;
                return;
            }
            int iZzd = zzmyVarArr[i].zzd();
            zzmyVarArr[i].zzA(this.zzo);
            zzN(i, false);
            this.zzS -= iZzd;
            i++;
        }
    }

    private final void zzab() {
        if (this.zzy && zzaA()) {
            zzmy[] zzmyVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                zzmy zzmyVar = zzmyVarArr[i];
                int iZzd = zzmyVar.zzd();
                zzmyVar.zzC(this.zzo);
                this.zzS -= iZzd - zzmyVar.zzd();
            }
            this.zzab = -9223372036854775807L;
        }
    }

    private final void zzac() throws zzje {
        zzad();
        zzI(true);
    }

    private final void zzad() throws zzje {
        zzaba zzabaVarZzk;
        zzaba zzabaVar;
        boolean z;
        zzlo zzloVar;
        int i;
        zzjc zzjcVar = this.zzo;
        float f = zzjcVar.zzj().zzb;
        zzlz zzlzVar = this.zzs;
        zzlw zzlwVarZzm = zzlzVar.zzm();
        zzlw zzlwVarZzn = zzlzVar.zzn();
        zzaba zzabaVar2 = null;
        boolean z2 = true;
        loop0: while (true) {
            if (zzlwVarZzm == null || !zzlwVarZzm.zze) {
                return;
            }
            zzmm zzmmVar = this.zzH;
            zzabaVarZzk = zzlwVarZzm.zzk(f, zzmmVar.zza, zzmmVar.zzl);
            zzabaVar = zzlwVarZzm == zzlzVar.zzm() ? zzabaVarZzk : zzabaVar2;
            zzaba zzabaVarZzr = zzlwVarZzm.zzr();
            z = false;
            if (zzabaVarZzr == null) {
                break;
            }
            zzaas[] zzaasVarArr = zzabaVarZzk.zzc;
            if (zzabaVarZzr.zzc.length != zzaasVarArr.length) {
                break;
            }
            for (int i2 = 0; i2 < zzaasVarArr.length; i2++) {
                if (!zzabaVarZzk.zzb(zzabaVarZzr, i2)) {
                    break loop0;
                }
            }
            if (zzlwVarZzm != zzlwVarZzn) {
                z = true;
            }
            z2 &= z;
            zzlwVarZzm = zzlwVarZzm.zzp();
            zzabaVar2 = zzabaVar;
        }
        if (z2) {
            zzlw zzlwVarZzm2 = zzlzVar.zzm();
            int iZzs = zzlzVar.zzs(zzlwVarZzm2) & 1;
            zzmy[] zzmyVarArr = this.zzb;
            boolean[] zArr = new boolean[2];
            zzabaVar.getClass();
            long jZzm = zzlwVarZzm2.zzm(zzabaVar, this.zzH.zzs, 1 == iZzs, zArr);
            zzmm zzmmVar2 = this.zzH;
            if (zzmmVar2.zze != 4 && jZzm != zzmmVar2.zzs) {
                z = true;
            }
            zzmm zzmmVar3 = this.zzH;
            i = 2;
            zzloVar = this;
            zzloVar.zzH = zzap(zzmmVar3.zzb, jZzm, zzmmVar3.zzc, zzmmVar3.zzd, z, 5);
            if (z) {
                zzloVar.zzU(jZzm, true);
            }
            zzloVar.zzab();
            boolean[] zArr2 = new boolean[2];
            for (int i3 = 0; i3 < 2; i3++) {
                int iZzd = zzmyVarArr[i3].zzd();
                zArr2[i3] = zzmyVarArr[i3].zzM();
                zzmyVarArr[i3].zzD(zzlwVarZzm2.zzc[i3], zzjcVar, zzloVar.zzU, zArr[i3]);
                if (iZzd - zzmyVarArr[i3].zzd() > 0) {
                    zzloVar.zzN(i3, false);
                }
                zzloVar.zzS -= iZzd - zzmyVarArr[i3].zzd();
            }
            zzloVar.zzar(zArr2, zzloVar.zzU);
            zzlwVarZzm2.zzh = true;
        } else {
            zzloVar = this;
            i = 2;
            zzlzVar.zzs(zzlwVarZzm);
            if (zzlwVarZzm.zze) {
                long jMax = Math.max(zzlwVarZzm.zzg.zzb, zzloVar.zzU - zzlwVarZzm.zza());
                if (zzloVar.zzy && zzloVar.zzaA() && zzlzVar.zzo() == zzlwVarZzm) {
                    zzloVar.zzab();
                }
                zzlwVarZzm.zzl(zzabaVarZzk, jMax, false);
            }
        }
        zzloVar.zzat(true);
        if (zzloVar.zzH.zze != 4) {
            zzloVar.zzan();
            zzloVar.zzL();
            zzloVar.zzi.zzh(i);
        }
    }

    private final boolean zzae() {
        zzlw zzlwVarZzm = this.zzs.zzm();
        long j = zzlwVarZzm.zzg.zzf;
        if (zzlwVarZzm.zze) {
            return j == -9223372036854775807L || this.zzH.zzs < j || !zzay();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:223:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:224:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:227:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:229:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:231:0x03d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:237:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:239:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:240:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:243:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:244:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:248:0x041b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33, types: [int] */
    /* JADX WARN: Type inference failed for: r6v42 */
    private final void zzaf(zzbf zzbfVar, boolean z) throws Throwable {
        long j;
        boolean zZzaC;
        zzbe zzbeVar;
        zzbf zzbfVar2;
        long j2;
        int i;
        long jMin;
        long jMax;
        boolean z2;
        boolean z3;
        int iZzk;
        boolean z4;
        boolean z5;
        long j3;
        long j4;
        long j5;
        zzxc zzxcVarZzb;
        long jZzS;
        boolean z6;
        boolean z7;
        boolean z8;
        int i2;
        Object obj;
        long jLongValue;
        int iZzk2;
        boolean z9;
        boolean z10;
        boolean z11;
        int i3;
        boolean z12;
        long j6;
        zzxc zzxcVar;
        Object obj2;
        boolean z13;
        long j7;
        int i4;
        zzmm zzmmVar = this.zzH;
        zzln zzlnVar = this.zzT;
        int i5 = this.zzP;
        boolean z14 = this.zzQ;
        if (zzbfVar.zzg()) {
            zzbfVar2 = zzbfVar;
            zzxcVarZzb = zzmm.zzb();
            z6 = true;
            z8 = false;
            z7 = false;
            jZzS = 0;
            j = -9223372036854775807L;
            j4 = 0;
            j3 = -9223372036854775807L;
        } else {
            zzbd zzbdVar = this.zzm;
            zzxc zzxcVar2 = zzmmVar.zzb;
            j = -9223372036854775807L;
            Object obj3 = zzxcVar2.zza;
            zZzaC = zzaC(zzmmVar, zzbdVar);
            long j8 = (zzxcVar2.zzb() || zZzaC) ? zzmmVar.zzc : zzmmVar.zzs;
            zzbe zzbeVar2 = this.zzl;
            if (zzlnVar != null) {
                zzbfVar2 = zzbfVar;
                Pair pairZzaE = zzaE(zzbfVar2, zzlnVar, true, i5, z14, zzbeVar2, zzbdVar);
                if (pairZzaE == null) {
                    iZzk2 = zzbfVar2.zzk(z14);
                    obj = obj3;
                    jLongValue = j8;
                    z11 = true;
                    z10 = false;
                    z9 = false;
                } else {
                    if (zzlnVar.zzc == -9223372036854775807L) {
                        iZzk2 = zzbfVar2.zzo(pairZzaE.first, zzbdVar).zzc;
                        obj = obj3;
                        jLongValue = j8;
                        z9 = false;
                    } else {
                        obj = pairZzaE.first;
                        jLongValue = ((Long) pairZzaE.second).longValue();
                        iZzk2 = -1;
                        z9 = true;
                    }
                    z10 = zzmmVar.zze == 4;
                    z11 = false;
                }
                int i6 = iZzk2;
                obj3 = obj;
                zzbeVar = zzbeVar2;
                jMin = jLongValue;
                i = i6;
                boolean z15 = z9;
                z2 = z11;
                z5 = z10;
                z3 = z15;
                j2 = j8;
            } else {
                zzbeVar = zzbeVar2;
                zzbfVar2 = zzbfVar;
                zzbf zzbfVar3 = zzmmVar.zza;
                if (zzbfVar3.zzg()) {
                    iZzk = zzbfVar2.zzk(z14);
                } else {
                    if (zzbfVar2.zze(obj3) == -1) {
                        int iZzr = zzr(zzbeVar, zzbdVar, i5, z14, obj3, zzbfVar3, zzbfVar2);
                        if (iZzr == -1) {
                            zzbeVar = zzbeVar;
                            zzbfVar2 = zzbfVar2;
                            zzbdVar = zzbdVar;
                            obj3 = obj3;
                            iZzr = zzbfVar2.zzk(z14);
                            z4 = true;
                        } else {
                            zzbeVar = zzbeVar;
                            zzbfVar2 = zzbfVar2;
                            zzbdVar = zzbdVar;
                            obj3 = obj3;
                            z4 = false;
                        }
                        i = iZzr;
                        z2 = z4;
                        obj3 = obj3;
                        jMin = j8;
                        j2 = jMin;
                        z3 = false;
                    } else if (j8 == -9223372036854775807L) {
                        iZzk = zzbfVar2.zzo(obj3, zzbdVar).zzc;
                    } else if (zZzaC) {
                        zzbfVar3.zzo(obj3, zzbdVar);
                        if (zzbfVar3.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar3.zze(obj3)) {
                            Pair pairZzm = zzbfVar2.zzm(zzbeVar, zzbdVar, zzbfVar2.zzo(obj3, zzbdVar).zzc, j8);
                            j2 = j8;
                            obj3 = pairZzm.first;
                            jMax = ((Long) pairZzm.second).longValue();
                        } else {
                            j2 = j8;
                            if (zzbfVar2.zzo(obj3, zzbdVar).zzd != -9223372036854775807L) {
                                long j9 = zzbdVar.zzd - 1;
                                String str = zzfk.zza;
                                jMax = Math.max(0L, Math.min(j2, j9));
                            } else {
                                jMax = j2;
                            }
                            obj3 = obj3;
                        }
                        i = -1;
                        jMin = jMax;
                        z2 = false;
                        z3 = true;
                    } else {
                        j2 = j8;
                        i = -1;
                        jMin = j2;
                        z2 = false;
                        z3 = false;
                    }
                    z5 = false;
                }
                i = iZzk;
                jMin = j8;
                j2 = jMin;
                z2 = false;
                z3 = false;
                z5 = false;
            }
            if (i != -1) {
                Pair pairZzm2 = zzbfVar2.zzm(zzbeVar, zzbdVar, i, -9223372036854775807L);
                obj3 = pairZzm2.first;
                jMin = ((Long) pairZzm2.second).longValue();
                j3 = -9223372036854775807L;
            } else {
                j3 = jMin;
            }
            zzxc zzxcVarZzy = this.zzs.zzy(zzbfVar2, obj3, jMin);
            int i7 = zzxcVarZzy.zze;
            boolean z16 = i7 == -1 || ((i2 = zzxcVar2.zze) != -1 && i7 >= i2);
            boolean zEquals = obj3.equals(obj3);
            boolean z17 = zEquals && !zzxcVar2.zzb() && !zzxcVarZzy.zzb() && z16;
            zzbd zzbdVarZzo = zzbfVar2.zzo(obj3, zzbdVar);
            if (!zZzaC && j2 == j3 && obj3.equals(zzxcVarZzy.zza)) {
                if (zzxcVar2.zzb()) {
                    zzbdVarZzo.zzk(zzxcVar2.zzb);
                }
                if (zzxcVarZzy.zzb()) {
                    zzbdVarZzo.zzk(zzxcVarZzy.zzb);
                }
            }
            if (true == z17) {
                zzxcVarZzy = zzxcVar2;
            }
            if (zzxcVarZzy.zzb()) {
                if (zzxcVarZzy.equals(zzxcVar2)) {
                    j5 = zzmmVar.zzs;
                } else {
                    zzbfVar2.zzo(zzxcVarZzy.zza, zzbdVar);
                    if (zzxcVarZzy.zzc == zzbdVar.zzd(zzxcVarZzy.zzb)) {
                        zzbdVar.zzj();
                    }
                    j5 = 0;
                }
                j4 = 0;
            } else {
                if (zEquals && zzxcVar2.zzb()) {
                    zza zzaVarZza = zzbfVar2.zzo(obj3, zzbdVar).zzg.zza(zzxcVar2.zzb);
                    long j10 = zzaVarZza.zzi;
                    long j11 = zzmmVar.zzc;
                    if (j11 != -9223372036854775807L) {
                        long j12 = zzaVarZza.zza;
                        j4 = 0;
                        if (j11 >= 0) {
                        }
                    } else {
                        j4 = 0;
                    }
                    int i8 = zzaVarZza.zzb;
                    int i9 = zzxcVar2.zzc;
                    if (i8 > i9 && zzaVarZza.zze[i9] == 2) {
                        long j13 = zzbfVar2.zzo(obj3, zzbdVar).zzd;
                        if (j13 != -9223372036854775807L) {
                            jMin = Math.min(j13 - 1, jMin);
                        }
                        j3 = jMin;
                        j5 = j3;
                    }
                } else {
                    j4 = 0;
                }
                j5 = jMin;
            }
            zzxcVarZzb = zzxcVarZzy;
            jZzS = j5;
            z6 = z2;
            z7 = z3;
            z8 = z5;
        }
        boolean z18 = (this.zzH.zzb.equals(zzxcVarZzb) && jZzS == this.zzH.zzs) ? false : true;
        if (z6) {
            try {
                if (this.zzH.zze != 1) {
                    i3 = 4;
                    try {
                        zzB(4);
                    } catch (Throwable th) {
                        th = th;
                        i3 = 4;
                        zZzaC = false;
                        zzmm zzmmVar2 = this.zzH;
                        zzbf zzbfVar4 = zzmmVar2.zza;
                        zzxc zzxcVar3 = zzmmVar2.zzb;
                        if (true != z7) {
                            j6 = j;
                        } else {
                            j6 = jZzS;
                        }
                        zzxcVar = zzxcVarZzb;
                        zzag(zzbfVar, zzxcVar, zzbfVar4, zzxcVar3, j6, false);
                        if (z18) {
                            zzmm zzmmVar3 = this.zzH;
                            obj2 = zzmmVar3.zzb.zza;
                            zzbf zzbfVar5 = zzmmVar3.zza;
                            if (z18) {
                            }
                            if (z13) {
                                j7 = jZzS;
                            } else {
                                j7 = this.zzH.zzd;
                            }
                            if (zzbfVar.zze(obj2) == -1) {
                                i4 = i3;
                            } else {
                                i4 = 3;
                            }
                            this.zzH = zzap(zzxcVar, jZzS, j3, j7, z13, i4);
                        } else {
                            zzmm zzmmVar4 = this.zzH;
                            obj2 = zzmmVar4.zzb.zza;
                            zzbf zzbfVar6 = zzmmVar4.zza;
                            if (z18) {
                            }
                            if (z13) {
                                j7 = jZzS;
                            } else {
                                j7 = this.zzH.zzd;
                            }
                            if (zzbfVar.zze(obj2) == -1) {
                                i4 = i3;
                            } else {
                                i4 = 3;
                            }
                            this.zzH = zzap(zzxcVar, jZzS, j3, j7, z13, i4);
                        }
                        zzak();
                        zzZ(zzbfVar, this.zzH.zza);
                        this.zzH = this.zzH.zzd(zzbfVar);
                        if (!zzbfVar.zzg()) {
                            this.zzT = null;
                        }
                        zzat(zZzaC);
                        this.zzi.zzh(2);
                        throw th;
                    }
                } else {
                    i3 = 4;
                }
                z12 = false;
                try {
                    zzX(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    i3 = i3;
                    zZzaC = z12;
                    zzmm zzmmVar5 = this.zzH;
                    zzbf zzbfVar7 = zzmmVar5.zza;
                    zzxc zzxcVar4 = zzmmVar5.zzb;
                    if (true != z7) {
                        j6 = j;
                    } else {
                        j6 = jZzS;
                    }
                    zzxcVar = zzxcVarZzb;
                    zzag(zzbfVar, zzxcVar, zzbfVar7, zzxcVar4, j6, false);
                    if (z18) {
                        zzmm zzmmVar6 = this.zzH;
                        obj2 = zzmmVar6.zzb.zza;
                        zzbf zzbfVar8 = zzmmVar6.zza;
                        if (z18) {
                        }
                        if (z13) {
                            j7 = jZzS;
                        } else {
                            j7 = this.zzH.zzd;
                        }
                        if (zzbfVar.zze(obj2) == -1) {
                            i4 = i3;
                        } else {
                            i4 = 3;
                        }
                        this.zzH = zzap(zzxcVar, jZzS, j3, j7, z13, i4);
                    } else {
                        zzmm zzmmVar7 = this.zzH;
                        obj2 = zzmmVar7.zzb.zza;
                        zzbf zzbfVar9 = zzmmVar7.zza;
                        if (z18) {
                        }
                        if (z13) {
                            j7 = jZzS;
                        } else {
                            j7 = this.zzH.zzd;
                        }
                        if (zzbfVar.zze(obj2) == -1) {
                            i4 = i3;
                        } else {
                            i4 = 3;
                        }
                        this.zzH = zzap(zzxcVar, jZzS, j3, j7, z13, i4);
                    }
                    zzak();
                    zzZ(zzbfVar, this.zzH.zza);
                    this.zzH = this.zzH.zzd(zzbfVar);
                    if (!zzbfVar.zzg()) {
                        this.zzT = null;
                    }
                    zzat(zZzaC);
                    this.zzi.zzh(2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                i3 = 4;
                z12 = false;
                i3 = i3;
                zZzaC = z12;
                zzmm zzmmVar8 = this.zzH;
                zzbf zzbfVar10 = zzmmVar8.zza;
                zzxc zzxcVar5 = zzmmVar8.zzb;
                if (true != z7) {
                    j6 = j;
                } else {
                    j6 = jZzS;
                }
                zzxcVar = zzxcVarZzb;
                zzag(zzbfVar, zzxcVar, zzbfVar10, zzxcVar5, j6, false);
                if (z18) {
                    zzmm zzmmVar9 = this.zzH;
                    obj2 = zzmmVar9.zzb.zza;
                    zzbf zzbfVar11 = zzmmVar9.zza;
                    if (z18) {
                    }
                    if (z13) {
                        j7 = jZzS;
                    } else {
                        j7 = this.zzH.zzd;
                    }
                    if (zzbfVar.zze(obj2) == -1) {
                        i4 = i3;
                    } else {
                        i4 = 3;
                    }
                    this.zzH = zzap(zzxcVar, jZzS, j3, j7, z13, i4);
                } else {
                    zzmm zzmmVar10 = this.zzH;
                    obj2 = zzmmVar10.zzb.zza;
                    zzbf zzbfVar12 = zzmmVar10.zza;
                    if (z18) {
                    }
                    if (z13) {
                        j7 = jZzS;
                    } else {
                        j7 = this.zzH.zzd;
                    }
                    if (zzbfVar.zze(obj2) == -1) {
                        i4 = i3;
                    } else {
                        i4 = 3;
                    }
                    this.zzH = zzap(zzxcVar, jZzS, j3, j7, z13, i4);
                }
                zzak();
                zzZ(zzbfVar, this.zzH.zza);
                this.zzH = this.zzH.zzd(zzbfVar);
                if (!zzbfVar.zzg()) {
                    this.zzT = null;
                }
                zzat(zZzaC);
                this.zzi.zzh(2);
                throw th;
            }
        } else {
            i3 = 4;
            z12 = false;
        }
        zzmy[] zzmyVarArr = this.zzb;
        for (?? r6 = z12; r6 < 2; r6++) {
            zzmyVarArr[r6].zzn(zzbfVar2);
        }
        try {
            if (z18) {
                i3 = i3;
                zZzaC = z12;
                if (!zzbfVar2.zzg()) {
                    zzlz zzlzVar = this.zzs;
                    for (zzlw zzlwVarZzm = zzlzVar.zzm(); zzlwVarZzm != null; zzlwVarZzm = zzlwVarZzm.zzp()) {
                        if (zzlwVarZzm.zzg.zza.equals(zzxcVarZzb)) {
                            zzlwVarZzm.zzg = zzlzVar.zzx(zzbfVar2, zzlwVarZzm.zzg);
                            zzlwVarZzm.zzs();
                        }
                    }
                    jZzS = zzS(zzxcVarZzb, jZzS, z8);
                }
            } else {
                try {
                    zzlz zzlzVar2 = this.zzs;
                    try {
                        zZzaC = z12;
                        try {
                            int iZzw = zzlzVar2.zzw(zzbfVar, this.zzU, zzlzVar2.zzn() == null ? j4 : zzah(zzlzVar2.zzn()), (!zzaA() || zzlzVar2.zzo() == null) ? j4 : zzah(zzlzVar2.zzo()));
                            zzbfVar2 = zzbfVar;
                            if ((iZzw & 1) != 0) {
                                zzI(zZzaC);
                            } else if ((iZzw & 2) != 0) {
                                zzab();
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            zzmm zzmmVar11 = this.zzH;
                            zzbf zzbfVar13 = zzmmVar11.zza;
                            zzxc zzxcVar6 = zzmmVar11.zzb;
                            if (true != z7) {
                                j6 = j;
                            } else {
                                j6 = jZzS;
                            }
                            zzxcVar = zzxcVarZzb;
                            zzag(zzbfVar, zzxcVar, zzbfVar13, zzxcVar6, j6, false);
                            if (z18 || j3 != this.zzH.zzc) {
                                zzmm zzmmVar12 = this.zzH;
                                obj2 = zzmmVar12.zzb.zza;
                                zzbf zzbfVar14 = zzmmVar12.zza;
                                z13 = (z18 || !z || zzbfVar14.zzg() || zzbfVar14.zzo(obj2, this.zzm).zzf) ? zZzaC : true;
                                if (z13) {
                                    j7 = jZzS;
                                } else {
                                    j7 = this.zzH.zzd;
                                }
                                if (zzbfVar.zze(obj2) == -1) {
                                    i4 = i3;
                                } else {
                                    i4 = 3;
                                }
                                this.zzH = zzap(zzxcVar, jZzS, j3, j7, z13, i4);
                            }
                            zzak();
                            zzZ(zzbfVar, this.zzH.zza);
                            this.zzH = this.zzH.zzd(zzbfVar);
                            if (!zzbfVar.zzg()) {
                                this.zzT = null;
                            }
                            zzat(zZzaC);
                            this.zzi.zzh(2);
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        zZzaC = z12;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    i3 = i3;
                    zZzaC = z12;
                    zzmm zzmmVar13 = this.zzH;
                    zzbf zzbfVar15 = zzmmVar13.zza;
                    zzxc zzxcVar7 = zzmmVar13.zzb;
                    if (true != z7) {
                        j6 = j;
                    } else {
                        j6 = jZzS;
                    }
                    zzxcVar = zzxcVarZzb;
                    zzag(zzbfVar, zzxcVar, zzbfVar15, zzxcVar7, j6, false);
                    if (z18) {
                        zzmm zzmmVar14 = this.zzH;
                        obj2 = zzmmVar14.zzb.zza;
                        zzbf zzbfVar16 = zzmmVar14.zza;
                        if (z18) {
                        }
                        if (z13) {
                            j7 = jZzS;
                        } else {
                            j7 = this.zzH.zzd;
                        }
                        if (zzbfVar.zze(obj2) == -1) {
                            i4 = i3;
                        } else {
                            i4 = 3;
                        }
                        this.zzH = zzap(zzxcVar, jZzS, j3, j7, z13, i4);
                    } else {
                        zzmm zzmmVar15 = this.zzH;
                        obj2 = zzmmVar15.zzb.zza;
                        zzbf zzbfVar17 = zzmmVar15.zza;
                        if (z18) {
                        }
                        if (z13) {
                            j7 = jZzS;
                        } else {
                            j7 = this.zzH.zzd;
                        }
                        if (zzbfVar.zze(obj2) == -1) {
                            i4 = i3;
                        } else {
                            i4 = 3;
                        }
                        this.zzH = zzap(zzxcVar, jZzS, j3, j7, z13, i4);
                    }
                    zzak();
                    zzZ(zzbfVar, this.zzH.zza);
                    this.zzH = this.zzH.zzd(zzbfVar);
                    if (!zzbfVar.zzg()) {
                        this.zzT = null;
                    }
                    zzat(zZzaC);
                    this.zzi.zzh(2);
                    throw th;
                }
            }
            zzmm zzmmVar16 = this.zzH;
            zzxc zzxcVar8 = zzxcVarZzb;
            zzag(zzbfVar2, zzxcVar8, zzmmVar16.zza, zzmmVar16.zzb, true != z7 ? j : jZzS, false);
            zzbf zzbfVar18 = zzbfVar2;
            if (z18 || j3 != this.zzH.zzc) {
                zzmm zzmmVar17 = this.zzH;
                Object obj4 = zzmmVar17.zzb.zza;
                zzbf zzbfVar19 = zzmmVar17.zza;
                boolean z19 = (!z18 || !z || zzbfVar19.zzg() || zzbfVar19.zzo(obj4, this.zzm).zzf) ? zZzaC : true;
                this.zzH = zzap(zzxcVar8, jZzS, j3, z19 ? jZzS : this.zzH.zzd, z19, zzbfVar18.zze(obj4) == -1 ? i3 : 3);
            }
            zzak();
            zzZ(zzbfVar18, this.zzH.zza);
            this.zzH = this.zzH.zzd(zzbfVar18);
            if (!zzbfVar18.zzg()) {
                this.zzT = null;
            }
            zzat(zZzaC);
            this.zzi.zzh(2);
        } catch (Throwable th7) {
            th = th7;
        }
    }

    private final void zzag(zzbf zzbfVar, zzxc zzxcVar, zzbf zzbfVar2, zzxc zzxcVar2, long j, boolean z) throws zzje {
        if (!zzP(zzbfVar, zzxcVar)) {
            zzav zzavVar = zzxcVar.zzb() ? zzav.zza : this.zzH.zzo;
            if (this.zzo.zzj().equals(zzavVar)) {
                return;
            }
            zzM(zzavVar);
            zzam(this.zzH.zzo, zzavVar.zzb, false, false);
            return;
        }
        Object obj = zzxcVar.zza;
        zzbd zzbdVar = this.zzm;
        int i = zzbfVar.zzo(obj, zzbdVar).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i, zzbeVar, 0L);
        zzix zzixVar = this.zzae;
        zzaf zzafVar = zzbeVar.zzj;
        String str = zzfk.zza;
        zzixVar.zza(zzafVar);
        if (j != -9223372036854775807L) {
            zzixVar.zzb(zzO(zzbfVar, obj, j));
            return;
        }
        if (!Objects.equals(!zzbfVar2.zzg() ? zzbfVar2.zzb(zzbfVar2.zzo(zzxcVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb : null, zzbeVar.zzb) || z) {
            zzixVar.zzb(-9223372036854775807L);
        }
    }

    private final long zzah(zzlw zzlwVar) {
        if (zzlwVar == null) {
            return 0L;
        }
        long jZza = zzlwVar.zza();
        if (zzlwVar.zze) {
            int i = 0;
            while (true) {
                zzmy[] zzmyVarArr = this.zzb;
                if (i >= 2) {
                    break;
                }
                if (zzmyVarArr[i].zzp(zzlwVar)) {
                    long jZzf = zzmyVarArr[i].zzf(zzlwVar);
                    if (jZzf == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jZza = Math.max(jZzf, jZza);
                }
                i++;
            }
        }
        return jZza;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0215 A[LOOP:9: B:118:0x0213->B:119:0x0215, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x0326  */
    /* JADX WARN: Code duplicated, block: B:63:0x0108 A[EDGE_INSN: B:63:0x0108->B:139:0x025c BREAK  A[LOOP:6: B:72:0x0126->B:76:0x0132]] */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zzai() throws zzje {
        int i;
        int i2;
        boolean z;
        zzlw zzlwVarZzm;
        zzlw zzlwVarZzp;
        boolean z2;
        zzmy[] zzmyVarArr;
        zzlw zzlwVarZzo;
        zzlx zzlxVarZzh;
        if (this.zzH.zza.zzg() || !this.zzt.zzb()) {
            return;
        }
        zzlz zzlzVar = this.zzs;
        zzlzVar.zzf(this.zzU);
        if (zzlzVar.zzg() && (zzlxVarZzh = zzlzVar.zzh(this.zzU, this.zzH)) != null) {
            zzlw zzlwVarZzi = zzlzVar.zzi(zzlxVarZzh);
            if (!zzlwVarZzi.zzd) {
                zzlwVarZzi.zzt(this, zzlxVarZzh.zzb);
            } else if (zzlwVarZzi.zze) {
                this.zzi.zzd(8, zzlwVarZzi.zza).zza();
            }
            if (zzlzVar.zzm() == zzlwVarZzi) {
                zzU(zzlxVarZzh.zzb, true);
            }
            zzat(false);
        }
        if (this.zzO) {
            this.zzO = zzaG(zzlzVar.zzk());
            zzao();
        } else {
            zzan();
        }
        if (!this.zzL && this.zzy && !this.zzac && !zzaA() && (zzlwVarZzo = zzlzVar.zzo()) != null && zzlwVarZzo == zzlzVar.zzn() && zzlwVarZzo.zzp() != null && zzlwVarZzo.zzp().zze && zzaw(zzlwVarZzo.zzp()) <= 10000000) {
            zzlzVar.zzq();
            zzlw zzlwVarZzo2 = zzlzVar.zzo();
            if (zzlwVarZzo2 != null) {
                zzaba zzabaVarZzr = zzlwVarZzo2.zzr();
                int i3 = 0;
                while (true) {
                    zzmy[] zzmyVarArr2 = this.zzb;
                    if (i3 >= 2) {
                        break;
                    }
                    if (zzabaVarZzr.zza(i3) && zzmyVarArr2[i3].zza() && !zzmyVarArr2[i3].zzc()) {
                        zzmyVarArr2[i3].zzb();
                        zzas(zzlwVarZzo2, i3, false, zzlwVarZzo2.zzc());
                    }
                    i3++;
                }
                if (zzaA()) {
                    this.zzab = zzlwVarZzo2.zza.zzh();
                    if (!zzlwVarZzo2.zzd()) {
                        zzlzVar.zzs(zzlwVarZzo2);
                        zzat(false);
                        zzan();
                    }
                }
            }
        }
        zzlw zzlwVarZzn = zzlzVar.zzn();
        if (zzlwVarZzn == null) {
            i = 1;
            break;
        }
        if (zzlwVarZzn.zzp() != null && !this.zzL) {
            zzlw zzlwVarZzn2 = zzlzVar.zzn();
            if (!zzlwVarZzn2.zze) {
                i = 1;
                break;
            }
            int i4 = 0;
            while (true) {
                zzmy[] zzmyVarArr3 = this.zzb;
                if (i4 >= 2) {
                    if ((!zzaA() || zzlzVar.zzo() != zzlzVar.zzn()) && ((zzlwVarZzn.zzp().zze || this.zzU >= zzlwVarZzn.zzp().zzc()) && (!zzlwVarZzn.zzp().zze || zzaw(zzlwVarZzn.zzp()) <= 10000000))) {
                        zzaba zzabaVarZzr2 = zzlwVarZzn.zzr();
                        zzlw zzlwVarZzp2 = zzlzVar.zzp();
                        zzaba zzabaVarZzr3 = zzlwVarZzp2.zzr();
                        zzbf zzbfVar = this.zzH.zza;
                        i = 1;
                        zzag(zzbfVar, zzlwVarZzp2.zzg.zza, zzbfVar, zzlwVarZzn.zzg.zza, -9223372036854775807L, false);
                        if (zzlwVarZzp2.zze && (((z = this.zzy) && this.zzab != -9223372036854775807L) || zzlwVarZzp2.zza.zzh() != -9223372036854775807L)) {
                            this.zzab = -9223372036854775807L;
                            if (z && !this.zzac) {
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= 2) {
                                        for (i2 = 0; i2 < 2; i2++) {
                                            zzmyVarArr3[i2].zzi(zzabaVarZzr2, zzabaVarZzr3, zzlwVarZzp2.zzc());
                                        }
                                        break;
                                        break;
                                    }
                                    if (zzabaVarZzr3.zza(i5)) {
                                        zzmyVarArr3[i5].zze();
                                        zzaas[] zzaasVarArr = zzabaVarZzr3.zzc;
                                        if (zzas.zzd(zzaasVarArr[i5].zzc().zzp, zzaasVarArr[i5].zzc().zzk) || zzmyVarArr3[i5].zzc()) {
                                        }
                                    }
                                    i5++;
                                }
                            }
                            long jZzc = zzlwVarZzp2.zzc();
                            for (int i6 = 0; i6 < 2; i6++) {
                                zzmyVarArr3[i6].zzj(jZzc);
                            }
                            if (!zzlwVarZzp2.zzd()) {
                                zzlzVar.zzs(zzlwVarZzp2);
                                zzat(false);
                                zzan();
                                break;
                            }
                            break;
                        }
                        while (i2 < 2) {
                            zzmyVarArr3[i2].zzi(zzabaVarZzr2, zzabaVarZzr3, zzlwVarZzp2.zzc());
                        }
                        break;
                    }
                } else if (zzmyVarArr3[i4].zzr(zzlwVarZzn2)) {
                    i4++;
                }
                i = 1;
                break;
            }
        } else {
            i = 1;
            if (zzlwVarZzn.zzg.zzk || this.zzL) {
                zzmy[] zzmyVarArr4 = this.zzb;
                for (int i7 = 0; i7 < 2; i7++) {
                    zzmy zzmyVar = zzmyVarArr4[i7];
                    if (zzmyVar.zzp(zzlwVarZzn) && zzmyVar.zzg(zzlwVarZzn)) {
                        long j = zzlwVarZzn.zzg.zzf;
                        zzmyVar.zzh(zzlwVarZzn, (j == -9223372036854775807L || j == Long.MIN_VALUE) ? -9223372036854775807L : zzlwVarZzn.zza() + j);
                    }
                }
            }
        }
        zzlw zzlwVarZzn3 = zzlzVar.zzn();
        if (zzlwVarZzn3 != null && zzlzVar.zzm() != zzlwVarZzn3 && !zzlwVarZzn3.zzh) {
            zzlw zzlwVarZzn4 = zzlzVar.zzn();
            zzaba zzabaVarZzr4 = zzlwVarZzn4.zzr();
            int i8 = i;
            int i9 = 0;
            while (true) {
                zzmyVarArr = this.zzb;
                if (i9 >= 2) {
                    break;
                }
                int iZzd = zzmyVarArr[i9].zzd();
                int iZzH = zzmyVarArr[i9].zzH(zzlwVarZzn4, zzabaVarZzr4, this.zzo);
                this.zzS -= iZzd - zzmyVarArr[i9].zzd();
                i8 &= iZzH & 1;
                i9++;
            }
            if (i8 != 0) {
                for (int i10 = 0; i10 < 2; i10++) {
                    if (zzabaVarZzr4.zza(i10) && !zzmyVarArr[i10].zzp(zzlwVarZzn4)) {
                        zzas(zzlwVarZzn4, i10, false, zzlwVarZzn4.zzc());
                    }
                }
                zzlzVar.zzn().zzh = i;
            }
        }
        boolean z3 = false;
        while (zzay() && !this.zzL && (zzlwVarZzm = zzlzVar.zzm()) != null && (zzlwVarZzp = zzlwVarZzm.zzp()) != null && this.zzU >= zzlwVarZzp.zzc() && zzlwVarZzp.zzh) {
            if (z3) {
                zzC();
            }
            this.zzac = false;
            zzlw zzlwVarZzr = zzlzVar.zzr();
            zzlwVarZzr.getClass();
            if (this.zzH.zzb.zza.equals(zzlwVarZzr.zzg.zza.zza)) {
                zzxc zzxcVar = this.zzH.zzb;
                if (zzxcVar.zzb == -1) {
                    zzxc zzxcVar2 = zzlwVarZzr.zzg.zza;
                    if (zzxcVar2.zzb != -1 || zzxcVar.zze == zzxcVar2.zze) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            zzlx zzlxVar = zzlwVarZzr.zzg;
            boolean z4 = z2;
            zzxc zzxcVar3 = zzlxVar.zza;
            long j2 = zzlxVar.zzb;
            this.zzH = zzap(zzxcVar3, j2, zzlxVar.zzd, j2, !z4, 0);
            zzak();
            zzL();
            if (zzaA() && zzlwVarZzr == zzlzVar.zzo()) {
                zzmy[] zzmyVarArr5 = this.zzb;
                for (int i11 = 0; i11 < 2; i11++) {
                    zzmyVarArr5[i11].zzB();
                }
            }
            if (this.zzH.zze == 3) {
                zzJ();
            }
            zzaba zzabaVarZzr5 = zzlzVar.zzm().zzr();
            int i12 = 0;
            while (true) {
                zzmy[] zzmyVarArr6 = this.zzb;
                if (i12 < 2) {
                    if (zzabaVarZzr5.zza(i12)) {
                        zzmyVarArr6[i12].zzl();
                    }
                    i12++;
                }
            }
            z3 = true;
        }
        long j3 = this.zzaa.zzb;
    }

    private final void zzaj() {
        zzlz zzlzVar = this.zzs;
        zzlzVar.zzt();
        zzlw zzlwVarZzl = zzlzVar.zzl();
        if (zzlwVarZzl != null) {
            if (!zzlwVarZzl.zzd || zzlwVarZzl.zze) {
                zzxa zzxaVar = zzlwVarZzl.zza;
                if (zzxaVar.zzn()) {
                    return;
                }
                if (this.zzg.zzj(this.zzv, this.zzH.zza, zzlwVarZzl.zzg.zza, zzlwVarZzl.zze ? zzxaVar.zzi() : 0L)) {
                    if (!zzlwVarZzl.zzd) {
                        zzlwVarZzl.zzt(this, zzlwVarZzl.zzg.zzb);
                        return;
                    }
                    zzlt zzltVar = new zzlt();
                    zzltVar.zza(this.zzU - zzlwVarZzl.zza());
                    zzltVar.zzb(this.zzo.zzj().zzb);
                    zzltVar.zzc(this.zzN);
                    zzlwVarZzl.zzj(new zzlu(zzltVar, null));
                }
            }
        }
    }

    private final void zzak() {
        zzlw zzlwVarZzm = this.zzs.zzm();
        boolean z = false;
        if (zzlwVarZzm != null && zzlwVarZzm.zzg.zzj && this.zzK) {
            z = true;
        }
        this.zzL = z;
    }

    private final void zzal(zzav zzavVar, boolean z) throws zzje {
        zzam(zzavVar, zzavVar.zzb, true, z);
    }

    private final void zzam(zzav zzavVar, float f, boolean z, boolean z2) throws zzje {
        int i;
        if (z) {
            if (z2) {
                this.zzI.zza(1);
            }
            zzmm zzmmVar = this.zzH;
            zzbf zzbfVar = zzmmVar.zza;
            zzxc zzxcVar = zzmmVar.zzb;
            long j = zzmmVar.zzc;
            long j2 = zzmmVar.zzd;
            int i2 = zzmmVar.zze;
            zzje zzjeVar = zzmmVar.zzf;
            boolean z3 = zzmmVar.zzg;
            zzzf zzzfVar = zzmmVar.zzh;
            zzaba zzabaVar = zzmmVar.zzi;
            List list = zzmmVar.zzj;
            zzxc zzxcVar2 = zzmmVar.zzk;
            boolean z4 = zzmmVar.zzl;
            int i3 = zzmmVar.zzm;
            int i4 = zzmmVar.zzn;
            long j3 = zzmmVar.zzq;
            long j4 = zzmmVar.zzr;
            long j5 = zzmmVar.zzs;
            long j6 = zzmmVar.zzt;
            boolean z5 = zzmmVar.zzp;
            this.zzH = new zzmm(zzbfVar, zzxcVar, j, j2, i2, zzjeVar, z3, zzzfVar, zzabaVar, list, zzxcVar2, z4, i3, i4, zzavVar, j3, j4, j5, j6, false);
        }
        float f2 = zzavVar.zzb;
        zzlw zzlwVarZzm = this.zzs.zzm();
        while (true) {
            i = 0;
            if (zzlwVarZzm == null) {
                break;
            }
            zzaas[] zzaasVarArr = zzlwVarZzm.zzr().zzc;
            int length = zzaasVarArr.length;
            while (i < length) {
                zzaas zzaasVar = zzaasVarArr[i];
                i++;
            }
            zzlwVarZzm = zzlwVarZzm.zzp();
        }
        zzmy[] zzmyVarArr = this.zzb;
        while (i < 2) {
            zzmyVarArr[i].zzm(f, f2);
            i++;
        }
    }

    private final void zzan() {
        long jZza;
        long jZza2;
        zzlz zzlzVar = this.zzs;
        boolean zZzh = false;
        if (zzaG(zzlzVar.zzk())) {
            zzlw zzlwVarZzk = zzlzVar.zzk();
            long jZzav = zzav(zzlwVarZzk.zzg());
            if (zzlwVarZzk == zzlzVar.zzm()) {
                jZza = this.zzU;
                jZza2 = zzlwVarZzk.zza();
            } else {
                jZza = this.zzU - zzlwVarZzk.zza();
                jZza2 = zzlwVarZzk.zzg.zzb;
            }
            zzlr zzlrVar = new zzlr(this.zzv, this.zzH.zza, zzlwVarZzk.zzg.zza, jZza - jZza2, jZzav, this.zzo.zzj().zzb, this.zzH.zzl, this.zzM, zzP(this.zzH.zza, zzlwVarZzk.zzg.zza) ? this.zzae.zze() : -9223372036854775807L, this.zzN);
            zzls zzlsVar = this.zzg;
            boolean zZzh2 = zzlsVar.zzh(zzlrVar);
            zzlw zzlwVarZzm = zzlzVar.zzm();
            if (zZzh2 || !zzlwVarZzm.zze || jZzav >= 500000 || this.zzn <= 0) {
                zZzh = zZzh2;
            } else {
                zzlwVarZzm.zza.zzf(this.zzH.zzs, false);
                zZzh = zzlsVar.zzh(zzlrVar);
            }
        }
        this.zzO = zZzh;
        if (zZzh) {
            zzlw zzlwVarZzk2 = zzlzVar.zzk();
            zzlwVarZzk2.getClass();
            zzlt zzltVar = new zzlt();
            zzltVar.zza(this.zzU - zzlwVarZzk2.zza());
            zzltVar.zzb(this.zzo.zzj().zzb);
            zzltVar.zzc(this.zzN);
            zzlwVarZzk2.zzj(new zzlu(zzltVar, null));
        }
        zzao();
    }

    private final void zzao() {
        zzlw zzlwVarZzk = this.zzs.zzk();
        boolean z = true;
        if (!this.zzO && (zzlwVarZzk == null || !zzlwVarZzk.zza.zzn())) {
            z = false;
        }
        zzmm zzmmVar = this.zzH;
        if (z != zzmmVar.zzg) {
            this.zzH = zzmmVar.zzg(z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    private final zzmm zzap(zzxc zzxcVar, long j, long j2, long j3, boolean z, int i) {
        List list;
        zzaba zzabaVar;
        zzlw zzlwVarZzm;
        int i2 = 0;
        this.zzX = (!this.zzX && j == this.zzH.zzs && zzxcVar.equals(this.zzH.zzb)) ? false : true;
        zzak();
        zzmm zzmmVar = this.zzH;
        zzzf zzzfVar = zzmmVar.zzh;
        zzaba zzabaVar2 = zzmmVar.zzi;
        List listZzi = zzmmVar.zzj;
        if (this.zzt.zzb()) {
            zzlz zzlzVar = this.zzs;
            zzlw zzlwVarZzm2 = zzlzVar.zzm();
            zzzf zzzfVarZzq = zzlwVarZzm2 == null ? zzzf.zza : zzlwVarZzm2.zzq();
            zzaba zzabaVarZzr = zzlwVarZzm2 == null ? this.zzf : zzlwVarZzm2.zzr();
            zzaas[] zzaasVarArr = zzabaVarZzr.zzc;
            zzgvw zzgvwVar = new zzgvw();
            boolean z2 = false;
            for (zzaas zzaasVar : zzaasVarArr) {
                if (zzaasVar != null) {
                    zzap zzapVar = zzaasVar.zzb(0).zzl;
                    if (zzapVar == null) {
                        zzgvwVar.zzf(new zzap(-9223372036854775807L, new zzao[0]));
                    } else {
                        zzgvwVar.zzf(zzapVar);
                        z2 = true;
                    }
                }
            }
            zzgvz zzgvzVarZzi = z2 ? zzgvwVar.zzi() : zzgvz.zzi();
            if (zzlwVarZzm2 != null) {
                zzlx zzlxVar = zzlwVarZzm2.zzg;
                if (zzlxVar.zzd != j2) {
                    zzlwVarZzm2.zzg = zzlxVar.zzb(j2);
                }
            }
            if (zzlzVar.zzm() == zzlzVar.zzn() && (zzlwVarZzm = zzlzVar.zzm()) != null) {
                zzaba zzabaVarZzr2 = zzlwVarZzm.zzr();
                while (true) {
                    zzmy[] zzmyVarArr = this.zzb;
                    if (i2 >= 2) {
                        break;
                    }
                    if (zzabaVarZzr2.zza(i2)) {
                        if (zzmyVarArr[i2].zze() != 1) {
                            break;
                        }
                        int i3 = zzabaVarZzr2.zzb[i2].zzb;
                    }
                    i2++;
                }
            }
            list = zzgvzVarZzi;
            zzzfVar = zzzfVarZzq;
            zzabaVar = zzabaVarZzr;
        } else {
            if (!zzxcVar.equals(this.zzH.zzb)) {
                zzabaVar2 = this.zzf;
                zzzfVar = zzzf.zza;
                listZzi = zzgvz.zzi();
            }
            list = listZzi;
            zzabaVar = zzabaVar2;
        }
        if (z) {
            this.zzI.zzc(i);
        }
        return this.zzH.zzc(zzxcVar, j, j2, j3, zzau(), zzzfVar, zzabaVar, list);
    }

    private final void zzaq() throws zzje {
        zzar(new boolean[2], this.zzs.zzn().zzc());
    }

    private final void zzar(boolean[] zArr, long j) throws zzje {
        zzmy[] zzmyVarArr;
        long j2;
        zzlw zzlwVarZzn = this.zzs.zzn();
        zzaba zzabaVarZzr = zzlwVarZzn.zzr();
        int i = 0;
        while (true) {
            zzmyVarArr = this.zzb;
            if (i >= 2) {
                break;
            }
            if (!zzabaVarZzr.zza(i)) {
                zzmyVarArr[i].zzG();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < 2) {
            if (!zzabaVarZzr.zza(i2) || zzmyVarArr[i2].zzp(zzlwVarZzn)) {
                j2 = j;
            } else {
                j2 = j;
                zzas(zzlwVarZzn, i2, zArr[i2], j2);
            }
            i2++;
            j = j2;
        }
    }

    private final void zzas(zzlw zzlwVar, int i, boolean z, long j) throws zzje {
        zzmy zzmyVar = this.zzb[i];
        if (zzmyVar.zzM()) {
            return;
        }
        boolean z2 = zzlwVar == this.zzs.zzm();
        zzaba zzabaVarZzr = zzlwVar.zzr();
        zzmx zzmxVar = zzabaVarZzr.zzb[i];
        zzaas zzaasVar = zzabaVarZzr.zzc[i];
        boolean z3 = zzay() && this.zzH.zze == 3;
        boolean z4 = !z && z3;
        this.zzS++;
        zzmyVar.zzx(zzmxVar, zzaasVar, zzlwVar.zzc[i], this.zzU, z4, z2, j, zzlwVar.zza(), zzlwVar.zzg.zza, this.zzo);
        zzmyVar.zzy(11, new zzlc(this), zzlwVar);
        if (z3 && z2) {
            zzmyVar.zzv();
        }
    }

    private final void zzat(boolean z) {
        zzlw zzlwVarZzk = this.zzs.zzk();
        zzxc zzxcVar = zzlwVarZzk == null ? this.zzH.zzb : zzlwVarZzk.zzg.zza;
        boolean zEquals = this.zzH.zzk.equals(zzxcVar);
        if (!zEquals) {
            this.zzH = this.zzH.zzh(zzxcVar);
        }
        zzmm zzmmVar = this.zzH;
        zzmmVar.zzq = zzlwVarZzk == null ? zzmmVar.zzs : zzlwVarZzk.zzf();
        this.zzH.zzr = zzau();
        if ((!zEquals || z) && zzlwVarZzk != null && zzlwVarZzk.zze) {
            zzax(zzlwVarZzk.zzg.zza, zzlwVarZzk.zzq(), zzlwVarZzk.zzr());
        }
    }

    private final long zzau() {
        return zzav(this.zzH.zzq);
    }

    private final long zzav(long j) {
        zzlw zzlwVarZzk = this.zzs.zzk();
        if (zzlwVarZzk == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzU - zzlwVarZzk.zza()));
    }

    private final long zzaw(zzlw zzlwVar) {
        zzgsw.zzi(zzlwVar.zze);
        return (long) ((zzlwVar.zzc() - this.zzU) / this.zzo.zzj().zzb);
    }

    private final void zzax(zzxc zzxcVar, zzzf zzzfVar, zzaba zzabaVar) {
        long jZza;
        long jZza2;
        zzlz zzlzVar = this.zzs;
        zzlw zzlwVarZzk = zzlzVar.zzk();
        zzlwVarZzk.getClass();
        if (zzlwVarZzk == zzlzVar.zzm()) {
            jZza = this.zzU;
            jZza2 = zzlwVarZzk.zza();
        } else {
            jZza = this.zzU - zzlwVarZzk.zza();
            jZza2 = zzlwVarZzk.zzg.zzb;
        }
        this.zzg.zzb(new zzlr(this.zzv, this.zzH.zza, zzxcVar, jZza - jZza2, zzav(zzlwVarZzk.zzf()), this.zzo.zzj().zzb, this.zzH.zzl, this.zzM, zzP(this.zzH.zza, zzlwVarZzk.zzg.zza) ? this.zzae.zze() : -9223372036854775807L, this.zzN), zzzfVar, zzabaVar.zzc);
    }

    private final boolean zzay() {
        zzmm zzmmVar = this.zzH;
        return zzmmVar.zzl && zzmmVar.zzn == 0;
    }

    private final void zzaz(int i) throws zzje, IOException {
        zzmy zzmyVar = this.zzb[i];
        try {
            zzlw zzlwVarZzm = this.zzs.zzm();
            if (zzlwVarZzm == null) {
                throw null;
            }
            zzlw zzlwVar = zzlwVarZzm;
            zzmyVar.zzu(zzlwVarZzm);
        } catch (IOException | RuntimeException e) {
            zzmyVar.zze();
            throw e;
        }
    }

    static int zzr(zzbe zzbeVar, zzbd zzbdVar, int i, boolean z, Object obj, zzbf zzbfVar, zzbf zzbfVar2) {
        zzbf zzbfVar3 = zzbfVar;
        Object obj2 = zzbfVar3.zzb(zzbfVar3.zzo(obj, zzbdVar).zzc, zzbeVar, 0L).zzb;
        for (int i2 = 0; i2 < zzbfVar2.zza(); i2++) {
            if (zzbfVar2.zzb(i2, zzbeVar, 0L).zzb.equals(obj2)) {
                return i2;
            }
        }
        int iZze = zzbfVar3.zze(obj);
        int iZzc = zzbfVar3.zzc();
        int iZze2 = -1;
        int i3 = 0;
        while (i3 < iZzc && iZze2 == -1) {
            zzbf zzbfVar4 = zzbfVar3;
            int iZzl = zzbfVar4.zzl(iZze, zzbdVar, zzbeVar, i, z);
            if (iZzl == -1) {
                iZze2 = -1;
                break;
            }
            iZze2 = zzbfVar2.zze(zzbfVar4.zzf(iZzl));
            i3++;
            zzbfVar3 = zzbfVar4;
            iZze = iZzl;
        }
        if (iZze2 == -1) {
            return -1;
        }
        return zzbfVar2.zzd(iZze2, zzbdVar, false).zzc;
    }

    static final /* synthetic */ void zzz(zzmq zzmqVar) {
        try {
            zzaF(zzmqVar);
        } catch (zzje e) {
            zzef.zzf("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:287:0x0616 A[Catch: RuntimeException -> 0x0717, zzje -> 0x0719, IOException -> 0x0746, zzwc -> 0x074d, zzhk -> 0x0754, zzat -> 0x075b, zztx -> 0x0771, TryCatch #25 {zzje -> 0x0719, RuntimeException -> 0x0717, blocks: (B:243:0x0531, B:247:0x053a, B:249:0x053e, B:250:0x0549, B:252:0x054f, B:307:0x066b, B:310:0x0672, B:312:0x0676, B:314:0x067e, B:315:0x0681, B:316:0x0684, B:318:0x068a, B:320:0x0693, B:322:0x069d, B:324:0x06a3, B:326:0x06a9, B:333:0x06cb, B:335:0x06d1, B:339:0x06db, B:349:0x06f5, B:346:0x06ee, B:348:0x06f2, B:327:0x06b0, B:330:0x06be, B:331:0x06c6, B:332:0x06c7, B:254:0x055c, B:256:0x0562, B:258:0x0566, B:285:0x0609, B:287:0x0616, B:289:0x0626, B:291:0x062d, B:293:0x0631, B:297:0x063a, B:299:0x0649, B:301:0x064f, B:303:0x0659, B:304:0x065e, B:305:0x0663, B:306:0x0668, B:261:0x0573, B:263:0x0577, B:265:0x0589, B:267:0x0594, B:269:0x059e, B:273:0x05a7, B:275:0x05b1, B:281:0x05bc, B:352:0x06ff, B:356:0x0708), top: B:450:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:291:0x062d A[Catch: RuntimeException -> 0x0717, zzje -> 0x0719, IOException -> 0x0746, zzwc -> 0x074d, zzhk -> 0x0754, zzat -> 0x075b, zztx -> 0x0771, TryCatch #25 {zzje -> 0x0719, RuntimeException -> 0x0717, blocks: (B:243:0x0531, B:247:0x053a, B:249:0x053e, B:250:0x0549, B:252:0x054f, B:307:0x066b, B:310:0x0672, B:312:0x0676, B:314:0x067e, B:315:0x0681, B:316:0x0684, B:318:0x068a, B:320:0x0693, B:322:0x069d, B:324:0x06a3, B:326:0x06a9, B:333:0x06cb, B:335:0x06d1, B:339:0x06db, B:349:0x06f5, B:346:0x06ee, B:348:0x06f2, B:327:0x06b0, B:330:0x06be, B:331:0x06c6, B:332:0x06c7, B:254:0x055c, B:256:0x0562, B:258:0x0566, B:285:0x0609, B:287:0x0616, B:289:0x0626, B:291:0x062d, B:293:0x0631, B:297:0x063a, B:299:0x0649, B:301:0x064f, B:303:0x0659, B:304:0x065e, B:305:0x0663, B:306:0x0668, B:261:0x0573, B:263:0x0577, B:265:0x0589, B:267:0x0594, B:269:0x059e, B:273:0x05a7, B:275:0x05b1, B:281:0x05bc, B:352:0x06ff, B:356:0x0708), top: B:450:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:293:0x0631 A[Catch: RuntimeException -> 0x0717, zzje -> 0x0719, IOException -> 0x0746, zzwc -> 0x074d, zzhk -> 0x0754, zzat -> 0x075b, zztx -> 0x0771, TryCatch #25 {zzje -> 0x0719, RuntimeException -> 0x0717, blocks: (B:243:0x0531, B:247:0x053a, B:249:0x053e, B:250:0x0549, B:252:0x054f, B:307:0x066b, B:310:0x0672, B:312:0x0676, B:314:0x067e, B:315:0x0681, B:316:0x0684, B:318:0x068a, B:320:0x0693, B:322:0x069d, B:324:0x06a3, B:326:0x06a9, B:333:0x06cb, B:335:0x06d1, B:339:0x06db, B:349:0x06f5, B:346:0x06ee, B:348:0x06f2, B:327:0x06b0, B:330:0x06be, B:331:0x06c6, B:332:0x06c7, B:254:0x055c, B:256:0x0562, B:258:0x0566, B:285:0x0609, B:287:0x0616, B:289:0x0626, B:291:0x062d, B:293:0x0631, B:297:0x063a, B:299:0x0649, B:301:0x064f, B:303:0x0659, B:304:0x065e, B:305:0x0663, B:306:0x0668, B:261:0x0573, B:263:0x0577, B:265:0x0589, B:267:0x0594, B:269:0x059e, B:273:0x05a7, B:275:0x05b1, B:281:0x05bc, B:352:0x06ff, B:356:0x0708), top: B:450:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:295:0x0637  */
    /* JADX WARN: Code duplicated, block: B:296:0x0638 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:297:0x063a A[Catch: RuntimeException -> 0x0717, zzje -> 0x0719, IOException -> 0x0746, zzwc -> 0x074d, zzhk -> 0x0754, zzat -> 0x075b, zztx -> 0x0771, TryCatch #25 {zzje -> 0x0719, RuntimeException -> 0x0717, blocks: (B:243:0x0531, B:247:0x053a, B:249:0x053e, B:250:0x0549, B:252:0x054f, B:307:0x066b, B:310:0x0672, B:312:0x0676, B:314:0x067e, B:315:0x0681, B:316:0x0684, B:318:0x068a, B:320:0x0693, B:322:0x069d, B:324:0x06a3, B:326:0x06a9, B:333:0x06cb, B:335:0x06d1, B:339:0x06db, B:349:0x06f5, B:346:0x06ee, B:348:0x06f2, B:327:0x06b0, B:330:0x06be, B:331:0x06c6, B:332:0x06c7, B:254:0x055c, B:256:0x0562, B:258:0x0566, B:285:0x0609, B:287:0x0616, B:289:0x0626, B:291:0x062d, B:293:0x0631, B:297:0x063a, B:299:0x0649, B:301:0x064f, B:303:0x0659, B:304:0x065e, B:305:0x0663, B:306:0x0668, B:261:0x0573, B:263:0x0577, B:265:0x0589, B:267:0x0594, B:269:0x059e, B:273:0x05a7, B:275:0x05b1, B:281:0x05bc, B:352:0x06ff, B:356:0x0708), top: B:450:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:299:0x0649 A[Catch: RuntimeException -> 0x0717, zzje -> 0x0719, IOException -> 0x0746, zzwc -> 0x074d, zzhk -> 0x0754, zzat -> 0x075b, zztx -> 0x0771, TryCatch #25 {zzje -> 0x0719, RuntimeException -> 0x0717, blocks: (B:243:0x0531, B:247:0x053a, B:249:0x053e, B:250:0x0549, B:252:0x054f, B:307:0x066b, B:310:0x0672, B:312:0x0676, B:314:0x067e, B:315:0x0681, B:316:0x0684, B:318:0x068a, B:320:0x0693, B:322:0x069d, B:324:0x06a3, B:326:0x06a9, B:333:0x06cb, B:335:0x06d1, B:339:0x06db, B:349:0x06f5, B:346:0x06ee, B:348:0x06f2, B:327:0x06b0, B:330:0x06be, B:331:0x06c6, B:332:0x06c7, B:254:0x055c, B:256:0x0562, B:258:0x0566, B:285:0x0609, B:287:0x0616, B:289:0x0626, B:291:0x062d, B:293:0x0631, B:297:0x063a, B:299:0x0649, B:301:0x064f, B:303:0x0659, B:304:0x065e, B:305:0x0663, B:306:0x0668, B:261:0x0573, B:263:0x0577, B:265:0x0589, B:267:0x0594, B:269:0x059e, B:273:0x05a7, B:275:0x05b1, B:281:0x05bc, B:352:0x06ff, B:356:0x0708), top: B:450:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:301:0x064f A[Catch: RuntimeException -> 0x0717, zzje -> 0x0719, IOException -> 0x0746, zzwc -> 0x074d, zzhk -> 0x0754, zzat -> 0x075b, zztx -> 0x0771, TryCatch #25 {zzje -> 0x0719, RuntimeException -> 0x0717, blocks: (B:243:0x0531, B:247:0x053a, B:249:0x053e, B:250:0x0549, B:252:0x054f, B:307:0x066b, B:310:0x0672, B:312:0x0676, B:314:0x067e, B:315:0x0681, B:316:0x0684, B:318:0x068a, B:320:0x0693, B:322:0x069d, B:324:0x06a3, B:326:0x06a9, B:333:0x06cb, B:335:0x06d1, B:339:0x06db, B:349:0x06f5, B:346:0x06ee, B:348:0x06f2, B:327:0x06b0, B:330:0x06be, B:331:0x06c6, B:332:0x06c7, B:254:0x055c, B:256:0x0562, B:258:0x0566, B:285:0x0609, B:287:0x0616, B:289:0x0626, B:291:0x062d, B:293:0x0631, B:297:0x063a, B:299:0x0649, B:301:0x064f, B:303:0x0659, B:304:0x065e, B:305:0x0663, B:306:0x0668, B:261:0x0573, B:263:0x0577, B:265:0x0589, B:267:0x0594, B:269:0x059e, B:273:0x05a7, B:275:0x05b1, B:281:0x05bc, B:352:0x06ff, B:356:0x0708), top: B:450:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:303:0x0659 A[Catch: RuntimeException -> 0x0717, zzje -> 0x0719, IOException -> 0x0746, zzwc -> 0x074d, zzhk -> 0x0754, zzat -> 0x075b, zztx -> 0x0771, LOOP:7: B:302:0x0657->B:303:0x0659, LOOP_END, TryCatch #25 {zzje -> 0x0719, RuntimeException -> 0x0717, blocks: (B:243:0x0531, B:247:0x053a, B:249:0x053e, B:250:0x0549, B:252:0x054f, B:307:0x066b, B:310:0x0672, B:312:0x0676, B:314:0x067e, B:315:0x0681, B:316:0x0684, B:318:0x068a, B:320:0x0693, B:322:0x069d, B:324:0x06a3, B:326:0x06a9, B:333:0x06cb, B:335:0x06d1, B:339:0x06db, B:349:0x06f5, B:346:0x06ee, B:348:0x06f2, B:327:0x06b0, B:330:0x06be, B:331:0x06c6, B:332:0x06c7, B:254:0x055c, B:256:0x0562, B:258:0x0566, B:285:0x0609, B:287:0x0616, B:289:0x0626, B:291:0x062d, B:293:0x0631, B:297:0x063a, B:299:0x0649, B:301:0x064f, B:303:0x0659, B:304:0x065e, B:305:0x0663, B:306:0x0668, B:261:0x0573, B:263:0x0577, B:265:0x0589, B:267:0x0594, B:269:0x059e, B:273:0x05a7, B:275:0x05b1, B:281:0x05bc, B:352:0x06ff, B:356:0x0708), top: B:450:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:309:0x0671  */
    /* JADX WARN: Code duplicated, block: B:312:0x0676 A[Catch: RuntimeException -> 0x0717, zzje -> 0x0719, IOException -> 0x0746, zzwc -> 0x074d, zzhk -> 0x0754, zzat -> 0x075b, zztx -> 0x0771, TryCatch #25 {zzje -> 0x0719, RuntimeException -> 0x0717, blocks: (B:243:0x0531, B:247:0x053a, B:249:0x053e, B:250:0x0549, B:252:0x054f, B:307:0x066b, B:310:0x0672, B:312:0x0676, B:314:0x067e, B:315:0x0681, B:316:0x0684, B:318:0x068a, B:320:0x0693, B:322:0x069d, B:324:0x06a3, B:326:0x06a9, B:333:0x06cb, B:335:0x06d1, B:339:0x06db, B:349:0x06f5, B:346:0x06ee, B:348:0x06f2, B:327:0x06b0, B:330:0x06be, B:331:0x06c6, B:332:0x06c7, B:254:0x055c, B:256:0x0562, B:258:0x0566, B:285:0x0609, B:287:0x0616, B:289:0x0626, B:291:0x062d, B:293:0x0631, B:297:0x063a, B:299:0x0649, B:301:0x064f, B:303:0x0659, B:304:0x065e, B:305:0x0663, B:306:0x0668, B:261:0x0573, B:263:0x0577, B:265:0x0589, B:267:0x0594, B:269:0x059e, B:273:0x05a7, B:275:0x05b1, B:281:0x05bc, B:352:0x06ff, B:356:0x0708), top: B:450:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:314:0x067e A[Catch: RuntimeException -> 0x0717, zzje -> 0x0719, IOException -> 0x0746, zzwc -> 0x074d, zzhk -> 0x0754, zzat -> 0x075b, zztx -> 0x0771, TryCatch #25 {zzje -> 0x0719, RuntimeException -> 0x0717, blocks: (B:243:0x0531, B:247:0x053a, B:249:0x053e, B:250:0x0549, B:252:0x054f, B:307:0x066b, B:310:0x0672, B:312:0x0676, B:314:0x067e, B:315:0x0681, B:316:0x0684, B:318:0x068a, B:320:0x0693, B:322:0x069d, B:324:0x06a3, B:326:0x06a9, B:333:0x06cb, B:335:0x06d1, B:339:0x06db, B:349:0x06f5, B:346:0x06ee, B:348:0x06f2, B:327:0x06b0, B:330:0x06be, B:331:0x06c6, B:332:0x06c7, B:254:0x055c, B:256:0x0562, B:258:0x0566, B:285:0x0609, B:287:0x0616, B:289:0x0626, B:291:0x062d, B:293:0x0631, B:297:0x063a, B:299:0x0649, B:301:0x064f, B:303:0x0659, B:304:0x065e, B:305:0x0663, B:306:0x0668, B:261:0x0573, B:263:0x0577, B:265:0x0589, B:267:0x0594, B:269:0x059e, B:273:0x05a7, B:275:0x05b1, B:281:0x05bc, B:352:0x06ff, B:356:0x0708), top: B:450:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:332:0x06c7 A[Catch: RuntimeException -> 0x0717, zzje -> 0x0719, IOException -> 0x0746, zzwc -> 0x074d, zzhk -> 0x0754, zzat -> 0x075b, zztx -> 0x0771, TryCatch #25 {zzje -> 0x0719, RuntimeException -> 0x0717, blocks: (B:243:0x0531, B:247:0x053a, B:249:0x053e, B:250:0x0549, B:252:0x054f, B:307:0x066b, B:310:0x0672, B:312:0x0676, B:314:0x067e, B:315:0x0681, B:316:0x0684, B:318:0x068a, B:320:0x0693, B:322:0x069d, B:324:0x06a3, B:326:0x06a9, B:333:0x06cb, B:335:0x06d1, B:339:0x06db, B:349:0x06f5, B:346:0x06ee, B:348:0x06f2, B:327:0x06b0, B:330:0x06be, B:331:0x06c6, B:332:0x06c7, B:254:0x055c, B:256:0x0562, B:258:0x0566, B:285:0x0609, B:287:0x0616, B:289:0x0626, B:291:0x062d, B:293:0x0631, B:297:0x063a, B:299:0x0649, B:301:0x064f, B:303:0x0659, B:304:0x065e, B:305:0x0663, B:306:0x0668, B:261:0x0573, B:263:0x0577, B:265:0x0589, B:267:0x0594, B:269:0x059e, B:273:0x05a7, B:275:0x05b1, B:281:0x05bc, B:352:0x06ff, B:356:0x0708), top: B:450:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:338:0x06da  */
    /* JADX WARN: Code duplicated, block: B:370:0x072e  */
    /* JADX WARN: Code duplicated, block: B:381:0x0761  */
    /* JADX WARN: Code duplicated, block: B:383:0x0765  */
    /* JADX WARN: Code duplicated, block: B:384:0x0768  */
    /* JADX WARN: Code duplicated, block: B:385:0x076b  */
    /* JADX WARN: Code duplicated, block: B:419:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:421:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:424:0x0808  */
    /* JADX WARN: Code duplicated, block: B:426:0x0814 A[LOOP:9: B:426:0x0814->B:428:0x081e, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:428:0x081e A[LOOP:9: B:426:0x0814->B:428:0x081e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:432:0x0847  */
    /* JADX WARN: Code duplicated, block: B:463:0x0684 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x0681 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:301:0x064f, please report this as an issue */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x071a: MOVE (r11 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:361:0x071a */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        int i2;
        zzje zzjeVar;
        boolean z;
        int i3;
        zzlz zzlzVar;
        zzxc zzxcVar;
        zzlw zzlwVarZzn;
        String str;
        boolean z2;
        boolean z3;
        boolean z4;
        zzlw zzlwVarZzm;
        int i4;
        boolean zZzi;
        boolean z5;
        int i5;
        int i6;
        zzmy[] zzmyVarArr;
        zzmm zzmmVar;
        int i7;
        String str2 = "Playback error";
        try {
            try {
                try {
                    zzd zzdVar = null;
                    try {
                        switch (message.what) {
                            case 1:
                                zzE(message.arg1 != 0, message.arg2 >> 4, true, message.arg2 & 15);
                                z = true;
                                zzC();
                                return z;
                            case 2:
                                z2 = true;
                                boolean z6 = false;
                                try {
                                    long jUptimeMillis = SystemClock.uptimeMillis();
                                    this.zzi.zzk(2);
                                    boolean z7 = this.zzA;
                                    if (!z7) {
                                        zzai();
                                    }
                                    int i8 = this.zzH.zze;
                                    if (i8 != 1 && i8 != 4) {
                                        if (z7) {
                                            zzai();
                                        }
                                        zzlz zzlzVar2 = this.zzs;
                                        zzlw zzlwVarZzm2 = zzlzVar2.zzm();
                                        if (zzlwVarZzm2 != null) {
                                            Trace.beginSection("doSomeWork");
                                            zzL();
                                            if (zzlwVarZzm2.zze) {
                                                this.zzV = zzfk.zzs(SystemClock.elapsedRealtime());
                                                zzlwVarZzm2.zza.zzf(this.zzH.zzs - this.zzn, false);
                                                z3 = true;
                                                z4 = true;
                                                int i9 = 0;
                                                while (true) {
                                                    zzmy[] zzmyVarArr2 = this.zzb;
                                                    if (i9 < 2) {
                                                        zzmy zzmyVar = zzmyVarArr2[i9];
                                                        if (zzmyVar.zzd() == 0) {
                                                            zzN(i9, z6);
                                                            i7 = i9;
                                                        } else {
                                                            int i10 = i9;
                                                            zzmyVar.zzs(this.zzU, this.zzV);
                                                            z3 = z3 && zzmyVar.zzo();
                                                            boolean zZzt = zzmyVar.zzt(zzlwVarZzm2);
                                                            i7 = i10;
                                                            zzN(i7, zZzt);
                                                            z4 = z4 && zZzt;
                                                            if (!zZzt) {
                                                                zzaz(i7);
                                                            }
                                                        }
                                                        i9 = i7 + 1;
                                                        z6 = false;
                                                    }
                                                }
                                            } else {
                                                zzlwVarZzm2.zza.zzc();
                                                z3 = true;
                                                z4 = true;
                                            }
                                            long j = zzlwVarZzm2.zzg.zzf;
                                            long j2 = -9223372036854775807L;
                                            if (z3 && zzlwVarZzm2.zze) {
                                                if (j == -9223372036854775807L || j <= this.zzH.zzs) {
                                                    if (this.zzL) {
                                                        this.zzL = false;
                                                        zzE(false, this.zzH.zzn, false, 5);
                                                    }
                                                    if (zzlwVarZzm2.zzg.zzk) {
                                                        zzB(4);
                                                        zzK();
                                                        j2 = -9223372036854775807L;
                                                    }
                                                }
                                                if (this.zzH.zze == 2) {
                                                    i6 = 0;
                                                    while (true) {
                                                        zzmyVarArr = this.zzb;
                                                        if (i6 < 2) {
                                                            if (zzmyVarArr[i6].zzp(zzlwVarZzm2)) {
                                                                zzaz(i6);
                                                            }
                                                            i6++;
                                                        } else {
                                                            zzmmVar = this.zzH;
                                                            if (!zzmmVar.zzg || zzmmVar.zzr >= 500000 || !zzaG(zzlzVar2.zzk()) || !zzay()) {
                                                                this.zzZ = j2;
                                                            } else if (this.zzZ == j2) {
                                                                this.zzZ = SystemClock.elapsedRealtime();
                                                            } else if (SystemClock.elapsedRealtime() - this.zzZ >= 4000) {
                                                                throw new zzfc(0, 4000);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    this.zzZ = j2;
                                                }
                                                if (zzay() || this.zzH.zze != 3) {
                                                    z5 = false;
                                                } else {
                                                    z5 = true;
                                                }
                                                boolean z8 = this.zzH.zzp;
                                                i5 = this.zzH.zze;
                                                if (i5 != 4 && (z5 || i5 == 2 || (i5 == 3 && this.zzS != 0))) {
                                                    zzQ(jUptimeMillis);
                                                }
                                                Trace.endSection();
                                                z = true;
                                                zzC();
                                                return z;
                                            }
                                            zzmm zzmmVar2 = this.zzH;
                                            if (zzmmVar2.zze != 2) {
                                                j2 = -9223372036854775807L;
                                                z4 = z4;
                                                if (this.zzH.zze == 3) {
                                                    if (this.zzS == 0) {
                                                        if (!zzae()) {
                                                            zzaD(zzay(), false);
                                                            zzB(2);
                                                            if (this.zzM) {
                                                                for (zzlwVarZzm = zzlzVar2.zzm(); zzlwVarZzm != null; zzlwVarZzm = zzlwVarZzm.zzp()) {
                                                                    for (zzaas zzaasVar : zzlwVarZzm.zzr().zzc) {
                                                                    }
                                                                }
                                                                this.zzae.zzc();
                                                            }
                                                            zzK();
                                                        }
                                                    } else if (!z4) {
                                                        zzaD(zzay(), false);
                                                        zzB(2);
                                                        if (this.zzM) {
                                                            while (zzlwVarZzm != null) {
                                                                while (i4 < r7) {
                                                                }
                                                            }
                                                            this.zzae.zzc();
                                                        }
                                                        zzK();
                                                    }
                                                }
                                            } else {
                                                if (this.zzS == 0) {
                                                    zZzi = zzae();
                                                } else if (z4) {
                                                    if (zzmmVar2.zzg) {
                                                        zzlw zzlwVarZzm3 = zzlzVar2.zzm();
                                                        long jZze = zzP(this.zzH.zza, zzlwVarZzm3.zzg.zza) ? this.zzae.zze() : -9223372036854775807L;
                                                        zzlw zzlwVarZzk = zzlzVar2.zzk();
                                                        boolean z9 = zzlwVarZzk.zzd() && zzlwVarZzk.zzg.zzk;
                                                        boolean z10 = zzlwVarZzk.zzg.zza.zzb() && !zzlwVarZzk.zze;
                                                        if (!z9 && !z10) {
                                                            zZzi = this.zzg.zzi(new zzlr(this.zzv, this.zzH.zza, zzlwVarZzm3.zzg.zza, this.zzU - zzlwVarZzm3.zza(), zzav(zzlwVarZzk.zzf()), this.zzo.zzj().zzb, this.zzH.zzl, this.zzM, jZze, this.zzN));
                                                        }
                                                        zzB(3);
                                                        this.zzY = null;
                                                        if (zzay()) {
                                                            zzaD(false, false);
                                                            this.zzo.zza();
                                                            zzJ();
                                                        }
                                                    }
                                                    j2 = -9223372036854775807L;
                                                    zzB(3);
                                                    this.zzY = null;
                                                    if (zzay()) {
                                                        zzaD(false, false);
                                                        this.zzo.zza();
                                                        zzJ();
                                                    }
                                                } else {
                                                    j2 = -9223372036854775807L;
                                                    z4 = z4;
                                                    if (this.zzH.zze == 3) {
                                                        if (this.zzS == 0) {
                                                            if (!zzae()) {
                                                                zzaD(zzay(), false);
                                                                zzB(2);
                                                                if (this.zzM) {
                                                                    while (zzlwVarZzm != null) {
                                                                        while (i4 < r7) {
                                                                        }
                                                                    }
                                                                    this.zzae.zzc();
                                                                }
                                                                zzK();
                                                            }
                                                        } else if (!z4) {
                                                            zzaD(zzay(), false);
                                                            zzB(2);
                                                            if (this.zzM) {
                                                                while (zzlwVarZzm != null) {
                                                                    while (i4 < r7) {
                                                                    }
                                                                }
                                                                this.zzae.zzc();
                                                            }
                                                            zzK();
                                                        }
                                                    }
                                                }
                                                if (zZzi) {
                                                    zzB(3);
                                                    this.zzY = null;
                                                    if (zzay()) {
                                                        zzaD(false, false);
                                                        this.zzo.zza();
                                                        zzJ();
                                                    }
                                                } else if (this.zzH.zze == 3) {
                                                    if (this.zzS == 0) {
                                                        if (!zzae()) {
                                                            zzaD(zzay(), false);
                                                            zzB(2);
                                                            if (this.zzM) {
                                                                while (zzlwVarZzm != null) {
                                                                    while (i4 < r7) {
                                                                    }
                                                                }
                                                                this.zzae.zzc();
                                                            }
                                                            zzK();
                                                        }
                                                    } else if (!z4) {
                                                        zzaD(zzay(), false);
                                                        zzB(2);
                                                        if (this.zzM) {
                                                            while (zzlwVarZzm != null) {
                                                                while (i4 < r7) {
                                                                }
                                                            }
                                                            this.zzae.zzc();
                                                        }
                                                        zzK();
                                                    }
                                                }
                                            }
                                            if (this.zzH.zze == 2) {
                                                i6 = 0;
                                                while (true) {
                                                    zzmyVarArr = this.zzb;
                                                    if (i6 < 2) {
                                                        if (zzmyVarArr[i6].zzp(zzlwVarZzm2)) {
                                                            zzaz(i6);
                                                        }
                                                        i6++;
                                                    } else {
                                                        zzmmVar = this.zzH;
                                                        if (!zzmmVar.zzg) {
                                                            this.zzZ = j2;
                                                        } else {
                                                            this.zzZ = j2;
                                                        }
                                                    }
                                                }
                                            } else {
                                                this.zzZ = j2;
                                            }
                                            if (zzay()) {
                                                z5 = false;
                                            } else {
                                                z5 = false;
                                            }
                                            boolean z11 = this.zzH.zzp;
                                            i5 = this.zzH.zze;
                                            if (i5 != 4) {
                                                zzQ(jUptimeMillis);
                                            }
                                            Trace.endSection();
                                            z = true;
                                            zzC();
                                            return z;
                                        }
                                        zzQ(jUptimeMillis);
                                    }
                                    z = z2;
                                } catch (zzje e) {
                                    e = e;
                                    if (e.zzc == 1 && (zzlwVarZzn = this.zzs.zzn()) != null && e.zzh == null) {
                                        e = e.zzd(zzlwVarZzn.zzg.zza);
                                    }
                                    if (e.zzc == 1 || (zzxcVar = e.zzh) == null) {
                                        zzjeVar = this.zzY;
                                        if (zzjeVar != null) {
                                            zzjeVar.addSuppressed(e);
                                            e = this.zzY;
                                        }
                                        if (e.zzc == 1) {
                                            zzlzVar = this.zzs;
                                            if (zzlzVar.zzm() != zzlzVar.zzn()) {
                                                while (zzlzVar.zzm() != zzlzVar.zzn()) {
                                                    zzlzVar.zzr();
                                                }
                                                zzlw zzlwVarZzm4 = zzlzVar.zzm();
                                                zzlwVarZzm4.getClass();
                                                zzC();
                                                zzlx zzlxVar = zzlwVarZzm4.zzg;
                                                zzxc zzxcVar2 = zzlxVar.zza;
                                                long j3 = zzlxVar.zzb;
                                                this.zzH = zzap(zzxcVar2, j3, zzlxVar.zzd, j3, true, 0);
                                            }
                                        }
                                        if (e.zzi || !(this.zzY == null || (i3 = e.zza) == 5004 || i3 == 5003)) {
                                            zzef.zzf("ExoPlayerImplInternal", str2, e);
                                            z = true;
                                            zzW(true, false);
                                            this.zzH = this.zzH.zzf(e);
                                        } else {
                                            zzef.zzd("ExoPlayerImplInternal", "Recoverable renderer error", e);
                                            if (this.zzY == null) {
                                                this.zzY = e;
                                            }
                                            zzdy zzdyVar = this.zzi;
                                            zzdyVar.zzg(zzdyVar.zzd(25, e));
                                            z = true;
                                        }
                                    } else {
                                        int i11 = e.zze;
                                        zzlz zzlzVar3 = this.zzs;
                                        if (zzlzVar3.zzo() != null && zzlzVar3.zzo().zzg.zza.equals(zzxcVar) && this.zzb[i11].zzq(zzlzVar3.zzo())) {
                                            this.zzac = true;
                                            zzab();
                                            zzlw zzlwVarZzo = zzlzVar3.zzo();
                                            zzlw zzlwVarZzm5 = zzlzVar3.zzm();
                                            if (zzlzVar3.zzm() != zzlwVarZzo) {
                                                while (zzlwVarZzm5 != null && zzlwVarZzm5.zzp() != zzlwVarZzo) {
                                                    zzlwVarZzm5 = zzlwVarZzm5.zzp();
                                                }
                                            }
                                            zzlzVar3.zzs(zzlwVarZzm5);
                                            if (this.zzH.zze != 4) {
                                                zzan();
                                                this.zzi.zzh(2);
                                            }
                                        } else {
                                            zzjeVar = this.zzY;
                                            if (zzjeVar != null) {
                                                zzjeVar.addSuppressed(e);
                                                e = this.zzY;
                                            }
                                            if (e.zzc == 1) {
                                                zzlzVar = this.zzs;
                                                if (zzlzVar.zzm() != zzlzVar.zzn()) {
                                                    while (zzlzVar.zzm() != zzlzVar.zzn()) {
                                                        zzlzVar.zzr();
                                                    }
                                                    zzlw zzlwVarZzm6 = zzlzVar.zzm();
                                                    zzlwVarZzm6.getClass();
                                                    zzC();
                                                    zzlx zzlxVar2 = zzlwVarZzm6.zzg;
                                                    zzxc zzxcVar3 = zzlxVar2.zza;
                                                    long j4 = zzlxVar2.zzb;
                                                    this.zzH = zzap(zzxcVar3, j4, zzlxVar2.zzd, j4, true, 0);
                                                }
                                            }
                                            if (e.zzi) {
                                            }
                                            zzef.zzf("ExoPlayerImplInternal", str2, e);
                                            z = true;
                                            zzW(true, false);
                                            this.zzH = this.zzH.zzf(e);
                                        }
                                        z = true;
                                    }
                                }
                                zzC();
                                return z;
                            case 3:
                                z2 = true;
                                zzR((zzln) message.obj);
                                z = z2;
                                zzC();
                                return z;
                            case 4:
                                z2 = true;
                                zzM((zzav) message.obj);
                                zzal(this.zzo.zzj(), true);
                                z = z2;
                                zzC();
                                return z;
                            case 5:
                                z2 = true;
                                this.zzB = (zznc) message.obj;
                                z = z2;
                                zzC();
                                return z;
                            case 6:
                                z2 = true;
                                zzW(false, true);
                                z = z2;
                                zzC();
                                return z;
                            case 7:
                                zzdr zzdrVar = (zzdr) message.obj;
                                try {
                                    zzX(true, false, true, false);
                                    int i12 = 0;
                                    while (true) {
                                        zzmy[] zzmyVarArr3 = this.zzb;
                                        if (i12 >= 2) {
                                            this.zzg.zzd(this.zzv);
                                            this.zzz.zzd();
                                            this.zze.zzb();
                                            zzB(1);
                                            return true;
                                        }
                                        this.zzc[i12].zzw();
                                        zzmyVarArr3[i12].zzI();
                                        i12++;
                                    }
                                } finally {
                                    this.zzi.zzl(null);
                                    this.zzj.zzb();
                                    zzdrVar.zza();
                                }
                                break;
                            case 8:
                                try {
                                    zzxa zzxaVar = (zzxa) message.obj;
                                    zzlz zzlzVar4 = this.zzs;
                                    if (zzlzVar4.zzd(zzxaVar)) {
                                        zzlw zzlwVarZzk2 = zzlzVar4.zzk();
                                        if (zzlwVarZzk2 == null) {
                                            throw null;
                                        }
                                        zzlw zzlwVar = zzlwVarZzk2;
                                        if (!zzlwVarZzk2.zze) {
                                            float f = this.zzo.zzj().zzb;
                                            zzmm zzmmVar3 = this.zzH;
                                            zzlwVarZzk2.zzh(f, zzmmVar3.zza, zzmmVar3.zzl);
                                        }
                                        zzax(zzlwVarZzk2.zzg.zza, zzlwVarZzk2.zzq(), zzlwVarZzk2.zzr());
                                        if (zzlwVarZzk2 == zzlzVar4.zzm()) {
                                            zzU(zzlwVarZzk2.zzg.zzb, true);
                                            zzaq();
                                            zzlwVarZzk2.zzh = true;
                                            zzmm zzmmVar4 = this.zzH;
                                            try {
                                                zzxc zzxcVar4 = zzmmVar4.zzb;
                                                long j5 = zzlwVarZzk2.zzg.zzb;
                                                z2 = true;
                                                this.zzH = zzap(zzxcVar4, j5, zzmmVar4.zzc, j5, false, 5);
                                            } catch (zzat e2) {
                                                e = e2;
                                                if (e.zzb == 1) {
                                                    i2 = 1000;
                                                } else if (true != e.zza) {
                                                    i2 = 3003;
                                                } else {
                                                    i2 = 3001;
                                                }
                                                zzA(e, i2);
                                                z = true;
                                            } catch (zzhk e3) {
                                                e = e3;
                                                zzA(e, e.zza);
                                                z = true;
                                            } catch (zzje e4) {
                                                e = e4;
                                                if (e.zzc == 1) {
                                                    e = e.zzd(zzlwVarZzn.zzg.zza);
                                                }
                                                if (e.zzc == 1) {
                                                    zzjeVar = this.zzY;
                                                    if (zzjeVar != null) {
                                                        zzjeVar.addSuppressed(e);
                                                        e = this.zzY;
                                                    }
                                                    if (e.zzc == 1) {
                                                        zzlzVar = this.zzs;
                                                        if (zzlzVar.zzm() != zzlzVar.zzn()) {
                                                            while (zzlzVar.zzm() != zzlzVar.zzn()) {
                                                                zzlzVar.zzr();
                                                            }
                                                            zzlw zzlwVarZzm7 = zzlzVar.zzm();
                                                            zzlwVarZzm7.getClass();
                                                            zzC();
                                                            zzlx zzlxVar3 = zzlwVarZzm7.zzg;
                                                            zzxc zzxcVar5 = zzlxVar3.zza;
                                                            long j6 = zzlxVar3.zzb;
                                                            this.zzH = zzap(zzxcVar5, j6, zzlxVar3.zzd, j6, true, 0);
                                                        }
                                                    }
                                                    if (e.zzi) {
                                                    }
                                                    zzef.zzf("ExoPlayerImplInternal", str2, e);
                                                    z = true;
                                                    zzW(true, false);
                                                    this.zzH = this.zzH.zzf(e);
                                                } else {
                                                    zzjeVar = this.zzY;
                                                    if (zzjeVar != null) {
                                                        zzjeVar.addSuppressed(e);
                                                        e = this.zzY;
                                                    }
                                                    if (e.zzc == 1) {
                                                        zzlzVar = this.zzs;
                                                        if (zzlzVar.zzm() != zzlzVar.zzn()) {
                                                            while (zzlzVar.zzm() != zzlzVar.zzn()) {
                                                                zzlzVar.zzr();
                                                            }
                                                            zzlw zzlwVarZzm8 = zzlzVar.zzm();
                                                            zzlwVarZzm8.getClass();
                                                            zzC();
                                                            zzlx zzlxVar4 = zzlwVarZzm8.zzg;
                                                            zzxc zzxcVar6 = zzlxVar4.zza;
                                                            long j7 = zzlxVar4.zzb;
                                                            this.zzH = zzap(zzxcVar6, j7, zzlxVar4.zzd, j7, true, 0);
                                                        }
                                                    }
                                                    if (e.zzi) {
                                                    }
                                                    zzef.zzf("ExoPlayerImplInternal", str2, e);
                                                    z = true;
                                                    zzW(true, false);
                                                    this.zzH = this.zzH.zzf(e);
                                                }
                                            } catch (zztx e5) {
                                                e = e5;
                                                zzA(e, e.zza);
                                                z = true;
                                            } catch (zzwc e6) {
                                                e = e6;
                                                zzA(e, 1002);
                                                z = true;
                                            } catch (IOException e7) {
                                                e = e7;
                                                zzA(e, 2000);
                                                z = true;
                                            } catch (RuntimeException e8) {
                                                e = e8;
                                                if (e instanceof IllegalStateException) {
                                                    i = 1004;
                                                } else {
                                                    i = 1004;
                                                }
                                                zzje zzjeVarZzc = zzje.zzc(e, i);
                                                zzef.zzf("ExoPlayerImplInternal", "Playback error", zzjeVarZzc);
                                                zzW(true, false);
                                                this.zzH = this.zzH.zzf(zzjeVarZzc);
                                                z = true;
                                            }
                                        } else {
                                            z2 = true;
                                        }
                                        zzan();
                                        break;
                                        if (e.zzb == 1) {
                                            i2 = 1000;
                                        } else if (true != e.zza) {
                                            i2 = 3003;
                                        } else {
                                            i2 = 3001;
                                        }
                                        zzA(e, i2);
                                        z = true;
                                        zzC();
                                        return z;
                                    }
                                    z2 = true;
                                    zzlw zzlwVarZzu = zzlzVar4.zzu(zzxaVar);
                                    if (zzlwVarZzu != null) {
                                        zzgsw.zzi(!zzlwVarZzu.zze);
                                        float f2 = this.zzo.zzj().zzb;
                                        zzmm zzmmVar5 = this.zzH;
                                        zzlwVarZzu.zzh(f2, zzmmVar5.zza, zzmmVar5.zzl);
                                        if (zzlzVar4.zze(zzxaVar)) {
                                            zzaj();
                                        }
                                    }
                                    z = z2;
                                } catch (zzat e9) {
                                    e = e9;
                                } catch (zzhk e10) {
                                    e = e10;
                                } catch (zzje e11) {
                                    e = e11;
                                } catch (zztx e12) {
                                    e = e12;
                                } catch (zzwc e13) {
                                    e = e13;
                                } catch (IOException e14) {
                                    e = e14;
                                } catch (RuntimeException e15) {
                                    e = e15;
                                }
                                zzC();
                                return z;
                            case 9:
                                zzxa zzxaVar2 = (zzxa) message.obj;
                                zzlz zzlzVar5 = this.zzs;
                                if (zzlzVar5.zzd(zzxaVar2)) {
                                    zzlzVar5.zzf(this.zzU);
                                    zzan();
                                } else if (zzlzVar5.zze(zzxaVar2)) {
                                    zzaj();
                                }
                                z = true;
                                zzC();
                                return z;
                            case 10:
                                zzad();
                                z = true;
                                zzC();
                                return z;
                            case 11:
                                int i13 = message.arg1;
                                this.zzP = i13;
                                int iZza = this.zzs.zza(this.zzH.zza, i13);
                                if ((iZza & 1) != 0) {
                                    zzI(true);
                                } else if ((iZza & 2) != 0) {
                                    zzab();
                                }
                                zzat(false);
                                z = true;
                                zzC();
                                return z;
                            case 12:
                                boolean z12 = message.arg1 != 0;
                                this.zzQ = z12;
                                int iZzb = this.zzs.zzb(this.zzH.zza, z12);
                                if ((iZzb & 1) != 0) {
                                    zzI(true);
                                } else if ((iZzb & 2) != 0) {
                                    zzab();
                                }
                                zzat(false);
                                z = true;
                                zzC();
                                return z;
                            case 13:
                                boolean z13 = message.arg1 != 0;
                                zzdr zzdrVar2 = (zzdr) message.obj;
                                if (this.zzR != z13) {
                                    this.zzR = z13;
                                    if (!z13) {
                                        zzmy[] zzmyVarArr4 = this.zzb;
                                        for (int i14 = 0; i14 < 2; i14++) {
                                            zzmyVarArr4[i14].zzG();
                                        }
                                    }
                                }
                                if (zzdrVar2 != null) {
                                    zzdrVar2.zza();
                                }
                                z = true;
                                zzC();
                                return z;
                            case 14:
                                zzmq zzmqVar = (zzmq) message.obj;
                                if (zzmqVar.zzf() == this.zzk) {
                                    zzaF(zzmqVar);
                                    int i15 = this.zzH.zze;
                                    if (i15 == 3 || i15 == 2) {
                                        this.zzi.zzh(2);
                                    }
                                } else {
                                    this.zzi.zzd(15, zzmqVar).zza();
                                }
                                z = true;
                                zzC();
                                return z;
                            case 15:
                                final zzmq zzmqVar2 = (zzmq) message.obj;
                                Looper looperZzf = zzmqVar2.zzf();
                                if (looperZzf.getThread().isAlive()) {
                                    this.zzq.zzd(looperZzf, null).zzm(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzlg
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            zzlo.zzz(zzmqVar2);
                                        }
                                    });
                                } else {
                                    zzef.zzc("TAG", "Trying to send message on a dead thread.");
                                    zzmqVar2.zzi(false);
                                }
                                z = true;
                                zzC();
                                return z;
                            case 16:
                                zzal((zzav) message.obj, false);
                                z = true;
                                zzC();
                                return z;
                            case 17:
                                zzli zzliVar = (zzli) message.obj;
                                this.zzI.zza(1);
                                if (zzliVar.zzb() != -1) {
                                    this.zzT = new zzln(new zzms(zzliVar.zza(), zzliVar.zzd()), zzliVar.zzb(), zzliVar.zzc());
                                }
                                zzaf(this.zzt.zzl(zzliVar.zza(), zzliVar.zzd()), false);
                                z = true;
                                zzC();
                                return z;
                            case 18:
                                zzli zzliVar2 = (zzli) message.obj;
                                int iZzc = message.arg1;
                                this.zzI.zza(1);
                                zzml zzmlVar = this.zzt;
                                if (iZzc == -1) {
                                    iZzc = zzmlVar.zzc();
                                }
                                zzaf(zzmlVar.zzm(iZzc, zzliVar2.zza(), zzliVar2.zzd()), false);
                                z = true;
                                zzC();
                                return z;
                            case 19:
                                zzlj zzljVar = (zzlj) message.obj;
                                this.zzI.zza(1);
                                zzml zzmlVar2 = this.zzt;
                                int i16 = zzljVar.zza;
                                int i17 = zzljVar.zzb;
                                int i18 = zzljVar.zzc;
                                zzyx zzyxVar = zzljVar.zzd;
                                zzaf(zzmlVar2.zzo(0, 0, 0, null), false);
                                z = true;
                                zzC();
                                return z;
                            case 20:
                                int i19 = message.arg1;
                                int i20 = message.arg2;
                                zzyx zzyxVar2 = (zzyx) message.obj;
                                this.zzI.zza(1);
                                zzaf(this.zzt.zzn(i19, i20, zzyxVar2), false);
                                z = true;
                                zzC();
                                return z;
                            case 21:
                                zzyx zzyxVar3 = (zzyx) message.obj;
                                this.zzI.zza(1);
                                zzaf(this.zzt.zzp(zzyxVar3), false);
                                z = true;
                                zzC();
                                return z;
                            case 22:
                                zzaf(this.zzt.zzh(), true);
                                z = true;
                                zzC();
                                return z;
                            case 23:
                                this.zzK = message.arg1 != 0;
                                zzak();
                                if (this.zzL) {
                                    zzlz zzlzVar6 = this.zzs;
                                    if (zzlzVar6.zzn() != zzlzVar6.zzm()) {
                                        zzI(true);
                                        zzat(false);
                                    }
                                }
                                z = true;
                                zzC();
                                return z;
                            case 24:
                            default:
                                return false;
                            case 25:
                                zzac();
                                z = true;
                                zzC();
                                return z;
                            case 26:
                                zzac();
                                z = true;
                                zzC();
                                return z;
                            case 27:
                                int i21 = message.arg1;
                                int i22 = message.arg2;
                                List list = (List) message.obj;
                                this.zzI.zza(1);
                                zzaf(this.zzt.zza(i21, i22, list), false);
                                z = true;
                                zzC();
                                return z;
                            case 28:
                                zzjo zzjoVar = (zzjo) message.obj;
                                this.zzaa = zzjoVar;
                                this.zzs.zzc(this.zzH.zza, zzjoVar);
                                z = true;
                                zzC();
                                return z;
                            case 29:
                                this.zzI.zza(1);
                                zzX(false, false, false, true);
                                this.zzg.zza(this.zzv);
                                zzB(true != this.zzH.zza.zzg() ? 2 : 4);
                                zzF();
                                this.zzt.zzd(this.zzh.zze());
                                this.zzi.zzh(2);
                                z = true;
                                zzC();
                                return z;
                            case 30:
                                Pair pair = (Pair) message.obj;
                                Object obj = pair.first;
                                zzdr zzdrVar3 = (zzdr) pair.second;
                                zzmy[] zzmyVarArr5 = this.zzb;
                                for (int i23 = 0; i23 < 2; i23++) {
                                    zzmyVarArr5[i23].zzJ(obj);
                                }
                                int i24 = this.zzH.zze;
                                if (i24 == 3 || i24 == 2) {
                                    this.zzi.zzh(2);
                                }
                                if (zzdrVar3 != null) {
                                    zzdrVar3.zza();
                                }
                                z = true;
                                zzC();
                                return z;
                            case 31:
                                zzd zzdVar2 = (zzd) message.obj;
                                int i25 = message.arg1;
                                this.zze.zze(zzdVar2);
                                zzcd zzcdVar = this.zzz;
                                if (i25 != 0) {
                                    zzdVar = zzdVar2;
                                }
                                zzcdVar.zzb(zzdVar);
                                zzF();
                                z = true;
                                zzC();
                                return z;
                            case 32:
                                zzD(((Float) message.obj).floatValue());
                                z = true;
                                zzC();
                                return z;
                            case 33:
                                int i26 = message.arg1;
                                zzmm zzmmVar6 = this.zzH;
                                zzH(zzmmVar6.zzl, i26, zzmmVar6.zzn, zzmmVar6.zzm);
                                z = true;
                                zzC();
                                return z;
                            case 34:
                                zzD(this.zzad);
                                z = true;
                                zzC();
                                return z;
                            case 35:
                                zzadj zzadjVar = (zzadj) message.obj;
                                zzmy[] zzmyVarArr6 = this.zzb;
                                for (int i27 = 0; i27 < 2; i27++) {
                                    zzmyVarArr6[i27].zzK(zzadjVar);
                                }
                                z = true;
                                zzC();
                                return z;
                            case 36:
                                boolean zBooleanValue = ((Boolean) message.obj).booleanValue();
                                if (!zBooleanValue) {
                                    if (this.zzF != null && this.zzE && !this.zzi.zzb(37)) {
                                        this.zzG++;
                                    }
                                    final int i28 = this.zzG;
                                    if (i28 > 0) {
                                        this.zzx.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlf
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                this.zza.zzv(i28);
                                            }
                                        });
                                    }
                                    this.zzG = 0;
                                    this.zzE = false;
                                    this.zzi.zzk(37);
                                    zzln zzlnVar = this.zzF;
                                    if (zzlnVar != null) {
                                        zzR(zzlnVar);
                                        this.zzF = null;
                                        this.zzE = false;
                                    }
                                }
                                this.zzD = zBooleanValue;
                                zzV();
                                z = true;
                                zzC();
                                return z;
                            case 37:
                                this.zzE = false;
                                zzln zzlnVar2 = this.zzF;
                                if (zzlnVar2 != null) {
                                    zzR(zzlnVar2);
                                    this.zzF = null;
                                }
                                z = true;
                                zzC();
                                return z;
                            case 38:
                                this.zzC = (zznb) message.obj;
                                zzV();
                                z = true;
                                zzC();
                                return z;
                        }
                    } catch (zzje e16) {
                        e = e16;
                        str2 = str;
                    } catch (RuntimeException e17) {
                        e = e17;
                        if ((e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) {
                            i = 1004;
                        } else {
                            i = 1000;
                        }
                        zzje zzjeVarZzc2 = zzje.zzc(e, i);
                        zzef.zzf("ExoPlayerImplInternal", "Playback error", zzjeVarZzc2);
                        zzW(true, false);
                        this.zzH = this.zzH.zzf(zzjeVarZzc2);
                    }
                } catch (RuntimeException e18) {
                    e = e18;
                }
            } catch (zzje e19) {
                e = e19;
            }
        } catch (zzat e20) {
            e = e20;
        } catch (zzhk e21) {
            e = e21;
        } catch (zztx e22) {
            e = e22;
        } catch (zzwc e23) {
            e = e23;
        } catch (IOException e24) {
            e = e24;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zza(float f) {
        this.zzi.zzh(34);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zzb(int i) {
        this.zzi.zze(33, i, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final void zzc(zzav zzavVar) {
        this.zzi.zzd(16, zzavVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzadj
    public final void zzcS(long j, long j2, zzv zzvVar, MediaFormat mediaFormat) {
        if (this.zzE) {
            this.zzi.zzc(37).zza();
        }
    }

    public final void zzd() {
        this.zzi.zzc(29).zza();
    }

    public final void zze(boolean z, int i, int i2) {
        this.zzi.zze(1, z ? 1 : 0, (i2 << 4) | 1).zza();
    }

    public final void zzf(zzbf zzbfVar, int i, long j) {
        this.zzi.zzd(3, new zzln(zzbfVar, i, j)).zza();
    }

    public final void zzg(zznb zznbVar) {
        this.zzi.zzd(38, zznbVar).zza();
    }

    public final void zzh() {
        this.zzi.zzc(6).zza();
    }

    public final void zzi(zzd zzdVar, boolean z) {
        this.zzi.zzf(31, 0, 0, zzdVar).zza();
    }

    public final void zzj(float f) {
        this.zzi.zzd(32, Float.valueOf(f)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzmo
    public final void zzk(zzmq zzmqVar) {
        if (!this.zzJ && this.zzk.getThread().isAlive()) {
            this.zzi.zzd(14, zzmqVar).zza();
        } else {
            zzef.zzc("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzmqVar.zzi(false);
        }
    }

    public final boolean zzl(Object obj, long j) {
        if (this.zzJ || !this.zzk.getThread().isAlive()) {
            return true;
        }
        zzdr zzdrVar = new zzdr(this.zzq);
        this.zzi.zzd(30, new Pair(obj, zzdrVar)).zza();
        if (j != -9223372036854775807L) {
            return zzdrVar.zze(j);
        }
        return true;
    }

    public final boolean zzm() {
        if (this.zzJ || !this.zzk.getThread().isAlive()) {
            return true;
        }
        this.zzJ = true;
        zzdr zzdrVar = new zzdr(this.zzq);
        this.zzi.zzd(7, zzdrVar).zza();
        return zzdrVar.zze(this.zzu);
    }

    public final Looper zzn() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public final void zzo() {
        zzdy zzdyVar = this.zzi;
        zzdyVar.zzk(2);
        zzdyVar.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zzp(zzxa zzxaVar) {
        this.zzi.zzd(8, zzxaVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzq() {
        this.zzi.zzh(10);
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final /* bridge */ /* synthetic */ void zzs(zzyw zzywVar) {
        this.zzi.zzd(9, (zzxa) zzywVar).zza();
    }

    final /* synthetic */ zzlw zzt(zzlx zzlxVar, long j) {
        zzabd zzabdVarZze = this.zzg.zze(this.zzv);
        long j2 = this.zzaa.zzb;
        zzaba zzabaVar = this.zzf;
        zzml zzmlVar = this.zzt;
        return new zzlw(this.zzc, j, this.zze, zzabdVarZze, zzmlVar, zzlxVar, zzabaVar, -9223372036854775807L);
    }

    final /* synthetic */ void zzu(int i, boolean z) {
        this.zzw.zzB(i, this.zzb[i].zze(), z);
    }

    final /* synthetic */ void zzv(int i) {
        this.zzw.zzW(i);
    }

    final /* synthetic */ zzdy zzx() {
        return this.zzi;
    }

    public final void zzy(List list, int i, long j, zzyx zzyxVar) {
        this.zzi.zzd(17, new zzli(list, zzyxVar, i, j, null)).zza();
    }
}
