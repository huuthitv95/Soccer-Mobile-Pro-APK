package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzyi implements zzxa, zzafs, zzabn, zzabs, zzys {
    private static final Map zzb;
    private static final zzv zzc;
    private boolean zzA;
    private zzyh zzB;
    private zzags zzC;
    private long zzD;
    private boolean zzE;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private long zzL;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private boolean zzQ;
    private final Uri zzd;
    private final zzhj zze;
    private final zzuf zzf;
    private final zzxm zzg;
    private final zzua zzh;
    private final zzya zzi;
    private final zzabd zzj;
    private final long zzk;
    private final long zzl;
    private final zzxv zzn;
    private zzwz zzs;
    private zzaiw zzt;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;
    private final zzabv zzm = new zzabv("ProgressiveMediaPeriod");
    private final zzdr zzo = new zzdr(zzdo.zza);
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzye
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzD();
        }
    };
    private final Runnable zzq = new Runnable() { // from class: com.google.android.gms.internal.ads.zzyb
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzE();
        }
    };
    private final Handler zzr = zzfk.zzd(null);
    private zzyg[] zzw = new zzyg[0];
    private zzyt[] zzv = new zzyt[0];
    private zzxy[] zzu = new zzxy[0];
    private long zzM = -9223372036854775807L;
    private int zzF = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(map);
        zzt zztVar = new zzt();
        zztVar.zza("icy");
        zztVar.zzo("application/x-icy");
        zzc = zztVar.zzO();
    }

    public zzyi(Uri uri, zzhj zzhjVar, zzxv zzxvVar, zzuf zzufVar, zzua zzuaVar, zzabm zzabmVar, zzxm zzxmVar, zzya zzyaVar, zzabd zzabdVar, String str, int i, boolean z, int i2, zzv zzvVar, long j, zzacb zzacbVar) {
        this.zzd = uri;
        this.zze = zzhjVar;
        this.zzf = zzufVar;
        this.zzh = zzuaVar;
        this.zzg = zzxmVar;
        this.zzi = zzyaVar;
        this.zzj = zzabdVar;
        this.zzk = i;
        this.zzn = zzxvVar;
        this.zzl = j;
    }

    private final void zzR(int i) {
        zzaa();
        zzyh zzyhVar = this.zzB;
        boolean[] zArr = zzyhVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzv zzvVarZza = zzyhVar.zza.zza(i).zza(0);
        this.zzg.zzh(new zzwy(1, zzas.zzf(zzvVarZza.zzp), zzvVarZza, 0, null, zzfk.zzr(this.zzL), -9223372036854775807L));
        zArr[i] = true;
    }

    private final void zzS(int i) {
        zzaa();
        if (this.zzN) {
            if ((!this.zzz || this.zzB.zzb[i]) && !this.zzv[i].zzr(false)) {
                this.zzM = 0L;
                this.zzN = false;
                this.zzH = true;
                this.zzL = 0L;
                this.zzO = 0;
                for (zzyt zzytVar : this.zzv) {
                    zzytVar.zzg(false);
                }
                zzwz zzwzVar = this.zzs;
                zzwzVar.getClass();
                zzwzVar.zzs(this);
            }
        }
    }

    private final boolean zzT() {
        return this.zzH || zzZ();
    }

    private final zzahb zzU(zzyg zzygVar) {
        int length = this.zzv.length;
        for (int i = 0; i < length; i++) {
            if (zzygVar.equals(this.zzw[i])) {
                return this.zzv[i];
            }
        }
        if (this.zzx) {
            int i2 = zzygVar.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i2);
            sb.append(") after finishing tracks.");
            zzef.zzc("ProgressiveMediaPeriod", sb.toString());
            return new zzafm();
        }
        zzyt zzytVar = new zzyt(this.zzj, this.zzf, this.zzh);
        zzxy zzxyVar = new zzxy(zzytVar);
        zzytVar.zzz(this);
        int i3 = length + 1;
        zzyg[] zzygVarArr = (zzyg[]) Arrays.copyOf(this.zzw, i3);
        zzygVarArr[length] = zzygVar;
        String str = zzfk.zza;
        this.zzw = zzygVarArr;
        zzyt[] zzytVarArr = (zzyt[]) Arrays.copyOf(this.zzv, i3);
        zzytVarArr[length] = zzytVar;
        this.zzv = zzytVarArr;
        zzxy[] zzxyVarArr = (zzxy[]) Arrays.copyOf(this.zzu, i3);
        zzxyVarArr[length] = zzxyVar;
        this.zzu = zzxyVarArr;
        return zzxyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final void zzD() {
        int i;
        if (this.zzQ || this.zzy || !this.zzx || this.zzC == null) {
            return;
        }
        for (zzyt zzytVar : this.zzv) {
            if (zzytVar.zzo() == null) {
                return;
            }
        }
        this.zzo.zzb();
        int length = this.zzv.length;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            zzv zzvVarZzo = this.zzv[i4].zzo();
            zzvVarZzo.getClass();
            int iZzf = zzas.zzf(zzvVarZzo.zzp);
            int iZzab = zzab(iZzf);
            int iZzab2 = zzab(i2);
            if (iZzab > iZzab2) {
                i2 = iZzf;
            }
            if (iZzab > iZzab2) {
                i3 = i4;
            }
        }
        zzbg[] zzbgVarArr = new zzbg[length];
        boolean[] zArr = new boolean[length];
        for (int i5 = 0; i5 < length; i5++) {
            zzv zzvVarZzo2 = this.zzv[i5].zzo();
            zzvVarZzo2.getClass();
            String str = zzvVarZzo2.zzp;
            boolean zZza = zzas.zza(str);
            boolean z = zZza || zzas.zzb(str);
            zArr[i5] = z;
            this.zzz = z | this.zzz;
            this.zzA = this.zzl != -9223372036854775807L && length == 1 && zzas.zzc(str);
            zzaiw zzaiwVar = this.zzt;
            if (zzaiwVar != null) {
                if (zZza || this.zzw[i5].zzb) {
                    zzap zzapVar = zzvVarZzo2.zzl;
                    zzap zzapVar2 = zzapVar == null ? new zzap(-9223372036854775807L, zzaiwVar) : zzapVar.zzg(zzaiwVar);
                    zzt zztVarZza = zzvVarZzo2.zza();
                    zztVarZza.zzl(zzapVar2);
                    zzvVarZzo2 = zztVarZza.zzO();
                }
                if (zZza && zzvVarZzo2.zzh == -1 && zzvVarZzo2.zzi == -1 && (i = zzaiwVar.zza) != -1) {
                    zzt zztVarZza2 = zzvVarZzo2.zza();
                    zztVarZza2.zzi(i);
                    zzvVarZzo2 = zztVarZza2.zzO();
                }
            }
            zzv zzvVarZzb = zzvVarZzo2.zzb(this.zzf.zzb(zzvVarZzo2));
            if (i5 != i3) {
                zzt zztVarZza3 = zzvVarZzb.zza();
                zztVarZza3.zzm(Integer.toString(i3));
                zzvVarZzb = zztVarZza3.zzO();
            }
            zzbgVarArr[i5] = new zzbg(Integer.toString(i5), zzvVarZzb);
            this.zzI = zzvVarZzb.zzv | this.zzI;
            this.zzv[i5].zzi(Long.MIN_VALUE);
        }
        this.zzB = new zzyh(new zzzf(zzbgVarArr), zArr);
        if (this.zzA && this.zzD == -9223372036854775807L) {
            this.zzD = this.zzl;
            this.zzC = new zzxw(this, this.zzC);
        }
        this.zzi.zzb(this.zzD, this.zzC, this.zzE);
        this.zzy = true;
        zzwz zzwzVar = this.zzs;
        zzwzVar.getClass();
        zzwzVar.zzp(this);
    }

    private final void zzW() {
        zzxz zzxzVar = new zzxz(this, this.zzd, this.zze, this.zzn, this, this.zzo);
        if (this.zzy) {
            zzgsw.zzi(zzZ());
            long j = this.zzD;
            if (j != -9223372036854775807L && this.zzM > j) {
                this.zzP = true;
                this.zzM = -9223372036854775807L;
                return;
            }
            zzags zzagsVar = this.zzC;
            zzagsVar.getClass();
            zzxzVar.zzd(zzagsVar.zzc(this.zzM).zza.zzc, this.zzM);
            for (zzyt zzytVar : this.zzv) {
                zzytVar.zzh(this.zzM);
            }
            this.zzM = -9223372036854775807L;
        }
        this.zzO = zzX();
        this.zzm.zzd(zzxzVar, this, zzabm.zza(this.zzF));
    }

    private final int zzX() {
        int iZzj = 0;
        for (zzyt zzytVar : this.zzv) {
            iZzj += zzytVar.zzj();
        }
        return iZzj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    private final long zzY(boolean z) {
        int i = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            zzyt[] zzytVarArr = this.zzv;
            if (i >= zzytVarArr.length) {
                return jMax;
            }
            if (z) {
                jMax = Math.max(jMax, zzytVarArr[i].zzp());
            } else {
                zzyh zzyhVar = this.zzB;
                zzyhVar.getClass();
                if (zzyhVar.zzc[i]) {
                    jMax = Math.max(jMax, zzytVarArr[i].zzp());
                }
            }
            i++;
        }
    }

    private final boolean zzZ() {
        return this.zzM != -9223372036854775807L;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzaa() {
        zzgsw.zzi(this.zzy);
        this.zzB.getClass();
        this.zzC.getClass();
    }

    private static int zzab(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final /* bridge */ /* synthetic */ void zzA(zzabr zzabrVar, long j, long j2, boolean z) {
        zzxz zzxzVar = (zzxz) zzabrVar;
        zzig zzigVarZzf = zzxzVar.zzf();
        zzwt zzwtVar = new zzwt(zzxzVar.zze(), zzxzVar.zzh(), zzigVarZzf.zzg(), zzigVarZzf.zzh(), j, j2, zzigVarZzf.zzf());
        zzxzVar.zze();
        this.zzg.zzf(zzwtVar, new zzwy(1, -1, null, 0, null, zzfk.zzr(zzxzVar.zzg()), zzfk.zzr(this.zzD)));
        if (z) {
            return;
        }
        for (zzyt zzytVar : this.zzv) {
            zzytVar.zzg(false);
        }
        if (this.zzJ > 0) {
            zzwz zzwzVar = this.zzs;
            zzwzVar.getClass();
            zzwzVar.zzs(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final /* bridge */ /* synthetic */ void zzB(zzabr zzabrVar, long j, long j2) {
        zzxz zzxzVar = (zzxz) zzabrVar;
        if (this.zzD == -9223372036854775807L && this.zzC != null) {
            long jZzY = zzY(true);
            long j3 = jZzY == Long.MIN_VALUE ? 0L : jZzY + 10000;
            this.zzD = j3;
            this.zzi.zzb(j3, this.zzC, this.zzE);
        }
        zzig zzigVarZzf = zzxzVar.zzf();
        zzwt zzwtVar = new zzwt(zzxzVar.zze(), zzxzVar.zzh(), zzigVarZzf.zzg(), zzigVarZzf.zzh(), j, j2, zzigVarZzf.zzf());
        zzxzVar.zze();
        this.zzg.zze(zzwtVar, new zzwy(1, -1, null, 0, null, zzfk.zzr(zzxzVar.zzg()), zzfk.zzr(this.zzD)));
        this.zzP = true;
        zzwz zzwzVar = this.zzs;
        zzwzVar.getClass();
        zzwzVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final /* bridge */ /* synthetic */ void zzC(zzabr zzabrVar, long j, long j2, int i) {
        zzwt zzwtVar;
        zzxz zzxzVar = (zzxz) zzabrVar;
        zzig zzigVarZzf = zzxzVar.zzf();
        if (i == 0) {
            long jZze = zzxzVar.zze();
            zzhn zzhnVarZzh = zzxzVar.zzh();
            zzwtVar = new zzwt(jZze, zzhnVarZzh, zzhnVarZzh.zza, Collections.EMPTY_MAP, j, 0L, 0L);
        } else {
            zzwtVar = new zzwt(zzxzVar.zze(), zzxzVar.zzh(), zzigVarZzf.zzg(), zzigVarZzf.zzh(), j, j2, zzigVarZzf.zzf());
        }
        this.zzg.zzd(zzwtVar, new zzwy(1, -1, null, 0, null, zzfk.zzr(zzxzVar.zzg()), zzfk.zzr(this.zzD)), i);
    }

    final /* synthetic */ void zzG() {
        this.zzK = true;
    }

    final /* synthetic */ void zzH() {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG();
            }
        });
    }

    final /* synthetic */ long zzI(boolean z) {
        return zzY(true);
    }

    final /* synthetic */ long zzL() {
        return this.zzk;
    }

    final /* synthetic */ Runnable zzM() {
        return this.zzq;
    }

    final /* synthetic */ Handler zzN() {
        return this.zzr;
    }

    final /* synthetic */ zzaiw zzO() {
        return this.zzt;
    }

    final /* synthetic */ void zzP(zzaiw zzaiwVar) {
        this.zzt = zzaiwVar;
    }

    final /* synthetic */ long zzQ() {
        return this.zzD;
    }

    public final void zza() {
        if (this.zzy) {
            for (zzyt zzytVar : this.zzv) {
                zzytVar.zzk();
            }
        }
        this.zzm.zzg(this);
        this.zzr.removeCallbacksAndMessages(null);
        this.zzs = null;
        this.zzQ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzb(zzwz zzwzVar, long j) {
        this.zzs = zzwzVar;
        this.zzo.zza();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzc() throws IOException {
        zzr();
        if (this.zzP && !this.zzy) {
            throw zzat.zzb("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final zzzf zzd() {
        zzaa();
        return this.zzB.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zze(zzaas[] zzaasVarArr, boolean[] zArr, zzyu[] zzyuVarArr, boolean[] zArr2, long j) {
        zzaas zzaasVar;
        zzaa();
        zzyh zzyhVar = this.zzB;
        zzzf zzzfVar = zzyhVar.zza;
        boolean[] zArr3 = zzyhVar.zzc;
        int i = this.zzJ;
        int i2 = 0;
        for (int i3 = 0; i3 < zzaasVarArr.length; i3++) {
            zzyu zzyuVar = zzyuVarArr[i3];
            if (zzyuVar != null && (zzaasVarArr[i3] == null || !zArr[i3])) {
                int iZza = ((zzyf) zzyuVar).zza();
                zzgsw.zzi(zArr3[iZza]);
                this.zzJ--;
                zArr3[iZza] = false;
                zzyuVarArr[i3] = null;
            }
        }
        boolean z = !this.zzG ? j == 0 || this.zzA : i != 0;
        for (int i4 = 0; i4 < zzaasVarArr.length; i4++) {
            if (zzyuVarArr[i4] == null && (zzaasVar = zzaasVarArr[i4]) != null) {
                zzgsw.zzi(zzaasVar.zze() == 1);
                zzgsw.zzi(zzaasVar.zzf(0) == 0);
                int iZzb = zzzfVar.zzb(zzaasVar.zza());
                zzgsw.zzi(!zArr3[iZzb]);
                this.zzJ++;
                zArr3[iZzb] = true;
                this.zzI = zzaasVar.zzc().zzv | this.zzI;
                zzyuVarArr[i4] = new zzyf(this, iZzb);
                zArr2[i4] = true;
                if (!z) {
                    zzyt zzytVar = this.zzv[iZzb];
                    z = (zzytVar.zzn() == 0 || zzytVar.zzu(j, true)) ? false : true;
                }
            }
        }
        if (this.zzJ == 0) {
            this.zzN = false;
            this.zzH = false;
            this.zzI = false;
            zzabv zzabvVar = this.zzm;
            if (zzabvVar.zze()) {
                zzyt[] zzytVarArr = this.zzv;
                int length = zzytVarArr.length;
                while (i2 < length) {
                    zzytVarArr[i2].zzy();
                    i2++;
                }
                zzabvVar.zzf();
            } else {
                this.zzP = false;
                for (zzyt zzytVar2 : this.zzv) {
                    zzytVar2.zzg(false);
                }
            }
        } else if (z) {
            j = zzj(j);
            while (i2 < zzyuVarArr.length) {
                if (zzyuVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.zzG = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzf(long j, boolean z) {
        if (this.zzA) {
            return;
        }
        zzaa();
        if (zzZ()) {
            return;
        }
        boolean[] zArr = this.zzB.zzc;
        int length = this.zzv.length;
        for (int i = 0; i < length; i++) {
            this.zzv[i].zzx(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final void zzg(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzh() {
        if (this.zzI) {
            this.zzI = false;
        } else {
            if (!this.zzH) {
                return -9223372036854775807L;
            }
            if (!this.zzP && zzX() <= this.zzO) {
                return -9223372036854775807L;
            }
            this.zzH = false;
        }
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final long zzi() {
        long jZzY;
        zzaa();
        if (this.zzP || this.zzJ == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzM;
        }
        if (this.zzz) {
            int length = this.zzv.length;
            jZzY = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzyh zzyhVar = this.zzB;
                if (zzyhVar.zzb[i] && zzyhVar.zzc[i] && !this.zzv[i].zzq()) {
                    jZzY = Math.min(jZzY, this.zzv[i].zzp());
                }
            }
        } else {
            jZzY = Long.MAX_VALUE;
        }
        if (jZzY == Long.MAX_VALUE) {
            jZzY = zzY(false);
        }
        return jZzY == Long.MIN_VALUE ? this.zzL : jZzY;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0088 A[LOOP:1: B:38:0x0086->B:39:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d A[LOOP:2: B:43:0x009b->B:44:0x009d, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x0083, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x0094, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzj(long j) {
        zzabv zzabvVar;
        int i;
        zzaa();
        boolean[] zArr = this.zzB.zzb;
        if (true != this.zzC.zzb()) {
            j = 0;
        }
        this.zzH = false;
        long j2 = this.zzL;
        this.zzL = j;
        if (zzZ()) {
            this.zzM = j;
            return j;
        }
        if (this.zzF == 7 || !(this.zzP || this.zzm.zze())) {
            this.zzN = false;
            this.zzM = j;
            this.zzP = false;
            this.zzI = false;
            zzabvVar = this.zzm;
            if (zzabvVar.zze()) {
                zzabvVar.zzc();
                for (zzyt zzytVar : this.zzv) {
                    zzytVar.zzg(false);
                }
                break;
            }
            for (zzyt zzytVar2 : this.zzv) {
                zzytVar2.zzy();
            }
            zzabvVar.zzf();
            return j;
        }
        int length = this.zzv.length;
        for (int i2 = 0; i2 < length; i2++) {
            zzyt zzytVar3 = this.zzv[i2];
            if (this.zzu[i2].zzf() && (zzytVar3.zzn() != 0 || j2 != j)) {
                if (!(this.zzA ? zzytVar3.zzt(zzytVar3.zzm()) : zzytVar3.zzu(j, this.zzP)) && (zArr[i2] || !this.zzz)) {
                    this.zzN = false;
                    this.zzM = j;
                    this.zzP = false;
                    this.zzI = false;
                    zzabvVar = this.zzm;
                    if (zzabvVar.zze()) {
                        zzabvVar.zzc();
                        while (i < r2) {
                            zzytVar.zzg(false);
                        }
                        break;
                        break;
                    }
                    while (i < r3) {
                        zzytVar2.zzy();
                    }
                    zzabvVar.zzf();
                    return j;
                }
            }
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x00db A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzk(long j, zznc zzncVar) {
        long j2;
        boolean z;
        long j3;
        boolean z2;
        zzaa();
        if (!this.zzC.zzb()) {
            return 0L;
        }
        zzagq zzagqVarZzc = this.zzC.zzc(j);
        zzagt zzagtVar = zzagqVarZzc.zza;
        zzagt zzagtVar2 = zzagqVarZzc.zzb;
        long j4 = zzncVar.zzd;
        if (j4 == 0) {
            if (zzncVar.zze == 0) {
                return j;
            }
            j4 = 0;
        }
        String str = zzfk.zza;
        long j5 = j - j4;
        long j6 = Long.MAX_VALUE;
        long j7 = (((j4 ^ j) > 0L ? 1 : ((j4 ^ j) == 0L ? 0 : -1)) >= 0) | (((j ^ j5) > 0L ? 1 : ((j ^ j5) == 0L ? 0 : -1)) >= 0) ? j5 : ((j5 >>> 63) ^ 1) + Long.MAX_VALUE;
        long j8 = Long.MIN_VALUE;
        if (j7 != Long.MIN_VALUE) {
            if (j7 == Long.MAX_VALUE) {
                if (j5 != Long.MAX_VALUE) {
                    j7 = Long.MIN_VALUE;
                } else {
                    j7 = Long.MAX_VALUE;
                }
            }
        } else if (j5 == Long.MIN_VALUE) {
            j5 = Long.MIN_VALUE;
            if (j7 == Long.MAX_VALUE) {
                if (j5 != Long.MAX_VALUE) {
                    j7 = Long.MIN_VALUE;
                } else {
                    j7 = Long.MAX_VALUE;
                }
            }
        } else {
            j7 = Long.MIN_VALUE;
        }
        long j9 = zzncVar.zze;
        long j10 = j + j9;
        long j11 = (((j ^ j10) > 0L ? 1 : ((j ^ j10) == 0L ? 0 : -1)) >= 0) | (((j9 ^ j) > 0L ? 1 : ((j9 ^ j) == 0L ? 0 : -1)) < 0) ? j10 : ((j10 >>> 63) ^ 1) + Long.MAX_VALUE;
        if (j11 == Long.MIN_VALUE) {
            if (j10 == Long.MIN_VALUE) {
            }
            j2 = zzagtVar.zzb;
            if (j7 <= j2 || j2 > j6) {
                z = false;
            } else {
                z = true;
            }
            j3 = zzagtVar2.zzb;
            z2 = j7 > j3 && j3 <= j6;
            if (!z && z2) {
                if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                    return j2;
                }
                return j3;
            }
            if (!z) {
                if (z2) {
                    return j3;
                }
                return j7;
            }
            return j2;
        }
        j8 = j10;
        if (j11 == Long.MAX_VALUE) {
            int i = (j8 > Long.MAX_VALUE ? 1 : (j8 == Long.MAX_VALUE ? 0 : -1));
        } else {
            j6 = j11;
        }
        j2 = zzagtVar.zzb;
        if (j7 <= j2) {
            z = false;
        } else {
            z = false;
        }
        j3 = zzagtVar2.zzb;
        if (j7 > j3) {
        }
        if (!z) {
        }
        if (!z) {
            if (z2) {
                return j3;
            }
            return j7;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final long zzl() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final boolean zzm(zzlu zzluVar) {
        if (this.zzP) {
            return false;
        }
        zzabv zzabvVar = this.zzm;
        if (zzabvVar.zzb() || this.zzN) {
            return false;
        }
        if (this.zzy && this.zzJ == 0) {
            return false;
        }
        boolean zZza = this.zzo.zza();
        if (zzabvVar.zze()) {
            return zZza;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final boolean zzn() {
        return !this.zzP && this.zzm.zze() && this.zzo.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzabs
    public final void zzo() {
        for (zzyt zzytVar : this.zzv) {
            zzytVar.zzf();
        }
        this.zzn.zzb();
    }

    final boolean zzp(int i) {
        return !zzT() && this.zzv[i].zzr(this.zzP);
    }

    final void zzq(int i) throws IOException {
        this.zzv[i].zzl();
        zzr();
    }

    final void zzr() throws IOException {
        this.zzm.zzh(zzabm.zza(this.zzF));
    }

    final int zzs(int i, zzlq zzlqVar, zzip zzipVar, int i2) {
        if (zzT()) {
            return -3;
        }
        zzR(i);
        int iZzs = this.zzv[i].zzs(zzlqVar, zzipVar, i2, this.zzP);
        if (iZzs == -3) {
            zzS(i);
        }
        return iZzs;
    }

    final int zzt(int i, long j) {
        if (zzT()) {
            return 0;
        }
        zzR(i);
        zzyt zzytVar = this.zzv[i];
        int iZzv = zzytVar.zzv(j, this.zzP);
        zzytVar.zzw(iZzv);
        if (iZzv != 0) {
            return iZzv;
        }
        zzS(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final zzahb zzu(int i, int i2) {
        return zzU(new zzyg(i, false));
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final void zzv() {
        this.zzx = true;
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final void zzw(final zzags zzagsVar) {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzF(zzagsVar);
            }
        });
    }

    final zzahb zzx() {
        return zzU(new zzyg(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzy(zzv zzvVar) {
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final /* bridge */ /* synthetic */ zzabp zzz(zzabr zzabrVar, long j, long j2, IOException iOException, int i) {
        long jMin;
        zzabp zzabpVarZza;
        zzags zzagsVar;
        zzxz zzxzVar = (zzxz) zzabrVar;
        zzig zzigVarZzf = zzxzVar.zzf();
        zzwt zzwtVar = new zzwt(zzxzVar.zze(), zzxzVar.zzh(), zzigVarZzf.zzg(), zzigVarZzf.zzh(), j, j2, zzigVarZzf.zzf());
        zzxzVar.zzg();
        String str = zzfk.zza;
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof zzat) || (cause instanceof FileNotFoundException) || (cause instanceof zzhx) || (cause instanceof zzabu) || ((cause instanceof zzhk) && ((zzhk) cause).zza == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            zzabpVarZza = zzabv.zzb;
        } else {
            int iZzX = zzX();
            boolean z = iZzX > this.zzO;
            if (this.zzK || !((zzagsVar = this.zzC) == null || zzagsVar.zza() == -9223372036854775807L)) {
                this.zzO = iZzX;
            } else {
                boolean z2 = this.zzy;
                if (!z2 || zzT()) {
                    this.zzH = z2;
                    this.zzL = 0L;
                    this.zzO = 0;
                    for (zzyt zzytVar : this.zzv) {
                        zzytVar.zzg(false);
                    }
                    zzxzVar.zzd(0L, 0L);
                } else {
                    this.zzN = true;
                    zzabpVarZza = zzabv.zza;
                }
            }
            zzabpVarZza = zzabv.zza(z, jMin);
        }
        boolean zZza = zzabpVarZza.zza();
        this.zzg.zzg(zzwtVar, new zzwy(1, -1, null, 0, null, zzfk.zzr(zzxzVar.zzg()), zzfk.zzr(this.zzD)), iOException, !zZza);
        if (!zZza) {
            zzxzVar.zze();
        }
        return zzabpVarZza;
    }

    final /* synthetic */ void zzE() {
        if (this.zzQ) {
            return;
        }
        zzwz zzwzVar = this.zzs;
        zzwzVar.getClass();
        zzwzVar.zzs(this);
    }

    final /* synthetic */ void zzF(zzags zzagsVar) {
        this.zzC = this.zzt == null ? zzagsVar : new zzagr(-9223372036854775807L, 0L);
        this.zzD = zzagsVar.zza();
        boolean z = false;
        if (!this.zzK && zzagsVar.zza() == -9223372036854775807L) {
            z = true;
        }
        this.zzE = z;
        this.zzF = true == z ? 7 : 1;
        if (this.zzy) {
            this.zzi.zzb(this.zzD, zzagsVar, z);
        } else {
            zzD();
        }
    }
}
