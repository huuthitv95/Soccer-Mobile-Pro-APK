package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzapz implements zzapm {
    private String zzf;
    private zzahb zzg;
    private boolean zzj;
    private int zzl;
    private int zzm;
    private int zzo;
    private int zzp;
    private int zzt;
    private boolean zzv;
    private final String zza = "video/mp2t";
    private int zze = 0;
    private final zzes zzb = new zzes(new byte[15], 2);
    private final zzer zzc = new zzer();
    private final zzes zzd = new zzes();
    private final zzaqa zzq = new zzaqa();
    private int zzr = -2147483647;
    private int zzs = -1;
    private long zzu = -1;
    private boolean zzk = true;
    private boolean zzn = true;
    private double zzh = -9.223372036854776E18d;
    private double zzi = -9.223372036854776E18d;

    public zzapz(String str) {
    }

    private static final void zzf(zzes zzesVar, zzes zzesVar2, boolean z) {
        int iZzg = zzesVar.zzg();
        int iMin = Math.min(zzesVar.zzd(), zzesVar2.zzd());
        zzesVar.zzm(zzesVar2.zzi(), zzesVar2.zzg(), iMin);
        zzesVar2.zzk(iMin);
        if (z) {
            zzesVar.zzh(iZzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        this.zze = 0;
        this.zzm = 0;
        this.zzb.zza(2);
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = -2147483647;
        this.zzs = -1;
        this.zzt = 0;
        this.zzu = -1L;
        this.zzv = false;
        this.zzj = false;
        this.zzn = true;
        this.zzk = true;
        this.zzh = -9.223372036854776E18d;
        this.zzi = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        this.zzf = zzaraVar.zzc();
        this.zzg = zzafsVar.zzu(zzaraVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        this.zzl = i;
        if (!this.zzk && (this.zzp != 0 || !this.zzn)) {
            this.zzj = true;
        }
        if (j != -9223372036854775807L) {
            double d = j;
            if (this.zzj) {
                this.zzi = d;
            } else {
                this.zzh = d;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzd(zzes zzesVar) throws zzat {
        int i;
        this.zzg.getClass();
        while (zzesVar.zzd() > 0) {
            int i2 = this.zze;
            int iZzj = 0;
            if (i2 == 0) {
                int i3 = this.zzl;
                if ((i3 & 2) != 0) {
                    if ((i3 & 4) == 0) {
                        while (zzesVar.zzd() > 0) {
                            int i4 = this.zzm << 8;
                            this.zzm = i4;
                            int iZzs = i4 | zzesVar.zzs();
                            this.zzm = iZzs;
                            if ((iZzs & ViewCompat.MEASURED_SIZE_MASK) == 12583333) {
                                zzesVar.zzh(zzesVar.zzg() - 3);
                                this.zzm = 0;
                            }
                        }
                    }
                    this.zze = 1;
                    break;
                }
                zzesVar.zzh(zzesVar.zze());
            } else if (i2 != 1) {
                zzaqa zzaqaVar = this.zzq;
                int i5 = zzaqaVar.zza;
                if (i5 == 1 || i5 == 17) {
                    zzf(zzesVar, this.zzd, true);
                }
                int iMin = Math.min(zzesVar.zzd(), zzaqaVar.zzc - this.zzo);
                this.zzg.zzc(zzesVar, iMin);
                int i6 = this.zzo + iMin;
                this.zzo = i6;
                if (i6 == zzaqaVar.zzc) {
                    int i7 = zzaqaVar.zza;
                    if (i7 == 1) {
                        byte[] bArrZzi = this.zzd.zzi();
                        zzaqb zzaqbVarZzb = zzaqc.zzb(new zzer(bArrZzi, bArrZzi.length));
                        this.zzr = zzaqbVarZzb.zzb;
                        this.zzs = zzaqbVarZzb.zzc;
                        long j = this.zzu;
                        long j2 = zzaqaVar.zzb;
                        if (j != j2) {
                            this.zzu = j2;
                            int i8 = zzaqbVarZzb.zza;
                            String strConcat = "mhm1";
                            if (i8 != -1) {
                                String str = String.format(".%02X", Integer.valueOf(i8));
                                String.valueOf(str);
                                strConcat = "mhm1".concat(String.valueOf(str));
                            }
                            byte[] bArr = zzaqbVarZzb.zzd;
                            zzgvz zzgvzVarZzk = null;
                            if (bArr != null && bArr.length > 0) {
                                zzgvzVarZzk = zzgvz.zzk(zzfk.zzb, bArr);
                            }
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzf);
                            zztVar.zzn(this.zza);
                            zztVar.zzo("audio/mhm1");
                            zztVar.zzH(this.zzr);
                            zztVar.zzk(strConcat);
                            zztVar.zzr(zzgvzVarZzk);
                            this.zzg.zzA(zztVar.zzO());
                        }
                        this.zzv = true;
                    } else if (i7 == 17) {
                        byte[] bArrZzi2 = this.zzd.zzi();
                        zzer zzerVar = new zzer(bArrZzi2, bArrZzi2.length);
                        if (zzerVar.zzi()) {
                            zzerVar.zzh(2);
                            iZzj = zzerVar.zzj(13);
                        }
                        this.zzt = iZzj;
                    } else if (i7 == 2) {
                        if (this.zzv) {
                            this.zzk = false;
                            i = 1;
                        } else {
                            i = 0;
                        }
                        int i9 = this.zzs - this.zzt;
                        double d = this.zzr;
                        long jRound = Math.round(this.zzh);
                        if (this.zzj) {
                            this.zzj = false;
                            this.zzh = this.zzi;
                        } else {
                            this.zzh += (((double) i9) * 1000000.0d) / d;
                        }
                        this.zzg.zze(jRound, i, this.zzp, 0, null);
                        this.zzv = false;
                        this.zzt = 0;
                        this.zzp = 0;
                    }
                    this.zze = 1;
                }
            } else {
                zzes zzesVar2 = this.zzb;
                zzf(zzesVar, zzesVar2, false);
                if (zzesVar2.zzd() == 0) {
                    zzer zzerVar2 = this.zzc;
                    int iZze = zzesVar2.zze();
                    zzerVar2.zzb(zzesVar2.zzi(), iZze);
                    zzaqa zzaqaVar2 = this.zzq;
                    if (zzaqc.zza(zzerVar2, zzaqaVar2)) {
                        this.zzo = 0;
                        this.zzp += zzaqaVar2.zzc + iZze;
                        zzesVar2.zzh(0);
                        this.zzg.zzc(zzesVar2, zzesVar2.zze());
                        zzesVar2.zza(2);
                        this.zzd.zza(zzaqaVar2.zzc);
                        this.zzn = true;
                        this.zze = 2;
                    } else if (zzesVar2.zze() < 15) {
                        zzesVar2.zzf(zzesVar2.zze() + 1);
                    }
                }
                this.zzn = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
    }
}
