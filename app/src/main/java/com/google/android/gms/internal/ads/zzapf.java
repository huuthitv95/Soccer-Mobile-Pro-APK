package com.google.android.gms.internal.ads;

import com.google.common.primitives.SignedBytes;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzapf implements zzapm {
    private final zzer zza;
    private final zzes zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private String zzf;
    private zzahb zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private zzv zzm;
    private int zzn;
    private long zzo;

    public zzapf(String str, int i, String str2) {
        zzer zzerVar = new zzer(new byte[16], 16);
        this.zza = zzerVar;
        this.zzb = new zzes(zzerVar.zza);
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzk = false;
        this.zzo = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzk = false;
        this.zzo = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        this.zzf = zzaraVar.zzc();
        this.zzg = zzafsVar.zzu(zzaraVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        this.zzo = j;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x012c  */
    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzd(zzes zzesVar) {
        boolean z;
        this.zzg.getClass();
        while (zzesVar.zzd() > 0) {
            int i = this.zzh;
            if (i == 0) {
                while (true) {
                    if (zzesVar.zzd() > 0) {
                        if (this.zzj) {
                            int iZzs = zzesVar.zzs();
                            this.zzj = iZzs == 172;
                            byte b = SignedBytes.MAX_POWER_OF_TWO;
                            if (iZzs == 64) {
                                if (iZzs != 65) {
                                    z = false;
                                }
                                this.zzk = z;
                                this.zzh = 1;
                                zzes zzesVar2 = this.zzb;
                                zzesVar2.zzi()[0] = -84;
                                byte[] bArrZzi = zzesVar2.zzi();
                                if (true == this.zzk) {
                                    b = 65;
                                }
                                bArrZzi[1] = b;
                                this.zzi = 2;
                            } else if (iZzs == 65) {
                            }
                            z = true;
                            this.zzk = z;
                            this.zzh = 1;
                            zzes zzesVar3 = this.zzb;
                            zzesVar3.zzi()[0] = -84;
                            byte[] bArrZzi2 = zzesVar3.zzi();
                            if (true == this.zzk) {
                                b = 65;
                            }
                            bArrZzi2[1] = b;
                            this.zzi = 2;
                        } else {
                            this.zzj = zzesVar.zzs() == 172;
                        }
                    }
                }
            } else if (i != 1) {
                int iMin = Math.min(zzesVar.zzd(), this.zzn - this.zzi);
                this.zzg.zzc(zzesVar, iMin);
                int i2 = this.zzi + iMin;
                this.zzi = i2;
                if (i2 == this.zzn) {
                    zzgsw.zzi(this.zzo != -9223372036854775807L);
                    this.zzg.zze(this.zzo, 1, this.zzn, 0, null);
                    this.zzo += this.zzl;
                    this.zzh = 0;
                }
            } else {
                zzes zzesVar4 = this.zzb;
                byte[] bArrZzi3 = zzesVar4.zzi();
                int iMin2 = Math.min(zzesVar.zzd(), 16 - this.zzi);
                zzesVar.zzm(bArrZzi3, this.zzi, iMin2);
                int i3 = this.zzi + iMin2;
                this.zzi = i3;
                if (i3 == 16) {
                    zzer zzerVar = this.zza;
                    zzerVar.zzf(0);
                    zzaes zzaesVarZzb = zzaet.zzb(zzerVar);
                    zzv zzvVar = this.zzm;
                    if (zzvVar == null || zzvVar.zzH != 2 || zzaesVarZzb.zza != zzvVar.zzI || !"audio/ac4".equals(zzvVar.zzp)) {
                        zzt zztVar = new zzt();
                        zztVar.zza(this.zzf);
                        zztVar.zzn(this.zze);
                        zztVar.zzo("audio/ac4");
                        zztVar.zzG(2);
                        zztVar.zzH(zzaesVarZzb.zza);
                        zztVar.zze(this.zzc);
                        zztVar.zzg(this.zzd);
                        zzv zzvVarZzO = zztVar.zzO();
                        this.zzm = zzvVarZzO;
                        this.zzg.zzA(zzvVarZzO);
                    }
                    this.zzn = zzaesVarZzb.zzb;
                    this.zzl = (((long) zzaesVarZzb.zzc) * 1000000) / ((long) this.zzm.zzI);
                    zzesVar4.zzh(0);
                    this.zzg.zzc(zzesVar4, 16);
                    this.zzh = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
    }
}
