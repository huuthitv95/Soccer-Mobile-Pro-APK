package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzapx implements zzapm {
    private final String zza;
    private final int zzb;
    private final String zzc = "video/mp2t";
    private final zzes zzd;
    private final zzer zze;
    private zzahb zzf;
    private String zzg;
    private zzv zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private String zzw;

    public zzapx(String str, int i, String str2) {
        this.zza = str;
        this.zzb = i;
        zzes zzesVar = new zzes(1024);
        this.zzd = zzesVar;
        byte[] bArrZzi = zzesVar.zzi();
        this.zze = new zzer(bArrZzi, bArrZzi.length);
        this.zzm = -9223372036854775807L;
    }

    private final int zzf(zzer zzerVar) throws zzat {
        int iZzc = zzerVar.zzc();
        zzaen zzaenVarZzb = zzaeo.zzb(zzerVar, true);
        this.zzw = zzaenVarZzb.zzc;
        this.zzt = zzaenVarZzb.zza;
        this.zzv = zzaenVarZzb.zzb;
        return iZzc - zzerVar.zzc();
    }

    private static long zzg(zzer zzerVar) {
        return zzerVar.zzj((zzerVar.zzj(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        this.zzi = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        this.zzf = zzafsVar.zzu(zzaraVar.zzb(), 1);
        this.zzg = zzaraVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzd(zzes zzesVar) throws zzat {
        int i;
        int i2;
        int iZzj;
        boolean zZzi;
        this.zzf.getClass();
        while (zzesVar.zzd() > 0) {
            int i3 = this.zzi;
            if (i3 != 0) {
                if (i3 == 1) {
                    int iZzs = zzesVar.zzs();
                    if ((iZzs & 224) == 224) {
                        this.zzl = iZzs;
                        this.zzi = 2;
                    } else if (iZzs != 86) {
                        this.zzi = 0;
                    }
                } else if (i3 != 2) {
                    int iMin = Math.min(zzesVar.zzd(), this.zzk - this.zzj);
                    zzer zzerVar = this.zze;
                    zzesVar.zzm(zzerVar.zza, this.zzj, iMin);
                    int i4 = this.zzj + iMin;
                    this.zzj = i4;
                    if (i4 == this.zzk) {
                        zzerVar.zzf(0);
                        if (zzerVar.zzi()) {
                            if (this.zzn) {
                            }
                            this.zzi = 0;
                        } else {
                            this.zzn = true;
                            int iZzj2 = zzerVar.zzj(1);
                            if (iZzj2 == 1) {
                                iZzj = zzerVar.zzj(1);
                                i2 = 1;
                            } else {
                                i2 = iZzj2;
                                iZzj = 0;
                            }
                            this.zzo = iZzj;
                            if (iZzj != 0) {
                                throw zzat.zzb(null, null);
                            }
                            if (i2 == 1) {
                                zzg(zzerVar);
                                i2 = 1;
                            }
                            if (!zzerVar.zzi()) {
                                throw zzat.zzb(null, null);
                            }
                            this.zzp = zzerVar.zzj(6);
                            int iZzj3 = zzerVar.zzj(4);
                            int iZzj4 = zzerVar.zzj(3);
                            if (iZzj3 != 0 || iZzj4 != 0) {
                                throw zzat.zzb(null, null);
                            }
                            if (i2 == 0) {
                                int iZzd = zzerVar.zzd();
                                int iZzf = zzf(zzerVar);
                                zzerVar.zzf(iZzd);
                                byte[] bArr = new byte[(iZzf + 7) / 8];
                                zzerVar.zzl(bArr, 0, iZzf);
                                zzt zztVar = new zzt();
                                zztVar.zza(this.zzg);
                                zztVar.zzn(this.zzc);
                                zztVar.zzo("audio/mp4a-latm");
                                zztVar.zzk(this.zzw);
                                zztVar.zzG(this.zzv);
                                zztVar.zzH(this.zzt);
                                zztVar.zzr(Collections.singletonList(bArr));
                                zztVar.zze(this.zza);
                                zztVar.zzg(this.zzb);
                                zzv zzvVarZzO = zztVar.zzO();
                                if (!zzvVarZzO.equals(this.zzh)) {
                                    this.zzh = zzvVarZzO;
                                    this.zzu = 1024000000 / ((long) zzvVarZzO.zzI);
                                    this.zzf.zzA(zzvVarZzO);
                                }
                            } else {
                                zzerVar.zzh(((int) zzg(zzerVar)) - zzf(zzerVar));
                            }
                            int iZzj5 = zzerVar.zzj(3);
                            this.zzq = iZzj5;
                            if (iZzj5 == 0) {
                                zzerVar.zzh(8);
                            } else if (iZzj5 == 1) {
                                zzerVar.zzh(9);
                            } else if (iZzj5 == 3 || iZzj5 == 4 || iZzj5 == 5) {
                                zzerVar.zzh(6);
                            } else {
                                if (iZzj5 != 6 && iZzj5 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzerVar.zzh(1);
                            }
                            boolean zZzi2 = zzerVar.zzi();
                            this.zzr = zZzi2;
                            this.zzs = 0L;
                            if (zZzi2) {
                                if (i2 != 1) {
                                    do {
                                        zZzi = zzerVar.zzi();
                                        this.zzs = (this.zzs << 8) + ((long) zzerVar.zzj(8));
                                    } while (zZzi);
                                } else {
                                    this.zzs = zzg(zzerVar);
                                }
                            }
                            if (zzerVar.zzi()) {
                                zzerVar.zzh(8);
                            }
                        }
                        if (this.zzo != 0) {
                            throw zzat.zzb(null, null);
                        }
                        if (this.zzp != 0) {
                            throw zzat.zzb(null, null);
                        }
                        if (this.zzq != 0) {
                            throw zzat.zzb(null, null);
                        }
                        int i5 = 0;
                        while (true) {
                            int iZzj6 = zzerVar.zzj(8);
                            i = i5 + iZzj6;
                            if (iZzj6 != 255) {
                                break;
                            } else {
                                i5 = i;
                            }
                        }
                        int iZzd2 = zzerVar.zzd();
                        if ((iZzd2 & 7) == 0) {
                            this.zzd.zzh(iZzd2 >> 3);
                        } else {
                            zzes zzesVar2 = this.zzd;
                            zzerVar.zzl(zzesVar2.zzi(), 0, i * 8);
                            zzesVar2.zzh(0);
                        }
                        this.zzf.zzc(this.zzd, i);
                        zzgsw.zzi(this.zzm != -9223372036854775807L);
                        this.zzf.zze(this.zzm, 1, i, 0, null);
                        this.zzm += this.zzu;
                        if (this.zzr) {
                            zzerVar.zzh((int) this.zzs);
                        }
                        this.zzi = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iZzs2 = ((this.zzl & (-225)) << 8) | zzesVar.zzs();
                    this.zzk = iZzs2;
                    zzes zzesVar3 = this.zzd;
                    if (iZzs2 > zzesVar3.zzi().length) {
                        zzesVar3.zza(iZzs2);
                        zzer zzerVar2 = this.zze;
                        byte[] bArrZzi = zzesVar3.zzi();
                        zzerVar2.zzb(bArrZzi, bArrZzi.length);
                    }
                    this.zzj = 0;
                    this.zzi = 3;
                }
            } else if (zzesVar.zzs() == 86) {
                this.zzi = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
    }
}
