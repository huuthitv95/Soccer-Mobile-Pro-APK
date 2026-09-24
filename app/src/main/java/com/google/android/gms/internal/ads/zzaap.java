package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaap extends zzaai {
    private final boolean zze;
    private final zzaae zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final int zzv;

    /* JADX WARN: Code duplicated, block: B:122:0x0189  */
    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX WARN: Code duplicated, block: B:32:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0053  */
    /* JADX WARN: Code duplicated, block: B:36:0x0057  */
    /* JADX WARN: Code duplicated, block: B:38:0x005d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0064  */
    /* JADX WARN: Code duplicated, block: B:42:0x0068  */
    /* JADX WARN: Code duplicated, block: B:45:0x006e  */
    /* JADX WARN: Code duplicated, block: B:90:0x012f  */
    public zzaap(int i, zzbg zzbgVar, int i2, zzaae zzaaeVar, int i3, String str, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        int iZzj;
        int i6;
        byte b;
        boolean z4;
        int i7;
        float f;
        int i8;
        zzv zzvVar;
        int i9;
        int i10;
        int i11;
        super(i, zzbgVar, i2);
        this.zzf = zzaaeVar;
        int i12 = 1;
        int i13 = true != zzaaeVar.zzM ? 16 : 24;
        boolean z5 = zzaaeVar.zzL;
        if (!z || (((i9 = (zzvVar = this.zzd).zzw) != -1 && i9 > zzaaeVar.zza) || ((i10 = zzvVar.zzx) != -1 && i10 > zzaaeVar.zzb))) {
            z2 = false;
        } else {
            float f2 = zzvVar.zzA;
            if ((f2 == -1.0f || f2 <= zzaaeVar.zzc) && ((i11 = zzvVar.zzj) == -1 || i11 <= zzaaeVar.zzd)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.zze = z2;
        if (z) {
            zzv zzvVar2 = this.zzd;
            int i14 = zzvVar2.zzw;
            if (i14 != -1) {
                int i15 = zzaaeVar.zze;
                if (i14 >= 0) {
                    i7 = zzvVar2.zzx;
                    if (i7 != -1) {
                        int i16 = zzaaeVar.zzf;
                        if (i7 >= 0) {
                            f = zzvVar2.zzA;
                            if (f != -1.0f) {
                                int i17 = zzaaeVar.zzg;
                                if (f >= 0.0f) {
                                    i8 = zzvVar2.zzj;
                                    if (i8 != -1) {
                                        int i18 = zzaaeVar.zzh;
                                        if (i8 >= 0) {
                                            z3 = false;
                                        }
                                    }
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            } else {
                                i8 = zzvVar2.zzj;
                                if (i8 != -1) {
                                    int i19 = zzaaeVar.zzh;
                                    if (i8 >= 0) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            }
                        } else {
                            z3 = false;
                        }
                    } else {
                        f = zzvVar2.zzA;
                        if (f != -1.0f) {
                            int i110 = zzaaeVar.zzg;
                            if (f >= 0.0f) {
                                i8 = zzvVar2.zzj;
                                if (i8 != -1) {
                                    int i111 = zzaaeVar.zzh;
                                    if (i8 >= 0) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            i8 = zzvVar2.zzj;
                            if (i8 != -1) {
                                int i112 = zzaaeVar.zzh;
                                if (i8 >= 0) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        }
                    }
                } else {
                    z3 = false;
                }
            } else {
                i7 = zzvVar2.zzx;
                if (i7 != -1) {
                    int i113 = zzaaeVar.zzf;
                    if (i7 >= 0) {
                        f = zzvVar2.zzA;
                        if (f != -1.0f) {
                            int i114 = zzaaeVar.zzg;
                            if (f >= 0.0f) {
                                i8 = zzvVar2.zzj;
                                if (i8 != -1) {
                                    int i115 = zzaaeVar.zzh;
                                    if (i8 >= 0) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            i8 = zzvVar2.zzj;
                            if (i8 != -1) {
                                int i116 = zzaaeVar.zzh;
                                if (i8 >= 0) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        }
                    } else {
                        z3 = false;
                    }
                } else {
                    f = zzvVar2.zzA;
                    if (f != -1.0f) {
                        int i117 = zzaaeVar.zzg;
                        if (f >= 0.0f) {
                            i8 = zzvVar2.zzj;
                            if (i8 != -1) {
                                int i118 = zzaaeVar.zzh;
                                if (i8 >= 0) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        i8 = zzvVar2.zzj;
                        if (i8 != -1) {
                            int i119 = zzaaeVar.zzh;
                            if (i8 >= 0) {
                                z3 = false;
                            }
                        }
                        z3 = true;
                    }
                }
            }
        } else {
            z3 = false;
        }
        this.zzg = z3;
        this.zzh = zzmw.CC.zzac(i3, false);
        zzv zzvVar3 = this.zzd;
        float f3 = zzvVar3.zzA;
        this.zzi = f3 != -1.0f && f3 >= 10.0f;
        this.zzj = zzvVar3.zzj;
        this.zzk = zzvVar3.zzc();
        int i20 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i20 >= zzaaeVar.zzo.size()) {
                iZzj = 0;
                i20 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzaaq.zzj(this.zzd, (String) zzaaeVar.zzo.get(i20), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i20++;
                }
            }
        }
        this.zzm = i20;
        this.zzn = iZzj;
        int i21 = this.zzd.zzf;
        int i22 = zzaaeVar.zzp;
        this.zzo = zzaaq.zzm(i21, 0);
        int i23 = this.zzd.zzf;
        this.zzq = i23 == 0 || (i23 & 1) != 0;
        this.zzr = zzaaq.zzj(this.zzd, str, zzaaq.zzi(str) == null);
        for (int i24 = 0; i24 < zzaaeVar.zzm.size(); i24++) {
            String str2 = this.zzd.zzp;
            if (str2 != null && str2.equals(zzaaeVar.zzm.get(i24))) {
                i5 = i24;
                break;
            }
        }
        this.zzl = i5;
        this.zzp = zzaaq.zzn(this.zzd, zzaaeVar.zzn);
        this.zzt = (i3 & 384) == 128;
        this.zzu = (i3 & 64) == 64;
        zzv zzvVar4 = this.zzd;
        String str3 = zzvVar4.zzp;
        if (str3 == null) {
            i6 = 0;
        } else {
            i6 = 4;
            switch (str3) {
                case "video/dolby-vision":
                    b = 0;
                    break;
                case "video/av01":
                    b = 1;
                    break;
                case "video/hevc":
                    b = 2;
                    break;
                case "video/avc":
                    b = 4;
                    break;
                case "video/x-vnd.on2.vp9":
                    b = 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                i6 = 5;
            } else if (b != 1) {
                if (b == 2) {
                    i6 = 3;
                } else if (b == 3) {
                    i6 = 2;
                } else if (b != 4) {
                    i6 = 0;
                } else {
                    i6 = 1;
                }
            }
        }
        this.zzv = i6;
        if ((zzvVar4.zzf & 16384) != 0) {
            i12 = 0;
        } else {
            zzaae zzaaeVar2 = this.zzf;
            if (!zzmw.CC.zzac(i3, zzaaeVar2.zzV) || (!(z4 = this.zze) && !zzaaeVar2.zzK)) {
                i12 = 0;
            } else if (zzmw.CC.zzac(i3, false) && this.zzg && z4 && zzvVar4.zzj != -1) {
                boolean z6 = zzaaeVar2.zzG;
                boolean z7 = zzaaeVar2.zzF;
                if ((i13 & i3) != 0) {
                    i12 = 2;
                }
            }
        }
        this.zzs = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(zzaap zzaapVar, zzaap zzaapVar2) {
        zzgvm zzgvmVarZza = zzgvm.zzg().zzd(zzaapVar.zzh, zzaapVar2.zzh).zza(Integer.valueOf(zzaapVar.zzm), Integer.valueOf(zzaapVar2.zzm), zzgxt.zzb().zza()).zzb(zzaapVar.zzn, zzaapVar2.zzn).zzb(zzaapVar.zzo, zzaapVar2.zzo).zza(Integer.valueOf(zzaapVar.zzp), Integer.valueOf(zzaapVar2.zzp), zzgxt.zzb().zza()).zzd(zzaapVar.zzq, zzaapVar2.zzq).zzb(zzaapVar.zzr, zzaapVar2.zzr).zzd(zzaapVar.zzi, zzaapVar2.zzi).zzd(zzaapVar.zze, zzaapVar2.zze).zzd(zzaapVar.zzg, zzaapVar2.zzg).zza(Integer.valueOf(zzaapVar.zzl), Integer.valueOf(zzaapVar2.zzl), zzgxt.zzb().zza());
        boolean z = zzaapVar.zzt;
        zzgvm zzgvmVarZzd = zzgvmVarZza.zzd(z, zzaapVar2.zzt);
        boolean z2 = zzaapVar.zzu;
        zzgvm zzgvmVarZzd2 = zzgvmVarZzd.zzd(z2, zzaapVar2.zzu);
        if (z && z2) {
            zzgvmVarZzd2 = zzgvmVarZzd2.zzb(zzaapVar.zzv, zzaapVar2.zzv);
        }
        return zzgvmVarZzd2.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(zzaap zzaapVar, zzaap zzaapVar2) {
        zzgxt zzgxtVarZza = (zzaapVar.zze && zzaapVar.zzh) ? zzaaq.zzc : zzaaq.zzc.zza();
        zzgvm zzgvmVarZzg = zzgvm.zzg();
        boolean z = zzaapVar.zzf.zzF;
        return zzgvmVarZzg.zza(Integer.valueOf(zzaapVar.zzk), Integer.valueOf(zzaapVar2.zzk), zzgxtVarZza).zza(Integer.valueOf(zzaapVar.zzj), Integer.valueOf(zzaapVar2.zzj), zzgxtVarZza).zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final int zza() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final /* bridge */ /* synthetic */ boolean zzc(zzaai zzaaiVar) {
        zzaap zzaapVar = (zzaap) zzaaiVar;
        if (!Objects.equals(this.zzd.zzp, zzaapVar.zzd.zzp)) {
            return false;
        }
        boolean z = this.zzf.zzN;
        return this.zzt == zzaapVar.zzt && this.zzu == zzaapVar.zzu;
    }
}
