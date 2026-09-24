package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzapc implements zzapm {
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
    private long zzk;
    private zzv zzl;
    private int zzm;
    private long zzn;

    public zzapc(String str, int i, String str2) {
        zzer zzerVar = new zzer(new byte[128], 128);
        this.zza = zzerVar;
        this.zzb = new zzes(zzerVar.zza);
        this.zzh = 0;
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        this.zzf = zzaraVar.zzc();
        this.zzg = zzafsVar.zzu(zzaraVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        this.zzn = j;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzd(zzes zzesVar) {
        this.zzg.getClass();
        while (zzesVar.zzd() > 0) {
            int i = this.zzh;
            if (i == 0) {
                while (zzesVar.zzd() > 0) {
                    if (this.zzj) {
                        int iZzs = zzesVar.zzs();
                        if (iZzs == 119) {
                            this.zzj = false;
                            this.zzh = 1;
                            zzes zzesVar2 = this.zzb;
                            zzesVar2.zzi()[0] = Ascii.f22503VT;
                            zzesVar2.zzi()[1] = 119;
                            this.zzi = 2;
                            break;
                        }
                        this.zzj = iZzs == 11;
                    } else {
                        this.zzj = zzesVar.zzs() == 11;
                    }
                }
            } else if (i != 1) {
                int iMin = Math.min(zzesVar.zzd(), this.zzm - this.zzi);
                this.zzg.zzc(zzesVar, iMin);
                int i2 = this.zzi + iMin;
                this.zzi = i2;
                if (i2 == this.zzm) {
                    zzgsw.zzi(this.zzn != -9223372036854775807L);
                    this.zzg.zze(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzk;
                    this.zzh = 0;
                }
            } else {
                zzes zzesVar3 = this.zzb;
                byte[] bArrZzi = zzesVar3.zzi();
                int iMin2 = Math.min(zzesVar.zzd(), 128 - this.zzi);
                zzesVar.zzm(bArrZzi, this.zzi, iMin2);
                int i3 = this.zzi + iMin2;
                this.zzi = i3;
                if (i3 == 128) {
                    zzer zzerVar = this.zza;
                    zzerVar.zzf(0);
                    zzaep zzaepVarZzc = zzaeq.zzc(zzerVar);
                    zzv zzvVar = this.zzl;
                    if (zzvVar == null || zzaepVarZzc.zzc != zzvVar.zzH || zzaepVarZzc.zzb != zzvVar.zzI || !Objects.equals(zzaepVarZzc.zza, zzvVar.zzp)) {
                        zzt zztVar = new zzt();
                        zztVar.zza(this.zzf);
                        zztVar.zzn(this.zze);
                        String str = zzaepVarZzc.zza;
                        zztVar.zzo(str);
                        zztVar.zzG(zzaepVarZzc.zzc);
                        zztVar.zzH(zzaepVarZzc.zzb);
                        zztVar.zze(this.zzc);
                        zztVar.zzg(this.zzd);
                        int i4 = zzaepVarZzc.zzf;
                        zztVar.zzj(i4);
                        if ("audio/ac3".equals(str)) {
                            zztVar.zzi(i4);
                        }
                        zzv zzvVarZzO = zztVar.zzO();
                        this.zzl = zzvVarZzO;
                        this.zzg.zzA(zzvVarZzO);
                    }
                    this.zzm = zzaepVarZzc.zzd;
                    this.zzk = (((long) zzaepVarZzc.zze) * 1000000) / ((long) this.zzl.zzI);
                    zzesVar3.zzh(0);
                    this.zzg.zzc(zzesVar3, 128);
                    this.zzh = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
    }
}
