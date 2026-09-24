package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzapk implements zzapm {
    private final zzes zza;
    private final String zzc;
    private final int zzd;
    private String zzf;
    private zzahb zzg;
    private int zzi;
    private int zzj;
    private long zzk;
    private zzv zzl;
    private int zzm;
    private int zzn;
    private int zzh = 0;
    private long zzq = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzo = -1;
    private int zzp = -1;
    private final String zze = "video/mp2t";

    public zzapk(String str, int i, int i2, String str2) {
        this.zza = new zzes(new byte[i2]);
        this.zzc = str;
        this.zzd = i;
    }

    private final boolean zzf(zzes zzesVar, byte[] bArr, int i) {
        int iMin = Math.min(zzesVar.zzd(), i - this.zzi);
        zzesVar.zzm(bArr, this.zzi, iMin);
        int i2 = this.zzi + iMin;
        this.zzi = i2;
        return i2 == i;
    }

    @RequiresNonNull({"output"})
    private final void zzg(zzafn zzafnVar) {
        int i;
        int i2 = zzafnVar.zzb;
        if (i2 == -2147483647 || (i = zzafnVar.zzc) == -1) {
            return;
        }
        zzv zzvVar = this.zzl;
        if (zzvVar != null && i == zzvVar.zzH && i2 == zzvVar.zzI && Objects.equals(zzafnVar.zza, zzvVar.zzp)) {
            return;
        }
        zzv zzvVar2 = this.zzl;
        zzt zztVar = zzvVar2 == null ? new zzt() : zzvVar2.zza();
        zztVar.zza(this.zzf);
        zztVar.zzn(this.zze);
        zztVar.zzo(zzafnVar.zza);
        zztVar.zzG(i);
        zztVar.zzH(i2);
        zztVar.zze(this.zzc);
        zztVar.zzg(this.zzd);
        zzv zzvVarZzO = zztVar.zzO();
        this.zzl = zzvVarZzO;
        this.zzg.zzA(zzvVarZzO);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzq = -9223372036854775807L;
        this.zzb.set(0);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        this.zzf = zzaraVar.zzc();
        this.zzg = zzafsVar.zzu(zzaraVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        this.zzq = j;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzd(zzes zzesVar) throws zzat {
        int i;
        byte b;
        int i2;
        byte b2;
        this.zzg.getClass();
        while (zzesVar.zzd() > 0) {
            int i3 = this.zzh;
            if (i3 == 0) {
                while (zzesVar.zzd() > 0) {
                    int i4 = this.zzj << 8;
                    this.zzj = i4;
                    int iZzs = i4 | zzesVar.zzs();
                    this.zzj = iZzs;
                    int iZza = zzafo.zza(iZzs);
                    this.zzn = iZza;
                    if (iZza != 0) {
                        byte[] bArrZzi = this.zza.zzi();
                        int i5 = this.zzj;
                        bArrZzi[0] = (byte) ((i5 >> 24) & 255);
                        bArrZzi[1] = (byte) ((i5 >> 16) & 255);
                        bArrZzi[2] = (byte) ((i5 >> 8) & 255);
                        bArrZzi[3] = (byte) (i5 & 255);
                        this.zzi = 4;
                        this.zzj = 0;
                        int i6 = this.zzn;
                        if (i6 != 3 && i6 != 4) {
                            if (i6 != 1) {
                                this.zzh = 2;
                                break;
                            } else {
                                this.zzh = 1;
                                break;
                            }
                        }
                        this.zzh = 4;
                        break;
                    }
                }
            } else if (i3 == 1) {
                zzes zzesVar2 = this.zza;
                if (zzf(zzesVar, zzesVar2.zzi(), 18)) {
                    byte[] bArrZzi2 = zzesVar2.zzi();
                    if (this.zzl == null) {
                        zzv zzvVarZzb = zzafo.zzb(bArrZzi2, this.zzf, this.zzc, this.zzd, this.zze, null);
                        this.zzl = zzvVarZzb;
                        this.zzg.zzA(zzvVarZzb);
                    }
                    this.zzm = zzafo.zzc(bArrZzi2);
                    byte b3 = bArrZzi2[0];
                    if (b3 != -2) {
                        if (b3 == -1) {
                            i = (bArrZzi2[4] & 7) << 4;
                            b2 = bArrZzi2[7];
                        } else if (b3 != 31) {
                            i = (bArrZzi2[4] & 1) << 6;
                            b = bArrZzi2[5];
                        } else {
                            i = (bArrZzi2[5] & 7) << 4;
                            b2 = bArrZzi2[6];
                        }
                        i2 = b2 & 60;
                        this.zzk = zzgzt.zza(zzfk.zzt(((i | (i2 >> 2)) + 1) * 32, this.zzl.zzI));
                        zzesVar2.zzh(0);
                        this.zzg.zzc(zzesVar2, 18);
                        this.zzh = 6;
                    } else {
                        i = (bArrZzi2[5] & 1) << 6;
                        b = bArrZzi2[4];
                    }
                    i2 = b & 252;
                    this.zzk = zzgzt.zza(zzfk.zzt(((i | (i2 >> 2)) + 1) * 32, this.zzl.zzI));
                    zzesVar2.zzh(0);
                    this.zzg.zzc(zzesVar2, 18);
                    this.zzh = 6;
                }
            } else if (i3 != 2) {
                if (i3 == 3) {
                    zzes zzesVar3 = this.zza;
                    if (zzf(zzesVar, zzesVar3.zzi(), this.zzo)) {
                        zzafn zzafnVarZzd = zzafo.zzd(zzesVar3.zzi());
                        zzg(zzafnVarZzd);
                        this.zzm = zzafnVarZzd.zzd;
                        long j = zzafnVarZzd.zze;
                        this.zzk = j != -9223372036854775807L ? j : 0L;
                        zzesVar3.zzh(0);
                        this.zzg.zzc(zzesVar3, this.zzo);
                        this.zzh = 6;
                    }
                } else if (i3 == 4) {
                    zzes zzesVar4 = this.zza;
                    if (zzf(zzesVar, zzesVar4.zzi(), 6)) {
                        int iZzg = zzafo.zzg(zzesVar4.zzi());
                        this.zzp = iZzg;
                        int i7 = this.zzi;
                        if (i7 > iZzg) {
                            int i8 = i7 - iZzg;
                            this.zzi = i7 - i8;
                            zzesVar.zzh(zzesVar.zzg() - i8);
                        }
                        this.zzh = 5;
                    }
                } else if (i3 != 5) {
                    int iMin = Math.min(zzesVar.zzd(), this.zzm - this.zzi);
                    this.zzg.zzc(zzesVar, iMin);
                    int i9 = this.zzi + iMin;
                    this.zzi = i9;
                    if (i9 == this.zzm) {
                        zzgsw.zzi(this.zzq != -9223372036854775807L);
                        this.zzg.zze(this.zzq, this.zzn == 4 ? 0 : 1, this.zzm, 0, null);
                        this.zzq += this.zzk;
                        this.zzh = 0;
                    }
                } else {
                    zzes zzesVar5 = this.zza;
                    if (zzf(zzesVar, zzesVar5.zzi(), this.zzp)) {
                        zzafn zzafnVarZzf = zzafo.zzf(zzesVar5.zzi(), this.zzb);
                        if (this.zzn == 3) {
                            zzg(zzafnVarZzf);
                        }
                        this.zzm = zzafnVarZzf.zzd;
                        long j2 = zzafnVarZzf.zze;
                        this.zzk = j2 != -9223372036854775807L ? j2 : 0L;
                        zzesVar5.zzh(0);
                        this.zzg.zzc(zzesVar5, this.zzp);
                        this.zzh = 6;
                    }
                }
            } else {
                zzes zzesVar6 = this.zza;
                if (zzf(zzesVar, zzesVar6.zzi(), 7)) {
                    this.zzo = zzafo.zze(zzesVar6.zzi());
                    this.zzh = 3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
    }
}
