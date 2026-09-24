package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaim implements zzafp {
    private zzafs zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzaiq zzg;
    private zzafq zzh;
    private zzagx zzi;
    private zzalv zzj;
    private final zzes zza = new zzes(2);
    private long zzf = -1;

    private final int zzh(zzafq zzafqVar) throws IOException {
        zzes zzesVar = this.zza;
        zzesVar.zza(2);
        ((zzafg) zzafqVar).zzh(zzesVar.zzi(), 0, 2, false);
        return zzesVar.zzt();
    }

    private final int zzi(zzafq zzafqVar) throws IOException {
        zzes zzesVar = this.zza;
        zzesVar.zza(2);
        zzafqVar.zzi(zzesVar.zzi(), 0, 2);
        return zzesVar.zzt() - 2;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        int iZzi;
        if (zzh(zzafqVar) == 65496) {
            while (true) {
                int iZzh = zzh(zzafqVar);
                this.zzd = iZzh;
                if (iZzh == 65498 || (iZzi = zzi(zzafqVar)) < 0) {
                    break;
                }
                if (this.zzd != 65505) {
                    ((zzafg) zzafqVar).zzj(iZzi, false);
                } else {
                    zzes zzesVar = this.zza;
                    zzesVar.zza(iZzi);
                    ((zzafg) zzafqVar).zzh(zzesVar.zzi(), 0, iZzi, false);
                    if (!Objects.equals(zzesVar.zzM((char) 0), "http://ns.adobe.com/xap/1.0/") ? false : zzaip.zzb(zzesVar.zzM((char) 0))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ List zzb() {
        return zzgvz.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zzb = zzafsVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0117  */
    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        String strZzM;
        zzaio zzaioVarZza;
        zzaiq zzaiqVar;
        long j;
        int i = this.zzc;
        long j2 = -1;
        if (i == 0) {
            zzes zzesVar = this.zza;
            zzesVar.zza(2);
            zzafqVar.zzc(zzesVar.zzi(), 0, 2);
            int iZzt = zzesVar.zzt();
            this.zzd = iZzt;
            if (iZzt == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                } else {
                    zzj();
                }
            } else if ((iZzt < 65488 || iZzt > 65497) && iZzt != 65281) {
                this.zzc = 1;
            }
            return 0;
        }
        if (i == 1) {
            this.zze = zzi(zzafqVar);
            zzafqVar.zzf(2);
            this.zzc = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzafqVar != this.zzh) {
                    this.zzh = zzafqVar;
                    this.zzi = new zzagx(zzafqVar, this.zzf);
                }
                zzalv zzalvVar = this.zzj;
                zzalvVar.getClass();
                int iZzd = zzalvVar.zzd(this.zzi, zzagpVar);
                if (iZzd == 1) {
                    zzagpVar.zza += this.zzf;
                }
                return iZzd;
            }
            long jZzn = zzafqVar.zzn();
            long j3 = this.zzf;
            if (jZzn != j3) {
                zzagpVar.zza = j3;
                return 1;
            }
            if (zzafqVar.zzh(this.zza.zzi(), 0, 1, true)) {
                zzafqVar.zzl();
                if (this.zzj == null) {
                    this.zzj = new zzalv(zzanc.zza, 8);
                }
                zzagx zzagxVar = new zzagx(zzafqVar, this.zzf);
                this.zzi = zzagxVar;
                if (this.zzj.zza(zzagxVar)) {
                    zzalv zzalvVar2 = this.zzj;
                    long j4 = this.zzf;
                    zzafs zzafsVar = this.zzb;
                    zzafsVar.getClass();
                    zzalvVar2.zzc(new zzagz(j4, zzafsVar));
                    zzaiq zzaiqVar2 = this.zzg;
                    zzaiqVar2.getClass();
                    zzafs zzafsVar2 = this.zzb;
                    zzafsVar2.getClass();
                    zzahb zzahbVarZzu = zzafsVar2.zzu(1024, 4);
                    zzt zztVar = new zzt();
                    zztVar.zzn("image/jpeg");
                    zztVar.zzl(new zzap(-9223372036854775807L, zzaiqVar2));
                    zzahbVarZzu.zzA(zztVar.zzO());
                    this.zzc = 5;
                } else {
                    zzj();
                }
            } else {
                zzj();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzes zzesVar2 = new zzes(this.zze);
            zzafqVar.zzc(zzesVar2.zzi(), 0, this.zze);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzesVar2.zzM((char) 0)) && (strZzM = zzesVar2.zzM((char) 0)) != null) {
                long jZzo = zzafqVar.zzo();
                if (jZzo == -1 || (zzaioVarZza = zzaip.zza(strZzM)) == null) {
                    zzaiqVar = null;
                } else {
                    List list = zzaioVarZza.zzb;
                    if (list.size() < 2) {
                        zzaiqVar = null;
                    } else {
                        int size = list.size() - 1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        long j8 = -1;
                        while (size >= 0) {
                            zzain zzainVar = (zzain) list.get(size);
                            String str = zzainVar.zza;
                            long j9 = j2;
                            boolean z = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (size == 0) {
                                jZzo -= zzainVar.zzc;
                                j = 0;
                            } else {
                                j = jZzo - zzainVar.zzb;
                            }
                            long j10 = j;
                            long j11 = jZzo;
                            jZzo = j10;
                            if (z && jZzo != j11) {
                                j8 = j11 - jZzo;
                                j7 = jZzo;
                            }
                            if (size == 0) {
                                j6 = j11;
                            }
                            if (size == 0) {
                                j5 = jZzo;
                            }
                            size--;
                            j2 = j9;
                        }
                        long j12 = j2;
                        if (j7 == j12 || j8 == j12 || j5 == j12 || j6 == j12) {
                            zzaiqVar = null;
                        } else {
                            zzaiqVar = new zzaiq(j5, j6, zzaioVarZza.zza, j7, j8);
                        }
                    }
                }
                this.zzg = zzaiqVar;
                if (zzaiqVar != null) {
                    this.zzf = zzaiqVar.zzd;
                }
            }
        } else {
            zzafqVar.zzf(this.zze);
        }
        this.zzc = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ zzafp zzg() {
        return zzafp.CC.$default$zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzalv zzalvVar = this.zzj;
            zzalvVar.getClass();
            zzalvVar.zze(j, j2);
        }
    }

    private final void zzj() {
        zzafs zzafsVar = this.zzb;
        zzafsVar.getClass();
        zzafsVar.zzv();
        this.zzb.zzw(new zzagr(-9223372036854775807L, 0L));
        this.zzc = 6;
    }
}
