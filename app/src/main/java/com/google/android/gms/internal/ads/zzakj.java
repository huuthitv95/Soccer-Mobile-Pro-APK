package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzakj implements zzafp {
    public static final /* synthetic */ int zza = 0;
    private final zzes zzb;
    private final zzagm zzc;
    private final zzagi zzd;
    private final zzagk zze;
    private final zzahb zzf;
    private zzafs zzg;
    private zzahb zzh;
    private zzahb zzi;
    private int zzj;
    private zzap zzk;
    private zzap zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private zzakn zzr;
    private boolean zzs;

    static {
        int i = zzakh.zza;
    }

    public zzakj() {
        throw null;
    }

    public zzakj(int i) {
        this.zzb = new zzes(10);
        this.zzc = new zzagm();
        this.zzd = new zzagi();
        this.zzm = -9223372036854775807L;
        this.zze = new zzagk();
        zzafm zzafmVar = new zzafm();
        this.zzf = zzafmVar;
        this.zzi = zzafmVar;
        this.zzp = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080 A[PHI: r19
  0x0080: PHI (r19v7 long) = (r5v0 long), (r5v0 long), (r19v9 long) binds: [B:59:0x013b, B:66:0x0154, B:33:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:54:0x0123  */
    /* JADX WARN: Code duplicated, block: B:57:0x012c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0131  */
    /* JADX WARN: Code duplicated, block: B:61:0x013f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0145  */
    /* JADX WARN: Code duplicated, block: B:65:0x0152  */
    /* JADX WARN: Code duplicated, block: B:67:0x0156  */
    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private final int zzi(zzafq zzafqVar) throws Throwable {
        Throwable th;
        int iZzB;
        zzakp zzakpVarZza;
        zzagi zzagiVar;
        zzakl zzaklVar;
        zzap zzapVar;
        long jZzn;
        long jZzo;
        long jZzb;
        long j;
        int i;
        zzakn zzakeVar;
        long j2;
        long j3;
        int i2;
        int i3;
        zzajk zzajkVar;
        zzakg zzakgVarZze;
        if (this.zzj == 0) {
            try {
                zzk(zzafqVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        long j4 = -9223372036854775807L;
        if (this.zzr == null) {
            zzagm zzagmVar = this.zzc;
            zzes zzesVar = new zzes(zzagmVar.zzc);
            zzafqVar.zzi(zzesVar.zzi(), 0, zzagmVar.zzc);
            int i4 = 21;
            if ((zzagmVar.zza & 1) != 0) {
                if (zzagmVar.zze != 1) {
                    i4 = 36;
                }
            } else if (zzagmVar.zze == 1) {
                i4 = 13;
            }
            th = null;
            if (zzesVar.zze() >= i4 + 4) {
                zzesVar.zzh(i4);
                iZzB = zzesVar.zzB();
                if (iZzB != 1483304551) {
                    if (iZzB == 1231971951) {
                        iZzB = 1231971951;
                    } else if (zzesVar.zze() >= 40) {
                        zzesVar.zzh(36);
                        if (zzesVar.zzB() == 1447187017) {
                            iZzB = 1447187017;
                        } else {
                            iZzB = 0;
                        }
                    } else {
                        iZzB = 0;
                    }
                }
            } else if (zzesVar.zze() >= 40) {
                zzesVar.zzh(36);
                if (zzesVar.zzB() == 1447187017) {
                    iZzB = 1447187017;
                } else {
                    iZzB = 0;
                }
            } else {
                iZzB = 0;
            }
            if (iZzB == 1231971951) {
                zzakpVarZza = zzakp.zza(zzagmVar, zzesVar);
                zzagiVar = this.zzd;
                if (!zzagiVar.zzb() && (i2 = zzakpVarZza.zze) != -1 && (i3 = zzakpVarZza.zzf) != -1) {
                    zzagiVar.zza = i2;
                    zzagiVar.zzb = i3;
                }
                zzaklVar = zzakpVarZza.zzd;
                if (zzaklVar != null) {
                    zzapVar = new zzap(-9223372036854775807L, zzaklVar);
                } else {
                    zzapVar = null;
                }
                this.zzl = zzapVar;
                jZzn = zzafqVar.zzn();
                if (zzafqVar.zzo() != -1) {
                    j2 = zzakpVarZza.zzc;
                    if (j2 != -1) {
                        j3 = j2 + jZzn;
                        if (zzafqVar.zzo() != j3) {
                            long jZzo2 = zzafqVar.zzo();
                            StringBuilder sb = new StringBuilder(String.valueOf(jZzo2).length() + 53 + String.valueOf(j3).length() + 20);
                            sb.append("Data size mismatch between stream (");
                            sb.append(jZzo2);
                            sb.append(") and Xing frame (");
                            sb.append(j3);
                            sb.append("), using Xing value.");
                            zzef.zzb("Mp3Extractor", sb.toString());
                        }
                    }
                }
                zzafqVar.zzf(zzagmVar.zzc);
                if (iZzB == 1483304551) {
                    zzakeVar = zzakq.zze(zzakpVarZza, jZzn);
                } else {
                    jZzo = zzafqVar.zzo();
                    jZzb = zzakpVarZza.zzb();
                    if (jZzb != j4) {
                        zzakeVar = null;
                    } else {
                        j = zzakpVarZza.zzc;
                        if (j != -1) {
                            jZzo = jZzn + j;
                            i = zzakpVarZza.zza.zzc;
                        } else if (jZzo != -1) {
                            j = jZzo - jZzn;
                            i = zzakpVarZza.zza.zzc;
                        } else {
                            zzakeVar = null;
                        }
                        long j5 = j - ((long) i);
                        zzakeVar = new zzake(jZzo, jZzn + ((long) zzakpVarZza.zza.zzc), zzgzt.zza(zzfk.zzv(j5, 8000000L, jZzb, RoundingMode.HALF_UP)), zzgzt.zza(zzgzo.zza(j5, zzakpVarZza.zzb, RoundingMode.HALF_UP)), false);
                    }
                }
            } else if (iZzB != 1447187017) {
                if (iZzB != 1483304551) {
                    zzafqVar.zzl();
                    j4 = -9223372036854775807L;
                } else {
                    zzakpVarZza = zzakp.zza(zzagmVar, zzesVar);
                    zzagiVar = this.zzd;
                    if (!zzagiVar.zzb()) {
                        zzagiVar.zza = i2;
                        zzagiVar.zzb = i3;
                    }
                    zzaklVar = zzakpVarZza.zzd;
                    if (zzaklVar != null) {
                        zzapVar = new zzap(-9223372036854775807L, zzaklVar);
                    } else {
                        zzapVar = null;
                    }
                    this.zzl = zzapVar;
                    jZzn = zzafqVar.zzn();
                    if (zzafqVar.zzo() != -1) {
                        j2 = zzakpVarZza.zzc;
                        if (j2 != -1) {
                            j3 = j2 + jZzn;
                            if (zzafqVar.zzo() != j3) {
                                long jZzo3 = zzafqVar.zzo();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(jZzo3).length() + 53 + String.valueOf(j3).length() + 20);
                                sb2.append("Data size mismatch between stream (");
                                sb2.append(jZzo3);
                                sb2.append(") and Xing frame (");
                                sb2.append(j3);
                                sb2.append("), using Xing value.");
                                zzef.zzb("Mp3Extractor", sb2.toString());
                            }
                        }
                    }
                    zzafqVar.zzf(zzagmVar.zzc);
                    if (iZzB == 1483304551) {
                        zzakeVar = zzakq.zze(zzakpVarZza, jZzn);
                    } else {
                        jZzo = zzafqVar.zzo();
                        jZzb = zzakpVarZza.zzb();
                        if (jZzb != j4) {
                            j = zzakpVarZza.zzc;
                            if (j != -1) {
                                jZzo = jZzn + j;
                                i = zzakpVarZza.zza.zzc;
                            } else if (jZzo != -1) {
                                j = jZzo - jZzn;
                                i = zzakpVarZza.zza.zzc;
                            }
                            long j6 = j - ((long) i);
                            zzakeVar = new zzake(jZzo, jZzn + ((long) zzakpVarZza.zza.zzc), zzgzt.zza(zzfk.zzv(j6, 8000000L, jZzb, RoundingMode.HALF_UP)), zzgzt.zza(zzgzo.zza(j6, zzakpVarZza.zzb, RoundingMode.HALF_UP)), false);
                        }
                    }
                }
                zzakeVar = null;
            } else {
                zzakeVar = zzako.zze(zzafqVar.zzo(), zzafqVar.zzn(), zzagmVar, zzesVar);
                zzagmVar = zzagmVar;
                zzafqVar.zzf(zzagmVar.zzc);
                j4 = -9223372036854775807L;
            }
            zzap zzapVar2 = this.zzk;
            long jZzn2 = zzafqVar.zzn();
            if (zzapVar2 == null || (zzajkVar = (zzajk) zzapVar2.zzc(zzajk.class, zzgta.zza())) == null) {
                zzakgVarZze = null;
            } else {
                zzajm zzajmVar = (zzajm) zzapVar2.zzc(zzajm.class, zzaki.zza);
                zzakgVarZze = zzakg.zze(jZzn2, zzajkVar, zzajmVar == null ? j4 : zzfk.zzs(Long.parseLong((String) zzajmVar.zzb.get(0))));
            }
            if (this.zzs) {
                zzakeVar = new zzakm();
            } else {
                if (zzakgVarZze != null) {
                    zzakeVar = zzakgVarZze;
                } else if (zzakeVar == null) {
                    zzakeVar = null;
                }
                if (zzakeVar == null) {
                    zzes zzesVar2 = this.zzb;
                    zzafqVar.zzi(zzesVar2.zzi(), 0, 4);
                    zzesVar2.zzh(0);
                    zzagmVar.zza(zzesVar2.zzB());
                    zzakeVar = new zzake(zzafqVar.zzo(), zzafqVar.zzn(), zzagmVar, false);
                }
                this.zzh.zzO(zzakeVar.zza());
            }
            this.zzr = zzakeVar;
            this.zzg.zzw(zzakeVar);
            zzap zzapVarZzf = this.zzk;
            if (zzapVarZzf != null) {
                zzap zzapVar3 = this.zzl;
                if (zzapVar3 != null) {
                    zzapVarZzf = zzapVarZzf.zzf(zzapVar3);
                }
            } else {
                zzapVarZzf = this.zzl;
            }
            zzt zztVar = new zzt();
            zztVar.zzn("audio/mpeg");
            zztVar.zzo(zzagmVar.zzb);
            zztVar.zzp(4096);
            zztVar.zzG(zzagmVar.zze);
            zztVar.zzH(zzagmVar.zzd);
            zzagi zzagiVar2 = this.zzd;
            zztVar.zzJ(zzagiVar2.zza);
            zztVar.zzK(zzagiVar2.zzb);
            zztVar.zzl(zzapVarZzf);
            if (this.zzr.zzh() != -2147483647) {
                zztVar.zzi(this.zzr.zzh());
            }
            this.zzi.zzA(zztVar.zzO());
            this.zzo = zzafqVar.zzn();
        } else {
            j4 = -9223372036854775807L;
            th = null;
            long j7 = this.zzo;
            if (j7 != 0) {
                long jZzn3 = zzafqVar.zzn();
                if (jZzn3 < j7) {
                    zzafqVar.zzf((int) (j7 - jZzn3));
                }
            }
        }
        int i5 = this.zzq;
        if (i5 == 0) {
            zzafqVar.zzl();
            if (zzl(zzafqVar)) {
                return -1;
            }
            zzes zzesVar3 = this.zzb;
            zzesVar3.zzh(0);
            int iZzB2 = zzesVar3.zzB();
            if (!zzn(iZzB2, this.zzj) || zzagn.zza(iZzB2) == -1) {
                zzafqVar.zzf(1);
                this.zzj = 0;
                return 0;
            }
            zzagm zzagmVar2 = this.zzc;
            zzagmVar2.zza(iZzB2);
            if (this.zzm == j4) {
                this.zzm = this.zzr.zzf(zzafqVar.zzn());
            }
            i5 = zzagmVar2.zzc;
            this.zzq = i5;
            this.zzp = zzafqVar.zzn() + ((long) i5);
            zzakn zzaknVar = this.zzr;
            if (zzaknVar instanceof zzakf) {
                zzj(this.zzn + ((long) zzagmVar2.zzg));
                throw th;
            }
        }
        int iZza = this.zzi.zza(zzafqVar, i5, true);
        if (iZza == -1) {
            return -1;
        }
        int i6 = this.zzq - iZza;
        this.zzq = i6;
        if (i6 > 0) {
            return 0;
        }
        zzahb zzahbVar = this.zzi;
        long jZzj = zzj(this.zzn);
        zzagm zzagmVar3 = this.zzc;
        zzahbVar.zze(jZzj, 1, zzagmVar3.zzc, 0, null);
        this.zzn += (long) zzagmVar3.zzg;
        this.zzq = 0;
        return 0;
    }

    private final long zzj(long j) {
        return this.zzm + ((j * 1000000) / ((long) this.zzc.zzd));
    }

    private final boolean zzk(zzafq zzafqVar, boolean z) throws IOException {
        int iZzm;
        int i;
        int iZza;
        zzafqVar.zzl();
        if (zzafqVar.zzn() == 0) {
            zzap zzapVarZza = this.zze.zza(zzafqVar, null, 131072);
            this.zzk = zzapVarZza;
            if (zzapVarZza != null) {
                this.zzd.zza(zzapVarZza);
            }
            iZzm = (int) zzafqVar.zzm();
            if (!z) {
                zzafqVar.zzf(iZzm);
            }
            i = 0;
        } else {
            iZzm = 0;
            i = 0;
        }
        int i2 = i;
        int i3 = i2;
        while (true) {
            if (zzl(zzafqVar)) {
                if (i2 > 0) {
                    break;
                }
                zzm();
                throw new EOFException();
            }
            zzes zzesVar = this.zzb;
            zzesVar.zzh(0);
            int iZzB = zzesVar.zzB();
            if ((i == 0 || zzn(iZzB, i)) && (iZza = zzagn.zza(iZzB)) != -1) {
                i2++;
                if (i2 != 1) {
                    if (i2 == 4) {
                        break;
                    }
                } else {
                    this.zzc.zza(iZzB);
                    i = iZzB;
                }
                zzafqVar.zzk(iZza - 4);
            } else {
                int i4 = i3 + 1;
                if (i3 == 131072) {
                    if (z) {
                        return false;
                    }
                    zzm();
                    throw new EOFException();
                }
                if (z) {
                    zzafqVar.zzl();
                    zzafqVar.zzk(iZzm + i4);
                } else {
                    zzafqVar.zzf(1);
                }
                i2 = 0;
                i3 = i4;
                i = 0;
            }
        }
        if (z) {
            zzafqVar.zzf(iZzm + i3);
        } else {
            zzafqVar.zzl();
        }
        this.zzj = i;
        return true;
    }

    private final boolean zzl(zzafq zzafqVar) throws IOException {
        zzakn zzaknVar = this.zzr;
        if (zzaknVar != null) {
            long jZzg = zzaknVar.zzg();
            if (jZzg != -1 && zzafqVar.zzm() > jZzg - 4) {
                return true;
            }
        }
        try {
            return !zzafqVar.zzh(this.zzb.zzi(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final void zzm() {
        zzakn zzaknVar = this.zzr;
        if ((zzaknVar instanceof zzake) && zzaknVar.zzb()) {
            long j = this.zzp;
            if (j == -1 || j == this.zzr.zzg()) {
                return;
            }
            this.zzr = ((zzake) this.zzr).zzi(this.zzp);
            zzafs zzafsVar = this.zzg;
            zzafsVar.getClass();
            zzafsVar.zzw(this.zzr);
            this.zzh.getClass();
            this.zzr.zza();
        }
    }

    private static boolean zzn(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        return zzk(zzafqVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ List zzb() {
        return zzgvz.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zzg = zzafsVar;
        zzahb zzahbVarZzu = zzafsVar.zzu(0, 1);
        this.zzh = zzahbVarZzu;
        this.zzi = zzahbVarZzu;
        this.zzg.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws Throwable {
        this.zzh.getClass();
        String str = zzfk.zza;
        int iZzi = zzi(zzafqVar);
        if (iZzi == -1 && (this.zzr instanceof zzakf)) {
            if (this.zzr.zza() != zzj(this.zzn)) {
                throw null;
            }
        }
        return iZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        this.zzj = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzq = 0;
        this.zzp = -1L;
        zzakn zzaknVar = this.zzr;
        if (zzaknVar instanceof zzakf) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ zzafp zzg() {
        return zzafp.CC.$default$zzg(this);
    }

    public final void zzh() {
        this.zzs = true;
    }
}
